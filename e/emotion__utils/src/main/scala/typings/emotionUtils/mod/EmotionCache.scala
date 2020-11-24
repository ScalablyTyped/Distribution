package typings.emotionUtils.mod

import org.scalablytyped.runtime.StringDictionary
import typings.emotionUtils.emotionUtilsBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmotionCache extends js.Object {
  
  var compat: js.UndefOr[`true`] = js.native
  
  var inserted: StringDictionary[String | `true`] = js.native
  
  var key: String = js.native
  
  var nonce: js.UndefOr[String] = js.native
  
  var registered: RegisteredCache = js.native
  
  var sheet: StyleSheet = js.native
  
  def stylis(key: String, value: String): js.Array[String] = js.native
}
object EmotionCache {
  
  @scala.inline
  def apply(
    inserted: StringDictionary[String | `true`],
    key: String,
    registered: RegisteredCache,
    sheet: StyleSheet,
    stylis: (String, String) => js.Array[String]
  ): EmotionCache = {
    val __obj = js.Dynamic.literal(inserted = inserted.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], registered = registered.asInstanceOf[js.Any], sheet = sheet.asInstanceOf[js.Any], stylis = js.Any.fromFunction2(stylis))
    __obj.asInstanceOf[EmotionCache]
  }
  
  @scala.inline
  implicit class EmotionCacheOps[Self <: EmotionCache] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInserted(value: StringDictionary[String | `true`]): Self = this.set("inserted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistered(value: RegisteredCache): Self = this.set("registered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSheet(value: StyleSheet): Self = this.set("sheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylis(value: (String, String) => js.Array[String]): Self = this.set("stylis", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCompat(value: `true`): Self = this.set("compat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompat: Self = this.set("compat", js.undefined)
    
    @scala.inline
    def setNonce(value: String): Self = this.set("nonce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNonce: Self = this.set("nonce", js.undefined)
  }
}

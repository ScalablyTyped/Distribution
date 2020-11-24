package typings.evernote.anon

import typings.std.Map
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FullMap extends js.Object {
  
  var fullMap: js.UndefOr[Map[String, String]] = js.native
  
  var keysOnly: js.UndefOr[Set[String]] = js.native
}
object FullMap {
  
  @scala.inline
  def apply(): FullMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FullMap]
  }
  
  @scala.inline
  implicit class FullMapOps[Self <: FullMap] (val x: Self) extends AnyVal {
    
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
    def setFullMap(value: Map[String, String]): Self = this.set("fullMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullMap: Self = this.set("fullMap", js.undefined)
    
    @scala.inline
    def setKeysOnly(value: Set[String]): Self = this.set("keysOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeysOnly: Self = this.set("keysOnly", js.undefined)
  }
}

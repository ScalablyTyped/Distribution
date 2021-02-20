package typings.firebase.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Contenttype
  extends /* key */ StringDictionary[js.Any] {
  
  var content_id: js.UndefOr[String] = js.native
  
  var content_type: js.UndefOr[String] = js.native
  
  var method: js.UndefOr[String] = js.native
}
object Contenttype {
  
  @scala.inline
  def apply(): Contenttype = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Contenttype]
  }
  
  @scala.inline
  implicit class ContenttypeMutableBuilder[Self <: Contenttype] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent_id(value: String): Self = StObject.set(x, "content_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent_idUndefined: Self = StObject.set(x, "content_id", js.undefined)
    
    @scala.inline
    def setContent_type(value: String): Self = StObject.set(x, "content_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent_typeUndefined: Self = StObject.set(x, "content_type", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
  }
}

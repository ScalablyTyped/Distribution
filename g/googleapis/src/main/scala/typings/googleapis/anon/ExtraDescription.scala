package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtraDescription extends StObject {
  
  var description: js.UndefOr[String] = js.native
  
  var extraDescription: js.UndefOr[String] = js.native
  
  var url: js.UndefOr[String] = js.native
}
object ExtraDescription {
  
  @scala.inline
  def apply(): ExtraDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtraDescription]
  }
  
  @scala.inline
  implicit class ExtraDescriptionMutableBuilder[Self <: ExtraDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setExtraDescription(value: String): Self = StObject.set(x, "extraDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraDescriptionUndefined: Self = StObject.set(x, "extraDescription", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}

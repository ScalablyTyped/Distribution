package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsDefault extends StObject {
  
  var isDefault: js.UndefOr[Boolean] = js.native
  
  var url: js.UndefOr[String] = js.native
}
object IsDefault {
  
  @scala.inline
  def apply(): IsDefault = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsDefault]
  }
  
  @scala.inline
  implicit class IsDefaultMutableBuilder[Self <: IsDefault] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsDefault(value: Boolean): Self = StObject.set(x, "isDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDefaultUndefined: Self = StObject.set(x, "isDefault", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}

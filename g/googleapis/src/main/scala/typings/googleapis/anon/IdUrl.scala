package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdUrl extends StObject {
  
  var id: js.UndefOr[String] = js.native
  
  var url: js.UndefOr[String] = js.native
}
object IdUrl {
  
  @scala.inline
  def apply(): IdUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdUrl]
  }
  
  @scala.inline
  implicit class IdUrlMutableBuilder[Self <: IdUrl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}

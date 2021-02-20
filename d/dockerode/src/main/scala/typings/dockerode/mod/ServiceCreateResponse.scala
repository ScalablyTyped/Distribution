package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceCreateResponse extends StObject {
  
  var ID: String = js.native
  
  var Warnings: js.UndefOr[js.Array[String]] = js.native
}
object ServiceCreateResponse {
  
  @scala.inline
  def apply(ID: String): ServiceCreateResponse = {
    val __obj = js.Dynamic.literal(ID = ID.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceCreateResponse]
  }
  
  @scala.inline
  implicit class ServiceCreateResponseMutableBuilder[Self <: ServiceCreateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setID(value: String): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarnings(value: js.Array[String]): Self = StObject.set(x, "Warnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningsUndefined: Self = StObject.set(x, "Warnings", js.undefined)
    
    @scala.inline
    def setWarningsVarargs(value: String*): Self = StObject.set(x, "Warnings", js.Array(value :_*))
  }
}

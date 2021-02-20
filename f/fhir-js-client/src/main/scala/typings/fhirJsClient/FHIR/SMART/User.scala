package typings.fhirJsClient.FHIR.SMART

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * User in context
  */
@js.native
trait User extends StObject {
  
  /**
    * Fetch the current user information from server. The library expects the userId to be of the format "ResourceType/Id"
    */
  def read(): js.Promise[Response] = js.native
}
object User {
  
  @scala.inline
  def apply(read: () => js.Promise[Response]): User = {
    val __obj = js.Dynamic.literal(read = js.Any.fromFunction0(read))
    __obj.asInstanceOf[User]
  }
  
  @scala.inline
  implicit class UserMutableBuilder[Self <: User] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRead(value: () => js.Promise[Response]): Self = StObject.set(x, "read", js.Any.fromFunction0(value))
  }
}

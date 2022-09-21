package typings.firebaseAuth.anon

import typings.firebaseAuth.firebaseAuthStrings.link
import typings.firebaseAuth.firebaseAuthStrings.reauthenticate
import typings.firebaseAuth.firebaseAuthStrings.signIn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OperationType extends StObject {
  
  /**
    * The type of operation (sign-in, linking, or re-authentication) that raised the error.
    */
  val operationType: link | reauthenticate | signIn
}
object OperationType {
  
  inline def apply(operationType: link | reauthenticate | signIn): OperationType = {
    val __obj = js.Dynamic.literal(operationType = operationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationType]
  }
  
  extension [Self <: OperationType](x: Self) {
    
    inline def setOperationType(value: link | reauthenticate | signIn): Self = StObject.set(x, "operationType", value.asInstanceOf[js.Any])
  }
}

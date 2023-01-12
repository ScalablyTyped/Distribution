package typings.firebaseAuth.distEsm2017SrcModelPublicTypesMod

import typings.firebaseAuth.firebaseAuthStrings.phone
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiFactorAssertion extends StObject {
  
  /** The identifier of the second factor. */
  val factorId: phone
}
object MultiFactorAssertion {
  
  inline def apply(): MultiFactorAssertion = {
    val __obj = js.Dynamic.literal(factorId = "phone")
    __obj.asInstanceOf[MultiFactorAssertion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MultiFactorAssertion] (val x: Self) extends AnyVal {
    
    inline def setFactorId(value: phone): Self = StObject.set(x, "factorId", value.asInstanceOf[js.Any])
  }
}

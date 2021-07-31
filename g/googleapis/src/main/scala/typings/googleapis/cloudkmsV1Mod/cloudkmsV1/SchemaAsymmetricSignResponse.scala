package typings.googleapis.cloudkmsV1Mod.cloudkmsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for KeyManagementService.AsymmetricSign.
  */
trait SchemaAsymmetricSignResponse extends StObject {
  
  /**
    * The created signature.
    */
  var signature: js.UndefOr[String] = js.undefined
}
object SchemaAsymmetricSignResponse {
  
  @scala.inline
  def apply(): SchemaAsymmetricSignResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAsymmetricSignResponse]
  }
  
  @scala.inline
  implicit class SchemaAsymmetricSignResponseMutableBuilder[Self <: SchemaAsymmetricSignResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
  }
}

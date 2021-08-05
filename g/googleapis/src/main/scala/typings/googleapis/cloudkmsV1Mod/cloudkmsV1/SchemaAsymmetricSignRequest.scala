package typings.googleapis.cloudkmsV1Mod.cloudkmsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request message for KeyManagementService.AsymmetricSign.
  */
trait SchemaAsymmetricSignRequest extends StObject {
  
  /**
    * Required. The digest of the data to sign. The digest must be produced
    * with the same digest algorithm as specified by the key version&#39;s
    * algorithm.
    */
  var digest: js.UndefOr[SchemaDigest] = js.undefined
}
object SchemaAsymmetricSignRequest {
  
  inline def apply(): SchemaAsymmetricSignRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAsymmetricSignRequest]
  }
  
  extension [Self <: SchemaAsymmetricSignRequest](x: Self) {
    
    inline def setDigest(value: SchemaDigest): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
    
    inline def setDigestUndefined: Self = StObject.set(x, "digest", js.undefined)
  }
}

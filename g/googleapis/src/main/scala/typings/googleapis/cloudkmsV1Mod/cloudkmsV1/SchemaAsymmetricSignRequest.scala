package typings.googleapis.cloudkmsV1Mod.cloudkmsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request message for KeyManagementService.AsymmetricSign.
  */
@js.native
trait SchemaAsymmetricSignRequest extends StObject {
  
  /**
    * Required. The digest of the data to sign. The digest must be produced
    * with the same digest algorithm as specified by the key version&#39;s
    * algorithm.
    */
  var digest: js.UndefOr[SchemaDigest] = js.native
}
object SchemaAsymmetricSignRequest {
  
  @scala.inline
  def apply(): SchemaAsymmetricSignRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAsymmetricSignRequest]
  }
  
  @scala.inline
  implicit class SchemaAsymmetricSignRequestMutableBuilder[Self <: SchemaAsymmetricSignRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDigest(value: SchemaDigest): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDigestUndefined: Self = StObject.set(x, "digest", js.undefined)
  }
}

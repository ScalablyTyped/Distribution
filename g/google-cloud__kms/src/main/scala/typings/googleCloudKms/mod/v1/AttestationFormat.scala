package typings.googleCloudKms.mod.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AttestationFormat extends StObject
@JSImport("@google-cloud/kms", "v1.AttestationFormat")
@js.native
object AttestationFormat extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AttestationFormat with Double] = js.native
  
  @js.native
  sealed trait ATTESTATION_FORMAT_UNSPECIFIED extends AttestationFormat
  /* 0 */ val ATTESTATION_FORMAT_UNSPECIFIED: typings.googleCloudKms.mod.v1.AttestationFormat.ATTESTATION_FORMAT_UNSPECIFIED with Double = js.native
  
  // Cavium HSM attestation compressed with gzip. Note that this format is
  // defined by Cavium and subject to change at any time.
  @js.native
  sealed trait CAVIUM_V1_COMPRESSED extends AttestationFormat
  /* 3 */ val CAVIUM_V1_COMPRESSED: typings.googleCloudKms.mod.v1.AttestationFormat.CAVIUM_V1_COMPRESSED with Double = js.native
}

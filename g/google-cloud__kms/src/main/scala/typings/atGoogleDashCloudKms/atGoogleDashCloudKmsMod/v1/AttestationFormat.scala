package typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AttestationFormat extends js.Object

@JSImport("@google-cloud/kms", "v1.AttestationFormat")
@js.native
object AttestationFormat extends js.Object {
  @js.native
  sealed trait ATTESTATION_FORMAT_UNSPECIFIED extends AttestationFormat
  
  // Cavium HSM attestation compressed with gzip. Note that this format is
  // defined by Cavium and subject to change at any time.
  @js.native
  sealed trait CAVIUM_V1_COMPRESSED extends AttestationFormat
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AttestationFormat with Double] = js.native
  /* 0 */ @js.native
  object ATTESTATION_FORMAT_UNSPECIFIED extends TopLevel[ATTESTATION_FORMAT_UNSPECIFIED with Double]
  
  /* 3 */ @js.native
  object CAVIUM_V1_COMPRESSED extends TopLevel[CAVIUM_V1_COMPRESSED with Double]
  
}


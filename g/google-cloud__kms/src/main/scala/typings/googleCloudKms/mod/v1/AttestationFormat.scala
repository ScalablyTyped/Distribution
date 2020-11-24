package typings.googleCloudKms.mod.v1

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AttestationFormat extends js.Object
@JSImport("@google-cloud/kms", "v1.AttestationFormat")
@js.native
object AttestationFormat extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AttestationFormat with Double] = js.native
  
  @js.native
  sealed trait ATTESTATION_FORMAT_UNSPECIFIED extends AttestationFormat
  /* 0 */ @js.native
  object ATTESTATION_FORMAT_UNSPECIFIED extends TopLevel[ATTESTATION_FORMAT_UNSPECIFIED with Double]
  
  // Cavium HSM attestation compressed with gzip. Note that this format is
  // defined by Cavium and subject to change at any time.
  @js.native
  sealed trait CAVIUM_V1_COMPRESSED extends AttestationFormat
  /* 3 */ @js.native
  object CAVIUM_V1_COMPRESSED extends TopLevel[CAVIUM_V1_COMPRESSED with Double]
}

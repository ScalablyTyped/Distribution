package typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ProtectionLevel extends js.Object

@JSImport("@google-cloud/kms", "v1.ProtectionLevel")
@js.native
object ProtectionLevel extends js.Object {
  // Crypto operations are performed in a Hardware Security Module.
  @js.native
  sealed trait HSM extends ProtectionLevel
  
  // Not specified.
  @js.native
  sealed trait PROTECTION_LEVEL_UNSPECIFIED extends ProtectionLevel
  
  // Crypto operations are performed in software.
  @js.native
  sealed trait SOFTWARE extends ProtectionLevel
  
  /* 2 */ val HSM: typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1.ProtectionLevel.HSM with Double = js.native
  /* 0 */ val PROTECTION_LEVEL_UNSPECIFIED: typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1.ProtectionLevel.PROTECTION_LEVEL_UNSPECIFIED with Double = js.native
  /* 1 */ val SOFTWARE: typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1.ProtectionLevel.SOFTWARE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ProtectionLevel with Double] = js.native
}


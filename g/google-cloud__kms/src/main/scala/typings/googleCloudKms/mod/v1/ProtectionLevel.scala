package typings.googleCloudKms.mod.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ProtectionLevel extends StObject
@JSImport("@google-cloud/kms", "v1.ProtectionLevel")
@js.native
object ProtectionLevel extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ProtectionLevel with Double] = js.native
  
  // Crypto operations are performed in a Hardware Security Module.
  @js.native
  sealed trait HSM extends ProtectionLevel
  /* 2 */ val HSM: typings.googleCloudKms.mod.v1.ProtectionLevel.HSM with Double = js.native
  
  // Not specified.
  @js.native
  sealed trait PROTECTION_LEVEL_UNSPECIFIED extends ProtectionLevel
  /* 0 */ val PROTECTION_LEVEL_UNSPECIFIED: typings.googleCloudKms.mod.v1.ProtectionLevel.PROTECTION_LEVEL_UNSPECIFIED with Double = js.native
  
  // Crypto operations are performed in software.
  @js.native
  sealed trait SOFTWARE extends ProtectionLevel
  /* 1 */ val SOFTWARE: typings.googleCloudKms.mod.v1.ProtectionLevel.SOFTWARE with Double = js.native
}

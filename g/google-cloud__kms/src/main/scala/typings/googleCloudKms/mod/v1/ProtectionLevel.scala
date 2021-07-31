package typings.googleCloudKms.mod.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ProtectionLevel extends StObject
@JSImport("@google-cloud/kms", "v1.ProtectionLevel")
@js.native
object ProtectionLevel extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ProtectionLevel & Double] = js.native
  
  // Crypto operations are performed in a Hardware Security Module.
  @js.native
  sealed trait HSM
    extends StObject
       with ProtectionLevel
  /* 2 */ val HSM: typings.googleCloudKms.mod.v1.ProtectionLevel.HSM & Double = js.native
  
  // Not specified.
  @js.native
  sealed trait PROTECTION_LEVEL_UNSPECIFIED
    extends StObject
       with ProtectionLevel
  /* 0 */ val PROTECTION_LEVEL_UNSPECIFIED: typings.googleCloudKms.mod.v1.ProtectionLevel.PROTECTION_LEVEL_UNSPECIFIED & Double = js.native
  
  // Crypto operations are performed in software.
  @js.native
  sealed trait SOFTWARE
    extends StObject
       with ProtectionLevel
  /* 1 */ val SOFTWARE: typings.googleCloudKms.mod.v1.ProtectionLevel.SOFTWARE & Double = js.native
}

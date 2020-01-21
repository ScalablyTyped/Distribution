package typings.googleCloudKms.mod.v1

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ProtectionLevel with Double] = js.native
  /* 2 */ @js.native
  object HSM extends TopLevel[HSM with Double]
  
  /* 0 */ @js.native
  object PROTECTION_LEVEL_UNSPECIFIED extends TopLevel[PROTECTION_LEVEL_UNSPECIFIED with Double]
  
  /* 1 */ @js.native
  object SOFTWARE extends TopLevel[SOFTWARE with Double]
  
}


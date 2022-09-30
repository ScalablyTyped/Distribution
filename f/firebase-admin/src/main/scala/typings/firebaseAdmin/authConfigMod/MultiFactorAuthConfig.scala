package typings.firebaseAdmin.authConfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("firebase-admin/lib/auth/auth-config", "MultiFactorAuthConfig")
@js.native
open class MultiFactorAuthConfig ()
  extends StObject
     with MultiFactorConfig {
  
  @JSName("factorIds")
  val factorIds_MultiFactorAuthConfig: js.Array[AuthFactorType] = js.native
  
  /**
    * The multi-factor config state.
    */
  /* CompleteClass */
  var state: MultiFactorConfigState = js.native
  
  /** @returns The plain object representation of the multi-factor config instance. */
  def toJSON(): js.Object = js.native
}
/* static members */
object MultiFactorAuthConfig {
  
  @JSImport("firebase-admin/lib/auth/auth-config", "MultiFactorAuthConfig")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Validates the MultiFactorConfig options object. Throws an error on failure.
    *
    * @param options - The options object to validate.
    */
  @JSImport("firebase-admin/lib/auth/auth-config", "MultiFactorAuthConfig.validate")
  @js.native
  def validate: Any = js.native
  inline def validate_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validate")(x.asInstanceOf[js.Any])
}

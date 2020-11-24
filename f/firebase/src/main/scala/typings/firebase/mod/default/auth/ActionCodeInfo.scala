package typings.firebase.mod.default.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("firebase", "auth.ActionCodeInfo")
@js.native
object ActionCodeInfo extends js.Object {
  
  /**
    * An enumeration of the possible email action types.
    */
  @js.native
  object Operation extends js.Object {
    
    /**
      * The email link sign-in action.
      */
    var EMAIL_SIGNIN: typings.firebase.mod.firebase.auth.ActionCodeInfo.Operation = js.native
    
    /**
      * The password reset action.
      */
    var PASSWORD_RESET: typings.firebase.mod.firebase.auth.ActionCodeInfo.Operation = js.native
    
    /**
      * The email revocation action.
      */
    var RECOVER_EMAIL: typings.firebase.mod.firebase.auth.ActionCodeInfo.Operation = js.native
    
    /**
      * The revert second factor addition email action.
      */
    var REVERT_SECOND_FACTOR_ADDITION: typings.firebase.mod.firebase.auth.ActionCodeInfo.Operation = js.native
    
    /**
      * The verify and update email action.
      */
    var VERIFY_AND_CHANGE_EMAIL: typings.firebase.mod.firebase.auth.ActionCodeInfo.Operation = js.native
    
    /**
      * The email verification action.
      */
    var VERIFY_EMAIL: typings.firebase.mod.firebase.auth.ActionCodeInfo.Operation = js.native
  }
}

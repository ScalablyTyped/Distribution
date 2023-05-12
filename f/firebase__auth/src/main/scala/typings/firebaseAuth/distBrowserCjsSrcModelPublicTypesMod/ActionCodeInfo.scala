package typings.firebaseAuth.distBrowserCjsSrcModelPublicTypesMod

import typings.firebaseAuth.anon.PreviousEmail
import typings.firebaseAuth.firebaseAuthStrings.EMAIL_SIGNIN
import typings.firebaseAuth.firebaseAuthStrings.PASSWORD_RESET
import typings.firebaseAuth.firebaseAuthStrings.RECOVER_EMAIL
import typings.firebaseAuth.firebaseAuthStrings.REVERT_SECOND_FACTOR_ADDITION
import typings.firebaseAuth.firebaseAuthStrings.VERIFY_AND_CHANGE_EMAIL
import typings.firebaseAuth.firebaseAuthStrings.VERIFY_EMAIL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionCodeInfo extends StObject {
  
  /**
    * The data associated with the action code.
    *
    * @remarks
    * For the {@link ActionCodeOperation}.PASSWORD_RESET, {@link ActionCodeOperation}.VERIFY_EMAIL, and
    * {@link ActionCodeOperation}.RECOVER_EMAIL actions, this object contains an email field with the address
    * the email was sent to.
    *
    * For the {@link ActionCodeOperation}.RECOVER_EMAIL action, which allows a user to undo an email address
    * change, this object also contains a `previousEmail` field with the user account's current
    * email address. After the action completes, the user's email address will revert to the value
    * in the `email` field from the value in `previousEmail` field.
    *
    * For the {@link ActionCodeOperation}.VERIFY_AND_CHANGE_EMAIL action, which allows a user to verify the
    * email before updating it, this object contains a `previousEmail` field with the user account's
    * email address before updating. After the action completes, the user's email address will be
    * updated to the value in the `email` field from the value in `previousEmail` field.
    *
    * For the {@link ActionCodeOperation}.REVERT_SECOND_FACTOR_ADDITION action, which allows a user to
    * unenroll a newly added second factor, this object contains a `multiFactorInfo` field with
    * the information about the second factor. For phone second factor, the `multiFactorInfo`
    * is a {@link MultiFactorInfo} object, which contains the phone number.
    */
  var data: PreviousEmail
  
  /**
    * The type of operation that generated the action code.
    */
  var operation: RECOVER_EMAIL | VERIFY_EMAIL | REVERT_SECOND_FACTOR_ADDITION | EMAIL_SIGNIN | VERIFY_AND_CHANGE_EMAIL | PASSWORD_RESET
}
object ActionCodeInfo {
  
  inline def apply(
    data: PreviousEmail,
    operation: RECOVER_EMAIL | VERIFY_EMAIL | REVERT_SECOND_FACTOR_ADDITION | EMAIL_SIGNIN | VERIFY_AND_CHANGE_EMAIL | PASSWORD_RESET
  ): ActionCodeInfo = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionCodeInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActionCodeInfo] (val x: Self) extends AnyVal {
    
    inline def setData(value: PreviousEmail): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setOperation(
      value: RECOVER_EMAIL | VERIFY_EMAIL | REVERT_SECOND_FACTOR_ADDITION | EMAIL_SIGNIN | VERIFY_AND_CHANGE_EMAIL | PASSWORD_RESET
    ): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
  }
}

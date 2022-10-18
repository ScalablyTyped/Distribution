package typings.firebaseAuth

import typings.firebaseAuth.firebaseAuthStrings.emailLink
import typings.firebaseAuth.firebaseAuthStrings.facebookDotcom
import typings.firebaseAuth.firebaseAuthStrings.githubDotcom
import typings.firebaseAuth.firebaseAuthStrings.googleDotcom
import typings.firebaseAuth.firebaseAuthStrings.link
import typings.firebaseAuth.firebaseAuthStrings.password
import typings.firebaseAuth.firebaseAuthStrings.phone
import typings.firebaseAuth.firebaseAuthStrings.reauthenticate
import typings.firebaseAuth.firebaseAuthStrings.signIn
import typings.firebaseAuth.firebaseAuthStrings.twitterDotcom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCordovaSrcModelEnumMapsMod {
  
  object ActionCodeOperation {
    
    /** The email link sign-in action. */
    @JSImport("@firebase/auth/dist/cordova/src/model/enum_maps", "ActionCodeOperation.EMAIL_SIGNIN")
    @js.native
    val EMAIL_SIGNIN: typings.firebaseAuth.firebaseAuthStrings.EMAIL_SIGNIN = js.native
    
    /** The password reset action. */
    @JSImport("@firebase/auth/dist/cordova/src/model/enum_maps", "ActionCodeOperation.PASSWORD_RESET")
    @js.native
    val PASSWORD_RESET: typings.firebaseAuth.firebaseAuthStrings.PASSWORD_RESET = js.native
    
    /** The email revocation action. */
    @JSImport("@firebase/auth/dist/cordova/src/model/enum_maps", "ActionCodeOperation.RECOVER_EMAIL")
    @js.native
    val RECOVER_EMAIL: typings.firebaseAuth.firebaseAuthStrings.RECOVER_EMAIL = js.native
    
    /** The revert second factor addition email action. */
    @JSImport("@firebase/auth/dist/cordova/src/model/enum_maps", "ActionCodeOperation.REVERT_SECOND_FACTOR_ADDITION")
    @js.native
    val REVERT_SECOND_FACTOR_ADDITION: typings.firebaseAuth.firebaseAuthStrings.REVERT_SECOND_FACTOR_ADDITION = js.native
    
    /** The revert second factor addition email action. */
    @JSImport("@firebase/auth/dist/cordova/src/model/enum_maps", "ActionCodeOperation.VERIFY_AND_CHANGE_EMAIL")
    @js.native
    val VERIFY_AND_CHANGE_EMAIL: typings.firebaseAuth.firebaseAuthStrings.VERIFY_AND_CHANGE_EMAIL = js.native
    
    /** The email verification action. */
    @JSImport("@firebase/auth/dist/cordova/src/model/enum_maps", "ActionCodeOperation.VERIFY_EMAIL")
    @js.native
    val VERIFY_EMAIL: typings.firebaseAuth.firebaseAuthStrings.VERIFY_EMAIL = js.native
  }
  
  object FactorId {
    
    /** Phone as second factor */
    @JSImport("@firebase/auth/dist/cordova/src/model/enum_maps", "FactorId.PHONE")
    @js.native
    val PHONE: phone = js.native
  }
  
  object OperationType {
    
    /** Operation involving linking an additional provider to an already signed-in user. */
    @JSImport("@firebase/auth/dist/cordova/src/model/enum_maps", "OperationType.LINK")
    @js.native
    val LINK: link = js.native
    
    /** Operation involving using a provider to reauthenticate an already signed-in user. */
    @JSImport("@firebase/auth/dist/cordova/src/model/enum_maps", "OperationType.REAUTHENTICATE")
    @js.native
    val REAUTHENTICATE: reauthenticate = js.native
    
    /** Operation involving signing in a user. */
    @JSImport("@firebase/auth/dist/cordova/src/model/enum_maps", "OperationType.SIGN_IN")
    @js.native
    val SIGN_IN: signIn = js.native
  }
  
  object ProviderId {
    
    /** Facebook provider ID */
    @JSImport("@firebase/auth/dist/cordova/src/model/enum_maps", "ProviderId.FACEBOOK")
    @js.native
    val FACEBOOK: facebookDotcom = js.native
    
    /** GitHub provider ID */
    @JSImport("@firebase/auth/dist/cordova/src/model/enum_maps", "ProviderId.GITHUB")
    @js.native
    val GITHUB: githubDotcom = js.native
    
    /** Google provider ID */
    @JSImport("@firebase/auth/dist/cordova/src/model/enum_maps", "ProviderId.GOOGLE")
    @js.native
    val GOOGLE: googleDotcom = js.native
    
    /** Password provider */
    @JSImport("@firebase/auth/dist/cordova/src/model/enum_maps", "ProviderId.PASSWORD")
    @js.native
    val PASSWORD: password = js.native
    
    /** Phone provider */
    @JSImport("@firebase/auth/dist/cordova/src/model/enum_maps", "ProviderId.PHONE")
    @js.native
    val PHONE: phone = js.native
    
    /** Twitter provider ID */
    @JSImport("@firebase/auth/dist/cordova/src/model/enum_maps", "ProviderId.TWITTER")
    @js.native
    val TWITTER: twitterDotcom = js.native
  }
  
  object SignInMethod {
    
    /** Email link sign in method */
    @JSImport("@firebase/auth/dist/cordova/src/model/enum_maps", "SignInMethod.EMAIL_LINK")
    @js.native
    val EMAIL_LINK: emailLink = js.native
    
    /** Email/password sign in method */
    @JSImport("@firebase/auth/dist/cordova/src/model/enum_maps", "SignInMethod.EMAIL_PASSWORD")
    @js.native
    val EMAIL_PASSWORD: password = js.native
    
    /** Facebook sign in method */
    @JSImport("@firebase/auth/dist/cordova/src/model/enum_maps", "SignInMethod.FACEBOOK")
    @js.native
    val FACEBOOK: facebookDotcom = js.native
    
    /** GitHub sign in method */
    @JSImport("@firebase/auth/dist/cordova/src/model/enum_maps", "SignInMethod.GITHUB")
    @js.native
    val GITHUB: githubDotcom = js.native
    
    /** Google sign in method */
    @JSImport("@firebase/auth/dist/cordova/src/model/enum_maps", "SignInMethod.GOOGLE")
    @js.native
    val GOOGLE: googleDotcom = js.native
    
    /** Phone sign in method */
    @JSImport("@firebase/auth/dist/cordova/src/model/enum_maps", "SignInMethod.PHONE")
    @js.native
    val PHONE: phone = js.native
    
    /** Twitter sign in method */
    @JSImport("@firebase/auth/dist/cordova/src/model/enum_maps", "SignInMethod.TWITTER")
    @js.native
    val TWITTER: twitterDotcom = js.native
  }
}

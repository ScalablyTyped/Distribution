package typings.firebaseAuth

import typings.firebaseAuth.firebaseAuthStrings.anonymous
import typings.firebaseAuth.firebaseAuthStrings.custom
import typings.firebaseAuth.firebaseAuthStrings.emailLink
import typings.firebaseAuth.firebaseAuthStrings.facebookDotcom
import typings.firebaseAuth.firebaseAuthStrings.firebase
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

object distCordovaSrcModelEnumsMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseAuth.firebaseAuthStrings.link
    - typings.firebaseAuth.firebaseAuthStrings.reauthenticate
    - typings.firebaseAuth.firebaseAuthStrings.signIn
  */
  trait OperationType extends StObject
  object OperationType {
    
    /** Operation involving linking an additional provider to an already signed-in user. */
    inline def LINK: link = "link".asInstanceOf[link]
    
    /** Operation involving using a provider to reauthenticate an already signed-in user. */
    inline def REAUTHENTICATE: reauthenticate = "reauthenticate".asInstanceOf[reauthenticate]
    
    /** Operation involving signing in a user. */
    inline def SIGN_IN: signIn = "signIn".asInstanceOf[signIn]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseAuth.firebaseAuthStrings.anonymous
    - typings.firebaseAuth.firebaseAuthStrings.custom
    - typings.firebaseAuth.firebaseAuthStrings.facebookDotcom
    - typings.firebaseAuth.firebaseAuthStrings.firebase
    - typings.firebaseAuth.firebaseAuthStrings.githubDotcom
    - typings.firebaseAuth.firebaseAuthStrings.googleDotcom
    - typings.firebaseAuth.firebaseAuthStrings.password
    - typings.firebaseAuth.firebaseAuthStrings.phone
    - typings.firebaseAuth.firebaseAuthStrings.twitterDotcom
  */
  trait ProviderId extends StObject
  object ProviderId {
    
    /** @internal */
    inline def ANONYMOUS: anonymous = "anonymous".asInstanceOf[anonymous]
    
    /** @internal */
    inline def CUSTOM: custom = "custom".asInstanceOf[custom]
    
    /** Facebook provider ID */
    inline def FACEBOOK: facebookDotcom = "facebook.com".asInstanceOf[facebookDotcom]
    
    /** @internal */
    inline def FIREBASE: firebase = "firebase".asInstanceOf[firebase]
    
    /** GitHub provider ID */
    inline def GITHUB: githubDotcom = "github.com".asInstanceOf[githubDotcom]
    
    /** Google provider ID */
    inline def GOOGLE: googleDotcom = "google.com".asInstanceOf[googleDotcom]
    
    /** Password provider */
    inline def PASSWORD: password = "password".asInstanceOf[password]
    
    /** Phone provider */
    inline def PHONE: phone = "phone".asInstanceOf[phone]
    
    /** Twitter provider ID */
    inline def TWITTER: twitterDotcom = "twitter.com".asInstanceOf[twitterDotcom]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseAuth.firebaseAuthStrings.anonymous
    - typings.firebaseAuth.firebaseAuthStrings.emailLink
    - typings.firebaseAuth.firebaseAuthStrings.password
    - typings.firebaseAuth.firebaseAuthStrings.facebookDotcom
    - typings.firebaseAuth.firebaseAuthStrings.githubDotcom
    - typings.firebaseAuth.firebaseAuthStrings.googleDotcom
    - typings.firebaseAuth.firebaseAuthStrings.phone
    - typings.firebaseAuth.firebaseAuthStrings.twitterDotcom
  */
  trait SignInMethod extends StObject
  object SignInMethod {
    
    /** @internal */
    inline def ANONYMOUS: anonymous = "anonymous".asInstanceOf[anonymous]
    
    /** Email link sign in method */
    inline def EMAIL_LINK: emailLink = "emailLink".asInstanceOf[emailLink]
    
    /** Email/password sign in method */
    inline def EMAIL_PASSWORD: password = "password".asInstanceOf[password]
    
    /** Facebook sign in method */
    inline def FACEBOOK: facebookDotcom = "facebook.com".asInstanceOf[facebookDotcom]
    
    /** GitHub sign in method */
    inline def GITHUB: githubDotcom = "github.com".asInstanceOf[githubDotcom]
    
    /** Google sign in method */
    inline def GOOGLE: googleDotcom = "google.com".asInstanceOf[googleDotcom]
    
    /** Phone sign in method */
    inline def PHONE: phone = "phone".asInstanceOf[phone]
    
    /** Twitter sign in method */
    inline def TWITTER: twitterDotcom = "twitter.com".asInstanceOf[twitterDotcom]
  }
}

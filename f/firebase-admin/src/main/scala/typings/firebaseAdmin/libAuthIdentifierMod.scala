package typings.firebaseAdmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAuthIdentifierMod {
  
  @JSImport("firebase-admin/lib/auth/identifier", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isEmailIdentifier(id: UserIdentifier): /* is firebase-admin.firebase-admin/lib/auth/identifier.EmailIdentifier */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmailIdentifier")(id.asInstanceOf[js.Any]).asInstanceOf[/* is firebase-admin.firebase-admin/lib/auth/identifier.EmailIdentifier */ Boolean]
  
  inline def isPhoneIdentifier(id: UserIdentifier): /* is firebase-admin.firebase-admin/lib/auth/identifier.PhoneIdentifier */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPhoneIdentifier")(id.asInstanceOf[js.Any]).asInstanceOf[/* is firebase-admin.firebase-admin/lib/auth/identifier.PhoneIdentifier */ Boolean]
  
  inline def isProviderIdentifier(id: ProviderIdentifier): /* is firebase-admin.firebase-admin/lib/auth/identifier.ProviderIdentifier */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isProviderIdentifier")(id.asInstanceOf[js.Any]).asInstanceOf[/* is firebase-admin.firebase-admin/lib/auth/identifier.ProviderIdentifier */ Boolean]
  
  inline def isUidIdentifier(id: UserIdentifier): /* is firebase-admin.firebase-admin/lib/auth/identifier.UidIdentifier */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUidIdentifier")(id.asInstanceOf[js.Any]).asInstanceOf[/* is firebase-admin.firebase-admin/lib/auth/identifier.UidIdentifier */ Boolean]
  
  trait EmailIdentifier
    extends StObject
       with UserIdentifier {
    
    var email: String
  }
  object EmailIdentifier {
    
    inline def apply(email: String): EmailIdentifier = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
      __obj.asInstanceOf[EmailIdentifier]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EmailIdentifier] (val x: Self) extends AnyVal {
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    }
  }
  
  trait PhoneIdentifier
    extends StObject
       with UserIdentifier {
    
    var phoneNumber: String
  }
  object PhoneIdentifier {
    
    inline def apply(phoneNumber: String): PhoneIdentifier = {
      val __obj = js.Dynamic.literal(phoneNumber = phoneNumber.asInstanceOf[js.Any])
      __obj.asInstanceOf[PhoneIdentifier]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PhoneIdentifier] (val x: Self) extends AnyVal {
      
      inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    }
  }
  
  trait ProviderIdentifier
    extends StObject
       with UserIdentifier {
    
    var providerId: String
    
    var providerUid: String
  }
  object ProviderIdentifier {
    
    inline def apply(providerId: String, providerUid: String): ProviderIdentifier = {
      val __obj = js.Dynamic.literal(providerId = providerId.asInstanceOf[js.Any], providerUid = providerUid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProviderIdentifier]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ProviderIdentifier] (val x: Self) extends AnyVal {
      
      inline def setProviderId(value: String): Self = StObject.set(x, "providerId", value.asInstanceOf[js.Any])
      
      inline def setProviderUid(value: String): Self = StObject.set(x, "providerUid", value.asInstanceOf[js.Any])
    }
  }
  
  trait UidIdentifier
    extends StObject
       with UserIdentifier {
    
    var uid: String
  }
  object UidIdentifier {
    
    inline def apply(uid: String): UidIdentifier = {
      val __obj = js.Dynamic.literal(uid = uid.asInstanceOf[js.Any])
      __obj.asInstanceOf[UidIdentifier]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UidIdentifier] (val x: Self) extends AnyVal {
      
      inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseAdmin.libAuthIdentifierMod.UidIdentifier
    - typings.firebaseAdmin.libAuthIdentifierMod.EmailIdentifier
    - typings.firebaseAdmin.libAuthIdentifierMod.PhoneIdentifier
    - typings.firebaseAdmin.libAuthIdentifierMod.ProviderIdentifier
  */
  trait UserIdentifier extends StObject
  object UserIdentifier {
    
    inline def EmailIdentifier(email: String): typings.firebaseAdmin.libAuthIdentifierMod.EmailIdentifier = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.firebaseAdmin.libAuthIdentifierMod.EmailIdentifier]
    }
    
    inline def PhoneIdentifier(phoneNumber: String): typings.firebaseAdmin.libAuthIdentifierMod.PhoneIdentifier = {
      val __obj = js.Dynamic.literal(phoneNumber = phoneNumber.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.firebaseAdmin.libAuthIdentifierMod.PhoneIdentifier]
    }
    
    inline def ProviderIdentifier(providerId: String, providerUid: String): typings.firebaseAdmin.libAuthIdentifierMod.ProviderIdentifier = {
      val __obj = js.Dynamic.literal(providerId = providerId.asInstanceOf[js.Any], providerUid = providerUid.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.firebaseAdmin.libAuthIdentifierMod.ProviderIdentifier]
    }
    
    inline def UidIdentifier(uid: String): typings.firebaseAdmin.libAuthIdentifierMod.UidIdentifier = {
      val __obj = js.Dynamic.literal(uid = uid.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.firebaseAdmin.libAuthIdentifierMod.UidIdentifier]
    }
  }
}

package typings.discourseSso

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("discourse-sso", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with DiscourseSSO {
    def this(ssoSecret: String) = this()
    
    /* CompleteClass */
    override def buildLoginString(params: UserParams): String = js.native
    
    /* CompleteClass */
    override def getNonce(payload: String): String = js.native
    
    /* CompleteClass */
    override def validate(payload: String, sig: String): Boolean = js.native
  }
  
  trait DiscourseSSO extends StObject {
    
    def buildLoginString(params: UserParams): String
    
    def getNonce(payload: String): String
    
    def validate(payload: String, sig: String): Boolean
  }
  object DiscourseSSO {
    
    inline def apply(
      buildLoginString: UserParams => String,
      getNonce: String => String,
      validate: (String, String) => Boolean
    ): DiscourseSSO = {
      val __obj = js.Dynamic.literal(buildLoginString = js.Any.fromFunction1(buildLoginString), getNonce = js.Any.fromFunction1(getNonce), validate = js.Any.fromFunction2(validate))
      __obj.asInstanceOf[DiscourseSSO]
    }
    
    extension [Self <: DiscourseSSO](x: Self) {
      
      inline def setBuildLoginString(value: UserParams => String): Self = StObject.set(x, "buildLoginString", js.Any.fromFunction1(value))
      
      inline def setGetNonce(value: String => String): Self = StObject.set(x, "getNonce", js.Any.fromFunction1(value))
      
      inline def setValidate(value: (String, String) => Boolean): Self = StObject.set(x, "validate", js.Any.fromFunction2(value))
    }
  }
  
  trait UserParams extends StObject {
    
    var add_groups: js.UndefOr[js.Array[String]] = js.undefined
    
    var admin: js.UndefOr[Boolean] = js.undefined
    
    var avatar_url: js.UndefOr[String] = js.undefined
    
    var email: String
    
    var external_id: String
    
    var moderator: js.UndefOr[Boolean] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var nonce: String
    
    var remove_groups: js.UndefOr[js.Array[String]] = js.undefined
    
    var username: js.UndefOr[String] = js.undefined
  }
  object UserParams {
    
    inline def apply(email: String, external_id: String, nonce: String): UserParams = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], external_id = external_id.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserParams]
    }
    
    extension [Self <: UserParams](x: Self) {
      
      inline def setAdd_groups(value: js.Array[String]): Self = StObject.set(x, "add_groups", value.asInstanceOf[js.Any])
      
      inline def setAdd_groupsUndefined: Self = StObject.set(x, "add_groups", js.undefined)
      
      inline def setAdd_groupsVarargs(value: String*): Self = StObject.set(x, "add_groups", js.Array(value :_*))
      
      inline def setAdmin(value: Boolean): Self = StObject.set(x, "admin", value.asInstanceOf[js.Any])
      
      inline def setAdminUndefined: Self = StObject.set(x, "admin", js.undefined)
      
      inline def setAvatar_url(value: String): Self = StObject.set(x, "avatar_url", value.asInstanceOf[js.Any])
      
      inline def setAvatar_urlUndefined: Self = StObject.set(x, "avatar_url", js.undefined)
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setExternal_id(value: String): Self = StObject.set(x, "external_id", value.asInstanceOf[js.Any])
      
      inline def setModerator(value: Boolean): Self = StObject.set(x, "moderator", value.asInstanceOf[js.Any])
      
      inline def setModeratorUndefined: Self = StObject.set(x, "moderator", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setRemove_groups(value: js.Array[String]): Self = StObject.set(x, "remove_groups", value.asInstanceOf[js.Any])
      
      inline def setRemove_groupsUndefined: Self = StObject.set(x, "remove_groups", js.undefined)
      
      inline def setRemove_groupsVarargs(value: String*): Self = StObject.set(x, "remove_groups", js.Array(value :_*))
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
}

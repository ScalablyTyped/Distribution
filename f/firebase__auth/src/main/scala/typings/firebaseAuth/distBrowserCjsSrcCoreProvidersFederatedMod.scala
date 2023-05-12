package typings.firebaseAuth

import typings.firebaseAuth.distBrowserCjsSrcModelPublicTypesMod.AuthProvider
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBrowserCjsSrcCoreProvidersFederatedMod {
  
  /* note: abstract class */ @JSImport("@firebase/auth/dist/browser-cjs/src/core/providers/federated", "FederatedAuthProvider")
  @js.native
  open class FederatedAuthProvider protected ()
    extends StObject
       with AuthProvider {
    /**
      * Constructor for generic OAuth providers.
      *
      * @param providerId - Provider for which credentials should be generated.
      */
    def this(providerId: String) = this()
    
    /** @internal */
    /* private */ var customParameters: Any = js.native
    
    /** @internal */
    var defaultLanguageCode: String | Null = js.native
    
    /**
      * Retrieve the current list of {@link CustomParameters}.
      */
    def getCustomParameters(): CustomParameters = js.native
    
    /**
      * Provider for which credentials can be constructed.
      */
    /* CompleteClass */
    override val providerId: String = js.native
    
    /**
      * Sets the OAuth custom parameters to pass in an OAuth request for popup and redirect sign-in
      * operations.
      *
      * @remarks
      * For a detailed list, check the reserved required OAuth 2.0 parameters such as `client_id`,
      * `redirect_uri`, `scope`, `response_type`, and `state` are not allowed and will be ignored.
      *
      * @param customOAuthParameters - The custom OAuth parameters to pass in the OAuth request.
      */
    def setCustomParameters(customOAuthParameters: CustomParameters): AuthProvider = js.native
    
    /**
      * Set the language gode.
      *
      * @param languageCode - language code
      */
    def setDefaultLanguage(): Unit = js.native
    def setDefaultLanguage(languageCode: String): Unit = js.native
  }
  
  type CustomParameters = Record[String, String]
}

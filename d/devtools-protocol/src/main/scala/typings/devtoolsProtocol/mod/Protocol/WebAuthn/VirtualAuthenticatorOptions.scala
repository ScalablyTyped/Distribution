package typings.devtoolsProtocol.mod.Protocol.WebAuthn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualAuthenticatorOptions extends StObject {
  
  /**
    * If set to true, tests of user presence will succeed immediately.
    * Otherwise, they will not be resolved. Defaults to true.
    */
  var automaticPresenceSimulation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Defaults to ctap2_0. Ignored if |protocol| == u2f.
    */
  var ctap2Version: js.UndefOr[Ctap2Version] = js.undefined
  
  /**
    * If set to true, the authenticator will support the credBlob extension.
    * https://fidoalliance.org/specs/fido-v2.1-rd-20201208/fido-client-to-authenticator-protocol-v2.1-rd-20201208.html#sctn-credBlob-extension
    * Defaults to false.
    */
  var hasCredBlob: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If set to true, the authenticator will support the largeBlob extension.
    * https://w3c.github.io/webauthn#largeBlob
    * Defaults to false.
    */
  var hasLargeBlob: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If set to true, the authenticator will support the minPinLength extension.
    * https://fidoalliance.org/specs/fido-v2.1-ps-20210615/fido-client-to-authenticator-protocol-v2.1-ps-20210615.html#sctn-minpinlength-extension
    * Defaults to false.
    */
  var hasMinPinLength: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Defaults to false.
    */
  var hasResidentKey: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Defaults to false.
    */
  var hasUserVerification: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Sets whether User Verification succeeds or fails for an authenticator.
    * Defaults to false.
    */
  var isUserVerified: js.UndefOr[Boolean] = js.undefined
  
  var protocol: AuthenticatorProtocol
  
  var transport: AuthenticatorTransport
}
object VirtualAuthenticatorOptions {
  
  inline def apply(protocol: AuthenticatorProtocol, transport: AuthenticatorTransport): VirtualAuthenticatorOptions = {
    val __obj = js.Dynamic.literal(protocol = protocol.asInstanceOf[js.Any], transport = transport.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualAuthenticatorOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VirtualAuthenticatorOptions] (val x: Self) extends AnyVal {
    
    inline def setAutomaticPresenceSimulation(value: Boolean): Self = StObject.set(x, "automaticPresenceSimulation", value.asInstanceOf[js.Any])
    
    inline def setAutomaticPresenceSimulationUndefined: Self = StObject.set(x, "automaticPresenceSimulation", js.undefined)
    
    inline def setCtap2Version(value: Ctap2Version): Self = StObject.set(x, "ctap2Version", value.asInstanceOf[js.Any])
    
    inline def setCtap2VersionUndefined: Self = StObject.set(x, "ctap2Version", js.undefined)
    
    inline def setHasCredBlob(value: Boolean): Self = StObject.set(x, "hasCredBlob", value.asInstanceOf[js.Any])
    
    inline def setHasCredBlobUndefined: Self = StObject.set(x, "hasCredBlob", js.undefined)
    
    inline def setHasLargeBlob(value: Boolean): Self = StObject.set(x, "hasLargeBlob", value.asInstanceOf[js.Any])
    
    inline def setHasLargeBlobUndefined: Self = StObject.set(x, "hasLargeBlob", js.undefined)
    
    inline def setHasMinPinLength(value: Boolean): Self = StObject.set(x, "hasMinPinLength", value.asInstanceOf[js.Any])
    
    inline def setHasMinPinLengthUndefined: Self = StObject.set(x, "hasMinPinLength", js.undefined)
    
    inline def setHasResidentKey(value: Boolean): Self = StObject.set(x, "hasResidentKey", value.asInstanceOf[js.Any])
    
    inline def setHasResidentKeyUndefined: Self = StObject.set(x, "hasResidentKey", js.undefined)
    
    inline def setHasUserVerification(value: Boolean): Self = StObject.set(x, "hasUserVerification", value.asInstanceOf[js.Any])
    
    inline def setHasUserVerificationUndefined: Self = StObject.set(x, "hasUserVerification", js.undefined)
    
    inline def setIsUserVerified(value: Boolean): Self = StObject.set(x, "isUserVerified", value.asInstanceOf[js.Any])
    
    inline def setIsUserVerifiedUndefined: Self = StObject.set(x, "isUserVerified", js.undefined)
    
    inline def setProtocol(value: AuthenticatorProtocol): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setTransport(value: AuthenticatorTransport): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
  }
}

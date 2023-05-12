package typings.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi

import typings.devtoolsProtocol.devtoolsProtocolStrings.credentialAdded
import typings.devtoolsProtocol.devtoolsProtocolStrings.credentialAsserted
import typings.devtoolsProtocol.mod.Protocol.WebAuthn.AddCredentialRequest
import typings.devtoolsProtocol.mod.Protocol.WebAuthn.AddVirtualAuthenticatorRequest
import typings.devtoolsProtocol.mod.Protocol.WebAuthn.AddVirtualAuthenticatorResponse
import typings.devtoolsProtocol.mod.Protocol.WebAuthn.ClearCredentialsRequest
import typings.devtoolsProtocol.mod.Protocol.WebAuthn.CredentialAddedEvent
import typings.devtoolsProtocol.mod.Protocol.WebAuthn.CredentialAssertedEvent
import typings.devtoolsProtocol.mod.Protocol.WebAuthn.EnableRequest
import typings.devtoolsProtocol.mod.Protocol.WebAuthn.GetCredentialRequest
import typings.devtoolsProtocol.mod.Protocol.WebAuthn.GetCredentialResponse
import typings.devtoolsProtocol.mod.Protocol.WebAuthn.GetCredentialsRequest
import typings.devtoolsProtocol.mod.Protocol.WebAuthn.GetCredentialsResponse
import typings.devtoolsProtocol.mod.Protocol.WebAuthn.RemoveCredentialRequest
import typings.devtoolsProtocol.mod.Protocol.WebAuthn.RemoveVirtualAuthenticatorRequest
import typings.devtoolsProtocol.mod.Protocol.WebAuthn.SetAutomaticPresenceSimulationRequest
import typings.devtoolsProtocol.mod.Protocol.WebAuthn.SetResponseOverrideBitsRequest
import typings.devtoolsProtocol.mod.Protocol.WebAuthn.SetUserVerifiedRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebAuthnApi extends StObject {
  
  /**
    * Adds the credential to the specified authenticator.
    */
  def addCredential(params: AddCredentialRequest): js.Promise[Unit] = js.native
  
  /**
    * Creates and adds a virtual authenticator.
    */
  def addVirtualAuthenticator(params: AddVirtualAuthenticatorRequest): js.Promise[AddVirtualAuthenticatorResponse] = js.native
  
  /**
    * Clears all the credentials from the specified device.
    */
  def clearCredentials(params: ClearCredentialsRequest): js.Promise[Unit] = js.native
  
  /**
    * Disable the WebAuthn domain.
    */
  def disable(): js.Promise[Unit] = js.native
  
  /**
    * Enable the WebAuthn domain and start intercepting credential storage and
    * retrieval with a virtual authenticator.
    */
  def enable(params: EnableRequest): js.Promise[Unit] = js.native
  
  /**
    * Returns a single credential stored in the given virtual authenticator that
    * matches the credential ID.
    */
  def getCredential(params: GetCredentialRequest): js.Promise[GetCredentialResponse] = js.native
  
  /**
    * Returns all the credentials stored in the given virtual authenticator.
    */
  def getCredentials(params: GetCredentialsRequest): js.Promise[GetCredentialsResponse] = js.native
  
  /**
    * Triggered when a credential is added to an authenticator.
    */
  @JSName("on")
  def on_credentialAdded(event: credentialAdded, listener: js.Function1[/* params */ CredentialAddedEvent, Unit]): Unit = js.native
  /**
    * Triggered when a credential is used in a webauthn assertion.
    */
  @JSName("on")
  def on_credentialAsserted(event: credentialAsserted, listener: js.Function1[/* params */ CredentialAssertedEvent, Unit]): Unit = js.native
  
  /**
    * Removes a credential from the authenticator.
    */
  def removeCredential(params: RemoveCredentialRequest): js.Promise[Unit] = js.native
  
  /**
    * Removes the given authenticator.
    */
  def removeVirtualAuthenticator(params: RemoveVirtualAuthenticatorRequest): js.Promise[Unit] = js.native
  
  /**
    * Sets whether tests of user presence will succeed immediately (if true) or fail to resolve (if false) for an authenticator.
    * The default is true.
    */
  def setAutomaticPresenceSimulation(params: SetAutomaticPresenceSimulationRequest): js.Promise[Unit] = js.native
  
  /**
    * Resets parameters isBogusSignature, isBadUV, isBadUP to false if they are not present.
    */
  def setResponseOverrideBits(params: SetResponseOverrideBitsRequest): js.Promise[Unit] = js.native
  
  /**
    * Sets whether User Verification succeeds or fails for an authenticator.
    * The default is true.
    */
  def setUserVerified(params: SetUserVerifiedRequest): js.Promise[Unit] = js.native
}

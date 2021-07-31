package typings.devtoolsProtocol.protocolProxyApiMod.ProtocolProxyApi

import typings.devtoolsProtocol.devtoolsProtocolStrings.certificateError
import typings.devtoolsProtocol.devtoolsProtocolStrings.securityStateChanged
import typings.devtoolsProtocol.devtoolsProtocolStrings.visibleSecurityStateChanged
import typings.devtoolsProtocol.mod.Protocol.Security.CertificateErrorEvent
import typings.devtoolsProtocol.mod.Protocol.Security.HandleCertificateErrorRequest
import typings.devtoolsProtocol.mod.Protocol.Security.SecurityStateChangedEvent
import typings.devtoolsProtocol.mod.Protocol.Security.SetIgnoreCertificateErrorsRequest
import typings.devtoolsProtocol.mod.Protocol.Security.SetOverrideCertificateErrorsRequest
import typings.devtoolsProtocol.mod.Protocol.Security.VisibleSecurityStateChangedEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecurityApi extends StObject {
  
  /**
    * Disables tracking security state changes.
    */
  def disable(): js.Promise[Unit] = js.native
  
  /**
    * Enables tracking security state changes.
    */
  def enable(): js.Promise[Unit] = js.native
  
  /**
    * Handles a certificate error that fired a certificateError event.
    */
  def handleCertificateError(params: HandleCertificateErrorRequest): js.Promise[Unit] = js.native
  
  /**
    * There is a certificate error. If overriding certificate errors is enabled, then it should be
    * handled with the `handleCertificateError` command. Note: this event does not fire if the
    * certificate error has been allowed internally. Only one client per target should override
    * certificate errors at the same time.
    */
  @JSName("on")
  def on_certificateError(event: certificateError, listener: js.Function1[/* params */ CertificateErrorEvent, Unit]): Unit = js.native
  /**
    * The security state of the page changed.
    */
  @JSName("on")
  def on_securityStateChanged(event: securityStateChanged, listener: js.Function1[/* params */ SecurityStateChangedEvent, Unit]): Unit = js.native
  /**
    * The security state of the page changed.
    */
  @JSName("on")
  def on_visibleSecurityStateChanged(
    event: visibleSecurityStateChanged,
    listener: js.Function1[/* params */ VisibleSecurityStateChangedEvent, Unit]
  ): Unit = js.native
  
  /**
    * Enable/disable whether all certificate errors should be ignored.
    */
  def setIgnoreCertificateErrors(params: SetIgnoreCertificateErrorsRequest): js.Promise[Unit] = js.native
  
  /**
    * Enable/disable overriding certificate errors. If enabled, all certificate error events need to
    * be handled by the DevTools client and should be answered with `handleCertificateError` commands.
    */
  def setOverrideCertificateErrors(params: SetOverrideCertificateErrorsRequest): js.Promise[Unit] = js.native
}

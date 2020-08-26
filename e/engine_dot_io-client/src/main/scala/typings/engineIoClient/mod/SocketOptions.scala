package typings.engineIoClient.mod

import org.scalablytyped.runtime.StringDictionary
import typings.engineIoClient.engineIoClientBooleans.`false`
import typings.node.httpMod.Agent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SocketOptions extends js.Object {
  /**
    * http.Agent to use, defaults to false (NodeJS only)
    */
  var agent: js.UndefOr[Agent | `false`] = js.native
  /**
    * An authority certificate or array of authority certificates to check the remote host against.
    * Can be used in Node.js client environment to manually specify certificate information.
    */
  var ca: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * Public x509 certificate to use. Can be used in Node.js client environment to manually specify certificate information.
    */
  var cert: js.UndefOr[String] = js.native
  /**
    * A string describing the ciphers to use or exclude. Consult the cipher format list for details on the format.
    * Can be used in Node.js client environment to manually specify certificate information.
    */
  var ciphers: js.UndefOr[String] = js.native
  /**
    * enables XDomainRequest for IE8 to avoid loading bar flashing with click sound. default to false because XDomainRequest has a flaw of not sending cookie.
    */
  var enablesXDR: js.UndefOr[Boolean] = js.native
  /**
    * Headers that will be passed for each request to the server (via xhr-polling and via websockets).
    * These values then can be used during handshake or for special proxies. Can only be used in Node.js client environment.
    */
  var extraHeaders: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * forces base 64 encoding for polling transport even when XHR2 responseType is available and WebSocket even if the used standard supports binary.
    */
  var forceBase64: js.UndefOr[Boolean] = js.native
  /**
    * forces JSONP for polling transport.
    */
  var forceJSONP: js.UndefOr[Boolean] = js.native
  /**
    * Uses NodeJS implementation for websockets - even if there is a native Browser-Websocket available,
    * which is preferred by default over the NodeJS implementation. (This is useful when using hybrid platforms
    * like nw.js or electron) (false, NodeJS only)
    */
  var forceNode: js.UndefOr[Boolean] = js.native
  /**
    * determines whether to use JSONP when necessary for polling.
    * If disabled (by settings to false) an error will be emitted (saying "No transports available")
    * if no other transports are available. If another transport is available
    * for opening a connection (e.g. WebSocket) that transport will be used instead.
    */
  var jsonp: js.UndefOr[Boolean] = js.native
  /**
    * Private key to use for SSL. Can be used in Node.js client environment to manually specify certificate information.
    */
  var key: js.UndefOr[String] = js.native
  /**
    * the local IP address to connect to
    */
  var localAddress: js.UndefOr[String] = js.native
  /**
    * whether transport upgrades should be restricted to transports supporting binary data (false)
    */
  var onlyBinaryUpgrades: js.UndefOr[Boolean] = js.native
  /**
    * A string of passphrase for the private key or pfx. Can be used in Node.js client environment to manually specify certificate information.
    */
  var passphrase: js.UndefOr[String] = js.native
  /**
    * path to connect to, default is /engine.io
    */
  var path: js.UndefOr[String] = js.native
  /**
    * parameters of the WebSocket permessage-deflate extension (see ws module api docs). Set to false to disable. (true)
    */
  var perMessageDeflate: js.UndefOr[js.Any] = js.native
  /**
    * Certificate, Private key and CA certificates to use for SSL. Can be used in Node.js client environment to manually specify certificate information.
    */
  var pfx: js.UndefOr[String] = js.native
  /**
    * port the policy server listens on (843)
    */
  var policyPort: js.UndefOr[Double] = js.native
  /**
    * If true, the server certificate is verified against the list of supplied CAs.
    * An 'error' event is emitted if verification fails. Verification happens at the connection level,
    * before the HTTP request is sent. Can be used in Node.js client environment to manually specify certificate information.
    */
  var rejectUnauthorized: js.UndefOr[Boolean] = js.native
  /**
    * defaults to false. If true and if the previous websocket connection to the server succeeded,
    * the connection attempt will bypass the normal upgrade process and will initially try websocket.
    * A connection attempt following a transport error will use the normal upgrade process.
    * It is recommended you turn this on only when using SSL/TLS connections,
    * or if you know that your network does not block websockets.
    */
  var rememberUpgrade: js.UndefOr[Boolean] = js.native
  /**
    * timestamp parameter (t)
    */
  var timestampParam: js.UndefOr[String] = js.native
  /**
    * whether to add the timestamp with each transport request. Note: polling requests are always stamped unless this option is explicitly set to false (false)
    */
  var timestampRequests: js.UndefOr[Boolean] = js.native
  /**
    * hash of options, indexed by transport name, overriding the common options for the given transport
    */
  var transportOptions: js.UndefOr[StringDictionary[SocketOptions]] = js.native
  /**
    * a list of transports to try (in order).
    * Defaults to ['polling', 'websocket'].
    * Engine always attempts to connect directly with the first one, provided the feature detection test for it passes.
    */
  var transports: js.UndefOr[js.Array[Transport]] = js.native
  /**
    * defaults to true, whether the client should try to upgrade the transport from long-polling to something better.
    */
  var upgrade: js.UndefOr[Boolean] = js.native
}

object SocketOptions {
  @scala.inline
  def apply(): SocketOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SocketOptions]
  }
  @scala.inline
  implicit class SocketOptionsOps[Self <: SocketOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAgent(value: Agent | `false`): Self = this.set("agent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAgent: Self = this.set("agent", js.undefined)
    @scala.inline
    def setCaVarargs(value: String*): Self = this.set("ca", js.Array(value :_*))
    @scala.inline
    def setCa(value: String | js.Array[String]): Self = this.set("ca", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCa: Self = this.set("ca", js.undefined)
    @scala.inline
    def setCert(value: String): Self = this.set("cert", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCert: Self = this.set("cert", js.undefined)
    @scala.inline
    def setCiphers(value: String): Self = this.set("ciphers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCiphers: Self = this.set("ciphers", js.undefined)
    @scala.inline
    def setEnablesXDR(value: Boolean): Self = this.set("enablesXDR", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnablesXDR: Self = this.set("enablesXDR", js.undefined)
    @scala.inline
    def setExtraHeaders(value: StringDictionary[String]): Self = this.set("extraHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtraHeaders: Self = this.set("extraHeaders", js.undefined)
    @scala.inline
    def setForceBase64(value: Boolean): Self = this.set("forceBase64", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceBase64: Self = this.set("forceBase64", js.undefined)
    @scala.inline
    def setForceJSONP(value: Boolean): Self = this.set("forceJSONP", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceJSONP: Self = this.set("forceJSONP", js.undefined)
    @scala.inline
    def setForceNode(value: Boolean): Self = this.set("forceNode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceNode: Self = this.set("forceNode", js.undefined)
    @scala.inline
    def setJsonp(value: Boolean): Self = this.set("jsonp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJsonp: Self = this.set("jsonp", js.undefined)
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setLocalAddress(value: String): Self = this.set("localAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalAddress: Self = this.set("localAddress", js.undefined)
    @scala.inline
    def setOnlyBinaryUpgrades(value: Boolean): Self = this.set("onlyBinaryUpgrades", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnlyBinaryUpgrades: Self = this.set("onlyBinaryUpgrades", js.undefined)
    @scala.inline
    def setPassphrase(value: String): Self = this.set("passphrase", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassphrase: Self = this.set("passphrase", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setPerMessageDeflate(value: js.Any): Self = this.set("perMessageDeflate", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePerMessageDeflate: Self = this.set("perMessageDeflate", js.undefined)
    @scala.inline
    def setPfx(value: String): Self = this.set("pfx", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePfx: Self = this.set("pfx", js.undefined)
    @scala.inline
    def setPolicyPort(value: Double): Self = this.set("policyPort", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicyPort: Self = this.set("policyPort", js.undefined)
    @scala.inline
    def setRejectUnauthorized(value: Boolean): Self = this.set("rejectUnauthorized", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRejectUnauthorized: Self = this.set("rejectUnauthorized", js.undefined)
    @scala.inline
    def setRememberUpgrade(value: Boolean): Self = this.set("rememberUpgrade", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRememberUpgrade: Self = this.set("rememberUpgrade", js.undefined)
    @scala.inline
    def setTimestampParam(value: String): Self = this.set("timestampParam", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimestampParam: Self = this.set("timestampParam", js.undefined)
    @scala.inline
    def setTimestampRequests(value: Boolean): Self = this.set("timestampRequests", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimestampRequests: Self = this.set("timestampRequests", js.undefined)
    @scala.inline
    def setTransportOptions(value: StringDictionary[SocketOptions]): Self = this.set("transportOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransportOptions: Self = this.set("transportOptions", js.undefined)
    @scala.inline
    def setTransportsVarargs(value: Transport*): Self = this.set("transports", js.Array(value :_*))
    @scala.inline
    def setTransports(value: js.Array[Transport]): Self = this.set("transports", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransports: Self = this.set("transports", js.undefined)
    @scala.inline
    def setUpgrade(value: Boolean): Self = this.set("upgrade", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpgrade: Self = this.set("upgrade", js.undefined)
  }
  
}


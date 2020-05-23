package typings.engineIoClient.mod

import org.scalablytyped.runtime.StringDictionary
import typings.engineIoClient.engineIoClientBooleans.`false`
import typings.node.httpMod.Agent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocketOptions extends js.Object {
  /**
    * http.Agent to use, defaults to false (NodeJS only)
    */
  var agent: js.UndefOr[Agent | `false`] = js.undefined
  /**
    * An authority certificate or array of authority certificates to check the remote host against.
    * Can be used in Node.js client environment to manually specify certificate information.
    */
  var ca: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * Public x509 certificate to use. Can be used in Node.js client environment to manually specify certificate information.
    */
  var cert: js.UndefOr[String] = js.undefined
  /**
    * A string describing the ciphers to use or exclude. Consult the cipher format list for details on the format.
    * Can be used in Node.js client environment to manually specify certificate information.
    */
  var ciphers: js.UndefOr[String] = js.undefined
  /**
    * enables XDomainRequest for IE8 to avoid loading bar flashing with click sound. default to false because XDomainRequest has a flaw of not sending cookie.
    */
  var enablesXDR: js.UndefOr[Boolean] = js.undefined
  /**
    * Headers that will be passed for each request to the server (via xhr-polling and via websockets).
    * These values then can be used during handshake or for special proxies. Can only be used in Node.js client environment.
    */
  var extraHeaders: js.UndefOr[StringDictionary[String]] = js.undefined
  /**
    * forces base 64 encoding for polling transport even when XHR2 responseType is available and WebSocket even if the used standard supports binary.
    */
  var forceBase64: js.UndefOr[Boolean] = js.undefined
  /**
    * forces JSONP for polling transport.
    */
  var forceJSONP: js.UndefOr[Boolean] = js.undefined
  /**
    * Uses NodeJS implementation for websockets - even if there is a native Browser-Websocket available,
    * which is preferred by default over the NodeJS implementation. (This is useful when using hybrid platforms
    * like nw.js or electron) (false, NodeJS only)
    */
  var forceNode: js.UndefOr[Boolean] = js.undefined
  /**
    * determines whether to use JSONP when necessary for polling.
    * If disabled (by settings to false) an error will be emitted (saying "No transports available")
    * if no other transports are available. If another transport is available
    * for opening a connection (e.g. WebSocket) that transport will be used instead.
    */
  var jsonp: js.UndefOr[Boolean] = js.undefined
  /**
    * Private key to use for SSL. Can be used in Node.js client environment to manually specify certificate information.
    */
  var key: js.UndefOr[String] = js.undefined
  /**
    * the local IP address to connect to
    */
  var localAddress: js.UndefOr[String] = js.undefined
  /**
    * whether transport upgrades should be restricted to transports supporting binary data (false)
    */
  var onlyBinaryUpgrades: js.UndefOr[Boolean] = js.undefined
  /**
    * A string of passphrase for the private key or pfx. Can be used in Node.js client environment to manually specify certificate information.
    */
  var passphrase: js.UndefOr[String] = js.undefined
  /**
    * path to connect to, default is /engine.io
    */
  var path: js.UndefOr[String] = js.undefined
  /**
    * parameters of the WebSocket permessage-deflate extension (see ws module api docs). Set to false to disable. (true)
    */
  var perMessageDeflate: js.UndefOr[js.Any] = js.undefined
  /**
    * Certificate, Private key and CA certificates to use for SSL. Can be used in Node.js client environment to manually specify certificate information.
    */
  var pfx: js.UndefOr[String] = js.undefined
  /**
    * port the policy server listens on (843)
    */
  var policyPort: js.UndefOr[Double] = js.undefined
  /**
    * If true, the server certificate is verified against the list of supplied CAs.
    * An 'error' event is emitted if verification fails. Verification happens at the connection level,
    * before the HTTP request is sent. Can be used in Node.js client environment to manually specify certificate information.
    */
  var rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
  /**
    * defaults to false. If true and if the previous websocket connection to the server succeeded,
    * the connection attempt will bypass the normal upgrade process and will initially try websocket.
    * A connection attempt following a transport error will use the normal upgrade process.
    * It is recommended you turn this on only when using SSL/TLS connections,
    * or if you know that your network does not block websockets.
    */
  var rememberUpgrade: js.UndefOr[Boolean] = js.undefined
  /**
    * timestamp parameter (t)
    */
  var timestampParam: js.UndefOr[String] = js.undefined
  /**
    * whether to add the timestamp with each transport request. Note: polling requests are always stamped unless this option is explicitly set to false (false)
    */
  var timestampRequests: js.UndefOr[Boolean] = js.undefined
  /**
    * hash of options, indexed by transport name, overriding the common options for the given transport
    */
  var transportOptions: js.UndefOr[StringDictionary[SocketOptions]] = js.undefined
  /**
    * a list of transports to try (in order).
    * Defaults to ['polling', 'websocket'].
    * Engine always attempts to connect directly with the first one, provided the feature detection test for it passes.
    */
  var transports: js.UndefOr[js.Array[Transport]] = js.undefined
  /**
    * defaults to true, whether the client should try to upgrade the transport from long-polling to something better.
    */
  var upgrade: js.UndefOr[Boolean] = js.undefined
}

object SocketOptions {
  @scala.inline
  def apply(
    agent: Agent | `false` = null,
    ca: String | js.Array[String] = null,
    cert: String = null,
    ciphers: String = null,
    enablesXDR: js.UndefOr[Boolean] = js.undefined,
    extraHeaders: StringDictionary[String] = null,
    forceBase64: js.UndefOr[Boolean] = js.undefined,
    forceJSONP: js.UndefOr[Boolean] = js.undefined,
    forceNode: js.UndefOr[Boolean] = js.undefined,
    jsonp: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    localAddress: String = null,
    onlyBinaryUpgrades: js.UndefOr[Boolean] = js.undefined,
    passphrase: String = null,
    path: String = null,
    perMessageDeflate: js.Any = null,
    pfx: String = null,
    policyPort: js.UndefOr[Double] = js.undefined,
    rejectUnauthorized: js.UndefOr[Boolean] = js.undefined,
    rememberUpgrade: js.UndefOr[Boolean] = js.undefined,
    timestampParam: String = null,
    timestampRequests: js.UndefOr[Boolean] = js.undefined,
    transportOptions: StringDictionary[SocketOptions] = null,
    transports: js.Array[Transport] = null,
    upgrade: js.UndefOr[Boolean] = js.undefined
  ): SocketOptions = {
    val __obj = js.Dynamic.literal()
    if (agent != null) __obj.updateDynamic("agent")(agent.asInstanceOf[js.Any])
    if (ca != null) __obj.updateDynamic("ca")(ca.asInstanceOf[js.Any])
    if (cert != null) __obj.updateDynamic("cert")(cert.asInstanceOf[js.Any])
    if (ciphers != null) __obj.updateDynamic("ciphers")(ciphers.asInstanceOf[js.Any])
    if (!js.isUndefined(enablesXDR)) __obj.updateDynamic("enablesXDR")(enablesXDR.get.asInstanceOf[js.Any])
    if (extraHeaders != null) __obj.updateDynamic("extraHeaders")(extraHeaders.asInstanceOf[js.Any])
    if (!js.isUndefined(forceBase64)) __obj.updateDynamic("forceBase64")(forceBase64.get.asInstanceOf[js.Any])
    if (!js.isUndefined(forceJSONP)) __obj.updateDynamic("forceJSONP")(forceJSONP.get.asInstanceOf[js.Any])
    if (!js.isUndefined(forceNode)) __obj.updateDynamic("forceNode")(forceNode.get.asInstanceOf[js.Any])
    if (!js.isUndefined(jsonp)) __obj.updateDynamic("jsonp")(jsonp.get.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (localAddress != null) __obj.updateDynamic("localAddress")(localAddress.asInstanceOf[js.Any])
    if (!js.isUndefined(onlyBinaryUpgrades)) __obj.updateDynamic("onlyBinaryUpgrades")(onlyBinaryUpgrades.get.asInstanceOf[js.Any])
    if (passphrase != null) __obj.updateDynamic("passphrase")(passphrase.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (perMessageDeflate != null) __obj.updateDynamic("perMessageDeflate")(perMessageDeflate.asInstanceOf[js.Any])
    if (pfx != null) __obj.updateDynamic("pfx")(pfx.asInstanceOf[js.Any])
    if (!js.isUndefined(policyPort)) __obj.updateDynamic("policyPort")(policyPort.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rejectUnauthorized)) __obj.updateDynamic("rejectUnauthorized")(rejectUnauthorized.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rememberUpgrade)) __obj.updateDynamic("rememberUpgrade")(rememberUpgrade.get.asInstanceOf[js.Any])
    if (timestampParam != null) __obj.updateDynamic("timestampParam")(timestampParam.asInstanceOf[js.Any])
    if (!js.isUndefined(timestampRequests)) __obj.updateDynamic("timestampRequests")(timestampRequests.get.asInstanceOf[js.Any])
    if (transportOptions != null) __obj.updateDynamic("transportOptions")(transportOptions.asInstanceOf[js.Any])
    if (transports != null) __obj.updateDynamic("transports")(transports.asInstanceOf[js.Any])
    if (!js.isUndefined(upgrade)) __obj.updateDynamic("upgrade")(upgrade.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketOptions]
  }
}


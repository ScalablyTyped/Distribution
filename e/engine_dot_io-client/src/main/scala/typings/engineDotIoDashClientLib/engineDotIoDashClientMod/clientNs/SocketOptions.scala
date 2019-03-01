package typings
package engineDotIoDashClientLib.engineDotIoDashClientMod.clientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocketOptions extends js.Object {
  /**
  		 * http.Agent to use, defaults to false (NodeJS only)
  		 */
  var agent: js.UndefOr[
    nodeLib.httpMod.Agent | engineDotIoDashClientLib.engineDotIoDashClientLibNumbers.`false`
  ] = js.undefined
  /**
  		 * An authority certificate or array of authority certificates to check the remote host against.
  		 * Can be used in Node.js client environment to manually specify certificate information.
  		 */
  var ca: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /**
  		 * Public x509 certificate to use. Can be used in Node.js client environment to manually specify certificate information.
  		 */
  var cert: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * A string describing the ciphers to use or exclude. Consult the cipher format list for details on the format.
  		 * Can be used in Node.js client environment to manually specify certificate information.
  		 */
  var ciphers: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * enables XDomainRequest for IE8 to avoid loading bar flashing with click sound. default to false because XDomainRequest has a flaw of not sending cookie.
  		 */
  var enablesXDR: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * Headers that will be passed for each request to the server (via xhr-polling and via websockets).
  		 * These values then can be used during handshake or for special proxies. Can only be used in Node.js client environment.
  		 */
  var extraHeaders: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  /**
  		 * forces base 64 encoding for polling transport even when XHR2 responseType is available and WebSocket even if the used standard supports binary.
  		 */
  var forceBase64: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * forces JSONP for polling transport.
  		 */
  var forceJSONP: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * Uses NodeJS implementation for websockets - even if there is a native Browser-Websocket available,
  		 * which is preferred by default over the NodeJS implementation. (This is useful when using hybrid platforms
  		 * like nw.js or electron) (false, NodeJS only)
  		 */
  var forceNode: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * determines whether to use JSONP when necessary for polling.
  		 * If disabled (by settings to false) an error will be emitted (saying "No transports available")
  		 * if no other transports are available. If another transport is available
  		 * for opening a connection (e.g. WebSocket) that transport will be used instead.
  		 */
  var jsonp: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * Private key to use for SSL. Can be used in Node.js client environment to manually specify certificate information.
  		 */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * the local IP address to connect to
  		 */
  var localAddress: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * whether transport upgrades should be restricted to transports supporting binary data (false)
  		 */
  var onlyBinaryUpgrades: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * A string of passphrase for the private key or pfx. Can be used in Node.js client environment to manually specify certificate information.
  		 */
  var passphrase: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * path to connect to, default is /engine.io
  		 */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * parameters of the WebSocket permessage-deflate extension (see ws module api docs). Set to false to disable. (true)
  		 */
  var perMessageDeflate: js.UndefOr[js.Any] = js.undefined
  /**
  		 * Certificate, Private key and CA certificates to use for SSL. Can be used in Node.js client environment to manually specify certificate information.
  		 */
  var pfx: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * port the policy server listens on (843)
  		 */
  var policyPort: js.UndefOr[scala.Double] = js.undefined
  /**
  		 * If true, the server certificate is verified against the list of supplied CAs.
  		 * An 'error' event is emitted if verification fails. Verification happens at the connection level,
  		 * before the HTTP request is sent. Can be used in Node.js client environment to manually specify certificate information.
  		 */
  var rejectUnauthorized: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * defaults to false. If true and if the previous websocket connection to the server succeeded,
  		 * the connection attempt will bypass the normal upgrade process and will initially try websocket.
  		 * A connection attempt following a transport error will use the normal upgrade process.
  		 * It is recommended you turn this on only when using SSL/TLS connections,
  		 * or if you know that your network does not block websockets.
  		 */
  var rememberUpgrade: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * timestamp parameter (t)
  		 */
  var timestampParam: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * whether to add the timestamp with each transport request. Note: polling requests are always stamped unless this option is explicitly set to false (false)
  		 */
  var timestampRequests: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * hash of options, indexed by transport name, overriding the common options for the given transport
  		 */
  var transportOptions: js.UndefOr[org.scalablytyped.runtime.StringDictionary[SocketOptions]] = js.undefined
  /**
  		 * a list of transports to try (in order). Defaults to ['polling', 'websocket']. Engine always attempts to connect directly with the first one, provided the feature detection test for it passes.
  		 */
  var transports: js.UndefOr[js.Array[Transport]] = js.undefined
  /**
  		 * defaults to true, whether the client should try to upgrade the transport from long-polling to something better.
  		 */
  var upgrade: js.UndefOr[scala.Boolean] = js.undefined
}

object SocketOptions {
  @scala.inline
  def apply(
    agent: nodeLib.httpMod.Agent | engineDotIoDashClientLib.engineDotIoDashClientLibNumbers.`false` = null,
    ca: java.lang.String | js.Array[java.lang.String] = null,
    cert: java.lang.String = null,
    ciphers: java.lang.String = null,
    enablesXDR: js.UndefOr[scala.Boolean] = js.undefined,
    extraHeaders: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    forceBase64: js.UndefOr[scala.Boolean] = js.undefined,
    forceJSONP: js.UndefOr[scala.Boolean] = js.undefined,
    forceNode: js.UndefOr[scala.Boolean] = js.undefined,
    jsonp: js.UndefOr[scala.Boolean] = js.undefined,
    key: java.lang.String = null,
    localAddress: java.lang.String = null,
    onlyBinaryUpgrades: js.UndefOr[scala.Boolean] = js.undefined,
    passphrase: java.lang.String = null,
    path: java.lang.String = null,
    perMessageDeflate: js.Any = null,
    pfx: java.lang.String = null,
    policyPort: scala.Int | scala.Double = null,
    rejectUnauthorized: js.UndefOr[scala.Boolean] = js.undefined,
    rememberUpgrade: js.UndefOr[scala.Boolean] = js.undefined,
    timestampParam: java.lang.String = null,
    timestampRequests: js.UndefOr[scala.Boolean] = js.undefined,
    transportOptions: org.scalablytyped.runtime.StringDictionary[SocketOptions] = null,
    transports: js.Array[Transport] = null,
    upgrade: js.UndefOr[scala.Boolean] = js.undefined
  ): SocketOptions = {
    val __obj = js.Dynamic.literal()
    if (agent != null) __obj.updateDynamic("agent")(agent.asInstanceOf[js.Any])
    if (ca != null) __obj.updateDynamic("ca")(ca.asInstanceOf[js.Any])
    if (cert != null) __obj.updateDynamic("cert")(cert)
    if (ciphers != null) __obj.updateDynamic("ciphers")(ciphers)
    if (!js.isUndefined(enablesXDR)) __obj.updateDynamic("enablesXDR")(enablesXDR)
    if (extraHeaders != null) __obj.updateDynamic("extraHeaders")(extraHeaders)
    if (!js.isUndefined(forceBase64)) __obj.updateDynamic("forceBase64")(forceBase64)
    if (!js.isUndefined(forceJSONP)) __obj.updateDynamic("forceJSONP")(forceJSONP)
    if (!js.isUndefined(forceNode)) __obj.updateDynamic("forceNode")(forceNode)
    if (!js.isUndefined(jsonp)) __obj.updateDynamic("jsonp")(jsonp)
    if (key != null) __obj.updateDynamic("key")(key)
    if (localAddress != null) __obj.updateDynamic("localAddress")(localAddress)
    if (!js.isUndefined(onlyBinaryUpgrades)) __obj.updateDynamic("onlyBinaryUpgrades")(onlyBinaryUpgrades)
    if (passphrase != null) __obj.updateDynamic("passphrase")(passphrase)
    if (path != null) __obj.updateDynamic("path")(path)
    if (perMessageDeflate != null) __obj.updateDynamic("perMessageDeflate")(perMessageDeflate)
    if (pfx != null) __obj.updateDynamic("pfx")(pfx)
    if (policyPort != null) __obj.updateDynamic("policyPort")(policyPort.asInstanceOf[js.Any])
    if (!js.isUndefined(rejectUnauthorized)) __obj.updateDynamic("rejectUnauthorized")(rejectUnauthorized)
    if (!js.isUndefined(rememberUpgrade)) __obj.updateDynamic("rememberUpgrade")(rememberUpgrade)
    if (timestampParam != null) __obj.updateDynamic("timestampParam")(timestampParam)
    if (!js.isUndefined(timestampRequests)) __obj.updateDynamic("timestampRequests")(timestampRequests)
    if (transportOptions != null) __obj.updateDynamic("transportOptions")(transportOptions)
    if (transports != null) __obj.updateDynamic("transports")(transports)
    if (!js.isUndefined(upgrade)) __obj.updateDynamic("upgrade")(upgrade)
    __obj.asInstanceOf[SocketOptions]
  }
}


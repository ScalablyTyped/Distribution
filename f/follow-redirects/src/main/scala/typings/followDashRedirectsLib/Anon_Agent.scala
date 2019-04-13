package typings
package followDashRedirectsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Agent extends js.Object {
  var Agent: org.scalablytyped.runtime.Instantiable0[nodeLib.httpMod.Agent] = js.native
  // https://github.com/nodejs/node/blob/master/lib/_http_client.js#L77
  var ClientRequest: org.scalablytyped.runtime.Instantiable1[/* url */ java.lang.String, nodeLib.httpMod.ClientRequest] = js.native
  var IncomingMessage: org.scalablytyped.runtime.Instantiable1[/* socket */ nodeLib.netMod.Socket, nodeLib.httpMod.IncomingMessage] = js.native
  val METHODS: js.Array[java.lang.String] = js.native
  // https://github.com/nodejs/node/blob/master/lib/_http_outgoing.js
  var OutgoingMessage: org.scalablytyped.runtime.Instantiable0[nodeLib.httpMod.OutgoingMessage] = js.native
  val STATUS_CODES: org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String]] with org.scalablytyped.runtime.NumberDictionary[js.UndefOr[java.lang.String]] = js.native
  var Server: org.scalablytyped.runtime.Instantiable0[nodeLib.httpMod.Server] = js.native
  // https://github.com/nodejs/node/blob/master/lib/_http_server.js#L108-L256
  var ServerResponse: org.scalablytyped.runtime.Instantiable1[/* req */ nodeLib.httpMod.IncomingMessage, nodeLib.httpMod.ServerResponse] = js.native
  var globalAgent: nodeLib.httpMod.Agent = js.native
  /**
    * Read-only property specifying the maximum allowed size of HTTP headers in bytes.
    * Defaults to 8KB. Configurable using the [`--max-http-header-size`][] CLI option.
    */
  val maxHeaderSize: scala.Double = js.native
  def createServer(): nodeLib.httpMod.Server = js.native
  def createServer(options: nodeLib.httpMod.ServerOptions): nodeLib.httpMod.Server = js.native
  def createServer(options: nodeLib.httpMod.ServerOptions, requestListener: nodeLib.httpMod.RequestListener): nodeLib.httpMod.Server = js.native
  def createServer(requestListener: nodeLib.httpMod.RequestListener): nodeLib.httpMod.Server = js.native
  def get(options: java.lang.String): nodeLib.httpMod.ClientRequest = js.native
  def get(
    options: java.lang.String,
    callback: js.Function1[/* res */ nodeLib.httpMod.IncomingMessage, scala.Unit]
  ): nodeLib.httpMod.ClientRequest = js.native
  def get(options: nodeLib.httpMod.RequestOptions): nodeLib.httpMod.ClientRequest = js.native
  def get(
    options: nodeLib.httpMod.RequestOptions,
    callback: js.Function1[/* res */ nodeLib.httpMod.IncomingMessage, scala.Unit]
  ): nodeLib.httpMod.ClientRequest = js.native
  def get(options: nodeLib.urlMod.URL): nodeLib.httpMod.ClientRequest = js.native
  def get(
    options: nodeLib.urlMod.URL,
    callback: js.Function1[/* res */ nodeLib.httpMod.IncomingMessage, scala.Unit]
  ): nodeLib.httpMod.ClientRequest = js.native
  def get(url: java.lang.String, options: nodeLib.httpMod.RequestOptions): nodeLib.httpMod.ClientRequest = js.native
  def get(
    url: java.lang.String,
    options: nodeLib.httpMod.RequestOptions,
    callback: js.Function1[/* res */ nodeLib.httpMod.IncomingMessage, scala.Unit]
  ): nodeLib.httpMod.ClientRequest = js.native
  def get(url: nodeLib.urlMod.URL, options: nodeLib.httpMod.RequestOptions): nodeLib.httpMod.ClientRequest = js.native
  def get(
    url: nodeLib.urlMod.URL,
    options: nodeLib.httpMod.RequestOptions,
    callback: js.Function1[/* res */ nodeLib.httpMod.IncomingMessage, scala.Unit]
  ): nodeLib.httpMod.ClientRequest = js.native
  def request(options: java.lang.String): nodeLib.httpMod.ClientRequest = js.native
  def request(
    options: java.lang.String,
    callback: js.Function1[/* res */ nodeLib.httpMod.IncomingMessage, scala.Unit]
  ): nodeLib.httpMod.ClientRequest = js.native
  def request(options: nodeLib.httpMod.RequestOptions): nodeLib.httpMod.ClientRequest = js.native
  def request(
    options: nodeLib.httpMod.RequestOptions,
    callback: js.Function1[/* res */ nodeLib.httpMod.IncomingMessage, scala.Unit]
  ): nodeLib.httpMod.ClientRequest = js.native
  def request(options: nodeLib.urlMod.URL): nodeLib.httpMod.ClientRequest = js.native
  def request(
    options: nodeLib.urlMod.URL,
    callback: js.Function1[/* res */ nodeLib.httpMod.IncomingMessage, scala.Unit]
  ): nodeLib.httpMod.ClientRequest = js.native
  def request(url: java.lang.String, options: nodeLib.httpMod.RequestOptions): nodeLib.httpMod.ClientRequest = js.native
  def request(
    url: java.lang.String,
    options: nodeLib.httpMod.RequestOptions,
    callback: js.Function1[/* res */ nodeLib.httpMod.IncomingMessage, scala.Unit]
  ): nodeLib.httpMod.ClientRequest = js.native
  def request(url: nodeLib.urlMod.URL, options: nodeLib.httpMod.RequestOptions): nodeLib.httpMod.ClientRequest = js.native
  def request(
    url: nodeLib.urlMod.URL,
    options: nodeLib.httpMod.RequestOptions,
    callback: js.Function1[/* res */ nodeLib.httpMod.IncomingMessage, scala.Unit]
  ): nodeLib.httpMod.ClientRequest = js.native
}


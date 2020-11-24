package typings.getUri.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.getUri.httpMod.HttpOrHttpsModule
import typings.node.httpMod.Agent
import typings.node.httpMod.ClientRequest
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.RequestListener
import typings.node.httpMod.RequestOptions
import typings.node.httpMod.Server
import typings.node.httpMod.ServerOptions
import typings.node.netMod.Socket
import typings.node.urlMod.URL_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofhttp extends HttpOrHttpsModule {
  
  var Agent: Instantiable0[typings.node.httpMod.Agent] = js.native
  
  // https://github.com/nodejs/node/blob/master/lib/_http_client.js#L77
  var ClientRequest: Instantiable1[/* url */ String, typings.node.httpMod.ClientRequest] = js.native
  
  var IncomingMessage: Instantiable1[/* socket */ Socket, typings.node.httpMod.IncomingMessage] = js.native
  
  val METHODS: js.Array[String] = js.native
  
  // https://github.com/nodejs/node/blob/master/lib/_http_outgoing.js
  var OutgoingMessage: Instantiable0[typings.node.httpMod.OutgoingMessage] = js.native
  
  val STATUS_CODES: StringDictionary[js.UndefOr[String]] with NumberDictionary[js.UndefOr[String]] = js.native
  
  var Server: Instantiable0[typings.node.httpMod.Server] = js.native
  
  // https://github.com/nodejs/node/blob/master/lib/_http_server.js#L108-L256
  var ServerResponse: Instantiable1[/* req */ IncomingMessage, typings.node.httpMod.ServerResponse] = js.native
  
  def createServer(): Server = js.native
  def createServer(options: ServerOptions): Server = js.native
  def createServer(options: ServerOptions, requestListener: RequestListener): Server = js.native
  def createServer(requestListener: RequestListener): Server = js.native
  
  def get(options: String): ClientRequest = js.native
  def get(options: String, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
  def get(options: RequestOptions): ClientRequest = js.native
  def get(options: RequestOptions, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
  def get(options: URL_): ClientRequest = js.native
  def get(options: URL_, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
  def get(url: String, options: RequestOptions): ClientRequest = js.native
  def get(url: String, options: RequestOptions, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
  def get(url: URL_, options: RequestOptions): ClientRequest = js.native
  def get(url: URL_, options: RequestOptions, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
  
  var globalAgent: Agent = js.native
  
  /**
    * Read-only property specifying the maximum allowed size of HTTP headers in bytes.
    * Defaults to 16KB. Configurable using the [`--max-http-header-size`][] CLI option.
    */
  val maxHeaderSize: Double = js.native
  
  def request(options: String): ClientRequest = js.native
  def request(options: String, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
  def request(options: RequestOptions): ClientRequest = js.native
  def request(options: RequestOptions, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
  def request(options: URL_): ClientRequest = js.native
  def request(options: URL_, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
  def request(url: String, options: RequestOptions): ClientRequest = js.native
  def request(url: String, options: RequestOptions, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
  def request(url: URL_, options: RequestOptions): ClientRequest = js.native
  def request(url: URL_, options: RequestOptions, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
}

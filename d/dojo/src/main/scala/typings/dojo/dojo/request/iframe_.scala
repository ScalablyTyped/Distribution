package typings.dojo.dojo.request

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/request/iframe.html
  *
  * Sends a request using an iframe element with the given URL and options.
  *
  * @param url URL to request
  * @param options       OptionalOptions for the request.
  */
@js.native
trait iframe_ extends js.Object {
  def apply(url: String): Unit = js.native
  def apply(url: String, options: typings.dojo.dojo.request.iframe.Options): Unit = js.native
  /**
    *
    * @param name
    * @param onloadstr
    * @param uri
    */
  def create(name: js.Any, onloadstr: js.Any, uri: js.Any): js.Any = js.native
  /**
    *
    * @param iframeNode
    */
  def doc(iframeNode: js.Any): js.Any = js.native
  /**
    * Send an HTTP GET request using an iframe element with the given URL and options.
    *
    * @param url URL to request
    * @param options               OptionalOptions for the request.
    */
  def get(url: String): Promise = js.native
  def get(url: String, options: typings.dojo.dojo.request.iframe.BaseOptions): Promise = js.native
  /**
    * Send an HTTP POST request using an iframe element with the given URL and options.
    *
    * @param url URL to request
    * @param options               OptionalOptions for the request.
    */
  def post(url: String): Promise = js.native
  def post(url: String, options: typings.dojo.dojo.request.iframe.BaseOptions): Promise = js.native
  /**
    *
    * @param _iframe
    * @param src
    * @param replace
    */
  def setSrc(_iframe: js.Any, src: js.Any, replace: js.Any): Unit = js.native
}


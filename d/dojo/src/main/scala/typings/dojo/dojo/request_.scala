package typings.dojo.dojo

import typings.dojo.dojo.request.BaseOptions
import typings.dojo.dojo.request.Options
import typings.dojo.dojo.request.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/request.html
  *
  * Send a request using the default transport for the current platform.
  *
  * @param url The URL to request.
  * @param options       OptionalOptions for the request.
  */
@js.native
trait request_ extends js.Object {
  def apply(url: String): Unit = js.native
  def apply(url: String, options: Options): Unit = js.native
  /**
    * Send an HTTP DELETE request using the default transport for the current platform.
    *
    * @param url URL to request
    * @param options               OptionalOptions for the request.
    */
  def del(url: String): Promise = js.native
  def del(url: String, options: BaseOptions): Promise = js.native
  /**
    * Send an HTTP GET request using the default transport for the current platform.
    *
    * @param url URL to request
    * @param options               OptionalOptions for the request.
    */
  def get(url: String): Promise = js.native
  def get(url: String, options: BaseOptions): Promise = js.native
  /**
    * Send an HTTP POST request using the default transport for the current platform.
    *
    * @param url URL to request
    * @param options               OptionalOptions for the request.
    */
  def post(url: String): js.Any = js.native
  def post(url: String, options: BaseOptions): js.Any = js.native
  /**
    * Send an HTTP POST request using the default transport for the current platform.
    *
    * @param url URL to request
    * @param options               OptionalOptions for the request.
    */
  def put(url: String): Promise = js.native
  def put(url: String, options: BaseOptions): Promise = js.native
}


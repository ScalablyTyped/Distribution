package typings.dojo.dojo

import typings.dojo.dojo.request.__BaseOptions
import typings.dojo.dojo.request.__Options
import typings.dojo.dojo.request.__Promise
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
@JSName("request")
@js.native
trait request_ extends js.Object {
  def apply(url: String): Unit = js.native
  def apply(url: String, options: __Options): Unit = js.native
  /**
    * Send an HTTP DELETE request using the default transport for the current platform.
    *
    * @param url URL to request
    * @param options               OptionalOptions for the request.
    */
  def del(url: String): __Promise = js.native
  def del(url: String, options: __BaseOptions): __Promise = js.native
  /**
    * Send an HTTP GET request using the default transport for the current platform.
    *
    * @param url URL to request
    * @param options               OptionalOptions for the request.
    */
  def get(url: String): __Promise = js.native
  def get(url: String, options: __BaseOptions): __Promise = js.native
  /**
    * Send an HTTP POST request using the default transport for the current platform.
    *
    * @param url URL to request
    * @param options               OptionalOptions for the request.
    */
  def post(url: String): js.Any = js.native
  def post(url: String, options: __BaseOptions): js.Any = js.native
  /**
    * Send an HTTP POST request using the default transport for the current platform.
    *
    * @param url URL to request
    * @param options               OptionalOptions for the request.
    */
  def put(url: String): __Promise = js.native
  def put(url: String, options: __BaseOptions): __Promise = js.native
}


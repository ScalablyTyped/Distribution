package typings.dojo.dojo.request

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/request/xhr.html
  *
  * Sends a request using XMLHttpRequest with the given URL and options.
  *
  * @param url URL to request
  * @param options       OptionalOptions for the request.
  */
@js.native
trait xhr_ extends js.Object {
  def apply(url: String): Promise = js.native
  def apply(url: String, options: typings.dojo.dojo.request.xhr.Options): Promise = js.native
  /**
    * Send an HTTP DELETE request using XMLHttpRequest with the given URL and options.
    *
    * @param url URL to request
    * @param options               OptionalOptions for the request.
    */
  def del(url: String): Promise = js.native
  def del(url: String, options: typings.dojo.dojo.request.xhr.BaseOptions): Promise = js.native
  /**
    * Send an HTTP GET request using XMLHttpRequest with the given URL and options.
    *
    * @param url URL to request
    * @param options               OptionalOptions for the request.
    */
  def get(url: String): Promise = js.native
  def get(url: String, options: typings.dojo.dojo.request.xhr.BaseOptions): Promise = js.native
  /**
    * Send an HTTP POST request using XMLHttpRequest with the given URL and options.
    *
    * @param url URL to request
    * @param options               OptionalOptions for the request.
    */
  def post(url: String): Promise = js.native
  def post(url: String, options: typings.dojo.dojo.request.xhr.BaseOptions): Promise = js.native
  /**
    * Send an HTTP PUT request using XMLHttpRequest with the given URL and options.
    *
    * @param url URL to request
    * @param options               OptionalOptions for the request.
    */
  def put(url: String): Promise = js.native
  def put(url: String, options: typings.dojo.dojo.request.xhr.BaseOptions): Promise = js.native
}


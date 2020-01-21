package typings.dojo.dojo.request

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/request/script.html
  *
  * Sends a request using a script element with the given URL and options.
  *
  * @param url URL to request
  * @param options       OptionalOptions for the request.
  */
@js.native
trait script_ extends js.Object {
  def apply(url: String): Unit = js.native
  def apply(url: String, options: typings.dojo.dojo.request.script.Options): Unit = js.native
  /**
    * Send an HTTP GET request using a script element with the given URL and options.
    *
    * @param url URL to request
    * @param options               OptionalOptions for the request.
    */
  def get(url: String): Promise = js.native
  def get(url: String, options: typings.dojo.dojo.request.script.BaseOptions): Promise = js.native
}


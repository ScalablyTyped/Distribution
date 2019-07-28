package typings.gapiDotClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Body extends js.Object {
  /**
    * The HTTP request body (applies to PUT or POST).
    */
  var body: js.UndefOr[js.Any] = js.undefined
  /**
    * Additional HTTP request headers
    */
  var headers: js.UndefOr[js.Any] = js.undefined
  /**
    * The HTTP request method to use. Default is GET
    */
  var method: js.UndefOr[String] = js.undefined
  /**
    * URL params in key-value pair form
    */
  var params: js.UndefOr[js.Any] = js.undefined
  /**
    * The URL to handle the request
    */
  var path: String
}

object Anon_Body {
  @scala.inline
  def apply(
    path: String,
    body: js.Any = null,
    headers: js.Any = null,
    method: String = null,
    params: js.Any = null
  ): Anon_Body = {
    val __obj = js.Dynamic.literal(path = path)
    if (body != null) __obj.updateDynamic("body")(body)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (method != null) __obj.updateDynamic("method")(method)
    if (params != null) __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[Anon_Body]
  }
}


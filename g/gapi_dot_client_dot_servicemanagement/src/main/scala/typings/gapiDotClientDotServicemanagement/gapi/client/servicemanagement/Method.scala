package typings.gapiDotClientDotServicemanagement.gapi.client.servicemanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Method extends js.Object {
  /** The simple name of this method. */
  var name: js.UndefOr[String] = js.undefined
  /** Any metadata attached to the method. */
  var options: js.UndefOr[js.Array[Option]] = js.undefined
  /** If true, the request is streamed. */
  var requestStreaming: js.UndefOr[Boolean] = js.undefined
  /** A URL of the input message type. */
  var requestTypeUrl: js.UndefOr[String] = js.undefined
  /** If true, the response is streamed. */
  var responseStreaming: js.UndefOr[Boolean] = js.undefined
  /** The URL of the output message type. */
  var responseTypeUrl: js.UndefOr[String] = js.undefined
  /** The source syntax of this method. */
  var syntax: js.UndefOr[String] = js.undefined
}

object Method {
  @scala.inline
  def apply(
    name: String = null,
    options: js.Array[Option] = null,
    requestStreaming: js.UndefOr[Boolean] = js.undefined,
    requestTypeUrl: String = null,
    responseStreaming: js.UndefOr[Boolean] = js.undefined,
    responseTypeUrl: String = null,
    syntax: String = null
  ): Method = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (options != null) __obj.updateDynamic("options")(options)
    if (!js.isUndefined(requestStreaming)) __obj.updateDynamic("requestStreaming")(requestStreaming)
    if (requestTypeUrl != null) __obj.updateDynamic("requestTypeUrl")(requestTypeUrl)
    if (!js.isUndefined(responseStreaming)) __obj.updateDynamic("responseStreaming")(responseStreaming)
    if (responseTypeUrl != null) __obj.updateDynamic("responseTypeUrl")(responseTypeUrl)
    if (syntax != null) __obj.updateDynamic("syntax")(syntax)
    __obj.asInstanceOf[Method]
  }
}


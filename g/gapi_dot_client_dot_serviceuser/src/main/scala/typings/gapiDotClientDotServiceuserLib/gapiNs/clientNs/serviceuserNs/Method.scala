package typings
package gapiDotClientDotServiceuserLib.gapiNs.clientNs.serviceuserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Method extends js.Object {
  /** The simple name of this method. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Any metadata attached to the method. */
  var options: js.UndefOr[js.Array[Option]] = js.undefined
  /** If true, the request is streamed. */
  var requestStreaming: js.UndefOr[scala.Boolean] = js.undefined
  /** A URL of the input message type. */
  var requestTypeUrl: js.UndefOr[java.lang.String] = js.undefined
  /** If true, the response is streamed. */
  var responseStreaming: js.UndefOr[scala.Boolean] = js.undefined
  /** The URL of the output message type. */
  var responseTypeUrl: js.UndefOr[java.lang.String] = js.undefined
  /** The source syntax of this method. */
  var syntax: js.UndefOr[java.lang.String] = js.undefined
}

object Method {
  @scala.inline
  def apply(
    name: java.lang.String = null,
    options: js.Array[Option] = null,
    requestStreaming: js.UndefOr[scala.Boolean] = js.undefined,
    requestTypeUrl: java.lang.String = null,
    responseStreaming: js.UndefOr[scala.Boolean] = js.undefined,
    responseTypeUrl: java.lang.String = null,
    syntax: java.lang.String = null
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


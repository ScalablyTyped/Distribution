package typings.googleapis.buildSrcApisServicenetworkingV1Mod.servicenetworking_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Method represents a method of an API interface.
  */
@js.native
trait Schema$Method extends js.Object {
  /**
    * The simple name of this method.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Any metadata attached to the method.
    */
  var options: js.UndefOr[js.Array[Schema$Option]] = js.native
  /**
    * If true, the request is streamed.
    */
  var requestStreaming: js.UndefOr[Boolean] = js.native
  /**
    * A URL of the input message type.
    */
  var requestTypeUrl: js.UndefOr[String] = js.native
  /**
    * If true, the response is streamed.
    */
  var responseStreaming: js.UndefOr[Boolean] = js.native
  /**
    * The URL of the output message type.
    */
  var responseTypeUrl: js.UndefOr[String] = js.native
  /**
    * The source syntax of this method.
    */
  var syntax: js.UndefOr[String] = js.native
}

object Schema$Method {
  @scala.inline
  def apply(
    name: String = null,
    options: js.Array[Schema$Option] = null,
    requestStreaming: js.UndefOr[Boolean] = js.undefined,
    requestTypeUrl: String = null,
    responseStreaming: js.UndefOr[Boolean] = js.undefined,
    responseTypeUrl: String = null,
    syntax: String = null
  ): Schema$Method = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (!js.isUndefined(requestStreaming)) __obj.updateDynamic("requestStreaming")(requestStreaming.asInstanceOf[js.Any])
    if (requestTypeUrl != null) __obj.updateDynamic("requestTypeUrl")(requestTypeUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(responseStreaming)) __obj.updateDynamic("responseStreaming")(responseStreaming.asInstanceOf[js.Any])
    if (responseTypeUrl != null) __obj.updateDynamic("responseTypeUrl")(responseTypeUrl.asInstanceOf[js.Any])
    if (syntax != null) __obj.updateDynamic("syntax")(syntax.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Method]
  }
}


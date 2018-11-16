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


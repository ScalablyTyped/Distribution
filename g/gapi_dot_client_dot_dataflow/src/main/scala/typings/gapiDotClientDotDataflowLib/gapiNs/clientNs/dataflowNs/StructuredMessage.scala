package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StructuredMessage extends js.Object {
  /**
    * Idenfier for this message type.  Used by external systems to
    * internationalize or personalize message.
    */
  var messageKey: js.UndefOr[java.lang.String] = js.undefined
  /** Human-readable version of message. */
  var messageText: js.UndefOr[java.lang.String] = js.undefined
  /** The structured data associated with this message. */
  var parameters: js.UndefOr[js.Array[Parameter]] = js.undefined
}


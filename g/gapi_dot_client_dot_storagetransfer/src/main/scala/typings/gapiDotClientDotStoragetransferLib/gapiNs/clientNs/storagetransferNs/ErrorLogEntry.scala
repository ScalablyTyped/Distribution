package typings
package gapiDotClientDotStoragetransferLib.gapiNs.clientNs.storagetransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ErrorLogEntry extends js.Object {
  /** A list of messages that carry the error details. */
  var errorDetails: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
               * A URL that refers to the target (a data source, a data sink,
               * or an object) with which the error is associated.
               * Required.
               */
  var url: js.UndefOr[java.lang.String] = js.undefined
}


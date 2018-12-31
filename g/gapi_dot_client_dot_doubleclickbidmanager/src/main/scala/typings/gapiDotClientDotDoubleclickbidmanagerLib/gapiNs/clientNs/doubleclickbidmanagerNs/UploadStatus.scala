package typings
package gapiDotClientDotDoubleclickbidmanagerLib.gapiNs.clientNs.doubleclickbidmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadStatus extends js.Object {
  /** Reasons why upload can't be completed. */
  var errors: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Per-row upload status. */
  var rowStatus: js.UndefOr[js.Array[RowStatus]] = js.undefined
}


package typings
package gapiDotClientDotToolresultsLib.gapiNs.clientNs.toolresultsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackTrace extends js.Object {
  /** Exception cluster ID */
  var clusterId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The stack trace message.
    *
    * Required
    */
  var exception: js.UndefOr[java.lang.String] = js.undefined
  /** Exception report ID */
  var reportId: js.UndefOr[java.lang.String] = js.undefined
}

object StackTrace {
  @scala.inline
  def apply(
    clusterId: java.lang.String = null,
    exception: java.lang.String = null,
    reportId: java.lang.String = null
  ): StackTrace = {
    val __obj = js.Dynamic.literal()
    if (clusterId != null) __obj.updateDynamic("clusterId")(clusterId)
    if (exception != null) __obj.updateDynamic("exception")(exception)
    if (reportId != null) __obj.updateDynamic("reportId")(reportId)
    __obj.asInstanceOf[StackTrace]
  }
}


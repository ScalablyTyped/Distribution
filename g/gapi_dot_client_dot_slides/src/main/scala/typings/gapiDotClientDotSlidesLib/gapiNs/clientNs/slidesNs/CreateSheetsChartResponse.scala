package typings
package gapiDotClientDotSlidesLib.gapiNs.clientNs.slidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateSheetsChartResponse extends js.Object {
  /** The object ID of the created chart. */
  var objectId: js.UndefOr[java.lang.String] = js.undefined
}

object CreateSheetsChartResponse {
  @scala.inline
  def apply(objectId: java.lang.String = null): CreateSheetsChartResponse = {
    val __obj = js.Dynamic.literal()
    if (objectId != null) __obj.updateDynamic("objectId")(objectId)
    __obj.asInstanceOf[CreateSheetsChartResponse]
  }
}


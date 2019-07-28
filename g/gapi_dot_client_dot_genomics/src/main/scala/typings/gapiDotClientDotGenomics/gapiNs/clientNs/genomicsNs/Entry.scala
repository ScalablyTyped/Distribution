package typings.gapiDotClientDotGenomics.gapiNs.clientNs.genomicsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Entry extends js.Object {
  /** The created annotation, if creation was successful. */
  var annotation: js.UndefOr[Annotation] = js.undefined
  /** The creation status. */
  var status: js.UndefOr[Status] = js.undefined
}

object Entry {
  @scala.inline
  def apply(annotation: Annotation = null, status: Status = null): Entry = {
    val __obj = js.Dynamic.literal()
    if (annotation != null) __obj.updateDynamic("annotation")(annotation)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[Entry]
  }
}


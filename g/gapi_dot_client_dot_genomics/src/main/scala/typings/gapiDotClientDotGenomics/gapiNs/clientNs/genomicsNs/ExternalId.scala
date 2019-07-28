package typings.gapiDotClientDotGenomics.gapiNs.clientNs.genomicsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExternalId extends js.Object {
  /** The id used by the source of this data. */
  var id: js.UndefOr[String] = js.undefined
  /** The name of the source of this data. */
  var sourceName: js.UndefOr[String] = js.undefined
}

object ExternalId {
  @scala.inline
  def apply(id: String = null, sourceName: String = null): ExternalId = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (sourceName != null) __obj.updateDynamic("sourceName")(sourceName)
    __obj.asInstanceOf[ExternalId]
  }
}


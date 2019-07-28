package typings.gapiDotClientDotAdmin.gapiNs.clientNs.adminNs

import typings.gapiDotClientDotAdmin.Anon_BoolValueDatetimeValue
import typings.gapiDotClientDotAdmin.Anon_CustomerId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsageReport extends js.Object {
  /** The date to which the record belongs. */
  var date: js.UndefOr[String] = js.undefined
  /** Information about the type of the item. */
  var entity: js.UndefOr[Anon_CustomerId] = js.undefined
  /** ETag of the resource. */
  var etag: js.UndefOr[String] = js.undefined
  /** The kind of object. */
  var kind: js.UndefOr[String] = js.undefined
  /** Parameter value pairs for various applications. */
  var parameters: js.UndefOr[js.Array[Anon_BoolValueDatetimeValue]] = js.undefined
}

object UsageReport {
  @scala.inline
  def apply(
    date: String = null,
    entity: Anon_CustomerId = null,
    etag: String = null,
    kind: String = null,
    parameters: js.Array[Anon_BoolValueDatetimeValue] = null
  ): UsageReport = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date)
    if (entity != null) __obj.updateDynamic("entity")(entity)
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (parameters != null) __obj.updateDynamic("parameters")(parameters)
    __obj.asInstanceOf[UsageReport]
  }
}


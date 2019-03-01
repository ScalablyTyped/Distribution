package typings
package gapiDotClientDotAdminLib.gapiNs.clientNs.adminNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsageReport extends js.Object {
  /** The date to which the record belongs. */
  var date: js.UndefOr[java.lang.String] = js.undefined
  /** Information about the type of the item. */
  var entity: js.UndefOr[gapiDotClientDotAdminLib.Anon_CustomerId] = js.undefined
  /** ETag of the resource. */
  var etag: js.UndefOr[java.lang.String] = js.undefined
  /** The kind of object. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Parameter value pairs for various applications. */
  var parameters: js.UndefOr[js.Array[gapiDotClientDotAdminLib.Anon_BoolValueDatetimeValue]] = js.undefined
}

object UsageReport {
  @scala.inline
  def apply(
    date: java.lang.String = null,
    entity: gapiDotClientDotAdminLib.Anon_CustomerId = null,
    etag: java.lang.String = null,
    kind: java.lang.String = null,
    parameters: js.Array[gapiDotClientDotAdminLib.Anon_BoolValueDatetimeValue] = null
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


package typings
package gapiDotClientDotDoubleclickbidmanagerLib.gapiNs.clientNs.doubleclickbidmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowStatus extends js.Object {
  /** Whether the stored entity is changed as a result of upload. */
  var changed: js.UndefOr[scala.Boolean] = js.undefined
  /** Entity Id. */
  var entityId: js.UndefOr[java.lang.String] = js.undefined
  /** Entity name. */
  var entityName: js.UndefOr[java.lang.String] = js.undefined
  /** Reasons why the entity can't be uploaded. */
  var errors: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Whether the entity is persisted. */
  var persisted: js.UndefOr[scala.Boolean] = js.undefined
  /** Row number. */
  var rowNumber: js.UndefOr[scala.Double] = js.undefined
}

object RowStatus {
  @scala.inline
  def apply(
    changed: js.UndefOr[scala.Boolean] = js.undefined,
    entityId: java.lang.String = null,
    entityName: java.lang.String = null,
    errors: js.Array[java.lang.String] = null,
    persisted: js.UndefOr[scala.Boolean] = js.undefined,
    rowNumber: scala.Int | scala.Double = null
  ): RowStatus = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(changed)) __obj.updateDynamic("changed")(changed)
    if (entityId != null) __obj.updateDynamic("entityId")(entityId)
    if (entityName != null) __obj.updateDynamic("entityName")(entityName)
    if (errors != null) __obj.updateDynamic("errors")(errors)
    if (!js.isUndefined(persisted)) __obj.updateDynamic("persisted")(persisted)
    if (rowNumber != null) __obj.updateDynamic("rowNumber")(rowNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowStatus]
  }
}


package typings.gapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowStatus extends js.Object {
  /** Whether the stored entity is changed as a result of upload. */
  var changed: js.UndefOr[Boolean] = js.undefined
  /** Entity Id. */
  var entityId: js.UndefOr[String] = js.undefined
  /** Entity name. */
  var entityName: js.UndefOr[String] = js.undefined
  /** Reasons why the entity can't be uploaded. */
  var errors: js.UndefOr[js.Array[String]] = js.undefined
  /** Whether the entity is persisted. */
  var persisted: js.UndefOr[Boolean] = js.undefined
  /** Row number. */
  var rowNumber: js.UndefOr[Double] = js.undefined
}

object RowStatus {
  @scala.inline
  def apply(
    changed: js.UndefOr[Boolean] = js.undefined,
    entityId: String = null,
    entityName: String = null,
    errors: js.Array[String] = null,
    persisted: js.UndefOr[Boolean] = js.undefined,
    rowNumber: js.UndefOr[Double] = js.undefined
  ): RowStatus = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(changed)) __obj.updateDynamic("changed")(changed.get.asInstanceOf[js.Any])
    if (entityId != null) __obj.updateDynamic("entityId")(entityId.asInstanceOf[js.Any])
    if (entityName != null) __obj.updateDynamic("entityName")(entityName.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (!js.isUndefined(persisted)) __obj.updateDynamic("persisted")(persisted.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rowNumber)) __obj.updateDynamic("rowNumber")(rowNumber.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowStatus]
  }
}


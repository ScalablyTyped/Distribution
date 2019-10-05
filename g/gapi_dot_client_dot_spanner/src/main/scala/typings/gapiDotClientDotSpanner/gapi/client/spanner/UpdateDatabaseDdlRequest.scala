package typings.gapiDotClientDotSpanner.gapi.client.spanner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateDatabaseDdlRequest extends js.Object {
  /**
    * If empty, the new update request is assigned an
    * automatically-generated operation ID. Otherwise, `operation_id`
    * is used to construct the name of the resulting
    * Operation.
    *
    * Specifying an explicit operation ID simplifies determining
    * whether the statements were executed in the event that the
    * UpdateDatabaseDdl call is replayed,
    * or the return value is otherwise lost: the database and
    * `operation_id` fields can be combined to form the
    * name of the resulting
    * longrunning.Operation: `<database>/operations/<operation_id>`.
    *
    * `operation_id` should be unique within the database, and must be
    * a valid identifier: `a-z&#42;`. Note that
    * automatically-generated operation IDs always begin with an
    * underscore. If the named operation already exists,
    * UpdateDatabaseDdl returns
    * `ALREADY_EXISTS`.
    */
  var operationId: js.UndefOr[String] = js.undefined
  /** DDL statements to be applied to the database. */
  var statements: js.UndefOr[js.Array[String]] = js.undefined
}

object UpdateDatabaseDdlRequest {
  @scala.inline
  def apply(operationId: String = null, statements: js.Array[String] = null): UpdateDatabaseDdlRequest = {
    val __obj = js.Dynamic.literal()
    if (operationId != null) __obj.updateDynamic("operationId")(operationId)
    if (statements != null) __obj.updateDynamic("statements")(statements)
    __obj.asInstanceOf[UpdateDatabaseDdlRequest]
  }
}


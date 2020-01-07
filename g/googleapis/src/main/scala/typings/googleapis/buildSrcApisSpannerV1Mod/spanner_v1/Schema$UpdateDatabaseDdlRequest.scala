package typings.googleapis.buildSrcApisSpannerV1Mod.spanner_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Enqueues the given DDL statements to be applied, in order but not
  * necessarily all at once, to the database schema at some point (or points)
  * in the future. The server checks that the statements are executable
  * (syntactically valid, name tables that exist, etc.) before enqueueing them,
  * but they may still fail upon later execution (e.g., if a statement from
  * another batch of statements is applied first and it conflicts in some way,
  * or if there is some data-related problem like a `NULL` value in a column to
  * which `NOT NULL` would be added). If a statement fails, all subsequent
  * statements in the batch are automatically cancelled.  Each batch of
  * statements is assigned a name which can be used with the Operations API to
  * monitor progress. See the operation_id field for more details.
  */
@js.native
trait Schema$UpdateDatabaseDdlRequest extends js.Object {
  /**
    * If empty, the new update request is assigned an automatically-generated
    * operation ID. Otherwise, `operation_id` is used to construct the name of
    * the resulting Operation.  Specifying an explicit operation ID simplifies
    * determining whether the statements were executed in the event that the
    * UpdateDatabaseDdl call is replayed, or the return value is otherwise
    * lost: the database and `operation_id` fields can be combined to form the
    * name of the resulting longrunning.Operation:
    * `&lt;database&gt;/operations/&lt;operation_id&gt;`.  `operation_id`
    * should be unique within the database, and must be a valid identifier:
    * `a-z*`. Note that automatically-generated operation IDs always begin with
    * an underscore. If the named operation already exists, UpdateDatabaseDdl
    * returns `ALREADY_EXISTS`.
    */
  var operationId: js.UndefOr[String] = js.native
  /**
    * DDL statements to be applied to the database.
    */
  var statements: js.UndefOr[js.Array[String]] = js.native
}

object Schema$UpdateDatabaseDdlRequest {
  @scala.inline
  def apply(operationId: String = null, statements: js.Array[String] = null): Schema$UpdateDatabaseDdlRequest = {
    val __obj = js.Dynamic.literal()
    if (operationId != null) __obj.updateDynamic("operationId")(operationId.asInstanceOf[js.Any])
    if (statements != null) __obj.updateDynamic("statements")(statements.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UpdateDatabaseDdlRequest]
  }
}


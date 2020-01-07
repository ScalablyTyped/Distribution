package typings.googleapis.buildSrcApisDatastoreV1beta3Mod.datastore_v1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A binding parameter for a GQL query.
  */
@js.native
trait Schema$GqlQueryParameter extends js.Object {
  /**
    * A query cursor. Query cursors are returned in query result batches.
    */
  var cursor: js.UndefOr[String] = js.native
  /**
    * A value parameter.
    */
  var value: js.UndefOr[Schema$Value] = js.native
}

object Schema$GqlQueryParameter {
  @scala.inline
  def apply(cursor: String = null, value: Schema$Value = null): Schema$GqlQueryParameter = {
    val __obj = js.Dynamic.literal()
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GqlQueryParameter]
  }
}


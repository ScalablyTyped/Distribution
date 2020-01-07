package typings.googleapis.buildSrcApisSpannerV1Mod.spanner_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Cloud Spanner database.
  */
@js.native
trait Schema$Database extends js.Object {
  /**
    * Required. The name of the database. Values are of the form
    * `projects/&lt;project&gt;/instances/&lt;instance&gt;/databases/&lt;database&gt;`,
    * where `&lt;database&gt;` is as specified in the `CREATE DATABASE`
    * statement. This name can be passed to other API methods to identify the
    * database.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Output only. The current database state.
    */
  var state: js.UndefOr[String] = js.native
}

object Schema$Database {
  @scala.inline
  def apply(name: String = null, state: String = null): Schema$Database = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Database]
  }
}


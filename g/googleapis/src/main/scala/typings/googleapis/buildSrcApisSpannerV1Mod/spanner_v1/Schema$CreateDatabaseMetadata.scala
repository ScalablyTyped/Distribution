package typings.googleapis.buildSrcApisSpannerV1Mod.spanner_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata type for the operation returned by CreateDatabase.
  */
@js.native
trait Schema$CreateDatabaseMetadata extends js.Object {
  /**
    * The database being created.
    */
  var database: js.UndefOr[String] = js.native
}

object Schema$CreateDatabaseMetadata {
  @scala.inline
  def apply(database: String = null): Schema$CreateDatabaseMetadata = {
    val __obj = js.Dynamic.literal()
    if (database != null) __obj.updateDynamic("database")(database.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CreateDatabaseMetadata]
  }
}


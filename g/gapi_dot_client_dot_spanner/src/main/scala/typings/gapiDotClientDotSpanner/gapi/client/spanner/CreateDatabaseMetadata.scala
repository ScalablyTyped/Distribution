package typings.gapiDotClientDotSpanner.gapi.client.spanner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDatabaseMetadata extends js.Object {
  /** The database being created. */
  var database: js.UndefOr[String] = js.undefined
}

object CreateDatabaseMetadata {
  @scala.inline
  def apply(database: String = null): CreateDatabaseMetadata = {
    val __obj = js.Dynamic.literal()
    if (database != null) __obj.updateDynamic("database")(database.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDatabaseMetadata]
  }
}


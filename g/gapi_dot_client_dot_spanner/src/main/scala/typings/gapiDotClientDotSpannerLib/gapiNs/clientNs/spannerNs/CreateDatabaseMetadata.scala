package typings
package gapiDotClientDotSpannerLib.gapiNs.clientNs.spannerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDatabaseMetadata extends js.Object {
  /** The database being created. */
  var database: js.UndefOr[java.lang.String] = js.undefined
}

object CreateDatabaseMetadata {
  @scala.inline
  def apply(database: java.lang.String = null): CreateDatabaseMetadata = {
    val __obj = js.Dynamic.literal()
    if (database != null) __obj.updateDynamic("database")(database)
    __obj.asInstanceOf[CreateDatabaseMetadata]
  }
}


package typings.googleCloudSpanner.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Create a Table object to interact with a table in a Cloud Spanner
  * database.
  *
  * @class
  *
  * @param {Database} database {@link Database} instance.
  * @param {string} name Name of the table.
  *
  * @example
  * ```
  * const {Spanner} = require('@google-cloud/spanner');
  * const spanner = new Spanner();
  *
  * const instance = spanner.instance('my-instance');
  * const database = instance.database('my-database');
  * const table = database.table('my-table');
  * ```
  */
@JSImport("@google-cloud/spanner", "Table")
@js.native
open class Table protected ()
  extends typings.googleCloudSpanner.buildSrcTableMod.Table {
  def this(database: typings.googleCloudSpanner.buildSrcDatabaseMod.Database, name: String) = this()
}

package typings
package gapiDotClientDotSqladminLib.gapiNs.clientNs.sqladminNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportContext extends js.Object {
  /** Options for exporting data as CSV. */
  var csvExportOptions: js.UndefOr[gapiDotClientDotSqladminLib.Anon_SelectQuery] = js.undefined
  /**
    * Databases (for example, guestbook) from which the export is made. If fileType is SQL and no database is specified, all databases are exported. If
    * fileType is CSV, you can optionally specify at most one database to export. If csvExportOptions.selectQuery also specifies the database, this field
    * will be ignored.
    */
  var databases: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The file type for the specified uri.
    * SQL: The file contains SQL statements.
    * CSV: The file contains CSV data.
    */
  var fileType: js.UndefOr[java.lang.String] = js.undefined
  /** This is always sql#exportContext. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Options for exporting data as SQL statements. */
  var sqlExportOptions: js.UndefOr[gapiDotClientDotSqladminLib.Anon_Tables] = js.undefined
  /**
    * The path to the file in Google Cloud Storage where the export will be stored. The URI is in the form gs://bucketName/fileName. If the file already
    * exists, the operation fails. If fileType is SQL and the filename ends with .gz, the contents are compressed.
    */
  var uri: js.UndefOr[java.lang.String] = js.undefined
}


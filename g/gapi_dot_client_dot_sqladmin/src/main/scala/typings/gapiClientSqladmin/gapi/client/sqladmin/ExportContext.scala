package typings.gapiClientSqladmin.gapi.client.sqladmin

import typings.gapiClientSqladmin.anon.SchemaOnly
import typings.gapiClientSqladmin.anon.SelectQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportContext extends js.Object {
  /** Options for exporting data as CSV. */
  var csvExportOptions: js.UndefOr[SelectQuery] = js.undefined
  /**
    * Databases (for example, guestbook) from which the export is made. If fileType is SQL and no database is specified, all databases are exported. If
    * fileType is CSV, you can optionally specify at most one database to export. If csvExportOptions.selectQuery also specifies the database, this field
    * will be ignored.
    */
  var databases: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The file type for the specified uri.
    * SQL: The file contains SQL statements.
    * CSV: The file contains CSV data.
    */
  var fileType: js.UndefOr[String] = js.undefined
  /** This is always sql#exportContext. */
  var kind: js.UndefOr[String] = js.undefined
  /** Options for exporting data as SQL statements. */
  var sqlExportOptions: js.UndefOr[SchemaOnly] = js.undefined
  /**
    * The path to the file in Google Cloud Storage where the export will be stored. The URI is in the form gs://bucketName/fileName. If the file already
    * exists, the operation fails. If fileType is SQL and the filename ends with .gz, the contents are compressed.
    */
  var uri: js.UndefOr[String] = js.undefined
}

object ExportContext {
  @scala.inline
  def apply(
    csvExportOptions: SelectQuery = null,
    databases: js.Array[String] = null,
    fileType: String = null,
    kind: String = null,
    sqlExportOptions: SchemaOnly = null,
    uri: String = null
  ): ExportContext = {
    val __obj = js.Dynamic.literal()
    if (csvExportOptions != null) __obj.updateDynamic("csvExportOptions")(csvExportOptions.asInstanceOf[js.Any])
    if (databases != null) __obj.updateDynamic("databases")(databases.asInstanceOf[js.Any])
    if (fileType != null) __obj.updateDynamic("fileType")(fileType.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (sqlExportOptions != null) __obj.updateDynamic("sqlExportOptions")(sqlExportOptions.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportContext]
  }
}


package typings.gapiClientSqladmin.gapi.client.sqladmin

import typings.gapiClientSqladmin.anon.SchemaOnly
import typings.gapiClientSqladmin.anon.SelectQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportContext extends js.Object {
  /** Options for exporting data as CSV. */
  var csvExportOptions: js.UndefOr[SelectQuery] = js.native
  /**
    * Databases (for example, guestbook) from which the export is made. If fileType is SQL and no database is specified, all databases are exported. If
    * fileType is CSV, you can optionally specify at most one database to export. If csvExportOptions.selectQuery also specifies the database, this field
    * will be ignored.
    */
  var databases: js.UndefOr[js.Array[String]] = js.native
  /**
    * The file type for the specified uri.
    * SQL: The file contains SQL statements.
    * CSV: The file contains CSV data.
    */
  var fileType: js.UndefOr[String] = js.native
  /** This is always sql#exportContext. */
  var kind: js.UndefOr[String] = js.native
  /** Options for exporting data as SQL statements. */
  var sqlExportOptions: js.UndefOr[SchemaOnly] = js.native
  /**
    * The path to the file in Google Cloud Storage where the export will be stored. The URI is in the form gs://bucketName/fileName. If the file already
    * exists, the operation fails. If fileType is SQL and the filename ends with .gz, the contents are compressed.
    */
  var uri: js.UndefOr[String] = js.native
}

object ExportContext {
  @scala.inline
  def apply(): ExportContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportContext]
  }
  @scala.inline
  implicit class ExportContextOps[Self <: ExportContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCsvExportOptions(value: SelectQuery): Self = this.set("csvExportOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCsvExportOptions: Self = this.set("csvExportOptions", js.undefined)
    @scala.inline
    def setDatabasesVarargs(value: String*): Self = this.set("databases", js.Array(value :_*))
    @scala.inline
    def setDatabases(value: js.Array[String]): Self = this.set("databases", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatabases: Self = this.set("databases", js.undefined)
    @scala.inline
    def setFileType(value: String): Self = this.set("fileType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileType: Self = this.set("fileType", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setSqlExportOptions(value: SchemaOnly): Self = this.set("sqlExportOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSqlExportOptions: Self = this.set("sqlExportOptions", js.undefined)
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
  }
  
}


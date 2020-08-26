package typings.gapiClientSqladmin.gapi.client.sqladmin

import typings.gapiClientSqladmin.anon.Columns
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportContext extends js.Object {
  /** Options for importing data as CSV. */
  var csvImportOptions: js.UndefOr[Columns] = js.native
  /**
    * The database (for example, guestbook) to which the import is made. If fileType is SQL and no database is specified, it is assumed that the database is
    * specified in the file to be imported. If fileType is CSV, it must be specified.
    */
  var database: js.UndefOr[String] = js.native
  /**
    * The file type for the specified uri.
    * SQL: The file contains SQL statements.
    * CSV: The file contains CSV data.
    */
  var fileType: js.UndefOr[String] = js.native
  /** The PostgreSQL user for this import operation. Defaults to cloudsqlsuperuser. Used only for PostgreSQL instances. */
  var importUser: js.UndefOr[String] = js.native
  /** This is always sql#importContext. */
  var kind: js.UndefOr[String] = js.native
  /**
    * A path to the file in Google Cloud Storage from which the import is made. The URI is in the form gs://bucketName/fileName. Compressed gzip files (.gz)
    * are supported when fileType is SQL.
    */
  var uri: js.UndefOr[String] = js.native
}

object ImportContext {
  @scala.inline
  def apply(): ImportContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportContext]
  }
  @scala.inline
  implicit class ImportContextOps[Self <: ImportContext] (val x: Self) extends AnyVal {
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
    def setCsvImportOptions(value: Columns): Self = this.set("csvImportOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCsvImportOptions: Self = this.set("csvImportOptions", js.undefined)
    @scala.inline
    def setDatabase(value: String): Self = this.set("database", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatabase: Self = this.set("database", js.undefined)
    @scala.inline
    def setFileType(value: String): Self = this.set("fileType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileType: Self = this.set("fileType", js.undefined)
    @scala.inline
    def setImportUser(value: String): Self = this.set("importUser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImportUser: Self = this.set("importUser", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
  }
  
}


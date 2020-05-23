package typings.gapiClientSqladmin.gapi.client.sqladmin

import typings.gapiClientSqladmin.anon.Columns
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportContext extends js.Object {
  /** Options for importing data as CSV. */
  var csvImportOptions: js.UndefOr[Columns] = js.undefined
  /**
    * The database (for example, guestbook) to which the import is made. If fileType is SQL and no database is specified, it is assumed that the database is
    * specified in the file to be imported. If fileType is CSV, it must be specified.
    */
  var database: js.UndefOr[String] = js.undefined
  /**
    * The file type for the specified uri.
    * SQL: The file contains SQL statements.
    * CSV: The file contains CSV data.
    */
  var fileType: js.UndefOr[String] = js.undefined
  /** The PostgreSQL user for this import operation. Defaults to cloudsqlsuperuser. Used only for PostgreSQL instances. */
  var importUser: js.UndefOr[String] = js.undefined
  /** This is always sql#importContext. */
  var kind: js.UndefOr[String] = js.undefined
  /**
    * A path to the file in Google Cloud Storage from which the import is made. The URI is in the form gs://bucketName/fileName. Compressed gzip files (.gz)
    * are supported when fileType is SQL.
    */
  var uri: js.UndefOr[String] = js.undefined
}

object ImportContext {
  @scala.inline
  def apply(
    csvImportOptions: Columns = null,
    database: String = null,
    fileType: String = null,
    importUser: String = null,
    kind: String = null,
    uri: String = null
  ): ImportContext = {
    val __obj = js.Dynamic.literal()
    if (csvImportOptions != null) __obj.updateDynamic("csvImportOptions")(csvImportOptions.asInstanceOf[js.Any])
    if (database != null) __obj.updateDynamic("database")(database.asInstanceOf[js.Any])
    if (fileType != null) __obj.updateDynamic("fileType")(fileType.asInstanceOf[js.Any])
    if (importUser != null) __obj.updateDynamic("importUser")(importUser.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportContext]
  }
}


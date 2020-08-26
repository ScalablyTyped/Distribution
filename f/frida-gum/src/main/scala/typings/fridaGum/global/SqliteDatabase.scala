package typings.fridaGum.global

import typings.fridaGum.SqliteOpenOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides read/write access to a SQLite database. Useful for persistence
  * and to embed a cache in an agent.
  */
@JSGlobal("SqliteDatabase")
@js.native
class SqliteDatabase ()
  extends typings.fridaGum.SqliteDatabase

/* static members */
@JSGlobal("SqliteDatabase")
@js.native
object SqliteDatabase extends js.Object {
  /**
    * Opens the SQLite v3 database at `path` on the filesystem. The database
    * will by default be opened read-write, and the returned `SqliteDatabase`
    * object will allow you to perform queries on it. Throws an exception if
    * the database cannot be opened.
    *
    * @param path Filesystem path to database.
    * @param options Options to customize how the database should be opened.
    */
  def open(path: String): typings.fridaGum.SqliteDatabase = js.native
  def open(path: String, options: SqliteOpenOptions): typings.fridaGum.SqliteDatabase = js.native
  /**
    * Just like `open()` but the contents of the database is provided as a
    * string containing its data, Base64-encoded. We recommend gzipping the
    * database before Base64-encoding it, but this is optional and detected
    * by looking for a gzip magic marker. The database is opened read-write,
    * but is 100% in-memory and never touches the filesystem. Throws an
    * exception if the database is malformed.
    *
    * This is useful for agents that need to bundle a cache of precomputed
    * data, e.g. static analysis data used to guide dynamic analysis.
    *
    * @param encodedContents Base64-encoded database contents.
    */
  def openInline(encodedContents: String): typings.fridaGum.SqliteDatabase = js.native
}


package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides read/write access to a SQLite database. Useful for persistence
  * and to embed a cache in an agent.
  */
@JSGlobal("SqliteDatabase")
@js.native
class SqliteDatabase () extends js.Object {
  /**
    * Closes the database. You should call this function when you're done with
    * the database, unless you are fine with this happening when the object is
    * garbage-collected or the script is unloaded.
    */
  def close(): Unit = js.native
  /**
    * Dumps the database to a gzip-compressed blob encoded as Base64.
    *
    * This is useful for inlining a cache in your agent's code, loaded by
    * calling `SqliteDatabase.openInline()`.
    */
  def dump(): String = js.native
  /**
    * Executes a raw SQL query. Throws an exception if the query is invalid.
    *
    * The query's result is ignored, so this should only be used for queries
    * for setting up the database, e.g. table creation.
    *
    * @param sql Text-representation of the SQL query.
    */
  def exec(sql: String): Unit = js.native
  /**
    * Compiles the provided SQL into a `SqliteStatement` object. Throws an
    * exception if the query is invalid.
    *
    * @param sql Text-representation of the SQL query.
    */
  def prepare(sql: String): SqliteStatement = js.native
}

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
  def open(path: String): SqliteDatabase = js.native
  def open(path: String, options: SqliteOpenOptions): SqliteDatabase = js.native
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
  def openInline(encodedContents: String): SqliteDatabase = js.native
}


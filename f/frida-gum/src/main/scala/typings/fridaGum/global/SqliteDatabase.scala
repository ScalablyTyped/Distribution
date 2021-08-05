package typings.fridaGum.global

import typings.fridaGum.SqliteOpenOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides read/write access to a SQLite database. Useful for persistence
  * and to embed a cache in an agent.
  */
@JSGlobal("SqliteDatabase")
@js.native
class SqliteDatabase ()
  extends StObject
     with typings.fridaGum.SqliteDatabase {
  
  /**
    * Closes the database. You should call this function when you're done with
    * the database, unless you are fine with this happening when the object is
    * garbage-collected or the script is unloaded.
    */
  /* CompleteClass */
  override def close(): Unit = js.native
  
  /**
    * Dumps the database to a gzip-compressed blob encoded as Base64.
    *
    * This is useful for inlining a cache in your agent's code, loaded by
    * calling `SqliteDatabase.openInline()`.
    */
  /* CompleteClass */
  override def dump(): String = js.native
  
  /**
    * Executes a raw SQL query. Throws an exception if the query is invalid.
    *
    * The query's result is ignored, so this should only be used for queries
    * for setting up the database, e.g. table creation.
    *
    * @param sql Text-representation of the SQL query.
    */
  /* CompleteClass */
  override def exec(sql: String): Unit = js.native
  
  /**
    * Compiles the provided SQL into a `SqliteStatement` object. Throws an
    * exception if the query is invalid.
    *
    * @param sql Text-representation of the SQL query.
    */
  /* CompleteClass */
  override def prepare(sql: String): typings.fridaGum.SqliteStatement = js.native
}
object SqliteDatabase {
  
  @JSGlobal("SqliteDatabase")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Opens the SQLite v3 database at `path` on the filesystem. The database
    * will by default be opened read-write, and the returned `SqliteDatabase`
    * object will allow you to perform queries on it. Throws an exception if
    * the database cannot be opened.
    *
    * @param path Filesystem path to database.
    * @param options Options to customize how the database should be opened.
    */
  /* static member */
  inline def open(path: String): typings.fridaGum.SqliteDatabase = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any]).asInstanceOf[typings.fridaGum.SqliteDatabase]
  inline def open(path: String, options: SqliteOpenOptions): typings.fridaGum.SqliteDatabase = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.fridaGum.SqliteDatabase]
  
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
  /* static member */
  inline def openInline(encodedContents: String): typings.fridaGum.SqliteDatabase = ^.asInstanceOf[js.Dynamic].applyDynamic("openInline")(encodedContents.asInstanceOf[js.Any]).asInstanceOf[typings.fridaGum.SqliteDatabase]
}

package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides read/write access to a SQLite database. Useful for persistence
  * and to embed a cache in an agent.
  */
@js.native
trait SqliteDatabase extends js.Object {
  
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
object SqliteDatabase {
  
  @scala.inline
  def apply(close: () => Unit, dump: () => String, exec: String => Unit, prepare: String => SqliteStatement): SqliteDatabase = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), dump = js.Any.fromFunction0(dump), exec = js.Any.fromFunction1(exec), prepare = js.Any.fromFunction1(prepare))
    __obj.asInstanceOf[SqliteDatabase]
  }
  
  @scala.inline
  implicit class SqliteDatabaseOps[Self <: SqliteDatabase] (val x: Self) extends AnyVal {
    
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
    def setClose(value: () => Unit): Self = this.set("close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDump(value: () => String): Self = this.set("dump", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExec(value: String => Unit): Self = this.set("exec", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPrepare(value: String => SqliteStatement): Self = this.set("prepare", js.Any.fromFunction1(value))
  }
}

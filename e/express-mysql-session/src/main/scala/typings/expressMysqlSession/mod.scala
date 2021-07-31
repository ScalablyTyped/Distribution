package typings.expressMysqlSession

import org.scalablytyped.runtime.Instantiable3
import typings.expressMysqlSession.anon.FnCall
import typings.expressMysqlSession.anon.PartialColumnNames
import typings.expressMysqlSession.anon.PartialSchema
import typings.expressSession.mod.Store
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(session: FnCall): Instantiable3[
    /* options */ Options, 
    /* connection */ js.UndefOr[js.Any], 
    /* callback */ js.UndefOr[js.Function1[/* error */ js.Any, Unit]], 
    MySQLStoreClass
  ] = ^.asInstanceOf[js.Dynamic].apply(session.asInstanceOf[js.Any]).asInstanceOf[Instantiable3[
    /* options */ Options, 
    /* connection */ js.UndefOr[js.Any], 
    /* callback */ js.UndefOr[js.Function1[/* error */ js.Any, Unit]], 
    MySQLStoreClass
  ]]
  
  @JSImport("express-mysql-session", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait ColumnNames extends StObject {
    
    var data: String
    
    var expires: String
    
    var session_id: String
  }
  object ColumnNames {
    
    @scala.inline
    def apply(data: String, expires: String, session_id: String): ColumnNames = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], expires = expires.asInstanceOf[js.Any], session_id = session_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColumnNames]
    }
    
    @scala.inline
    implicit class ColumnNamesMutableBuilder[Self <: ColumnNames] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpires(value: String): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSession_id(value: String): Self = StObject.set(x, "session_id", value.asInstanceOf[js.Any])
    }
  }
  
  type MySQLStore = MySQLStoreClass
  
  @js.native
  trait MySQLStoreClass extends Store {
    
    @JSName("all")
    def all_MMySQLStoreClass(): Unit = js.native
    @JSName("all")
    def all_MMySQLStoreClass(callback: js.Function2[/* error */ js.Any, /* sessions */ js.Any, Unit]): Unit = js.native
    
    def clearExpirationInterval(): Unit = js.native
    
    def clearExpiredSessions(): Unit = js.native
    def clearExpiredSessions(callback: js.Function1[/* error */ js.Any, Unit]): Unit = js.native
    
    @JSName("clear")
    def clear_MMySQLStoreClass(): Unit = js.native
    @JSName("clear")
    def clear_MMySQLStoreClass(callback: js.Function1[/* error */ js.Any, Unit]): Unit = js.native
    
    def close(): Unit = js.native
    def close(callback: js.Function0[Unit]): Unit = js.native
    
    def createDatabaseTable(): Unit = js.native
    def createDatabaseTable(callback: js.Function1[/* error */ js.Any, Unit]): Unit = js.native
    
    def get(sessionId: String): Unit = js.native
    
    @JSName("length")
    def length_MMySQLStoreClass(): Unit = js.native
    @JSName("length")
    def length_MMySQLStoreClass(callback: js.Function2[/* error */ js.Any, /* count */ js.Any, Unit]): Unit = js.native
    
    def query(sql: String, params: js.Any): Unit = js.native
    def query(
      sql: String,
      params: js.Any,
      callback: js.Function3[/* error */ js.Any, /* rows */ js.Any, /* fields */ js.Any, Unit]
    ): Unit = js.native
    
    def set(sessionId: String, data: js.Any): Unit = js.native
    def set(sessionId: String, data: js.Any, callback: js.Function1[/* error */ js.Any, Unit]): Unit = js.native
    
    def setDefaultOptions(): Unit = js.native
    
    def setExpirationInterval(interval: Double): Unit = js.native
    
    def setOptions(options: Options): Unit = js.native
    
    @JSName("touch")
    def touch_MMySQLStoreClass(sessionId: String, data: js.Any): Unit = js.native
    @JSName("touch")
    def touch_MMySQLStoreClass(sessionId: String, data: js.Any, callback: js.Function1[/* error */ js.Any, Unit]): Unit = js.native
    
    def validateOptions(options: Options): Unit = js.native
  }
  
  trait Options extends StObject {
    
    var checkExpirationInterval: js.UndefOr[Double] = js.undefined
    
    var connectionLimit: js.UndefOr[Double] = js.undefined
    
    var createDatabaseTable: js.UndefOr[Boolean] = js.undefined
    
    var database: js.UndefOr[String] = js.undefined
    
    var expiration: js.UndefOr[Double] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    var password: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var schema: js.UndefOr[PartialSchema] = js.undefined
    
    var user: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheckExpirationInterval(value: Double): Self = StObject.set(x, "checkExpirationInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckExpirationIntervalUndefined: Self = StObject.set(x, "checkExpirationInterval", js.undefined)
      
      @scala.inline
      def setConnectionLimit(value: Double): Self = StObject.set(x, "connectionLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectionLimitUndefined: Self = StObject.set(x, "connectionLimit", js.undefined)
      
      @scala.inline
      def setCreateDatabaseTable(value: Boolean): Self = StObject.set(x, "createDatabaseTable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateDatabaseTableUndefined: Self = StObject.set(x, "createDatabaseTable", js.undefined)
      
      @scala.inline
      def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
      
      @scala.inline
      def setExpiration(value: Double): Self = StObject.set(x, "expiration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpirationUndefined: Self = StObject.set(x, "expiration", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setSchema(value: PartialSchema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
      
      @scala.inline
      def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    }
  }
  
  trait Schema extends StObject {
    
    var columnNames: PartialColumnNames
    
    var tableName: String
  }
  object Schema {
    
    @scala.inline
    def apply(columnNames: PartialColumnNames, tableName: String): Schema = {
      val __obj = js.Dynamic.literal(columnNames = columnNames.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[Schema]
    }
    
    @scala.inline
    implicit class SchemaMutableBuilder[Self <: Schema] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumnNames(value: PartialColumnNames): Self = StObject.set(x, "columnNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableName(value: String): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
    }
  }
}

package typings.devtoolsProtocol.mod.Protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Database {
  
  trait AddDatabaseEvent extends StObject {
    
    var database: typings.devtoolsProtocol.mod.Protocol.Database.Database
  }
  object AddDatabaseEvent {
    
    inline def apply(database: typings.devtoolsProtocol.mod.Protocol.Database.Database): AddDatabaseEvent = {
      val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddDatabaseEvent]
    }
    
    extension [Self <: AddDatabaseEvent](x: Self) {
      
      inline def setDatabase(value: typings.devtoolsProtocol.mod.Protocol.Database.Database): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
    }
  }
  
  trait Database extends StObject {
    
    /**
      * Database domain.
      */
    var domain: String
    
    /**
      * Database ID.
      */
    var id: DatabaseId
    
    /**
      * Database name.
      */
    var name: String
    
    /**
      * Database version.
      */
    var version: String
  }
  object Database {
    
    inline def apply(domain: String, id: DatabaseId, name: String, version: String): typings.devtoolsProtocol.mod.Protocol.Database.Database = {
      val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.devtoolsProtocol.mod.Protocol.Database.Database]
    }
    
    extension [Self <: typings.devtoolsProtocol.mod.Protocol.Database.Database](x: Self) {
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setId(value: DatabaseId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  type DatabaseId = String
  
  trait Error extends StObject {
    
    /**
      * Error code.
      */
    var code: integer
    
    /**
      * Error message.
      */
    var message: String
  }
  object Error {
    
    inline def apply(code: integer, message: String): Error = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error]
    }
    
    extension [Self <: Error](x: Self) {
      
      inline def setCode(value: integer): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  trait ExecuteSQLRequest extends StObject {
    
    var databaseId: DatabaseId
    
    var query: String
  }
  object ExecuteSQLRequest {
    
    inline def apply(databaseId: DatabaseId, query: String): ExecuteSQLRequest = {
      val __obj = js.Dynamic.literal(databaseId = databaseId.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExecuteSQLRequest]
    }
    
    extension [Self <: ExecuteSQLRequest](x: Self) {
      
      inline def setDatabaseId(value: DatabaseId): Self = StObject.set(x, "databaseId", value.asInstanceOf[js.Any])
      
      inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    }
  }
  
  trait ExecuteSQLResponse extends StObject {
    
    var columnNames: js.UndefOr[js.Array[String]] = js.undefined
    
    var sqlError: js.UndefOr[Error] = js.undefined
    
    var values: js.UndefOr[js.Array[js.Any]] = js.undefined
  }
  object ExecuteSQLResponse {
    
    inline def apply(): ExecuteSQLResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExecuteSQLResponse]
    }
    
    extension [Self <: ExecuteSQLResponse](x: Self) {
      
      inline def setColumnNames(value: js.Array[String]): Self = StObject.set(x, "columnNames", value.asInstanceOf[js.Any])
      
      inline def setColumnNamesUndefined: Self = StObject.set(x, "columnNames", js.undefined)
      
      inline def setColumnNamesVarargs(value: String*): Self = StObject.set(x, "columnNames", js.Array(value :_*))
      
      inline def setSqlError(value: Error): Self = StObject.set(x, "sqlError", value.asInstanceOf[js.Any])
      
      inline def setSqlErrorUndefined: Self = StObject.set(x, "sqlError", js.undefined)
      
      inline def setValues(value: js.Array[js.Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      inline def setValuesVarargs(value: js.Any*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
  
  trait GetDatabaseTableNamesRequest extends StObject {
    
    var databaseId: DatabaseId
  }
  object GetDatabaseTableNamesRequest {
    
    inline def apply(databaseId: DatabaseId): GetDatabaseTableNamesRequest = {
      val __obj = js.Dynamic.literal(databaseId = databaseId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetDatabaseTableNamesRequest]
    }
    
    extension [Self <: GetDatabaseTableNamesRequest](x: Self) {
      
      inline def setDatabaseId(value: DatabaseId): Self = StObject.set(x, "databaseId", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetDatabaseTableNamesResponse extends StObject {
    
    var tableNames: js.Array[String]
  }
  object GetDatabaseTableNamesResponse {
    
    inline def apply(tableNames: js.Array[String]): GetDatabaseTableNamesResponse = {
      val __obj = js.Dynamic.literal(tableNames = tableNames.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetDatabaseTableNamesResponse]
    }
    
    extension [Self <: GetDatabaseTableNamesResponse](x: Self) {
      
      inline def setTableNames(value: js.Array[String]): Self = StObject.set(x, "tableNames", value.asInstanceOf[js.Any])
      
      inline def setTableNamesVarargs(value: String*): Self = StObject.set(x, "tableNames", js.Array(value :_*))
    }
  }
}

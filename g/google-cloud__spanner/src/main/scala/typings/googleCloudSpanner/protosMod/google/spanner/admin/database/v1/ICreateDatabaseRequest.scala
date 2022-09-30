package typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a CreateDatabaseRequest. */
trait ICreateDatabaseRequest extends StObject {
  
  /** CreateDatabaseRequest createStatement */
  var createStatement: js.UndefOr[String | Null] = js.undefined
  
  /** CreateDatabaseRequest databaseDialect */
  var databaseDialect: js.UndefOr[
    DatabaseDialect | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.spanner.admin.database.v1.DatabaseDialect * / any */ String) | Null
  ] = js.undefined
  
  /** CreateDatabaseRequest encryptionConfig */
  var encryptionConfig: js.UndefOr[IEncryptionConfig | Null] = js.undefined
  
  /** CreateDatabaseRequest extraStatements */
  var extraStatements: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /** CreateDatabaseRequest parent */
  var parent: js.UndefOr[String | Null] = js.undefined
}
object ICreateDatabaseRequest {
  
  inline def apply(): ICreateDatabaseRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICreateDatabaseRequest]
  }
  
  extension [Self <: ICreateDatabaseRequest](x: Self) {
    
    inline def setCreateStatement(value: String): Self = StObject.set(x, "createStatement", value.asInstanceOf[js.Any])
    
    inline def setCreateStatementNull: Self = StObject.set(x, "createStatement", null)
    
    inline def setCreateStatementUndefined: Self = StObject.set(x, "createStatement", js.undefined)
    
    inline def setDatabaseDialect(
      value: DatabaseDialect | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.spanner.admin.database.v1.DatabaseDialect * / any */ String)
    ): Self = StObject.set(x, "databaseDialect", value.asInstanceOf[js.Any])
    
    inline def setDatabaseDialectNull: Self = StObject.set(x, "databaseDialect", null)
    
    inline def setDatabaseDialectUndefined: Self = StObject.set(x, "databaseDialect", js.undefined)
    
    inline def setEncryptionConfig(value: IEncryptionConfig): Self = StObject.set(x, "encryptionConfig", value.asInstanceOf[js.Any])
    
    inline def setEncryptionConfigNull: Self = StObject.set(x, "encryptionConfig", null)
    
    inline def setEncryptionConfigUndefined: Self = StObject.set(x, "encryptionConfig", js.undefined)
    
    inline def setExtraStatements(value: js.Array[String]): Self = StObject.set(x, "extraStatements", value.asInstanceOf[js.Any])
    
    inline def setExtraStatementsNull: Self = StObject.set(x, "extraStatements", null)
    
    inline def setExtraStatementsUndefined: Self = StObject.set(x, "extraStatements", js.undefined)
    
    inline def setExtraStatementsVarargs(value: String*): Self = StObject.set(x, "extraStatements", js.Array(value*))
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}

package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaViewDefinition extends StObject {
  
  /**
    * [Required] A query that BigQuery executes when the view is referenced.
    */
  var query: js.UndefOr[String | Null] = js.undefined
  
  /**
    * True if the column names are explicitly specified. For example by using the 'CREATE VIEW v(c1, c2) AS ...' syntax. Can only be set using BigQuery's standard SQL: https://cloud.google.com/bigquery/sql-reference/
    */
  var useExplicitColumnNames: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Specifies whether to use BigQuery's legacy SQL for this view. The default value is true. If set to false, the view will use BigQuery's standard SQL: https://cloud.google.com/bigquery/sql-reference/ Queries and views that reference this view must use the same flag value.
    */
  var useLegacySql: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Describes user-defined function resources used in the query.
    */
  var userDefinedFunctionResources: js.UndefOr[js.Array[SchemaUserDefinedFunctionResource]] = js.undefined
}
object SchemaViewDefinition {
  
  inline def apply(): SchemaViewDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaViewDefinition]
  }
  
  extension [Self <: SchemaViewDefinition](x: Self) {
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryNull: Self = StObject.set(x, "query", null)
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setUseExplicitColumnNames(value: Boolean): Self = StObject.set(x, "useExplicitColumnNames", value.asInstanceOf[js.Any])
    
    inline def setUseExplicitColumnNamesNull: Self = StObject.set(x, "useExplicitColumnNames", null)
    
    inline def setUseExplicitColumnNamesUndefined: Self = StObject.set(x, "useExplicitColumnNames", js.undefined)
    
    inline def setUseLegacySql(value: Boolean): Self = StObject.set(x, "useLegacySql", value.asInstanceOf[js.Any])
    
    inline def setUseLegacySqlNull: Self = StObject.set(x, "useLegacySql", null)
    
    inline def setUseLegacySqlUndefined: Self = StObject.set(x, "useLegacySql", js.undefined)
    
    inline def setUserDefinedFunctionResources(value: js.Array[SchemaUserDefinedFunctionResource]): Self = StObject.set(x, "userDefinedFunctionResources", value.asInstanceOf[js.Any])
    
    inline def setUserDefinedFunctionResourcesUndefined: Self = StObject.set(x, "userDefinedFunctionResources", js.undefined)
    
    inline def setUserDefinedFunctionResourcesVarargs(value: SchemaUserDefinedFunctionResource*): Self = StObject.set(x, "userDefinedFunctionResources", js.Array(value*))
  }
}

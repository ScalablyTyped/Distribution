package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaViewDefinition extends StObject {
  
  /**
    * [Required] A query that BigQuery executes when the view is referenced.
    */
  var query: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether to use BigQuery&#39;s legacy SQL for this view. The
    * default value is true. If set to false, the view will use BigQuery&#39;s
    * standard SQL: https://cloud.google.com/bigquery/sql-reference/ Queries
    * and views that reference this view must use the same flag value.
    */
  var useLegacySql: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Describes user-defined function resources used in the query.
    */
  var userDefinedFunctionResources: js.UndefOr[js.Array[SchemaUserDefinedFunctionResource]] = js.undefined
}
object SchemaViewDefinition {
  
  @scala.inline
  def apply(): SchemaViewDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaViewDefinition]
  }
  
  @scala.inline
  implicit class SchemaViewDefinitionMutableBuilder[Self <: SchemaViewDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    @scala.inline
    def setUseLegacySql(value: Boolean): Self = StObject.set(x, "useLegacySql", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseLegacySqlUndefined: Self = StObject.set(x, "useLegacySql", js.undefined)
    
    @scala.inline
    def setUserDefinedFunctionResources(value: js.Array[SchemaUserDefinedFunctionResource]): Self = StObject.set(x, "userDefinedFunctionResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserDefinedFunctionResourcesUndefined: Self = StObject.set(x, "userDefinedFunctionResources", js.undefined)
    
    @scala.inline
    def setUserDefinedFunctionResourcesVarargs(value: SchemaUserDefinedFunctionResource*): Self = StObject.set(x, "userDefinedFunctionResources", js.Array(value :_*))
  }
}

package typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobConfigurationQuery extends StObject {
  
  var allowLargeResults: js.UndefOr[Boolean] = js.undefined
  
  var clustering: js.UndefOr[Clustering] = js.undefined
  
  var createDisposition: js.UndefOr[String] = js.undefined
  
  var defaultDataset: js.UndefOr[DatasetReference] = js.undefined
  
  var destinationEncryptionConfiguration: js.UndefOr[EncryptionConfiguration] = js.undefined
  
  var destinationTable: js.UndefOr[TableReference] = js.undefined
  
  var flattenResults: js.UndefOr[Boolean] = js.undefined
  
  var maximumBillingTier: js.UndefOr[Double] = js.undefined
  
  var maximumBytesBilled: js.UndefOr[String] = js.undefined
  
  var parameterMode: js.UndefOr[String] = js.undefined
  
  var preserveNulls: js.UndefOr[Boolean] = js.undefined
  
  var priority: js.UndefOr[String] = js.undefined
  
  var query: js.UndefOr[String] = js.undefined
  
  var queryParameters: js.UndefOr[js.Array[QueryParameter]] = js.undefined
  
  var rangePartitioning: js.UndefOr[RangePartitioning] = js.undefined
  
  var schemaUpdateOptions: js.UndefOr[js.Array[String]] = js.undefined
  
  var tableDefinitions: js.UndefOr[js.Object] = js.undefined
  
  var timePartitioning: js.UndefOr[TimePartitioning] = js.undefined
  
  var useLegacySql: js.UndefOr[Boolean] = js.undefined
  
  var useQueryCache: js.UndefOr[Boolean] = js.undefined
  
  var userDefinedFunctionResources: js.UndefOr[js.Array[UserDefinedFunctionResource]] = js.undefined
  
  var writeDisposition: js.UndefOr[String] = js.undefined
}
object JobConfigurationQuery {
  
  inline def apply(): JobConfigurationQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobConfigurationQuery]
  }
  
  extension [Self <: JobConfigurationQuery](x: Self) {
    
    inline def setAllowLargeResults(value: Boolean): Self = StObject.set(x, "allowLargeResults", value.asInstanceOf[js.Any])
    
    inline def setAllowLargeResultsUndefined: Self = StObject.set(x, "allowLargeResults", js.undefined)
    
    inline def setClustering(value: Clustering): Self = StObject.set(x, "clustering", value.asInstanceOf[js.Any])
    
    inline def setClusteringUndefined: Self = StObject.set(x, "clustering", js.undefined)
    
    inline def setCreateDisposition(value: String): Self = StObject.set(x, "createDisposition", value.asInstanceOf[js.Any])
    
    inline def setCreateDispositionUndefined: Self = StObject.set(x, "createDisposition", js.undefined)
    
    inline def setDefaultDataset(value: DatasetReference): Self = StObject.set(x, "defaultDataset", value.asInstanceOf[js.Any])
    
    inline def setDefaultDatasetUndefined: Self = StObject.set(x, "defaultDataset", js.undefined)
    
    inline def setDestinationEncryptionConfiguration(value: EncryptionConfiguration): Self = StObject.set(x, "destinationEncryptionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setDestinationEncryptionConfigurationUndefined: Self = StObject.set(x, "destinationEncryptionConfiguration", js.undefined)
    
    inline def setDestinationTable(value: TableReference): Self = StObject.set(x, "destinationTable", value.asInstanceOf[js.Any])
    
    inline def setDestinationTableUndefined: Self = StObject.set(x, "destinationTable", js.undefined)
    
    inline def setFlattenResults(value: Boolean): Self = StObject.set(x, "flattenResults", value.asInstanceOf[js.Any])
    
    inline def setFlattenResultsUndefined: Self = StObject.set(x, "flattenResults", js.undefined)
    
    inline def setMaximumBillingTier(value: Double): Self = StObject.set(x, "maximumBillingTier", value.asInstanceOf[js.Any])
    
    inline def setMaximumBillingTierUndefined: Self = StObject.set(x, "maximumBillingTier", js.undefined)
    
    inline def setMaximumBytesBilled(value: String): Self = StObject.set(x, "maximumBytesBilled", value.asInstanceOf[js.Any])
    
    inline def setMaximumBytesBilledUndefined: Self = StObject.set(x, "maximumBytesBilled", js.undefined)
    
    inline def setParameterMode(value: String): Self = StObject.set(x, "parameterMode", value.asInstanceOf[js.Any])
    
    inline def setParameterModeUndefined: Self = StObject.set(x, "parameterMode", js.undefined)
    
    inline def setPreserveNulls(value: Boolean): Self = StObject.set(x, "preserveNulls", value.asInstanceOf[js.Any])
    
    inline def setPreserveNullsUndefined: Self = StObject.set(x, "preserveNulls", js.undefined)
    
    inline def setPriority(value: String): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryParameters(value: js.Array[QueryParameter]): Self = StObject.set(x, "queryParameters", value.asInstanceOf[js.Any])
    
    inline def setQueryParametersUndefined: Self = StObject.set(x, "queryParameters", js.undefined)
    
    inline def setQueryParametersVarargs(value: QueryParameter*): Self = StObject.set(x, "queryParameters", js.Array(value :_*))
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setRangePartitioning(value: RangePartitioning): Self = StObject.set(x, "rangePartitioning", value.asInstanceOf[js.Any])
    
    inline def setRangePartitioningUndefined: Self = StObject.set(x, "rangePartitioning", js.undefined)
    
    inline def setSchemaUpdateOptions(value: js.Array[String]): Self = StObject.set(x, "schemaUpdateOptions", value.asInstanceOf[js.Any])
    
    inline def setSchemaUpdateOptionsUndefined: Self = StObject.set(x, "schemaUpdateOptions", js.undefined)
    
    inline def setSchemaUpdateOptionsVarargs(value: String*): Self = StObject.set(x, "schemaUpdateOptions", js.Array(value :_*))
    
    inline def setTableDefinitions(value: js.Object): Self = StObject.set(x, "tableDefinitions", value.asInstanceOf[js.Any])
    
    inline def setTableDefinitionsUndefined: Self = StObject.set(x, "tableDefinitions", js.undefined)
    
    inline def setTimePartitioning(value: TimePartitioning): Self = StObject.set(x, "timePartitioning", value.asInstanceOf[js.Any])
    
    inline def setTimePartitioningUndefined: Self = StObject.set(x, "timePartitioning", js.undefined)
    
    inline def setUseLegacySql(value: Boolean): Self = StObject.set(x, "useLegacySql", value.asInstanceOf[js.Any])
    
    inline def setUseLegacySqlUndefined: Self = StObject.set(x, "useLegacySql", js.undefined)
    
    inline def setUseQueryCache(value: Boolean): Self = StObject.set(x, "useQueryCache", value.asInstanceOf[js.Any])
    
    inline def setUseQueryCacheUndefined: Self = StObject.set(x, "useQueryCache", js.undefined)
    
    inline def setUserDefinedFunctionResources(value: js.Array[UserDefinedFunctionResource]): Self = StObject.set(x, "userDefinedFunctionResources", value.asInstanceOf[js.Any])
    
    inline def setUserDefinedFunctionResourcesUndefined: Self = StObject.set(x, "userDefinedFunctionResources", js.undefined)
    
    inline def setUserDefinedFunctionResourcesVarargs(value: UserDefinedFunctionResource*): Self = StObject.set(x, "userDefinedFunctionResources", js.Array(value :_*))
    
    inline def setWriteDisposition(value: String): Self = StObject.set(x, "writeDisposition", value.asInstanceOf[js.Any])
    
    inline def setWriteDispositionUndefined: Self = StObject.set(x, "writeDisposition", js.undefined)
  }
}

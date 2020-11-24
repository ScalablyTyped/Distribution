package typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobConfigurationQuery extends js.Object {
  
  var allowLargeResults: js.UndefOr[Boolean] = js.native
  
  var clustering: js.UndefOr[Clustering] = js.native
  
  var createDisposition: js.UndefOr[String] = js.native
  
  var defaultDataset: js.UndefOr[DatasetReference] = js.native
  
  var destinationEncryptionConfiguration: js.UndefOr[EncryptionConfiguration] = js.native
  
  var destinationTable: js.UndefOr[TableReference] = js.native
  
  var flattenResults: js.UndefOr[Boolean] = js.native
  
  var maximumBillingTier: js.UndefOr[Double] = js.native
  
  var maximumBytesBilled: js.UndefOr[String] = js.native
  
  var parameterMode: js.UndefOr[String] = js.native
  
  var preserveNulls: js.UndefOr[Boolean] = js.native
  
  var priority: js.UndefOr[String] = js.native
  
  var query: js.UndefOr[String] = js.native
  
  var queryParameters: js.UndefOr[js.Array[QueryParameter]] = js.native
  
  var rangePartitioning: js.UndefOr[RangePartitioning] = js.native
  
  var schemaUpdateOptions: js.UndefOr[js.Array[String]] = js.native
  
  var tableDefinitions: js.UndefOr[js.Object] = js.native
  
  var timePartitioning: js.UndefOr[TimePartitioning] = js.native
  
  var useLegacySql: js.UndefOr[Boolean] = js.native
  
  var useQueryCache: js.UndefOr[Boolean] = js.native
  
  var userDefinedFunctionResources: js.UndefOr[js.Array[UserDefinedFunctionResource]] = js.native
  
  var writeDisposition: js.UndefOr[String] = js.native
}
object JobConfigurationQuery {
  
  @scala.inline
  def apply(): JobConfigurationQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobConfigurationQuery]
  }
  
  @scala.inline
  implicit class JobConfigurationQueryOps[Self <: JobConfigurationQuery] (val x: Self) extends AnyVal {
    
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
    def setAllowLargeResults(value: Boolean): Self = this.set("allowLargeResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowLargeResults: Self = this.set("allowLargeResults", js.undefined)
    
    @scala.inline
    def setClustering(value: Clustering): Self = this.set("clustering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClustering: Self = this.set("clustering", js.undefined)
    
    @scala.inline
    def setCreateDisposition(value: String): Self = this.set("createDisposition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateDisposition: Self = this.set("createDisposition", js.undefined)
    
    @scala.inline
    def setDefaultDataset(value: DatasetReference): Self = this.set("defaultDataset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultDataset: Self = this.set("defaultDataset", js.undefined)
    
    @scala.inline
    def setDestinationEncryptionConfiguration(value: EncryptionConfiguration): Self = this.set("destinationEncryptionConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationEncryptionConfiguration: Self = this.set("destinationEncryptionConfiguration", js.undefined)
    
    @scala.inline
    def setDestinationTable(value: TableReference): Self = this.set("destinationTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationTable: Self = this.set("destinationTable", js.undefined)
    
    @scala.inline
    def setFlattenResults(value: Boolean): Self = this.set("flattenResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlattenResults: Self = this.set("flattenResults", js.undefined)
    
    @scala.inline
    def setMaximumBillingTier(value: Double): Self = this.set("maximumBillingTier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumBillingTier: Self = this.set("maximumBillingTier", js.undefined)
    
    @scala.inline
    def setMaximumBytesBilled(value: String): Self = this.set("maximumBytesBilled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumBytesBilled: Self = this.set("maximumBytesBilled", js.undefined)
    
    @scala.inline
    def setParameterMode(value: String): Self = this.set("parameterMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameterMode: Self = this.set("parameterMode", js.undefined)
    
    @scala.inline
    def setPreserveNulls(value: Boolean): Self = this.set("preserveNulls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreserveNulls: Self = this.set("preserveNulls", js.undefined)
    
    @scala.inline
    def setPriority(value: String): Self = this.set("priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    
    @scala.inline
    def setQueryParametersVarargs(value: QueryParameter*): Self = this.set("queryParameters", js.Array(value :_*))
    
    @scala.inline
    def setQueryParameters(value: js.Array[QueryParameter]): Self = this.set("queryParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryParameters: Self = this.set("queryParameters", js.undefined)
    
    @scala.inline
    def setRangePartitioning(value: RangePartitioning): Self = this.set("rangePartitioning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRangePartitioning: Self = this.set("rangePartitioning", js.undefined)
    
    @scala.inline
    def setSchemaUpdateOptionsVarargs(value: String*): Self = this.set("schemaUpdateOptions", js.Array(value :_*))
    
    @scala.inline
    def setSchemaUpdateOptions(value: js.Array[String]): Self = this.set("schemaUpdateOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchemaUpdateOptions: Self = this.set("schemaUpdateOptions", js.undefined)
    
    @scala.inline
    def setTableDefinitions(value: js.Object): Self = this.set("tableDefinitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableDefinitions: Self = this.set("tableDefinitions", js.undefined)
    
    @scala.inline
    def setTimePartitioning(value: TimePartitioning): Self = this.set("timePartitioning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimePartitioning: Self = this.set("timePartitioning", js.undefined)
    
    @scala.inline
    def setUseLegacySql(value: Boolean): Self = this.set("useLegacySql", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseLegacySql: Self = this.set("useLegacySql", js.undefined)
    
    @scala.inline
    def setUseQueryCache(value: Boolean): Self = this.set("useQueryCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseQueryCache: Self = this.set("useQueryCache", js.undefined)
    
    @scala.inline
    def setUserDefinedFunctionResourcesVarargs(value: UserDefinedFunctionResource*): Self = this.set("userDefinedFunctionResources", js.Array(value :_*))
    
    @scala.inline
    def setUserDefinedFunctionResources(value: js.Array[UserDefinedFunctionResource]): Self = this.set("userDefinedFunctionResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserDefinedFunctionResources: Self = this.set("userDefinedFunctionResources", js.undefined)
    
    @scala.inline
    def setWriteDisposition(value: String): Self = this.set("writeDisposition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWriteDisposition: Self = this.set("writeDisposition", js.undefined)
  }
}

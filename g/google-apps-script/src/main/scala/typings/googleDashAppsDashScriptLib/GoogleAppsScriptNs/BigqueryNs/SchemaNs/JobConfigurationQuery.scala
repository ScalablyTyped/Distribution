package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigqueryNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobConfigurationQuery extends js.Object {
  var allowLargeResults: js.UndefOr[scala.Boolean] = js.undefined
  var clustering: js.UndefOr[Clustering] = js.undefined
  var createDisposition: js.UndefOr[java.lang.String] = js.undefined
  var defaultDataset: js.UndefOr[DatasetReference] = js.undefined
  var destinationEncryptionConfiguration: js.UndefOr[EncryptionConfiguration] = js.undefined
  var destinationTable: js.UndefOr[TableReference] = js.undefined
  var flattenResults: js.UndefOr[scala.Boolean] = js.undefined
  var maximumBillingTier: js.UndefOr[scala.Double] = js.undefined
  var maximumBytesBilled: js.UndefOr[java.lang.String] = js.undefined
  var parameterMode: js.UndefOr[java.lang.String] = js.undefined
  var preserveNulls: js.UndefOr[scala.Boolean] = js.undefined
  var priority: js.UndefOr[java.lang.String] = js.undefined
  var query: js.UndefOr[java.lang.String] = js.undefined
  var queryParameters: js.UndefOr[js.Array[QueryParameter]] = js.undefined
  var rangePartitioning: js.UndefOr[RangePartitioning] = js.undefined
  var schemaUpdateOptions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var tableDefinitions: js.UndefOr[js.Object] = js.undefined
  var timePartitioning: js.UndefOr[TimePartitioning] = js.undefined
  var useLegacySql: js.UndefOr[scala.Boolean] = js.undefined
  var useQueryCache: js.UndefOr[scala.Boolean] = js.undefined
  var userDefinedFunctionResources: js.UndefOr[js.Array[UserDefinedFunctionResource]] = js.undefined
  var writeDisposition: js.UndefOr[java.lang.String] = js.undefined
}

object JobConfigurationQuery {
  @scala.inline
  def apply(
    allowLargeResults: js.UndefOr[scala.Boolean] = js.undefined,
    clustering: Clustering = null,
    createDisposition: java.lang.String = null,
    defaultDataset: DatasetReference = null,
    destinationEncryptionConfiguration: EncryptionConfiguration = null,
    destinationTable: TableReference = null,
    flattenResults: js.UndefOr[scala.Boolean] = js.undefined,
    maximumBillingTier: scala.Int | scala.Double = null,
    maximumBytesBilled: java.lang.String = null,
    parameterMode: java.lang.String = null,
    preserveNulls: js.UndefOr[scala.Boolean] = js.undefined,
    priority: java.lang.String = null,
    query: java.lang.String = null,
    queryParameters: js.Array[QueryParameter] = null,
    rangePartitioning: RangePartitioning = null,
    schemaUpdateOptions: js.Array[java.lang.String] = null,
    tableDefinitions: js.Object = null,
    timePartitioning: TimePartitioning = null,
    useLegacySql: js.UndefOr[scala.Boolean] = js.undefined,
    useQueryCache: js.UndefOr[scala.Boolean] = js.undefined,
    userDefinedFunctionResources: js.Array[UserDefinedFunctionResource] = null,
    writeDisposition: java.lang.String = null
  ): JobConfigurationQuery = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowLargeResults)) __obj.updateDynamic("allowLargeResults")(allowLargeResults)
    if (clustering != null) __obj.updateDynamic("clustering")(clustering)
    if (createDisposition != null) __obj.updateDynamic("createDisposition")(createDisposition)
    if (defaultDataset != null) __obj.updateDynamic("defaultDataset")(defaultDataset)
    if (destinationEncryptionConfiguration != null) __obj.updateDynamic("destinationEncryptionConfiguration")(destinationEncryptionConfiguration)
    if (destinationTable != null) __obj.updateDynamic("destinationTable")(destinationTable)
    if (!js.isUndefined(flattenResults)) __obj.updateDynamic("flattenResults")(flattenResults)
    if (maximumBillingTier != null) __obj.updateDynamic("maximumBillingTier")(maximumBillingTier.asInstanceOf[js.Any])
    if (maximumBytesBilled != null) __obj.updateDynamic("maximumBytesBilled")(maximumBytesBilled)
    if (parameterMode != null) __obj.updateDynamic("parameterMode")(parameterMode)
    if (!js.isUndefined(preserveNulls)) __obj.updateDynamic("preserveNulls")(preserveNulls)
    if (priority != null) __obj.updateDynamic("priority")(priority)
    if (query != null) __obj.updateDynamic("query")(query)
    if (queryParameters != null) __obj.updateDynamic("queryParameters")(queryParameters)
    if (rangePartitioning != null) __obj.updateDynamic("rangePartitioning")(rangePartitioning)
    if (schemaUpdateOptions != null) __obj.updateDynamic("schemaUpdateOptions")(schemaUpdateOptions)
    if (tableDefinitions != null) __obj.updateDynamic("tableDefinitions")(tableDefinitions)
    if (timePartitioning != null) __obj.updateDynamic("timePartitioning")(timePartitioning)
    if (!js.isUndefined(useLegacySql)) __obj.updateDynamic("useLegacySql")(useLegacySql)
    if (!js.isUndefined(useQueryCache)) __obj.updateDynamic("useQueryCache")(useQueryCache)
    if (userDefinedFunctionResources != null) __obj.updateDynamic("userDefinedFunctionResources")(userDefinedFunctionResources)
    if (writeDisposition != null) __obj.updateDynamic("writeDisposition")(writeDisposition)
    __obj.asInstanceOf[JobConfigurationQuery]
  }
}


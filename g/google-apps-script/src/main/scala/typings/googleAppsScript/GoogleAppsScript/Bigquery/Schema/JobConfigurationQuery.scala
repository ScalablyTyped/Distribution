package typings.googleAppsScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobConfigurationQuery extends js.Object {
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
  @scala.inline
  def apply(
    allowLargeResults: js.UndefOr[Boolean] = js.undefined,
    clustering: Clustering = null,
    createDisposition: String = null,
    defaultDataset: DatasetReference = null,
    destinationEncryptionConfiguration: EncryptionConfiguration = null,
    destinationTable: TableReference = null,
    flattenResults: js.UndefOr[Boolean] = js.undefined,
    maximumBillingTier: Int | Double = null,
    maximumBytesBilled: String = null,
    parameterMode: String = null,
    preserveNulls: js.UndefOr[Boolean] = js.undefined,
    priority: String = null,
    query: String = null,
    queryParameters: js.Array[QueryParameter] = null,
    rangePartitioning: RangePartitioning = null,
    schemaUpdateOptions: js.Array[String] = null,
    tableDefinitions: js.Object = null,
    timePartitioning: TimePartitioning = null,
    useLegacySql: js.UndefOr[Boolean] = js.undefined,
    useQueryCache: js.UndefOr[Boolean] = js.undefined,
    userDefinedFunctionResources: js.Array[UserDefinedFunctionResource] = null,
    writeDisposition: String = null
  ): JobConfigurationQuery = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowLargeResults)) __obj.updateDynamic("allowLargeResults")(allowLargeResults.asInstanceOf[js.Any])
    if (clustering != null) __obj.updateDynamic("clustering")(clustering.asInstanceOf[js.Any])
    if (createDisposition != null) __obj.updateDynamic("createDisposition")(createDisposition.asInstanceOf[js.Any])
    if (defaultDataset != null) __obj.updateDynamic("defaultDataset")(defaultDataset.asInstanceOf[js.Any])
    if (destinationEncryptionConfiguration != null) __obj.updateDynamic("destinationEncryptionConfiguration")(destinationEncryptionConfiguration.asInstanceOf[js.Any])
    if (destinationTable != null) __obj.updateDynamic("destinationTable")(destinationTable.asInstanceOf[js.Any])
    if (!js.isUndefined(flattenResults)) __obj.updateDynamic("flattenResults")(flattenResults.asInstanceOf[js.Any])
    if (maximumBillingTier != null) __obj.updateDynamic("maximumBillingTier")(maximumBillingTier.asInstanceOf[js.Any])
    if (maximumBytesBilled != null) __obj.updateDynamic("maximumBytesBilled")(maximumBytesBilled.asInstanceOf[js.Any])
    if (parameterMode != null) __obj.updateDynamic("parameterMode")(parameterMode.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveNulls)) __obj.updateDynamic("preserveNulls")(preserveNulls.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (queryParameters != null) __obj.updateDynamic("queryParameters")(queryParameters.asInstanceOf[js.Any])
    if (rangePartitioning != null) __obj.updateDynamic("rangePartitioning")(rangePartitioning.asInstanceOf[js.Any])
    if (schemaUpdateOptions != null) __obj.updateDynamic("schemaUpdateOptions")(schemaUpdateOptions.asInstanceOf[js.Any])
    if (tableDefinitions != null) __obj.updateDynamic("tableDefinitions")(tableDefinitions.asInstanceOf[js.Any])
    if (timePartitioning != null) __obj.updateDynamic("timePartitioning")(timePartitioning.asInstanceOf[js.Any])
    if (!js.isUndefined(useLegacySql)) __obj.updateDynamic("useLegacySql")(useLegacySql.asInstanceOf[js.Any])
    if (!js.isUndefined(useQueryCache)) __obj.updateDynamic("useQueryCache")(useQueryCache.asInstanceOf[js.Any])
    if (userDefinedFunctionResources != null) __obj.updateDynamic("userDefinedFunctionResources")(userDefinedFunctionResources.asInstanceOf[js.Any])
    if (writeDisposition != null) __obj.updateDynamic("writeDisposition")(writeDisposition.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobConfigurationQuery]
  }
}


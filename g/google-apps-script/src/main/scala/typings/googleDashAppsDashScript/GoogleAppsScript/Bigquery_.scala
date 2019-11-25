package typings.googleDashAppsDashScript.GoogleAppsScript

import typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Collection.DatasetsCollection
import typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Collection.JobsCollection
import typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Collection.ProjectsCollection
import typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Collection.TabledataCollection
import typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Collection.TablesCollection
import typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Schema.BigQueryModelTraining
import typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Schema.BigtableColumn
import typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Schema.BigtableColumnFamily
import typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Schema.BigtableOptions
import typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Schema.BqmlIterationResult
import typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Schema.BqmlTrainingRun
import typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Schema.BqmlTrainingRunTrainingOptions
import typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Schema.Clustering
import typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Schema.CsvOptions
import typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Schema.Dataset
import typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Schema.DatasetAccess
import typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Schema.DatasetReference
import typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Schema.DestinationTableProperties
import typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Schema.EncryptionConfiguration
import typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Schema.ErrorProto
import typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Schema.ExplainQueryStage
import typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Schema.ExplainQueryStep
import typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Schema.ExternalDataConfiguration
import typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Schema.GoogleSheetsOptions
import typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Schema.Job
import typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Schema.JobConfiguration
import typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Schema.JobConfigurationExtract
import typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Schema.JobConfigurationLoad
import typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Schema.JobConfigurationQuery
import typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Schema.JobConfigurationTableCopy
import typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Schema.JobReference
import typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Schema.JobStatistics
import typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Schema.JobStatistics2
import typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Schema.JobStatistics2ReservationUsage
import typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Schema.JobStatistics3
import typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Schema.JobStatistics4
import typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Schema.JobStatisticsReservationUsage
import typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Schema.JobStatus
import typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Schema.MaterializedViewDefinition
import typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Schema.ModelDefinition
import typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Schema.ModelDefinitionModelOptions
import typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Schema.QueryParameter
import typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Schema.QueryParameterType
import typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Schema.QueryParameterTypeStructTypes
import typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Schema.QueryParameterValue
import typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Schema.QueryRequest
import typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Schema.QueryTimelineSample
import typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Schema.RangePartitioning
import typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Schema.RangePartitioningRange
import typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Schema.RoutineReference
import typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Schema.Streamingbuffer
import typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Schema.Table
import typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Schema.TableDataInsertAllRequest
import typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Schema.TableDataInsertAllRequestRows
import typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Schema.TableFieldSchema
import typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Schema.TableFieldSchemaCategories
import typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Schema.TableReference
import typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Schema.TableSchema
import typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Schema.TimePartitioning
import typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Schema.UserDefinedFunctionResource
import typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Schema.ViewDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("Bigquery")
trait Bigquery_ extends js.Object {
  var Datasets: js.UndefOr[DatasetsCollection] = js.undefined
  var Jobs: js.UndefOr[JobsCollection] = js.undefined
  var Projects: js.UndefOr[ProjectsCollection] = js.undefined
  var Tabledata: js.UndefOr[TabledataCollection] = js.undefined
  var Tables: js.UndefOr[TablesCollection] = js.undefined
  // Create a new instance of BigQueryModelTraining
  def newBigQueryModelTraining(): BigQueryModelTraining
  // Create a new instance of BigtableColumn
  def newBigtableColumn(): BigtableColumn
  // Create a new instance of BigtableColumnFamily
  def newBigtableColumnFamily(): BigtableColumnFamily
  // Create a new instance of BigtableOptions
  def newBigtableOptions(): BigtableOptions
  // Create a new instance of BqmlIterationResult
  def newBqmlIterationResult(): BqmlIterationResult
  // Create a new instance of BqmlTrainingRun
  def newBqmlTrainingRun(): BqmlTrainingRun
  // Create a new instance of BqmlTrainingRunTrainingOptions
  def newBqmlTrainingRunTrainingOptions(): BqmlTrainingRunTrainingOptions
  // Create a new instance of Clustering
  def newClustering(): Clustering
  // Create a new instance of CsvOptions
  def newCsvOptions(): CsvOptions
  // Create a new instance of Dataset
  def newDataset(): Dataset
  // Create a new instance of DatasetAccess
  def newDatasetAccess(): DatasetAccess
  // Create a new instance of DatasetReference
  def newDatasetReference(): DatasetReference
  // Create a new instance of DestinationTableProperties
  def newDestinationTableProperties(): DestinationTableProperties
  // Create a new instance of EncryptionConfiguration
  def newEncryptionConfiguration(): EncryptionConfiguration
  // Create a new instance of ErrorProto
  def newErrorProto(): ErrorProto
  // Create a new instance of ExplainQueryStage
  def newExplainQueryStage(): ExplainQueryStage
  // Create a new instance of ExplainQueryStep
  def newExplainQueryStep(): ExplainQueryStep
  // Create a new instance of ExternalDataConfiguration
  def newExternalDataConfiguration(): ExternalDataConfiguration
  // Create a new instance of GoogleSheetsOptions
  def newGoogleSheetsOptions(): GoogleSheetsOptions
  // Create a new instance of Job
  def newJob(): Job
  // Create a new instance of JobConfiguration
  def newJobConfiguration(): JobConfiguration
  // Create a new instance of JobConfigurationExtract
  def newJobConfigurationExtract(): JobConfigurationExtract
  // Create a new instance of JobConfigurationLoad
  def newJobConfigurationLoad(): JobConfigurationLoad
  // Create a new instance of JobConfigurationQuery
  def newJobConfigurationQuery(): JobConfigurationQuery
  // Create a new instance of JobConfigurationTableCopy
  def newJobConfigurationTableCopy(): JobConfigurationTableCopy
  // Create a new instance of JobReference
  def newJobReference(): JobReference
  // Create a new instance of JobStatistics
  def newJobStatistics(): JobStatistics
  // Create a new instance of JobStatistics2
  def newJobStatistics2(): JobStatistics2
  // Create a new instance of JobStatistics2ReservationUsage
  def newJobStatistics2ReservationUsage(): JobStatistics2ReservationUsage
  // Create a new instance of JobStatistics3
  def newJobStatistics3(): JobStatistics3
  // Create a new instance of JobStatistics4
  def newJobStatistics4(): JobStatistics4
  // Create a new instance of JobStatisticsReservationUsage
  def newJobStatisticsReservationUsage(): JobStatisticsReservationUsage
  // Create a new instance of JobStatus
  def newJobStatus(): JobStatus
  // Create a new instance of MaterializedViewDefinition
  def newMaterializedViewDefinition(): MaterializedViewDefinition
  // Create a new instance of ModelDefinition
  def newModelDefinition(): ModelDefinition
  // Create a new instance of ModelDefinitionModelOptions
  def newModelDefinitionModelOptions(): ModelDefinitionModelOptions
  // Create a new instance of QueryParameter
  def newQueryParameter(): QueryParameter
  // Create a new instance of QueryParameterType
  def newQueryParameterType(): QueryParameterType
  // Create a new instance of QueryParameterTypeStructTypes
  def newQueryParameterTypeStructTypes(): QueryParameterTypeStructTypes
  // Create a new instance of QueryParameterValue
  def newQueryParameterValue(): QueryParameterValue
  // Create a new instance of QueryRequest
  def newQueryRequest(): QueryRequest
  // Create a new instance of QueryTimelineSample
  def newQueryTimelineSample(): QueryTimelineSample
  // Create a new instance of RangePartitioning
  def newRangePartitioning(): RangePartitioning
  // Create a new instance of RangePartitioningRange
  def newRangePartitioningRange(): RangePartitioningRange
  // Create a new instance of RoutineReference
  def newRoutineReference(): RoutineReference
  // Create a new instance of Streamingbuffer
  def newStreamingbuffer(): Streamingbuffer
  // Create a new instance of Table
  def newTable(): Table
  // Create a new instance of TableDataInsertAllRequest
  def newTableDataInsertAllRequest(): TableDataInsertAllRequest
  // Create a new instance of TableDataInsertAllRequestRows
  def newTableDataInsertAllRequestRows(): TableDataInsertAllRequestRows
  // Create a new instance of TableFieldSchema
  def newTableFieldSchema(): TableFieldSchema
  // Create a new instance of TableFieldSchemaCategories
  def newTableFieldSchemaCategories(): TableFieldSchemaCategories
  // Create a new instance of TableReference
  def newTableReference(): TableReference
  // Create a new instance of TableSchema
  def newTableSchema(): TableSchema
  // Create a new instance of TimePartitioning
  def newTimePartitioning(): TimePartitioning
  // Create a new instance of UserDefinedFunctionResource
  def newUserDefinedFunctionResource(): UserDefinedFunctionResource
  // Create a new instance of ViewDefinition
  def newViewDefinition(): ViewDefinition
}

object Bigquery_ {
  @scala.inline
  def apply(
    newBigQueryModelTraining: () => BigQueryModelTraining,
    newBigtableColumn: () => BigtableColumn,
    newBigtableColumnFamily: () => BigtableColumnFamily,
    newBigtableOptions: () => BigtableOptions,
    newBqmlIterationResult: () => BqmlIterationResult,
    newBqmlTrainingRun: () => BqmlTrainingRun,
    newBqmlTrainingRunTrainingOptions: () => BqmlTrainingRunTrainingOptions,
    newClustering: () => Clustering,
    newCsvOptions: () => CsvOptions,
    newDataset: () => Dataset,
    newDatasetAccess: () => DatasetAccess,
    newDatasetReference: () => DatasetReference,
    newDestinationTableProperties: () => DestinationTableProperties,
    newEncryptionConfiguration: () => EncryptionConfiguration,
    newErrorProto: () => ErrorProto,
    newExplainQueryStage: () => ExplainQueryStage,
    newExplainQueryStep: () => ExplainQueryStep,
    newExternalDataConfiguration: () => ExternalDataConfiguration,
    newGoogleSheetsOptions: () => GoogleSheetsOptions,
    newJob: () => Job,
    newJobConfiguration: () => JobConfiguration,
    newJobConfigurationExtract: () => JobConfigurationExtract,
    newJobConfigurationLoad: () => JobConfigurationLoad,
    newJobConfigurationQuery: () => JobConfigurationQuery,
    newJobConfigurationTableCopy: () => JobConfigurationTableCopy,
    newJobReference: () => JobReference,
    newJobStatistics: () => JobStatistics,
    newJobStatistics2: () => JobStatistics2,
    newJobStatistics2ReservationUsage: () => JobStatistics2ReservationUsage,
    newJobStatistics3: () => JobStatistics3,
    newJobStatistics4: () => JobStatistics4,
    newJobStatisticsReservationUsage: () => JobStatisticsReservationUsage,
    newJobStatus: () => JobStatus,
    newMaterializedViewDefinition: () => MaterializedViewDefinition,
    newModelDefinition: () => ModelDefinition,
    newModelDefinitionModelOptions: () => ModelDefinitionModelOptions,
    newQueryParameter: () => QueryParameter,
    newQueryParameterType: () => QueryParameterType,
    newQueryParameterTypeStructTypes: () => QueryParameterTypeStructTypes,
    newQueryParameterValue: () => QueryParameterValue,
    newQueryRequest: () => QueryRequest,
    newQueryTimelineSample: () => QueryTimelineSample,
    newRangePartitioning: () => RangePartitioning,
    newRangePartitioningRange: () => RangePartitioningRange,
    newRoutineReference: () => RoutineReference,
    newStreamingbuffer: () => Streamingbuffer,
    newTable: () => Table,
    newTableDataInsertAllRequest: () => TableDataInsertAllRequest,
    newTableDataInsertAllRequestRows: () => TableDataInsertAllRequestRows,
    newTableFieldSchema: () => TableFieldSchema,
    newTableFieldSchemaCategories: () => TableFieldSchemaCategories,
    newTableReference: () => TableReference,
    newTableSchema: () => TableSchema,
    newTimePartitioning: () => TimePartitioning,
    newUserDefinedFunctionResource: () => UserDefinedFunctionResource,
    newViewDefinition: () => ViewDefinition,
    Datasets: DatasetsCollection = null,
    Jobs: JobsCollection = null,
    Projects: ProjectsCollection = null,
    Tabledata: TabledataCollection = null,
    Tables: TablesCollection = null
  ): Bigquery_ = {
    val __obj = js.Dynamic.literal(newBigQueryModelTraining = js.Any.fromFunction0(newBigQueryModelTraining), newBigtableColumn = js.Any.fromFunction0(newBigtableColumn), newBigtableColumnFamily = js.Any.fromFunction0(newBigtableColumnFamily), newBigtableOptions = js.Any.fromFunction0(newBigtableOptions), newBqmlIterationResult = js.Any.fromFunction0(newBqmlIterationResult), newBqmlTrainingRun = js.Any.fromFunction0(newBqmlTrainingRun), newBqmlTrainingRunTrainingOptions = js.Any.fromFunction0(newBqmlTrainingRunTrainingOptions), newClustering = js.Any.fromFunction0(newClustering), newCsvOptions = js.Any.fromFunction0(newCsvOptions), newDataset = js.Any.fromFunction0(newDataset), newDatasetAccess = js.Any.fromFunction0(newDatasetAccess), newDatasetReference = js.Any.fromFunction0(newDatasetReference), newDestinationTableProperties = js.Any.fromFunction0(newDestinationTableProperties), newEncryptionConfiguration = js.Any.fromFunction0(newEncryptionConfiguration), newErrorProto = js.Any.fromFunction0(newErrorProto), newExplainQueryStage = js.Any.fromFunction0(newExplainQueryStage), newExplainQueryStep = js.Any.fromFunction0(newExplainQueryStep), newExternalDataConfiguration = js.Any.fromFunction0(newExternalDataConfiguration), newGoogleSheetsOptions = js.Any.fromFunction0(newGoogleSheetsOptions), newJob = js.Any.fromFunction0(newJob), newJobConfiguration = js.Any.fromFunction0(newJobConfiguration), newJobConfigurationExtract = js.Any.fromFunction0(newJobConfigurationExtract), newJobConfigurationLoad = js.Any.fromFunction0(newJobConfigurationLoad), newJobConfigurationQuery = js.Any.fromFunction0(newJobConfigurationQuery), newJobConfigurationTableCopy = js.Any.fromFunction0(newJobConfigurationTableCopy), newJobReference = js.Any.fromFunction0(newJobReference), newJobStatistics = js.Any.fromFunction0(newJobStatistics), newJobStatistics2 = js.Any.fromFunction0(newJobStatistics2), newJobStatistics2ReservationUsage = js.Any.fromFunction0(newJobStatistics2ReservationUsage), newJobStatistics3 = js.Any.fromFunction0(newJobStatistics3), newJobStatistics4 = js.Any.fromFunction0(newJobStatistics4), newJobStatisticsReservationUsage = js.Any.fromFunction0(newJobStatisticsReservationUsage), newJobStatus = js.Any.fromFunction0(newJobStatus), newMaterializedViewDefinition = js.Any.fromFunction0(newMaterializedViewDefinition), newModelDefinition = js.Any.fromFunction0(newModelDefinition), newModelDefinitionModelOptions = js.Any.fromFunction0(newModelDefinitionModelOptions), newQueryParameter = js.Any.fromFunction0(newQueryParameter), newQueryParameterType = js.Any.fromFunction0(newQueryParameterType), newQueryParameterTypeStructTypes = js.Any.fromFunction0(newQueryParameterTypeStructTypes), newQueryParameterValue = js.Any.fromFunction0(newQueryParameterValue), newQueryRequest = js.Any.fromFunction0(newQueryRequest), newQueryTimelineSample = js.Any.fromFunction0(newQueryTimelineSample), newRangePartitioning = js.Any.fromFunction0(newRangePartitioning), newRangePartitioningRange = js.Any.fromFunction0(newRangePartitioningRange), newRoutineReference = js.Any.fromFunction0(newRoutineReference), newStreamingbuffer = js.Any.fromFunction0(newStreamingbuffer), newTable = js.Any.fromFunction0(newTable), newTableDataInsertAllRequest = js.Any.fromFunction0(newTableDataInsertAllRequest), newTableDataInsertAllRequestRows = js.Any.fromFunction0(newTableDataInsertAllRequestRows), newTableFieldSchema = js.Any.fromFunction0(newTableFieldSchema), newTableFieldSchemaCategories = js.Any.fromFunction0(newTableFieldSchemaCategories), newTableReference = js.Any.fromFunction0(newTableReference), newTableSchema = js.Any.fromFunction0(newTableSchema), newTimePartitioning = js.Any.fromFunction0(newTimePartitioning), newUserDefinedFunctionResource = js.Any.fromFunction0(newUserDefinedFunctionResource), newViewDefinition = js.Any.fromFunction0(newViewDefinition))
    if (Datasets != null) __obj.updateDynamic("Datasets")(Datasets.asInstanceOf[js.Any])
    if (Jobs != null) __obj.updateDynamic("Jobs")(Jobs.asInstanceOf[js.Any])
    if (Projects != null) __obj.updateDynamic("Projects")(Projects.asInstanceOf[js.Any])
    if (Tabledata != null) __obj.updateDynamic("Tabledata")(Tabledata.asInstanceOf[js.Any])
    if (Tables != null) __obj.updateDynamic("Tables")(Tables.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bigquery_]
  }
}


package typings.googleAppsScript.GoogleAppsScript

import typings.googleAppsScript.GoogleAppsScript.Bigquery.Collection.DatasetsCollection
import typings.googleAppsScript.GoogleAppsScript.Bigquery.Collection.JobsCollection
import typings.googleAppsScript.GoogleAppsScript.Bigquery.Collection.ProjectsCollection
import typings.googleAppsScript.GoogleAppsScript.Bigquery.Collection.TabledataCollection
import typings.googleAppsScript.GoogleAppsScript.Bigquery.Collection.TablesCollection
import typings.googleAppsScript.GoogleAppsScript.Bigquery.Schema.BigQueryModelTraining
import typings.googleAppsScript.GoogleAppsScript.Bigquery.Schema.BigtableColumn
import typings.googleAppsScript.GoogleAppsScript.Bigquery.Schema.BigtableColumnFamily
import typings.googleAppsScript.GoogleAppsScript.Bigquery.Schema.BigtableOptions
import typings.googleAppsScript.GoogleAppsScript.Bigquery.Schema.BqmlIterationResult
import typings.googleAppsScript.GoogleAppsScript.Bigquery.Schema.BqmlTrainingRun
import typings.googleAppsScript.GoogleAppsScript.Bigquery.Schema.BqmlTrainingRunTrainingOptions
import typings.googleAppsScript.GoogleAppsScript.Bigquery.Schema.Clustering
import typings.googleAppsScript.GoogleAppsScript.Bigquery.Schema.CsvOptions
import typings.googleAppsScript.GoogleAppsScript.Bigquery.Schema.Dataset
import typings.googleAppsScript.GoogleAppsScript.Bigquery.Schema.DatasetAccess
import typings.googleAppsScript.GoogleAppsScript.Bigquery.Schema.DatasetReference
import typings.googleAppsScript.GoogleAppsScript.Bigquery.Schema.DestinationTableProperties
import typings.googleAppsScript.GoogleAppsScript.Bigquery.Schema.EncryptionConfiguration
import typings.googleAppsScript.GoogleAppsScript.Bigquery.Schema.ErrorProto
import typings.googleAppsScript.GoogleAppsScript.Bigquery.Schema.ExplainQueryStage
import typings.googleAppsScript.GoogleAppsScript.Bigquery.Schema.ExplainQueryStep
import typings.googleAppsScript.GoogleAppsScript.Bigquery.Schema.ExternalDataConfiguration
import typings.googleAppsScript.GoogleAppsScript.Bigquery.Schema.GoogleSheetsOptions
import typings.googleAppsScript.GoogleAppsScript.Bigquery.Schema.Job
import typings.googleAppsScript.GoogleAppsScript.Bigquery.Schema.JobConfiguration
import typings.googleAppsScript.GoogleAppsScript.Bigquery.Schema.JobConfigurationExtract
import typings.googleAppsScript.GoogleAppsScript.Bigquery.Schema.JobConfigurationLoad
import typings.googleAppsScript.GoogleAppsScript.Bigquery.Schema.JobConfigurationQuery
import typings.googleAppsScript.GoogleAppsScript.Bigquery.Schema.JobConfigurationTableCopy
import typings.googleAppsScript.GoogleAppsScript.Bigquery.Schema.JobReference
import typings.googleAppsScript.GoogleAppsScript.Bigquery.Schema.JobStatistics
import typings.googleAppsScript.GoogleAppsScript.Bigquery.Schema.JobStatistics2
import typings.googleAppsScript.GoogleAppsScript.Bigquery.Schema.JobStatistics2ReservationUsage
import typings.googleAppsScript.GoogleAppsScript.Bigquery.Schema.JobStatistics3
import typings.googleAppsScript.GoogleAppsScript.Bigquery.Schema.JobStatistics4
import typings.googleAppsScript.GoogleAppsScript.Bigquery.Schema.JobStatisticsReservationUsage
import typings.googleAppsScript.GoogleAppsScript.Bigquery.Schema.JobStatus
import typings.googleAppsScript.GoogleAppsScript.Bigquery.Schema.MaterializedViewDefinition
import typings.googleAppsScript.GoogleAppsScript.Bigquery.Schema.ModelDefinition
import typings.googleAppsScript.GoogleAppsScript.Bigquery.Schema.ModelDefinitionModelOptions
import typings.googleAppsScript.GoogleAppsScript.Bigquery.Schema.QueryParameter
import typings.googleAppsScript.GoogleAppsScript.Bigquery.Schema.QueryParameterType
import typings.googleAppsScript.GoogleAppsScript.Bigquery.Schema.QueryParameterTypeStructTypes
import typings.googleAppsScript.GoogleAppsScript.Bigquery.Schema.QueryParameterValue
import typings.googleAppsScript.GoogleAppsScript.Bigquery.Schema.QueryRequest
import typings.googleAppsScript.GoogleAppsScript.Bigquery.Schema.QueryTimelineSample
import typings.googleAppsScript.GoogleAppsScript.Bigquery.Schema.RangePartitioning
import typings.googleAppsScript.GoogleAppsScript.Bigquery.Schema.RangePartitioningRange
import typings.googleAppsScript.GoogleAppsScript.Bigquery.Schema.RoutineReference
import typings.googleAppsScript.GoogleAppsScript.Bigquery.Schema.Streamingbuffer
import typings.googleAppsScript.GoogleAppsScript.Bigquery.Schema.Table
import typings.googleAppsScript.GoogleAppsScript.Bigquery.Schema.TableDataInsertAllRequest
import typings.googleAppsScript.GoogleAppsScript.Bigquery.Schema.TableDataInsertAllRequestRows
import typings.googleAppsScript.GoogleAppsScript.Bigquery.Schema.TableFieldSchema
import typings.googleAppsScript.GoogleAppsScript.Bigquery.Schema.TableFieldSchemaCategories
import typings.googleAppsScript.GoogleAppsScript.Bigquery.Schema.TableReference
import typings.googleAppsScript.GoogleAppsScript.Bigquery.Schema.TableSchema
import typings.googleAppsScript.GoogleAppsScript.Bigquery.Schema.TimePartitioning
import typings.googleAppsScript.GoogleAppsScript.Bigquery.Schema.UserDefinedFunctionResource
import typings.googleAppsScript.GoogleAppsScript.Bigquery.Schema.ViewDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bigquery_ extends js.Object {
  var Datasets: js.UndefOr[DatasetsCollection] = js.native
  var Jobs: js.UndefOr[JobsCollection] = js.native
  var Projects: js.UndefOr[ProjectsCollection] = js.native
  var Tabledata: js.UndefOr[TabledataCollection] = js.native
  var Tables: js.UndefOr[TablesCollection] = js.native
  // Create a new instance of BigQueryModelTraining
  def newBigQueryModelTraining(): BigQueryModelTraining = js.native
  // Create a new instance of BigtableColumn
  def newBigtableColumn(): BigtableColumn = js.native
  // Create a new instance of BigtableColumnFamily
  def newBigtableColumnFamily(): BigtableColumnFamily = js.native
  // Create a new instance of BigtableOptions
  def newBigtableOptions(): BigtableOptions = js.native
  // Create a new instance of BqmlIterationResult
  def newBqmlIterationResult(): BqmlIterationResult = js.native
  // Create a new instance of BqmlTrainingRun
  def newBqmlTrainingRun(): BqmlTrainingRun = js.native
  // Create a new instance of BqmlTrainingRunTrainingOptions
  def newBqmlTrainingRunTrainingOptions(): BqmlTrainingRunTrainingOptions = js.native
  // Create a new instance of Clustering
  def newClustering(): Clustering = js.native
  // Create a new instance of CsvOptions
  def newCsvOptions(): CsvOptions = js.native
  // Create a new instance of Dataset
  def newDataset(): Dataset = js.native
  // Create a new instance of DatasetAccess
  def newDatasetAccess(): DatasetAccess = js.native
  // Create a new instance of DatasetReference
  def newDatasetReference(): DatasetReference = js.native
  // Create a new instance of DestinationTableProperties
  def newDestinationTableProperties(): DestinationTableProperties = js.native
  // Create a new instance of EncryptionConfiguration
  def newEncryptionConfiguration(): EncryptionConfiguration = js.native
  // Create a new instance of ErrorProto
  def newErrorProto(): ErrorProto = js.native
  // Create a new instance of ExplainQueryStage
  def newExplainQueryStage(): ExplainQueryStage = js.native
  // Create a new instance of ExplainQueryStep
  def newExplainQueryStep(): ExplainQueryStep = js.native
  // Create a new instance of ExternalDataConfiguration
  def newExternalDataConfiguration(): ExternalDataConfiguration = js.native
  // Create a new instance of GoogleSheetsOptions
  def newGoogleSheetsOptions(): GoogleSheetsOptions = js.native
  // Create a new instance of Job
  def newJob(): Job = js.native
  // Create a new instance of JobConfiguration
  def newJobConfiguration(): JobConfiguration = js.native
  // Create a new instance of JobConfigurationExtract
  def newJobConfigurationExtract(): JobConfigurationExtract = js.native
  // Create a new instance of JobConfigurationLoad
  def newJobConfigurationLoad(): JobConfigurationLoad = js.native
  // Create a new instance of JobConfigurationQuery
  def newJobConfigurationQuery(): JobConfigurationQuery = js.native
  // Create a new instance of JobConfigurationTableCopy
  def newJobConfigurationTableCopy(): JobConfigurationTableCopy = js.native
  // Create a new instance of JobReference
  def newJobReference(): JobReference = js.native
  // Create a new instance of JobStatistics
  def newJobStatistics(): JobStatistics = js.native
  // Create a new instance of JobStatistics2
  def newJobStatistics2(): JobStatistics2 = js.native
  // Create a new instance of JobStatistics2ReservationUsage
  def newJobStatistics2ReservationUsage(): JobStatistics2ReservationUsage = js.native
  // Create a new instance of JobStatistics3
  def newJobStatistics3(): JobStatistics3 = js.native
  // Create a new instance of JobStatistics4
  def newJobStatistics4(): JobStatistics4 = js.native
  // Create a new instance of JobStatisticsReservationUsage
  def newJobStatisticsReservationUsage(): JobStatisticsReservationUsage = js.native
  // Create a new instance of JobStatus
  def newJobStatus(): JobStatus = js.native
  // Create a new instance of MaterializedViewDefinition
  def newMaterializedViewDefinition(): MaterializedViewDefinition = js.native
  // Create a new instance of ModelDefinition
  def newModelDefinition(): ModelDefinition = js.native
  // Create a new instance of ModelDefinitionModelOptions
  def newModelDefinitionModelOptions(): ModelDefinitionModelOptions = js.native
  // Create a new instance of QueryParameter
  def newQueryParameter(): QueryParameter = js.native
  // Create a new instance of QueryParameterType
  def newQueryParameterType(): QueryParameterType = js.native
  // Create a new instance of QueryParameterTypeStructTypes
  def newQueryParameterTypeStructTypes(): QueryParameterTypeStructTypes = js.native
  // Create a new instance of QueryParameterValue
  def newQueryParameterValue(): QueryParameterValue = js.native
  // Create a new instance of QueryRequest
  def newQueryRequest(): QueryRequest = js.native
  // Create a new instance of QueryTimelineSample
  def newQueryTimelineSample(): QueryTimelineSample = js.native
  // Create a new instance of RangePartitioning
  def newRangePartitioning(): RangePartitioning = js.native
  // Create a new instance of RangePartitioningRange
  def newRangePartitioningRange(): RangePartitioningRange = js.native
  // Create a new instance of RoutineReference
  def newRoutineReference(): RoutineReference = js.native
  // Create a new instance of Streamingbuffer
  def newStreamingbuffer(): Streamingbuffer = js.native
  // Create a new instance of Table
  def newTable(): Table = js.native
  // Create a new instance of TableDataInsertAllRequest
  def newTableDataInsertAllRequest(): TableDataInsertAllRequest = js.native
  // Create a new instance of TableDataInsertAllRequestRows
  def newTableDataInsertAllRequestRows(): TableDataInsertAllRequestRows = js.native
  // Create a new instance of TableFieldSchema
  def newTableFieldSchema(): TableFieldSchema = js.native
  // Create a new instance of TableFieldSchemaCategories
  def newTableFieldSchemaCategories(): TableFieldSchemaCategories = js.native
  // Create a new instance of TableReference
  def newTableReference(): TableReference = js.native
  // Create a new instance of TableSchema
  def newTableSchema(): TableSchema = js.native
  // Create a new instance of TimePartitioning
  def newTimePartitioning(): TimePartitioning = js.native
  // Create a new instance of UserDefinedFunctionResource
  def newUserDefinedFunctionResource(): UserDefinedFunctionResource = js.native
  // Create a new instance of ViewDefinition
  def newViewDefinition(): ViewDefinition = js.native
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
    newViewDefinition: () => ViewDefinition
  ): Bigquery_ = {
    val __obj = js.Dynamic.literal(newBigQueryModelTraining = js.Any.fromFunction0(newBigQueryModelTraining), newBigtableColumn = js.Any.fromFunction0(newBigtableColumn), newBigtableColumnFamily = js.Any.fromFunction0(newBigtableColumnFamily), newBigtableOptions = js.Any.fromFunction0(newBigtableOptions), newBqmlIterationResult = js.Any.fromFunction0(newBqmlIterationResult), newBqmlTrainingRun = js.Any.fromFunction0(newBqmlTrainingRun), newBqmlTrainingRunTrainingOptions = js.Any.fromFunction0(newBqmlTrainingRunTrainingOptions), newClustering = js.Any.fromFunction0(newClustering), newCsvOptions = js.Any.fromFunction0(newCsvOptions), newDataset = js.Any.fromFunction0(newDataset), newDatasetAccess = js.Any.fromFunction0(newDatasetAccess), newDatasetReference = js.Any.fromFunction0(newDatasetReference), newDestinationTableProperties = js.Any.fromFunction0(newDestinationTableProperties), newEncryptionConfiguration = js.Any.fromFunction0(newEncryptionConfiguration), newErrorProto = js.Any.fromFunction0(newErrorProto), newExplainQueryStage = js.Any.fromFunction0(newExplainQueryStage), newExplainQueryStep = js.Any.fromFunction0(newExplainQueryStep), newExternalDataConfiguration = js.Any.fromFunction0(newExternalDataConfiguration), newGoogleSheetsOptions = js.Any.fromFunction0(newGoogleSheetsOptions), newJob = js.Any.fromFunction0(newJob), newJobConfiguration = js.Any.fromFunction0(newJobConfiguration), newJobConfigurationExtract = js.Any.fromFunction0(newJobConfigurationExtract), newJobConfigurationLoad = js.Any.fromFunction0(newJobConfigurationLoad), newJobConfigurationQuery = js.Any.fromFunction0(newJobConfigurationQuery), newJobConfigurationTableCopy = js.Any.fromFunction0(newJobConfigurationTableCopy), newJobReference = js.Any.fromFunction0(newJobReference), newJobStatistics = js.Any.fromFunction0(newJobStatistics), newJobStatistics2 = js.Any.fromFunction0(newJobStatistics2), newJobStatistics2ReservationUsage = js.Any.fromFunction0(newJobStatistics2ReservationUsage), newJobStatistics3 = js.Any.fromFunction0(newJobStatistics3), newJobStatistics4 = js.Any.fromFunction0(newJobStatistics4), newJobStatisticsReservationUsage = js.Any.fromFunction0(newJobStatisticsReservationUsage), newJobStatus = js.Any.fromFunction0(newJobStatus), newMaterializedViewDefinition = js.Any.fromFunction0(newMaterializedViewDefinition), newModelDefinition = js.Any.fromFunction0(newModelDefinition), newModelDefinitionModelOptions = js.Any.fromFunction0(newModelDefinitionModelOptions), newQueryParameter = js.Any.fromFunction0(newQueryParameter), newQueryParameterType = js.Any.fromFunction0(newQueryParameterType), newQueryParameterTypeStructTypes = js.Any.fromFunction0(newQueryParameterTypeStructTypes), newQueryParameterValue = js.Any.fromFunction0(newQueryParameterValue), newQueryRequest = js.Any.fromFunction0(newQueryRequest), newQueryTimelineSample = js.Any.fromFunction0(newQueryTimelineSample), newRangePartitioning = js.Any.fromFunction0(newRangePartitioning), newRangePartitioningRange = js.Any.fromFunction0(newRangePartitioningRange), newRoutineReference = js.Any.fromFunction0(newRoutineReference), newStreamingbuffer = js.Any.fromFunction0(newStreamingbuffer), newTable = js.Any.fromFunction0(newTable), newTableDataInsertAllRequest = js.Any.fromFunction0(newTableDataInsertAllRequest), newTableDataInsertAllRequestRows = js.Any.fromFunction0(newTableDataInsertAllRequestRows), newTableFieldSchema = js.Any.fromFunction0(newTableFieldSchema), newTableFieldSchemaCategories = js.Any.fromFunction0(newTableFieldSchemaCategories), newTableReference = js.Any.fromFunction0(newTableReference), newTableSchema = js.Any.fromFunction0(newTableSchema), newTimePartitioning = js.Any.fromFunction0(newTimePartitioning), newUserDefinedFunctionResource = js.Any.fromFunction0(newUserDefinedFunctionResource), newViewDefinition = js.Any.fromFunction0(newViewDefinition))
    __obj.asInstanceOf[Bigquery_]
  }
  @scala.inline
  implicit class Bigquery_Ops[Self <: Bigquery_] (val x: Self) extends AnyVal {
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
    def setNewBigQueryModelTraining(value: () => BigQueryModelTraining): Self = this.set("newBigQueryModelTraining", js.Any.fromFunction0(value))
    @scala.inline
    def setNewBigtableColumn(value: () => BigtableColumn): Self = this.set("newBigtableColumn", js.Any.fromFunction0(value))
    @scala.inline
    def setNewBigtableColumnFamily(value: () => BigtableColumnFamily): Self = this.set("newBigtableColumnFamily", js.Any.fromFunction0(value))
    @scala.inline
    def setNewBigtableOptions(value: () => BigtableOptions): Self = this.set("newBigtableOptions", js.Any.fromFunction0(value))
    @scala.inline
    def setNewBqmlIterationResult(value: () => BqmlIterationResult): Self = this.set("newBqmlIterationResult", js.Any.fromFunction0(value))
    @scala.inline
    def setNewBqmlTrainingRun(value: () => BqmlTrainingRun): Self = this.set("newBqmlTrainingRun", js.Any.fromFunction0(value))
    @scala.inline
    def setNewBqmlTrainingRunTrainingOptions(value: () => BqmlTrainingRunTrainingOptions): Self = this.set("newBqmlTrainingRunTrainingOptions", js.Any.fromFunction0(value))
    @scala.inline
    def setNewClustering(value: () => Clustering): Self = this.set("newClustering", js.Any.fromFunction0(value))
    @scala.inline
    def setNewCsvOptions(value: () => CsvOptions): Self = this.set("newCsvOptions", js.Any.fromFunction0(value))
    @scala.inline
    def setNewDataset(value: () => Dataset): Self = this.set("newDataset", js.Any.fromFunction0(value))
    @scala.inline
    def setNewDatasetAccess(value: () => DatasetAccess): Self = this.set("newDatasetAccess", js.Any.fromFunction0(value))
    @scala.inline
    def setNewDatasetReference(value: () => DatasetReference): Self = this.set("newDatasetReference", js.Any.fromFunction0(value))
    @scala.inline
    def setNewDestinationTableProperties(value: () => DestinationTableProperties): Self = this.set("newDestinationTableProperties", js.Any.fromFunction0(value))
    @scala.inline
    def setNewEncryptionConfiguration(value: () => EncryptionConfiguration): Self = this.set("newEncryptionConfiguration", js.Any.fromFunction0(value))
    @scala.inline
    def setNewErrorProto(value: () => ErrorProto): Self = this.set("newErrorProto", js.Any.fromFunction0(value))
    @scala.inline
    def setNewExplainQueryStage(value: () => ExplainQueryStage): Self = this.set("newExplainQueryStage", js.Any.fromFunction0(value))
    @scala.inline
    def setNewExplainQueryStep(value: () => ExplainQueryStep): Self = this.set("newExplainQueryStep", js.Any.fromFunction0(value))
    @scala.inline
    def setNewExternalDataConfiguration(value: () => ExternalDataConfiguration): Self = this.set("newExternalDataConfiguration", js.Any.fromFunction0(value))
    @scala.inline
    def setNewGoogleSheetsOptions(value: () => GoogleSheetsOptions): Self = this.set("newGoogleSheetsOptions", js.Any.fromFunction0(value))
    @scala.inline
    def setNewJob(value: () => Job): Self = this.set("newJob", js.Any.fromFunction0(value))
    @scala.inline
    def setNewJobConfiguration(value: () => JobConfiguration): Self = this.set("newJobConfiguration", js.Any.fromFunction0(value))
    @scala.inline
    def setNewJobConfigurationExtract(value: () => JobConfigurationExtract): Self = this.set("newJobConfigurationExtract", js.Any.fromFunction0(value))
    @scala.inline
    def setNewJobConfigurationLoad(value: () => JobConfigurationLoad): Self = this.set("newJobConfigurationLoad", js.Any.fromFunction0(value))
    @scala.inline
    def setNewJobConfigurationQuery(value: () => JobConfigurationQuery): Self = this.set("newJobConfigurationQuery", js.Any.fromFunction0(value))
    @scala.inline
    def setNewJobConfigurationTableCopy(value: () => JobConfigurationTableCopy): Self = this.set("newJobConfigurationTableCopy", js.Any.fromFunction0(value))
    @scala.inline
    def setNewJobReference(value: () => JobReference): Self = this.set("newJobReference", js.Any.fromFunction0(value))
    @scala.inline
    def setNewJobStatistics(value: () => JobStatistics): Self = this.set("newJobStatistics", js.Any.fromFunction0(value))
    @scala.inline
    def setNewJobStatistics2(value: () => JobStatistics2): Self = this.set("newJobStatistics2", js.Any.fromFunction0(value))
    @scala.inline
    def setNewJobStatistics2ReservationUsage(value: () => JobStatistics2ReservationUsage): Self = this.set("newJobStatistics2ReservationUsage", js.Any.fromFunction0(value))
    @scala.inline
    def setNewJobStatistics3(value: () => JobStatistics3): Self = this.set("newJobStatistics3", js.Any.fromFunction0(value))
    @scala.inline
    def setNewJobStatistics4(value: () => JobStatistics4): Self = this.set("newJobStatistics4", js.Any.fromFunction0(value))
    @scala.inline
    def setNewJobStatisticsReservationUsage(value: () => JobStatisticsReservationUsage): Self = this.set("newJobStatisticsReservationUsage", js.Any.fromFunction0(value))
    @scala.inline
    def setNewJobStatus(value: () => JobStatus): Self = this.set("newJobStatus", js.Any.fromFunction0(value))
    @scala.inline
    def setNewMaterializedViewDefinition(value: () => MaterializedViewDefinition): Self = this.set("newMaterializedViewDefinition", js.Any.fromFunction0(value))
    @scala.inline
    def setNewModelDefinition(value: () => ModelDefinition): Self = this.set("newModelDefinition", js.Any.fromFunction0(value))
    @scala.inline
    def setNewModelDefinitionModelOptions(value: () => ModelDefinitionModelOptions): Self = this.set("newModelDefinitionModelOptions", js.Any.fromFunction0(value))
    @scala.inline
    def setNewQueryParameter(value: () => QueryParameter): Self = this.set("newQueryParameter", js.Any.fromFunction0(value))
    @scala.inline
    def setNewQueryParameterType(value: () => QueryParameterType): Self = this.set("newQueryParameterType", js.Any.fromFunction0(value))
    @scala.inline
    def setNewQueryParameterTypeStructTypes(value: () => QueryParameterTypeStructTypes): Self = this.set("newQueryParameterTypeStructTypes", js.Any.fromFunction0(value))
    @scala.inline
    def setNewQueryParameterValue(value: () => QueryParameterValue): Self = this.set("newQueryParameterValue", js.Any.fromFunction0(value))
    @scala.inline
    def setNewQueryRequest(value: () => QueryRequest): Self = this.set("newQueryRequest", js.Any.fromFunction0(value))
    @scala.inline
    def setNewQueryTimelineSample(value: () => QueryTimelineSample): Self = this.set("newQueryTimelineSample", js.Any.fromFunction0(value))
    @scala.inline
    def setNewRangePartitioning(value: () => RangePartitioning): Self = this.set("newRangePartitioning", js.Any.fromFunction0(value))
    @scala.inline
    def setNewRangePartitioningRange(value: () => RangePartitioningRange): Self = this.set("newRangePartitioningRange", js.Any.fromFunction0(value))
    @scala.inline
    def setNewRoutineReference(value: () => RoutineReference): Self = this.set("newRoutineReference", js.Any.fromFunction0(value))
    @scala.inline
    def setNewStreamingbuffer(value: () => Streamingbuffer): Self = this.set("newStreamingbuffer", js.Any.fromFunction0(value))
    @scala.inline
    def setNewTable(value: () => Table): Self = this.set("newTable", js.Any.fromFunction0(value))
    @scala.inline
    def setNewTableDataInsertAllRequest(value: () => TableDataInsertAllRequest): Self = this.set("newTableDataInsertAllRequest", js.Any.fromFunction0(value))
    @scala.inline
    def setNewTableDataInsertAllRequestRows(value: () => TableDataInsertAllRequestRows): Self = this.set("newTableDataInsertAllRequestRows", js.Any.fromFunction0(value))
    @scala.inline
    def setNewTableFieldSchema(value: () => TableFieldSchema): Self = this.set("newTableFieldSchema", js.Any.fromFunction0(value))
    @scala.inline
    def setNewTableFieldSchemaCategories(value: () => TableFieldSchemaCategories): Self = this.set("newTableFieldSchemaCategories", js.Any.fromFunction0(value))
    @scala.inline
    def setNewTableReference(value: () => TableReference): Self = this.set("newTableReference", js.Any.fromFunction0(value))
    @scala.inline
    def setNewTableSchema(value: () => TableSchema): Self = this.set("newTableSchema", js.Any.fromFunction0(value))
    @scala.inline
    def setNewTimePartitioning(value: () => TimePartitioning): Self = this.set("newTimePartitioning", js.Any.fromFunction0(value))
    @scala.inline
    def setNewUserDefinedFunctionResource(value: () => UserDefinedFunctionResource): Self = this.set("newUserDefinedFunctionResource", js.Any.fromFunction0(value))
    @scala.inline
    def setNewViewDefinition(value: () => ViewDefinition): Self = this.set("newViewDefinition", js.Any.fromFunction0(value))
    @scala.inline
    def setDatasets(value: DatasetsCollection): Self = this.set("Datasets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatasets: Self = this.set("Datasets", js.undefined)
    @scala.inline
    def setJobs(value: JobsCollection): Self = this.set("Jobs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobs: Self = this.set("Jobs", js.undefined)
    @scala.inline
    def setProjects(value: ProjectsCollection): Self = this.set("Projects", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjects: Self = this.set("Projects", js.undefined)
    @scala.inline
    def setTabledata(value: TabledataCollection): Self = this.set("Tabledata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabledata: Self = this.set("Tabledata", js.undefined)
    @scala.inline
    def setTables(value: TablesCollection): Self = this.set("Tables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTables: Self = this.set("Tables", js.undefined)
  }
  
}


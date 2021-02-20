package typings.googleAppsScript.GoogleAppsScript

import typings.googleAppsScript.GoogleAppsScript.BigQuery_.Collection.DatasetsCollection
import typings.googleAppsScript.GoogleAppsScript.BigQuery_.Collection.JobsCollection
import typings.googleAppsScript.GoogleAppsScript.BigQuery_.Collection.ProjectsCollection
import typings.googleAppsScript.GoogleAppsScript.BigQuery_.Collection.TabledataCollection
import typings.googleAppsScript.GoogleAppsScript.BigQuery_.Collection.TablesCollection
import typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema.BigQueryModelTraining
import typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema.BigtableColumn
import typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema.BigtableColumnFamily
import typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema.BigtableOptions
import typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema.BqmlIterationResult
import typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema.BqmlTrainingRun
import typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema.BqmlTrainingRunTrainingOptions
import typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema.Clustering
import typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema.CsvOptions
import typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema.Dataset
import typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema.DatasetAccess
import typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema.DatasetReference
import typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema.DestinationTableProperties
import typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema.EncryptionConfiguration
import typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema.ErrorProto
import typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema.ExplainQueryStage
import typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema.ExplainQueryStep
import typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema.ExternalDataConfiguration
import typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema.GoogleSheetsOptions
import typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema.Job
import typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema.JobConfiguration
import typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema.JobConfigurationExtract
import typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema.JobConfigurationLoad
import typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema.JobConfigurationQuery
import typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema.JobConfigurationTableCopy
import typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema.JobReference
import typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema.JobStatistics
import typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema.JobStatistics2
import typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema.JobStatistics2ReservationUsage
import typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema.JobStatistics3
import typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema.JobStatistics4
import typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema.JobStatisticsReservationUsage
import typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema.JobStatus
import typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema.MaterializedViewDefinition
import typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema.ModelDefinition
import typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema.ModelDefinitionModelOptions
import typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema.QueryParameter
import typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema.QueryParameterType
import typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema.QueryParameterTypeStructTypes
import typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema.QueryParameterValue
import typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema.QueryRequest
import typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema.QueryTimelineSample
import typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema.RangePartitioning
import typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema.RangePartitioningRange
import typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema.RoutineReference
import typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema.Streamingbuffer
import typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema.Table
import typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema.TableDataInsertAllRequest
import typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema.TableDataInsertAllRequestRows
import typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema.TableFieldSchema
import typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema.TableFieldSchemaCategories
import typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema.TableReference
import typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema.TableSchema
import typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema.TimePartitioning
import typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema.UserDefinedFunctionResource
import typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema.ViewDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bigquery extends StObject {
  
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
object Bigquery {
  
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
  ): Bigquery = {
    val __obj = js.Dynamic.literal(newBigQueryModelTraining = js.Any.fromFunction0(newBigQueryModelTraining), newBigtableColumn = js.Any.fromFunction0(newBigtableColumn), newBigtableColumnFamily = js.Any.fromFunction0(newBigtableColumnFamily), newBigtableOptions = js.Any.fromFunction0(newBigtableOptions), newBqmlIterationResult = js.Any.fromFunction0(newBqmlIterationResult), newBqmlTrainingRun = js.Any.fromFunction0(newBqmlTrainingRun), newBqmlTrainingRunTrainingOptions = js.Any.fromFunction0(newBqmlTrainingRunTrainingOptions), newClustering = js.Any.fromFunction0(newClustering), newCsvOptions = js.Any.fromFunction0(newCsvOptions), newDataset = js.Any.fromFunction0(newDataset), newDatasetAccess = js.Any.fromFunction0(newDatasetAccess), newDatasetReference = js.Any.fromFunction0(newDatasetReference), newDestinationTableProperties = js.Any.fromFunction0(newDestinationTableProperties), newEncryptionConfiguration = js.Any.fromFunction0(newEncryptionConfiguration), newErrorProto = js.Any.fromFunction0(newErrorProto), newExplainQueryStage = js.Any.fromFunction0(newExplainQueryStage), newExplainQueryStep = js.Any.fromFunction0(newExplainQueryStep), newExternalDataConfiguration = js.Any.fromFunction0(newExternalDataConfiguration), newGoogleSheetsOptions = js.Any.fromFunction0(newGoogleSheetsOptions), newJob = js.Any.fromFunction0(newJob), newJobConfiguration = js.Any.fromFunction0(newJobConfiguration), newJobConfigurationExtract = js.Any.fromFunction0(newJobConfigurationExtract), newJobConfigurationLoad = js.Any.fromFunction0(newJobConfigurationLoad), newJobConfigurationQuery = js.Any.fromFunction0(newJobConfigurationQuery), newJobConfigurationTableCopy = js.Any.fromFunction0(newJobConfigurationTableCopy), newJobReference = js.Any.fromFunction0(newJobReference), newJobStatistics = js.Any.fromFunction0(newJobStatistics), newJobStatistics2 = js.Any.fromFunction0(newJobStatistics2), newJobStatistics2ReservationUsage = js.Any.fromFunction0(newJobStatistics2ReservationUsage), newJobStatistics3 = js.Any.fromFunction0(newJobStatistics3), newJobStatistics4 = js.Any.fromFunction0(newJobStatistics4), newJobStatisticsReservationUsage = js.Any.fromFunction0(newJobStatisticsReservationUsage), newJobStatus = js.Any.fromFunction0(newJobStatus), newMaterializedViewDefinition = js.Any.fromFunction0(newMaterializedViewDefinition), newModelDefinition = js.Any.fromFunction0(newModelDefinition), newModelDefinitionModelOptions = js.Any.fromFunction0(newModelDefinitionModelOptions), newQueryParameter = js.Any.fromFunction0(newQueryParameter), newQueryParameterType = js.Any.fromFunction0(newQueryParameterType), newQueryParameterTypeStructTypes = js.Any.fromFunction0(newQueryParameterTypeStructTypes), newQueryParameterValue = js.Any.fromFunction0(newQueryParameterValue), newQueryRequest = js.Any.fromFunction0(newQueryRequest), newQueryTimelineSample = js.Any.fromFunction0(newQueryTimelineSample), newRangePartitioning = js.Any.fromFunction0(newRangePartitioning), newRangePartitioningRange = js.Any.fromFunction0(newRangePartitioningRange), newRoutineReference = js.Any.fromFunction0(newRoutineReference), newStreamingbuffer = js.Any.fromFunction0(newStreamingbuffer), newTable = js.Any.fromFunction0(newTable), newTableDataInsertAllRequest = js.Any.fromFunction0(newTableDataInsertAllRequest), newTableDataInsertAllRequestRows = js.Any.fromFunction0(newTableDataInsertAllRequestRows), newTableFieldSchema = js.Any.fromFunction0(newTableFieldSchema), newTableFieldSchemaCategories = js.Any.fromFunction0(newTableFieldSchemaCategories), newTableReference = js.Any.fromFunction0(newTableReference), newTableSchema = js.Any.fromFunction0(newTableSchema), newTimePartitioning = js.Any.fromFunction0(newTimePartitioning), newUserDefinedFunctionResource = js.Any.fromFunction0(newUserDefinedFunctionResource), newViewDefinition = js.Any.fromFunction0(newViewDefinition))
    __obj.asInstanceOf[Bigquery]
  }
  
  @scala.inline
  implicit class BigqueryMutableBuilder[Self <: Bigquery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatasets(value: DatasetsCollection): Self = StObject.set(x, "Datasets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasetsUndefined: Self = StObject.set(x, "Datasets", js.undefined)
    
    @scala.inline
    def setJobs(value: JobsCollection): Self = StObject.set(x, "Jobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobsUndefined: Self = StObject.set(x, "Jobs", js.undefined)
    
    @scala.inline
    def setNewBigQueryModelTraining(value: () => BigQueryModelTraining): Self = StObject.set(x, "newBigQueryModelTraining", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewBigtableColumn(value: () => BigtableColumn): Self = StObject.set(x, "newBigtableColumn", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewBigtableColumnFamily(value: () => BigtableColumnFamily): Self = StObject.set(x, "newBigtableColumnFamily", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewBigtableOptions(value: () => BigtableOptions): Self = StObject.set(x, "newBigtableOptions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewBqmlIterationResult(value: () => BqmlIterationResult): Self = StObject.set(x, "newBqmlIterationResult", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewBqmlTrainingRun(value: () => BqmlTrainingRun): Self = StObject.set(x, "newBqmlTrainingRun", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewBqmlTrainingRunTrainingOptions(value: () => BqmlTrainingRunTrainingOptions): Self = StObject.set(x, "newBqmlTrainingRunTrainingOptions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewClustering(value: () => Clustering): Self = StObject.set(x, "newClustering", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewCsvOptions(value: () => CsvOptions): Self = StObject.set(x, "newCsvOptions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewDataset(value: () => Dataset): Self = StObject.set(x, "newDataset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewDatasetAccess(value: () => DatasetAccess): Self = StObject.set(x, "newDatasetAccess", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewDatasetReference(value: () => DatasetReference): Self = StObject.set(x, "newDatasetReference", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewDestinationTableProperties(value: () => DestinationTableProperties): Self = StObject.set(x, "newDestinationTableProperties", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewEncryptionConfiguration(value: () => EncryptionConfiguration): Self = StObject.set(x, "newEncryptionConfiguration", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewErrorProto(value: () => ErrorProto): Self = StObject.set(x, "newErrorProto", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewExplainQueryStage(value: () => ExplainQueryStage): Self = StObject.set(x, "newExplainQueryStage", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewExplainQueryStep(value: () => ExplainQueryStep): Self = StObject.set(x, "newExplainQueryStep", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewExternalDataConfiguration(value: () => ExternalDataConfiguration): Self = StObject.set(x, "newExternalDataConfiguration", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewGoogleSheetsOptions(value: () => GoogleSheetsOptions): Self = StObject.set(x, "newGoogleSheetsOptions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewJob(value: () => Job): Self = StObject.set(x, "newJob", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewJobConfiguration(value: () => JobConfiguration): Self = StObject.set(x, "newJobConfiguration", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewJobConfigurationExtract(value: () => JobConfigurationExtract): Self = StObject.set(x, "newJobConfigurationExtract", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewJobConfigurationLoad(value: () => JobConfigurationLoad): Self = StObject.set(x, "newJobConfigurationLoad", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewJobConfigurationQuery(value: () => JobConfigurationQuery): Self = StObject.set(x, "newJobConfigurationQuery", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewJobConfigurationTableCopy(value: () => JobConfigurationTableCopy): Self = StObject.set(x, "newJobConfigurationTableCopy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewJobReference(value: () => JobReference): Self = StObject.set(x, "newJobReference", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewJobStatistics(value: () => JobStatistics): Self = StObject.set(x, "newJobStatistics", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewJobStatistics2(value: () => JobStatistics2): Self = StObject.set(x, "newJobStatistics2", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewJobStatistics2ReservationUsage(value: () => JobStatistics2ReservationUsage): Self = StObject.set(x, "newJobStatistics2ReservationUsage", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewJobStatistics3(value: () => JobStatistics3): Self = StObject.set(x, "newJobStatistics3", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewJobStatistics4(value: () => JobStatistics4): Self = StObject.set(x, "newJobStatistics4", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewJobStatisticsReservationUsage(value: () => JobStatisticsReservationUsage): Self = StObject.set(x, "newJobStatisticsReservationUsage", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewJobStatus(value: () => JobStatus): Self = StObject.set(x, "newJobStatus", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewMaterializedViewDefinition(value: () => MaterializedViewDefinition): Self = StObject.set(x, "newMaterializedViewDefinition", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewModelDefinition(value: () => ModelDefinition): Self = StObject.set(x, "newModelDefinition", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewModelDefinitionModelOptions(value: () => ModelDefinitionModelOptions): Self = StObject.set(x, "newModelDefinitionModelOptions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewQueryParameter(value: () => QueryParameter): Self = StObject.set(x, "newQueryParameter", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewQueryParameterType(value: () => QueryParameterType): Self = StObject.set(x, "newQueryParameterType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewQueryParameterTypeStructTypes(value: () => QueryParameterTypeStructTypes): Self = StObject.set(x, "newQueryParameterTypeStructTypes", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewQueryParameterValue(value: () => QueryParameterValue): Self = StObject.set(x, "newQueryParameterValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewQueryRequest(value: () => QueryRequest): Self = StObject.set(x, "newQueryRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewQueryTimelineSample(value: () => QueryTimelineSample): Self = StObject.set(x, "newQueryTimelineSample", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewRangePartitioning(value: () => RangePartitioning): Self = StObject.set(x, "newRangePartitioning", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewRangePartitioningRange(value: () => RangePartitioningRange): Self = StObject.set(x, "newRangePartitioningRange", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewRoutineReference(value: () => RoutineReference): Self = StObject.set(x, "newRoutineReference", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewStreamingbuffer(value: () => Streamingbuffer): Self = StObject.set(x, "newStreamingbuffer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewTable(value: () => Table): Self = StObject.set(x, "newTable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewTableDataInsertAllRequest(value: () => TableDataInsertAllRequest): Self = StObject.set(x, "newTableDataInsertAllRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewTableDataInsertAllRequestRows(value: () => TableDataInsertAllRequestRows): Self = StObject.set(x, "newTableDataInsertAllRequestRows", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewTableFieldSchema(value: () => TableFieldSchema): Self = StObject.set(x, "newTableFieldSchema", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewTableFieldSchemaCategories(value: () => TableFieldSchemaCategories): Self = StObject.set(x, "newTableFieldSchemaCategories", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewTableReference(value: () => TableReference): Self = StObject.set(x, "newTableReference", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewTableSchema(value: () => TableSchema): Self = StObject.set(x, "newTableSchema", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewTimePartitioning(value: () => TimePartitioning): Self = StObject.set(x, "newTimePartitioning", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewUserDefinedFunctionResource(value: () => UserDefinedFunctionResource): Self = StObject.set(x, "newUserDefinedFunctionResource", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewViewDefinition(value: () => ViewDefinition): Self = StObject.set(x, "newViewDefinition", js.Any.fromFunction0(value))
    
    @scala.inline
    def setProjects(value: ProjectsCollection): Self = StObject.set(x, "Projects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectsUndefined: Self = StObject.set(x, "Projects", js.undefined)
    
    @scala.inline
    def setTabledata(value: TabledataCollection): Self = StObject.set(x, "Tabledata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabledataUndefined: Self = StObject.set(x, "Tabledata", js.undefined)
    
    @scala.inline
    def setTables(value: TablesCollection): Self = StObject.set(x, "Tables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTablesUndefined: Self = StObject.set(x, "Tables", js.undefined)
  }
}

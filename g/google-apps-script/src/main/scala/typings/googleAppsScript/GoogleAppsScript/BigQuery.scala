package typings.googleAppsScript.GoogleAppsScript

import typings.googleAppsScript.GoogleAppsScript.BigQuery.Collection.DatasetsCollection
import typings.googleAppsScript.GoogleAppsScript.BigQuery.Collection.JobsCollection
import typings.googleAppsScript.GoogleAppsScript.BigQuery.Collection.ProjectsCollection
import typings.googleAppsScript.GoogleAppsScript.BigQuery.Collection.TabledataCollection
import typings.googleAppsScript.GoogleAppsScript.BigQuery.Collection.TablesCollection
import typings.googleAppsScript.GoogleAppsScript.BigQuery.Schema.BigQueryModelTraining
import typings.googleAppsScript.GoogleAppsScript.BigQuery.Schema.BigtableColumn
import typings.googleAppsScript.GoogleAppsScript.BigQuery.Schema.BigtableColumnFamily
import typings.googleAppsScript.GoogleAppsScript.BigQuery.Schema.BigtableOptions
import typings.googleAppsScript.GoogleAppsScript.BigQuery.Schema.BqmlIterationResult
import typings.googleAppsScript.GoogleAppsScript.BigQuery.Schema.BqmlTrainingRun
import typings.googleAppsScript.GoogleAppsScript.BigQuery.Schema.BqmlTrainingRunTrainingOptions
import typings.googleAppsScript.GoogleAppsScript.BigQuery.Schema.Clustering
import typings.googleAppsScript.GoogleAppsScript.BigQuery.Schema.CsvOptions
import typings.googleAppsScript.GoogleAppsScript.BigQuery.Schema.Dataset
import typings.googleAppsScript.GoogleAppsScript.BigQuery.Schema.DatasetAccess
import typings.googleAppsScript.GoogleAppsScript.BigQuery.Schema.DatasetList
import typings.googleAppsScript.GoogleAppsScript.BigQuery.Schema.DatasetReference
import typings.googleAppsScript.GoogleAppsScript.BigQuery.Schema.DestinationTableProperties
import typings.googleAppsScript.GoogleAppsScript.BigQuery.Schema.EncryptionConfiguration
import typings.googleAppsScript.GoogleAppsScript.BigQuery.Schema.ErrorProto
import typings.googleAppsScript.GoogleAppsScript.BigQuery.Schema.ExplainQueryStage
import typings.googleAppsScript.GoogleAppsScript.BigQuery.Schema.ExplainQueryStep
import typings.googleAppsScript.GoogleAppsScript.BigQuery.Schema.ExternalDataConfiguration
import typings.googleAppsScript.GoogleAppsScript.BigQuery.Schema.GetQueryResultsResponse
import typings.googleAppsScript.GoogleAppsScript.BigQuery.Schema.GetServiceAccountResponse
import typings.googleAppsScript.GoogleAppsScript.BigQuery.Schema.GoogleSheetsOptions
import typings.googleAppsScript.GoogleAppsScript.BigQuery.Schema.Job
import typings.googleAppsScript.GoogleAppsScript.BigQuery.Schema.JobCancelResponse
import typings.googleAppsScript.GoogleAppsScript.BigQuery.Schema.JobConfiguration
import typings.googleAppsScript.GoogleAppsScript.BigQuery.Schema.JobConfigurationExtract
import typings.googleAppsScript.GoogleAppsScript.BigQuery.Schema.JobConfigurationLoad
import typings.googleAppsScript.GoogleAppsScript.BigQuery.Schema.JobConfigurationQuery
import typings.googleAppsScript.GoogleAppsScript.BigQuery.Schema.JobConfigurationTableCopy
import typings.googleAppsScript.GoogleAppsScript.BigQuery.Schema.JobList
import typings.googleAppsScript.GoogleAppsScript.BigQuery.Schema.JobReference
import typings.googleAppsScript.GoogleAppsScript.BigQuery.Schema.JobStatistics
import typings.googleAppsScript.GoogleAppsScript.BigQuery.Schema.JobStatistics2
import typings.googleAppsScript.GoogleAppsScript.BigQuery.Schema.JobStatistics2ReservationUsage
import typings.googleAppsScript.GoogleAppsScript.BigQuery.Schema.JobStatistics3
import typings.googleAppsScript.GoogleAppsScript.BigQuery.Schema.JobStatistics4
import typings.googleAppsScript.GoogleAppsScript.BigQuery.Schema.JobStatisticsReservationUsage
import typings.googleAppsScript.GoogleAppsScript.BigQuery.Schema.JobStatus
import typings.googleAppsScript.GoogleAppsScript.BigQuery.Schema.MaterializedViewDefinition
import typings.googleAppsScript.GoogleAppsScript.BigQuery.Schema.ModelDefinition
import typings.googleAppsScript.GoogleAppsScript.BigQuery.Schema.ModelDefinitionModelOptions
import typings.googleAppsScript.GoogleAppsScript.BigQuery.Schema.ProjectList
import typings.googleAppsScript.GoogleAppsScript.BigQuery.Schema.QueryParameter
import typings.googleAppsScript.GoogleAppsScript.BigQuery.Schema.QueryParameterType
import typings.googleAppsScript.GoogleAppsScript.BigQuery.Schema.QueryParameterTypeStructTypes
import typings.googleAppsScript.GoogleAppsScript.BigQuery.Schema.QueryParameterValue
import typings.googleAppsScript.GoogleAppsScript.BigQuery.Schema.QueryRequest
import typings.googleAppsScript.GoogleAppsScript.BigQuery.Schema.QueryResponse
import typings.googleAppsScript.GoogleAppsScript.BigQuery.Schema.QueryTimelineSample
import typings.googleAppsScript.GoogleAppsScript.BigQuery.Schema.RangePartitioning
import typings.googleAppsScript.GoogleAppsScript.BigQuery.Schema.RangePartitioningRange
import typings.googleAppsScript.GoogleAppsScript.BigQuery.Schema.RoutineReference
import typings.googleAppsScript.GoogleAppsScript.BigQuery.Schema.Streamingbuffer
import typings.googleAppsScript.GoogleAppsScript.BigQuery.Schema.Table
import typings.googleAppsScript.GoogleAppsScript.BigQuery.Schema.TableDataInsertAllRequest
import typings.googleAppsScript.GoogleAppsScript.BigQuery.Schema.TableDataInsertAllRequestRows
import typings.googleAppsScript.GoogleAppsScript.BigQuery.Schema.TableDataInsertAllResponse
import typings.googleAppsScript.GoogleAppsScript.BigQuery.Schema.TableDataList
import typings.googleAppsScript.GoogleAppsScript.BigQuery.Schema.TableFieldSchema
import typings.googleAppsScript.GoogleAppsScript.BigQuery.Schema.TableFieldSchemaCategories
import typings.googleAppsScript.GoogleAppsScript.BigQuery.Schema.TableList
import typings.googleAppsScript.GoogleAppsScript.BigQuery.Schema.TableReference
import typings.googleAppsScript.GoogleAppsScript.BigQuery.Schema.TableSchema
import typings.googleAppsScript.GoogleAppsScript.BigQuery.Schema.TimePartitioning
import typings.googleAppsScript.GoogleAppsScript.BigQuery.Schema.UserDefinedFunctionResource
import typings.googleAppsScript.GoogleAppsScript.BigQuery.Schema.ViewDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BigQuery extends StObject {
  
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
object BigQuery {
  
  inline def apply(
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
  ): BigQuery = {
    val __obj = js.Dynamic.literal(newBigQueryModelTraining = js.Any.fromFunction0(newBigQueryModelTraining), newBigtableColumn = js.Any.fromFunction0(newBigtableColumn), newBigtableColumnFamily = js.Any.fromFunction0(newBigtableColumnFamily), newBigtableOptions = js.Any.fromFunction0(newBigtableOptions), newBqmlIterationResult = js.Any.fromFunction0(newBqmlIterationResult), newBqmlTrainingRun = js.Any.fromFunction0(newBqmlTrainingRun), newBqmlTrainingRunTrainingOptions = js.Any.fromFunction0(newBqmlTrainingRunTrainingOptions), newClustering = js.Any.fromFunction0(newClustering), newCsvOptions = js.Any.fromFunction0(newCsvOptions), newDataset = js.Any.fromFunction0(newDataset), newDatasetAccess = js.Any.fromFunction0(newDatasetAccess), newDatasetReference = js.Any.fromFunction0(newDatasetReference), newDestinationTableProperties = js.Any.fromFunction0(newDestinationTableProperties), newEncryptionConfiguration = js.Any.fromFunction0(newEncryptionConfiguration), newErrorProto = js.Any.fromFunction0(newErrorProto), newExplainQueryStage = js.Any.fromFunction0(newExplainQueryStage), newExplainQueryStep = js.Any.fromFunction0(newExplainQueryStep), newExternalDataConfiguration = js.Any.fromFunction0(newExternalDataConfiguration), newGoogleSheetsOptions = js.Any.fromFunction0(newGoogleSheetsOptions), newJob = js.Any.fromFunction0(newJob), newJobConfiguration = js.Any.fromFunction0(newJobConfiguration), newJobConfigurationExtract = js.Any.fromFunction0(newJobConfigurationExtract), newJobConfigurationLoad = js.Any.fromFunction0(newJobConfigurationLoad), newJobConfigurationQuery = js.Any.fromFunction0(newJobConfigurationQuery), newJobConfigurationTableCopy = js.Any.fromFunction0(newJobConfigurationTableCopy), newJobReference = js.Any.fromFunction0(newJobReference), newJobStatistics = js.Any.fromFunction0(newJobStatistics), newJobStatistics2 = js.Any.fromFunction0(newJobStatistics2), newJobStatistics2ReservationUsage = js.Any.fromFunction0(newJobStatistics2ReservationUsage), newJobStatistics3 = js.Any.fromFunction0(newJobStatistics3), newJobStatistics4 = js.Any.fromFunction0(newJobStatistics4), newJobStatisticsReservationUsage = js.Any.fromFunction0(newJobStatisticsReservationUsage), newJobStatus = js.Any.fromFunction0(newJobStatus), newMaterializedViewDefinition = js.Any.fromFunction0(newMaterializedViewDefinition), newModelDefinition = js.Any.fromFunction0(newModelDefinition), newModelDefinitionModelOptions = js.Any.fromFunction0(newModelDefinitionModelOptions), newQueryParameter = js.Any.fromFunction0(newQueryParameter), newQueryParameterType = js.Any.fromFunction0(newQueryParameterType), newQueryParameterTypeStructTypes = js.Any.fromFunction0(newQueryParameterTypeStructTypes), newQueryParameterValue = js.Any.fromFunction0(newQueryParameterValue), newQueryRequest = js.Any.fromFunction0(newQueryRequest), newQueryTimelineSample = js.Any.fromFunction0(newQueryTimelineSample), newRangePartitioning = js.Any.fromFunction0(newRangePartitioning), newRangePartitioningRange = js.Any.fromFunction0(newRangePartitioningRange), newRoutineReference = js.Any.fromFunction0(newRoutineReference), newStreamingbuffer = js.Any.fromFunction0(newStreamingbuffer), newTable = js.Any.fromFunction0(newTable), newTableDataInsertAllRequest = js.Any.fromFunction0(newTableDataInsertAllRequest), newTableDataInsertAllRequestRows = js.Any.fromFunction0(newTableDataInsertAllRequestRows), newTableFieldSchema = js.Any.fromFunction0(newTableFieldSchema), newTableFieldSchemaCategories = js.Any.fromFunction0(newTableFieldSchemaCategories), newTableReference = js.Any.fromFunction0(newTableReference), newTableSchema = js.Any.fromFunction0(newTableSchema), newTimePartitioning = js.Any.fromFunction0(newTimePartitioning), newUserDefinedFunctionResource = js.Any.fromFunction0(newUserDefinedFunctionResource), newViewDefinition = js.Any.fromFunction0(newViewDefinition))
    __obj.asInstanceOf[BigQuery]
  }
  
  extension [Self <: BigQuery](x: Self) {
    
    inline def setDatasets(value: DatasetsCollection): Self = StObject.set(x, "Datasets", value.asInstanceOf[js.Any])
    
    inline def setDatasetsUndefined: Self = StObject.set(x, "Datasets", js.undefined)
    
    inline def setJobs(value: JobsCollection): Self = StObject.set(x, "Jobs", value.asInstanceOf[js.Any])
    
    inline def setJobsUndefined: Self = StObject.set(x, "Jobs", js.undefined)
    
    inline def setNewBigQueryModelTraining(value: () => BigQueryModelTraining): Self = StObject.set(x, "newBigQueryModelTraining", js.Any.fromFunction0(value))
    
    inline def setNewBigtableColumn(value: () => BigtableColumn): Self = StObject.set(x, "newBigtableColumn", js.Any.fromFunction0(value))
    
    inline def setNewBigtableColumnFamily(value: () => BigtableColumnFamily): Self = StObject.set(x, "newBigtableColumnFamily", js.Any.fromFunction0(value))
    
    inline def setNewBigtableOptions(value: () => BigtableOptions): Self = StObject.set(x, "newBigtableOptions", js.Any.fromFunction0(value))
    
    inline def setNewBqmlIterationResult(value: () => BqmlIterationResult): Self = StObject.set(x, "newBqmlIterationResult", js.Any.fromFunction0(value))
    
    inline def setNewBqmlTrainingRun(value: () => BqmlTrainingRun): Self = StObject.set(x, "newBqmlTrainingRun", js.Any.fromFunction0(value))
    
    inline def setNewBqmlTrainingRunTrainingOptions(value: () => BqmlTrainingRunTrainingOptions): Self = StObject.set(x, "newBqmlTrainingRunTrainingOptions", js.Any.fromFunction0(value))
    
    inline def setNewClustering(value: () => Clustering): Self = StObject.set(x, "newClustering", js.Any.fromFunction0(value))
    
    inline def setNewCsvOptions(value: () => CsvOptions): Self = StObject.set(x, "newCsvOptions", js.Any.fromFunction0(value))
    
    inline def setNewDataset(value: () => Dataset): Self = StObject.set(x, "newDataset", js.Any.fromFunction0(value))
    
    inline def setNewDatasetAccess(value: () => DatasetAccess): Self = StObject.set(x, "newDatasetAccess", js.Any.fromFunction0(value))
    
    inline def setNewDatasetReference(value: () => DatasetReference): Self = StObject.set(x, "newDatasetReference", js.Any.fromFunction0(value))
    
    inline def setNewDestinationTableProperties(value: () => DestinationTableProperties): Self = StObject.set(x, "newDestinationTableProperties", js.Any.fromFunction0(value))
    
    inline def setNewEncryptionConfiguration(value: () => EncryptionConfiguration): Self = StObject.set(x, "newEncryptionConfiguration", js.Any.fromFunction0(value))
    
    inline def setNewErrorProto(value: () => ErrorProto): Self = StObject.set(x, "newErrorProto", js.Any.fromFunction0(value))
    
    inline def setNewExplainQueryStage(value: () => ExplainQueryStage): Self = StObject.set(x, "newExplainQueryStage", js.Any.fromFunction0(value))
    
    inline def setNewExplainQueryStep(value: () => ExplainQueryStep): Self = StObject.set(x, "newExplainQueryStep", js.Any.fromFunction0(value))
    
    inline def setNewExternalDataConfiguration(value: () => ExternalDataConfiguration): Self = StObject.set(x, "newExternalDataConfiguration", js.Any.fromFunction0(value))
    
    inline def setNewGoogleSheetsOptions(value: () => GoogleSheetsOptions): Self = StObject.set(x, "newGoogleSheetsOptions", js.Any.fromFunction0(value))
    
    inline def setNewJob(value: () => Job): Self = StObject.set(x, "newJob", js.Any.fromFunction0(value))
    
    inline def setNewJobConfiguration(value: () => JobConfiguration): Self = StObject.set(x, "newJobConfiguration", js.Any.fromFunction0(value))
    
    inline def setNewJobConfigurationExtract(value: () => JobConfigurationExtract): Self = StObject.set(x, "newJobConfigurationExtract", js.Any.fromFunction0(value))
    
    inline def setNewJobConfigurationLoad(value: () => JobConfigurationLoad): Self = StObject.set(x, "newJobConfigurationLoad", js.Any.fromFunction0(value))
    
    inline def setNewJobConfigurationQuery(value: () => JobConfigurationQuery): Self = StObject.set(x, "newJobConfigurationQuery", js.Any.fromFunction0(value))
    
    inline def setNewJobConfigurationTableCopy(value: () => JobConfigurationTableCopy): Self = StObject.set(x, "newJobConfigurationTableCopy", js.Any.fromFunction0(value))
    
    inline def setNewJobReference(value: () => JobReference): Self = StObject.set(x, "newJobReference", js.Any.fromFunction0(value))
    
    inline def setNewJobStatistics(value: () => JobStatistics): Self = StObject.set(x, "newJobStatistics", js.Any.fromFunction0(value))
    
    inline def setNewJobStatistics2(value: () => JobStatistics2): Self = StObject.set(x, "newJobStatistics2", js.Any.fromFunction0(value))
    
    inline def setNewJobStatistics2ReservationUsage(value: () => JobStatistics2ReservationUsage): Self = StObject.set(x, "newJobStatistics2ReservationUsage", js.Any.fromFunction0(value))
    
    inline def setNewJobStatistics3(value: () => JobStatistics3): Self = StObject.set(x, "newJobStatistics3", js.Any.fromFunction0(value))
    
    inline def setNewJobStatistics4(value: () => JobStatistics4): Self = StObject.set(x, "newJobStatistics4", js.Any.fromFunction0(value))
    
    inline def setNewJobStatisticsReservationUsage(value: () => JobStatisticsReservationUsage): Self = StObject.set(x, "newJobStatisticsReservationUsage", js.Any.fromFunction0(value))
    
    inline def setNewJobStatus(value: () => JobStatus): Self = StObject.set(x, "newJobStatus", js.Any.fromFunction0(value))
    
    inline def setNewMaterializedViewDefinition(value: () => MaterializedViewDefinition): Self = StObject.set(x, "newMaterializedViewDefinition", js.Any.fromFunction0(value))
    
    inline def setNewModelDefinition(value: () => ModelDefinition): Self = StObject.set(x, "newModelDefinition", js.Any.fromFunction0(value))
    
    inline def setNewModelDefinitionModelOptions(value: () => ModelDefinitionModelOptions): Self = StObject.set(x, "newModelDefinitionModelOptions", js.Any.fromFunction0(value))
    
    inline def setNewQueryParameter(value: () => QueryParameter): Self = StObject.set(x, "newQueryParameter", js.Any.fromFunction0(value))
    
    inline def setNewQueryParameterType(value: () => QueryParameterType): Self = StObject.set(x, "newQueryParameterType", js.Any.fromFunction0(value))
    
    inline def setNewQueryParameterTypeStructTypes(value: () => QueryParameterTypeStructTypes): Self = StObject.set(x, "newQueryParameterTypeStructTypes", js.Any.fromFunction0(value))
    
    inline def setNewQueryParameterValue(value: () => QueryParameterValue): Self = StObject.set(x, "newQueryParameterValue", js.Any.fromFunction0(value))
    
    inline def setNewQueryRequest(value: () => QueryRequest): Self = StObject.set(x, "newQueryRequest", js.Any.fromFunction0(value))
    
    inline def setNewQueryTimelineSample(value: () => QueryTimelineSample): Self = StObject.set(x, "newQueryTimelineSample", js.Any.fromFunction0(value))
    
    inline def setNewRangePartitioning(value: () => RangePartitioning): Self = StObject.set(x, "newRangePartitioning", js.Any.fromFunction0(value))
    
    inline def setNewRangePartitioningRange(value: () => RangePartitioningRange): Self = StObject.set(x, "newRangePartitioningRange", js.Any.fromFunction0(value))
    
    inline def setNewRoutineReference(value: () => RoutineReference): Self = StObject.set(x, "newRoutineReference", js.Any.fromFunction0(value))
    
    inline def setNewStreamingbuffer(value: () => Streamingbuffer): Self = StObject.set(x, "newStreamingbuffer", js.Any.fromFunction0(value))
    
    inline def setNewTable(value: () => Table): Self = StObject.set(x, "newTable", js.Any.fromFunction0(value))
    
    inline def setNewTableDataInsertAllRequest(value: () => TableDataInsertAllRequest): Self = StObject.set(x, "newTableDataInsertAllRequest", js.Any.fromFunction0(value))
    
    inline def setNewTableDataInsertAllRequestRows(value: () => TableDataInsertAllRequestRows): Self = StObject.set(x, "newTableDataInsertAllRequestRows", js.Any.fromFunction0(value))
    
    inline def setNewTableFieldSchema(value: () => TableFieldSchema): Self = StObject.set(x, "newTableFieldSchema", js.Any.fromFunction0(value))
    
    inline def setNewTableFieldSchemaCategories(value: () => TableFieldSchemaCategories): Self = StObject.set(x, "newTableFieldSchemaCategories", js.Any.fromFunction0(value))
    
    inline def setNewTableReference(value: () => TableReference): Self = StObject.set(x, "newTableReference", js.Any.fromFunction0(value))
    
    inline def setNewTableSchema(value: () => TableSchema): Self = StObject.set(x, "newTableSchema", js.Any.fromFunction0(value))
    
    inline def setNewTimePartitioning(value: () => TimePartitioning): Self = StObject.set(x, "newTimePartitioning", js.Any.fromFunction0(value))
    
    inline def setNewUserDefinedFunctionResource(value: () => UserDefinedFunctionResource): Self = StObject.set(x, "newUserDefinedFunctionResource", js.Any.fromFunction0(value))
    
    inline def setNewViewDefinition(value: () => ViewDefinition): Self = StObject.set(x, "newViewDefinition", js.Any.fromFunction0(value))
    
    inline def setProjects(value: ProjectsCollection): Self = StObject.set(x, "Projects", value.asInstanceOf[js.Any])
    
    inline def setProjectsUndefined: Self = StObject.set(x, "Projects", js.undefined)
    
    inline def setTabledata(value: TabledataCollection): Self = StObject.set(x, "Tabledata", value.asInstanceOf[js.Any])
    
    inline def setTabledataUndefined: Self = StObject.set(x, "Tabledata", js.undefined)
    
    inline def setTables(value: TablesCollection): Self = StObject.set(x, "Tables", value.asInstanceOf[js.Any])
    
    inline def setTablesUndefined: Self = StObject.set(x, "Tables", js.undefined)
  }
  
  object Collection {
    
    @js.native
    trait DatasetsCollection extends StObject {
      
      // Returns the dataset specified by datasetID.
      def get(projectId: String, datasetId: String): Dataset = js.native
      
      // Creates a new empty dataset.
      def insert(resource: Dataset, projectId: String): Dataset = js.native
      
      // Lists all datasets in the specified project to which you have been granted the READER dataset role.
      def list(projectId: String): DatasetList = js.native
      // Lists all datasets in the specified project to which you have been granted the READER dataset role.
      def list(projectId: String, optionalArgs: js.Object): DatasetList = js.native
      
      // Updates information in an existing dataset. The update method replaces the entire dataset resource, whereas the patch method only replaces fields that are provided in the submitted dataset resource. This method supports patch semantics.
      def patch(resource: Dataset, projectId: String, datasetId: String): Dataset = js.native
      
      // Deletes the dataset specified by the datasetId value. Before you can delete a dataset, you must delete all its tables, either manually or by specifying deleteContents. Immediately after deletion, you can create another dataset with the same name.
      def remove(projectId: String, datasetId: String): Unit = js.native
      // Deletes the dataset specified by the datasetId value. Before you can delete a dataset, you must delete all its tables, either manually or by specifying deleteContents. Immediately after deletion, you can create another dataset with the same name.
      def remove(projectId: String, datasetId: String, optionalArgs: js.Object): Unit = js.native
      
      // Updates information in an existing dataset. The update method replaces the entire dataset resource, whereas the patch method only replaces fields that are provided in the submitted dataset resource.
      def update(resource: Dataset, projectId: String, datasetId: String): Dataset = js.native
    }
    
    @js.native
    trait JobsCollection extends StObject {
      
      // Requests that a job be cancelled. This call will return immediately, and the client will need to poll for the job status to see if the cancel completed successfully. Cancelled jobs may still incur costs.
      def cancel(projectId: String, jobId: String): JobCancelResponse = js.native
      // Requests that a job be cancelled. This call will return immediately, and the client will need to poll for the job status to see if the cancel completed successfully. Cancelled jobs may still incur costs.
      def cancel(projectId: String, jobId: String, optionalArgs: js.Object): JobCancelResponse = js.native
      
      // Returns information about a specific job. Job information is available for a six month period after creation. Requires that you're the person who ran the job, or have the Is Owner project role.
      def get(projectId: String, jobId: String): Job = js.native
      // Returns information about a specific job. Job information is available for a six month period after creation. Requires that you're the person who ran the job, or have the Is Owner project role.
      def get(projectId: String, jobId: String, optionalArgs: js.Object): Job = js.native
      
      // Retrieves the results of a query job.
      def getQueryResults(projectId: String, jobId: String): GetQueryResultsResponse = js.native
      // Retrieves the results of a query job.
      def getQueryResults(projectId: String, jobId: String, optionalArgs: js.Object): GetQueryResultsResponse = js.native
      
      // Starts a new asynchronous job. Requires the Can View project role.
      def insert(resource: Job, projectId: String): Job = js.native
      // Starts a new asynchronous job. Requires the Can View project role.
      def insert(resource: Job, projectId: String, mediaData: Any): Job = js.native
      
      // Lists all jobs that you started in the specified project. Job information is available for a six month period after creation. The job list is sorted in reverse chronological order, by job creation time. Requires the Can View project role, or the Is Owner project role if you set the allUsers property.
      def list(projectId: String): JobList = js.native
      // Lists all jobs that you started in the specified project. Job information is available for a six month period after creation. The job list is sorted in reverse chronological order, by job creation time. Requires the Can View project role, or the Is Owner project role if you set the allUsers property.
      def list(projectId: String, optionalArgs: js.Object): JobList = js.native
      
      // Runs a BigQuery SQL query synchronously and returns query results if the query completes within a specified timeout.
      def query(resource: QueryRequest, projectId: String): QueryResponse = js.native
    }
    
    @js.native
    trait ProjectsCollection extends StObject {
      
      // Returns the email address of the service account for your project used for interactions with Google Cloud KMS.
      def getServiceAccount(projectId: String): GetServiceAccountResponse = js.native
      
      // Lists all projects to which you have been granted any project role.
      def list(): ProjectList = js.native
      // Lists all projects to which you have been granted any project role.
      def list(optionalArgs: js.Object): ProjectList = js.native
    }
    
    @js.native
    trait TabledataCollection extends StObject {
      
      // Streams data into BigQuery one record at a time without needing to run a load job. Requires the WRITER dataset role.
      def insertAll(resource: TableDataInsertAllRequest, projectId: String, datasetId: String, tableId: String): TableDataInsertAllResponse = js.native
      
      // Retrieves table data from a specified set of rows. Requires the READER dataset role.
      def list(projectId: String, datasetId: String, tableId: String): TableDataList = js.native
      // Retrieves table data from a specified set of rows. Requires the READER dataset role.
      def list(projectId: String, datasetId: String, tableId: String, optionalArgs: js.Object): TableDataList = js.native
    }
    
    @js.native
    trait TablesCollection extends StObject {
      
      // Gets the specified table resource by table ID. This method does not return the data in the table, it only returns the table resource, which describes the structure of this table.
      def get(projectId: String, datasetId: String, tableId: String): Table = js.native
      // Gets the specified table resource by table ID. This method does not return the data in the table, it only returns the table resource, which describes the structure of this table.
      def get(projectId: String, datasetId: String, tableId: String, optionalArgs: js.Object): Table = js.native
      
      // Creates a new, empty table in the dataset.
      def insert(resource: Table, projectId: String, datasetId: String): Table = js.native
      
      // Lists all tables in the specified dataset. Requires the READER dataset role.
      def list(projectId: String, datasetId: String): TableList = js.native
      // Lists all tables in the specified dataset. Requires the READER dataset role.
      def list(projectId: String, datasetId: String, optionalArgs: js.Object): TableList = js.native
      
      // Updates information in an existing table. The update method replaces the entire table resource, whereas the patch method only replaces fields that are provided in the submitted table resource. This method supports patch semantics.
      def patch(resource: Table, projectId: String, datasetId: String, tableId: String): Table = js.native
      
      // Deletes the table specified by tableId from the dataset. If the table contains data, all the data will be deleted.
      def remove(projectId: String, datasetId: String, tableId: String): Unit = js.native
      
      // Updates information in an existing table. The update method replaces the entire table resource, whereas the patch method only replaces fields that are provided in the submitted table resource.
      def update(resource: Table, projectId: String, datasetId: String, tableId: String): Table = js.native
    }
  }
  
  object Schema {
    
    trait BigQueryModelTraining extends StObject {
      
      var currentIteration: js.UndefOr[Double] = js.undefined
      
      var expectedTotalIterations: js.UndefOr[String] = js.undefined
    }
    object BigQueryModelTraining {
      
      inline def apply(): BigQueryModelTraining = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[BigQueryModelTraining]
      }
      
      extension [Self <: BigQueryModelTraining](x: Self) {
        
        inline def setCurrentIteration(value: Double): Self = StObject.set(x, "currentIteration", value.asInstanceOf[js.Any])
        
        inline def setCurrentIterationUndefined: Self = StObject.set(x, "currentIteration", js.undefined)
        
        inline def setExpectedTotalIterations(value: String): Self = StObject.set(x, "expectedTotalIterations", value.asInstanceOf[js.Any])
        
        inline def setExpectedTotalIterationsUndefined: Self = StObject.set(x, "expectedTotalIterations", js.undefined)
      }
    }
    
    trait BigtableColumn extends StObject {
      
      var encoding: js.UndefOr[String] = js.undefined
      
      var fieldName: js.UndefOr[String] = js.undefined
      
      var onlyReadLatest: js.UndefOr[Boolean] = js.undefined
      
      var qualifierEncoded: js.UndefOr[String] = js.undefined
      
      var qualifierString: js.UndefOr[String] = js.undefined
      
      var `type`: js.UndefOr[String] = js.undefined
    }
    object BigtableColumn {
      
      inline def apply(): BigtableColumn = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[BigtableColumn]
      }
      
      extension [Self <: BigtableColumn](x: Self) {
        
        inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
        
        inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
        
        inline def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
        
        inline def setFieldNameUndefined: Self = StObject.set(x, "fieldName", js.undefined)
        
        inline def setOnlyReadLatest(value: Boolean): Self = StObject.set(x, "onlyReadLatest", value.asInstanceOf[js.Any])
        
        inline def setOnlyReadLatestUndefined: Self = StObject.set(x, "onlyReadLatest", js.undefined)
        
        inline def setQualifierEncoded(value: String): Self = StObject.set(x, "qualifierEncoded", value.asInstanceOf[js.Any])
        
        inline def setQualifierEncodedUndefined: Self = StObject.set(x, "qualifierEncoded", js.undefined)
        
        inline def setQualifierString(value: String): Self = StObject.set(x, "qualifierString", value.asInstanceOf[js.Any])
        
        inline def setQualifierStringUndefined: Self = StObject.set(x, "qualifierString", js.undefined)
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    trait BigtableColumnFamily extends StObject {
      
      var columns: js.UndefOr[js.Array[BigtableColumn]] = js.undefined
      
      var encoding: js.UndefOr[String] = js.undefined
      
      var familyId: js.UndefOr[String] = js.undefined
      
      var onlyReadLatest: js.UndefOr[Boolean] = js.undefined
      
      var `type`: js.UndefOr[String] = js.undefined
    }
    object BigtableColumnFamily {
      
      inline def apply(): BigtableColumnFamily = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[BigtableColumnFamily]
      }
      
      extension [Self <: BigtableColumnFamily](x: Self) {
        
        inline def setColumns(value: js.Array[BigtableColumn]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
        
        inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
        
        inline def setColumnsVarargs(value: BigtableColumn*): Self = StObject.set(x, "columns", js.Array(value*))
        
        inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
        
        inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
        
        inline def setFamilyId(value: String): Self = StObject.set(x, "familyId", value.asInstanceOf[js.Any])
        
        inline def setFamilyIdUndefined: Self = StObject.set(x, "familyId", js.undefined)
        
        inline def setOnlyReadLatest(value: Boolean): Self = StObject.set(x, "onlyReadLatest", value.asInstanceOf[js.Any])
        
        inline def setOnlyReadLatestUndefined: Self = StObject.set(x, "onlyReadLatest", js.undefined)
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    trait BigtableOptions extends StObject {
      
      var columnFamilies: js.UndefOr[js.Array[BigtableColumnFamily]] = js.undefined
      
      var ignoreUnspecifiedColumnFamilies: js.UndefOr[Boolean] = js.undefined
      
      var readRowkeyAsString: js.UndefOr[Boolean] = js.undefined
    }
    object BigtableOptions {
      
      inline def apply(): BigtableOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[BigtableOptions]
      }
      
      extension [Self <: BigtableOptions](x: Self) {
        
        inline def setColumnFamilies(value: js.Array[BigtableColumnFamily]): Self = StObject.set(x, "columnFamilies", value.asInstanceOf[js.Any])
        
        inline def setColumnFamiliesUndefined: Self = StObject.set(x, "columnFamilies", js.undefined)
        
        inline def setColumnFamiliesVarargs(value: BigtableColumnFamily*): Self = StObject.set(x, "columnFamilies", js.Array(value*))
        
        inline def setIgnoreUnspecifiedColumnFamilies(value: Boolean): Self = StObject.set(x, "ignoreUnspecifiedColumnFamilies", value.asInstanceOf[js.Any])
        
        inline def setIgnoreUnspecifiedColumnFamiliesUndefined: Self = StObject.set(x, "ignoreUnspecifiedColumnFamilies", js.undefined)
        
        inline def setReadRowkeyAsString(value: Boolean): Self = StObject.set(x, "readRowkeyAsString", value.asInstanceOf[js.Any])
        
        inline def setReadRowkeyAsStringUndefined: Self = StObject.set(x, "readRowkeyAsString", js.undefined)
      }
    }
    
    trait BqmlIterationResult extends StObject {
      
      var durationMs: js.UndefOr[String] = js.undefined
      
      var evalLoss: js.UndefOr[Double] = js.undefined
      
      var index: js.UndefOr[Double] = js.undefined
      
      var learnRate: js.UndefOr[Double] = js.undefined
      
      var trainingLoss: js.UndefOr[Double] = js.undefined
    }
    object BqmlIterationResult {
      
      inline def apply(): BqmlIterationResult = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[BqmlIterationResult]
      }
      
      extension [Self <: BqmlIterationResult](x: Self) {
        
        inline def setDurationMs(value: String): Self = StObject.set(x, "durationMs", value.asInstanceOf[js.Any])
        
        inline def setDurationMsUndefined: Self = StObject.set(x, "durationMs", js.undefined)
        
        inline def setEvalLoss(value: Double): Self = StObject.set(x, "evalLoss", value.asInstanceOf[js.Any])
        
        inline def setEvalLossUndefined: Self = StObject.set(x, "evalLoss", js.undefined)
        
        inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
        
        inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
        
        inline def setLearnRate(value: Double): Self = StObject.set(x, "learnRate", value.asInstanceOf[js.Any])
        
        inline def setLearnRateUndefined: Self = StObject.set(x, "learnRate", js.undefined)
        
        inline def setTrainingLoss(value: Double): Self = StObject.set(x, "trainingLoss", value.asInstanceOf[js.Any])
        
        inline def setTrainingLossUndefined: Self = StObject.set(x, "trainingLoss", js.undefined)
      }
    }
    
    trait BqmlTrainingRun extends StObject {
      
      var iterationResults: js.UndefOr[js.Array[BqmlIterationResult]] = js.undefined
      
      var startTime: js.UndefOr[String] = js.undefined
      
      var state: js.UndefOr[String] = js.undefined
      
      var trainingOptions: js.UndefOr[BqmlTrainingRunTrainingOptions] = js.undefined
    }
    object BqmlTrainingRun {
      
      inline def apply(): BqmlTrainingRun = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[BqmlTrainingRun]
      }
      
      extension [Self <: BqmlTrainingRun](x: Self) {
        
        inline def setIterationResults(value: js.Array[BqmlIterationResult]): Self = StObject.set(x, "iterationResults", value.asInstanceOf[js.Any])
        
        inline def setIterationResultsUndefined: Self = StObject.set(x, "iterationResults", js.undefined)
        
        inline def setIterationResultsVarargs(value: BqmlIterationResult*): Self = StObject.set(x, "iterationResults", js.Array(value*))
        
        inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
        
        inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
        
        inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
        
        inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
        
        inline def setTrainingOptions(value: BqmlTrainingRunTrainingOptions): Self = StObject.set(x, "trainingOptions", value.asInstanceOf[js.Any])
        
        inline def setTrainingOptionsUndefined: Self = StObject.set(x, "trainingOptions", js.undefined)
      }
    }
    
    trait BqmlTrainingRunTrainingOptions extends StObject {
      
      var earlyStop: js.UndefOr[Boolean] = js.undefined
      
      var l1Reg: js.UndefOr[Double] = js.undefined
      
      var l2Reg: js.UndefOr[Double] = js.undefined
      
      var learnRate: js.UndefOr[Double] = js.undefined
      
      var learnRateStrategy: js.UndefOr[String] = js.undefined
      
      var lineSearchInitLearnRate: js.UndefOr[Double] = js.undefined
      
      var maxIteration: js.UndefOr[String] = js.undefined
      
      var minRelProgress: js.UndefOr[Double] = js.undefined
      
      var warmStart: js.UndefOr[Boolean] = js.undefined
    }
    object BqmlTrainingRunTrainingOptions {
      
      inline def apply(): BqmlTrainingRunTrainingOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[BqmlTrainingRunTrainingOptions]
      }
      
      extension [Self <: BqmlTrainingRunTrainingOptions](x: Self) {
        
        inline def setEarlyStop(value: Boolean): Self = StObject.set(x, "earlyStop", value.asInstanceOf[js.Any])
        
        inline def setEarlyStopUndefined: Self = StObject.set(x, "earlyStop", js.undefined)
        
        inline def setL1Reg(value: Double): Self = StObject.set(x, "l1Reg", value.asInstanceOf[js.Any])
        
        inline def setL1RegUndefined: Self = StObject.set(x, "l1Reg", js.undefined)
        
        inline def setL2Reg(value: Double): Self = StObject.set(x, "l2Reg", value.asInstanceOf[js.Any])
        
        inline def setL2RegUndefined: Self = StObject.set(x, "l2Reg", js.undefined)
        
        inline def setLearnRate(value: Double): Self = StObject.set(x, "learnRate", value.asInstanceOf[js.Any])
        
        inline def setLearnRateStrategy(value: String): Self = StObject.set(x, "learnRateStrategy", value.asInstanceOf[js.Any])
        
        inline def setLearnRateStrategyUndefined: Self = StObject.set(x, "learnRateStrategy", js.undefined)
        
        inline def setLearnRateUndefined: Self = StObject.set(x, "learnRate", js.undefined)
        
        inline def setLineSearchInitLearnRate(value: Double): Self = StObject.set(x, "lineSearchInitLearnRate", value.asInstanceOf[js.Any])
        
        inline def setLineSearchInitLearnRateUndefined: Self = StObject.set(x, "lineSearchInitLearnRate", js.undefined)
        
        inline def setMaxIteration(value: String): Self = StObject.set(x, "maxIteration", value.asInstanceOf[js.Any])
        
        inline def setMaxIterationUndefined: Self = StObject.set(x, "maxIteration", js.undefined)
        
        inline def setMinRelProgress(value: Double): Self = StObject.set(x, "minRelProgress", value.asInstanceOf[js.Any])
        
        inline def setMinRelProgressUndefined: Self = StObject.set(x, "minRelProgress", js.undefined)
        
        inline def setWarmStart(value: Boolean): Self = StObject.set(x, "warmStart", value.asInstanceOf[js.Any])
        
        inline def setWarmStartUndefined: Self = StObject.set(x, "warmStart", js.undefined)
      }
    }
    
    trait Clustering extends StObject {
      
      var fields: js.UndefOr[js.Array[String]] = js.undefined
    }
    object Clustering {
      
      inline def apply(): Clustering = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Clustering]
      }
      
      extension [Self <: Clustering](x: Self) {
        
        inline def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
        
        inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
        
        inline def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value*))
      }
    }
    
    trait CsvOptions extends StObject {
      
      var allowJaggedRows: js.UndefOr[Boolean] = js.undefined
      
      var allowQuotedNewlines: js.UndefOr[Boolean] = js.undefined
      
      var encoding: js.UndefOr[String] = js.undefined
      
      var fieldDelimiter: js.UndefOr[String] = js.undefined
      
      var quote: js.UndefOr[String] = js.undefined
      
      var skipLeadingRows: js.UndefOr[String] = js.undefined
    }
    object CsvOptions {
      
      inline def apply(): CsvOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CsvOptions]
      }
      
      extension [Self <: CsvOptions](x: Self) {
        
        inline def setAllowJaggedRows(value: Boolean): Self = StObject.set(x, "allowJaggedRows", value.asInstanceOf[js.Any])
        
        inline def setAllowJaggedRowsUndefined: Self = StObject.set(x, "allowJaggedRows", js.undefined)
        
        inline def setAllowQuotedNewlines(value: Boolean): Self = StObject.set(x, "allowQuotedNewlines", value.asInstanceOf[js.Any])
        
        inline def setAllowQuotedNewlinesUndefined: Self = StObject.set(x, "allowQuotedNewlines", js.undefined)
        
        inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
        
        inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
        
        inline def setFieldDelimiter(value: String): Self = StObject.set(x, "fieldDelimiter", value.asInstanceOf[js.Any])
        
        inline def setFieldDelimiterUndefined: Self = StObject.set(x, "fieldDelimiter", js.undefined)
        
        inline def setQuote(value: String): Self = StObject.set(x, "quote", value.asInstanceOf[js.Any])
        
        inline def setQuoteUndefined: Self = StObject.set(x, "quote", js.undefined)
        
        inline def setSkipLeadingRows(value: String): Self = StObject.set(x, "skipLeadingRows", value.asInstanceOf[js.Any])
        
        inline def setSkipLeadingRowsUndefined: Self = StObject.set(x, "skipLeadingRows", js.undefined)
      }
    }
    
    trait Dataset extends StObject {
      
      var access: js.UndefOr[js.Array[DatasetAccess]] = js.undefined
      
      var creationTime: js.UndefOr[String] = js.undefined
      
      var datasetReference: js.UndefOr[DatasetReference] = js.undefined
      
      var defaultPartitionExpirationMs: js.UndefOr[String] = js.undefined
      
      var defaultTableExpirationMs: js.UndefOr[String] = js.undefined
      
      var description: js.UndefOr[String] = js.undefined
      
      var etag: js.UndefOr[String] = js.undefined
      
      var friendlyName: js.UndefOr[String] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var labels: js.UndefOr[js.Object] = js.undefined
      
      var lastModifiedTime: js.UndefOr[String] = js.undefined
      
      var location: js.UndefOr[String] = js.undefined
      
      var selfLink: js.UndefOr[String] = js.undefined
    }
    object Dataset {
      
      inline def apply(): Dataset = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Dataset]
      }
      
      extension [Self <: Dataset](x: Self) {
        
        inline def setAccess(value: js.Array[DatasetAccess]): Self = StObject.set(x, "access", value.asInstanceOf[js.Any])
        
        inline def setAccessUndefined: Self = StObject.set(x, "access", js.undefined)
        
        inline def setAccessVarargs(value: DatasetAccess*): Self = StObject.set(x, "access", js.Array(value*))
        
        inline def setCreationTime(value: String): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
        
        inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
        
        inline def setDatasetReference(value: DatasetReference): Self = StObject.set(x, "datasetReference", value.asInstanceOf[js.Any])
        
        inline def setDatasetReferenceUndefined: Self = StObject.set(x, "datasetReference", js.undefined)
        
        inline def setDefaultPartitionExpirationMs(value: String): Self = StObject.set(x, "defaultPartitionExpirationMs", value.asInstanceOf[js.Any])
        
        inline def setDefaultPartitionExpirationMsUndefined: Self = StObject.set(x, "defaultPartitionExpirationMs", js.undefined)
        
        inline def setDefaultTableExpirationMs(value: String): Self = StObject.set(x, "defaultTableExpirationMs", value.asInstanceOf[js.Any])
        
        inline def setDefaultTableExpirationMsUndefined: Self = StObject.set(x, "defaultTableExpirationMs", js.undefined)
        
        inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
        
        inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setLabels(value: js.Object): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
        
        inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
        
        inline def setLastModifiedTime(value: String): Self = StObject.set(x, "lastModifiedTime", value.asInstanceOf[js.Any])
        
        inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "lastModifiedTime", js.undefined)
        
        inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
        
        inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
        
        inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
        
        inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
      }
    }
    
    trait DatasetAccess extends StObject {
      
      var domain: js.UndefOr[String] = js.undefined
      
      var groupByEmail: js.UndefOr[String] = js.undefined
      
      var iamMember: js.UndefOr[String] = js.undefined
      
      var role: js.UndefOr[String] = js.undefined
      
      var specialGroup: js.UndefOr[String] = js.undefined
      
      var userByEmail: js.UndefOr[String] = js.undefined
      
      var view: js.UndefOr[TableReference] = js.undefined
    }
    object DatasetAccess {
      
      inline def apply(): DatasetAccess = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DatasetAccess]
      }
      
      extension [Self <: DatasetAccess](x: Self) {
        
        inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
        
        inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
        
        inline def setGroupByEmail(value: String): Self = StObject.set(x, "groupByEmail", value.asInstanceOf[js.Any])
        
        inline def setGroupByEmailUndefined: Self = StObject.set(x, "groupByEmail", js.undefined)
        
        inline def setIamMember(value: String): Self = StObject.set(x, "iamMember", value.asInstanceOf[js.Any])
        
        inline def setIamMemberUndefined: Self = StObject.set(x, "iamMember", js.undefined)
        
        inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
        
        inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
        
        inline def setSpecialGroup(value: String): Self = StObject.set(x, "specialGroup", value.asInstanceOf[js.Any])
        
        inline def setSpecialGroupUndefined: Self = StObject.set(x, "specialGroup", js.undefined)
        
        inline def setUserByEmail(value: String): Self = StObject.set(x, "userByEmail", value.asInstanceOf[js.Any])
        
        inline def setUserByEmailUndefined: Self = StObject.set(x, "userByEmail", js.undefined)
        
        inline def setView(value: TableReference): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
        
        inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
      }
    }
    
    trait DatasetList extends StObject {
      
      var datasets: js.UndefOr[js.Array[DatasetListDatasets]] = js.undefined
      
      var etag: js.UndefOr[String] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var nextPageToken: js.UndefOr[String] = js.undefined
    }
    object DatasetList {
      
      inline def apply(): DatasetList = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DatasetList]
      }
      
      extension [Self <: DatasetList](x: Self) {
        
        inline def setDatasets(value: js.Array[DatasetListDatasets]): Self = StObject.set(x, "datasets", value.asInstanceOf[js.Any])
        
        inline def setDatasetsUndefined: Self = StObject.set(x, "datasets", js.undefined)
        
        inline def setDatasetsVarargs(value: DatasetListDatasets*): Self = StObject.set(x, "datasets", js.Array(value*))
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
      }
    }
    
    trait DatasetListDatasets extends StObject {
      
      var datasetReference: js.UndefOr[DatasetReference] = js.undefined
      
      var friendlyName: js.UndefOr[String] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var labels: js.UndefOr[js.Object] = js.undefined
      
      var location: js.UndefOr[String] = js.undefined
    }
    object DatasetListDatasets {
      
      inline def apply(): DatasetListDatasets = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DatasetListDatasets]
      }
      
      extension [Self <: DatasetListDatasets](x: Self) {
        
        inline def setDatasetReference(value: DatasetReference): Self = StObject.set(x, "datasetReference", value.asInstanceOf[js.Any])
        
        inline def setDatasetReferenceUndefined: Self = StObject.set(x, "datasetReference", js.undefined)
        
        inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
        
        inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setLabels(value: js.Object): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
        
        inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
        
        inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
        
        inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      }
    }
    
    trait DatasetReference extends StObject {
      
      var datasetId: js.UndefOr[String] = js.undefined
      
      var projectId: js.UndefOr[String] = js.undefined
    }
    object DatasetReference {
      
      inline def apply(): DatasetReference = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DatasetReference]
      }
      
      extension [Self <: DatasetReference](x: Self) {
        
        inline def setDatasetId(value: String): Self = StObject.set(x, "datasetId", value.asInstanceOf[js.Any])
        
        inline def setDatasetIdUndefined: Self = StObject.set(x, "datasetId", js.undefined)
        
        inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
        
        inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
      }
    }
    
    trait DestinationTableProperties extends StObject {
      
      var description: js.UndefOr[String] = js.undefined
      
      var friendlyName: js.UndefOr[String] = js.undefined
      
      var labels: js.UndefOr[js.Object] = js.undefined
    }
    object DestinationTableProperties {
      
      inline def apply(): DestinationTableProperties = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DestinationTableProperties]
      }
      
      extension [Self <: DestinationTableProperties](x: Self) {
        
        inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
        
        inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
        
        inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
        
        inline def setLabels(value: js.Object): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
        
        inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      }
    }
    
    trait EncryptionConfiguration extends StObject {
      
      var kmsKeyName: js.UndefOr[String] = js.undefined
    }
    object EncryptionConfiguration {
      
      inline def apply(): EncryptionConfiguration = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[EncryptionConfiguration]
      }
      
      extension [Self <: EncryptionConfiguration](x: Self) {
        
        inline def setKmsKeyName(value: String): Self = StObject.set(x, "kmsKeyName", value.asInstanceOf[js.Any])
        
        inline def setKmsKeyNameUndefined: Self = StObject.set(x, "kmsKeyName", js.undefined)
      }
    }
    
    trait ErrorProto extends StObject {
      
      var debugInfo: js.UndefOr[String] = js.undefined
      
      var location: js.UndefOr[String] = js.undefined
      
      var message: js.UndefOr[String] = js.undefined
      
      var reason: js.UndefOr[String] = js.undefined
    }
    object ErrorProto {
      
      inline def apply(): ErrorProto = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ErrorProto]
      }
      
      extension [Self <: ErrorProto](x: Self) {
        
        inline def setDebugInfo(value: String): Self = StObject.set(x, "debugInfo", value.asInstanceOf[js.Any])
        
        inline def setDebugInfoUndefined: Self = StObject.set(x, "debugInfo", js.undefined)
        
        inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
        
        inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
        
        inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
        
        inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
        
        inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
        
        inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
      }
    }
    
    trait ExplainQueryStage extends StObject {
      
      var completedParallelInputs: js.UndefOr[String] = js.undefined
      
      var computeMsAvg: js.UndefOr[String] = js.undefined
      
      var computeMsMax: js.UndefOr[String] = js.undefined
      
      var computeRatioAvg: js.UndefOr[Double] = js.undefined
      
      var computeRatioMax: js.UndefOr[Double] = js.undefined
      
      var endMs: js.UndefOr[String] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
      
      var inputStages: js.UndefOr[js.Array[String]] = js.undefined
      
      var name: js.UndefOr[String] = js.undefined
      
      var parallelInputs: js.UndefOr[String] = js.undefined
      
      var readMsAvg: js.UndefOr[String] = js.undefined
      
      var readMsMax: js.UndefOr[String] = js.undefined
      
      var readRatioAvg: js.UndefOr[Double] = js.undefined
      
      var readRatioMax: js.UndefOr[Double] = js.undefined
      
      var recordsRead: js.UndefOr[String] = js.undefined
      
      var recordsWritten: js.UndefOr[String] = js.undefined
      
      var shuffleOutputBytes: js.UndefOr[String] = js.undefined
      
      var shuffleOutputBytesSpilled: js.UndefOr[String] = js.undefined
      
      var startMs: js.UndefOr[String] = js.undefined
      
      var status: js.UndefOr[String] = js.undefined
      
      var steps: js.UndefOr[js.Array[ExplainQueryStep]] = js.undefined
      
      var waitMsAvg: js.UndefOr[String] = js.undefined
      
      var waitMsMax: js.UndefOr[String] = js.undefined
      
      var waitRatioAvg: js.UndefOr[Double] = js.undefined
      
      var waitRatioMax: js.UndefOr[Double] = js.undefined
      
      var writeMsAvg: js.UndefOr[String] = js.undefined
      
      var writeMsMax: js.UndefOr[String] = js.undefined
      
      var writeRatioAvg: js.UndefOr[Double] = js.undefined
      
      var writeRatioMax: js.UndefOr[Double] = js.undefined
    }
    object ExplainQueryStage {
      
      inline def apply(): ExplainQueryStage = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ExplainQueryStage]
      }
      
      extension [Self <: ExplainQueryStage](x: Self) {
        
        inline def setCompletedParallelInputs(value: String): Self = StObject.set(x, "completedParallelInputs", value.asInstanceOf[js.Any])
        
        inline def setCompletedParallelInputsUndefined: Self = StObject.set(x, "completedParallelInputs", js.undefined)
        
        inline def setComputeMsAvg(value: String): Self = StObject.set(x, "computeMsAvg", value.asInstanceOf[js.Any])
        
        inline def setComputeMsAvgUndefined: Self = StObject.set(x, "computeMsAvg", js.undefined)
        
        inline def setComputeMsMax(value: String): Self = StObject.set(x, "computeMsMax", value.asInstanceOf[js.Any])
        
        inline def setComputeMsMaxUndefined: Self = StObject.set(x, "computeMsMax", js.undefined)
        
        inline def setComputeRatioAvg(value: Double): Self = StObject.set(x, "computeRatioAvg", value.asInstanceOf[js.Any])
        
        inline def setComputeRatioAvgUndefined: Self = StObject.set(x, "computeRatioAvg", js.undefined)
        
        inline def setComputeRatioMax(value: Double): Self = StObject.set(x, "computeRatioMax", value.asInstanceOf[js.Any])
        
        inline def setComputeRatioMaxUndefined: Self = StObject.set(x, "computeRatioMax", js.undefined)
        
        inline def setEndMs(value: String): Self = StObject.set(x, "endMs", value.asInstanceOf[js.Any])
        
        inline def setEndMsUndefined: Self = StObject.set(x, "endMs", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setInputStages(value: js.Array[String]): Self = StObject.set(x, "inputStages", value.asInstanceOf[js.Any])
        
        inline def setInputStagesUndefined: Self = StObject.set(x, "inputStages", js.undefined)
        
        inline def setInputStagesVarargs(value: String*): Self = StObject.set(x, "inputStages", js.Array(value*))
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setParallelInputs(value: String): Self = StObject.set(x, "parallelInputs", value.asInstanceOf[js.Any])
        
        inline def setParallelInputsUndefined: Self = StObject.set(x, "parallelInputs", js.undefined)
        
        inline def setReadMsAvg(value: String): Self = StObject.set(x, "readMsAvg", value.asInstanceOf[js.Any])
        
        inline def setReadMsAvgUndefined: Self = StObject.set(x, "readMsAvg", js.undefined)
        
        inline def setReadMsMax(value: String): Self = StObject.set(x, "readMsMax", value.asInstanceOf[js.Any])
        
        inline def setReadMsMaxUndefined: Self = StObject.set(x, "readMsMax", js.undefined)
        
        inline def setReadRatioAvg(value: Double): Self = StObject.set(x, "readRatioAvg", value.asInstanceOf[js.Any])
        
        inline def setReadRatioAvgUndefined: Self = StObject.set(x, "readRatioAvg", js.undefined)
        
        inline def setReadRatioMax(value: Double): Self = StObject.set(x, "readRatioMax", value.asInstanceOf[js.Any])
        
        inline def setReadRatioMaxUndefined: Self = StObject.set(x, "readRatioMax", js.undefined)
        
        inline def setRecordsRead(value: String): Self = StObject.set(x, "recordsRead", value.asInstanceOf[js.Any])
        
        inline def setRecordsReadUndefined: Self = StObject.set(x, "recordsRead", js.undefined)
        
        inline def setRecordsWritten(value: String): Self = StObject.set(x, "recordsWritten", value.asInstanceOf[js.Any])
        
        inline def setRecordsWrittenUndefined: Self = StObject.set(x, "recordsWritten", js.undefined)
        
        inline def setShuffleOutputBytes(value: String): Self = StObject.set(x, "shuffleOutputBytes", value.asInstanceOf[js.Any])
        
        inline def setShuffleOutputBytesSpilled(value: String): Self = StObject.set(x, "shuffleOutputBytesSpilled", value.asInstanceOf[js.Any])
        
        inline def setShuffleOutputBytesSpilledUndefined: Self = StObject.set(x, "shuffleOutputBytesSpilled", js.undefined)
        
        inline def setShuffleOutputBytesUndefined: Self = StObject.set(x, "shuffleOutputBytes", js.undefined)
        
        inline def setStartMs(value: String): Self = StObject.set(x, "startMs", value.asInstanceOf[js.Any])
        
        inline def setStartMsUndefined: Self = StObject.set(x, "startMs", js.undefined)
        
        inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
        
        inline def setSteps(value: js.Array[ExplainQueryStep]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
        
        inline def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
        
        inline def setStepsVarargs(value: ExplainQueryStep*): Self = StObject.set(x, "steps", js.Array(value*))
        
        inline def setWaitMsAvg(value: String): Self = StObject.set(x, "waitMsAvg", value.asInstanceOf[js.Any])
        
        inline def setWaitMsAvgUndefined: Self = StObject.set(x, "waitMsAvg", js.undefined)
        
        inline def setWaitMsMax(value: String): Self = StObject.set(x, "waitMsMax", value.asInstanceOf[js.Any])
        
        inline def setWaitMsMaxUndefined: Self = StObject.set(x, "waitMsMax", js.undefined)
        
        inline def setWaitRatioAvg(value: Double): Self = StObject.set(x, "waitRatioAvg", value.asInstanceOf[js.Any])
        
        inline def setWaitRatioAvgUndefined: Self = StObject.set(x, "waitRatioAvg", js.undefined)
        
        inline def setWaitRatioMax(value: Double): Self = StObject.set(x, "waitRatioMax", value.asInstanceOf[js.Any])
        
        inline def setWaitRatioMaxUndefined: Self = StObject.set(x, "waitRatioMax", js.undefined)
        
        inline def setWriteMsAvg(value: String): Self = StObject.set(x, "writeMsAvg", value.asInstanceOf[js.Any])
        
        inline def setWriteMsAvgUndefined: Self = StObject.set(x, "writeMsAvg", js.undefined)
        
        inline def setWriteMsMax(value: String): Self = StObject.set(x, "writeMsMax", value.asInstanceOf[js.Any])
        
        inline def setWriteMsMaxUndefined: Self = StObject.set(x, "writeMsMax", js.undefined)
        
        inline def setWriteRatioAvg(value: Double): Self = StObject.set(x, "writeRatioAvg", value.asInstanceOf[js.Any])
        
        inline def setWriteRatioAvgUndefined: Self = StObject.set(x, "writeRatioAvg", js.undefined)
        
        inline def setWriteRatioMax(value: Double): Self = StObject.set(x, "writeRatioMax", value.asInstanceOf[js.Any])
        
        inline def setWriteRatioMaxUndefined: Self = StObject.set(x, "writeRatioMax", js.undefined)
      }
    }
    
    trait ExplainQueryStep extends StObject {
      
      var kind: js.UndefOr[String] = js.undefined
      
      var substeps: js.UndefOr[js.Array[String]] = js.undefined
    }
    object ExplainQueryStep {
      
      inline def apply(): ExplainQueryStep = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ExplainQueryStep]
      }
      
      extension [Self <: ExplainQueryStep](x: Self) {
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setSubsteps(value: js.Array[String]): Self = StObject.set(x, "substeps", value.asInstanceOf[js.Any])
        
        inline def setSubstepsUndefined: Self = StObject.set(x, "substeps", js.undefined)
        
        inline def setSubstepsVarargs(value: String*): Self = StObject.set(x, "substeps", js.Array(value*))
      }
    }
    
    trait ExternalDataConfiguration extends StObject {
      
      var autodetect: js.UndefOr[Boolean] = js.undefined
      
      var bigtableOptions: js.UndefOr[BigtableOptions] = js.undefined
      
      var compression: js.UndefOr[String] = js.undefined
      
      var csvOptions: js.UndefOr[CsvOptions] = js.undefined
      
      var googleSheetsOptions: js.UndefOr[GoogleSheetsOptions] = js.undefined
      
      var hivePartitioningMode: js.UndefOr[String] = js.undefined
      
      var ignoreUnknownValues: js.UndefOr[Boolean] = js.undefined
      
      var maxBadRecords: js.UndefOr[Double] = js.undefined
      
      var schema: js.UndefOr[TableSchema] = js.undefined
      
      var sourceFormat: js.UndefOr[String] = js.undefined
      
      var sourceUris: js.UndefOr[js.Array[String]] = js.undefined
    }
    object ExternalDataConfiguration {
      
      inline def apply(): ExternalDataConfiguration = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ExternalDataConfiguration]
      }
      
      extension [Self <: ExternalDataConfiguration](x: Self) {
        
        inline def setAutodetect(value: Boolean): Self = StObject.set(x, "autodetect", value.asInstanceOf[js.Any])
        
        inline def setAutodetectUndefined: Self = StObject.set(x, "autodetect", js.undefined)
        
        inline def setBigtableOptions(value: BigtableOptions): Self = StObject.set(x, "bigtableOptions", value.asInstanceOf[js.Any])
        
        inline def setBigtableOptionsUndefined: Self = StObject.set(x, "bigtableOptions", js.undefined)
        
        inline def setCompression(value: String): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
        
        inline def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
        
        inline def setCsvOptions(value: CsvOptions): Self = StObject.set(x, "csvOptions", value.asInstanceOf[js.Any])
        
        inline def setCsvOptionsUndefined: Self = StObject.set(x, "csvOptions", js.undefined)
        
        inline def setGoogleSheetsOptions(value: GoogleSheetsOptions): Self = StObject.set(x, "googleSheetsOptions", value.asInstanceOf[js.Any])
        
        inline def setGoogleSheetsOptionsUndefined: Self = StObject.set(x, "googleSheetsOptions", js.undefined)
        
        inline def setHivePartitioningMode(value: String): Self = StObject.set(x, "hivePartitioningMode", value.asInstanceOf[js.Any])
        
        inline def setHivePartitioningModeUndefined: Self = StObject.set(x, "hivePartitioningMode", js.undefined)
        
        inline def setIgnoreUnknownValues(value: Boolean): Self = StObject.set(x, "ignoreUnknownValues", value.asInstanceOf[js.Any])
        
        inline def setIgnoreUnknownValuesUndefined: Self = StObject.set(x, "ignoreUnknownValues", js.undefined)
        
        inline def setMaxBadRecords(value: Double): Self = StObject.set(x, "maxBadRecords", value.asInstanceOf[js.Any])
        
        inline def setMaxBadRecordsUndefined: Self = StObject.set(x, "maxBadRecords", js.undefined)
        
        inline def setSchema(value: TableSchema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
        
        inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
        
        inline def setSourceFormat(value: String): Self = StObject.set(x, "sourceFormat", value.asInstanceOf[js.Any])
        
        inline def setSourceFormatUndefined: Self = StObject.set(x, "sourceFormat", js.undefined)
        
        inline def setSourceUris(value: js.Array[String]): Self = StObject.set(x, "sourceUris", value.asInstanceOf[js.Any])
        
        inline def setSourceUrisUndefined: Self = StObject.set(x, "sourceUris", js.undefined)
        
        inline def setSourceUrisVarargs(value: String*): Self = StObject.set(x, "sourceUris", js.Array(value*))
      }
    }
    
    trait GetQueryResultsResponse extends StObject {
      
      var cacheHit: js.UndefOr[Boolean] = js.undefined
      
      var errors: js.UndefOr[js.Array[ErrorProto]] = js.undefined
      
      var etag: js.UndefOr[String] = js.undefined
      
      var jobComplete: js.UndefOr[Boolean] = js.undefined
      
      var jobReference: js.UndefOr[JobReference] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var numDmlAffectedRows: js.UndefOr[String] = js.undefined
      
      var pageToken: js.UndefOr[String] = js.undefined
      
      var rows: js.UndefOr[js.Array[TableRow]] = js.undefined
      
      var schema: js.UndefOr[TableSchema] = js.undefined
      
      var totalBytesProcessed: js.UndefOr[String] = js.undefined
      
      var totalRows: js.UndefOr[String] = js.undefined
    }
    object GetQueryResultsResponse {
      
      inline def apply(): GetQueryResultsResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[GetQueryResultsResponse]
      }
      
      extension [Self <: GetQueryResultsResponse](x: Self) {
        
        inline def setCacheHit(value: Boolean): Self = StObject.set(x, "cacheHit", value.asInstanceOf[js.Any])
        
        inline def setCacheHitUndefined: Self = StObject.set(x, "cacheHit", js.undefined)
        
        inline def setErrors(value: js.Array[ErrorProto]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
        
        inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
        
        inline def setErrorsVarargs(value: ErrorProto*): Self = StObject.set(x, "errors", js.Array(value*))
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setJobComplete(value: Boolean): Self = StObject.set(x, "jobComplete", value.asInstanceOf[js.Any])
        
        inline def setJobCompleteUndefined: Self = StObject.set(x, "jobComplete", js.undefined)
        
        inline def setJobReference(value: JobReference): Self = StObject.set(x, "jobReference", value.asInstanceOf[js.Any])
        
        inline def setJobReferenceUndefined: Self = StObject.set(x, "jobReference", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setNumDmlAffectedRows(value: String): Self = StObject.set(x, "numDmlAffectedRows", value.asInstanceOf[js.Any])
        
        inline def setNumDmlAffectedRowsUndefined: Self = StObject.set(x, "numDmlAffectedRows", js.undefined)
        
        inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
        
        inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
        
        inline def setRows(value: js.Array[TableRow]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
        
        inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
        
        inline def setRowsVarargs(value: TableRow*): Self = StObject.set(x, "rows", js.Array(value*))
        
        inline def setSchema(value: TableSchema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
        
        inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
        
        inline def setTotalBytesProcessed(value: String): Self = StObject.set(x, "totalBytesProcessed", value.asInstanceOf[js.Any])
        
        inline def setTotalBytesProcessedUndefined: Self = StObject.set(x, "totalBytesProcessed", js.undefined)
        
        inline def setTotalRows(value: String): Self = StObject.set(x, "totalRows", value.asInstanceOf[js.Any])
        
        inline def setTotalRowsUndefined: Self = StObject.set(x, "totalRows", js.undefined)
      }
    }
    
    trait GetServiceAccountResponse extends StObject {
      
      var email: js.UndefOr[String] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
    }
    object GetServiceAccountResponse {
      
      inline def apply(): GetServiceAccountResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[GetServiceAccountResponse]
      }
      
      extension [Self <: GetServiceAccountResponse](x: Self) {
        
        inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
        
        inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      }
    }
    
    trait GoogleSheetsOptions extends StObject {
      
      var range: js.UndefOr[String] = js.undefined
      
      var skipLeadingRows: js.UndefOr[String] = js.undefined
    }
    object GoogleSheetsOptions {
      
      inline def apply(): GoogleSheetsOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[GoogleSheetsOptions]
      }
      
      extension [Self <: GoogleSheetsOptions](x: Self) {
        
        inline def setRange(value: String): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
        
        inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
        
        inline def setSkipLeadingRows(value: String): Self = StObject.set(x, "skipLeadingRows", value.asInstanceOf[js.Any])
        
        inline def setSkipLeadingRowsUndefined: Self = StObject.set(x, "skipLeadingRows", js.undefined)
      }
    }
    
    trait Job extends StObject {
      
      var configuration: js.UndefOr[JobConfiguration] = js.undefined
      
      var etag: js.UndefOr[String] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
      
      var jobReference: js.UndefOr[JobReference] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var selfLink: js.UndefOr[String] = js.undefined
      
      var statistics: js.UndefOr[JobStatistics] = js.undefined
      
      var status: js.UndefOr[JobStatus] = js.undefined
      
      var user_email: js.UndefOr[String] = js.undefined
    }
    object Job {
      
      inline def apply(): Job = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Job]
      }
      
      extension [Self <: Job](x: Self) {
        
        inline def setConfiguration(value: JobConfiguration): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
        
        inline def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setJobReference(value: JobReference): Self = StObject.set(x, "jobReference", value.asInstanceOf[js.Any])
        
        inline def setJobReferenceUndefined: Self = StObject.set(x, "jobReference", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
        
        inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
        
        inline def setStatistics(value: JobStatistics): Self = StObject.set(x, "statistics", value.asInstanceOf[js.Any])
        
        inline def setStatisticsUndefined: Self = StObject.set(x, "statistics", js.undefined)
        
        inline def setStatus(value: JobStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
        
        inline def setUser_email(value: String): Self = StObject.set(x, "user_email", value.asInstanceOf[js.Any])
        
        inline def setUser_emailUndefined: Self = StObject.set(x, "user_email", js.undefined)
      }
    }
    
    trait JobCancelResponse extends StObject {
      
      var job: js.UndefOr[Job] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
    }
    object JobCancelResponse {
      
      inline def apply(): JobCancelResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[JobCancelResponse]
      }
      
      extension [Self <: JobCancelResponse](x: Self) {
        
        inline def setJob(value: Job): Self = StObject.set(x, "job", value.asInstanceOf[js.Any])
        
        inline def setJobUndefined: Self = StObject.set(x, "job", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      }
    }
    
    trait JobConfiguration extends StObject {
      
      var copy: js.UndefOr[JobConfigurationTableCopy] = js.undefined
      
      var dryRun: js.UndefOr[Boolean] = js.undefined
      
      var extract: js.UndefOr[JobConfigurationExtract] = js.undefined
      
      var jobTimeoutMs: js.UndefOr[String] = js.undefined
      
      var jobType: js.UndefOr[String] = js.undefined
      
      var labels: js.UndefOr[js.Object] = js.undefined
      
      var load: js.UndefOr[JobConfigurationLoad] = js.undefined
      
      var query: js.UndefOr[JobConfigurationQuery] = js.undefined
    }
    object JobConfiguration {
      
      inline def apply(): JobConfiguration = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[JobConfiguration]
      }
      
      extension [Self <: JobConfiguration](x: Self) {
        
        inline def setCopy(value: JobConfigurationTableCopy): Self = StObject.set(x, "copy", value.asInstanceOf[js.Any])
        
        inline def setCopyUndefined: Self = StObject.set(x, "copy", js.undefined)
        
        inline def setDryRun(value: Boolean): Self = StObject.set(x, "dryRun", value.asInstanceOf[js.Any])
        
        inline def setDryRunUndefined: Self = StObject.set(x, "dryRun", js.undefined)
        
        inline def setExtract(value: JobConfigurationExtract): Self = StObject.set(x, "extract", value.asInstanceOf[js.Any])
        
        inline def setExtractUndefined: Self = StObject.set(x, "extract", js.undefined)
        
        inline def setJobTimeoutMs(value: String): Self = StObject.set(x, "jobTimeoutMs", value.asInstanceOf[js.Any])
        
        inline def setJobTimeoutMsUndefined: Self = StObject.set(x, "jobTimeoutMs", js.undefined)
        
        inline def setJobType(value: String): Self = StObject.set(x, "jobType", value.asInstanceOf[js.Any])
        
        inline def setJobTypeUndefined: Self = StObject.set(x, "jobType", js.undefined)
        
        inline def setLabels(value: js.Object): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
        
        inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
        
        inline def setLoad(value: JobConfigurationLoad): Self = StObject.set(x, "load", value.asInstanceOf[js.Any])
        
        inline def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
        
        inline def setQuery(value: JobConfigurationQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
        
        inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      }
    }
    
    trait JobConfigurationExtract extends StObject {
      
      var compression: js.UndefOr[String] = js.undefined
      
      var destinationFormat: js.UndefOr[String] = js.undefined
      
      var destinationUri: js.UndefOr[String] = js.undefined
      
      var destinationUris: js.UndefOr[js.Array[String]] = js.undefined
      
      var fieldDelimiter: js.UndefOr[String] = js.undefined
      
      var printHeader: js.UndefOr[Boolean] = js.undefined
      
      var sourceTable: js.UndefOr[TableReference] = js.undefined
    }
    object JobConfigurationExtract {
      
      inline def apply(): JobConfigurationExtract = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[JobConfigurationExtract]
      }
      
      extension [Self <: JobConfigurationExtract](x: Self) {
        
        inline def setCompression(value: String): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
        
        inline def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
        
        inline def setDestinationFormat(value: String): Self = StObject.set(x, "destinationFormat", value.asInstanceOf[js.Any])
        
        inline def setDestinationFormatUndefined: Self = StObject.set(x, "destinationFormat", js.undefined)
        
        inline def setDestinationUri(value: String): Self = StObject.set(x, "destinationUri", value.asInstanceOf[js.Any])
        
        inline def setDestinationUriUndefined: Self = StObject.set(x, "destinationUri", js.undefined)
        
        inline def setDestinationUris(value: js.Array[String]): Self = StObject.set(x, "destinationUris", value.asInstanceOf[js.Any])
        
        inline def setDestinationUrisUndefined: Self = StObject.set(x, "destinationUris", js.undefined)
        
        inline def setDestinationUrisVarargs(value: String*): Self = StObject.set(x, "destinationUris", js.Array(value*))
        
        inline def setFieldDelimiter(value: String): Self = StObject.set(x, "fieldDelimiter", value.asInstanceOf[js.Any])
        
        inline def setFieldDelimiterUndefined: Self = StObject.set(x, "fieldDelimiter", js.undefined)
        
        inline def setPrintHeader(value: Boolean): Self = StObject.set(x, "printHeader", value.asInstanceOf[js.Any])
        
        inline def setPrintHeaderUndefined: Self = StObject.set(x, "printHeader", js.undefined)
        
        inline def setSourceTable(value: TableReference): Self = StObject.set(x, "sourceTable", value.asInstanceOf[js.Any])
        
        inline def setSourceTableUndefined: Self = StObject.set(x, "sourceTable", js.undefined)
      }
    }
    
    trait JobConfigurationLoad extends StObject {
      
      var allowJaggedRows: js.UndefOr[Boolean] = js.undefined
      
      var allowQuotedNewlines: js.UndefOr[Boolean] = js.undefined
      
      var autodetect: js.UndefOr[Boolean] = js.undefined
      
      var clustering: js.UndefOr[Clustering] = js.undefined
      
      var createDisposition: js.UndefOr[String] = js.undefined
      
      var destinationEncryptionConfiguration: js.UndefOr[EncryptionConfiguration] = js.undefined
      
      var destinationTable: js.UndefOr[TableReference] = js.undefined
      
      var destinationTableProperties: js.UndefOr[DestinationTableProperties] = js.undefined
      
      var encoding: js.UndefOr[String] = js.undefined
      
      var fieldDelimiter: js.UndefOr[String] = js.undefined
      
      var hivePartitioningMode: js.UndefOr[String] = js.undefined
      
      var ignoreUnknownValues: js.UndefOr[Boolean] = js.undefined
      
      var maxBadRecords: js.UndefOr[Double] = js.undefined
      
      var nullMarker: js.UndefOr[String] = js.undefined
      
      var projectionFields: js.UndefOr[js.Array[String]] = js.undefined
      
      var quote: js.UndefOr[String] = js.undefined
      
      var rangePartitioning: js.UndefOr[RangePartitioning] = js.undefined
      
      var schema: js.UndefOr[TableSchema] = js.undefined
      
      var schemaInline: js.UndefOr[String] = js.undefined
      
      var schemaInlineFormat: js.UndefOr[String] = js.undefined
      
      var schemaUpdateOptions: js.UndefOr[js.Array[String]] = js.undefined
      
      var skipLeadingRows: js.UndefOr[Double] = js.undefined
      
      var sourceFormat: js.UndefOr[String] = js.undefined
      
      var sourceUris: js.UndefOr[js.Array[String]] = js.undefined
      
      var timePartitioning: js.UndefOr[TimePartitioning] = js.undefined
      
      var useAvroLogicalTypes: js.UndefOr[Boolean] = js.undefined
      
      var writeDisposition: js.UndefOr[String] = js.undefined
    }
    object JobConfigurationLoad {
      
      inline def apply(): JobConfigurationLoad = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[JobConfigurationLoad]
      }
      
      extension [Self <: JobConfigurationLoad](x: Self) {
        
        inline def setAllowJaggedRows(value: Boolean): Self = StObject.set(x, "allowJaggedRows", value.asInstanceOf[js.Any])
        
        inline def setAllowJaggedRowsUndefined: Self = StObject.set(x, "allowJaggedRows", js.undefined)
        
        inline def setAllowQuotedNewlines(value: Boolean): Self = StObject.set(x, "allowQuotedNewlines", value.asInstanceOf[js.Any])
        
        inline def setAllowQuotedNewlinesUndefined: Self = StObject.set(x, "allowQuotedNewlines", js.undefined)
        
        inline def setAutodetect(value: Boolean): Self = StObject.set(x, "autodetect", value.asInstanceOf[js.Any])
        
        inline def setAutodetectUndefined: Self = StObject.set(x, "autodetect", js.undefined)
        
        inline def setClustering(value: Clustering): Self = StObject.set(x, "clustering", value.asInstanceOf[js.Any])
        
        inline def setClusteringUndefined: Self = StObject.set(x, "clustering", js.undefined)
        
        inline def setCreateDisposition(value: String): Self = StObject.set(x, "createDisposition", value.asInstanceOf[js.Any])
        
        inline def setCreateDispositionUndefined: Self = StObject.set(x, "createDisposition", js.undefined)
        
        inline def setDestinationEncryptionConfiguration(value: EncryptionConfiguration): Self = StObject.set(x, "destinationEncryptionConfiguration", value.asInstanceOf[js.Any])
        
        inline def setDestinationEncryptionConfigurationUndefined: Self = StObject.set(x, "destinationEncryptionConfiguration", js.undefined)
        
        inline def setDestinationTable(value: TableReference): Self = StObject.set(x, "destinationTable", value.asInstanceOf[js.Any])
        
        inline def setDestinationTableProperties(value: DestinationTableProperties): Self = StObject.set(x, "destinationTableProperties", value.asInstanceOf[js.Any])
        
        inline def setDestinationTablePropertiesUndefined: Self = StObject.set(x, "destinationTableProperties", js.undefined)
        
        inline def setDestinationTableUndefined: Self = StObject.set(x, "destinationTable", js.undefined)
        
        inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
        
        inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
        
        inline def setFieldDelimiter(value: String): Self = StObject.set(x, "fieldDelimiter", value.asInstanceOf[js.Any])
        
        inline def setFieldDelimiterUndefined: Self = StObject.set(x, "fieldDelimiter", js.undefined)
        
        inline def setHivePartitioningMode(value: String): Self = StObject.set(x, "hivePartitioningMode", value.asInstanceOf[js.Any])
        
        inline def setHivePartitioningModeUndefined: Self = StObject.set(x, "hivePartitioningMode", js.undefined)
        
        inline def setIgnoreUnknownValues(value: Boolean): Self = StObject.set(x, "ignoreUnknownValues", value.asInstanceOf[js.Any])
        
        inline def setIgnoreUnknownValuesUndefined: Self = StObject.set(x, "ignoreUnknownValues", js.undefined)
        
        inline def setMaxBadRecords(value: Double): Self = StObject.set(x, "maxBadRecords", value.asInstanceOf[js.Any])
        
        inline def setMaxBadRecordsUndefined: Self = StObject.set(x, "maxBadRecords", js.undefined)
        
        inline def setNullMarker(value: String): Self = StObject.set(x, "nullMarker", value.asInstanceOf[js.Any])
        
        inline def setNullMarkerUndefined: Self = StObject.set(x, "nullMarker", js.undefined)
        
        inline def setProjectionFields(value: js.Array[String]): Self = StObject.set(x, "projectionFields", value.asInstanceOf[js.Any])
        
        inline def setProjectionFieldsUndefined: Self = StObject.set(x, "projectionFields", js.undefined)
        
        inline def setProjectionFieldsVarargs(value: String*): Self = StObject.set(x, "projectionFields", js.Array(value*))
        
        inline def setQuote(value: String): Self = StObject.set(x, "quote", value.asInstanceOf[js.Any])
        
        inline def setQuoteUndefined: Self = StObject.set(x, "quote", js.undefined)
        
        inline def setRangePartitioning(value: RangePartitioning): Self = StObject.set(x, "rangePartitioning", value.asInstanceOf[js.Any])
        
        inline def setRangePartitioningUndefined: Self = StObject.set(x, "rangePartitioning", js.undefined)
        
        inline def setSchema(value: TableSchema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
        
        inline def setSchemaInline(value: String): Self = StObject.set(x, "schemaInline", value.asInstanceOf[js.Any])
        
        inline def setSchemaInlineFormat(value: String): Self = StObject.set(x, "schemaInlineFormat", value.asInstanceOf[js.Any])
        
        inline def setSchemaInlineFormatUndefined: Self = StObject.set(x, "schemaInlineFormat", js.undefined)
        
        inline def setSchemaInlineUndefined: Self = StObject.set(x, "schemaInline", js.undefined)
        
        inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
        
        inline def setSchemaUpdateOptions(value: js.Array[String]): Self = StObject.set(x, "schemaUpdateOptions", value.asInstanceOf[js.Any])
        
        inline def setSchemaUpdateOptionsUndefined: Self = StObject.set(x, "schemaUpdateOptions", js.undefined)
        
        inline def setSchemaUpdateOptionsVarargs(value: String*): Self = StObject.set(x, "schemaUpdateOptions", js.Array(value*))
        
        inline def setSkipLeadingRows(value: Double): Self = StObject.set(x, "skipLeadingRows", value.asInstanceOf[js.Any])
        
        inline def setSkipLeadingRowsUndefined: Self = StObject.set(x, "skipLeadingRows", js.undefined)
        
        inline def setSourceFormat(value: String): Self = StObject.set(x, "sourceFormat", value.asInstanceOf[js.Any])
        
        inline def setSourceFormatUndefined: Self = StObject.set(x, "sourceFormat", js.undefined)
        
        inline def setSourceUris(value: js.Array[String]): Self = StObject.set(x, "sourceUris", value.asInstanceOf[js.Any])
        
        inline def setSourceUrisUndefined: Self = StObject.set(x, "sourceUris", js.undefined)
        
        inline def setSourceUrisVarargs(value: String*): Self = StObject.set(x, "sourceUris", js.Array(value*))
        
        inline def setTimePartitioning(value: TimePartitioning): Self = StObject.set(x, "timePartitioning", value.asInstanceOf[js.Any])
        
        inline def setTimePartitioningUndefined: Self = StObject.set(x, "timePartitioning", js.undefined)
        
        inline def setUseAvroLogicalTypes(value: Boolean): Self = StObject.set(x, "useAvroLogicalTypes", value.asInstanceOf[js.Any])
        
        inline def setUseAvroLogicalTypesUndefined: Self = StObject.set(x, "useAvroLogicalTypes", js.undefined)
        
        inline def setWriteDisposition(value: String): Self = StObject.set(x, "writeDisposition", value.asInstanceOf[js.Any])
        
        inline def setWriteDispositionUndefined: Self = StObject.set(x, "writeDisposition", js.undefined)
      }
    }
    
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
        
        inline def setQueryParametersVarargs(value: QueryParameter*): Self = StObject.set(x, "queryParameters", js.Array(value*))
        
        inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
        
        inline def setRangePartitioning(value: RangePartitioning): Self = StObject.set(x, "rangePartitioning", value.asInstanceOf[js.Any])
        
        inline def setRangePartitioningUndefined: Self = StObject.set(x, "rangePartitioning", js.undefined)
        
        inline def setSchemaUpdateOptions(value: js.Array[String]): Self = StObject.set(x, "schemaUpdateOptions", value.asInstanceOf[js.Any])
        
        inline def setSchemaUpdateOptionsUndefined: Self = StObject.set(x, "schemaUpdateOptions", js.undefined)
        
        inline def setSchemaUpdateOptionsVarargs(value: String*): Self = StObject.set(x, "schemaUpdateOptions", js.Array(value*))
        
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
        
        inline def setUserDefinedFunctionResourcesVarargs(value: UserDefinedFunctionResource*): Self = StObject.set(x, "userDefinedFunctionResources", js.Array(value*))
        
        inline def setWriteDisposition(value: String): Self = StObject.set(x, "writeDisposition", value.asInstanceOf[js.Any])
        
        inline def setWriteDispositionUndefined: Self = StObject.set(x, "writeDisposition", js.undefined)
      }
    }
    
    trait JobConfigurationTableCopy extends StObject {
      
      var createDisposition: js.UndefOr[String] = js.undefined
      
      var destinationEncryptionConfiguration: js.UndefOr[EncryptionConfiguration] = js.undefined
      
      var destinationTable: js.UndefOr[TableReference] = js.undefined
      
      var sourceTable: js.UndefOr[TableReference] = js.undefined
      
      var sourceTables: js.UndefOr[js.Array[TableReference]] = js.undefined
      
      var writeDisposition: js.UndefOr[String] = js.undefined
    }
    object JobConfigurationTableCopy {
      
      inline def apply(): JobConfigurationTableCopy = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[JobConfigurationTableCopy]
      }
      
      extension [Self <: JobConfigurationTableCopy](x: Self) {
        
        inline def setCreateDisposition(value: String): Self = StObject.set(x, "createDisposition", value.asInstanceOf[js.Any])
        
        inline def setCreateDispositionUndefined: Self = StObject.set(x, "createDisposition", js.undefined)
        
        inline def setDestinationEncryptionConfiguration(value: EncryptionConfiguration): Self = StObject.set(x, "destinationEncryptionConfiguration", value.asInstanceOf[js.Any])
        
        inline def setDestinationEncryptionConfigurationUndefined: Self = StObject.set(x, "destinationEncryptionConfiguration", js.undefined)
        
        inline def setDestinationTable(value: TableReference): Self = StObject.set(x, "destinationTable", value.asInstanceOf[js.Any])
        
        inline def setDestinationTableUndefined: Self = StObject.set(x, "destinationTable", js.undefined)
        
        inline def setSourceTable(value: TableReference): Self = StObject.set(x, "sourceTable", value.asInstanceOf[js.Any])
        
        inline def setSourceTableUndefined: Self = StObject.set(x, "sourceTable", js.undefined)
        
        inline def setSourceTables(value: js.Array[TableReference]): Self = StObject.set(x, "sourceTables", value.asInstanceOf[js.Any])
        
        inline def setSourceTablesUndefined: Self = StObject.set(x, "sourceTables", js.undefined)
        
        inline def setSourceTablesVarargs(value: TableReference*): Self = StObject.set(x, "sourceTables", js.Array(value*))
        
        inline def setWriteDisposition(value: String): Self = StObject.set(x, "writeDisposition", value.asInstanceOf[js.Any])
        
        inline def setWriteDispositionUndefined: Self = StObject.set(x, "writeDisposition", js.undefined)
      }
    }
    
    trait JobList extends StObject {
      
      var etag: js.UndefOr[String] = js.undefined
      
      var jobs: js.UndefOr[js.Array[JobListJobs]] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var nextPageToken: js.UndefOr[String] = js.undefined
    }
    object JobList {
      
      inline def apply(): JobList = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[JobList]
      }
      
      extension [Self <: JobList](x: Self) {
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setJobs(value: js.Array[JobListJobs]): Self = StObject.set(x, "jobs", value.asInstanceOf[js.Any])
        
        inline def setJobsUndefined: Self = StObject.set(x, "jobs", js.undefined)
        
        inline def setJobsVarargs(value: JobListJobs*): Self = StObject.set(x, "jobs", js.Array(value*))
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
      }
    }
    
    trait JobListJobs extends StObject {
      
      var configuration: js.UndefOr[JobConfiguration] = js.undefined
      
      var errorResult: js.UndefOr[ErrorProto] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
      
      var jobReference: js.UndefOr[JobReference] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var state: js.UndefOr[String] = js.undefined
      
      var statistics: js.UndefOr[JobStatistics] = js.undefined
      
      var status: js.UndefOr[JobStatus] = js.undefined
      
      var user_email: js.UndefOr[String] = js.undefined
    }
    object JobListJobs {
      
      inline def apply(): JobListJobs = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[JobListJobs]
      }
      
      extension [Self <: JobListJobs](x: Self) {
        
        inline def setConfiguration(value: JobConfiguration): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
        
        inline def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
        
        inline def setErrorResult(value: ErrorProto): Self = StObject.set(x, "errorResult", value.asInstanceOf[js.Any])
        
        inline def setErrorResultUndefined: Self = StObject.set(x, "errorResult", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setJobReference(value: JobReference): Self = StObject.set(x, "jobReference", value.asInstanceOf[js.Any])
        
        inline def setJobReferenceUndefined: Self = StObject.set(x, "jobReference", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
        
        inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
        
        inline def setStatistics(value: JobStatistics): Self = StObject.set(x, "statistics", value.asInstanceOf[js.Any])
        
        inline def setStatisticsUndefined: Self = StObject.set(x, "statistics", js.undefined)
        
        inline def setStatus(value: JobStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
        
        inline def setUser_email(value: String): Self = StObject.set(x, "user_email", value.asInstanceOf[js.Any])
        
        inline def setUser_emailUndefined: Self = StObject.set(x, "user_email", js.undefined)
      }
    }
    
    trait JobReference extends StObject {
      
      var jobId: js.UndefOr[String] = js.undefined
      
      var location: js.UndefOr[String] = js.undefined
      
      var projectId: js.UndefOr[String] = js.undefined
    }
    object JobReference {
      
      inline def apply(): JobReference = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[JobReference]
      }
      
      extension [Self <: JobReference](x: Self) {
        
        inline def setJobId(value: String): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
        
        inline def setJobIdUndefined: Self = StObject.set(x, "jobId", js.undefined)
        
        inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
        
        inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
        
        inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
        
        inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
      }
    }
    
    trait JobStatistics extends StObject {
      
      var completionRatio: js.UndefOr[Double] = js.undefined
      
      var creationTime: js.UndefOr[String] = js.undefined
      
      var endTime: js.UndefOr[String] = js.undefined
      
      var extract: js.UndefOr[JobStatistics4] = js.undefined
      
      var load: js.UndefOr[JobStatistics3] = js.undefined
      
      var numChildJobs: js.UndefOr[String] = js.undefined
      
      var parentJobId: js.UndefOr[String] = js.undefined
      
      var query: js.UndefOr[JobStatistics2] = js.undefined
      
      var quotaDeferments: js.UndefOr[js.Array[String]] = js.undefined
      
      var reservationUsage: js.UndefOr[js.Array[JobStatisticsReservationUsage]] = js.undefined
      
      var startTime: js.UndefOr[String] = js.undefined
      
      var totalBytesProcessed: js.UndefOr[String] = js.undefined
      
      var totalSlotMs: js.UndefOr[String] = js.undefined
    }
    object JobStatistics {
      
      inline def apply(): JobStatistics = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[JobStatistics]
      }
      
      extension [Self <: JobStatistics](x: Self) {
        
        inline def setCompletionRatio(value: Double): Self = StObject.set(x, "completionRatio", value.asInstanceOf[js.Any])
        
        inline def setCompletionRatioUndefined: Self = StObject.set(x, "completionRatio", js.undefined)
        
        inline def setCreationTime(value: String): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
        
        inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
        
        inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
        
        inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
        
        inline def setExtract(value: JobStatistics4): Self = StObject.set(x, "extract", value.asInstanceOf[js.Any])
        
        inline def setExtractUndefined: Self = StObject.set(x, "extract", js.undefined)
        
        inline def setLoad(value: JobStatistics3): Self = StObject.set(x, "load", value.asInstanceOf[js.Any])
        
        inline def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
        
        inline def setNumChildJobs(value: String): Self = StObject.set(x, "numChildJobs", value.asInstanceOf[js.Any])
        
        inline def setNumChildJobsUndefined: Self = StObject.set(x, "numChildJobs", js.undefined)
        
        inline def setParentJobId(value: String): Self = StObject.set(x, "parentJobId", value.asInstanceOf[js.Any])
        
        inline def setParentJobIdUndefined: Self = StObject.set(x, "parentJobId", js.undefined)
        
        inline def setQuery(value: JobStatistics2): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
        
        inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
        
        inline def setQuotaDeferments(value: js.Array[String]): Self = StObject.set(x, "quotaDeferments", value.asInstanceOf[js.Any])
        
        inline def setQuotaDefermentsUndefined: Self = StObject.set(x, "quotaDeferments", js.undefined)
        
        inline def setQuotaDefermentsVarargs(value: String*): Self = StObject.set(x, "quotaDeferments", js.Array(value*))
        
        inline def setReservationUsage(value: js.Array[JobStatisticsReservationUsage]): Self = StObject.set(x, "reservationUsage", value.asInstanceOf[js.Any])
        
        inline def setReservationUsageUndefined: Self = StObject.set(x, "reservationUsage", js.undefined)
        
        inline def setReservationUsageVarargs(value: JobStatisticsReservationUsage*): Self = StObject.set(x, "reservationUsage", js.Array(value*))
        
        inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
        
        inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
        
        inline def setTotalBytesProcessed(value: String): Self = StObject.set(x, "totalBytesProcessed", value.asInstanceOf[js.Any])
        
        inline def setTotalBytesProcessedUndefined: Self = StObject.set(x, "totalBytesProcessed", js.undefined)
        
        inline def setTotalSlotMs(value: String): Self = StObject.set(x, "totalSlotMs", value.asInstanceOf[js.Any])
        
        inline def setTotalSlotMsUndefined: Self = StObject.set(x, "totalSlotMs", js.undefined)
      }
    }
    
    trait JobStatistics2 extends StObject {
      
      var billingTier: js.UndefOr[Double] = js.undefined
      
      var cacheHit: js.UndefOr[Boolean] = js.undefined
      
      var ddlOperationPerformed: js.UndefOr[String] = js.undefined
      
      var ddlTargetRoutine: js.UndefOr[RoutineReference] = js.undefined
      
      var ddlTargetTable: js.UndefOr[TableReference] = js.undefined
      
      var estimatedBytesProcessed: js.UndefOr[String] = js.undefined
      
      var modelTraining: js.UndefOr[BigQueryModelTraining] = js.undefined
      
      var modelTrainingCurrentIteration: js.UndefOr[Double] = js.undefined
      
      var modelTrainingExpectedTotalIteration: js.UndefOr[String] = js.undefined
      
      var numDmlAffectedRows: js.UndefOr[String] = js.undefined
      
      var queryPlan: js.UndefOr[js.Array[ExplainQueryStage]] = js.undefined
      
      var referencedTables: js.UndefOr[js.Array[TableReference]] = js.undefined
      
      var reservationUsage: js.UndefOr[js.Array[JobStatistics2ReservationUsage]] = js.undefined
      
      var schema: js.UndefOr[TableSchema] = js.undefined
      
      var statementType: js.UndefOr[String] = js.undefined
      
      var timeline: js.UndefOr[js.Array[QueryTimelineSample]] = js.undefined
      
      var totalBytesBilled: js.UndefOr[String] = js.undefined
      
      var totalBytesProcessed: js.UndefOr[String] = js.undefined
      
      var totalBytesProcessedAccuracy: js.UndefOr[String] = js.undefined
      
      var totalPartitionsProcessed: js.UndefOr[String] = js.undefined
      
      var totalSlotMs: js.UndefOr[String] = js.undefined
      
      var undeclaredQueryParameters: js.UndefOr[js.Array[QueryParameter]] = js.undefined
    }
    object JobStatistics2 {
      
      inline def apply(): JobStatistics2 = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[JobStatistics2]
      }
      
      extension [Self <: JobStatistics2](x: Self) {
        
        inline def setBillingTier(value: Double): Self = StObject.set(x, "billingTier", value.asInstanceOf[js.Any])
        
        inline def setBillingTierUndefined: Self = StObject.set(x, "billingTier", js.undefined)
        
        inline def setCacheHit(value: Boolean): Self = StObject.set(x, "cacheHit", value.asInstanceOf[js.Any])
        
        inline def setCacheHitUndefined: Self = StObject.set(x, "cacheHit", js.undefined)
        
        inline def setDdlOperationPerformed(value: String): Self = StObject.set(x, "ddlOperationPerformed", value.asInstanceOf[js.Any])
        
        inline def setDdlOperationPerformedUndefined: Self = StObject.set(x, "ddlOperationPerformed", js.undefined)
        
        inline def setDdlTargetRoutine(value: RoutineReference): Self = StObject.set(x, "ddlTargetRoutine", value.asInstanceOf[js.Any])
        
        inline def setDdlTargetRoutineUndefined: Self = StObject.set(x, "ddlTargetRoutine", js.undefined)
        
        inline def setDdlTargetTable(value: TableReference): Self = StObject.set(x, "ddlTargetTable", value.asInstanceOf[js.Any])
        
        inline def setDdlTargetTableUndefined: Self = StObject.set(x, "ddlTargetTable", js.undefined)
        
        inline def setEstimatedBytesProcessed(value: String): Self = StObject.set(x, "estimatedBytesProcessed", value.asInstanceOf[js.Any])
        
        inline def setEstimatedBytesProcessedUndefined: Self = StObject.set(x, "estimatedBytesProcessed", js.undefined)
        
        inline def setModelTraining(value: BigQueryModelTraining): Self = StObject.set(x, "modelTraining", value.asInstanceOf[js.Any])
        
        inline def setModelTrainingCurrentIteration(value: Double): Self = StObject.set(x, "modelTrainingCurrentIteration", value.asInstanceOf[js.Any])
        
        inline def setModelTrainingCurrentIterationUndefined: Self = StObject.set(x, "modelTrainingCurrentIteration", js.undefined)
        
        inline def setModelTrainingExpectedTotalIteration(value: String): Self = StObject.set(x, "modelTrainingExpectedTotalIteration", value.asInstanceOf[js.Any])
        
        inline def setModelTrainingExpectedTotalIterationUndefined: Self = StObject.set(x, "modelTrainingExpectedTotalIteration", js.undefined)
        
        inline def setModelTrainingUndefined: Self = StObject.set(x, "modelTraining", js.undefined)
        
        inline def setNumDmlAffectedRows(value: String): Self = StObject.set(x, "numDmlAffectedRows", value.asInstanceOf[js.Any])
        
        inline def setNumDmlAffectedRowsUndefined: Self = StObject.set(x, "numDmlAffectedRows", js.undefined)
        
        inline def setQueryPlan(value: js.Array[ExplainQueryStage]): Self = StObject.set(x, "queryPlan", value.asInstanceOf[js.Any])
        
        inline def setQueryPlanUndefined: Self = StObject.set(x, "queryPlan", js.undefined)
        
        inline def setQueryPlanVarargs(value: ExplainQueryStage*): Self = StObject.set(x, "queryPlan", js.Array(value*))
        
        inline def setReferencedTables(value: js.Array[TableReference]): Self = StObject.set(x, "referencedTables", value.asInstanceOf[js.Any])
        
        inline def setReferencedTablesUndefined: Self = StObject.set(x, "referencedTables", js.undefined)
        
        inline def setReferencedTablesVarargs(value: TableReference*): Self = StObject.set(x, "referencedTables", js.Array(value*))
        
        inline def setReservationUsage(value: js.Array[JobStatistics2ReservationUsage]): Self = StObject.set(x, "reservationUsage", value.asInstanceOf[js.Any])
        
        inline def setReservationUsageUndefined: Self = StObject.set(x, "reservationUsage", js.undefined)
        
        inline def setReservationUsageVarargs(value: JobStatistics2ReservationUsage*): Self = StObject.set(x, "reservationUsage", js.Array(value*))
        
        inline def setSchema(value: TableSchema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
        
        inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
        
        inline def setStatementType(value: String): Self = StObject.set(x, "statementType", value.asInstanceOf[js.Any])
        
        inline def setStatementTypeUndefined: Self = StObject.set(x, "statementType", js.undefined)
        
        inline def setTimeline(value: js.Array[QueryTimelineSample]): Self = StObject.set(x, "timeline", value.asInstanceOf[js.Any])
        
        inline def setTimelineUndefined: Self = StObject.set(x, "timeline", js.undefined)
        
        inline def setTimelineVarargs(value: QueryTimelineSample*): Self = StObject.set(x, "timeline", js.Array(value*))
        
        inline def setTotalBytesBilled(value: String): Self = StObject.set(x, "totalBytesBilled", value.asInstanceOf[js.Any])
        
        inline def setTotalBytesBilledUndefined: Self = StObject.set(x, "totalBytesBilled", js.undefined)
        
        inline def setTotalBytesProcessed(value: String): Self = StObject.set(x, "totalBytesProcessed", value.asInstanceOf[js.Any])
        
        inline def setTotalBytesProcessedAccuracy(value: String): Self = StObject.set(x, "totalBytesProcessedAccuracy", value.asInstanceOf[js.Any])
        
        inline def setTotalBytesProcessedAccuracyUndefined: Self = StObject.set(x, "totalBytesProcessedAccuracy", js.undefined)
        
        inline def setTotalBytesProcessedUndefined: Self = StObject.set(x, "totalBytesProcessed", js.undefined)
        
        inline def setTotalPartitionsProcessed(value: String): Self = StObject.set(x, "totalPartitionsProcessed", value.asInstanceOf[js.Any])
        
        inline def setTotalPartitionsProcessedUndefined: Self = StObject.set(x, "totalPartitionsProcessed", js.undefined)
        
        inline def setTotalSlotMs(value: String): Self = StObject.set(x, "totalSlotMs", value.asInstanceOf[js.Any])
        
        inline def setTotalSlotMsUndefined: Self = StObject.set(x, "totalSlotMs", js.undefined)
        
        inline def setUndeclaredQueryParameters(value: js.Array[QueryParameter]): Self = StObject.set(x, "undeclaredQueryParameters", value.asInstanceOf[js.Any])
        
        inline def setUndeclaredQueryParametersUndefined: Self = StObject.set(x, "undeclaredQueryParameters", js.undefined)
        
        inline def setUndeclaredQueryParametersVarargs(value: QueryParameter*): Self = StObject.set(x, "undeclaredQueryParameters", js.Array(value*))
      }
    }
    
    trait JobStatistics2ReservationUsage extends StObject {
      
      var name: js.UndefOr[String] = js.undefined
      
      var slotMs: js.UndefOr[String] = js.undefined
    }
    object JobStatistics2ReservationUsage {
      
      inline def apply(): JobStatistics2ReservationUsage = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[JobStatistics2ReservationUsage]
      }
      
      extension [Self <: JobStatistics2ReservationUsage](x: Self) {
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setSlotMs(value: String): Self = StObject.set(x, "slotMs", value.asInstanceOf[js.Any])
        
        inline def setSlotMsUndefined: Self = StObject.set(x, "slotMs", js.undefined)
      }
    }
    
    trait JobStatistics3 extends StObject {
      
      var badRecords: js.UndefOr[String] = js.undefined
      
      var inputFileBytes: js.UndefOr[String] = js.undefined
      
      var inputFiles: js.UndefOr[String] = js.undefined
      
      var outputBytes: js.UndefOr[String] = js.undefined
      
      var outputRows: js.UndefOr[String] = js.undefined
    }
    object JobStatistics3 {
      
      inline def apply(): JobStatistics3 = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[JobStatistics3]
      }
      
      extension [Self <: JobStatistics3](x: Self) {
        
        inline def setBadRecords(value: String): Self = StObject.set(x, "badRecords", value.asInstanceOf[js.Any])
        
        inline def setBadRecordsUndefined: Self = StObject.set(x, "badRecords", js.undefined)
        
        inline def setInputFileBytes(value: String): Self = StObject.set(x, "inputFileBytes", value.asInstanceOf[js.Any])
        
        inline def setInputFileBytesUndefined: Self = StObject.set(x, "inputFileBytes", js.undefined)
        
        inline def setInputFiles(value: String): Self = StObject.set(x, "inputFiles", value.asInstanceOf[js.Any])
        
        inline def setInputFilesUndefined: Self = StObject.set(x, "inputFiles", js.undefined)
        
        inline def setOutputBytes(value: String): Self = StObject.set(x, "outputBytes", value.asInstanceOf[js.Any])
        
        inline def setOutputBytesUndefined: Self = StObject.set(x, "outputBytes", js.undefined)
        
        inline def setOutputRows(value: String): Self = StObject.set(x, "outputRows", value.asInstanceOf[js.Any])
        
        inline def setOutputRowsUndefined: Self = StObject.set(x, "outputRows", js.undefined)
      }
    }
    
    trait JobStatistics4 extends StObject {
      
      var destinationUriFileCounts: js.UndefOr[js.Array[String]] = js.undefined
      
      var inputBytes: js.UndefOr[String] = js.undefined
    }
    object JobStatistics4 {
      
      inline def apply(): JobStatistics4 = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[JobStatistics4]
      }
      
      extension [Self <: JobStatistics4](x: Self) {
        
        inline def setDestinationUriFileCounts(value: js.Array[String]): Self = StObject.set(x, "destinationUriFileCounts", value.asInstanceOf[js.Any])
        
        inline def setDestinationUriFileCountsUndefined: Self = StObject.set(x, "destinationUriFileCounts", js.undefined)
        
        inline def setDestinationUriFileCountsVarargs(value: String*): Self = StObject.set(x, "destinationUriFileCounts", js.Array(value*))
        
        inline def setInputBytes(value: String): Self = StObject.set(x, "inputBytes", value.asInstanceOf[js.Any])
        
        inline def setInputBytesUndefined: Self = StObject.set(x, "inputBytes", js.undefined)
      }
    }
    
    trait JobStatisticsReservationUsage extends StObject {
      
      var name: js.UndefOr[String] = js.undefined
      
      var slotMs: js.UndefOr[String] = js.undefined
    }
    object JobStatisticsReservationUsage {
      
      inline def apply(): JobStatisticsReservationUsage = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[JobStatisticsReservationUsage]
      }
      
      extension [Self <: JobStatisticsReservationUsage](x: Self) {
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setSlotMs(value: String): Self = StObject.set(x, "slotMs", value.asInstanceOf[js.Any])
        
        inline def setSlotMsUndefined: Self = StObject.set(x, "slotMs", js.undefined)
      }
    }
    
    trait JobStatus extends StObject {
      
      var errorResult: js.UndefOr[ErrorProto] = js.undefined
      
      var errors: js.UndefOr[js.Array[ErrorProto]] = js.undefined
      
      var state: js.UndefOr[String] = js.undefined
    }
    object JobStatus {
      
      inline def apply(): JobStatus = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[JobStatus]
      }
      
      extension [Self <: JobStatus](x: Self) {
        
        inline def setErrorResult(value: ErrorProto): Self = StObject.set(x, "errorResult", value.asInstanceOf[js.Any])
        
        inline def setErrorResultUndefined: Self = StObject.set(x, "errorResult", js.undefined)
        
        inline def setErrors(value: js.Array[ErrorProto]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
        
        inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
        
        inline def setErrorsVarargs(value: ErrorProto*): Self = StObject.set(x, "errors", js.Array(value*))
        
        inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
        
        inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      }
    }
    
    trait MaterializedViewDefinition extends StObject {
      
      var lastRefreshTime: js.UndefOr[String] = js.undefined
      
      var query: js.UndefOr[String] = js.undefined
    }
    object MaterializedViewDefinition {
      
      inline def apply(): MaterializedViewDefinition = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[MaterializedViewDefinition]
      }
      
      extension [Self <: MaterializedViewDefinition](x: Self) {
        
        inline def setLastRefreshTime(value: String): Self = StObject.set(x, "lastRefreshTime", value.asInstanceOf[js.Any])
        
        inline def setLastRefreshTimeUndefined: Self = StObject.set(x, "lastRefreshTime", js.undefined)
        
        inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
        
        inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      }
    }
    
    trait ModelDefinition extends StObject {
      
      var modelOptions: js.UndefOr[ModelDefinitionModelOptions] = js.undefined
      
      var trainingRuns: js.UndefOr[js.Array[BqmlTrainingRun]] = js.undefined
    }
    object ModelDefinition {
      
      inline def apply(): ModelDefinition = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ModelDefinition]
      }
      
      extension [Self <: ModelDefinition](x: Self) {
        
        inline def setModelOptions(value: ModelDefinitionModelOptions): Self = StObject.set(x, "modelOptions", value.asInstanceOf[js.Any])
        
        inline def setModelOptionsUndefined: Self = StObject.set(x, "modelOptions", js.undefined)
        
        inline def setTrainingRuns(value: js.Array[BqmlTrainingRun]): Self = StObject.set(x, "trainingRuns", value.asInstanceOf[js.Any])
        
        inline def setTrainingRunsUndefined: Self = StObject.set(x, "trainingRuns", js.undefined)
        
        inline def setTrainingRunsVarargs(value: BqmlTrainingRun*): Self = StObject.set(x, "trainingRuns", js.Array(value*))
      }
    }
    
    trait ModelDefinitionModelOptions extends StObject {
      
      var labels: js.UndefOr[js.Array[String]] = js.undefined
      
      var lossType: js.UndefOr[String] = js.undefined
      
      var modelType: js.UndefOr[String] = js.undefined
    }
    object ModelDefinitionModelOptions {
      
      inline def apply(): ModelDefinitionModelOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ModelDefinitionModelOptions]
      }
      
      extension [Self <: ModelDefinitionModelOptions](x: Self) {
        
        inline def setLabels(value: js.Array[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
        
        inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
        
        inline def setLabelsVarargs(value: String*): Self = StObject.set(x, "labels", js.Array(value*))
        
        inline def setLossType(value: String): Self = StObject.set(x, "lossType", value.asInstanceOf[js.Any])
        
        inline def setLossTypeUndefined: Self = StObject.set(x, "lossType", js.undefined)
        
        inline def setModelType(value: String): Self = StObject.set(x, "modelType", value.asInstanceOf[js.Any])
        
        inline def setModelTypeUndefined: Self = StObject.set(x, "modelType", js.undefined)
      }
    }
    
    trait ProjectList extends StObject {
      
      var etag: js.UndefOr[String] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var nextPageToken: js.UndefOr[String] = js.undefined
      
      var projects: js.UndefOr[js.Array[ProjectListProjects]] = js.undefined
      
      var totalItems: js.UndefOr[Double] = js.undefined
    }
    object ProjectList {
      
      inline def apply(): ProjectList = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ProjectList]
      }
      
      extension [Self <: ProjectList](x: Self) {
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        
        inline def setProjects(value: js.Array[ProjectListProjects]): Self = StObject.set(x, "projects", value.asInstanceOf[js.Any])
        
        inline def setProjectsUndefined: Self = StObject.set(x, "projects", js.undefined)
        
        inline def setProjectsVarargs(value: ProjectListProjects*): Self = StObject.set(x, "projects", js.Array(value*))
        
        inline def setTotalItems(value: Double): Self = StObject.set(x, "totalItems", value.asInstanceOf[js.Any])
        
        inline def setTotalItemsUndefined: Self = StObject.set(x, "totalItems", js.undefined)
      }
    }
    
    trait ProjectListProjects extends StObject {
      
      var friendlyName: js.UndefOr[String] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var numericId: js.UndefOr[String] = js.undefined
      
      var projectReference: js.UndefOr[ProjectReference] = js.undefined
    }
    object ProjectListProjects {
      
      inline def apply(): ProjectListProjects = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ProjectListProjects]
      }
      
      extension [Self <: ProjectListProjects](x: Self) {
        
        inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
        
        inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setNumericId(value: String): Self = StObject.set(x, "numericId", value.asInstanceOf[js.Any])
        
        inline def setNumericIdUndefined: Self = StObject.set(x, "numericId", js.undefined)
        
        inline def setProjectReference(value: ProjectReference): Self = StObject.set(x, "projectReference", value.asInstanceOf[js.Any])
        
        inline def setProjectReferenceUndefined: Self = StObject.set(x, "projectReference", js.undefined)
      }
    }
    
    trait ProjectReference extends StObject {
      
      var projectId: js.UndefOr[String] = js.undefined
    }
    object ProjectReference {
      
      inline def apply(): ProjectReference = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ProjectReference]
      }
      
      extension [Self <: ProjectReference](x: Self) {
        
        inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
        
        inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
      }
    }
    
    trait QueryParameter extends StObject {
      
      var name: js.UndefOr[String] = js.undefined
      
      var parameterType: js.UndefOr[QueryParameterType] = js.undefined
      
      var parameterValue: js.UndefOr[QueryParameterValue] = js.undefined
    }
    object QueryParameter {
      
      inline def apply(): QueryParameter = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[QueryParameter]
      }
      
      extension [Self <: QueryParameter](x: Self) {
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setParameterType(value: QueryParameterType): Self = StObject.set(x, "parameterType", value.asInstanceOf[js.Any])
        
        inline def setParameterTypeUndefined: Self = StObject.set(x, "parameterType", js.undefined)
        
        inline def setParameterValue(value: QueryParameterValue): Self = StObject.set(x, "parameterValue", value.asInstanceOf[js.Any])
        
        inline def setParameterValueUndefined: Self = StObject.set(x, "parameterValue", js.undefined)
      }
    }
    
    trait QueryParameterType extends StObject {
      
      var arrayType: js.UndefOr[QueryParameterType] = js.undefined
      
      var structTypes: js.UndefOr[js.Array[QueryParameterTypeStructTypes]] = js.undefined
      
      var `type`: js.UndefOr[String] = js.undefined
    }
    object QueryParameterType {
      
      inline def apply(): QueryParameterType = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[QueryParameterType]
      }
      
      extension [Self <: QueryParameterType](x: Self) {
        
        inline def setArrayType(value: QueryParameterType): Self = StObject.set(x, "arrayType", value.asInstanceOf[js.Any])
        
        inline def setArrayTypeUndefined: Self = StObject.set(x, "arrayType", js.undefined)
        
        inline def setStructTypes(value: js.Array[QueryParameterTypeStructTypes]): Self = StObject.set(x, "structTypes", value.asInstanceOf[js.Any])
        
        inline def setStructTypesUndefined: Self = StObject.set(x, "structTypes", js.undefined)
        
        inline def setStructTypesVarargs(value: QueryParameterTypeStructTypes*): Self = StObject.set(x, "structTypes", js.Array(value*))
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    trait QueryParameterTypeStructTypes extends StObject {
      
      var description: js.UndefOr[String] = js.undefined
      
      var name: js.UndefOr[String] = js.undefined
      
      var `type`: js.UndefOr[QueryParameterType] = js.undefined
    }
    object QueryParameterTypeStructTypes {
      
      inline def apply(): QueryParameterTypeStructTypes = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[QueryParameterTypeStructTypes]
      }
      
      extension [Self <: QueryParameterTypeStructTypes](x: Self) {
        
        inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setType(value: QueryParameterType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    trait QueryParameterValue extends StObject {
      
      var arrayValues: js.UndefOr[js.Array[QueryParameterValue]] = js.undefined
      
      var structValues: js.UndefOr[js.Object] = js.undefined
      
      var value: js.UndefOr[String] = js.undefined
    }
    object QueryParameterValue {
      
      inline def apply(): QueryParameterValue = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[QueryParameterValue]
      }
      
      extension [Self <: QueryParameterValue](x: Self) {
        
        inline def setArrayValues(value: js.Array[QueryParameterValue]): Self = StObject.set(x, "arrayValues", value.asInstanceOf[js.Any])
        
        inline def setArrayValuesUndefined: Self = StObject.set(x, "arrayValues", js.undefined)
        
        inline def setArrayValuesVarargs(value: QueryParameterValue*): Self = StObject.set(x, "arrayValues", js.Array(value*))
        
        inline def setStructValues(value: js.Object): Self = StObject.set(x, "structValues", value.asInstanceOf[js.Any])
        
        inline def setStructValuesUndefined: Self = StObject.set(x, "structValues", js.undefined)
        
        inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
    
    trait QueryRequest extends StObject {
      
      var defaultDataset: js.UndefOr[DatasetReference] = js.undefined
      
      var dryRun: js.UndefOr[Boolean] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var location: js.UndefOr[String] = js.undefined
      
      var maxResults: js.UndefOr[Double] = js.undefined
      
      var parameterMode: js.UndefOr[String] = js.undefined
      
      var preserveNulls: js.UndefOr[Boolean] = js.undefined
      
      var query: js.UndefOr[String] = js.undefined
      
      var queryParameters: js.UndefOr[js.Array[QueryParameter]] = js.undefined
      
      var timeoutMs: js.UndefOr[Double] = js.undefined
      
      var useLegacySql: js.UndefOr[Boolean] = js.undefined
      
      var useQueryCache: js.UndefOr[Boolean] = js.undefined
    }
    object QueryRequest {
      
      inline def apply(): QueryRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[QueryRequest]
      }
      
      extension [Self <: QueryRequest](x: Self) {
        
        inline def setDefaultDataset(value: DatasetReference): Self = StObject.set(x, "defaultDataset", value.asInstanceOf[js.Any])
        
        inline def setDefaultDatasetUndefined: Self = StObject.set(x, "defaultDataset", js.undefined)
        
        inline def setDryRun(value: Boolean): Self = StObject.set(x, "dryRun", value.asInstanceOf[js.Any])
        
        inline def setDryRunUndefined: Self = StObject.set(x, "dryRun", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
        
        inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
        
        inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
        
        inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
        
        inline def setParameterMode(value: String): Self = StObject.set(x, "parameterMode", value.asInstanceOf[js.Any])
        
        inline def setParameterModeUndefined: Self = StObject.set(x, "parameterMode", js.undefined)
        
        inline def setPreserveNulls(value: Boolean): Self = StObject.set(x, "preserveNulls", value.asInstanceOf[js.Any])
        
        inline def setPreserveNullsUndefined: Self = StObject.set(x, "preserveNulls", js.undefined)
        
        inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
        
        inline def setQueryParameters(value: js.Array[QueryParameter]): Self = StObject.set(x, "queryParameters", value.asInstanceOf[js.Any])
        
        inline def setQueryParametersUndefined: Self = StObject.set(x, "queryParameters", js.undefined)
        
        inline def setQueryParametersVarargs(value: QueryParameter*): Self = StObject.set(x, "queryParameters", js.Array(value*))
        
        inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
        
        inline def setTimeoutMs(value: Double): Self = StObject.set(x, "timeoutMs", value.asInstanceOf[js.Any])
        
        inline def setTimeoutMsUndefined: Self = StObject.set(x, "timeoutMs", js.undefined)
        
        inline def setUseLegacySql(value: Boolean): Self = StObject.set(x, "useLegacySql", value.asInstanceOf[js.Any])
        
        inline def setUseLegacySqlUndefined: Self = StObject.set(x, "useLegacySql", js.undefined)
        
        inline def setUseQueryCache(value: Boolean): Self = StObject.set(x, "useQueryCache", value.asInstanceOf[js.Any])
        
        inline def setUseQueryCacheUndefined: Self = StObject.set(x, "useQueryCache", js.undefined)
      }
    }
    
    trait QueryResponse extends StObject {
      
      var cacheHit: js.UndefOr[Boolean] = js.undefined
      
      var errors: js.UndefOr[js.Array[ErrorProto]] = js.undefined
      
      var jobComplete: js.UndefOr[Boolean] = js.undefined
      
      var jobReference: js.UndefOr[JobReference] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var numDmlAffectedRows: js.UndefOr[String] = js.undefined
      
      var pageToken: js.UndefOr[String] = js.undefined
      
      var rows: js.UndefOr[js.Array[TableRow]] = js.undefined
      
      var schema: js.UndefOr[TableSchema] = js.undefined
      
      var totalBytesProcessed: js.UndefOr[String] = js.undefined
      
      var totalRows: js.UndefOr[String] = js.undefined
    }
    object QueryResponse {
      
      inline def apply(): QueryResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[QueryResponse]
      }
      
      extension [Self <: QueryResponse](x: Self) {
        
        inline def setCacheHit(value: Boolean): Self = StObject.set(x, "cacheHit", value.asInstanceOf[js.Any])
        
        inline def setCacheHitUndefined: Self = StObject.set(x, "cacheHit", js.undefined)
        
        inline def setErrors(value: js.Array[ErrorProto]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
        
        inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
        
        inline def setErrorsVarargs(value: ErrorProto*): Self = StObject.set(x, "errors", js.Array(value*))
        
        inline def setJobComplete(value: Boolean): Self = StObject.set(x, "jobComplete", value.asInstanceOf[js.Any])
        
        inline def setJobCompleteUndefined: Self = StObject.set(x, "jobComplete", js.undefined)
        
        inline def setJobReference(value: JobReference): Self = StObject.set(x, "jobReference", value.asInstanceOf[js.Any])
        
        inline def setJobReferenceUndefined: Self = StObject.set(x, "jobReference", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setNumDmlAffectedRows(value: String): Self = StObject.set(x, "numDmlAffectedRows", value.asInstanceOf[js.Any])
        
        inline def setNumDmlAffectedRowsUndefined: Self = StObject.set(x, "numDmlAffectedRows", js.undefined)
        
        inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
        
        inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
        
        inline def setRows(value: js.Array[TableRow]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
        
        inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
        
        inline def setRowsVarargs(value: TableRow*): Self = StObject.set(x, "rows", js.Array(value*))
        
        inline def setSchema(value: TableSchema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
        
        inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
        
        inline def setTotalBytesProcessed(value: String): Self = StObject.set(x, "totalBytesProcessed", value.asInstanceOf[js.Any])
        
        inline def setTotalBytesProcessedUndefined: Self = StObject.set(x, "totalBytesProcessed", js.undefined)
        
        inline def setTotalRows(value: String): Self = StObject.set(x, "totalRows", value.asInstanceOf[js.Any])
        
        inline def setTotalRowsUndefined: Self = StObject.set(x, "totalRows", js.undefined)
      }
    }
    
    trait QueryTimelineSample extends StObject {
      
      var activeUnits: js.UndefOr[String] = js.undefined
      
      var completedUnits: js.UndefOr[String] = js.undefined
      
      var elapsedMs: js.UndefOr[String] = js.undefined
      
      var pendingUnits: js.UndefOr[String] = js.undefined
      
      var totalSlotMs: js.UndefOr[String] = js.undefined
    }
    object QueryTimelineSample {
      
      inline def apply(): QueryTimelineSample = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[QueryTimelineSample]
      }
      
      extension [Self <: QueryTimelineSample](x: Self) {
        
        inline def setActiveUnits(value: String): Self = StObject.set(x, "activeUnits", value.asInstanceOf[js.Any])
        
        inline def setActiveUnitsUndefined: Self = StObject.set(x, "activeUnits", js.undefined)
        
        inline def setCompletedUnits(value: String): Self = StObject.set(x, "completedUnits", value.asInstanceOf[js.Any])
        
        inline def setCompletedUnitsUndefined: Self = StObject.set(x, "completedUnits", js.undefined)
        
        inline def setElapsedMs(value: String): Self = StObject.set(x, "elapsedMs", value.asInstanceOf[js.Any])
        
        inline def setElapsedMsUndefined: Self = StObject.set(x, "elapsedMs", js.undefined)
        
        inline def setPendingUnits(value: String): Self = StObject.set(x, "pendingUnits", value.asInstanceOf[js.Any])
        
        inline def setPendingUnitsUndefined: Self = StObject.set(x, "pendingUnits", js.undefined)
        
        inline def setTotalSlotMs(value: String): Self = StObject.set(x, "totalSlotMs", value.asInstanceOf[js.Any])
        
        inline def setTotalSlotMsUndefined: Self = StObject.set(x, "totalSlotMs", js.undefined)
      }
    }
    
    trait RangePartitioning extends StObject {
      
      var field: js.UndefOr[String] = js.undefined
      
      var range: js.UndefOr[RangePartitioningRange] = js.undefined
    }
    object RangePartitioning {
      
      inline def apply(): RangePartitioning = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[RangePartitioning]
      }
      
      extension [Self <: RangePartitioning](x: Self) {
        
        inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
        
        inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
        
        inline def setRange(value: RangePartitioningRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
        
        inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      }
    }
    
    trait RangePartitioningRange extends StObject {
      
      var end: js.UndefOr[String] = js.undefined
      
      var interval: js.UndefOr[String] = js.undefined
      
      var start: js.UndefOr[String] = js.undefined
    }
    object RangePartitioningRange {
      
      inline def apply(): RangePartitioningRange = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[RangePartitioningRange]
      }
      
      extension [Self <: RangePartitioningRange](x: Self) {
        
        inline def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
        
        inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
        
        inline def setInterval(value: String): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
        
        inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
        
        inline def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
        
        inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      }
    }
    
    trait RoutineReference extends StObject {
      
      var datasetId: js.UndefOr[String] = js.undefined
      
      var projectId: js.UndefOr[String] = js.undefined
      
      var routineId: js.UndefOr[String] = js.undefined
    }
    object RoutineReference {
      
      inline def apply(): RoutineReference = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[RoutineReference]
      }
      
      extension [Self <: RoutineReference](x: Self) {
        
        inline def setDatasetId(value: String): Self = StObject.set(x, "datasetId", value.asInstanceOf[js.Any])
        
        inline def setDatasetIdUndefined: Self = StObject.set(x, "datasetId", js.undefined)
        
        inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
        
        inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
        
        inline def setRoutineId(value: String): Self = StObject.set(x, "routineId", value.asInstanceOf[js.Any])
        
        inline def setRoutineIdUndefined: Self = StObject.set(x, "routineId", js.undefined)
      }
    }
    
    trait Streamingbuffer extends StObject {
      
      var estimatedBytes: js.UndefOr[String] = js.undefined
      
      var estimatedRows: js.UndefOr[String] = js.undefined
      
      var oldestEntryTime: js.UndefOr[String] = js.undefined
    }
    object Streamingbuffer {
      
      inline def apply(): Streamingbuffer = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Streamingbuffer]
      }
      
      extension [Self <: Streamingbuffer](x: Self) {
        
        inline def setEstimatedBytes(value: String): Self = StObject.set(x, "estimatedBytes", value.asInstanceOf[js.Any])
        
        inline def setEstimatedBytesUndefined: Self = StObject.set(x, "estimatedBytes", js.undefined)
        
        inline def setEstimatedRows(value: String): Self = StObject.set(x, "estimatedRows", value.asInstanceOf[js.Any])
        
        inline def setEstimatedRowsUndefined: Self = StObject.set(x, "estimatedRows", js.undefined)
        
        inline def setOldestEntryTime(value: String): Self = StObject.set(x, "oldestEntryTime", value.asInstanceOf[js.Any])
        
        inline def setOldestEntryTimeUndefined: Self = StObject.set(x, "oldestEntryTime", js.undefined)
      }
    }
    
    trait Table extends StObject {
      
      var clustering: js.UndefOr[Clustering] = js.undefined
      
      var creationTime: js.UndefOr[String] = js.undefined
      
      var description: js.UndefOr[String] = js.undefined
      
      var encryptionConfiguration: js.UndefOr[EncryptionConfiguration] = js.undefined
      
      var etag: js.UndefOr[String] = js.undefined
      
      var expirationTime: js.UndefOr[String] = js.undefined
      
      var externalDataConfiguration: js.UndefOr[ExternalDataConfiguration] = js.undefined
      
      var friendlyName: js.UndefOr[String] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var labels: js.UndefOr[js.Object] = js.undefined
      
      var lastModifiedTime: js.UndefOr[String] = js.undefined
      
      var location: js.UndefOr[String] = js.undefined
      
      var materializedView: js.UndefOr[MaterializedViewDefinition] = js.undefined
      
      var model: js.UndefOr[ModelDefinition] = js.undefined
      
      var numBytes: js.UndefOr[String] = js.undefined
      
      var numLongTermBytes: js.UndefOr[String] = js.undefined
      
      var numPhysicalBytes: js.UndefOr[String] = js.undefined
      
      var numRows: js.UndefOr[String] = js.undefined
      
      var rangePartitioning: js.UndefOr[RangePartitioning] = js.undefined
      
      var requirePartitionFilter: js.UndefOr[Boolean] = js.undefined
      
      var schema: js.UndefOr[TableSchema] = js.undefined
      
      var selfLink: js.UndefOr[String] = js.undefined
      
      var streamingBuffer: js.UndefOr[Streamingbuffer] = js.undefined
      
      var tableReference: js.UndefOr[TableReference] = js.undefined
      
      var timePartitioning: js.UndefOr[TimePartitioning] = js.undefined
      
      var `type`: js.UndefOr[String] = js.undefined
      
      var view: js.UndefOr[ViewDefinition] = js.undefined
    }
    object Table {
      
      inline def apply(): Table = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Table]
      }
      
      extension [Self <: Table](x: Self) {
        
        inline def setClustering(value: Clustering): Self = StObject.set(x, "clustering", value.asInstanceOf[js.Any])
        
        inline def setClusteringUndefined: Self = StObject.set(x, "clustering", js.undefined)
        
        inline def setCreationTime(value: String): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
        
        inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
        
        inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
        
        inline def setEncryptionConfiguration(value: EncryptionConfiguration): Self = StObject.set(x, "encryptionConfiguration", value.asInstanceOf[js.Any])
        
        inline def setEncryptionConfigurationUndefined: Self = StObject.set(x, "encryptionConfiguration", js.undefined)
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setExpirationTime(value: String): Self = StObject.set(x, "expirationTime", value.asInstanceOf[js.Any])
        
        inline def setExpirationTimeUndefined: Self = StObject.set(x, "expirationTime", js.undefined)
        
        inline def setExternalDataConfiguration(value: ExternalDataConfiguration): Self = StObject.set(x, "externalDataConfiguration", value.asInstanceOf[js.Any])
        
        inline def setExternalDataConfigurationUndefined: Self = StObject.set(x, "externalDataConfiguration", js.undefined)
        
        inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
        
        inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setLabels(value: js.Object): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
        
        inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
        
        inline def setLastModifiedTime(value: String): Self = StObject.set(x, "lastModifiedTime", value.asInstanceOf[js.Any])
        
        inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "lastModifiedTime", js.undefined)
        
        inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
        
        inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
        
        inline def setMaterializedView(value: MaterializedViewDefinition): Self = StObject.set(x, "materializedView", value.asInstanceOf[js.Any])
        
        inline def setMaterializedViewUndefined: Self = StObject.set(x, "materializedView", js.undefined)
        
        inline def setModel(value: ModelDefinition): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
        
        inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
        
        inline def setNumBytes(value: String): Self = StObject.set(x, "numBytes", value.asInstanceOf[js.Any])
        
        inline def setNumBytesUndefined: Self = StObject.set(x, "numBytes", js.undefined)
        
        inline def setNumLongTermBytes(value: String): Self = StObject.set(x, "numLongTermBytes", value.asInstanceOf[js.Any])
        
        inline def setNumLongTermBytesUndefined: Self = StObject.set(x, "numLongTermBytes", js.undefined)
        
        inline def setNumPhysicalBytes(value: String): Self = StObject.set(x, "numPhysicalBytes", value.asInstanceOf[js.Any])
        
        inline def setNumPhysicalBytesUndefined: Self = StObject.set(x, "numPhysicalBytes", js.undefined)
        
        inline def setNumRows(value: String): Self = StObject.set(x, "numRows", value.asInstanceOf[js.Any])
        
        inline def setNumRowsUndefined: Self = StObject.set(x, "numRows", js.undefined)
        
        inline def setRangePartitioning(value: RangePartitioning): Self = StObject.set(x, "rangePartitioning", value.asInstanceOf[js.Any])
        
        inline def setRangePartitioningUndefined: Self = StObject.set(x, "rangePartitioning", js.undefined)
        
        inline def setRequirePartitionFilter(value: Boolean): Self = StObject.set(x, "requirePartitionFilter", value.asInstanceOf[js.Any])
        
        inline def setRequirePartitionFilterUndefined: Self = StObject.set(x, "requirePartitionFilter", js.undefined)
        
        inline def setSchema(value: TableSchema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
        
        inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
        
        inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
        
        inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
        
        inline def setStreamingBuffer(value: Streamingbuffer): Self = StObject.set(x, "streamingBuffer", value.asInstanceOf[js.Any])
        
        inline def setStreamingBufferUndefined: Self = StObject.set(x, "streamingBuffer", js.undefined)
        
        inline def setTableReference(value: TableReference): Self = StObject.set(x, "tableReference", value.asInstanceOf[js.Any])
        
        inline def setTableReferenceUndefined: Self = StObject.set(x, "tableReference", js.undefined)
        
        inline def setTimePartitioning(value: TimePartitioning): Self = StObject.set(x, "timePartitioning", value.asInstanceOf[js.Any])
        
        inline def setTimePartitioningUndefined: Self = StObject.set(x, "timePartitioning", js.undefined)
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
        
        inline def setView(value: ViewDefinition): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
        
        inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
      }
    }
    
    trait TableCell extends StObject {
      
      var v: js.UndefOr[js.Object] = js.undefined
    }
    object TableCell {
      
      inline def apply(): TableCell = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TableCell]
      }
      
      extension [Self <: TableCell](x: Self) {
        
        inline def setV(value: js.Object): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
        
        inline def setVUndefined: Self = StObject.set(x, "v", js.undefined)
      }
    }
    
    trait TableDataInsertAllRequest extends StObject {
      
      var ignoreUnknownValues: js.UndefOr[Boolean] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var rows: js.UndefOr[js.Array[TableDataInsertAllRequestRows]] = js.undefined
      
      var skipInvalidRows: js.UndefOr[Boolean] = js.undefined
      
      var templateSuffix: js.UndefOr[String] = js.undefined
    }
    object TableDataInsertAllRequest {
      
      inline def apply(): TableDataInsertAllRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TableDataInsertAllRequest]
      }
      
      extension [Self <: TableDataInsertAllRequest](x: Self) {
        
        inline def setIgnoreUnknownValues(value: Boolean): Self = StObject.set(x, "ignoreUnknownValues", value.asInstanceOf[js.Any])
        
        inline def setIgnoreUnknownValuesUndefined: Self = StObject.set(x, "ignoreUnknownValues", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setRows(value: js.Array[TableDataInsertAllRequestRows]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
        
        inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
        
        inline def setRowsVarargs(value: TableDataInsertAllRequestRows*): Self = StObject.set(x, "rows", js.Array(value*))
        
        inline def setSkipInvalidRows(value: Boolean): Self = StObject.set(x, "skipInvalidRows", value.asInstanceOf[js.Any])
        
        inline def setSkipInvalidRowsUndefined: Self = StObject.set(x, "skipInvalidRows", js.undefined)
        
        inline def setTemplateSuffix(value: String): Self = StObject.set(x, "templateSuffix", value.asInstanceOf[js.Any])
        
        inline def setTemplateSuffixUndefined: Self = StObject.set(x, "templateSuffix", js.undefined)
      }
    }
    
    trait TableDataInsertAllRequestRows extends StObject {
      
      var insertId: js.UndefOr[String] = js.undefined
      
      var json: js.UndefOr[js.Object] = js.undefined
    }
    object TableDataInsertAllRequestRows {
      
      inline def apply(): TableDataInsertAllRequestRows = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TableDataInsertAllRequestRows]
      }
      
      extension [Self <: TableDataInsertAllRequestRows](x: Self) {
        
        inline def setInsertId(value: String): Self = StObject.set(x, "insertId", value.asInstanceOf[js.Any])
        
        inline def setInsertIdUndefined: Self = StObject.set(x, "insertId", js.undefined)
        
        inline def setJson(value: js.Object): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
        
        inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      }
    }
    
    trait TableDataInsertAllResponse extends StObject {
      
      var insertErrors: js.UndefOr[js.Array[TableDataInsertAllResponseInsertErrors]] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
    }
    object TableDataInsertAllResponse {
      
      inline def apply(): TableDataInsertAllResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TableDataInsertAllResponse]
      }
      
      extension [Self <: TableDataInsertAllResponse](x: Self) {
        
        inline def setInsertErrors(value: js.Array[TableDataInsertAllResponseInsertErrors]): Self = StObject.set(x, "insertErrors", value.asInstanceOf[js.Any])
        
        inline def setInsertErrorsUndefined: Self = StObject.set(x, "insertErrors", js.undefined)
        
        inline def setInsertErrorsVarargs(value: TableDataInsertAllResponseInsertErrors*): Self = StObject.set(x, "insertErrors", js.Array(value*))
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      }
    }
    
    trait TableDataInsertAllResponseInsertErrors extends StObject {
      
      var errors: js.UndefOr[js.Array[ErrorProto]] = js.undefined
      
      var index: js.UndefOr[Double] = js.undefined
    }
    object TableDataInsertAllResponseInsertErrors {
      
      inline def apply(): TableDataInsertAllResponseInsertErrors = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TableDataInsertAllResponseInsertErrors]
      }
      
      extension [Self <: TableDataInsertAllResponseInsertErrors](x: Self) {
        
        inline def setErrors(value: js.Array[ErrorProto]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
        
        inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
        
        inline def setErrorsVarargs(value: ErrorProto*): Self = StObject.set(x, "errors", js.Array(value*))
        
        inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
        
        inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      }
    }
    
    trait TableDataList extends StObject {
      
      var etag: js.UndefOr[String] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var pageToken: js.UndefOr[String] = js.undefined
      
      var rows: js.UndefOr[js.Array[TableRow]] = js.undefined
      
      var totalRows: js.UndefOr[String] = js.undefined
    }
    object TableDataList {
      
      inline def apply(): TableDataList = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TableDataList]
      }
      
      extension [Self <: TableDataList](x: Self) {
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
        
        inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
        
        inline def setRows(value: js.Array[TableRow]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
        
        inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
        
        inline def setRowsVarargs(value: TableRow*): Self = StObject.set(x, "rows", js.Array(value*))
        
        inline def setTotalRows(value: String): Self = StObject.set(x, "totalRows", value.asInstanceOf[js.Any])
        
        inline def setTotalRowsUndefined: Self = StObject.set(x, "totalRows", js.undefined)
      }
    }
    
    trait TableFieldSchema extends StObject {
      
      var categories: js.UndefOr[TableFieldSchemaCategories] = js.undefined
      
      var description: js.UndefOr[String] = js.undefined
      
      var fields: js.UndefOr[js.Array[TableFieldSchema]] = js.undefined
      
      var mode: js.UndefOr[String] = js.undefined
      
      var name: js.UndefOr[String] = js.undefined
      
      var `type`: js.UndefOr[String] = js.undefined
    }
    object TableFieldSchema {
      
      inline def apply(): TableFieldSchema = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TableFieldSchema]
      }
      
      extension [Self <: TableFieldSchema](x: Self) {
        
        inline def setCategories(value: TableFieldSchemaCategories): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
        
        inline def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
        
        inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
        
        inline def setFields(value: js.Array[TableFieldSchema]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
        
        inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
        
        inline def setFieldsVarargs(value: TableFieldSchema*): Self = StObject.set(x, "fields", js.Array(value*))
        
        inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
        
        inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    trait TableFieldSchemaCategories extends StObject {
      
      var names: js.UndefOr[js.Array[String]] = js.undefined
    }
    object TableFieldSchemaCategories {
      
      inline def apply(): TableFieldSchemaCategories = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TableFieldSchemaCategories]
      }
      
      extension [Self <: TableFieldSchemaCategories](x: Self) {
        
        inline def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
        
        inline def setNamesUndefined: Self = StObject.set(x, "names", js.undefined)
        
        inline def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value*))
      }
    }
    
    trait TableList extends StObject {
      
      var etag: js.UndefOr[String] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var nextPageToken: js.UndefOr[String] = js.undefined
      
      var tables: js.UndefOr[js.Array[TableListTables]] = js.undefined
      
      var totalItems: js.UndefOr[Double] = js.undefined
    }
    object TableList {
      
      inline def apply(): TableList = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TableList]
      }
      
      extension [Self <: TableList](x: Self) {
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        
        inline def setTables(value: js.Array[TableListTables]): Self = StObject.set(x, "tables", value.asInstanceOf[js.Any])
        
        inline def setTablesUndefined: Self = StObject.set(x, "tables", js.undefined)
        
        inline def setTablesVarargs(value: TableListTables*): Self = StObject.set(x, "tables", js.Array(value*))
        
        inline def setTotalItems(value: Double): Self = StObject.set(x, "totalItems", value.asInstanceOf[js.Any])
        
        inline def setTotalItemsUndefined: Self = StObject.set(x, "totalItems", js.undefined)
      }
    }
    
    trait TableListTables extends StObject {
      
      var clustering: js.UndefOr[Clustering] = js.undefined
      
      var creationTime: js.UndefOr[String] = js.undefined
      
      var expirationTime: js.UndefOr[String] = js.undefined
      
      var friendlyName: js.UndefOr[String] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var labels: js.UndefOr[js.Object] = js.undefined
      
      var tableReference: js.UndefOr[TableReference] = js.undefined
      
      var timePartitioning: js.UndefOr[TimePartitioning] = js.undefined
      
      var `type`: js.UndefOr[String] = js.undefined
      
      var view: js.UndefOr[TableListTablesView] = js.undefined
    }
    object TableListTables {
      
      inline def apply(): TableListTables = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TableListTables]
      }
      
      extension [Self <: TableListTables](x: Self) {
        
        inline def setClustering(value: Clustering): Self = StObject.set(x, "clustering", value.asInstanceOf[js.Any])
        
        inline def setClusteringUndefined: Self = StObject.set(x, "clustering", js.undefined)
        
        inline def setCreationTime(value: String): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
        
        inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
        
        inline def setExpirationTime(value: String): Self = StObject.set(x, "expirationTime", value.asInstanceOf[js.Any])
        
        inline def setExpirationTimeUndefined: Self = StObject.set(x, "expirationTime", js.undefined)
        
        inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
        
        inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setLabels(value: js.Object): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
        
        inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
        
        inline def setTableReference(value: TableReference): Self = StObject.set(x, "tableReference", value.asInstanceOf[js.Any])
        
        inline def setTableReferenceUndefined: Self = StObject.set(x, "tableReference", js.undefined)
        
        inline def setTimePartitioning(value: TimePartitioning): Self = StObject.set(x, "timePartitioning", value.asInstanceOf[js.Any])
        
        inline def setTimePartitioningUndefined: Self = StObject.set(x, "timePartitioning", js.undefined)
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
        
        inline def setView(value: TableListTablesView): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
        
        inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
      }
    }
    
    trait TableListTablesView extends StObject {
      
      var useLegacySql: js.UndefOr[Boolean] = js.undefined
    }
    object TableListTablesView {
      
      inline def apply(): TableListTablesView = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TableListTablesView]
      }
      
      extension [Self <: TableListTablesView](x: Self) {
        
        inline def setUseLegacySql(value: Boolean): Self = StObject.set(x, "useLegacySql", value.asInstanceOf[js.Any])
        
        inline def setUseLegacySqlUndefined: Self = StObject.set(x, "useLegacySql", js.undefined)
      }
    }
    
    trait TableReference extends StObject {
      
      var datasetId: js.UndefOr[String] = js.undefined
      
      var projectId: js.UndefOr[String] = js.undefined
      
      var tableId: js.UndefOr[String] = js.undefined
    }
    object TableReference {
      
      inline def apply(): TableReference = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TableReference]
      }
      
      extension [Self <: TableReference](x: Self) {
        
        inline def setDatasetId(value: String): Self = StObject.set(x, "datasetId", value.asInstanceOf[js.Any])
        
        inline def setDatasetIdUndefined: Self = StObject.set(x, "datasetId", js.undefined)
        
        inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
        
        inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
        
        inline def setTableId(value: String): Self = StObject.set(x, "tableId", value.asInstanceOf[js.Any])
        
        inline def setTableIdUndefined: Self = StObject.set(x, "tableId", js.undefined)
      }
    }
    
    trait TableRow extends StObject {
      
      var f: js.UndefOr[js.Array[TableCell]] = js.undefined
    }
    object TableRow {
      
      inline def apply(): TableRow = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TableRow]
      }
      
      extension [Self <: TableRow](x: Self) {
        
        inline def setF(value: js.Array[TableCell]): Self = StObject.set(x, "f", value.asInstanceOf[js.Any])
        
        inline def setFUndefined: Self = StObject.set(x, "f", js.undefined)
        
        inline def setFVarargs(value: TableCell*): Self = StObject.set(x, "f", js.Array(value*))
      }
    }
    
    trait TableSchema extends StObject {
      
      var fields: js.UndefOr[js.Array[TableFieldSchema]] = js.undefined
    }
    object TableSchema {
      
      inline def apply(): TableSchema = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TableSchema]
      }
      
      extension [Self <: TableSchema](x: Self) {
        
        inline def setFields(value: js.Array[TableFieldSchema]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
        
        inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
        
        inline def setFieldsVarargs(value: TableFieldSchema*): Self = StObject.set(x, "fields", js.Array(value*))
      }
    }
    
    trait TimePartitioning extends StObject {
      
      var expirationMs: js.UndefOr[String] = js.undefined
      
      var field: js.UndefOr[String] = js.undefined
      
      var requirePartitionFilter: js.UndefOr[Boolean] = js.undefined
      
      var `type`: js.UndefOr[String] = js.undefined
    }
    object TimePartitioning {
      
      inline def apply(): TimePartitioning = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TimePartitioning]
      }
      
      extension [Self <: TimePartitioning](x: Self) {
        
        inline def setExpirationMs(value: String): Self = StObject.set(x, "expirationMs", value.asInstanceOf[js.Any])
        
        inline def setExpirationMsUndefined: Self = StObject.set(x, "expirationMs", js.undefined)
        
        inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
        
        inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
        
        inline def setRequirePartitionFilter(value: Boolean): Self = StObject.set(x, "requirePartitionFilter", value.asInstanceOf[js.Any])
        
        inline def setRequirePartitionFilterUndefined: Self = StObject.set(x, "requirePartitionFilter", js.undefined)
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    trait UserDefinedFunctionResource extends StObject {
      
      var inlineCode: js.UndefOr[String] = js.undefined
      
      var resourceUri: js.UndefOr[String] = js.undefined
    }
    object UserDefinedFunctionResource {
      
      inline def apply(): UserDefinedFunctionResource = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UserDefinedFunctionResource]
      }
      
      extension [Self <: UserDefinedFunctionResource](x: Self) {
        
        inline def setInlineCode(value: String): Self = StObject.set(x, "inlineCode", value.asInstanceOf[js.Any])
        
        inline def setInlineCodeUndefined: Self = StObject.set(x, "inlineCode", js.undefined)
        
        inline def setResourceUri(value: String): Self = StObject.set(x, "resourceUri", value.asInstanceOf[js.Any])
        
        inline def setResourceUriUndefined: Self = StObject.set(x, "resourceUri", js.undefined)
      }
    }
    
    trait ViewDefinition extends StObject {
      
      var query: js.UndefOr[String] = js.undefined
      
      var useLegacySql: js.UndefOr[Boolean] = js.undefined
      
      var userDefinedFunctionResources: js.UndefOr[js.Array[UserDefinedFunctionResource]] = js.undefined
    }
    object ViewDefinition {
      
      inline def apply(): ViewDefinition = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ViewDefinition]
      }
      
      extension [Self <: ViewDefinition](x: Self) {
        
        inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
        
        inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
        
        inline def setUseLegacySql(value: Boolean): Self = StObject.set(x, "useLegacySql", value.asInstanceOf[js.Any])
        
        inline def setUseLegacySqlUndefined: Self = StObject.set(x, "useLegacySql", js.undefined)
        
        inline def setUserDefinedFunctionResources(value: js.Array[UserDefinedFunctionResource]): Self = StObject.set(x, "userDefinedFunctionResources", value.asInstanceOf[js.Any])
        
        inline def setUserDefinedFunctionResourcesUndefined: Self = StObject.set(x, "userDefinedFunctionResources", js.undefined)
        
        inline def setUserDefinedFunctionResourcesVarargs(value: UserDefinedFunctionResource*): Self = StObject.set(x, "userDefinedFunctionResources", js.Array(value*))
      }
    }
  }
}

package typings.googleAppsScript.GoogleAppsScript.BigQuery_

import typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema.Dataset
import typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema.DatasetList
import typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema.GetQueryResultsResponse
import typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema.GetServiceAccountResponse
import typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema.Job
import typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema.JobCancelResponse
import typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema.JobList
import typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema.ProjectList
import typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema.QueryRequest
import typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema.QueryResponse
import typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema.Table
import typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema.TableDataInsertAllRequest
import typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema.TableDataInsertAllResponse
import typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema.TableDataList
import typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema.TableList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def insert(resource: Job, projectId: String, mediaData: js.Any): Job = js.native
    
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

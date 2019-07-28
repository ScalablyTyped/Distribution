package typings.googleDashAppsDashScript.GoogleAppsScriptNs.BigqueryNs.CollectionNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.BigqueryNs.SchemaNs.GetQueryResultsResponse
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.BigqueryNs.SchemaNs.Job
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.BigqueryNs.SchemaNs.JobCancelResponse
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.BigqueryNs.SchemaNs.JobList
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.BigqueryNs.SchemaNs.QueryRequest
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.BigqueryNs.SchemaNs.QueryResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobsCollection extends js.Object {
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


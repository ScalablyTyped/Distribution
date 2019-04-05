package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigqueryNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobsCollection extends js.Object {
  // Requests that a job be cancelled. This call will return immediately, and the client will need to poll for the job status to see if the cancel completed successfully. Cancelled jobs may still incur costs.
  def cancel(projectId: java.lang.String, jobId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigqueryNs.SchemaNs.JobCancelResponse = js.native
  // Requests that a job be cancelled. This call will return immediately, and the client will need to poll for the job status to see if the cancel completed successfully. Cancelled jobs may still incur costs.
  def cancel(projectId: java.lang.String, jobId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigqueryNs.SchemaNs.JobCancelResponse = js.native
  // Returns information about a specific job. Job information is available for a six month period after creation. Requires that you're the person who ran the job, or have the Is Owner project role.
  def get(projectId: java.lang.String, jobId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigqueryNs.SchemaNs.Job = js.native
  // Returns information about a specific job. Job information is available for a six month period after creation. Requires that you're the person who ran the job, or have the Is Owner project role.
  def get(projectId: java.lang.String, jobId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigqueryNs.SchemaNs.Job = js.native
  // Retrieves the results of a query job.
  def getQueryResults(projectId: java.lang.String, jobId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigqueryNs.SchemaNs.GetQueryResultsResponse = js.native
  // Retrieves the results of a query job.
  def getQueryResults(projectId: java.lang.String, jobId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigqueryNs.SchemaNs.GetQueryResultsResponse = js.native
  // Starts a new asynchronous job. Requires the Can View project role.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigqueryNs.SchemaNs.Job,
    projectId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigqueryNs.SchemaNs.Job = js.native
  // Starts a new asynchronous job. Requires the Can View project role.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigqueryNs.SchemaNs.Job,
    projectId: java.lang.String,
    mediaData: js.Any
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigqueryNs.SchemaNs.Job = js.native
  // Lists all jobs that you started in the specified project. Job information is available for a six month period after creation. The job list is sorted in reverse chronological order, by job creation time. Requires the Can View project role, or the Is Owner project role if you set the allUsers property.
  def list(projectId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigqueryNs.SchemaNs.JobList = js.native
  // Lists all jobs that you started in the specified project. Job information is available for a six month period after creation. The job list is sorted in reverse chronological order, by job creation time. Requires the Can View project role, or the Is Owner project role if you set the allUsers property.
  def list(projectId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigqueryNs.SchemaNs.JobList = js.native
  // Runs a BigQuery SQL query synchronously and returns query results if the query completes within a specified timeout.
  def query(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigqueryNs.SchemaNs.QueryRequest,
    projectId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigqueryNs.SchemaNs.QueryResponse = js.native
}


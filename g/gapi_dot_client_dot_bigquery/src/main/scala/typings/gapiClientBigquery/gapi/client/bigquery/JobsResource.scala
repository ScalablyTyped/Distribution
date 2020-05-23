package typings.gapiClientBigquery.gapi.client.bigquery

import typings.gapiClient.gapi.client.Request
import typings.gapiClientBigquery.anon.AllUsers
import typings.gapiClientBigquery.anon.Fields
import typings.gapiClientBigquery.anon.JobId
import typings.gapiClientBigquery.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobsResource extends js.Object {
  /**
    * Requests that a job be cancelled. This call will return immediately, and the client will need to poll for the job status to see if the cancel completed
    * successfully. Cancelled jobs may still incur costs.
    */
  def cancel(request: JobId): Request[JobCancelResponse]
  /**
    * Returns information about a specific job. Job information is available for a six month period after creation. Requires that you're the person who ran
    * the job, or have the Is Owner project role.
    */
  def get(request: JobId): Request[Job]
  /** Retrieves the results of a query job. */
  def getQueryResults(request: Key): Request[GetQueryResultsResponse]
  /** Starts a new asynchronous job. Requires the Can View project role. */
  def insert(request: Fields): Request[Job]
  /**
    * Lists all jobs that you started in the specified project. Job information is available for a six month period after creation. The job list is sorted in
    * reverse chronological order, by job creation time. Requires the Can View project role, or the Is Owner project role if you set the allUsers property.
    */
  def list(request: AllUsers): Request[JobList]
  /** Runs a BigQuery SQL query synchronously and returns query results if the query completes within a specified timeout. */
  def query(request: Fields): Request[QueryResponse]
}

object JobsResource {
  @scala.inline
  def apply(
    cancel: JobId => Request[JobCancelResponse],
    get: JobId => Request[Job],
    getQueryResults: Key => Request[GetQueryResultsResponse],
    insert: Fields => Request[Job],
    list: AllUsers => Request[JobList],
    query: Fields => Request[QueryResponse]
  ): JobsResource = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1(cancel), get = js.Any.fromFunction1(get), getQueryResults = js.Any.fromFunction1(getQueryResults), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), query = js.Any.fromFunction1(query))
    __obj.asInstanceOf[JobsResource]
  }
}


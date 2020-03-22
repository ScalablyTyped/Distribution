package typings.gapiClientBigquery.gapi.client.bigquery

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientBigquery.AnonAllUsers
import typings.gapiClientBigquery.AnonFields
import typings.gapiClientBigquery.AnonJobId
import typings.gapiClientBigquery.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobsResource extends js.Object {
  /**
    * Requests that a job be cancelled. This call will return immediately, and the client will need to poll for the job status to see if the cancel completed
    * successfully. Cancelled jobs may still incur costs.
    */
  def cancel(request: AnonJobId): Request_[JobCancelResponse]
  /**
    * Returns information about a specific job. Job information is available for a six month period after creation. Requires that you're the person who ran
    * the job, or have the Is Owner project role.
    */
  def get(request: AnonJobId): Request_[Job]
  /** Retrieves the results of a query job. */
  def getQueryResults(request: AnonKey): Request_[GetQueryResultsResponse]
  /** Starts a new asynchronous job. Requires the Can View project role. */
  def insert(request: AnonFields): Request_[Job]
  /**
    * Lists all jobs that you started in the specified project. Job information is available for a six month period after creation. The job list is sorted in
    * reverse chronological order, by job creation time. Requires the Can View project role, or the Is Owner project role if you set the allUsers property.
    */
  def list(request: AnonAllUsers): Request_[JobList]
  /** Runs a BigQuery SQL query synchronously and returns query results if the query completes within a specified timeout. */
  def query(request: AnonFields): Request_[QueryResponse]
}

object JobsResource {
  @scala.inline
  def apply(
    cancel: AnonJobId => Request_[JobCancelResponse],
    get: AnonJobId => Request_[Job],
    getQueryResults: AnonKey => Request_[GetQueryResultsResponse],
    insert: AnonFields => Request_[Job],
    list: AnonAllUsers => Request_[JobList],
    query: AnonFields => Request_[QueryResponse]
  ): JobsResource = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1(cancel), get = js.Any.fromFunction1(get), getQueryResults = js.Any.fromFunction1(getQueryResults), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), query = js.Any.fromFunction1(query))
  
    __obj.asInstanceOf[JobsResource]
  }
}


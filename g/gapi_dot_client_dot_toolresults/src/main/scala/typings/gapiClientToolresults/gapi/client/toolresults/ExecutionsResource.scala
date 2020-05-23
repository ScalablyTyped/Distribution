package typings.gapiClientToolresults.gapi.client.toolresults

import typings.gapiClient.gapi.client.Request
import typings.gapiClientToolresults.anon.ExecutionId
import typings.gapiClientToolresults.anon.PageToken
import typings.gapiClientToolresults.anon.PrettyPrint
import typings.gapiClientToolresults.anon.QuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecutionsResource extends js.Object {
  var clusters: ClustersResource
  var steps: StepsResource
  /**
    * Creates an Execution.
    *
    * The returned Execution will have the id set.
    *
    * May return any of the following canonical error codes:
    *
    * - PERMISSION_DENIED - if the user is not authorized to write to project - INVALID_ARGUMENT - if the request is malformed - NOT_FOUND - if the
    * containing History does not exist
    */
  def create(request: QuotaUser): Request[Execution]
  /**
    * Gets an Execution.
    *
    * May return any of the following canonical error codes:
    *
    * - PERMISSION_DENIED - if the user is not authorized to write to project - INVALID_ARGUMENT - if the request is malformed - NOT_FOUND - if the Execution
    * does not exist
    */
  def get(request: ExecutionId): Request[Execution]
  /**
    * Lists Histories for a given Project.
    *
    * The executions are sorted by creation_time in descending order. The execution_id key will be used to order the executions with the same creation_time.
    *
    * May return any of the following canonical error codes:
    *
    * - PERMISSION_DENIED - if the user is not authorized to read project - INVALID_ARGUMENT - if the request is malformed - NOT_FOUND - if the containing
    * History does not exist
    */
  def list(request: PageToken): Request[ListExecutionsResponse]
  /**
    * Updates an existing Execution with the supplied partial entity.
    *
    * May return any of the following canonical error codes:
    *
    * - PERMISSION_DENIED - if the user is not authorized to write to project - INVALID_ARGUMENT - if the request is malformed - FAILED_PRECONDITION - if the
    * requested state transition is illegal - NOT_FOUND - if the containing History does not exist
    */
  def patch(request: PrettyPrint): Request[Execution]
}

object ExecutionsResource {
  @scala.inline
  def apply(
    clusters: ClustersResource,
    create: QuotaUser => Request[Execution],
    get: ExecutionId => Request[Execution],
    list: PageToken => Request[ListExecutionsResponse],
    patch: PrettyPrint => Request[Execution],
    steps: StepsResource
  ): ExecutionsResource = {
    val __obj = js.Dynamic.literal(clusters = clusters.asInstanceOf[js.Any], create = js.Any.fromFunction1(create), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), steps = steps.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecutionsResource]
  }
}


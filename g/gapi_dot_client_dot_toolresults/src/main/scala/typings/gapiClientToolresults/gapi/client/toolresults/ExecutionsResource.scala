package typings.gapiClientToolresults.gapi.client.toolresults

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientToolresults.AnonAltExecutionId
import typings.gapiClientToolresults.AnonAltExecutionIdFieldsHistoryIdKeyOauthtokenPrettyPrint
import typings.gapiClientToolresults.AnonAltFields
import typings.gapiClientToolresults.AnonAltFieldsHistoryId
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
  def create(request: AnonAltFields): Request_[Execution]
  /**
    * Gets an Execution.
    *
    * May return any of the following canonical error codes:
    *
    * - PERMISSION_DENIED - if the user is not authorized to write to project - INVALID_ARGUMENT - if the request is malformed - NOT_FOUND - if the Execution
    * does not exist
    */
  def get(request: AnonAltExecutionId): Request_[Execution]
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
  def list(request: AnonAltFieldsHistoryId): Request_[ListExecutionsResponse]
  /**
    * Updates an existing Execution with the supplied partial entity.
    *
    * May return any of the following canonical error codes:
    *
    * - PERMISSION_DENIED - if the user is not authorized to write to project - INVALID_ARGUMENT - if the request is malformed - FAILED_PRECONDITION - if the
    * requested state transition is illegal - NOT_FOUND - if the containing History does not exist
    */
  def patch(request: AnonAltExecutionIdFieldsHistoryIdKeyOauthtokenPrettyPrint): Request_[Execution]
}

object ExecutionsResource {
  @scala.inline
  def apply(
    clusters: ClustersResource,
    create: AnonAltFields => Request_[Execution],
    get: AnonAltExecutionId => Request_[Execution],
    list: AnonAltFieldsHistoryId => Request_[ListExecutionsResponse],
    patch: AnonAltExecutionIdFieldsHistoryIdKeyOauthtokenPrettyPrint => Request_[Execution],
    steps: StepsResource
  ): ExecutionsResource = {
    val __obj = js.Dynamic.literal(clusters = clusters.asInstanceOf[js.Any], create = js.Any.fromFunction1(create), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), steps = steps.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ExecutionsResource]
  }
}


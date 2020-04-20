package typings.gapiClientTesting.gapi.client.testing

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientTesting.AnonAccesstoken
import typings.gapiClientTesting.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestMatricesResource extends js.Object {
  /**
    * Cancels unfinished test executions in a test matrix.
    * This call returns immediately and cancellation proceeds asychronously.
    * If the matrix is already final, this operation will have no effect.
    *
    * May return any of the following canonical error codes:
    *
    * - PERMISSION_DENIED - if the user is not authorized to read project
    * - INVALID_ARGUMENT - if the request is malformed
    * - NOT_FOUND - if the Test Matrix does not exist
    */
  def cancel(request: AnonAccesstoken): Request_[CancelTestMatrixResponse]
  /**
    * Request to run a matrix of tests according to the given specifications.
    * Unsupported environments will be returned in the state UNSUPPORTED.
    * Matrices are limited to at most 200 supported executions.
    *
    * May return any of the following canonical error codes:
    *
    * - PERMISSION_DENIED - if the user is not authorized to write to project
    * - INVALID_ARGUMENT - if the request is malformed or if the matrix expands
    * to more than 200 supported executions
    */
  def create(request: AnonAlt): Request_[TestMatrix]
  /**
    * Check the status of a test matrix.
    *
    * May return any of the following canonical error codes:
    *
    * - PERMISSION_DENIED - if the user is not authorized to read project
    * - INVALID_ARGUMENT - if the request is malformed
    * - NOT_FOUND - if the Test Matrix does not exist
    */
  def get(request: AnonAccesstoken): Request_[TestMatrix]
}

object TestMatricesResource {
  @scala.inline
  def apply(
    cancel: AnonAccesstoken => Request_[CancelTestMatrixResponse],
    create: AnonAlt => Request_[TestMatrix],
    get: AnonAccesstoken => Request_[TestMatrix]
  ): TestMatricesResource = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1(cancel), create = js.Any.fromFunction1(create), get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[TestMatricesResource]
  }
}


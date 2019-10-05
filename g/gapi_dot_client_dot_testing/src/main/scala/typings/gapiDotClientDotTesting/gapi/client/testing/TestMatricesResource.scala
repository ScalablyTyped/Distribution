package typings.gapiDotClientDotTesting.gapi.client.testing

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotTesting.Anon_Accesstoken
import typings.gapiDotClientDotTesting.Anon_AccesstokenAlt
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
  def cancel(request: Anon_Accesstoken): Request[CancelTestMatrixResponse]
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
  def create(request: Anon_AccesstokenAlt): Request[TestMatrix]
  /**
    * Check the status of a test matrix.
    *
    * May return any of the following canonical error codes:
    *
    * - PERMISSION_DENIED - if the user is not authorized to read project
    * - INVALID_ARGUMENT - if the request is malformed
    * - NOT_FOUND - if the Test Matrix does not exist
    */
  def get(request: Anon_Accesstoken): Request[TestMatrix]
}

object TestMatricesResource {
  @scala.inline
  def apply(
    cancel: Anon_Accesstoken => Request[CancelTestMatrixResponse],
    create: Anon_AccesstokenAlt => Request[TestMatrix],
    get: Anon_Accesstoken => Request[TestMatrix]
  ): TestMatricesResource = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1(cancel), create = js.Any.fromFunction1(create), get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[TestMatricesResource]
  }
}


package typings
package gapiDotClientDotTestingLib.gapiNs.clientNs.testingNs

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
  def cancel(request: gapiDotClientDotTestingLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[CancelTestMatrixResponse]
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
  def create(request: gapiDotClientDotTestingLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[TestMatrix]
  /**
    * Check the status of a test matrix.
    *
    * May return any of the following canonical error codes:
    *
    * - PERMISSION_DENIED - if the user is not authorized to read project
    * - INVALID_ARGUMENT - if the request is malformed
    * - NOT_FOUND - if the Test Matrix does not exist
    */
  def get(request: gapiDotClientDotTestingLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[TestMatrix]
}

object TestMatricesResource {
  @scala.inline
  def apply(
    cancel: js.Function1[
      gapiDotClientDotTestingLib.Anon_Accesstoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[CancelTestMatrixResponse]
    ],
    create: js.Function1[
      gapiDotClientDotTestingLib.Anon_AccesstokenAlt, 
      gapiDotClientLib.gapiNs.clientNs.Request[TestMatrix]
    ],
    get: js.Function1[
      gapiDotClientDotTestingLib.Anon_Accesstoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[TestMatrix]
    ]
  ): TestMatricesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(cancel)
    __obj.updateDynamic("create")(create)
    __obj.updateDynamic("get")(get)
    __obj.asInstanceOf[TestMatricesResource]
  }
}


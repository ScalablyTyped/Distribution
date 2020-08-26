package typings.gapiClientTesting.gapi.client.testing

import typings.gapiClient.gapi.client.Request
import typings.gapiClientTesting.anon.Accesstoken
import typings.gapiClientTesting.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
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
  def cancel(request: Accesstoken): Request[CancelTestMatrixResponse] = js.native
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
  def create(request: Alt): Request[TestMatrix] = js.native
  /**
    * Check the status of a test matrix.
    *
    * May return any of the following canonical error codes:
    *
    * - PERMISSION_DENIED - if the user is not authorized to read project
    * - INVALID_ARGUMENT - if the request is malformed
    * - NOT_FOUND - if the Test Matrix does not exist
    */
  def get(request: Accesstoken): Request[TestMatrix] = js.native
}

object TestMatricesResource {
  @scala.inline
  def apply(
    cancel: Accesstoken => Request[CancelTestMatrixResponse],
    create: Alt => Request[TestMatrix],
    get: Accesstoken => Request[TestMatrix]
  ): TestMatricesResource = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1(cancel), create = js.Any.fromFunction1(create), get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[TestMatricesResource]
  }
  @scala.inline
  implicit class TestMatricesResourceOps[Self <: TestMatricesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCancel(value: Accesstoken => Request[CancelTestMatrixResponse]): Self = this.set("cancel", js.Any.fromFunction1(value))
    @scala.inline
    def setCreate(value: Alt => Request[TestMatrix]): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: Accesstoken => Request[TestMatrix]): Self = this.set("get", js.Any.fromFunction1(value))
  }
  
}


package typings.fineUploader.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromiseOptions extends js.Object {
  /**
    * Register callbacks for success or failure.
    *
    * Invoked when the promise is fulfilled regardless of the result.
    * The promise instance that done is called on will pass any values into the provided callback.
    * Each call to done registers an additional set of callbacks
    *
    * @param Function callback : The function to call when the promise is fulfilled, successful or not.
    * @return PromiseOptions : An instance of a promise
    */
  def done(callback: js.Function): PromiseOptions = js.native
  /**
    * Call this on a promise to indicate failure.
    * The parameter values will depend on the situation.
    *
    * @param Object param : The value to pass to the promise's failure handler.
    * @return PromiseOptions : An instance of a promise
    */
  def failure(param: js.Any): PromiseOptions = js.native
  /**
    * Call this on a promise to indicate success.
    * The parameter values will depend on the situation.
    *
    * @param Object param : The value to pass to the promise's success handler.
    * @return PromiseOptions : An instance of a promise
    */
  def success(param: js.Any): PromiseOptions = js.native
  /**
    * Register callbacks from success and failure.
    *
    * The promise instance that then is called on will pass any values into the provided callbacks.
    * If success or failure have already occurred before these callbacks have been registered, then they will be called immediately after this call has been executed.
    * Each subsequent call to then registers an additional set of callbacks.
    *
    * @param Function successCallback : The function to call when the promise is successfully fulfilled
    * @param Function failureCallback : The function to call when the promise is unsuccessfully fulfilled
    * @return PromiseOptions : An instance of a promise
    */
  def `then`(successCallback: js.Function, failureCallback: js.Function): PromiseOptions = js.native
}

object PromiseOptions {
  @scala.inline
  def apply(
    done: js.Function => PromiseOptions,
    failure: js.Any => PromiseOptions,
    success: js.Any => PromiseOptions,
    `then`: (js.Function, js.Function) => PromiseOptions
  ): PromiseOptions = {
    val __obj = js.Dynamic.literal(done = js.Any.fromFunction1(done), failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction1(success))
    __obj.updateDynamic("then")(js.Any.fromFunction2(`then`))
    __obj.asInstanceOf[PromiseOptions]
  }
  @scala.inline
  implicit class PromiseOptionsOps[Self <: PromiseOptions] (val x: Self) extends AnyVal {
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
    def setDone(value: js.Function => PromiseOptions): Self = this.set("done", js.Any.fromFunction1(value))
    @scala.inline
    def setFailure(value: js.Any => PromiseOptions): Self = this.set("failure", js.Any.fromFunction1(value))
    @scala.inline
    def setSuccess(value: js.Any => PromiseOptions): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def setThen(value: (js.Function, js.Function) => PromiseOptions): Self = this.set("then", js.Any.fromFunction2(value))
  }
  
}


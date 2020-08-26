package typings.feathersjsFeathers.mod

import typings.feathersjsFeathers.feathersjsFeathersStrings.after
import typings.feathersjsFeathers.feathersjsFeathersStrings.before
import typings.feathersjsFeathers.feathersjsFeathersStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HookContext[T] extends js.Object {
  /**
    * A read only property that contains the Feathers application object. This can be used to
    * retrieve other services (via context.app.service('name')) or configuration values.
    */
  val app: Application[js.Object] = js.native
  /**
    * A writeable property containing the data of a create, update and patch service
    * method call.
    */
  var data: js.UndefOr[T] = js.native
  /**
    * A writeable, optional property and contains a "safe" version of the data that
    * should be sent to any client. If context.dispatch has not been set context.result
    * will be sent to the client instead.
    */
  var dispatch: js.UndefOr[T] = js.native
  /**
    * A writeable property with the error object that was thrown in a failed method call.
    * It is only available in error hooks.
    */
  var error: js.UndefOr[js.Any] = js.native
  /**
    * A writeable property and the id for a get, remove, update and patch service
    * method call. For remove, update and patch context.id can also be null when
    * modifying multiple entries. In all other cases it will be undefined.
    */
  var id: js.UndefOr[String | Double] = js.native
  /**
    * A read only property with the name of the service method (one of find, get,
    * create, update, patch, remove).
    */
  val method: String = js.native
  /**
    * A writeable property that contains the service method parameters (including
    * params.query).
    */
  var params: Params = js.native
  /**
    * A read only property and contains the service name (or path) without leading or
    * trailing slashes.
    */
  val path: String = js.native
  /**
    * A writeable property containing the result of the successful service method call.
    * It is only available in after hooks.
    *
    * `context.result` can also be set in
    *
    *  - A before hook to skip the actual service method (database) call
    *  - An error hook to swallow the error and return a result instead
    */
  var result: js.UndefOr[T] = js.native
  /**
    * A read only property and contains the service this hook currently runs on.
    */
  val service: Service[T] = js.native
  /**
    * A writeable, optional property that allows to override the standard HTTP status
    * code that should be returned.
    */
  var statusCode: js.UndefOr[Double] = js.native
  /**
    * A read only property with the hook type (one of before, after or error).
    */
  val `type`: before | after | error = js.native
}

object HookContext {
  @scala.inline
  def apply[T](
    app: Application[js.Object],
    method: String,
    params: Params,
    path: String,
    service: Service[T],
    `type`: before | after | error
  ): HookContext[T] = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HookContext[T]]
  }
  @scala.inline
  implicit class HookContextOps[Self <: HookContext[_], T] (val x: Self with HookContext[T]) extends AnyVal {
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
    def setApp(value: Application[js.Object]): Self = this.set("app", value.asInstanceOf[js.Any])
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def setParams(value: Params): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setService(value: Service[T]): Self = this.set("service", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: before | after | error): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: T): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDispatch(value: T): Self = this.set("dispatch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDispatch: Self = this.set("dispatch", js.undefined)
    @scala.inline
    def setError(value: js.Any): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setId(value: String | Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setResult(value: T): Self = this.set("result", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResult: Self = this.set("result", js.undefined)
    @scala.inline
    def setStatusCode(value: Double): Self = this.set("statusCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusCode: Self = this.set("statusCode", js.undefined)
  }
  
}


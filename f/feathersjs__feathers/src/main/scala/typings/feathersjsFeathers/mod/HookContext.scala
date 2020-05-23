package typings.feathersjsFeathers.mod

import typings.feathersjsFeathers.feathersjsFeathersStrings.after
import typings.feathersjsFeathers.feathersjsFeathersStrings.before
import typings.feathersjsFeathers.feathersjsFeathersStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HookContext[T] extends js.Object {
  /**
    * A read only property that contains the Feathers application object. This can be used to
    * retrieve other services (via context.app.service('name')) or configuration values.
    */
  val app: Application[js.Object]
  /**
    * A writeable property containing the data of a create, update and patch service
    * method call.
    */
  var data: js.UndefOr[T] = js.undefined
  /**
    * A writeable, optional property and contains a "safe" version of the data that
    * should be sent to any client. If context.dispatch has not been set context.result
    * will be sent to the client instead.
    */
  var dispatch: js.UndefOr[T] = js.undefined
  /**
    * A writeable property with the error object that was thrown in a failed method call.
    * It is only available in error hooks.
    */
  var error: js.UndefOr[js.Any] = js.undefined
  /**
    * A writeable property and the id for a get, remove, update and patch service
    * method call. For remove, update and patch context.id can also be null when
    * modifying multiple entries. In all other cases it will be undefined.
    */
  var id: js.UndefOr[String | Double] = js.undefined
  /**
    * A read only property with the name of the service method (one of find, get,
    * create, update, patch, remove).
    */
  val method: String
  /**
    * A writeable property that contains the service method parameters (including
    * params.query).
    */
  var params: Params
  /**
    * A read only property and contains the service name (or path) without leading or
    * trailing slashes.
    */
  val path: String
  /**
    * A writeable property containing the result of the successful service method call.
    * It is only available in after hooks.
    *
    * `context.result` can also be set in
    *
    *  - A before hook to skip the actual service method (database) call
    *  - An error hook to swallow the error and return a result instead
    */
  var result: js.UndefOr[T] = js.undefined
  /**
    * A read only property and contains the service this hook currently runs on.
    */
  val service: Service[T]
  /**
    * A writeable, optional property that allows to override the standard HTTP status
    * code that should be returned.
    */
  var statusCode: js.UndefOr[Double] = js.undefined
  /**
    * A read only property with the hook type (one of before, after or error).
    */
  val `type`: before | after | error
}

object HookContext {
  @scala.inline
  def apply[T](
    app: Application[js.Object],
    method: String,
    params: Params,
    path: String,
    service: Service[T],
    `type`: before | after | error,
    data: T = null,
    dispatch: T = null,
    error: js.Any = null,
    id: String | Double = null,
    result: T = null,
    statusCode: js.UndefOr[Double] = js.undefined
  ): HookContext[T] = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dispatch != null) __obj.updateDynamic("dispatch")(dispatch.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    if (!js.isUndefined(statusCode)) __obj.updateDynamic("statusCode")(statusCode.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[HookContext[T]]
  }
}


package typings
package atFeathersjsFeathersLib.atFeathersjsFeathersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HookContext[T] extends js.Object {
  /**
    * A read only property that contains the Feathers application object. This can be used to
    * retrieve other services (via context.app.service('name')) or configuration values.
    */
  val app: Application[_]
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
  var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
    * A read only property with the name of the service method (one of find, get,
    * create, update, patch, remove).
    */
  val method: java.lang.String
  /**
    * A writeable property that contains the service method parameters (including
    * params.query).
    */
  var params: Params
  /**
    * A read only property and contains the service name (or path) without leading or
    * trailing slashes.
    */
  val path: java.lang.String
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
  var statusCode: js.UndefOr[scala.Double] = js.undefined
  /**
    * A read only property with the hook type (one of before, after or error).
    */
  val `type`: atFeathersjsFeathersLib.atFeathersjsFeathersLibStrings.before | atFeathersjsFeathersLib.atFeathersjsFeathersLibStrings.after | atFeathersjsFeathersLib.atFeathersjsFeathersLibStrings.error
}

object HookContext {
  @scala.inline
  def apply[T](
    app: Application[_],
    method: java.lang.String,
    params: Params,
    path: java.lang.String,
    service: Service[T],
    `type`: atFeathersjsFeathersLib.atFeathersjsFeathersLibStrings.before | atFeathersjsFeathersLib.atFeathersjsFeathersLibStrings.after | atFeathersjsFeathersLib.atFeathersjsFeathersLibStrings.error,
    data: T = null,
    dispatch: T = null,
    error: js.Any = null,
    id: java.lang.String | scala.Double = null,
    result: T = null,
    statusCode: scala.Int | scala.Double = null
  ): HookContext[T] = {
    val __obj = js.Dynamic.literal(app = app, method = method, params = params, path = path, service = service)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dispatch != null) __obj.updateDynamic("dispatch")(dispatch.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[HookContext[T]]
  }
}


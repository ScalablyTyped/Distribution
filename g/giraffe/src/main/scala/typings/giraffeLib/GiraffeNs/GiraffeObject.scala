package typings
package giraffeLib.GiraffeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GiraffeObject extends js.Object {
  var afterDispose: js.UndefOr[js.Function0[js.Any]] = js.undefined
  var afterInitialize: js.UndefOr[js.Function0[js.Any]] = js.undefined
  var app: App
  var appEvents: js.UndefOr[StringMap] = js.undefined
  var beforeDispose: js.UndefOr[js.Function0[js.Any]] = js.undefined
  var beforeInitialize: js.UndefOr[js.Function0[js.Any]] = js.undefined
  var dataEvents: js.UndefOr[StringMap] = js.undefined
  var defaultOptions: js.UndefOr[DefaultOptions] = js.undefined
  var dispose: js.UndefOr[js.Function0[js.Any]] = js.undefined
  var initialize: js.UndefOr[js.Function0[js.Any]] = js.undefined
}

object GiraffeObject {
  @scala.inline
  def apply(
    app: App,
    afterDispose: js.Function0[js.Any] = null,
    afterInitialize: js.Function0[js.Any] = null,
    appEvents: StringMap = null,
    beforeDispose: js.Function0[js.Any] = null,
    beforeInitialize: js.Function0[js.Any] = null,
    dataEvents: StringMap = null,
    defaultOptions: DefaultOptions = null,
    dispose: js.Function0[js.Any] = null,
    initialize: js.Function0[js.Any] = null
  ): GiraffeObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("app")(app)
    if (afterDispose != null) __obj.updateDynamic("afterDispose")(afterDispose)
    if (afterInitialize != null) __obj.updateDynamic("afterInitialize")(afterInitialize)
    if (appEvents != null) __obj.updateDynamic("appEvents")(appEvents)
    if (beforeDispose != null) __obj.updateDynamic("beforeDispose")(beforeDispose)
    if (beforeInitialize != null) __obj.updateDynamic("beforeInitialize")(beforeInitialize)
    if (dataEvents != null) __obj.updateDynamic("dataEvents")(dataEvents)
    if (defaultOptions != null) __obj.updateDynamic("defaultOptions")(defaultOptions)
    if (dispose != null) __obj.updateDynamic("dispose")(dispose)
    if (initialize != null) __obj.updateDynamic("initialize")(initialize)
    __obj.asInstanceOf[GiraffeObject]
  }
}


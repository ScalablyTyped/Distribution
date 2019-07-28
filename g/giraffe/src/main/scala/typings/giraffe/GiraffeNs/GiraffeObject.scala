package typings.giraffe.GiraffeNs

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
    afterDispose: () => js.Any = null,
    afterInitialize: () => js.Any = null,
    appEvents: StringMap = null,
    beforeDispose: () => js.Any = null,
    beforeInitialize: () => js.Any = null,
    dataEvents: StringMap = null,
    defaultOptions: DefaultOptions = null,
    dispose: () => js.Any = null,
    initialize: () => js.Any = null
  ): GiraffeObject = {
    val __obj = js.Dynamic.literal(app = app)
    if (afterDispose != null) __obj.updateDynamic("afterDispose")(js.Any.fromFunction0(afterDispose))
    if (afterInitialize != null) __obj.updateDynamic("afterInitialize")(js.Any.fromFunction0(afterInitialize))
    if (appEvents != null) __obj.updateDynamic("appEvents")(appEvents)
    if (beforeDispose != null) __obj.updateDynamic("beforeDispose")(js.Any.fromFunction0(beforeDispose))
    if (beforeInitialize != null) __obj.updateDynamic("beforeInitialize")(js.Any.fromFunction0(beforeInitialize))
    if (dataEvents != null) __obj.updateDynamic("dataEvents")(dataEvents)
    if (defaultOptions != null) __obj.updateDynamic("defaultOptions")(defaultOptions)
    if (dispose != null) __obj.updateDynamic("dispose")(js.Any.fromFunction0(dispose))
    if (initialize != null) __obj.updateDynamic("initialize")(js.Any.fromFunction0(initialize))
    __obj.asInstanceOf[GiraffeObject]
  }
}


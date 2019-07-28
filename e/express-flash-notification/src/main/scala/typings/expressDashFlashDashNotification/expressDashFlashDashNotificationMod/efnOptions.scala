package typings.expressDashFlashDashNotification.expressDashFlashDashNotificationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait efnOptions extends js.Object {
  var afterAllRender: js.UndefOr[
    js.Function2[
      /* htmlFragments */ js.Array[String], 
      /* callback */ js.Function2[/* err */ js.Any, /* html */ String, Unit], 
      Unit
    ]
  ] = js.undefined
  var beforeSingleRender: js.UndefOr[
    js.Function2[
      /* item */ js.Any, 
      /* callback */ js.Function2[/* err */ js.Any, /* item */ js.Any, Unit], 
      Unit
    ]
  ] = js.undefined
  var localsName: js.UndefOr[String] = js.undefined
  var sessionName: js.UndefOr[String] = js.undefined
  var utilityName: js.UndefOr[String] = js.undefined
  var viewName: js.UndefOr[String] = js.undefined
}

object efnOptions {
  @scala.inline
  def apply(
    afterAllRender: (/* htmlFragments */ js.Array[String], /* callback */ js.Function2[/* err */ js.Any, /* html */ String, Unit]) => Unit = null,
    beforeSingleRender: (/* item */ js.Any, /* callback */ js.Function2[/* err */ js.Any, /* item */ js.Any, Unit]) => Unit = null,
    localsName: String = null,
    sessionName: String = null,
    utilityName: String = null,
    viewName: String = null
  ): efnOptions = {
    val __obj = js.Dynamic.literal()
    if (afterAllRender != null) __obj.updateDynamic("afterAllRender")(js.Any.fromFunction2(afterAllRender))
    if (beforeSingleRender != null) __obj.updateDynamic("beforeSingleRender")(js.Any.fromFunction2(beforeSingleRender))
    if (localsName != null) __obj.updateDynamic("localsName")(localsName)
    if (sessionName != null) __obj.updateDynamic("sessionName")(sessionName)
    if (utilityName != null) __obj.updateDynamic("utilityName")(utilityName)
    if (viewName != null) __obj.updateDynamic("viewName")(viewName)
    __obj.asInstanceOf[efnOptions]
  }
}


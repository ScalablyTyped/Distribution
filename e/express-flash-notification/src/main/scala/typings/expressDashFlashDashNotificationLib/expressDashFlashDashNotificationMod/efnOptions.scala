package typings
package expressDashFlashDashNotificationLib.expressDashFlashDashNotificationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait efnOptions extends js.Object {
  var afterAllRender: js.UndefOr[
    js.Function2[
      /* htmlFragments */ js.Array[java.lang.String], 
      /* callback */ js.Function2[/* err */ js.Any, /* html */ java.lang.String, scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
  var beforeSingleRender: js.UndefOr[
    js.Function2[
      /* item */ js.Any, 
      /* callback */ js.Function2[/* err */ js.Any, /* item */ js.Any, scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
  var localsName: js.UndefOr[java.lang.String] = js.undefined
  var sessionName: js.UndefOr[java.lang.String] = js.undefined
  var utilityName: js.UndefOr[java.lang.String] = js.undefined
  var viewName: js.UndefOr[java.lang.String] = js.undefined
}

object efnOptions {
  @scala.inline
  def apply(
    afterAllRender: (/* htmlFragments */ js.Array[java.lang.String], /* callback */ js.Function2[/* err */ js.Any, /* html */ java.lang.String, scala.Unit]) => scala.Unit = null,
    beforeSingleRender: (/* item */ js.Any, /* callback */ js.Function2[/* err */ js.Any, /* item */ js.Any, scala.Unit]) => scala.Unit = null,
    localsName: java.lang.String = null,
    sessionName: java.lang.String = null,
    utilityName: java.lang.String = null,
    viewName: java.lang.String = null
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


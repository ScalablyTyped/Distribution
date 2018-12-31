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


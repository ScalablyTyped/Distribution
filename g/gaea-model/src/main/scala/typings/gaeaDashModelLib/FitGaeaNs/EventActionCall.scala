package typings
package gaeaDashModelLib.FitGaeaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventActionCall extends js.Object {
  var functionName: js.UndefOr[java.lang.String] = js.undefined
}

object EventActionCall {
  @scala.inline
  def apply(functionName: java.lang.String = null): EventActionCall = {
    val __obj = js.Dynamic.literal()
    if (functionName != null) __obj.updateDynamic("functionName")(functionName)
    __obj.asInstanceOf[EventActionCall]
  }
}


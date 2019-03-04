package typings
package gaeaDashModelLib.FitGaeaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventTriggerCondition extends js.Object {
  var name: java.lang.String
  // 是否由自己的生命周期触发
  var selfCallback: js.UndefOr[scala.Boolean] = js.undefined
  // 触发类型
  var `type`: java.lang.String
}

object EventTriggerCondition {
  @scala.inline
  def apply(
    name: java.lang.String,
    `type`: java.lang.String,
    selfCallback: js.UndefOr[scala.Boolean] = js.undefined
  ): EventTriggerCondition = {
    val __obj = js.Dynamic.literal(name = name)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(selfCallback)) __obj.updateDynamic("selfCallback")(selfCallback)
    __obj.asInstanceOf[EventTriggerCondition]
  }
}


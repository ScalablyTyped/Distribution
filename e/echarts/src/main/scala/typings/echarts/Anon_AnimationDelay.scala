package typings.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnimationDelay extends js.Object {
  /**
    * Specify the delay time before animation start.
    * Callback function can be used, where different delay time
    * can be used on different element.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.pictorialBar.animationEasingUpdate)
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.pictorialBar.animationEasingUpdate)
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.animationEasingUpdate.animationDelay
    */
  var animationDelay: js.UndefOr[js.Function | Double] = js.undefined
  /**
    * Specify the delay time before update animation.
    * Callback function can be used, where different delay time
    * can be used on different element.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.pictorialBar.animationEasingUpdate)
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.pictorialBar.animationEasingUpdate)
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-pictorialBar.animationEasingUpdate.animationDelayUpdate
    */
  var animationDelayUpdate: js.UndefOr[js.Function | Double] = js.undefined
}

object Anon_AnimationDelay {
  @scala.inline
  def apply(animationDelay: js.Function | Double = null, animationDelayUpdate: js.Function | Double = null): Anon_AnimationDelay = {
    val __obj = js.Dynamic.literal()
    if (animationDelay != null) __obj.updateDynamic("animationDelay")(animationDelay.asInstanceOf[js.Any])
    if (animationDelayUpdate != null) __obj.updateDynamic("animationDelayUpdate")(animationDelayUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AnimationDelay]
  }
}


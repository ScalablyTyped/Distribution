package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Callbacks extends js.Object {
  /** Invoked on every step of animation */
  var onChange: js.UndefOr[js.Function] = js.undefined
  /** Invoked on completion */
  var onComplete: js.UndefOr[js.Function] = js.undefined
}

object Callbacks {
  @scala.inline
  def apply(onChange: js.Function = null, onComplete: js.Function = null): Callbacks = {
    val __obj = js.Dynamic.literal()
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (onComplete != null) __obj.updateDynamic("onComplete")(onComplete)
    __obj.asInstanceOf[Callbacks]
  }
}


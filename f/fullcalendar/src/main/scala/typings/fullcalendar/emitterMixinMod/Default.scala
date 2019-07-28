package typings.fullcalendar.emitterMixinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/EmitterMixin", "Default")
@js.native
class Default ()
  extends typings.fullcalendar.mixinMod.default
     with EmitterInterface {
  def _prepareIntercept(handler: js.Any): js.Function2[/* ev */ js.Any, /* extra */ js.Any, _] = js.native
  /* CompleteClass */
  override def hasHandlers(`type`: js.Any): js.Any = js.native
  /* CompleteClass */
  override def off(types: js.Any, handler: js.Any): js.Any = js.native
  /* CompleteClass */
  override def on(types: js.Any, handler: js.Any): js.Any = js.native
  /* CompleteClass */
  override def one(types: js.Any, handler: js.Any): js.Any = js.native
  /* CompleteClass */
  override def trigger(types: js.Any, args: js.Any*): js.Any = js.native
  /* CompleteClass */
  override def triggerWith(types: js.Any, context: js.Any, args: js.Any): js.Any = js.native
}

@JSImport("fullcalendar/EmitterMixin", JSImport.Default)
@js.native
class default () extends Default


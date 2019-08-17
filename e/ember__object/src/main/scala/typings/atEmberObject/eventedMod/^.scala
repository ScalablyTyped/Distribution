package typings.atEmberObject.eventedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ember/object/evented", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val default: typings.atEmberObject.mixinMod.default[Evented, typings.atEmberObject.atEmberObjectMod.default] = js.native
  def on(eventNames: String, func: js.Function1[/* repeated */ js.Any, Unit]): js.Function1[/* repeated */ js.Any, Unit] = js.native
}


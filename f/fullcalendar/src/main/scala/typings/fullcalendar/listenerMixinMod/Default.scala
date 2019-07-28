package typings.fullcalendar.listenerMixinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/ListenerMixin", "Default")
@js.native
class Default ()
  extends typings.fullcalendar.mixinMod.default
     with ListenerInterface {
  var listenerId: js.Any = js.native
  def getListenerNamespace(): String = js.native
}

@JSImport("fullcalendar/ListenerMixin", JSImport.Default)
@js.native
class default () extends Default


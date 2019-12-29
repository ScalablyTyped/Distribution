package typings.fullcalendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/ListenerMixin", JSImport.Namespace)
@js.native
object listenerMixinMod extends js.Object {
  @js.native
  class Default ()
    extends typings.fullcalendar.mixinMod.default
       with ListenerInterface {
    var listenerId: js.Any = js.native
    def getListenerNamespace(): String = js.native
  }
  
  @js.native
  trait ListenerInterface extends js.Object {
    def listenTo(other: js.Any, arg: js.Any): js.Any = js.native
    def listenTo(other: js.Any, arg: js.Any, callback: js.Any): js.Any = js.native
    def stopListeningTo(other: js.Any): js.Any = js.native
    def stopListeningTo(other: js.Any, eventName: js.Any): js.Any = js.native
  }
  
  @js.native
  class default () extends Default
  
}


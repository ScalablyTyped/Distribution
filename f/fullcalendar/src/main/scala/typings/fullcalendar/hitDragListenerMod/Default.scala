package typings.fullcalendar.hitDragListenerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/HitDragListener", "Default")
@js.native
class Default protected ()
  extends typings.fullcalendar.dragListenerMod.default {
  def this(component: js.Any, options: js.Any) = this()
  var component: js.Any = js.native
  var coordAdjust: js.Any = js.native
  var hit: js.Any = js.native
  var origHit: js.Any = js.native
  def handleHitDone(): Unit = js.native
  def handleHitOut(): Unit = js.native
  def handleHitOver(hit: js.Any): Unit = js.native
  def queryHit(left: js.Any, top: js.Any): js.Any = js.native
}

@JSImport("fullcalendar/HitDragListener", JSImport.Default)
@js.native
class default protected () extends Default {
  def this(component: js.Any, options: js.Any) = this()
}


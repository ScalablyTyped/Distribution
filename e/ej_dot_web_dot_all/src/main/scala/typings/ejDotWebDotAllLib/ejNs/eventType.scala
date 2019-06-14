package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait eventType extends js.Object

@JSGlobal("ej.eventType")
@js.native
object eventType extends js.Object {
  @js.native
  sealed trait click
    extends ejDotWebDotAllLib.ejNs.eventType
  
  @js.native
  sealed trait mouseDown
    extends ejDotWebDotAllLib.ejNs.eventType
  
  @js.native
  sealed trait mouseLeave
    extends ejDotWebDotAllLib.ejNs.eventType
  
  @js.native
  sealed trait mouseMove
    extends ejDotWebDotAllLib.ejNs.eventType
  
  @js.native
  sealed trait mouseUp
    extends ejDotWebDotAllLib.ejNs.eventType
  
  /* 0 */ val click: click with scala.Double = js.native
  /* 1 */ val mouseDown: mouseDown with scala.Double = js.native
  /* 2 */ val mouseLeave: mouseLeave with scala.Double = js.native
  /* 3 */ val mouseMove: mouseMove with scala.Double = js.native
  /* 4 */ val mouseUp: mouseUp with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.eventType with scala.Double] = js.native
}


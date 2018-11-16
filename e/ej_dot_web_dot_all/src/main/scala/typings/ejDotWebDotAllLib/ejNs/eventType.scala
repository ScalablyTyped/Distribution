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
  
  val click: click with java.lang.String = js.native
  val mouseDown: mouseDown with java.lang.String = js.native
  val mouseLeave: mouseLeave with java.lang.String = js.native
  val mouseMove: mouseMove with java.lang.String = js.native
  val mouseUp: mouseUp with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.eventType with java.lang.String] = js.native
}


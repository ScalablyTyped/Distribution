package typings.ejDotWebDotAll.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait eventType extends js.Object

@JSGlobal("ej.eventType")
@js.native
object eventType extends js.Object {
  @js.native
  sealed trait click extends eventType
  
  @js.native
  sealed trait mouseDown extends eventType
  
  @js.native
  sealed trait mouseLeave extends eventType
  
  @js.native
  sealed trait mouseMove extends eventType
  
  @js.native
  sealed trait mouseUp extends eventType
  
  /* 0 */ val click: typings.ejDotWebDotAll.ejNs.eventType.click with Double = js.native
  /* 1 */ val mouseDown: typings.ejDotWebDotAll.ejNs.eventType.mouseDown with Double = js.native
  /* 2 */ val mouseLeave: typings.ejDotWebDotAll.ejNs.eventType.mouseLeave with Double = js.native
  /* 3 */ val mouseMove: typings.ejDotWebDotAll.ejNs.eventType.mouseMove with Double = js.native
  /* 4 */ val mouseUp: typings.ejDotWebDotAll.ejNs.eventType.mouseUp with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[eventType with Double] = js.native
}


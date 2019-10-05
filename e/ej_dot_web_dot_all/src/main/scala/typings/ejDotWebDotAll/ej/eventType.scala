package typings.ejDotWebDotAll.ej

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
  
  /* 0 */ val click: typings.ejDotWebDotAll.ej.eventType.click with Double = js.native
  /* 1 */ val mouseDown: typings.ejDotWebDotAll.ej.eventType.mouseDown with Double = js.native
  /* 2 */ val mouseLeave: typings.ejDotWebDotAll.ej.eventType.mouseLeave with Double = js.native
  /* 3 */ val mouseMove: typings.ejDotWebDotAll.ej.eventType.mouseMove with Double = js.native
  /* 4 */ val mouseUp: typings.ejDotWebDotAll.ej.eventType.mouseUp with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[eventType with Double] = js.native
}


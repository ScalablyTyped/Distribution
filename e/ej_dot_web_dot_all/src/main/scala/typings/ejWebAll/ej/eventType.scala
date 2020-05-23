package typings.ejWebAll.ej

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
  
}


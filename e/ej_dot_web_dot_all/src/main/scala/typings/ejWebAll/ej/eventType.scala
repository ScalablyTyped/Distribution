package typings.ejWebAll.ej

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[eventType with Double] = js.native
  /* 0 */ @js.native
  object click extends TopLevel[click with Double]
  
  /* 1 */ @js.native
  object mouseDown extends TopLevel[mouseDown with Double]
  
  /* 2 */ @js.native
  object mouseLeave extends TopLevel[mouseLeave with Double]
  
  /* 3 */ @js.native
  object mouseMove extends TopLevel[mouseMove with Double]
  
  /* 4 */ @js.native
  object mouseUp extends TopLevel[mouseUp with Double]
  
}


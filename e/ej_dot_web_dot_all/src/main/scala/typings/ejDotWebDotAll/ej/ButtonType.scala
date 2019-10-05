package typings.ejDotWebDotAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ButtonType extends js.Object

@JSGlobal("ej.ButtonType")
@js.native
object ButtonType extends js.Object {
  //Creates button with Built-in button type specified
  @js.native
  sealed trait Button extends ButtonType
  
  //Creates button with Built-in reset type specified
  @js.native
  sealed trait Reset extends ButtonType
  
  //Creates button with Built-in submit type specified
  @js.native
  sealed trait Submit extends ButtonType
  
  /* 0 */ val Button: typings.ejDotWebDotAll.ej.ButtonType.Button with Double = js.native
  /* 1 */ val Reset: typings.ejDotWebDotAll.ej.ButtonType.Reset with Double = js.native
  /* 2 */ val Submit: typings.ejDotWebDotAll.ej.ButtonType.Submit with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ButtonType with Double] = js.native
}


package typings.ejWebAll.ej

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ButtonType with Double] = js.native
  /* 0 */ @js.native
  object Button
    extends TopLevel[typings.ejWebAll.ej.ButtonType.Button with Double]
  
  /* 1 */ @js.native
  object Reset extends TopLevel[Reset with Double]
  
  /* 2 */ @js.native
  object Submit extends TopLevel[Submit with Double]
  
}


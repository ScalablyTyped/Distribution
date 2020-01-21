package typings.ejWebAll.ej

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ButtonSize extends js.Object

@JSGlobal("ej.ButtonSize")
@js.native
object ButtonSize extends js.Object {
  //Creates button with Built-in large size height, width specified
  @js.native
  sealed trait Large extends ButtonSize
  
  //Creates button with Built-in medium size height, width specified
  @js.native
  sealed trait Medium extends ButtonSize
  
  //Creates button with Built-in mini size height, width specified
  @js.native
  sealed trait Mini extends ButtonSize
  
  //Creates button with Built-in default size height, width specified
  @js.native
  sealed trait Normal extends ButtonSize
  
  //Creates button with Built-in small size height, width specified
  @js.native
  sealed trait Small extends ButtonSize
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ButtonSize with Double] = js.native
  /* 4 */ @js.native
  object Large extends TopLevel[Large with Double]
  
  /* 3 */ @js.native
  object Medium extends TopLevel[Medium with Double]
  
  /* 1 */ @js.native
  object Mini extends TopLevel[Mini with Double]
  
  /* 0 */ @js.native
  object Normal extends TopLevel[Normal with Double]
  
  /* 2 */ @js.native
  object Small extends TopLevel[Small with Double]
  
}


package typings.ejDotWebDotAll.ejNs

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
  
  /* 4 */ val Large: typings.ejDotWebDotAll.ejNs.ButtonSize.Large with Double = js.native
  /* 3 */ val Medium: typings.ejDotWebDotAll.ejNs.ButtonSize.Medium with Double = js.native
  /* 1 */ val Mini: typings.ejDotWebDotAll.ejNs.ButtonSize.Mini with Double = js.native
  /* 0 */ val Normal: typings.ejDotWebDotAll.ejNs.ButtonSize.Normal with Double = js.native
  /* 2 */ val Small: typings.ejDotWebDotAll.ejNs.ButtonSize.Small with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ButtonSize with Double] = js.native
}


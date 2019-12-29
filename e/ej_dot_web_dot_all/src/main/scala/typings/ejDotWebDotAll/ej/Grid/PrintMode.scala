package typings.ejDotWebDotAll.ej.Grid

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PrintMode extends js.Object

@JSGlobal("ej.Grid.PrintMode")
@js.native
object PrintMode extends js.Object {
  ///Prints all pages.
  @js.native
  sealed trait AllPages extends PrintMode
  
  ///Prints current page.
  @js.native
  sealed trait CurrentPage extends PrintMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PrintMode with Double] = js.native
  /* 0 */ @js.native
  object AllPages extends TopLevel[AllPages with Double]
  
  /* 1 */ @js.native
  object CurrentPage extends TopLevel[CurrentPage with Double]
  
}


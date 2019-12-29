package typings.ejDotWebDotAll.ej.TreeGrid

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PageSizeMode extends js.Object

@JSGlobal("ej.TreeGrid.PageSizeMode")
@js.native
object PageSizeMode extends js.Object {
  ///To count all the parent and child records.
  @js.native
  sealed trait All extends PageSizeMode
  
  ///To count the Zeroth level parent records.
  @js.native
  sealed trait Root extends PageSizeMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PageSizeMode with Double] = js.native
  /* 0 */ @js.native
  object All extends TopLevel[All with Double]
  
  /* 1 */ @js.native
  object Root extends TopLevel[Root with Double]
  
}


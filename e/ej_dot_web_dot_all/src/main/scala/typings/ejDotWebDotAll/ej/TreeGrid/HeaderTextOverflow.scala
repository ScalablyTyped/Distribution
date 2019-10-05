package typings.ejDotWebDotAll.ej.TreeGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HeaderTextOverflow extends js.Object

@JSGlobal("ej.TreeGrid.HeaderTextOverflow")
@js.native
object HeaderTextOverflow extends js.Object {
  ///You can disable the word wrap
  @js.native
  sealed trait None extends HeaderTextOverflow
  
  ///You can wrap the header content
  @js.native
  sealed trait Wrap extends HeaderTextOverflow
  
  /* 0 */ val None: typings.ejDotWebDotAll.ej.TreeGrid.HeaderTextOverflow.None with Double = js.native
  /* 1 */ val Wrap: typings.ejDotWebDotAll.ej.TreeGrid.HeaderTextOverflow.Wrap with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HeaderTextOverflow with Double] = js.native
}


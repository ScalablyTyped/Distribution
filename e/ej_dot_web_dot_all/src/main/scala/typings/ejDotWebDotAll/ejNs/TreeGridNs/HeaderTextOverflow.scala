package typings.ejDotWebDotAll.ejNs.TreeGridNs

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
  
  /* 0 */ val None: typings.ejDotWebDotAll.ejNs.TreeGridNs.HeaderTextOverflow.None with Double = js.native
  /* 1 */ val Wrap: typings.ejDotWebDotAll.ejNs.TreeGridNs.HeaderTextOverflow.Wrap with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HeaderTextOverflow with Double] = js.native
}


package typings.ejDotWebDotAll.ej.TreeGrid

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HeaderTextOverflow with Double] = js.native
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 1 */ @js.native
  object Wrap extends TopLevel[Wrap with Double]
  
}


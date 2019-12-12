package typings.ejDotWebDotAll.ej

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.headerOption.row
import typings.ejDotWebDotAll.ej.headerOption.tHead
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait headerOption extends js.Object

@JSGlobal("ej.headerOption")
@js.native
object headerOption extends js.Object {
  @js.native
  sealed trait row extends headerOption
  
  @js.native
  sealed trait tHead extends headerOption
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[headerOption with Double] = js.native
  /* 0 */ @js.native
  object row extends TopLevel[row with Double]
  
  /* 1 */ @js.native
  object tHead extends TopLevel[tHead with Double]
  
}


package typings.ejDotWebDotAll.ej

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.Textmode.FullPath
import typings.ejDotWebDotAll.ej.Textmode.None
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Textmode extends js.Object

@JSGlobal("ej.Textmode")
@js.native
object Textmode extends js.Object {
  //When FullPath option is selected, the full path of the selected node is shown in the control.
  @js.native
  sealed trait FullPath extends Textmode
  
  //When TextMode property is set to none, only selected/checked node's text is presented.
  @js.native
  sealed trait None extends Textmode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Textmode with Double] = js.native
  /* 1 */ @js.native
  object FullPath extends TopLevel[FullPath with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
}


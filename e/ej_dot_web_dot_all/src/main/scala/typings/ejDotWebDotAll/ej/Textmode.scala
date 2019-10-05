package typings.ejDotWebDotAll.ej

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
  
  /* 1 */ val FullPath: typings.ejDotWebDotAll.ej.Textmode.FullPath with Double = js.native
  /* 0 */ val None: typings.ejDotWebDotAll.ej.Textmode.None with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Textmode with Double] = js.native
}


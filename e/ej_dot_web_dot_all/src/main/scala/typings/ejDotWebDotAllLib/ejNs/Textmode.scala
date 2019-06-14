package typings
package ejDotWebDotAllLib.ejNs

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
  sealed trait FullPath
    extends ejDotWebDotAllLib.ejNs.Textmode
  
  //When TextMode property is set to none, only selected/checked node's text is presented.
  @js.native
  sealed trait None
    extends ejDotWebDotAllLib.ejNs.Textmode
  
  /* 1 */ val FullPath: FullPath with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.Textmode with scala.Double] = js.native
}


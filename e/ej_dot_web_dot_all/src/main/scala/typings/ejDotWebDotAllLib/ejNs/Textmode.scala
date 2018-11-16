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
  
  val FullPath: FullPath with java.lang.String = js.native
  val None: None with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.Textmode with java.lang.String] = js.native
}


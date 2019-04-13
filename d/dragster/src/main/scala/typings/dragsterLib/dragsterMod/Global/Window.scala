package typings
package dragsterLib.dragsterMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Window extends js.Object {
  @JSName("Dragster")
  var Dragster_Original: dragsterLib.dragsterMod.DragsterStatic = js.native
  def Dragster(elem: stdLib.HTMLElement): dragsterLib.dragsterMod.Dragster = js.native
}


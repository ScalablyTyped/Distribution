package typings.dragster.dragsterMod.Global

import typings.dragster.dragsterMod.DragsterStatic
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Window extends js.Object {
  @JSName("Dragster")
  var Dragster_Original: DragsterStatic = js.native
  def Dragster(elem: HTMLElement): typings.dragster.dragsterMod.Dragster = js.native
}


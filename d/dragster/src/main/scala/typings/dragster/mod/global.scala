package typings.dragster.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  trait Window extends js.Object {
    @JSName("Dragster")
    var Dragster_Original: DragsterStatic = js.native
    def Dragster(elem: HTMLElement): typings.dragster.mod.Dragster = js.native
  }
  
}


package typings.dragster.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  trait Window extends js.Object {
    
    def Dragster(elem: HTMLElement): typings.dragster.mod.Dragster = js.native
    @JSName("Dragster")
    var Dragster_Original: DragsterStatic = js.native
  }
}

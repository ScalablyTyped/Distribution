package typings.ejWebAll.ej.Tab

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Position extends js.Object
@JSGlobal("ej.Tab.Position")
@js.native
object Position extends js.Object {
  
  ///Tab headers display to bottom position
  @js.native
  sealed trait Bottom extends Position
  
  ///Tab headers display to left position.
  @js.native
  sealed trait Left extends Position
  
  ///Tab headers display to right position.
  @js.native
  sealed trait Right extends Position
  
  ///Tab headers display to top position
  @js.native
  sealed trait Top extends Position
}

package typings.ejWebAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FilterBarMode extends js.Object
@JSGlobal("ej.Grid.FilterBarMode")
@js.native
object FilterBarMode extends js.Object {
  
  ///Initiate filter operation on typing the filter query.
  @js.native
  sealed trait Immediate extends FilterBarMode
  
  ///Initiate filter operation after Enter key is pressed.
  @js.native
  sealed trait OnEnter extends FilterBarMode
}

package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait KeyModifiers extends js.Object
@JSGlobal("ej.datavisualization.Diagram.KeyModifiers")
@js.native
object KeyModifiers extends js.Object {
  
  //The ALT key.
  @js.native
  sealed trait Alt extends KeyModifiers
  
  //The CTRL key.
  @js.native
  sealed trait Control extends KeyModifiers
  
  //No modifiers are pressed.
  @js.native
  sealed trait None extends KeyModifiers
  
  //The SHIFT key.
  @js.native
  sealed trait Shift extends KeyModifiers
}

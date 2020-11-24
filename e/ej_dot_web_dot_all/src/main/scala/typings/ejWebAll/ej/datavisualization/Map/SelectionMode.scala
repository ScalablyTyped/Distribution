package typings.ejWebAll.ej.datavisualization.Map

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SelectionMode extends js.Object
@JSGlobal("ej.datavisualization.Map.SelectionMode")
@js.native
object SelectionMode extends js.Object {
  
  //specifies the default position
  @js.native
  sealed trait Default extends SelectionMode
  
  //specifies the multiple position
  @js.native
  sealed trait Multiple extends SelectionMode
}

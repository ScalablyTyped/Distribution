package typings.ejWebAll.ej.datavisualization.Map

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LabelSize extends js.Object
@JSGlobal("ej.datavisualization.Map.LabelSize")
@js.native
object LabelSize extends js.Object {
  
  //specifies the default size
  @js.native
  sealed trait Default extends LabelSize
  
  //specifies the fixed size
  @js.native
  sealed trait Fixed extends LabelSize
}

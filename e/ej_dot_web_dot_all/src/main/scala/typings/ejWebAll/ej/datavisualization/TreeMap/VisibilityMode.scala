package typings.ejWebAll.ej.datavisualization.TreeMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VisibilityMode extends js.Object
@JSGlobal("ej.datavisualization.TreeMap.VisibilityMode")
@js.native
object VisibilityMode extends js.Object {
  
  //specifies the hide on exceeded length mode
  @js.native
  sealed trait Hideonexceededlength extends VisibilityMode
  
  //specifies the visible mode
  @js.native
  sealed trait Top extends VisibilityMode
}

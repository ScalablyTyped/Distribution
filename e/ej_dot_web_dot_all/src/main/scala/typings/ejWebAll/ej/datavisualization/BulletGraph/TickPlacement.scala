package typings.ejWebAll.ej.datavisualization.BulletGraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TickPlacement extends js.Object
@JSGlobal("ej.datavisualization.BulletGraph.TickPlacement")
@js.native
object TickPlacement extends js.Object {
  
  //string
  @js.native
  sealed trait Inside extends TickPlacement
  
  //string
  @js.native
  sealed trait Outside extends TickPlacement
}

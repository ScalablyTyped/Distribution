package typings.ejWebAll.ej.datavisualization.BulletGraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TextAnchor extends js.Object
@JSGlobal("ej.datavisualization.BulletGraph.TextAnchor")
@js.native
object TextAnchor extends js.Object {
  
  //string
  @js.native
  sealed trait End extends TextAnchor
  
  //string
  @js.native
  sealed trait Middle extends TextAnchor
  
  //string
  @js.native
  sealed trait Start extends TextAnchor
}

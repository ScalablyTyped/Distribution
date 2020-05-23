package typings.ejWebAll.ej.datavisualization.TreeMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait groupSelectionMode extends js.Object

@JSGlobal("ej.datavisualization.TreeMap.groupSelectionMode")
@js.native
object groupSelectionMode extends js.Object {
  //specifies the default mode
  @js.native
  sealed trait Default extends groupSelectionMode
  
  //specifies the multiple mode
  @js.native
  sealed trait Multiple extends groupSelectionMode
  
}


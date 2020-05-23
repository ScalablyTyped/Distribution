package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextAlign extends js.Object

@JSGlobal("ej.datavisualization.Diagram.TextAlign")
@js.native
object TextAlign extends js.Object {
  //Used to align text on center of node/connector
  @js.native
  sealed trait Center extends TextAlign
  
  //Used to align text on left side of node/connector
  @js.native
  sealed trait Left extends TextAlign
  
  //Used to align text on Right side of node/connector
  @js.native
  sealed trait Right extends TextAlign
  
}


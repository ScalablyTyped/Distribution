package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HorizontalAlignment extends js.Object

@JSGlobal("ej.datavisualization.Diagram.HorizontalAlignment")
@js.native
object HorizontalAlignment extends js.Object {
  //Used to align text horizontally on center of node/connector
  @js.native
  sealed trait Center extends HorizontalAlignment
  
  //Used to align text horizontally on left side of node/connector
  @js.native
  sealed trait Left extends HorizontalAlignment
  
  //Used to align text horizontally on right side of node/connector
  @js.native
  sealed trait Right extends HorizontalAlignment
  
}


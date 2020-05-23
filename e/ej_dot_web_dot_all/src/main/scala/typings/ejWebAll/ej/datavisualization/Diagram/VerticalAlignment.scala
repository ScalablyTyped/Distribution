package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VerticalAlignment extends js.Object

@JSGlobal("ej.datavisualization.Diagram.VerticalAlignment")
@js.native
object VerticalAlignment extends js.Object {
  //Used to align text Vertically on bottom of node/connector
  @js.native
  sealed trait Bottom extends VerticalAlignment
  
  //Used to align text Vertically on center of node/connector
  @js.native
  sealed trait Center extends VerticalAlignment
  
  //Used to align text Vertically on left side of node/connector
  @js.native
  sealed trait Top extends VerticalAlignment
  
}


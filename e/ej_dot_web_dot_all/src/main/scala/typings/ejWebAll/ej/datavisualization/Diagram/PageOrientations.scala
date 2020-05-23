package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PageOrientations extends js.Object

@JSGlobal("ej.datavisualization.Diagram.PageOrientations")
@js.native
object PageOrientations extends js.Object {
  //Used to set orientation as Landscape
  @js.native
  sealed trait Landscape extends PageOrientations
  
  //Used to set orientation as portrait
  @js.native
  sealed trait Portrait extends PageOrientations
  
}


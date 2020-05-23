package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FitMode extends js.Object

@JSGlobal("ej.datavisualization.Diagram.FitMode")
@js.native
object FitMode extends js.Object {
  //Used to fit the diagram content based on diagram height.
  @js.native
  sealed trait Height extends FitMode
  
  //Used to fit the diagram content based on page size.
  @js.native
  sealed trait Page extends FitMode
  
  //Used to fit the diagram content based on diagram width.
  @js.native
  sealed trait Width extends FitMode
  
}


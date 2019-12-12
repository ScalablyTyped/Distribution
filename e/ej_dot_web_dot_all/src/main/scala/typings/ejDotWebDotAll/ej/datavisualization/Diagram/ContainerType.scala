package typings.ejDotWebDotAll.ej.datavisualization.Diagram

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.ContainerType.Canvas
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.ContainerType.Stack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContainerType extends js.Object

@JSGlobal("ej.datavisualization.Diagram.ContainerType")
@js.native
object ContainerType extends js.Object {
  //Sets the container type as Canvas
  @js.native
  sealed trait Canvas extends ContainerType
  
  //Sets the container type as Stack
  @js.native
  sealed trait Stack extends ContainerType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContainerType with Double] = js.native
  /* 0 */ @js.native
  object Canvas extends TopLevel[Canvas with Double]
  
  /* 1 */ @js.native
  object Stack extends TopLevel[Stack with Double]
  
}


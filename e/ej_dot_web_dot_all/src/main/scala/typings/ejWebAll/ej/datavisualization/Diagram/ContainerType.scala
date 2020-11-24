package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}

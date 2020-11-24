package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ConnectorLineType extends js.Object
@JSGlobal("ej.datavisualization.Chart.ConnectorLineType")
@js.native
object ConnectorLineType extends js.Object {
  
  //string
  @js.native
  sealed trait Bezier extends ConnectorLineType
  
  //string
  @js.native
  sealed trait Line extends ConnectorLineType
}

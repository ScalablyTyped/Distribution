package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DrawType extends js.Object
@JSGlobal("ej.datavisualization.Chart.DrawType")
@js.native
object DrawType extends js.Object {
  
  //string
  @js.native
  sealed trait Area extends DrawType
  
  //string
  @js.native
  sealed trait Column extends DrawType
  
  //string
  @js.native
  sealed trait Line extends DrawType
}

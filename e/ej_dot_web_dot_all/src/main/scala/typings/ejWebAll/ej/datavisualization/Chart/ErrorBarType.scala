package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ErrorBarType extends js.Object
@JSGlobal("ej.datavisualization.Chart.ErrorBarType")
@js.native
object ErrorBarType extends js.Object {
  
  //string
  @js.native
  sealed trait FixedValue extends ErrorBarType
  
  //string
  @js.native
  sealed trait Percentage extends ErrorBarType
  
  //string
  @js.native
  sealed trait StandardDeviation extends ErrorBarType
  
  //string
  @js.native
  sealed trait StandardError extends ErrorBarType
}

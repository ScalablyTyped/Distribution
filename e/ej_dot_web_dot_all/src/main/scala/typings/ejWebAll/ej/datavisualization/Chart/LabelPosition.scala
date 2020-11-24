package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LabelPosition extends js.Object
@JSGlobal("ej.datavisualization.Chart.LabelPosition")
@js.native
object LabelPosition extends js.Object {
  
  //string
  @js.native
  sealed trait Inside extends LabelPosition
  
  //string
  @js.native
  sealed trait Outside extends LabelPosition
  
  //string
  @js.native
  sealed trait OutsideExtended extends LabelPosition
}

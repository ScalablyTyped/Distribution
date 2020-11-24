package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MultiLevelLabelsBorderType extends js.Object
@JSGlobal("ej.datavisualization.Chart.MultiLevelLabelsBorderType")
@js.native
object MultiLevelLabelsBorderType extends js.Object {
  
  //string
  @js.native
  sealed trait Brace extends MultiLevelLabelsBorderType
  
  //string
  @js.native
  sealed trait CurlyBrace extends MultiLevelLabelsBorderType
  
  //string
  @js.native
  sealed trait None extends MultiLevelLabelsBorderType
  
  //string
  @js.native
  sealed trait Rectangle extends MultiLevelLabelsBorderType
  
  //string
  @js.native
  sealed trait WithoutTopAndBottom extends MultiLevelLabelsBorderType
}

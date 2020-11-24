package typings.ejWebAll.ej.datavisualization.Sparkline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Type extends js.Object
@JSGlobal("ej.datavisualization.Sparkline.Type")
@js.native
object Type extends js.Object {
  
  //string
  @js.native
  sealed trait Area extends Type
  
  //string
  @js.native
  sealed trait Column extends Type
  
  //string
  @js.native
  sealed trait Line extends Type
  
  //string
  @js.native
  sealed trait Pie extends Type
  
  //string
  @js.native
  sealed trait WinLoss extends Type
}

package typings.ejWebAll.ej.datavisualization.HeatMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Effect extends js.Object
@JSGlobal("ej.datavisualization.HeatMap.Effect")
@js.native
object Effect extends js.Object {
  
  //Sets tooltip animation as Fade
  @js.native
  sealed trait Fade extends Effect
  
  //Sets tooltip animation as None
  @js.native
  sealed trait None extends Effect
  
  //Sets tooltip animation as Slide
  @js.native
  sealed trait Slide extends Effect
}

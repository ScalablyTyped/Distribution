package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CoordinateUnit extends js.Object
@JSGlobal("ej.datavisualization.Chart.CoordinateUnit")
@js.native
object CoordinateUnit extends js.Object {
  
  //string
  @js.native
  sealed trait None extends CoordinateUnit
  
  //string
  @js.native
  sealed trait Pixels extends CoordinateUnit
  
  //string
  @js.native
  sealed trait Points extends CoordinateUnit
}

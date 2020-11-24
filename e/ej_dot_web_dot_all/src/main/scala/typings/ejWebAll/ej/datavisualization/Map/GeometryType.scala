package typings.ejWebAll.ej.datavisualization.Map

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GeometryType extends js.Object
@JSGlobal("ej.datavisualization.Map.GeometryType")
@js.native
object GeometryType extends js.Object {
  
  //specifies the geographic view of map
  @js.native
  sealed trait Geographic extends GeometryType
  
  //specifies the normal land view of map
  @js.native
  sealed trait Normal extends GeometryType
}

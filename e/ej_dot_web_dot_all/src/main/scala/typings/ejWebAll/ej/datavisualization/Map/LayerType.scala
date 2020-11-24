package typings.ejWebAll.ej.datavisualization.Map

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LayerType extends js.Object
@JSGlobal("ej.datavisualization.Map.LayerType")
@js.native
object LayerType extends js.Object {
  
  //specifies the bing type
  @js.native
  sealed trait Bing extends LayerType
  
  //specifies the geometry type
  @js.native
  sealed trait Geometry extends LayerType
  
  //specifies the osm type
  @js.native
  sealed trait Osm extends LayerType
}

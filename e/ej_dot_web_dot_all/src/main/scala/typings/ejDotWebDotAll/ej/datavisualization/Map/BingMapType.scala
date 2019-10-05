package typings.ejDotWebDotAll.ej.datavisualization.Map

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BingMapType extends js.Object

@JSGlobal("ej.datavisualization.Map.BingMapType")
@js.native
object BingMapType extends js.Object {
  //specifies the aerial type
  @js.native
  sealed trait Aerial extends BingMapType
  
  //specifies the aerialwithlabel type
  @js.native
  sealed trait Aerialwithlabel extends BingMapType
  
  //specifies the road type
  @js.native
  sealed trait Road extends BingMapType
  
  /* 0 */ val Aerial: typings.ejDotWebDotAll.ej.datavisualization.Map.BingMapType.Aerial with Double = js.native
  /* 1 */ val Aerialwithlabel: typings.ejDotWebDotAll.ej.datavisualization.Map.BingMapType.Aerialwithlabel with Double = js.native
  /* 2 */ val Road: typings.ejDotWebDotAll.ej.datavisualization.Map.BingMapType.Road with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BingMapType with Double] = js.native
}


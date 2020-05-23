package typings.ejWebAll.ej.datavisualization.Map

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
  
}


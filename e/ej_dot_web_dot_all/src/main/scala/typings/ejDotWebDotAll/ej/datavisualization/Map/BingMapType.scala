package typings.ejDotWebDotAll.ej.datavisualization.Map

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.datavisualization.Map.BingMapType.Aerial
import typings.ejDotWebDotAll.ej.datavisualization.Map.BingMapType.Aerialwithlabel
import typings.ejDotWebDotAll.ej.datavisualization.Map.BingMapType.Road
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BingMapType with Double] = js.native
  /* 0 */ @js.native
  object Aerial extends TopLevel[Aerial with Double]
  
  /* 1 */ @js.native
  object Aerialwithlabel extends TopLevel[Aerialwithlabel with Double]
  
  /* 2 */ @js.native
  object Road extends TopLevel[Road with Double]
  
}


package typings.ejDotWebDotAll.ej.datavisualization.Map

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.datavisualization.Map.GeometryType.Geographic
import typings.ejDotWebDotAll.ej.datavisualization.Map.GeometryType.Normal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GeometryType with Double] = js.native
  /* 0 */ @js.native
  object Geographic extends TopLevel[Geographic with Double]
  
  /* 1 */ @js.native
  object Normal extends TopLevel[Normal with Double]
  
}


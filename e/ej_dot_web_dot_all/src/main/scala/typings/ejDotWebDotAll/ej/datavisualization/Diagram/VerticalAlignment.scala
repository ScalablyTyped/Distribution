package typings.ejDotWebDotAll.ej.datavisualization.Diagram

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.VerticalAlignment.Bottom
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.VerticalAlignment.Center
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.VerticalAlignment.Top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VerticalAlignment extends js.Object

@JSGlobal("ej.datavisualization.Diagram.VerticalAlignment")
@js.native
object VerticalAlignment extends js.Object {
  //Used to align text Vertically on bottom of node/connector
  @js.native
  sealed trait Bottom extends VerticalAlignment
  
  //Used to align text Vertically on center of node/connector
  @js.native
  sealed trait Center extends VerticalAlignment
  
  //Used to align text Vertically on left side of node/connector
  @js.native
  sealed trait Top extends VerticalAlignment
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VerticalAlignment with Double] = js.native
  /* 2 */ @js.native
  object Bottom extends TopLevel[Bottom with Double]
  
  /* 1 */ @js.native
  object Center extends TopLevel[Center with Double]
  
  /* 0 */ @js.native
  object Top extends TopLevel[Top with Double]
  
}


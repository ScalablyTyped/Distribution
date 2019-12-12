package typings.ejDotWebDotAll.ej.datavisualization.Diagram

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.TextAlign.Center
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.TextAlign.Left
import typings.ejDotWebDotAll.ej.datavisualization.Diagram.TextAlign.Right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextAlign extends js.Object

@JSGlobal("ej.datavisualization.Diagram.TextAlign")
@js.native
object TextAlign extends js.Object {
  //Used to align text on center of node/connector
  @js.native
  sealed trait Center
    extends typings.ejDotWebDotAll.ej.datavisualization.Diagram.TextAlign
  
  //Used to align text on left side of node/connector
  @js.native
  sealed trait Left
    extends typings.ejDotWebDotAll.ej.datavisualization.Diagram.TextAlign
  
  //Used to align text on Right side of node/connector
  @js.native
  sealed trait Right
    extends typings.ejDotWebDotAll.ej.datavisualization.Diagram.TextAlign
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.ejDotWebDotAll.ej.datavisualization.Diagram.TextAlign with Double] = js.native
  /* 1 */ @js.native
  object Center extends TopLevel[Center with Double]
  
  /* 0 */ @js.native
  object Left extends TopLevel[Left with Double]
  
  /* 2 */ @js.native
  object Right extends TopLevel[Right with Double]
  
}


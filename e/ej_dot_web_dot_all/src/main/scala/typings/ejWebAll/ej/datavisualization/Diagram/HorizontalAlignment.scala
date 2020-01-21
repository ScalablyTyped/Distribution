package typings.ejWebAll.ej.datavisualization.Diagram

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HorizontalAlignment extends js.Object

@JSGlobal("ej.datavisualization.Diagram.HorizontalAlignment")
@js.native
object HorizontalAlignment extends js.Object {
  //Used to align text horizontally on center of node/connector
  @js.native
  sealed trait Center extends HorizontalAlignment
  
  //Used to align text horizontally on left side of node/connector
  @js.native
  sealed trait Left extends HorizontalAlignment
  
  //Used to align text horizontally on right side of node/connector
  @js.native
  sealed trait Right extends HorizontalAlignment
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HorizontalAlignment with Double] = js.native
  /* 1 */ @js.native
  object Center extends TopLevel[Center with Double]
  
  /* 0 */ @js.native
  object Left extends TopLevel[Left with Double]
  
  /* 2 */ @js.native
  object Right extends TopLevel[Right with Double]
  
}


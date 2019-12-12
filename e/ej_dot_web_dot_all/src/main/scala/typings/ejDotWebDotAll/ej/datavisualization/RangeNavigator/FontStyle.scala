package typings.ejDotWebDotAll.ej.datavisualization.RangeNavigator

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.datavisualization.RangeNavigator.FontStyle.Bold
import typings.ejDotWebDotAll.ej.datavisualization.RangeNavigator.FontStyle.Italic
import typings.ejDotWebDotAll.ej.datavisualization.RangeNavigator.FontStyle.Normal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FontStyle extends js.Object

@JSGlobal("ej.datavisualization.RangeNavigator.FontStyle")
@js.native
object FontStyle extends js.Object {
  //string
  @js.native
  sealed trait Bold extends FontStyle
  
  //string
  @js.native
  sealed trait Italic extends FontStyle
  
  //string
  @js.native
  sealed trait Normal extends FontStyle
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FontStyle with Double] = js.native
  /* 1 */ @js.native
  object Bold extends TopLevel[Bold with Double]
  
  /* 2 */ @js.native
  object Italic extends TopLevel[Italic with Double]
  
  /* 0 */ @js.native
  object Normal extends TopLevel[Normal with Double]
  
}


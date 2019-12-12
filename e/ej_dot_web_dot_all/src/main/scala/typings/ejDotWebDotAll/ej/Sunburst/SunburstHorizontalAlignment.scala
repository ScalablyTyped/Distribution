package typings.ejDotWebDotAll.ej.Sunburst

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.Sunburst.SunburstHorizontalAlignment.Center
import typings.ejDotWebDotAll.ej.Sunburst.SunburstHorizontalAlignment.Left
import typings.ejDotWebDotAll.ej.Sunburst.SunburstHorizontalAlignment.Right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SunburstHorizontalAlignment extends js.Object

@JSGlobal("ej.Sunburst.SunburstHorizontalAlignment")
@js.native
object SunburstHorizontalAlignment extends js.Object {
  //string
  @js.native
  sealed trait Center extends SunburstHorizontalAlignment
  
  //string
  @js.native
  sealed trait Left extends SunburstHorizontalAlignment
  
  //string
  @js.native
  sealed trait Right extends SunburstHorizontalAlignment
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SunburstHorizontalAlignment with Double] = js.native
  /* 0 */ @js.native
  object Center extends TopLevel[Center with Double]
  
  /* 1 */ @js.native
  object Left extends TopLevel[Left with Double]
  
  /* 2 */ @js.native
  object Right extends TopLevel[Right with Double]
  
}


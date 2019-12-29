package typings.ejDotWebDotAll.ej.Sunburst

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SunburstAlignment extends js.Object

@JSGlobal("ej.Sunburst.SunburstAlignment")
@js.native
object SunburstAlignment extends js.Object {
  //string
  @js.native
  sealed trait Center extends SunburstAlignment
  
  //string
  @js.native
  sealed trait Far extends SunburstAlignment
  
  //string
  @js.native
  sealed trait Near extends SunburstAlignment
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SunburstAlignment with Double] = js.native
  /* 0 */ @js.native
  object Center extends TopLevel[Center with Double]
  
  /* 2 */ @js.native
  object Far extends TopLevel[Far with Double]
  
  /* 1 */ @js.native
  object Near extends TopLevel[Near with Double]
  
}


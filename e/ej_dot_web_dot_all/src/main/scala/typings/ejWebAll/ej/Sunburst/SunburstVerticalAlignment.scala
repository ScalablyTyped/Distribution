package typings.ejWebAll.ej.Sunburst

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SunburstVerticalAlignment extends js.Object

@JSGlobal("ej.Sunburst.SunburstVerticalAlignment")
@js.native
object SunburstVerticalAlignment extends js.Object {
  //string
  @js.native
  sealed trait Bottom extends SunburstVerticalAlignment
  
  //string
  @js.native
  sealed trait Middle extends SunburstVerticalAlignment
  
  //string
  @js.native
  sealed trait Top extends SunburstVerticalAlignment
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SunburstVerticalAlignment with Double] = js.native
  /* 1 */ @js.native
  object Bottom extends TopLevel[Bottom with Double]
  
  /* 2 */ @js.native
  object Middle extends TopLevel[Middle with Double]
  
  /* 0 */ @js.native
  object Top extends TopLevel[Top with Double]
  
}


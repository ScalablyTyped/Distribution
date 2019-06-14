package typings
package ejDotWebDotAllLib.ejNs.SunburstNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SunburstLabelOverflowMode extends js.Object

@JSGlobal("ej.Sunburst.SunburstLabelOverflowMode")
@js.native
object SunburstLabelOverflowMode extends js.Object {
  //string
  @js.native
  sealed trait Hide
    extends ejDotWebDotAllLib.ejNs.SunburstNs.SunburstLabelOverflowMode
  
  //string
  @js.native
  sealed trait None
    extends ejDotWebDotAllLib.ejNs.SunburstNs.SunburstLabelOverflowMode
  
  //string
  @js.native
  sealed trait Trim
    extends ejDotWebDotAllLib.ejNs.SunburstNs.SunburstLabelOverflowMode
  
  /* 1 */ val Hide: Hide with scala.Double = js.native
  /* 2 */ val None: None with scala.Double = js.native
  /* 0 */ val Trim: Trim with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.SunburstNs.SunburstLabelOverflowMode with scala.Double] = js.native
}


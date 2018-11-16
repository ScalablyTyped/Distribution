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
  
  val Hide: Hide with java.lang.String = js.native
  val None: None with java.lang.String = js.native
  val Trim: Trim with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.SunburstNs.SunburstLabelOverflowMode with java.lang.String
  ] = js.native
}


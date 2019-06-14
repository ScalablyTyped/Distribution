package typings
package ejDotWebDotAllLib.ejNs.TabNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HeightAdjustMode extends js.Object

@JSGlobal("ej.Tab.HeightAdjustMode")
@js.native
object HeightAdjustMode extends js.Object {
  ///string
  @js.native
  sealed trait Auto
    extends ejDotWebDotAllLib.ejNs.TabNs.HeightAdjustMode
  
  ///string
  @js.native
  sealed trait Content
    extends ejDotWebDotAllLib.ejNs.TabNs.HeightAdjustMode
  
  ///string
  @js.native
  sealed trait Fill
    extends ejDotWebDotAllLib.ejNs.TabNs.HeightAdjustMode
  
  ///string
  @js.native
  sealed trait None
    extends ejDotWebDotAllLib.ejNs.TabNs.HeightAdjustMode
  
  /* 2 */ val Auto: Auto with scala.Double = js.native
  /* 1 */ val Content: Content with scala.Double = js.native
  /* 3 */ val Fill: Fill with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.TabNs.HeightAdjustMode with scala.Double] = js.native
}


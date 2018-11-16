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
  
  val Auto: Auto with java.lang.String = js.native
  val Content: Content with java.lang.String = js.native
  val Fill: Fill with java.lang.String = js.native
  val None: None with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.TabNs.HeightAdjustMode with java.lang.String] = js.native
}


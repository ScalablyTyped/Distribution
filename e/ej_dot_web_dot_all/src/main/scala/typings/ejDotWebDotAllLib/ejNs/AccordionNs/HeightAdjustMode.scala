package typings
package ejDotWebDotAllLib.ejNs.AccordionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HeightAdjustMode extends js.Object

@JSGlobal("ej.Accordion.HeightAdjustMode")
@js.native
object HeightAdjustMode extends js.Object {
  ///Height set to the largest content in the panel
  @js.native
  sealed trait Auto
    extends ejDotWebDotAllLib.ejNs.AccordionNs.HeightAdjustMode
  
  ///Height fit to the content in the panel
  @js.native
  sealed trait Content
    extends ejDotWebDotAllLib.ejNs.AccordionNs.HeightAdjustMode
  
  ///Height filled to the content of the panel
  @js.native
  sealed trait Fill
    extends ejDotWebDotAllLib.ejNs.AccordionNs.HeightAdjustMode
  
  val Auto: Auto with java.lang.String = js.native
  val Content: Content with java.lang.String = js.native
  val Fill: Fill with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.AccordionNs.HeightAdjustMode with java.lang.String] = js.native
}


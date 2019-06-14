package typings
package ejDotWebDotAllLib.ejNs.sliderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait sliderType extends js.Object

@JSGlobal("ej.slider.sliderType")
@js.native
object sliderType extends js.Object {
  //Shows default slider
  @js.native
  sealed trait Default
    extends ejDotWebDotAllLib.ejNs.sliderNs.sliderType
  
  //Shows minRange slider
  @js.native
  sealed trait MinRange
    extends ejDotWebDotAllLib.ejNs.sliderNs.sliderType
  
  //Shows Range slider
  @js.native
  sealed trait Range
    extends ejDotWebDotAllLib.ejNs.sliderNs.sliderType
  
  /* 0 */ val Default: Default with scala.Double = js.native
  /* 1 */ val MinRange: MinRange with scala.Double = js.native
  /* 2 */ val Range: Range with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.sliderNs.sliderType with scala.Double] = js.native
}


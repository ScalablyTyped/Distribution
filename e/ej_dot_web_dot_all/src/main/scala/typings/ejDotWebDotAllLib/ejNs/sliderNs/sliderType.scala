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
  
  val Default: Default with java.lang.String = js.native
  val MinRange: MinRange with java.lang.String = js.native
  val Range: Range with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.sliderNs.sliderType with java.lang.String] = js.native
}


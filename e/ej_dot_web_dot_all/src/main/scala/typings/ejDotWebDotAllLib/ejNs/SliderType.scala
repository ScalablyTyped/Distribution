package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SliderType extends js.Object

@JSGlobal("ej.SliderType")
@js.native
object SliderType extends js.Object {
  @js.native
  sealed trait Default
    extends ejDotWebDotAllLib.ejNs.SliderType
  
  @js.native
  sealed trait MinRange
    extends ejDotWebDotAllLib.ejNs.SliderType
  
  @js.native
  sealed trait Range
    extends ejDotWebDotAllLib.ejNs.SliderType
  
  /* 0 */ val Default: Default with scala.Double = js.native
  /* 1 */ val MinRange: MinRange with scala.Double = js.native
  /* 2 */ val Range: Range with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.SliderType with scala.Double] = js.native
}


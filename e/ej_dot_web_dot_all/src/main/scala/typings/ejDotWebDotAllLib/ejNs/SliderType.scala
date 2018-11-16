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
  
  val Default: Default with java.lang.String = js.native
  val MinRange: MinRange with java.lang.String = js.native
  val Range: Range with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.SliderType with java.lang.String] = js.native
}


package typings.ejDotWebDotAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SliderType extends js.Object

@JSGlobal("ej.SliderType")
@js.native
object SliderType extends js.Object {
  @js.native
  sealed trait Default extends SliderType
  
  @js.native
  sealed trait MinRange extends SliderType
  
  @js.native
  sealed trait Range extends SliderType
  
  /* 0 */ val Default: typings.ejDotWebDotAll.ej.SliderType.Default with Double = js.native
  /* 1 */ val MinRange: typings.ejDotWebDotAll.ej.SliderType.MinRange with Double = js.native
  /* 2 */ val Range: typings.ejDotWebDotAll.ej.SliderType.Range with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SliderType with Double] = js.native
}


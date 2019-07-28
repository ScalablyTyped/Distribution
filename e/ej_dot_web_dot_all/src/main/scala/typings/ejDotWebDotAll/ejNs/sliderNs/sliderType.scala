package typings.ejDotWebDotAll.ejNs.sliderNs

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
  sealed trait Default extends sliderType
  
  //Shows minRange slider
  @js.native
  sealed trait MinRange extends sliderType
  
  //Shows Range slider
  @js.native
  sealed trait Range extends sliderType
  
  /* 0 */ val Default: typings.ejDotWebDotAll.ejNs.sliderNs.sliderType.Default with Double = js.native
  /* 1 */ val MinRange: typings.ejDotWebDotAll.ejNs.sliderNs.sliderType.MinRange with Double = js.native
  /* 2 */ val Range: typings.ejDotWebDotAll.ejNs.sliderNs.sliderType.Range with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[sliderType with Double] = js.native
}


package typings.ejDotWebDotAll.ej

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.SliderType.Default
import typings.ejDotWebDotAll.ej.SliderType.MinRange
import typings.ejDotWebDotAll.ej.SliderType.Range
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SliderType with Double] = js.native
  /* 0 */ @js.native
  object Default extends TopLevel[Default with Double]
  
  /* 1 */ @js.native
  object MinRange extends TopLevel[MinRange with Double]
  
  /* 2 */ @js.native
  object Range extends TopLevel[Range with Double]
  
}


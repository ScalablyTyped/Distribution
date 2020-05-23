package typings.ejWebAll.ej

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
  
}


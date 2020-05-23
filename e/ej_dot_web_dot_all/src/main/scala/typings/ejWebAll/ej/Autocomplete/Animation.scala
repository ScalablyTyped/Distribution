package typings.ejWebAll.ej.Autocomplete

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Animation extends js.Object

@JSGlobal("ej.Autocomplete.Animation")
@js.native
object Animation extends js.Object {
  ///Supports to animation type with fade type only.
  @js.native
  sealed trait Fade extends Animation
  
  ///Supports to animation type with none type only.
  @js.native
  sealed trait None extends Animation
  
  ///Supports to animation type with slide type only.
  @js.native
  sealed trait Slide extends Animation
  
}


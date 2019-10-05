package typings.ejDotWebDotAll.ej.Autocomplete

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
  sealed trait Fade
    extends typings.ejDotWebDotAll.ej.Autocomplete.Animation
  
  ///Supports to animation type with none type only.
  @js.native
  sealed trait None
    extends typings.ejDotWebDotAll.ej.Autocomplete.Animation
  
  ///Supports to animation type with slide type only.
  @js.native
  sealed trait Slide
    extends typings.ejDotWebDotAll.ej.Autocomplete.Animation
  
  /* 2 */ val Fade: typings.ejDotWebDotAll.ej.Autocomplete.Animation.Fade with Double = js.native
  /* 0 */ val None: typings.ejDotWebDotAll.ej.Autocomplete.Animation.None with Double = js.native
  /* 1 */ val Slide: typings.ejDotWebDotAll.ej.Autocomplete.Animation.Slide with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.ejDotWebDotAll.ej.Autocomplete.Animation with Double] = js.native
}


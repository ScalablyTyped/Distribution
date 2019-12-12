package typings.ejDotWebDotAll.ej.Autocomplete

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.Autocomplete.Animation.Fade
import typings.ejDotWebDotAll.ej.Autocomplete.Animation.None
import typings.ejDotWebDotAll.ej.Autocomplete.Animation.Slide
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.ejDotWebDotAll.ej.Autocomplete.Animation with Double] = js.native
  /* 2 */ @js.native
  object Fade extends TopLevel[Fade with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 1 */ @js.native
  object Slide extends TopLevel[Slide with Double]
  
}


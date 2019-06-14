package typings
package ejDotWebDotAllLib.ejNs.AutocompleteNs

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
    extends ejDotWebDotAllLib.ejNs.AutocompleteNs.Animation
  
  ///Supports to animation type with none type only.
  @js.native
  sealed trait None
    extends ejDotWebDotAllLib.ejNs.AutocompleteNs.Animation
  
  ///Supports to animation type with slide type only.
  @js.native
  sealed trait Slide
    extends ejDotWebDotAllLib.ejNs.AutocompleteNs.Animation
  
  /* 2 */ val Fade: Fade with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 1 */ val Slide: Slide with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.AutocompleteNs.Animation with scala.Double] = js.native
}


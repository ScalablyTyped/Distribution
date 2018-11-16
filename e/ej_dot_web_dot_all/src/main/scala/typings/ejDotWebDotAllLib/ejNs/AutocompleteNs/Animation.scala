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
  
  val Fade: Fade with java.lang.String = js.native
  val None: None with java.lang.String = js.native
  val Slide: Slide with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.AutocompleteNs.Animation with java.lang.String] = js.native
}


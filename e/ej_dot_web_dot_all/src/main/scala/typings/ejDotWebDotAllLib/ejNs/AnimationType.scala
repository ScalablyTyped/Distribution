package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AnimationType extends js.Object

@JSGlobal("ej.AnimationType")
@js.native
object AnimationType extends js.Object {
  //string
  @js.native
  sealed trait Default
    extends ejDotWebDotAllLib.ejNs.AnimationType
  
  //string
  @js.native
  sealed trait None
    extends ejDotWebDotAllLib.ejNs.AnimationType
  
  /* 0 */ val Default: Default with scala.Double = js.native
  /* 1 */ val None: None with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.AnimationType with scala.Double] = js.native
}


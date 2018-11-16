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
  
  val Default: Default with java.lang.String = js.native
  val None: None with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.AnimationType with java.lang.String] = js.native
}


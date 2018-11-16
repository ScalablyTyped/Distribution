package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MatrixTypes extends js.Object

@JSGlobal("ej.MatrixTypes")
@js.native
object MatrixTypes extends js.Object {
  @js.native
  sealed trait Identity
    extends ejDotWebDotAllLib.ejNs.MatrixTypes
  
  @js.native
  sealed trait Scaling
    extends ejDotWebDotAllLib.ejNs.MatrixTypes
  
  @js.native
  sealed trait Translation
    extends ejDotWebDotAllLib.ejNs.MatrixTypes
  
  @js.native
  sealed trait Unknown
    extends ejDotWebDotAllLib.ejNs.MatrixTypes
  
  val Identity: Identity with java.lang.String = js.native
  val Scaling: Scaling with java.lang.String = js.native
  val Translation: Translation with java.lang.String = js.native
  val Unknown: Unknown with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.MatrixTypes with java.lang.String] = js.native
}


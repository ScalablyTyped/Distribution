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
  
  /* 0 */ val Identity: Identity with scala.Double = js.native
  /* 1 */ val Scaling: Scaling with scala.Double = js.native
  /* 2 */ val Translation: Translation with scala.Double = js.native
  /* 3 */ val Unknown: Unknown with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.MatrixTypes with scala.Double] = js.native
}


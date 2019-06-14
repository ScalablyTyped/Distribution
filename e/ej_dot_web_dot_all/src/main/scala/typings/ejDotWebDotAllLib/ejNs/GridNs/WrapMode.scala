package typings
package ejDotWebDotAllLib.ejNs.GridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WrapMode extends js.Object

@JSGlobal("ej.Grid.WrapMode")
@js.native
object WrapMode extends js.Object {
  ///Auto wrap is applied for both content and header.
  @js.native
  sealed trait Both
    extends ejDotWebDotAllLib.ejNs.GridNs.WrapMode
  
  ///Auto wrap is applied only for content.
  @js.native
  sealed trait Content
    extends ejDotWebDotAllLib.ejNs.GridNs.WrapMode
  
  ///Auto wrap is applied only for header.
  @js.native
  sealed trait Header
    extends ejDotWebDotAllLib.ejNs.GridNs.WrapMode
  
  /* 0 */ val Both: Both with scala.Double = js.native
  /* 1 */ val Content: Content with scala.Double = js.native
  /* 2 */ val Header: Header with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.GridNs.WrapMode with scala.Double] = js.native
}


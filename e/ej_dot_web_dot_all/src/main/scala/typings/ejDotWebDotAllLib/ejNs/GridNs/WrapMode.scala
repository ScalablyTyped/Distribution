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
  
  val Both: Both with java.lang.String = js.native
  val Content: Content with java.lang.String = js.native
  val Header: Header with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.GridNs.WrapMode with java.lang.String] = js.native
}


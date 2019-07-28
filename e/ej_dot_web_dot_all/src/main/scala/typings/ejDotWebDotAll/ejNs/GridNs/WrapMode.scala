package typings.ejDotWebDotAll.ejNs.GridNs

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
  sealed trait Both extends WrapMode
  
  ///Auto wrap is applied only for content.
  @js.native
  sealed trait Content extends WrapMode
  
  ///Auto wrap is applied only for header.
  @js.native
  sealed trait Header extends WrapMode
  
  /* 0 */ val Both: typings.ejDotWebDotAll.ejNs.GridNs.WrapMode.Both with Double = js.native
  /* 1 */ val Content: typings.ejDotWebDotAll.ejNs.GridNs.WrapMode.Content with Double = js.native
  /* 2 */ val Header: typings.ejDotWebDotAll.ejNs.GridNs.WrapMode.Header with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WrapMode with Double] = js.native
}


package typings.ejDotWebDotAll.ej.Grid

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
  
  /* 0 */ val Both: typings.ejDotWebDotAll.ej.Grid.WrapMode.Both with Double = js.native
  /* 1 */ val Content: typings.ejDotWebDotAll.ej.Grid.WrapMode.Content with Double = js.native
  /* 2 */ val Header: typings.ejDotWebDotAll.ej.Grid.WrapMode.Header with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WrapMode with Double] = js.native
}


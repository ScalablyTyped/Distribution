package typings.ejWebAll.ej.Grid

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WrapMode with Double] = js.native
  /* 0 */ @js.native
  object Both extends TopLevel[Both with Double]
  
  /* 1 */ @js.native
  object Content extends TopLevel[Content with Double]
  
  /* 2 */ @js.native
  object Header extends TopLevel[Header with Double]
  
}


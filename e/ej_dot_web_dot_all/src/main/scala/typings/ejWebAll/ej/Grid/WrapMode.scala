package typings.ejWebAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}

package typings.ejWebAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ColumnLayout extends js.Object
@JSGlobal("ej.Grid.ColumnLayout")
@js.native
object ColumnLayout extends js.Object {
  
  ///Column layout is auto(based on width).
  @js.native
  sealed trait Auto extends ColumnLayout
  
  ///Column layout is fixed(based on width).
  @js.native
  sealed trait Fixed extends ColumnLayout
}

package typings.ejWebAll.ej.ListBox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SortOrder extends js.Object
@JSGlobal("ej.ListBox.SortOrder")
@js.native
object SortOrder extends js.Object {
  
  ///To sort items in Ascending order.
  @js.native
  sealed trait Ascending extends SortOrder
  
  ///To sort items in Descending order.
  @js.native
  sealed trait Descending extends SortOrder
  
  ///The items are not sorted.
  @js.native
  sealed trait None extends SortOrder
}

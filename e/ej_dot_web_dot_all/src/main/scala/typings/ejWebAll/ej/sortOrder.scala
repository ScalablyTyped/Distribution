package typings.ejWebAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait sortOrder extends js.Object
@JSGlobal("ej.sortOrder")
@js.native
object sortOrder extends js.Object {
  
  //Enum for Ascending sort order
  @js.native
  sealed trait Ascending extends sortOrder
  
  //Enum for Descending sort order
  @js.native
  sealed trait Descending extends sortOrder
}

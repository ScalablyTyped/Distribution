package typings.ejWebAll.ej.TreeGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FilterType extends js.Object
@JSGlobal("ej.TreeGrid.FilterType")
@js.native
object FilterType extends js.Object {
  
  ///Specifies the filter type as excel.
  @js.native
  sealed trait Excel extends FilterType
  
  ///Specifies the filter type as menu.
  @js.native
  sealed trait Menu extends FilterType
}

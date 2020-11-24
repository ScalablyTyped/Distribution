package typings.ejWebAll.ej.PivotPager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Mode extends js.Object
@JSGlobal("ej.PivotPager.Mode")
@js.native
object Mode extends js.Object {
  
  ///To set both categorical and series pager for paging.
  @js.native
  sealed trait Both extends Mode
  
  ///To set only categorical pager for paging.
  @js.native
  sealed trait Categorical extends Mode
  
  ///To set only series pager for paging.
  @js.native
  sealed trait Series extends Mode
}

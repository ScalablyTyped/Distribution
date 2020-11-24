package typings.ejWebAll.ej.TreeGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HeaderTextOverflow extends js.Object
@JSGlobal("ej.TreeGrid.HeaderTextOverflow")
@js.native
object HeaderTextOverflow extends js.Object {
  
  ///You can disable the word wrap
  @js.native
  sealed trait None extends HeaderTextOverflow
  
  ///You can wrap the header content
  @js.native
  sealed trait Wrap extends HeaderTextOverflow
}

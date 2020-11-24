package typings.ejWebAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PrintMode extends js.Object
@JSGlobal("ej.Grid.PrintMode")
@js.native
object PrintMode extends js.Object {
  
  ///Prints all pages.
  @js.native
  sealed trait AllPages extends PrintMode
  
  ///Prints current page.
  @js.native
  sealed trait CurrentPage extends PrintMode
}

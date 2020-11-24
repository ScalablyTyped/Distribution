package typings.ejWebAll.ej.Toolbar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ResponsiveType extends js.Object
@JSGlobal("ej.Toolbar.ResponsiveType")
@js.native
object ResponsiveType extends js.Object {
  
  ///To display the toolbar overflow items as inline toolbar
  @js.native
  sealed trait Inline extends ResponsiveType
  
  ///To display the toolbar overflow items as popup
  @js.native
  sealed trait Popup extends ResponsiveType
}

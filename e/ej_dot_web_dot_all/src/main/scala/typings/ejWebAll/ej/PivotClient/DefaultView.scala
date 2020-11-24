package typings.ejWebAll.ej.PivotClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DefaultView extends js.Object
@JSGlobal("ej.PivotClient.DefaultView")
@js.native
object DefaultView extends js.Object {
  
  ///To set PivotChart as a default control in view.
  @js.native
  sealed trait Chart extends DefaultView
  
  ///To set PivotGrid as a default control in view.
  @js.native
  sealed trait Grid extends DefaultView
}

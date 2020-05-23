package typings.ejWebAll.ej.PivotClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DisplayMode extends js.Object

@JSGlobal("ej.PivotClient.DisplayMode")
@js.native
object DisplayMode extends js.Object {
  ///To display both PivotChart and PivotGrid widgets.
  @js.native
  sealed trait ChartAndGrid extends DisplayMode
  
  ///To display only PivotChart widget.
  @js.native
  sealed trait ChartOnly extends DisplayMode
  
  ///To display only PivotGrid widget.
  @js.native
  sealed trait GridOnly extends DisplayMode
  
}


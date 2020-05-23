package typings.ejWebAll.ej.ReportDesigner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ConfigureItems extends js.Object

@JSGlobal("ej.ReportDesigner.ConfigureItems")
@js.native
object ConfigureItems extends js.Object {
  ///Shows all the configuration pane items.
  @js.native
  sealed trait All extends ConfigureItems
  
  ///Shows or hides the data panel in configuration pane.
  @js.native
  sealed trait Data extends ConfigureItems
  
  ///Shows or hides the image manager panel in configuration pane.
  @js.native
  sealed trait ImageManager extends ConfigureItems
  
  ///Shows or hides the parameter panel in configuration pane.
  @js.native
  sealed trait Parameter extends ConfigureItems
  
  ///Shows or hides the properties panel in configuration pane.
  @js.native
  sealed trait Property extends ConfigureItems
  
}


package typings.ejDotWebDotAll.ej.ReportDesigner

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
  
  /* 4 */ val All: typings.ejDotWebDotAll.ej.ReportDesigner.ConfigureItems.All with Double = js.native
  /* 1 */ val Data: typings.ejDotWebDotAll.ej.ReportDesigner.ConfigureItems.Data with Double = js.native
  /* 3 */ val ImageManager: typings.ejDotWebDotAll.ej.ReportDesigner.ConfigureItems.ImageManager with Double = js.native
  /* 2 */ val Parameter: typings.ejDotWebDotAll.ej.ReportDesigner.ConfigureItems.Parameter with Double = js.native
  /* 0 */ val Property: typings.ejDotWebDotAll.ej.ReportDesigner.ConfigureItems.Property with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ConfigureItems with Double] = js.native
}


package typings.ejDotWebDotAll.ej.ReportDesigner

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ConfigureItems with Double] = js.native
  /* 4 */ @js.native
  object All extends TopLevel[All with Double]
  
  /* 1 */ @js.native
  object Data extends TopLevel[Data with Double]
  
  /* 3 */ @js.native
  object ImageManager extends TopLevel[ImageManager with Double]
  
  /* 2 */ @js.native
  object Parameter extends TopLevel[Parameter with Double]
  
  /* 0 */ @js.native
  object Property extends TopLevel[Property with Double]
  
}


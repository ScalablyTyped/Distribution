package typings.ejWebAll.ej.datavisualization.Diagram

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Region extends js.Object

@JSGlobal("ej.datavisualization.Diagram.Region")
@js.native
object Region extends js.Object {
  //Used to export the content of the diagram only.
  @js.native
  sealed trait Content extends Region
  
  //Used to export the page region of the diagram.
  @js.native
  sealed trait PageSettings extends Region
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Region with Double] = js.native
  /* 0 */ @js.native
  object Content extends TopLevel[Content with Double]
  
  /* 1 */ @js.native
  object PageSettings
    extends TopLevel[typings.ejWebAll.ej.datavisualization.Diagram.Region.PageSettings with Double]
  
}


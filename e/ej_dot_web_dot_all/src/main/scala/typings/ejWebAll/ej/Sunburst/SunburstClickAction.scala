package typings.ejWebAll.ej.Sunburst

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SunburstClickAction extends StObject
@JSGlobal("ej.Sunburst.SunburstClickAction")
@js.native
object SunburstClickAction extends StObject {
  
  //string
  @js.native
  sealed trait None
    extends StObject
       with SunburstClickAction
  
  //string
  @js.native
  sealed trait ToggleSegmentSelection
    extends StObject
       with SunburstClickAction
  
  //string
  @js.native
  sealed trait ToggleSegmentVisibility
    extends StObject
       with SunburstClickAction
}

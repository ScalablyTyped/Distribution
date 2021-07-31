package typings.ejWebAll.ej.datavisualization.Sunburst

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SunburstAlignment extends StObject
@JSGlobal("ej.datavisualization.Sunburst.SunburstAlignment")
@js.native
object SunburstAlignment extends StObject {
  
  //string
  @js.native
  sealed trait Center
    extends StObject
       with SunburstAlignment
  
  //string
  @js.native
  sealed trait Far
    extends StObject
       with SunburstAlignment
  
  //string
  @js.native
  sealed trait Near
    extends StObject
       with SunburstAlignment
}

package typings.ejWebAll.ej.datavisualization.Sunburst

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FontWeight extends StObject
@JSGlobal("ej.datavisualization.Sunburst.FontWeight")
@js.native
object FontWeight extends StObject {
  
  //string
  @js.native
  sealed trait Bold
    extends StObject
       with FontWeight
  
  //string
  @js.native
  sealed trait Lighter
    extends StObject
       with FontWeight
  
  //string
  @js.native
  sealed trait Regular
    extends StObject
       with FontWeight
}

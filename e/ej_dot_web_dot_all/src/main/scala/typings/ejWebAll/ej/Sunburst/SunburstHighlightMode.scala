package typings.ejWebAll.ej.Sunburst

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SunburstHighlightMode extends StObject
@JSGlobal("ej.Sunburst.SunburstHighlightMode")
@js.native
object SunburstHighlightMode extends StObject {
  
  //string
  @js.native
  sealed trait All
    extends StObject
       with SunburstHighlightMode
  
  //string
  @js.native
  sealed trait Child
    extends StObject
       with SunburstHighlightMode
  
  //string
  @js.native
  sealed trait Parent
    extends StObject
       with SunburstHighlightMode
  
  //string
  @js.native
  sealed trait Point
    extends StObject
       with SunburstHighlightMode
}

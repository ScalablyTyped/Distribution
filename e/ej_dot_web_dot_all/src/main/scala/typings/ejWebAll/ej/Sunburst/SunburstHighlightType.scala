package typings.ejWebAll.ej.Sunburst

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SunburstHighlightType extends StObject
@JSGlobal("ej.Sunburst.SunburstHighlightType")
@js.native
object SunburstHighlightType extends StObject {
  
  //string
  @js.native
  sealed trait Color
    extends StObject
       with SunburstHighlightType
  
  //string
  @js.native
  sealed trait Opacity
    extends StObject
       with SunburstHighlightType
}

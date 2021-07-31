package typings.googleAppsScript.GoogleAppsScript.Charts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CurveStyle extends StObject
/**
  * An enumeration of the styles for curves in a chart.
  */
@JSGlobal("GoogleAppsScript.Charts.CurveStyle")
@js.native
object CurveStyle extends StObject {
  
  @js.native
  sealed trait NORMAL
    extends StObject
       with CurveStyle
  
  @js.native
  sealed trait SMOOTH
    extends StObject
       with CurveStyle
}

package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an object under the hit test point within a chart control, on the client side.
  */
@JSGlobal("ASPxClientHitObject")
@js.native
class ASPxClientHitObject ()
  extends StObject
     with typings.devexpressWeb.ASPxClientHitObject {
  
  /**
    * Provides access to an object, which is in some way related to the object being hit. The returned value depends on the ASPxClientHitObject.Object type and hit point location.
    */
  /* CompleteClass */
  var AdditionalObject: typings.devexpressWeb.ASPxClientWebChartElement = js.native
  
  /**
    * Gets the chart element for which the event was raised.
    */
  /* CompleteClass */
  var Object: typings.devexpressWeb.ASPxClientWebChartElement = js.native
}

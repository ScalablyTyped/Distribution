package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the CrosshairElementGroup class.
  */
@JSGlobal("ASPxClientCrosshairElementGroup")
@js.native
open class ASPxClientCrosshairElementGroup ()
  extends StObject
     with typings.devexpressWeb.ASPxClientCrosshairElementGroup {
  
  /**
    * Returns the collection of elements that the Crosshair Cursor displays in the group.
    */
  /* CompleteClass */
  var CrosshairElements: js.Array[typings.devexpressWeb.ASPxClientCrosshairElement] = js.native
  
  /**
    * Returns the collection of indicator elements that the Crosshair Cursor displays in the group.
    */
  /* CompleteClass */
  var CrosshairIndicatorElements: js.Array[typings.devexpressWeb.ASPxClientCrosshairIndicatorElement] = js.native
  
  /**
    * Returns the Crosshair Cursor group's Header element.
    */
  /* CompleteClass */
  var HeaderElement: typings.devexpressWeb.ASPxClientCrosshairGroupHeaderElement = js.native
}

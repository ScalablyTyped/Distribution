package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the FloatingObjectMoved event.
  */
@JSGlobal("ASPxClientRichEditFloatingObjectMovedEventArgs")
@js.native
class ASPxClientRichEditFloatingObjectMovedEventArgs ()
  extends StObject
     with typings.devexpressWeb.ASPxClientRichEditFloatingObjectMovedEventArgs {
  
  /**
    * The floating object's new position.
    */
  /* CompleteClass */
  var newPosition: Double = js.native
  
  /**
    * The x-coordinate (in pixels) of the upper-left corner of the floating object relative to the page.
    */
  /* CompleteClass */
  var objectX: Double = js.native
  
  /**
    * The y-coordinate (in pixels) of the upper-left corner of the floating object relative to the page.
    */
  /* CompleteClass */
  var objectY: Double = js.native
  
  /**
    * Returns an index of a page where a floating object has been moved.
    */
  /* CompleteClass */
  override val pageIndex: Double = js.native
  
  /**
    * Returns an array of intervals that are belongs to the current page (pageIndex).
    */
  /* CompleteClass */
  override val pageIntervals: js.Array[typings.devexpressWeb.Interval] = js.native
  
  /**
    * Returns the active sub-document's identifier.
    */
  /* CompleteClass */
  override val subDocumentId: Double = js.native
}

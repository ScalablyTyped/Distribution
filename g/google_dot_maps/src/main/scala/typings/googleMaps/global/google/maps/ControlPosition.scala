package typings.googleMaps.global.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Identifiers used to specify the placement of controls on the map. Controls
  * are positioned relative to other controls in the same layout position.
  * Controls that are added first are positioned closer to the edge of the map.
  * <code> <br>&nbsp;&nbsp;+----------------+
  * <br>&nbsp;&nbsp;+&nbsp;TL&nbsp;&nbsp;&nbsp;&nbsp;TC&nbsp;&nbsp;&nbsp;&nbsp;TR
  * +
  * <br>&nbsp;&nbsp;+&nbsp;LT&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;RT
  * +
  * <br>&nbsp;&nbsp;+&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;+
  * <br>&nbsp;&nbsp;+&nbsp;LC&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;RC
  * +
  * <br>&nbsp;&nbsp;+&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;+
  * <br>&nbsp;&nbsp;+&nbsp;LB&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;RB
  * +
  * <br>&nbsp;&nbsp;+&nbsp;BL&nbsp;&nbsp;&nbsp;&nbsp;BC&nbsp;&nbsp;&nbsp;&nbsp;BR
  * + <br>&nbsp;&nbsp;+----------------+ <br></code> Elements in the top or
  * bottom row flow towards the middle of the row. Elements in the left or
  * right column flow towards the middle of the column.
  */
@JSGlobal("google.maps.ControlPosition")
@js.native
object ControlPosition extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.googleMaps.google.maps.ControlPosition & Double] = js.native
  
  /* 0.0 */ val BOTTOM_CENTER: typings.googleMaps.google.maps.ControlPosition.BOTTOM_CENTER & Double = js.native
  
  /* 1.0 */ val BOTTOM_LEFT: typings.googleMaps.google.maps.ControlPosition.BOTTOM_LEFT & Double = js.native
  
  /* 2.0 */ val BOTTOM_RIGHT: typings.googleMaps.google.maps.ControlPosition.BOTTOM_RIGHT & Double = js.native
  
  /* 3.0 */ val LEFT_BOTTOM: typings.googleMaps.google.maps.ControlPosition.LEFT_BOTTOM & Double = js.native
  
  /* 4.0 */ val LEFT_CENTER: typings.googleMaps.google.maps.ControlPosition.LEFT_CENTER & Double = js.native
  
  /* 5.0 */ val LEFT_TOP: typings.googleMaps.google.maps.ControlPosition.LEFT_TOP & Double = js.native
  
  /* 6.0 */ val RIGHT_BOTTOM: typings.googleMaps.google.maps.ControlPosition.RIGHT_BOTTOM & Double = js.native
  
  /* 7.0 */ val RIGHT_CENTER: typings.googleMaps.google.maps.ControlPosition.RIGHT_CENTER & Double = js.native
  
  /* 8.0 */ val RIGHT_TOP: typings.googleMaps.google.maps.ControlPosition.RIGHT_TOP & Double = js.native
  
  /* 9.0 */ val TOP_CENTER: typings.googleMaps.google.maps.ControlPosition.TOP_CENTER & Double = js.native
  
  /* 10.0 */ val TOP_LEFT: typings.googleMaps.google.maps.ControlPosition.TOP_LEFT & Double = js.native
  
  /* 11.0 */ val TOP_RIGHT: typings.googleMaps.google.maps.ControlPosition.TOP_RIGHT & Double = js.native
}

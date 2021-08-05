package typings.electron.Electron

import typings.electron.electronStrings.`round-rect`
import typings.electron.electronStrings.`small-square`
import typings.electron.electronStrings.`textured-rounded`
import typings.electron.electronStrings.`textured-square`
import typings.electron.electronStrings.automatic
import typings.electron.electronStrings.buttons
import typings.electron.electronStrings.capsule
import typings.electron.electronStrings.multiple
import typings.electron.electronStrings.rounded
import typings.electron.electronStrings.separated
import typings.electron.electronStrings.single
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TouchBarSegmentedControlConstructorOptions extends StObject {
  
  /**
    * Called when the user selects a new segment.
    */
  var change: js.UndefOr[js.Function2[/* selectedIndex */ Double, /* isSelected */ Boolean, Unit]] = js.undefined
  
  /**
    * The selection mode of the control:
    */
  var mode: js.UndefOr[single | multiple | buttons] = js.undefined
  
  /**
    * Style of the segments:
    */
  var segmentStyle: js.UndefOr[
    automatic | rounded | `textured-rounded` | `round-rect` | `textured-square` | capsule | `small-square` | separated
  ] = js.undefined
  
  /**
    * An array of segments to place in this control.
    */
  var segments: js.Array[SegmentedControlSegment]
  
  /**
    * The index of the currently selected segment, will update automatically with user
    * interaction. When the mode is `multiple` it will be the last selected item.
    */
  var selectedIndex: js.UndefOr[Double] = js.undefined
}
object TouchBarSegmentedControlConstructorOptions {
  
  inline def apply(segments: js.Array[SegmentedControlSegment]): TouchBarSegmentedControlConstructorOptions = {
    val __obj = js.Dynamic.literal(segments = segments.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchBarSegmentedControlConstructorOptions]
  }
  
  extension [Self <: TouchBarSegmentedControlConstructorOptions](x: Self) {
    
    inline def setChange(value: (/* selectedIndex */ Double, /* isSelected */ Boolean) => Unit): Self = StObject.set(x, "change", js.Any.fromFunction2(value))
    
    inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    inline def setMode(value: single | multiple | buttons): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setSegmentStyle(
      value: automatic | rounded | `textured-rounded` | `round-rect` | `textured-square` | capsule | `small-square` | separated
    ): Self = StObject.set(x, "segmentStyle", value.asInstanceOf[js.Any])
    
    inline def setSegmentStyleUndefined: Self = StObject.set(x, "segmentStyle", js.undefined)
    
    inline def setSegments(value: js.Array[SegmentedControlSegment]): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
    
    inline def setSegmentsVarargs(value: SegmentedControlSegment*): Self = StObject.set(x, "segments", js.Array(value :_*))
    
    inline def setSelectedIndex(value: Double): Self = StObject.set(x, "selectedIndex", value.asInstanceOf[js.Any])
    
    inline def setSelectedIndexUndefined: Self = StObject.set(x, "selectedIndex", js.undefined)
  }
}

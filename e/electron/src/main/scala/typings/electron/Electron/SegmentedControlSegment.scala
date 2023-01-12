package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SegmentedControlSegment extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/segmented-control-segment
  /**
    * Whether this segment is selectable. Default: true.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The image to appear in this segment.
    */
  var icon: js.UndefOr[NativeImage_] = js.undefined
  
  /**
    * The text to appear in this segment.
    */
  var label: js.UndefOr[String] = js.undefined
}
object SegmentedControlSegment {
  
  inline def apply(): SegmentedControlSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SegmentedControlSegment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SegmentedControlSegment] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setIcon(value: NativeImage_): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
  }
}

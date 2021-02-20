package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SegmentedControlSegment extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/segmented-control-segment
  /**
    * Whether this segment is selectable. Default: true.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The image to appear in this segment.
    */
  var icon: js.UndefOr[NativeImage_] = js.native
  
  /**
    * The text to appear in this segment.
    */
  var label: js.UndefOr[String] = js.native
}
object SegmentedControlSegment {
  
  @scala.inline
  def apply(): SegmentedControlSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SegmentedControlSegment]
  }
  
  @scala.inline
  implicit class SegmentedControlSegmentMutableBuilder[Self <: SegmentedControlSegment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setIcon(value: NativeImage_): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
  }
}

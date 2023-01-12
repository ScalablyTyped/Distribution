package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FrameCreatedDetails extends StObject {
  
  var frame: WebFrameMain_
}
object FrameCreatedDetails {
  
  inline def apply(frame: WebFrameMain_): FrameCreatedDetails = {
    val __obj = js.Dynamic.literal(frame = frame.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameCreatedDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FrameCreatedDetails] (val x: Self) extends AnyVal {
    
    inline def setFrame(value: WebFrameMain_): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
  }
}

package typings.domMediacaptureRecord

import typings.std.Blob
import typings.std.EventInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlobEventInit
  extends StObject
     with EventInit {
  
  var data: Blob
  
  var timecode: js.UndefOr[Double] = js.undefined
}
object BlobEventInit {
  
  inline def apply(data: Blob): BlobEventInit = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlobEventInit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BlobEventInit] (val x: Self) extends AnyVal {
    
    inline def setData(value: Blob): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setTimecode(value: Double): Self = StObject.set(x, "timecode", value.asInstanceOf[js.Any])
    
    inline def setTimecodeUndefined: Self = StObject.set(x, "timecode", js.undefined)
  }
}

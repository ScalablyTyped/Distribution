package typings.domMediacaptureRecord

import typings.std.Blob
import typings.std.EventInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlobEventInit extends EventInit {
  
  var data: Blob = js.native
  
  var timecode: js.UndefOr[Double] = js.native
}
object BlobEventInit {
  
  @scala.inline
  def apply(data: Blob): BlobEventInit = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlobEventInit]
  }
  
  @scala.inline
  implicit class BlobEventInitMutableBuilder[Self <: BlobEventInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: Blob): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimecode(value: Double): Self = StObject.set(x, "timecode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimecodeUndefined: Self = StObject.set(x, "timecode", js.undefined)
  }
}

package typings.domMediacaptureRecord

import typings.std.DOMException
import typings.std.EventInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaRecorderErrorEventInit
  extends StObject
     with EventInit {
  
  var error: DOMException
}
object MediaRecorderErrorEventInit {
  
  @scala.inline
  def apply(error: DOMException): MediaRecorderErrorEventInit = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaRecorderErrorEventInit]
  }
  
  @scala.inline
  implicit class MediaRecorderErrorEventInitMutableBuilder[Self <: MediaRecorderErrorEventInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: DOMException): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}

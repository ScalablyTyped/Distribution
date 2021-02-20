package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProcessingState extends StObject {
  
  var processingState: js.UndefOr[String] = js.native
}
object ProcessingState {
  
  @scala.inline
  def apply(): ProcessingState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProcessingState]
  }
  
  @scala.inline
  implicit class ProcessingStateMutableBuilder[Self <: ProcessingState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProcessingState(value: String): Self = StObject.set(x, "processingState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessingStateUndefined: Self = StObject.set(x, "processingState", js.undefined)
  }
}

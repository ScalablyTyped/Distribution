package typings.dockerode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaxConcurrent extends StObject {
  
  var MaxConcurrent: js.UndefOr[Double] = js.native
  
  var TotalCompletions: js.UndefOr[Double] = js.native
}
object MaxConcurrent {
  
  @scala.inline
  def apply(): MaxConcurrent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxConcurrent]
  }
  
  @scala.inline
  implicit class MaxConcurrentMutableBuilder[Self <: MaxConcurrent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxConcurrent(value: Double): Self = StObject.set(x, "MaxConcurrent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxConcurrentUndefined: Self = StObject.set(x, "MaxConcurrent", js.undefined)
    
    @scala.inline
    def setTotalCompletions(value: Double): Self = StObject.set(x, "TotalCompletions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalCompletionsUndefined: Self = StObject.set(x, "TotalCompletions", js.undefined)
  }
}

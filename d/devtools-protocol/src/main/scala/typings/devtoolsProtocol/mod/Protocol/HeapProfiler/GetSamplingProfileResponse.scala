package typings.devtoolsProtocol.mod.Protocol.HeapProfiler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSamplingProfileResponse extends StObject {
  
  /**
    * Return the sampling profile being collected.
    */
  var profile: SamplingHeapProfile
}
object GetSamplingProfileResponse {
  
  @scala.inline
  def apply(profile: SamplingHeapProfile): GetSamplingProfileResponse = {
    val __obj = js.Dynamic.literal(profile = profile.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSamplingProfileResponse]
  }
  
  @scala.inline
  implicit class GetSamplingProfileResponseMutableBuilder[Self <: GetSamplingProfileResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProfile(value: SamplingHeapProfile): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
  }
}

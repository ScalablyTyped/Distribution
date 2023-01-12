package typings.devtoolsProtocol.mod.Protocol.Profiler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopResponse extends StObject {
  
  /**
    * Recorded profile.
    */
  var profile: Profile
}
object StopResponse {
  
  inline def apply(profile: Profile): StopResponse = {
    val __obj = js.Dynamic.literal(profile = profile.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StopResponse] (val x: Self) extends AnyVal {
    
    inline def setProfile(value: Profile): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
  }
}

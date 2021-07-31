package typings.devtoolsProtocol.mod.Protocol.Profiler

import typings.devtoolsProtocol.mod.Protocol.Debugger.Location
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConsoleProfileFinishedEvent extends StObject {
  
  var id: String
  
  /**
    * Location of console.profileEnd().
    */
  var location: Location
  
  var profile: Profile
  
  /**
    * Profile title passed as an argument to console.profile().
    */
  var title: js.UndefOr[String] = js.undefined
}
object ConsoleProfileFinishedEvent {
  
  @scala.inline
  def apply(id: String, location: Location, profile: Profile): ConsoleProfileFinishedEvent = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], profile = profile.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsoleProfileFinishedEvent]
  }
  
  @scala.inline
  implicit class ConsoleProfileFinishedEventMutableBuilder[Self <: ConsoleProfileFinishedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfile(value: Profile): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}

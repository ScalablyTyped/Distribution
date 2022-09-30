package typings.gatsbyCli.typesMod

import org.scalablytyped.runtime.StringDictionary
import typings.gatsbyCli.constantsMod.ActivityStatuses
import typings.gatsbyCli.gatsbyCliStrings._empty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGatsbyCLIState extends StObject {
  
  var activities: StringDictionary[IActivity]
  
  var status: ActivityStatuses | _empty
}
object IGatsbyCLIState {
  
  inline def apply(activities: StringDictionary[IActivity], status: ActivityStatuses | _empty): IGatsbyCLIState = {
    val __obj = js.Dynamic.literal(activities = activities.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGatsbyCLIState]
  }
  
  extension [Self <: IGatsbyCLIState](x: Self) {
    
    inline def setActivities(value: StringDictionary[IActivity]): Self = StObject.set(x, "activities", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: ActivityStatuses | _empty): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}

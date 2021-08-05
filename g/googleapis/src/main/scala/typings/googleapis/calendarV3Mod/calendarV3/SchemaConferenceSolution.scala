package typings.googleapis.calendarV3Mod.calendarV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConferenceSolution extends StObject {
  
  /**
    * The user-visible icon for this solution.
    */
  var iconUri: js.UndefOr[String] = js.undefined
  
  /**
    * The key which can uniquely identify the conference solution for this
    * event.
    */
  var key: js.UndefOr[SchemaConferenceSolutionKey] = js.undefined
  
  /**
    * The user-visible name of this solution. Not localized.
    */
  var name: js.UndefOr[String] = js.undefined
}
object SchemaConferenceSolution {
  
  inline def apply(): SchemaConferenceSolution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConferenceSolution]
  }
  
  extension [Self <: SchemaConferenceSolution](x: Self) {
    
    inline def setIconUri(value: String): Self = StObject.set(x, "iconUri", value.asInstanceOf[js.Any])
    
    inline def setIconUriUndefined: Self = StObject.set(x, "iconUri", js.undefined)
    
    inline def setKey(value: SchemaConferenceSolutionKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}

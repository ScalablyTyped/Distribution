package typings.googleapis.calendarV3Mod.calendarV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaConferenceSolution extends StObject {
  
  /**
    * The user-visible icon for this solution.
    */
  var iconUri: js.UndefOr[String] = js.native
  
  /**
    * The key which can uniquely identify the conference solution for this
    * event.
    */
  var key: js.UndefOr[SchemaConferenceSolutionKey] = js.native
  
  /**
    * The user-visible name of this solution. Not localized.
    */
  var name: js.UndefOr[String] = js.native
}
object SchemaConferenceSolution {
  
  @scala.inline
  def apply(): SchemaConferenceSolution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConferenceSolution]
  }
  
  @scala.inline
  implicit class SchemaConferenceSolutionMutableBuilder[Self <: SchemaConferenceSolution] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIconUri(value: String): Self = StObject.set(x, "iconUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUriUndefined: Self = StObject.set(x, "iconUri", js.undefined)
    
    @scala.inline
    def setKey(value: SchemaConferenceSolutionKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}

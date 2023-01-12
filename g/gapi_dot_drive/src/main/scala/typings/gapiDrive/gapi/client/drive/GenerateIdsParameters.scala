package typings.gapiDrive.gapi.client.drive

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenerateIdsParameters extends StObject {
  
  var maxResults: js.UndefOr[Double] = js.undefined
  
  var space: js.UndefOr[String] = js.undefined
}
object GenerateIdsParameters {
  
  inline def apply(): GenerateIdsParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateIdsParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GenerateIdsParameters] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setSpace(value: String): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
    
    inline def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
  }
}

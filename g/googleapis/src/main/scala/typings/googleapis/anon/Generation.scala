package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Generation extends StObject {
  
  var generation: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var objectPreconditions: js.UndefOr[IfGenerationMatch] = js.native
}
object Generation {
  
  @scala.inline
  def apply(): Generation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Generation]
  }
  
  @scala.inline
  implicit class GenerationMutableBuilder[Self <: Generation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGeneration(value: String): Self = StObject.set(x, "generation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenerationUndefined: Self = StObject.set(x, "generation", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setObjectPreconditions(value: IfGenerationMatch): Self = StObject.set(x, "objectPreconditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectPreconditionsUndefined: Self = StObject.set(x, "objectPreconditions", js.undefined)
  }
}

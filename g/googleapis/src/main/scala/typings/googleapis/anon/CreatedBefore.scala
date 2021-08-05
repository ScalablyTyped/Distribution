package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatedBefore extends StObject {
  
  var age: js.UndefOr[Double] = js.undefined
  
  var createdBefore: js.UndefOr[String] = js.undefined
  
  var isLive: js.UndefOr[Boolean] = js.undefined
  
  var numNewerVersions: js.UndefOr[Double] = js.undefined
}
object CreatedBefore {
  
  inline def apply(): CreatedBefore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatedBefore]
  }
  
  extension [Self <: CreatedBefore](x: Self) {
    
    inline def setAge(value: Double): Self = StObject.set(x, "age", value.asInstanceOf[js.Any])
    
    inline def setAgeUndefined: Self = StObject.set(x, "age", js.undefined)
    
    inline def setCreatedBefore(value: String): Self = StObject.set(x, "createdBefore", value.asInstanceOf[js.Any])
    
    inline def setCreatedBeforeUndefined: Self = StObject.set(x, "createdBefore", js.undefined)
    
    inline def setIsLive(value: Boolean): Self = StObject.set(x, "isLive", value.asInstanceOf[js.Any])
    
    inline def setIsLiveUndefined: Self = StObject.set(x, "isLive", js.undefined)
    
    inline def setNumNewerVersions(value: Double): Self = StObject.set(x, "numNewerVersions", value.asInstanceOf[js.Any])
    
    inline def setNumNewerVersionsUndefined: Self = StObject.set(x, "numNewerVersions", js.undefined)
  }
}

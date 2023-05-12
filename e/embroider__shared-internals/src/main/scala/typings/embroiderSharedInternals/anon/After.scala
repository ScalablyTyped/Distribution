package typings.embroiderSharedInternals.anon

import typings.embroiderSharedInternals.embroiderSharedInternalsInts.`1`
import typings.embroiderSharedInternals.embroiderSharedInternalsStrings.addon
import typings.embroiderSharedInternals.embroiderSharedInternalsStrings.app
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait After extends StObject {
  
  var after: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var before: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var main: js.UndefOr[String] = js.undefined
  
  var paths: js.UndefOr[js.Array[String]] = js.undefined
  
  var `type`: js.UndefOr[addon | app] = js.undefined
  
  var version: js.UndefOr[`1`] = js.undefined
}
object After {
  
  inline def apply(): After = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[After]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: After] (val x: Self) extends AnyVal {
    
    inline def setAfter(value: String | js.Array[String]): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
    
    inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
    
    inline def setAfterVarargs(value: String*): Self = StObject.set(x, "after", js.Array(value*))
    
    inline def setBefore(value: String | js.Array[String]): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    
    inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
    
    inline def setBeforeVarargs(value: String*): Self = StObject.set(x, "before", js.Array(value*))
    
    inline def setMain(value: String): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
    
    inline def setMainUndefined: Self = StObject.set(x, "main", js.undefined)
    
    inline def setPaths(value: js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    inline def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
    
    inline def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value*))
    
    inline def setType(value: addon | app): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setVersion(value: `1`): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}

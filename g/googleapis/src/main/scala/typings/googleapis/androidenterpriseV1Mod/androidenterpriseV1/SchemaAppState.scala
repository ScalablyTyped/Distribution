package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAppState extends StObject {
  
  /**
    * List of keyed app states. This field will always be present.
    */
  var keyedAppState: js.UndefOr[js.Array[SchemaKeyedAppState]] = js.undefined
  
  /**
    * The package name of the app. This field will always be present.
    */
  var packageName: js.UndefOr[String | Null] = js.undefined
}
object SchemaAppState {
  
  inline def apply(): SchemaAppState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppState]
  }
  
  extension [Self <: SchemaAppState](x: Self) {
    
    inline def setKeyedAppState(value: js.Array[SchemaKeyedAppState]): Self = StObject.set(x, "keyedAppState", value.asInstanceOf[js.Any])
    
    inline def setKeyedAppStateUndefined: Self = StObject.set(x, "keyedAppState", js.undefined)
    
    inline def setKeyedAppStateVarargs(value: SchemaKeyedAppState*): Self = StObject.set(x, "keyedAppState", js.Array(value*))
    
    inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    inline def setPackageNameNull: Self = StObject.set(x, "packageName", null)
    
    inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
  }
}

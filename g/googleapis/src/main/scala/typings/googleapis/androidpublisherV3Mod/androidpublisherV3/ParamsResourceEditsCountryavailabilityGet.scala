package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceEditsCountryavailabilityGet
  extends StObject
     with StandardParameters {
  
  /**
    * Identifier of the edit.
    */
  var editId: js.UndefOr[String] = js.undefined
  
  /**
    * Package name of the app.
    */
  var packageName: js.UndefOr[String] = js.undefined
  
  /**
    * The track to read from.
    */
  var track: js.UndefOr[String] = js.undefined
}
object ParamsResourceEditsCountryavailabilityGet {
  
  inline def apply(): ParamsResourceEditsCountryavailabilityGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceEditsCountryavailabilityGet]
  }
  
  extension [Self <: ParamsResourceEditsCountryavailabilityGet](x: Self) {
    
    inline def setEditId(value: String): Self = StObject.set(x, "editId", value.asInstanceOf[js.Any])
    
    inline def setEditIdUndefined: Self = StObject.set(x, "editId", js.undefined)
    
    inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
    
    inline def setTrack(value: String): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
    
    inline def setTrackUndefined: Self = StObject.set(x, "track", js.undefined)
  }
}

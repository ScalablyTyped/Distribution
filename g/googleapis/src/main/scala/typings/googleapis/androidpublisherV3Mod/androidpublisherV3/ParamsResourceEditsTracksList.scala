package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceEditsTracksList
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
}
object ParamsResourceEditsTracksList {
  
  inline def apply(): ParamsResourceEditsTracksList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceEditsTracksList]
  }
  
  extension [Self <: ParamsResourceEditsTracksList](x: Self) {
    
    inline def setEditId(value: String): Self = StObject.set(x, "editId", value.asInstanceOf[js.Any])
    
    inline def setEditIdUndefined: Self = StObject.set(x, "editId", js.undefined)
    
    inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
  }
}

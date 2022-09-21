package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import typings.googleapis.anon.Body
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceEditsExpansionfilesUpload
  extends StObject
     with StandardParameters {
  
  /**
    * The version code of the APK whose expansion file configuration is being read or modified.
    */
  var apkVersionCode: js.UndefOr[Double] = js.undefined
  
  /**
    * Identifier of the edit.
    */
  var editId: js.UndefOr[String] = js.undefined
  
  /**
    * The file type of the expansion file configuration which is being updated.
    */
  var expansionFileType: js.UndefOr[String] = js.undefined
  
  /**
    * Media metadata
    */
  var media: js.UndefOr[Body] = js.undefined
  
  /**
    * Package name of the app.
    */
  var packageName: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[js.Object] = js.undefined
}
object ParamsResourceEditsExpansionfilesUpload {
  
  inline def apply(): ParamsResourceEditsExpansionfilesUpload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceEditsExpansionfilesUpload]
  }
  
  extension [Self <: ParamsResourceEditsExpansionfilesUpload](x: Self) {
    
    inline def setApkVersionCode(value: Double): Self = StObject.set(x, "apkVersionCode", value.asInstanceOf[js.Any])
    
    inline def setApkVersionCodeUndefined: Self = StObject.set(x, "apkVersionCode", js.undefined)
    
    inline def setEditId(value: String): Self = StObject.set(x, "editId", value.asInstanceOf[js.Any])
    
    inline def setEditIdUndefined: Self = StObject.set(x, "editId", js.undefined)
    
    inline def setExpansionFileType(value: String): Self = StObject.set(x, "expansionFileType", value.asInstanceOf[js.Any])
    
    inline def setExpansionFileTypeUndefined: Self = StObject.set(x, "expansionFileType", js.undefined)
    
    inline def setMedia(value: Body): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
    
    inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
    
    inline def setRequestBody(value: js.Object): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}

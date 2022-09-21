package typings.googleapis.cloudresourcemanagerV3Mod.cloudresourcemanagerV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceFoldersGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the folder to retrieve. Must be of the form `folders/{folder_id\}`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceFoldersGet {
  
  inline def apply(): ParamsResourceFoldersGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceFoldersGet]
  }
  
  extension [Self <: ParamsResourceFoldersGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}

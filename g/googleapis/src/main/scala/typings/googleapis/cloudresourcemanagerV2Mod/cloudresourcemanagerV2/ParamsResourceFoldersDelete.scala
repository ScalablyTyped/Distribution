package typings.googleapis.cloudresourcemanagerV2Mod.cloudresourcemanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceFoldersDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. the resource name of the Folder to be deleted. Must be of the form `folders/{folder_id\}`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceFoldersDelete {
  
  inline def apply(): ParamsResourceFoldersDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceFoldersDelete]
  }
  
  extension [Self <: ParamsResourceFoldersDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}

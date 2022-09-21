package typings.forgeViewer.Autodesk.Viewing

import typings.forgeViewer.forgeViewerStrings.`2d`
import typings.forgeViewer.forgeViewerStrings.`3d`
import typings.forgeViewer.forgeViewerStrings.geometry
import typings.forgeViewer.forgeViewerStrings.view
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewerItem extends StObject {
  
  var children: js.UndefOr[js.Array[ViewerItem]] = js.undefined
  
  var guid: String
  
  var hasThumbnail: Boolean
  
  var name: String
  
  var parent: ViewerItem
  
  var progress: String
  
  var role: `3d` | `2d` | String
  
  var size: Double
  
  var status: String
  
  var success: String
  
  var `type`: view | geometry | String
  
  var viewableID: String
}
object ViewerItem {
  
  inline def apply(
    guid: String,
    hasThumbnail: Boolean,
    name: String,
    parent: ViewerItem,
    progress: String,
    role: `3d` | `2d` | String,
    size: Double,
    status: String,
    success: String,
    `type`: view | geometry | String,
    viewableID: String
  ): ViewerItem = {
    val __obj = js.Dynamic.literal(guid = guid.asInstanceOf[js.Any], hasThumbnail = hasThumbnail.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], viewableID = viewableID.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewerItem]
  }
  
  extension [Self <: ViewerItem](x: Self) {
    
    inline def setChildren(value: js.Array[ViewerItem]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: ViewerItem*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setGuid(value: String): Self = StObject.set(x, "guid", value.asInstanceOf[js.Any])
    
    inline def setHasThumbnail(value: Boolean): Self = StObject.set(x, "hasThumbnail", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParent(value: ViewerItem): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setProgress(value: String): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setRole(value: `3d` | `2d` | String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: String): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setType(value: view | geometry | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setViewableID(value: String): Self = StObject.set(x, "viewableID", value.asInstanceOf[js.Any])
  }
}

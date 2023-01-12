package typings.expoConfigTypes.anon

import typings.expoConfigTypes.mod.PublishHook
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostExport extends StObject {
  
  var postExport: js.UndefOr[js.Array[PublishHook]] = js.undefined
  
  var postPublish: js.UndefOr[js.Array[PublishHook]] = js.undefined
}
object PostExport {
  
  inline def apply(): PostExport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PostExport]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PostExport] (val x: Self) extends AnyVal {
    
    inline def setPostExport(value: js.Array[PublishHook]): Self = StObject.set(x, "postExport", value.asInstanceOf[js.Any])
    
    inline def setPostExportUndefined: Self = StObject.set(x, "postExport", js.undefined)
    
    inline def setPostExportVarargs(value: PublishHook*): Self = StObject.set(x, "postExport", js.Array(value*))
    
    inline def setPostPublish(value: js.Array[PublishHook]): Self = StObject.set(x, "postPublish", value.asInstanceOf[js.Any])
    
    inline def setPostPublishUndefined: Self = StObject.set(x, "postPublish", js.undefined)
    
    inline def setPostPublishVarargs(value: PublishHook*): Self = StObject.set(x, "postPublish", js.Array(value*))
  }
}

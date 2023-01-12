package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesRepositoryLocation extends StObject {
  
  var base_path: String
  
  var bucket: js.UndefOr[String] = js.undefined
  
  var container: js.UndefOr[String] = js.undefined
}
object NodesRepositoryLocation {
  
  inline def apply(base_path: String): NodesRepositoryLocation = {
    val __obj = js.Dynamic.literal(base_path = base_path.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesRepositoryLocation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodesRepositoryLocation] (val x: Self) extends AnyVal {
    
    inline def setBase_path(value: String): Self = StObject.set(x, "base_path", value.asInstanceOf[js.Any])
    
    inline def setBucket(value: String): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    inline def setBucketUndefined: Self = StObject.set(x, "bucket", js.undefined)
    
    inline def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
  }
}

package typings.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped gatsby-plugin-utils.gatsby-plugin-utils/dist/utils/plugin-options-schema-joi-type.ReferenceOptions extends 'prefix' ? never : gatsby-plugin-utils.gatsby-plugin-utils/dist/utils/plugin-options-schema-joi-type.ReferenceOptions */ @js.native
trait Reference extends StObject {
  
  var depth: Double = js.native
  
  var display: String = js.native
  
  var key: String = js.native
  
  var path: js.Array[String] = js.native
  
  var root: String = js.native
  
  var `type`: String = js.native
}
object Reference {
  
  @scala.inline
  def apply(depth: Double, display: String, key: String, path: js.Array[String], root: String, `type`: String): Reference = {
    val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reference]
  }
  
  @scala.inline
  implicit class ReferenceMutableBuilder[Self <: Reference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplay(value: String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: js.Array[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathVarargs(value: String*): Self = StObject.set(x, "path", js.Array(value :_*))
    
    @scala.inline
    def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

package typings.esmUtils

import typings.esmUtils.mod.JsonValue
import typings.node.NodeRequire
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Dirname extends StObject {
    
    var __dirname: String
    
    var __filename: String
    
    var dirname: String
    
    var filename: String
    
    var json: Load
    
    def require(id: String): Any
    @JSName("require")
    var require_Original: NodeRequire
  }
  object Dirname {
    
    inline def apply(
      __dirname: String,
      __filename: String,
      dirname: String,
      filename: String,
      json: Load,
      require: NodeRequire
    ): Dirname = {
      val __obj = js.Dynamic.literal(__dirname = __dirname.asInstanceOf[js.Any], __filename = __filename.asInstanceOf[js.Any], dirname = dirname.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], require = require.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dirname]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Dirname] (val x: Self) extends AnyVal {
      
      inline def setDirname(value: String): Self = StObject.set(x, "dirname", value.asInstanceOf[js.Any])
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setJson(value: Load): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setRequire(value: NodeRequire): Self = StObject.set(x, "require", value.asInstanceOf[js.Any])
      
      inline def set__dirname(value: String): Self = StObject.set(x, "__dirname", value.asInstanceOf[js.Any])
      
      inline def set__filename(value: String): Self = StObject.set(x, "__filename", value.asInstanceOf[js.Any])
    }
  }
  
  trait Load extends StObject {
    
    def load(file: String): js.Promise[JsonValue]
    
    def loadSync(file: String): JsonValue
  }
  object Load {
    
    inline def apply(load: String => js.Promise[JsonValue], loadSync: String => JsonValue): Load = {
      val __obj = js.Dynamic.literal(load = js.Any.fromFunction1(load), loadSync = js.Any.fromFunction1(loadSync))
      __obj.asInstanceOf[Load]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Load] (val x: Self) extends AnyVal {
      
      inline def setLoad(value: String => js.Promise[JsonValue]): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
      
      inline def setLoadSync(value: String => JsonValue): Self = StObject.set(x, "loadSync", js.Any.fromFunction1(value))
    }
  }
}

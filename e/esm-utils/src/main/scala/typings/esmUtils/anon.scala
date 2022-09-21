package typings.esmUtils

import typings.esmUtils.mod.JsonValue
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
    
    var require: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof require */ Any
  }
  object Dirname {
    
    inline def apply(
      __dirname: String,
      __filename: String,
      dirname: String,
      filename: String,
      json: Load,
      require: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof require */ Any
    ): Dirname = {
      val __obj = js.Dynamic.literal(__dirname = __dirname.asInstanceOf[js.Any], __filename = __filename.asInstanceOf[js.Any], dirname = dirname.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], require = require.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dirname]
    }
    
    extension [Self <: Dirname](x: Self) {
      
      inline def setDirname(value: String): Self = StObject.set(x, "dirname", value.asInstanceOf[js.Any])
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setJson(value: Load): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setRequire(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof require */ Any): Self = StObject.set(x, "require", value.asInstanceOf[js.Any])
      
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
    
    extension [Self <: Load](x: Self) {
      
      inline def setLoad(value: String => js.Promise[JsonValue]): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
      
      inline def setLoadSync(value: String => JsonValue): Self = StObject.set(x, "loadSync", js.Any.fromFunction1(value))
    }
  }
}

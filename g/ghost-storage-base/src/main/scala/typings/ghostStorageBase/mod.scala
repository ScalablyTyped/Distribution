package typings.ghostStorageBase

import typings.express.mod.Handler
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* note: abstract class */ @JSImport("ghost-storage-base", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with StorageBase
  
  trait Image extends StObject {
    
    var name: String
    
    var path: String
    
    var `type`: String
  }
  object Image {
    
    inline def apply(name: String, path: String, `type`: String): Image = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Image]
    }
    
    extension [Self <: Image](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReadOptions extends StObject {
    
    var path: String
  }
  object ReadOptions {
    
    inline def apply(path: String): ReadOptions = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadOptions]
    }
    
    extension [Self <: ReadOptions](x: Self) {
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StorageBase extends StObject {
    
    def delete(fileName: String): js.Promise[Boolean] = js.native
    def delete(fileName: String, targetDir: String): js.Promise[Boolean] = js.native
    
    def exists(fileName: String): js.Promise[Boolean] = js.native
    def exists(fileName: String, targetDir: String): js.Promise[Boolean] = js.native
    
    def getSanitizedFileName(fileName: String): String = js.native
    
    def getTargetDir(): String = js.native
    def getTargetDir(baseDir: String): String = js.native
    
    def getUniqueFileName(image: Image, targetDir: String): String = js.native
    
    def read(): js.Promise[Buffer] = js.native
    def read(options: ReadOptions): js.Promise[Buffer] = js.native
    
    def save(image: Image): js.Promise[String] = js.native
    def save(image: Image, targetDir: String): js.Promise[String] = js.native
    
    def serve(): Handler = js.native
  }
}

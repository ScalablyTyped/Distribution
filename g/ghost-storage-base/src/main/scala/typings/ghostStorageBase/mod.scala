package typings.ghostStorageBase

import typings.express.mod.Handler
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ghost-storage-base", JSImport.Namespace)
  @js.native
  abstract class ^ ()
    extends StObject
       with StorageBase
  
  trait Image extends StObject {
    
    var name: String
    
    var path: String
    
    var `type`: String
  }
  object Image {
    
    @scala.inline
    def apply(name: String, path: String, `type`: String): Image = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Image]
    }
    
    @scala.inline
    implicit class ImageMutableBuilder[Self <: Image] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReadOptions extends StObject {
    
    var path: String
  }
  object ReadOptions {
    
    @scala.inline
    def apply(path: String): ReadOptions = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadOptions]
    }
    
    @scala.inline
    implicit class ReadOptionsMutableBuilder[Self <: ReadOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
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

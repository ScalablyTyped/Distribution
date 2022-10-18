package typings.formdataNode

import typings.formdataNode.`@typeFileMod`.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `@typeFileFromPathMod` {
  
  @JSImport("formdata-node/@type/fileFromPath", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fileFromPath(path: String): js.Promise[File] = ^.asInstanceOf[js.Dynamic].applyDynamic("fileFromPath")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[File]]
  inline def fileFromPath(path: String, filename: String): js.Promise[File] = (^.asInstanceOf[js.Dynamic].applyDynamic("fileFromPath")(path.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[js.Promise[File]]
  inline def fileFromPath(path: String, filename: String, options: FileFromPathOptions): js.Promise[File] = (^.asInstanceOf[js.Dynamic].applyDynamic("fileFromPath")(path.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[File]]
  inline def fileFromPath(path: String, filename: Unit, options: FileFromPathOptions): js.Promise[File] = (^.asInstanceOf[js.Dynamic].applyDynamic("fileFromPath")(path.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[File]]
  inline def fileFromPath(path: String, options: FileFromPathOptions): js.Promise[File] = (^.asInstanceOf[js.Dynamic].applyDynamic("fileFromPath")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[File]]
  
  inline def fileFromPathSync(path: String): File = ^.asInstanceOf[js.Dynamic].applyDynamic("fileFromPathSync")(path.asInstanceOf[js.Any]).asInstanceOf[File]
  inline def fileFromPathSync(path: String, filename: String): File = (^.asInstanceOf[js.Dynamic].applyDynamic("fileFromPathSync")(path.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[File]
  inline def fileFromPathSync(path: String, filename: String, options: FileFromPathOptions): File = (^.asInstanceOf[js.Dynamic].applyDynamic("fileFromPathSync")(path.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[File]
  inline def fileFromPathSync(path: String, filename: Unit, options: FileFromPathOptions): File = (^.asInstanceOf[js.Dynamic].applyDynamic("fileFromPathSync")(path.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[File]
  inline def fileFromPathSync(path: String, options: FileFromPathOptions): File = (^.asInstanceOf[js.Dynamic].applyDynamic("fileFromPathSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[File]
  
  inline def isFile(value: Any): /* is formdata-node.formdata-node/@type/File.File */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFile")(value.asInstanceOf[js.Any]).asInstanceOf[/* is formdata-node.formdata-node/@type/File.File */ Boolean]
  
  /* Inlined std.Omit<formdata-node.formdata-node/@type/File.FilePropertyBag, 'lastModified'> */
  trait FileFromPathOptions extends StObject {
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object FileFromPathOptions {
    
    inline def apply(): FileFromPathOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FileFromPathOptions]
    }
    
    extension [Self <: FileFromPathOptions](x: Self) {
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}

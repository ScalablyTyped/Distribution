package typings.formdataNode

import typings.formdataNode.`@typeFileFromPathMod`.FileFromPathOptions
import typings.formdataNode.`@typeFileMod`.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object fileFromPathMod {
  
  @JSImport("formdata-node/file-from-path", JSImport.Namespace)
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
}

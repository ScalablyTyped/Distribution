package typings.fileServicesNode

import typings.fileServicesNode.distNodeFsMod.ICreateNodeFsOptions
import typings.fileServicesNode.distWatchServiceMod.INodeWatchServiceOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMod {
  
  @JSImport("@file-services/node/dist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@file-services/node/dist", JSImport.Default)
  @js.native
  val default: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IFileSystem */ Any = js.native
  
  @JSImport("@file-services/node/dist", "NodeWatchService")
  @js.native
  /**
    * Construct a new Node file system watch service
    */
  open class NodeWatchService ()
    extends typings.fileServicesNode.distWatchServiceMod.NodeWatchService {
    def this(options: INodeWatchServiceOptions) = this()
  }
  
  inline def createBaseNodeFs(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createBaseNodeFs")().asInstanceOf[Any]
  inline def createBaseNodeFs(options: ICreateNodeFsOptions): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createBaseNodeFs")(options.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def createNodeFs(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createNodeFs")().asInstanceOf[Any]
  inline def createNodeFs(options: ICreateNodeFsOptions): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createNodeFs")(options.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("@file-services/node/dist", "nodeFs")
  @js.native
  val nodeFs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IFileSystem */ Any = js.native
}

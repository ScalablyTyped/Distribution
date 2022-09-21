package typings.fileServicesNode

import typings.fileServicesNode.watchServiceMod.INodeWatchServiceOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeFsMod {
  
  @JSImport("@file-services/node/dist/node-fs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createBaseNodeFs(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createBaseNodeFs")().asInstanceOf[Any]
  inline def createBaseNodeFs(options: ICreateNodeFsOptions): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createBaseNodeFs")(options.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def createNodeFs(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createNodeFs")().asInstanceOf[Any]
  inline def createNodeFs(options: ICreateNodeFsOptions): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createNodeFs")(options.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  trait ICreateNodeFsOptions extends StObject {
    
    var watchOptions: js.UndefOr[INodeWatchServiceOptions] = js.undefined
  }
  object ICreateNodeFsOptions {
    
    inline def apply(): ICreateNodeFsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICreateNodeFsOptions]
    }
    
    extension [Self <: ICreateNodeFsOptions](x: Self) {
      
      inline def setWatchOptions(value: INodeWatchServiceOptions): Self = StObject.set(x, "watchOptions", value.asInstanceOf[js.Any])
      
      inline def setWatchOptionsUndefined: Self = StObject.set(x, "watchOptions", js.undefined)
    }
  }
}

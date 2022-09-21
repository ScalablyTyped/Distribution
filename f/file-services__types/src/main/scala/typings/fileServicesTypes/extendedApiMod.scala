package typings.fileServicesTypes

import typings.fileServicesTypes.baseApiAsyncMod.IBaseFileSystemCallbackActions
import typings.fileServicesTypes.extendedApiAsyncMod.IFileSystemPromiseActions
import typings.fileServicesTypes.extendedApiSyncMod.IFileSystemSync
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extendedApiMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.fileServicesTypes.pathMod.IFileSystemPath because Already inherited
  - typings.fileServicesTypes.baseApiAsyncMod.IBaseFileSystemAsync because var conflicts: caseSensitive, promises, watchService. Inlined 
  - typings.fileServicesTypes.extendedApiAsyncMod.IFileSystemAsync because var conflicts: caseSensitive, watchService. Inlined promises */ @js.native
  trait IFileSystem
    extends StObject
       with IFileSystemSync
       with IBaseFileSystemCallbackActions {
    
    var promises: IFileSystemPromiseActions = js.native
  }
}

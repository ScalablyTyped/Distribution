package typings.fileServicesTypes

import typings.fileServicesTypes.distBaseApiAsyncMod.IBaseFileSystemCallbackActions
import typings.fileServicesTypes.distExtendedApiAsyncMod.IFileSystemPromiseActions
import typings.fileServicesTypes.distExtendedApiSyncMod.IFileSystemSync
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distExtendedApiMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.fileServicesTypes.distPathMod.IFileSystemPath because Already inherited
  - typings.fileServicesTypes.distBaseApiAsyncMod.IBaseFileSystemAsync because var conflicts: caseSensitive, promises, watchService. Inlined 
  - typings.fileServicesTypes.distExtendedApiAsyncMod.IFileSystemAsync because var conflicts: caseSensitive, watchService. Inlined promises */ @js.native
  trait IFileSystem
    extends StObject
       with IFileSystemSync
       with IBaseFileSystemCallbackActions {
    
    var promises: IFileSystemPromiseActions = js.native
  }
}

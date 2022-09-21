package typings.fileServicesTypes

import typings.fileServicesTypes.baseApiAsyncMod.IBaseFileSystemCallbackActions
import typings.fileServicesTypes.baseApiAsyncMod.IBaseFileSystemPromiseActions
import typings.fileServicesTypes.baseApiSyncMod.IBaseFileSystemSync
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseApiMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.fileServicesTypes.pathMod.IFileSystemPath because Already inherited
  - typings.fileServicesTypes.baseApiAsyncMod.IBaseFileSystemAsync because var conflicts: caseSensitive, watchService. Inlined promises */ @js.native
  trait IBaseFileSystem
    extends StObject
       with IBaseFileSystemSync
       with IBaseFileSystemCallbackActions {
    
    var promises: IBaseFileSystemPromiseActions = js.native
  }
}

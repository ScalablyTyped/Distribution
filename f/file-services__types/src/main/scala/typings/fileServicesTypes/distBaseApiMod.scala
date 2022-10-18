package typings.fileServicesTypes

import typings.fileServicesTypes.distBaseApiAsyncMod.IBaseFileSystemCallbackActions
import typings.fileServicesTypes.distBaseApiAsyncMod.IBaseFileSystemPromiseActions
import typings.fileServicesTypes.distBaseApiSyncMod.IBaseFileSystemSync
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBaseApiMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.fileServicesTypes.distPathMod.IFileSystemPath because Already inherited
  - typings.fileServicesTypes.distBaseApiAsyncMod.IBaseFileSystemAsync because var conflicts: caseSensitive, watchService. Inlined promises */ @js.native
  trait IBaseFileSystem
    extends StObject
       with IBaseFileSystemSync
       with IBaseFileSystemCallbackActions {
    
    var promises: IBaseFileSystemPromiseActions = js.native
  }
}

package typings.fileServicesUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@file-services/utils/dist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@file-services/utils/dist", "SetMultiMap")
  @js.native
  open class SetMultiMap[K, V] ()
    extends typings.fileServicesUtils.setMultiMapMod.SetMultiMap[K, V]
  
  inline def createAsyncFileSystem(
    baseFs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IBaseFileSystemAsync */ Any
  ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createAsyncFileSystem")(baseFs.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def createExtendedFileSystemPromiseActions(
    baseFs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IBaseFileSystemAsync */ Any
  ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createExtendedFileSystemPromiseActions")(baseFs.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def createExtendedSyncActions(
    baseFs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IBaseFileSystemSync */ Any
  ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createExtendedSyncActions")(baseFs.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def createFileSystem(
    baseFs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IBaseFileSystem */ Any
  ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createFileSystem")(baseFs.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def createSyncFileSystem(
    baseFs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IBaseFileSystemSync */ Any
  ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createSyncFileSystem")(baseFs.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def syncToAsyncFs(
    syncFs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IBaseFileSystemSync */ Any
  ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("syncToAsyncFs")(syncFs.asInstanceOf[js.Any]).asInstanceOf[Any]
}

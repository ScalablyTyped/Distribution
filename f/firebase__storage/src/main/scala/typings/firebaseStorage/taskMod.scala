package typings.firebaseStorage

import typings.firebaseStorage.observerMod.CompleteFn
import typings.firebaseStorage.observerMod.ErrorFn
import typings.firebaseStorage.observerMod.Subscribe
import typings.firebaseStorage.observerMod.Unsubscribe
import typings.firebaseStorage.referenceMod.ReferenceCompat
import typings.firebaseStorage.taskenumsMod.TaskEvent
import typings.firebaseStorage.tasksnapshotMod.UploadTaskSnapshotCompat
import typings.firebaseStorageTypes.mod.UploadTask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object taskMod {
  
  @JSImport("@firebase/storage/dist/compat/task", "UploadTaskCompat")
  @js.native
  class UploadTaskCompat protected () extends UploadTask {
    def this(_delegate: typings.firebaseStorage.srcTaskMod.UploadTask, _ref: ReferenceCompat) = this()
    
    val _delegate: js.Any = js.native
    
    val _ref: js.Any = js.native
    
    val _snapshot: js.Any = js.native
    
    def on(
      `type`: TaskEvent,
      nextOrObserver: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify types.StorageObserver<UploadTaskSnapshotCompat> */ js.Any
    ): Unsubscribe | Subscribe[UploadTaskSnapshotCompat] = js.native
    def on(
      `type`: TaskEvent,
      nextOrObserver: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify types.StorageObserver<UploadTaskSnapshotCompat> */ js.Any,
      error: js.UndefOr[scala.Nothing],
      completed: CompleteFn
    ): Unsubscribe | Subscribe[UploadTaskSnapshotCompat] = js.native
    def on(
      `type`: TaskEvent,
      nextOrObserver: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify types.StorageObserver<UploadTaskSnapshotCompat> */ js.Any,
      error: Null,
      completed: CompleteFn
    ): Unsubscribe | Subscribe[UploadTaskSnapshotCompat] = js.native
    def on(
      `type`: TaskEvent,
      nextOrObserver: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify types.StorageObserver<UploadTaskSnapshotCompat> */ js.Any,
      error: ErrorFn
    ): Unsubscribe | Subscribe[UploadTaskSnapshotCompat] = js.native
    def on(
      `type`: TaskEvent,
      nextOrObserver: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify types.StorageObserver<UploadTaskSnapshotCompat> */ js.Any,
      error: ErrorFn,
      completed: CompleteFn
    ): Unsubscribe | Subscribe[UploadTaskSnapshotCompat] = js.native
    
    @JSName("snapshot")
    def snapshot_MUploadTaskCompat: UploadTaskSnapshotCompat = js.native
  }
}

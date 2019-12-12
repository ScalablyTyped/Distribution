package typings.atFirebaseStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distSrcImplementationObserverMod {
  import typings.atFirebaseStorage.distSrcImplementationErrorMod.FirebaseStorageError
  import typings.std.Error

  type CompleteFn = js.Function0[Unit]
  type ErrorFn = js.Function1[/* error */ Error | FirebaseStorageError, Unit]
  type NextFn[T] = js.Function1[/* value */ T, Unit]
  type Subscribe[T] = js.Function3[
    /* next */ js.UndefOr[NextFn[T] | StorageObserver[T] | Null], 
    /* error */ js.UndefOr[ErrorFn | Null], 
    /* complete */ js.UndefOr[CompleteFn | Null], 
    Unsubscribe
  ]
  type Unsubscribe = js.Function0[Unit]
}

package typings.firebaseFirestoreTypes.mod

import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoadBundleTask
  extends StObject
     with PromiseLike[LoadBundleTaskProgress] {
  
  def `catch`[R](onRejected: js.Function1[/* a */ js.Error, R | PromiseLike[R]]): js.Promise[R | LoadBundleTaskProgress] = js.native
  
  def onProgress(): Unit = js.native
  def onProgress(next: js.Function1[/* progress */ LoadBundleTaskProgress, Any]): Unit = js.native
  def onProgress(
    next: js.Function1[/* progress */ LoadBundleTaskProgress, Any],
    error: js.Function1[/* error */ js.Error, Any]
  ): Unit = js.native
  def onProgress(
    next: js.Function1[/* progress */ LoadBundleTaskProgress, Any],
    error: js.Function1[/* error */ js.Error, Any],
    complete: js.Function0[Unit]
  ): Unit = js.native
  def onProgress(
    next: js.Function1[/* progress */ LoadBundleTaskProgress, Any],
    error: Unit,
    complete: js.Function0[Unit]
  ): Unit = js.native
  def onProgress(next: Unit, error: js.Function1[/* error */ js.Error, Any]): Unit = js.native
  def onProgress(next: Unit, error: js.Function1[/* error */ js.Error, Any], complete: js.Function0[Unit]): Unit = js.native
  def onProgress(next: Unit, error: Unit, complete: js.Function0[Unit]): Unit = js.native
}

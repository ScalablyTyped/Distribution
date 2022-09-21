package typings.flashpointLauncher.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("flashpoint-launcher", "DisposableChildProcess")
@js.native
open class DisposableChildProcess protected ()
  extends ManagedChildProcess
     with Disposable {
  def this(id: String, name: String, cwd: String, opts: ProcessOpts, info: ProcessInfo) = this()
  
  /** Whether this is already disposed */
  /* CompleteClass */
  var isDisposed: Boolean = js.native
  
  @JSName("onDispose")
  var onDispose_DisposableChildProcess: js.UndefOr[js.Function0[js.UndefOr[Unit]]] = js.native
  
  /** Children to dispose of in the future. Add with {@link registerDisposable} to maintain safety. */
  /* CompleteClass */
  var toDispose: js.Array[Disposable] = js.native
}

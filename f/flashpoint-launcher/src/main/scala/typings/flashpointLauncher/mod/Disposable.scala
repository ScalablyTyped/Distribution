package typings.flashpointLauncher.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A self-nesting type that allows one time disposable with an optional callback */
trait Disposable extends StObject {
  
  /** Whether this is already disposed */
  var isDisposed: Boolean
  
  /** Callback to use when disposed */
  var onDispose: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** Children to dispose of in the future. Add with {@link registerDisposable} to maintain safety. */
  var toDispose: js.Array[Disposable]
}
object Disposable {
  
  inline def apply(isDisposed: Boolean, toDispose: js.Array[Disposable]): Disposable = {
    val __obj = js.Dynamic.literal(isDisposed = isDisposed.asInstanceOf[js.Any], toDispose = toDispose.asInstanceOf[js.Any])
    __obj.asInstanceOf[Disposable]
  }
  
  extension [Self <: Disposable](x: Self) {
    
    inline def setIsDisposed(value: Boolean): Self = StObject.set(x, "isDisposed", value.asInstanceOf[js.Any])
    
    inline def setOnDispose(value: () => Unit): Self = StObject.set(x, "onDispose", js.Any.fromFunction0(value))
    
    inline def setOnDisposeUndefined: Self = StObject.set(x, "onDispose", js.undefined)
    
    inline def setToDispose(value: js.Array[Disposable]): Self = StObject.set(x, "toDispose", value.asInstanceOf[js.Any])
    
    inline def setToDisposeVarargs(value: Disposable*): Self = StObject.set(x, "toDispose", js.Array(value*))
  }
}

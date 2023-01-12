package typings.esbuildWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatchMode extends StObject {
  
  var onRebuild: js.UndefOr[
    js.Function2[/* error */ BuildFailure | Null, /* result */ BuildResult | Null, Unit]
  ] = js.undefined
}
object WatchMode {
  
  inline def apply(): WatchMode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WatchMode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WatchMode] (val x: Self) extends AnyVal {
    
    inline def setOnRebuild(value: (/* error */ BuildFailure | Null, /* result */ BuildResult | Null) => Unit): Self = StObject.set(x, "onRebuild", js.Any.fromFunction2(value))
    
    inline def setOnRebuildUndefined: Self = StObject.set(x, "onRebuild", js.undefined)
  }
}

package typings.flashpointLauncher.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZipExtractOptions extends StObject {
  
  var onData: js.UndefOr[js.Function1[/* data */ ZipData, Unit]] = js.undefined
  
  var onProgress: js.UndefOr[js.Function1[/* progress */ ZipProgress, Unit]] = js.undefined
}
object ZipExtractOptions {
  
  inline def apply(): ZipExtractOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZipExtractOptions]
  }
  
  extension [Self <: ZipExtractOptions](x: Self) {
    
    inline def setOnData(value: /* data */ ZipData => Unit): Self = StObject.set(x, "onData", js.Any.fromFunction1(value))
    
    inline def setOnDataUndefined: Self = StObject.set(x, "onData", js.undefined)
    
    inline def setOnProgress(value: /* progress */ ZipProgress => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction1(value))
    
    inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
  }
}

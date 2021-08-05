package typings.extractZip

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(zipPath: String, opts: Options, cb: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = (^.asInstanceOf[js.Dynamic].apply(zipPath.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("extract-zip", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var defaultDirMode: js.UndefOr[Double] = js.undefined
    
    var defaultFileMode: js.UndefOr[Double] = js.undefined
    
    var dir: js.UndefOr[String] = js.undefined
    
    var onEntry: js.UndefOr[js.Function2[/* entry */ js.Any, /* zipfile */ js.Any, Unit]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDefaultDirMode(value: Double): Self = StObject.set(x, "defaultDirMode", value.asInstanceOf[js.Any])
      
      inline def setDefaultDirModeUndefined: Self = StObject.set(x, "defaultDirMode", js.undefined)
      
      inline def setDefaultFileMode(value: Double): Self = StObject.set(x, "defaultFileMode", value.asInstanceOf[js.Any])
      
      inline def setDefaultFileModeUndefined: Self = StObject.set(x, "defaultFileMode", js.undefined)
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      inline def setOnEntry(value: (/* entry */ js.Any, /* zipfile */ js.Any) => Unit): Self = StObject.set(x, "onEntry", js.Any.fromFunction2(value))
      
      inline def setOnEntryUndefined: Self = StObject.set(x, "onEntry", js.undefined)
    }
  }
}

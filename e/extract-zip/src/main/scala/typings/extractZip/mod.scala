package typings.extractZip

import typings.yauzl.mod.Entry
import typings.yauzl.mod.ZipFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(zipPath: String, opts: Options): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].apply(zipPath.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @JSImport("extract-zip", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var defaultDirMode: js.UndefOr[Double] = js.undefined
    
    var defaultFileMode: js.UndefOr[Double] = js.undefined
    
    var dir: String
    
    var onEntry: js.UndefOr[js.Function2[/* entry */ Entry, /* zipfile */ ZipFile, Unit]] = js.undefined
  }
  object Options {
    
    inline def apply(dir: String): Options = {
      val __obj = js.Dynamic.literal(dir = dir.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setDefaultDirMode(value: Double): Self = StObject.set(x, "defaultDirMode", value.asInstanceOf[js.Any])
      
      inline def setDefaultDirModeUndefined: Self = StObject.set(x, "defaultDirMode", js.undefined)
      
      inline def setDefaultFileMode(value: Double): Self = StObject.set(x, "defaultFileMode", value.asInstanceOf[js.Any])
      
      inline def setDefaultFileModeUndefined: Self = StObject.set(x, "defaultFileMode", js.undefined)
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setOnEntry(value: (/* entry */ Entry, /* zipfile */ ZipFile) => Unit): Self = StObject.set(x, "onEntry", js.Any.fromFunction2(value))
      
      inline def setOnEntryUndefined: Self = StObject.set(x, "onEntry", js.undefined)
    }
  }
}

package typings.electronPublish

import typings.electronPublish.progressMod.ProgressBar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object multiProgressMod {
  
  @JSImport("electron-publish/out/multiProgress", "MultiProgress")
  @js.native
  open class MultiProgress () extends StObject {
    
    /* private */ var allocateLines: Any = js.native
    
    /* private */ var barCount: Any = js.native
    
    def createBar(format: String, options: Any): ProgressBar = js.native
    
    /* private */ var cursor: Any = js.native
    
    /* private */ var isLogListenerAdded: Any = js.native
    
    /* private */ var moveCursor: Any = js.native
    
    /* private */ val stream: Any = js.native
    
    def terminate(): Unit = js.native
    
    /* private */ var totalLines: Any = js.native
  }
}

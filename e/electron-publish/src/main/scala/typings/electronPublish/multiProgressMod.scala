package typings.electronPublish

import typings.electronPublish.progressMod.ProgressBar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object multiProgressMod {
  
  @JSImport("electron-publish/out/multiProgress", "MultiProgress")
  @js.native
  class MultiProgress () extends StObject {
    
    /* private */ var allocateLines: js.Any = js.native
    
    /* private */ var barCount: js.Any = js.native
    
    def createBar(format: String, options: js.Any): ProgressBar = js.native
    
    /* private */ var cursor: js.Any = js.native
    
    /* private */ var isLogListenerAdded: js.Any = js.native
    
    /* private */ var moveCursor: js.Any = js.native
    
    /* private */ val stream: js.Any = js.native
    
    def terminate(): Unit = js.native
    
    /* private */ var totalLines: js.Any = js.native
  }
}

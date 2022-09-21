package typings.firebaseAuth

import typings.firebaseAuth.firebaseAuthStrings.gapiDotiframes
import typings.firebaseAuth.gapi.LoadCallback
import typings.firebaseAuth.gapi.LoadOptions
import typings.firebaseAuth.gapi.iframes.IframesFilter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    @JSGlobal("gapi")
    @js.native
    val ^ : js.Any = js.native
    
    object iframes {
      
      @JSGlobal("gapi.iframes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("gapi.iframes.CROSS_ORIGIN_IFRAMES_FILTER")
      @js.native
      val CROSS_ORIGIN_IFRAMES_FILTER: IframesFilter = js.native
      
      @JSGlobal("gapi.iframes.Context")
      @js.native
      open class Context ()
        extends StObject
           with typings.firebaseAuth.gapi.iframes.Context
      
      @JSGlobal("gapi.iframes.Iframe")
      @js.native
      open class Iframe ()
        extends StObject
           with typings.firebaseAuth.gapi.iframes.Iframe
      
      inline def getContext(): typings.firebaseAuth.gapi.iframes.Context = ^.asInstanceOf[js.Dynamic].applyDynamic("getContext")().asInstanceOf[typings.firebaseAuth.gapi.iframes.Context]
    }
    
    inline def load_gapiiframes(features: gapiDotiframes): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(features.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def load_gapiiframes(features: gapiDotiframes, options: LoadCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(features.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def load_gapiiframes(features: gapiDotiframes, options: LoadOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(features.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}

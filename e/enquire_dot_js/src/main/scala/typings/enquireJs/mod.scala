package typings.enquireJs

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("enquire.js", JSImport.Namespace)
  @js.native
  val ^ : EnquireJs = js.native
  
  type Callback = js.Function0[Unit]
  
  @js.native
  trait EnquireJs extends StObject {
    
    def register(mediaQuery: String, options: js.Array[Options]): EnquireJs = js.native
    def register(mediaQuery: String, options: js.Array[Options], shouldDegrade: Boolean): EnquireJs = js.native
    def register(mediaQuery: String, options: Callback): EnquireJs = js.native
    def register(mediaQuery: String, options: Callback, shouldDegrade: Boolean): EnquireJs = js.native
    def register(mediaQuery: String, options: Options): EnquireJs = js.native
    def register(mediaQuery: String, options: Options, shouldDegrade: Boolean): EnquireJs = js.native
    
    def unregister(mediaQuery: String): Unit = js.native
    def unregister(mediaQuery: String, handler: Callback): Unit = js.native
    def unregister(mediaQuery: String, handler: Options): Unit = js.native
  }
  
  trait Options extends StObject {
    
    /**
      * If set to true, defers execution of the setup function until the first time the media query is matched
      */
    var deferSetup: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If supplied, triggered when handler is unregistered. Place cleanup code here
      */
    var destroy: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * If supplied, triggered when a media query matches.
      */
    var `match`: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * If supplied, triggered once, when the handler is registered.
      */
    var setup: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * If supplied, triggered when the media query transitions from a matched state to an unmatched state.
      */
    var unmatch: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setDeferSetup(value: Boolean): Self = StObject.set(x, "deferSetup", value.asInstanceOf[js.Any])
      
      inline def setDeferSetupUndefined: Self = StObject.set(x, "deferSetup", js.undefined)
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      inline def setMatch(value: () => Unit): Self = StObject.set(x, "match", js.Any.fromFunction0(value))
      
      inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
      
      inline def setSetup(value: () => Unit): Self = StObject.set(x, "setup", js.Any.fromFunction0(value))
      
      inline def setSetupUndefined: Self = StObject.set(x, "setup", js.undefined)
      
      inline def setUnmatch(value: () => Unit): Self = StObject.set(x, "unmatch", js.Any.fromFunction0(value))
      
      inline def setUnmatchUndefined: Self = StObject.set(x, "unmatch", js.undefined)
    }
  }
  
  type _To = EnquireJs
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: EnquireJs = ^
}

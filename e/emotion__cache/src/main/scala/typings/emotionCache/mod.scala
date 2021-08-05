package typings.emotionCache

import typings.emotionStylis.mod.Plugin
import typings.emotionStylis.mod.Prefix
import typings.emotionStylis.mod.PrefixContext
import typings.emotionUtils.mod.EmotionCache
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@emotion/cache", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): EmotionCache = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[EmotionCache]
  inline def default(options: Options): EmotionCache = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[EmotionCache]
  
  trait Options extends StObject {
    
    var container: js.UndefOr[HTMLElement] = js.undefined
    
    var key: js.UndefOr[String] = js.undefined
    
    var nonce: js.UndefOr[String] = js.undefined
    
    var prefix: js.UndefOr[Prefix] = js.undefined
    
    var speedy: js.UndefOr[Boolean] = js.undefined
    
    var stylisPlugins: js.UndefOr[Plugin | js.Array[Plugin]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setContainer(value: HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      inline def setPrefix(value: Prefix): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixFunction3(value: (/* key */ String, /* value */ String, /* context */ PrefixContext) => Boolean): Self = StObject.set(x, "prefix", js.Any.fromFunction3(value))
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setSpeedy(value: Boolean): Self = StObject.set(x, "speedy", value.asInstanceOf[js.Any])
      
      inline def setSpeedyUndefined: Self = StObject.set(x, "speedy", js.undefined)
      
      inline def setStylisPlugins(value: Plugin | js.Array[Plugin]): Self = StObject.set(x, "stylisPlugins", value.asInstanceOf[js.Any])
      
      inline def setStylisPluginsUndefined: Self = StObject.set(x, "stylisPlugins", js.undefined)
      
      inline def setStylisPluginsVarargs(value: Plugin*): Self = StObject.set(x, "stylisPlugins", js.Array(value :_*))
    }
  }
}

package typings.emotionCache

import typings.emotionStylis.mod.Plugin
import typings.emotionStylis.mod.Prefix
import typings.emotionStylis.mod.PrefixContext
import typings.emotionUtils.mod.EmotionCache
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@emotion/cache", JSImport.Default)
  @js.native
  def default(): EmotionCache = js.native
  @JSImport("@emotion/cache", JSImport.Default)
  @js.native
  def default(options: Options): EmotionCache = js.native
  
  @js.native
  trait Options extends StObject {
    
    var container: js.UndefOr[HTMLElement] = js.native
    
    var key: js.UndefOr[String] = js.native
    
    var nonce: js.UndefOr[String] = js.native
    
    var prefix: js.UndefOr[Prefix] = js.native
    
    var speedy: js.UndefOr[Boolean] = js.native
    
    var stylisPlugins: js.UndefOr[Plugin | js.Array[Plugin]] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainer(value: HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      @scala.inline
      def setPrefix(value: Prefix): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixFunction3(value: (/* key */ String, /* value */ String, /* context */ PrefixContext) => Boolean): Self = StObject.set(x, "prefix", js.Any.fromFunction3(value))
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setSpeedy(value: Boolean): Self = StObject.set(x, "speedy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpeedyUndefined: Self = StObject.set(x, "speedy", js.undefined)
      
      @scala.inline
      def setStylisPlugins(value: Plugin | js.Array[Plugin]): Self = StObject.set(x, "stylisPlugins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylisPluginsUndefined: Self = StObject.set(x, "stylisPlugins", js.undefined)
      
      @scala.inline
      def setStylisPluginsVarargs(value: Plugin*): Self = StObject.set(x, "stylisPlugins", js.Array(value :_*))
    }
  }
}

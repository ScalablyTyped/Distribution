package typings.emotionSheet

import typings.std.Element
import typings.std.HTMLElement
import typings.std.HTMLStyleElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@emotion/sheet", "StyleSheet")
  @js.native
  class StyleSheet () extends StObject {
    def this(options: Options) = this()
    
    var before: js.UndefOr[Element | Null] = js.native
    
    var container: HTMLElement = js.native
    
    var ctr: Double = js.native
    
    def flush(): Unit = js.native
    
    def insert(rule: String): Unit = js.native
    
    var isSpeedy: Boolean = js.native
    
    var key: String = js.native
    
    var maxLength: Double = js.native
    
    var nonce: js.UndefOr[String] = js.native
    
    var tags: js.Array[HTMLStyleElement] = js.native
  }
  
  trait Options extends StObject {
    
    var container: HTMLElement
    
    var key: String
    
    var nonce: js.UndefOr[String] = js.undefined
    
    var speedy: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(container: HTMLElement, key: String): Options = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainer(value: HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      @scala.inline
      def setSpeedy(value: Boolean): Self = StObject.set(x, "speedy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpeedyUndefined: Self = StObject.set(x, "speedy", js.undefined)
    }
  }
}

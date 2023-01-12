package typings.emotionSheet

import typings.std.ChildNode
import typings.std.HTMLElement
import typings.std.HTMLStyleElement
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@emotion/sheet", "StyleSheet")
  @js.native
  open class StyleSheet () extends StObject {
    def this(options: Options) = this()
    
    var before: js.UndefOr[ChildNode | Null] = js.native
    
    var container: Node = js.native
    
    var ctr: Double = js.native
    
    def flush(): Unit = js.native
    
    def hydrate(nodes: js.Array[HTMLStyleElement]): Unit = js.native
    
    def insert(rule: String): Unit = js.native
    
    var isSpeedy: Boolean = js.native
    
    var key: String = js.native
    
    var nonce: js.UndefOr[String] = js.native
    
    var tags: js.Array[HTMLStyleElement] = js.native
  }
  
  trait Options extends StObject {
    
    var container: Node
    
    var insertionPoint: js.UndefOr[HTMLElement] = js.undefined
    
    var key: String
    
    var nonce: js.UndefOr[String] = js.undefined
    
    /** @deprecate use `insertionPoint` instead */
    var prepend: js.UndefOr[Boolean] = js.undefined
    
    var speedy: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(container: Node, key: String): Options = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setContainer(value: Node): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setInsertionPoint(value: HTMLElement): Self = StObject.set(x, "insertionPoint", value.asInstanceOf[js.Any])
      
      inline def setInsertionPointUndefined: Self = StObject.set(x, "insertionPoint", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      inline def setPrepend(value: Boolean): Self = StObject.set(x, "prepend", value.asInstanceOf[js.Any])
      
      inline def setPrependUndefined: Self = StObject.set(x, "prepend", js.undefined)
      
      inline def setSpeedy(value: Boolean): Self = StObject.set(x, "speedy", value.asInstanceOf[js.Any])
      
      inline def setSpeedyUndefined: Self = StObject.set(x, "speedy", js.undefined)
    }
  }
}

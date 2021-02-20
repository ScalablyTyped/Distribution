package typings.getImageColors

import typings.chromaJs.mod.Color
import typings.node.Buffer
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("get-image-colors", JSImport.Namespace)
  @js.native
  def apply(input: String): js.Promise[js.Array[Color]] = js.native
  @JSImport("get-image-colors", JSImport.Namespace)
  @js.native
  def apply(input: String, callback: Callback): Unit = js.native
  @JSImport("get-image-colors", JSImport.Namespace)
  @js.native
  def apply(input: String, options: Options): js.Promise[js.Array[Color]] = js.native
  /**
    * Extract colors from images. Supports GIF, JPG, PNG, and even SVG!
    */
  @JSImport("get-image-colors", JSImport.Namespace)
  @js.native
  def apply(input: Buffer, options: Options, callback: js.Array[Color]): Unit = js.native
  @JSImport("get-image-colors", JSImport.Namespace)
  @js.native
  def apply(input: Buffer, `type`: String): js.Promise[js.Array[Color]] = js.native
  @JSImport("get-image-colors", JSImport.Namespace)
  @js.native
  def apply(input: Buffer, `type`: String, callback: Callback): Unit = js.native
  
  /**
    * If you don't like promises, you can use node-style callbacks too
    */
  type Callback = js.Function2[/* error */ Error | Null, /* colors */ js.Array[Color], Unit]
  
  @js.native
  trait Options extends StObject {
    
    /**
      * @default 5
      */
    var count: js.UndefOr[Double] = js.native
    
    var `type`: js.UndefOr[String] = js.native
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
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}

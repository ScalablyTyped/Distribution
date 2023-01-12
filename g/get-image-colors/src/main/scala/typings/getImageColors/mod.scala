package typings.getImageColors

import typings.chromaJs.mod.Color
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(input: String): js.Promise[js.Array[Color]] = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Color]]]
  inline def apply(input: String, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(input: String, options: Options): js.Promise[js.Array[Color]] = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Color]]]
  /**
    * Extract colors from images. Supports GIF, JPG, PNG, and even SVG!
    */
  inline def apply(input: Buffer, options: Options, callback: js.Array[Color]): Unit = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(input: Buffer, `type`: String): js.Promise[js.Array[Color]] = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Color]]]
  inline def apply(input: Buffer, `type`: String, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("get-image-colors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * If you don't like promises, you can use node-style callbacks too
    */
  type Callback = js.Function2[/* error */ js.Error | Null, /* colors */ js.Array[Color], Unit]
  
  trait Options extends StObject {
    
    /**
      * @default 5
      */
    var count: js.UndefOr[Double] = js.undefined
    
    /**
      * @default undefined
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}

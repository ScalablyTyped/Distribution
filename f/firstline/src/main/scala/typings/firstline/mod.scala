package typings.firstline

import typings.node.bufferMod.global.BufferEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(filePath: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].apply(filePath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def apply(filePath: String, opts: Options): js.Promise[String] = (^.asInstanceOf[js.Dynamic].apply(filePath.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  @JSImport("firstline", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    /** @default 'utf8' */
    var encoding: js.UndefOr[BufferEncoding] = js.undefined
    
    /** @default '\n' */
    var lineEnding: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setLineEnding(value: String): Self = StObject.set(x, "lineEnding", value.asInstanceOf[js.Any])
      
      inline def setLineEndingUndefined: Self = StObject.set(x, "lineEnding", js.undefined)
    }
  }
}

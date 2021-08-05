package typings.fileUrl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  Convert a file path to a file URL.
  @param filePath - File path to convert.
  @returns The `filePath` converted to a file URL.
  @example
  ```
  import fileUrl = require('file-url');
  fileUrl('unicorn.jpg');
  //=> 'file:///Users/sindresorhus/dev/file-url/unicorn.jpg'
  fileUrl('/Users/pony/pics/unicorn.jpg');
  //=> 'file:///Users/pony/pics/unicorn.jpg'
  fileUrl('unicorn.jpg', {resolve: false});
  //=> 'file:///unicorn.jpg'
  ```
  */
  inline def apply(filePath: String): String = ^.asInstanceOf[js.Dynamic].apply(filePath.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(filePath: String, options: Options): String = (^.asInstanceOf[js.Dynamic].apply(filePath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("file-url", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    /**
    		Passing `false` will make it not call `path.resolve()` on the path.
    		@default true
    		*/
    val resolve: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setResolve(value: Boolean): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
      
      inline def setResolveUndefined: Self = StObject.set(x, "resolve", js.undefined)
    }
  }
}

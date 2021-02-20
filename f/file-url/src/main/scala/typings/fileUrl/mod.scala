package typings.fileUrl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  @JSImport("file-url", JSImport.Namespace)
  @js.native
  def apply(filePath: String): String = js.native
  @JSImport("file-url", JSImport.Namespace)
  @js.native
  def apply(filePath: String, options: Options): String = js.native
  
  @js.native
  trait Options extends StObject {
    
    /**
    		Passing `false` will make it not call `path.resolve()` on the path.
    		@default true
    		*/
    val resolve: js.UndefOr[Boolean] = js.native
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
      def setResolve(value: Boolean): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolveUndefined: Self = StObject.set(x, "resolve", js.undefined)
    }
  }
}

package typings.filenamify

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filenamifyMod {
  
  /**
  Convert a string to a valid filename.
  @example
  ```
  import filenamify = require('filenamify');
  filenamify('<foo/bar>');
  //=> 'foo!bar'
  filenamify('foo:"bar"', {replacement: '🐴'});
  //=> 'foo🐴bar'
  ```
  */
  @JSImport("filenamify/filenamify", JSImport.Namespace)
  @js.native
  def apply(string: String): String = js.native
  @JSImport("filenamify/filenamify", JSImport.Namespace)
  @js.native
  def apply(string: String, options: Options): String = js.native
  
  @js.native
  trait Options extends StObject {
    
    /**
    		Truncate the filename to the given length.
    		Systems generally allow up to 255 characters, but we default to 100 for usability reasons.
    		@default 100
    		*/
    val maxLength: js.UndefOr[Double] = js.native
    
    /**
    		String to use as replacement for reserved filename characters.
    		Cannot contain: `<` `>` `:` `"` `/` `\` `|` `?` `*`
    		@default '!'
    		*/
    val replacement: js.UndefOr[String] = js.native
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
      def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      @scala.inline
      def setReplacement(value: String): Self = StObject.set(x, "replacement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplacementUndefined: Self = StObject.set(x, "replacement", js.undefined)
    }
  }
}

package typings.globStream

import typings.glob.mod.IOptions
import typings.node.NodeJS.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("glob-stream", JSImport.Namespace)
  @js.native
  def apply(glob: String): ReadableStream = js.native
  @JSImport("glob-stream", JSImport.Namespace)
  @js.native
  def apply(glob: String, options: Options): ReadableStream = js.native
  @JSImport("glob-stream", JSImport.Namespace)
  @js.native
  def apply(glob: js.Array[String]): ReadableStream = js.native
  @JSImport("glob-stream", JSImport.Namespace)
  @js.native
  def apply(glob: js.Array[String], options: Options): ReadableStream = js.native
  
  @js.native
  trait Entry extends StObject {
    
    var base: String = js.native
    
    var cwd: String = js.native
    
    var path: String = js.native
  }
  object Entry {
    
    @scala.inline
    def apply(base: String, cwd: String, path: String): Entry = {
      val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], cwd = cwd.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Entry]
    }
    
    @scala.inline
    implicit class EntryMutableBuilder[Self <: Entry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Options extends IOptions {
    
    /**
      * Whether or not to error upon an empty singular glob.
      */
    var allowEmpty: js.UndefOr[Boolean] = js.native
    
    /**
      * The absolute segment of the glob path that isn't a glob. This value is attached
      * to each globobject and is useful for relative pathing.
      */
    var base: js.UndefOr[String] = js.native
    
    /**
      * Whether or not the `cwd` and `base` should be the same.
      */
    var cwdbase: js.UndefOr[Boolean] = js.native
    
    /**
      * Filters stream to remove duplicates based on the string property name or the result of function.
      * When using a function, the function receives the streamed
      * data (objects containing `cwd`, `base`, `path` properties) to compare against.
      */
    var uniqueBy: js.UndefOr[UniqueByStringPredicate | UniqueByFunctionPredicate] = js.native
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
      def setAllowEmpty(value: Boolean): Self = StObject.set(x, "allowEmpty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowEmptyUndefined: Self = StObject.set(x, "allowEmpty", js.undefined)
      
      @scala.inline
      def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
      
      @scala.inline
      def setCwdbase(value: Boolean): Self = StObject.set(x, "cwdbase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwdbaseUndefined: Self = StObject.set(x, "cwdbase", js.undefined)
      
      @scala.inline
      def setUniqueBy(value: UniqueByStringPredicate | UniqueByFunctionPredicate): Self = StObject.set(x, "uniqueBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUniqueByFunction1(value: /* entry */ Entry => String): Self = StObject.set(x, "uniqueBy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUniqueByUndefined: Self = StObject.set(x, "uniqueBy", js.undefined)
    }
  }
  
  type UniqueByFunctionPredicate = js.Function1[/* entry */ Entry, String]
  
  /* Rewritten from type alias, can be one of: 
    - typings.globStream.globStreamStrings.cwd
    - typings.globStream.globStreamStrings.base
    - typings.globStream.globStreamStrings.path
  */
  trait UniqueByStringPredicate extends StObject
  object UniqueByStringPredicate {
    
    @scala.inline
    def base: typings.globStream.globStreamStrings.base = "base".asInstanceOf[typings.globStream.globStreamStrings.base]
    
    @scala.inline
    def cwd: typings.globStream.globStreamStrings.cwd = "cwd".asInstanceOf[typings.globStream.globStreamStrings.cwd]
    
    @scala.inline
    def path: typings.globStream.globStreamStrings.path = "path".asInstanceOf[typings.globStream.globStreamStrings.path]
  }
}

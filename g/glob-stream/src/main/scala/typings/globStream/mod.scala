package typings.globStream

import typings.globStream.globStreamBooleans.`false`
import typings.globStream.globStreamBooleans.`true`
import typings.picomatch.libPicomatchMod.PicomatchOptions
import typings.streamx.mod.Readable
import typings.streamx.mod.ReadableEvents
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(glob: String): Readable[Entry, Entry, Entry, `true`, `false`, ReadableEvents[Entry]] = ^.asInstanceOf[js.Dynamic].apply(glob.asInstanceOf[js.Any]).asInstanceOf[Readable[Entry, Entry, Entry, `true`, `false`, ReadableEvents[Entry]]]
  inline def apply(glob: String, options: Options): Readable[Entry, Entry, Entry, `true`, `false`, ReadableEvents[Entry]] = (^.asInstanceOf[js.Dynamic].apply(glob.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Readable[Entry, Entry, Entry, `true`, `false`, ReadableEvents[Entry]]]
  inline def apply(glob: js.Array[String]): Readable[Entry, Entry, Entry, `true`, `false`, ReadableEvents[Entry]] = ^.asInstanceOf[js.Dynamic].apply(glob.asInstanceOf[js.Any]).asInstanceOf[Readable[Entry, Entry, Entry, `true`, `false`, ReadableEvents[Entry]]]
  inline def apply(glob: js.Array[String], options: Options): Readable[Entry, Entry, Entry, `true`, `false`, ReadableEvents[Entry]] = (^.asInstanceOf[js.Dynamic].apply(glob.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Readable[Entry, Entry, Entry, `true`, `false`, ReadableEvents[Entry]]]
  
  @JSImport("glob-stream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Entry extends StObject {
    
    var base: String
    
    var cwd: String
    
    var path: String
  }
  object Entry {
    
    inline def apply(base: String, cwd: String, path: String): Entry = {
      val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], cwd = cwd.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Entry]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Entry] (val x: Self) extends AnyVal {
      
      inline def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options
    extends StObject
       with PicomatchOptions {
    
    /**
      * Whether or not to error upon an empty singular glob.
      */
    var allowEmpty: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The absolute segment of the glob path that isn't a glob. This value is attached
      * to each glob object and is useful for relative pathing.
      */
    var base: js.UndefOr[String] = js.undefined
    
    /**
      * Whether or not the {@linkcode cwd} and {@linkcode base} should be the same.
      */
    var cwdbase: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The root path that the glob is resolved against.
      */
    var root: js.UndefOr[String] = js.undefined
    
    /**
      * Filters stream to remove duplicates based on the string property name or the result of function.
      * When using a function, the function receives the streamed
      * data (objects containing `cwd`, `base`, `path` properties) to compare against.
      */
    var uniqueBy: js.UndefOr[UniqueByStringPredicate | UniqueByFunctionPredicate] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAllowEmpty(value: Boolean): Self = StObject.set(x, "allowEmpty", value.asInstanceOf[js.Any])
      
      inline def setAllowEmptyUndefined: Self = StObject.set(x, "allowEmpty", js.undefined)
      
      inline def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
      
      inline def setCwdbase(value: Boolean): Self = StObject.set(x, "cwdbase", value.asInstanceOf[js.Any])
      
      inline def setCwdbaseUndefined: Self = StObject.set(x, "cwdbase", js.undefined)
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      inline def setUniqueBy(value: UniqueByStringPredicate | UniqueByFunctionPredicate): Self = StObject.set(x, "uniqueBy", value.asInstanceOf[js.Any])
      
      inline def setUniqueByFunction1(value: /* entry */ Entry => String): Self = StObject.set(x, "uniqueBy", js.Any.fromFunction1(value))
      
      inline def setUniqueByUndefined: Self = StObject.set(x, "uniqueBy", js.undefined)
    }
  }
  
  type UniqueByFunctionPredicate = js.Function1[/* entry */ Entry, String]
  
  /* Rewritten from type alias, can be one of: 
    - typings.globStream.globStreamStrings.cwd
    - typings.globStream.globStreamStrings.base
    - typings.globStream.globStreamStrings.path
  */
  trait UniqueByStringPredicate extends StObject
}

package typings.globrex

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(glob: String): Results = ^.asInstanceOf[js.Dynamic].apply(glob.asInstanceOf[js.Any]).asInstanceOf[Results]
  inline def apply(glob: String, options: Options): Results = (^.asInstanceOf[js.Dynamic].apply(glob.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Results]
  
  @JSImport("globrex", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    /**
      * Enable all advanced features from extglob.
      * Matching so called "extended" globs pattern like single character matching,
      * matching ranges of characters, group matching, etc.
      * Note: Interprets [a-d] as [abcd].
      * To match a literal -, include it as first or last character.
      * @default false
      */
    var extended: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Parse input strings as it was a file path for special path related features.
      * This feature only makes sense if the input is a POSIX path like /foo/bar/hello.js or URLs.
      * When true the returned object will have an additional path object.
      * @default false
      */
    var filepath: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When `globstar` is false globs like '/foo/ *' are transformed to the following '^\/foo\/.*$'
      * which will match any string beginning with '/foo/'
      * When the globstar option is true, the same '/foo/ *'
      * glob is transformed to '^\/foo\/[^/]*$' which will match any string beginning with '/foo/'
      * that does not have a '/' to the right of it. '/foo/ *' will match: '/foo/bar', '/foo/bar.txt' but not '/foo/bar/baz' or '/foo/bar/baz.txt'.
      * Note: When globstar is true, '/foo/ **' is equivalent to '/foo/ *' when globstar is false
      * @default false
      */
    var globstar: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Be forgiving about multiple slashes, like /// and make everything after the first / optional
      * This is how bash glob works.
      * @default false
      */
    var strict: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setExtended(value: Boolean): Self = StObject.set(x, "extended", value.asInstanceOf[js.Any])
      
      inline def setExtendedUndefined: Self = StObject.set(x, "extended", js.undefined)
      
      inline def setFilepath(value: Boolean): Self = StObject.set(x, "filepath", value.asInstanceOf[js.Any])
      
      inline def setFilepathUndefined: Self = StObject.set(x, "filepath", js.undefined)
      
      inline def setGlobstar(value: Boolean): Self = StObject.set(x, "globstar", value.asInstanceOf[js.Any])
      
      inline def setGlobstarUndefined: Self = StObject.set(x, "globstar", js.undefined)
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
  
  trait Path extends StObject {
    
    /**
      * JavaScript RegExp instance build for testing against paths.
      * The regex have different path separators depending on host OS.
      */
    var regex: RegExp
    
    /**
      * Array of RegExp instances separated by /.
      * This can be usable when working with file paths or urls.
      * ```js
      * [ /^foo$/, /^bar$/, /^([^\/]*)$/, '^baz\\.(md|js|txt)$' ]
      * ```
      */
    var segments: js.Array[RegExp]
    
    /**
      * String representation of the RegExp
      */
    var string: String
  }
  object Path {
    
    inline def apply(regex: RegExp, segments: js.Array[RegExp], string: String): Path = {
      val __obj = js.Dynamic.literal(regex = regex.asInstanceOf[js.Any], segments = segments.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
      __obj.asInstanceOf[Path]
    }
    
    extension [Self <: Path](x: Self) {
      
      inline def setRegex(value: RegExp): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
      
      inline def setSegments(value: js.Array[RegExp]): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
      
      inline def setSegmentsVarargs(value: RegExp*): Self = StObject.set(x, "segments", js.Array(value :_*))
      
      inline def setString(value: String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    }
  }
  
  trait Results extends StObject {
    
    /** This property only exists if the option `filepath` is true. */
    var path: js.UndefOr[Path] = js.undefined
    
    /** JavaScript RegExp instance. */
    var regex: RegExp
  }
  object Results {
    
    inline def apply(regex: RegExp): Results = {
      val __obj = js.Dynamic.literal(regex = regex.asInstanceOf[js.Any])
      __obj.asInstanceOf[Results]
    }
    
    extension [Self <: Results](x: Self) {
      
      inline def setPath(value: Path): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setRegex(value: RegExp): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
    }
  }
}

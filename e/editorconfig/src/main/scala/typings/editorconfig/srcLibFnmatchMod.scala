package typings.editorconfig

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcLibFnmatchMod {
  
  inline def apply(target: String, pattern: String): Boolean = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(target: String, pattern: String, options: IOptions): Boolean = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("editorconfig/src/lib/fnmatch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("editorconfig/src/lib/fnmatch", "Minimatch")
  @js.native
  open class Minimatch protected ()
    extends StObject
       with IMinimatch {
    def this(pattern: String) = this()
    def this(pattern: String, options: IOptions) = this()
  }
  @JSImport("editorconfig/src/lib/fnmatch", "Minimatch")
  @js.native
  def Minimatch: IMinimatchStatic = js.native
  inline def Minimatch_=(x: IMinimatchStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Minimatch")(x.asInstanceOf[js.Any])
  
  /**
    * Returns a function that tests its supplied argument, suitable for use with Array.filter
    */
  inline def filter(pattern: String): js.Function3[/* element */ String, /* indexed */ Double, /* array */ js.Array[String], Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(pattern.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* element */ String, /* indexed */ Double, /* array */ js.Array[String], Boolean]]
  inline def filter(pattern: String, options: IOptions): js.Function3[/* element */ String, /* indexed */ Double, /* array */ js.Array[String], Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function3[/* element */ String, /* indexed */ Double, /* array */ js.Array[String], Boolean]]
  
  /**
    * Make a regular expression object from the pattern.
    */
  inline def makeRe(pattern: String): js.RegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("makeRe")(pattern.asInstanceOf[js.Any]).asInstanceOf[js.RegExp]
  inline def makeRe(pattern: String, options: IOptions): js.RegExp = (^.asInstanceOf[js.Dynamic].applyDynamic("makeRe")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.RegExp]
  
  /**
    * Match against the list of files, in the style of fnmatch or glob.
    * If nothing is matched, and options.nonull is set,
    * then return a list containing the pattern itself.
    */
  inline def `match`(list: js.Array[String], pattern: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(list.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def `match`(list: js.Array[String], pattern: String, options: IOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(list.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  @js.native
  trait IMinimatch extends StObject {
    
    /**
      * Deprecated. For internal use.
      *
      * @private
      */
    def braceExpand(pattern: String, options: IOptions): Unit = js.native
    
    /**
      * True if the pattern is a comment.
      */
    var comment: Boolean = js.native
    
    /**
      * Deprecated. For internal use.
      *
      * @private
      */
    def debug(): Unit = js.native
    
    /**
      * True if the pattern is ""
      */
    var empty: Boolean = js.native
    
    /**
      * Deprecated. For internal use.
      *
      * @private
      */
    def make(): Unit = js.native
    
    /**
      * Generate the regexp member if necessary, and return it.
      * Will return false if the pattern is invalid.
      */
    def makeRe(): js.RegExp = js.native
    
    // regexp or boolean
    /**
      * Return true if the filename matches the pattern, or false otherwise.
      */
    def `match`(fname: String): Boolean = js.native
    
    /**
      * Take a /-split filename, and match it against a single row in the regExpSet.
      * This method is mainly for internal use, but is exposed so that it can be used
      * by a glob-walker that needs to avoid excessive filesystem calls.
      */
    def matchOne(files: js.Array[String], pattern: js.Array[String], partial: Boolean): Boolean = js.native
    
    /**
      * True if the pattern is negated.
      */
    var negate: Boolean = js.native
    
    /**
      * The options supplied to the constructor.
      */
    var options: IOptions = js.native
    
    /**
      * Deprecated. For internal use.
      *
      * @private
      */
    def parse(pattern: String): Unit = js.native
    def parse(pattern: String, isSub: Boolean): Unit = js.native
    
    /**
      * Deprecated. For internal use.
      *
      * @private
      */
    def parseNegate(): Unit = js.native
    
    /**
      * The original pattern the minimatch object represents.
      */
    var pattern: String = js.native
    
    // (RegExp | string)[][]
    /**
      * A single regular expression expressing the entire pattern.
      * Created by the makeRe method.
      */
    var regexp: js.RegExp = js.native
    
    /**
      * A 2-dimensional array of regexp or string expressions.
      */
    var set: js.Array[js.Array[Any]] = js.native
  }
  
  @js.native
  trait IMinimatchStatic
    extends StObject
       with Instantiable1[/* pattern */ String, IMinimatch]
       with Instantiable2[/* pattern */ String, /* options */ IOptions, IMinimatch]
  
  trait IOptions extends StObject {
    
    /**
      * Dump a ton of stuff to stderr.
      *
      * @default false
      */
    var debug: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Allow patterns to match filenames starting with a period,
      * even if the pattern does not explicitly have a period in that spot.
      *
      * @default false
      */
    var dot: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Returns from negate expressions the same as if they were not negated.
      * (Ie, true on a hit, false on a miss.)
      *
      * @default false
      */
    var flipNegate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If set, then patterns without slashes will be matched against
      * the basename of the path if it contains slashes.
      *
      * @default false
      */
    var matchBase: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Do not expand {a,b} and {1..3} brace sets.
      *
      * @default false
      */
    var nobrace: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Perform a case-insensitive match.
      *
      * @default false
      */
    var nocase: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Suppress the behavior of treating #
      * at the start of a pattern as a comment.
      *
      * @default false
      */
    var nocomment: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Disable "extglob" style patterns like +(a|b).
      *
      * @default false
      */
    var noext: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Disable ** matching against multiple folder names.
      *
      * @default false
      */
    var noglobstar: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Suppress the behavior of treating a leading ! character as negation.
      *
      * @default false
      */
    var nonegate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When a match is not found by minimatch.match,
      * return a list containing the pattern itself if this option is set.
      * Otherwise, an empty list is returned if there are no matches.
      *
      * @default false
      */
    var nonull: js.UndefOr[Boolean] = js.undefined
  }
  object IOptions {
    
    inline def apply(): IOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setDot(value: Boolean): Self = StObject.set(x, "dot", value.asInstanceOf[js.Any])
      
      inline def setDotUndefined: Self = StObject.set(x, "dot", js.undefined)
      
      inline def setFlipNegate(value: Boolean): Self = StObject.set(x, "flipNegate", value.asInstanceOf[js.Any])
      
      inline def setFlipNegateUndefined: Self = StObject.set(x, "flipNegate", js.undefined)
      
      inline def setMatchBase(value: Boolean): Self = StObject.set(x, "matchBase", value.asInstanceOf[js.Any])
      
      inline def setMatchBaseUndefined: Self = StObject.set(x, "matchBase", js.undefined)
      
      inline def setNobrace(value: Boolean): Self = StObject.set(x, "nobrace", value.asInstanceOf[js.Any])
      
      inline def setNobraceUndefined: Self = StObject.set(x, "nobrace", js.undefined)
      
      inline def setNocase(value: Boolean): Self = StObject.set(x, "nocase", value.asInstanceOf[js.Any])
      
      inline def setNocaseUndefined: Self = StObject.set(x, "nocase", js.undefined)
      
      inline def setNocomment(value: Boolean): Self = StObject.set(x, "nocomment", value.asInstanceOf[js.Any])
      
      inline def setNocommentUndefined: Self = StObject.set(x, "nocomment", js.undefined)
      
      inline def setNoext(value: Boolean): Self = StObject.set(x, "noext", value.asInstanceOf[js.Any])
      
      inline def setNoextUndefined: Self = StObject.set(x, "noext", js.undefined)
      
      inline def setNoglobstar(value: Boolean): Self = StObject.set(x, "noglobstar", value.asInstanceOf[js.Any])
      
      inline def setNoglobstarUndefined: Self = StObject.set(x, "noglobstar", js.undefined)
      
      inline def setNonegate(value: Boolean): Self = StObject.set(x, "nonegate", value.asInstanceOf[js.Any])
      
      inline def setNonegateUndefined: Self = StObject.set(x, "nonegate", js.undefined)
      
      inline def setNonull(value: Boolean): Self = StObject.set(x, "nonull", value.asInstanceOf[js.Any])
      
      inline def setNonullUndefined: Self = StObject.set(x, "nonull", js.undefined)
    }
  }
}

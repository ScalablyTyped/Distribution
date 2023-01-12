package typings.gitDiff

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(oldString: String, newString: String): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].apply(oldString.asInstanceOf[js.Any], newString.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  inline def apply(oldString: String, newString: String, options: GitDiffOptions): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].apply(oldString.asInstanceOf[js.Any], newString.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  @JSImport("git-diff", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait GitDiffOptions extends StObject {
    
    /**
      * Add color to the git diff returned?
      * @default false
      */
    var color: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A space separated string of git diff flags.
      *
      * This only applies to real git diffs and will not effect the output if it is fake.
      * @default null
      * @see @link https://git-scm.com/docs/git-diff#_options
      */
    var flags: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Do not try and get a real git diff, just get me a fake? Faster but may not be 100% accurate
      * @default false
      */
    var forceFake: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Remove the ugly @@ -1,3 +1,3 @@ header?
      * @default false
      */
    var noHeaders: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Remember the options for next time?
      * @default false
      */
    var save: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Get a word diff instead of a line diff?
      * @default false
      */
    var wordDiff: js.UndefOr[Boolean] = js.undefined
  }
  object GitDiffOptions {
    
    inline def apply(): GitDiffOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GitDiffOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GitDiffOptions] (val x: Self) extends AnyVal {
      
      inline def setColor(value: Boolean): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setFlags(value: String): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setFlagsNull: Self = StObject.set(x, "flags", null)
      
      inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
      
      inline def setForceFake(value: Boolean): Self = StObject.set(x, "forceFake", value.asInstanceOf[js.Any])
      
      inline def setForceFakeUndefined: Self = StObject.set(x, "forceFake", js.undefined)
      
      inline def setNoHeaders(value: Boolean): Self = StObject.set(x, "noHeaders", value.asInstanceOf[js.Any])
      
      inline def setNoHeadersUndefined: Self = StObject.set(x, "noHeaders", js.undefined)
      
      inline def setSave(value: Boolean): Self = StObject.set(x, "save", value.asInstanceOf[js.Any])
      
      inline def setSaveUndefined: Self = StObject.set(x, "save", js.undefined)
      
      inline def setWordDiff(value: Boolean): Self = StObject.set(x, "wordDiff", value.asInstanceOf[js.Any])
      
      inline def setWordDiffUndefined: Self = StObject.set(x, "wordDiff", js.undefined)
    }
  }
}

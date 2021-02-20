package typings.generateChangelog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("generate-changelog", "generate")
  @js.native
  def generate(options: Options): js.Promise[String] = js.native
  
  @js.native
  trait Options extends StObject {
    
    /** allow unkown commit types */
    var allowUnknown: js.UndefOr[Boolean] = js.native
    
    /** exclude listed commit types (e.g. `['chore', 'style', 'refactor']`) */
    var exclude: js.UndefOr[js.Array[String]] = js.native
    
    /** whether it should be a major changelog */
    var major: js.UndefOr[Boolean] = js.native
    
    /** whether it should be a minor changelog */
    var minor: js.UndefOr[Boolean] = js.native
    
    /** whether it should be a patch changelog */
    var patch: js.UndefOr[Boolean] = js.native
    
    /** repo URL that will be used when linking commits */
    var repoUrl: js.UndefOr[String] = js.native
    
    /** generate from specific tag or range (e.g. `v1.2.3` or `v1.2.3..v1.2.4`)' */
    var tag: js.UndefOr[String] = js.native
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
      def setAllowUnknown(value: Boolean): Self = StObject.set(x, "allowUnknown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowUnknownUndefined: Self = StObject.set(x, "allowUnknown", js.undefined)
      
      @scala.inline
      def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      @scala.inline
      def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value :_*))
      
      @scala.inline
      def setMajor(value: Boolean): Self = StObject.set(x, "major", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMajorUndefined: Self = StObject.set(x, "major", js.undefined)
      
      @scala.inline
      def setMinor(value: Boolean): Self = StObject.set(x, "minor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinorUndefined: Self = StObject.set(x, "minor", js.undefined)
      
      @scala.inline
      def setPatch(value: Boolean): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatchUndefined: Self = StObject.set(x, "patch", js.undefined)
      
      @scala.inline
      def setRepoUrl(value: String): Self = StObject.set(x, "repoUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepoUrlUndefined: Self = StObject.set(x, "repoUrl", js.undefined)
      
      @scala.inline
      def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    }
  }
}

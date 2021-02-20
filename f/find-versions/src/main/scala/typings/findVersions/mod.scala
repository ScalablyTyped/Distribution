package typings.findVersions

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  Find semver versions in a string: `unicorn v1.2.3` → `1.2.3`.
  @example
  ```
  import findVersions = require('find-versions');
  findVersions('unicorn v1.2.3 rainbow 2.3.4+build.1');
  //=> ['1.2.3', '2.3.4+build.1']
  findVersions('cp (GNU coreutils) 8.22', {loose: true});
  //=> ['8.22.0']
  ```
  */
  @JSImport("find-versions", JSImport.Namespace)
  @js.native
  def apply(stringWithVersions: String): js.Array[String] = js.native
  @JSImport("find-versions", JSImport.Namespace)
  @js.native
  def apply(stringWithVersions: String, options: Options): js.Array[String] = js.native
  
  @js.native
  trait Options extends StObject {
    
    /**
    		Also match non-semver versions like `1.88`. They're coerced into semver compliant versions.
    		@default false
    		*/
    val loose: js.UndefOr[Boolean] = js.native
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
      def setLoose(value: Boolean): Self = StObject.set(x, "loose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLooseUndefined: Self = StObject.set(x, "loose", js.undefined)
    }
  }
}

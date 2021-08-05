package typings.findVersions

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  inline def apply(stringWithVersions: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].apply(stringWithVersions.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def apply(stringWithVersions: String, options: Options): js.Array[String] = (^.asInstanceOf[js.Dynamic].apply(stringWithVersions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  @JSImport("find-versions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    /**
    		Also match non-semver versions like `1.88`. They're coerced into semver compliant versions.
    		@default false
    		*/
    val loose: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setLoose(value: Boolean): Self = StObject.set(x, "loose", value.asInstanceOf[js.Any])
      
      inline def setLooseUndefined: Self = StObject.set(x, "loose", js.undefined)
    }
  }
}

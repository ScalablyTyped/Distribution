package typings.findVersions

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("find-versions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(stringWithVersions: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(stringWithVersions.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def default(stringWithVersions: String, options: Options): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(stringWithVersions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setLoose(value: Boolean): Self = StObject.set(x, "loose", value.asInstanceOf[js.Any])
      
      inline def setLooseUndefined: Self = StObject.set(x, "loose", js.undefined)
    }
  }
}

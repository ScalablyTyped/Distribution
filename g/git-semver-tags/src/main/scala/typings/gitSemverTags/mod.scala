package typings.gitSemverTags

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(callback: Callback): Unit = ^.asInstanceOf[js.Dynamic].apply(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(options: Options, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("git-semver-tags", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Callback = js.Function2[/* error */ js.Any, /* tags */ js.Array[String], Unit]
  
  trait Options extends StObject {
    
    /**
      * What package should lerna style tags be listed for, e.g., `foo-package`.
      */
    @JSName("package")
    var _package: js.UndefOr[String] = js.undefined
    
    /**
      * Extract lerna style tags (`foo-package@2.0.0`) from the git history, rather
      * than `v1.0.0` format.
      */
    var lernaTags: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If given, unstable tags (e.g. `x.x.x-alpha.1`, `x.x.x-rc.2`) will be skipped.
      */
    var skipUnstable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specify a prefix for the git tag to be ignored from the semver checks.
      */
    var tagPrefix: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setLernaTags(value: Boolean): Self = StObject.set(x, "lernaTags", value.asInstanceOf[js.Any])
      
      inline def setLernaTagsUndefined: Self = StObject.set(x, "lernaTags", js.undefined)
      
      inline def setSkipUnstable(value: Boolean): Self = StObject.set(x, "skipUnstable", value.asInstanceOf[js.Any])
      
      inline def setSkipUnstableUndefined: Self = StObject.set(x, "skipUnstable", js.undefined)
      
      inline def setTagPrefix(value: String): Self = StObject.set(x, "tagPrefix", value.asInstanceOf[js.Any])
      
      inline def setTagPrefixUndefined: Self = StObject.set(x, "tagPrefix", js.undefined)
      
      inline def set_package(value: String): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
      
      inline def set_packageUndefined: Self = StObject.set(x, "package", js.undefined)
    }
  }
}

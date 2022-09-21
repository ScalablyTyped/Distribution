package typings.githubUrlFromGit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Normalize Git URLs into GitHub URLs
    *
    * @param url Git URL to process
    * @param opts options for URL parser
    * @returns GitHub URL
    */
  inline def apply(url: String): String = ^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(url: String, opts: githubUrlFromGitOptions): String = (^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("github-url-from-git", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Create a regular expression to parse GitHub URLs
    *
    * @param opts options for regular expression generator
    */
  inline def re(): js.RegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("re")().asInstanceOf[js.RegExp]
  inline def re(opts: githubUrlFromGitOptions): js.RegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("re")(opts.asInstanceOf[js.Any]).asInstanceOf[js.RegExp]
  
  trait githubUrlFromGitOptions extends StObject {
    
    /**
      * additional URLs that should be treated as GitHub repos
      */
    var extraBaseUrls: js.UndefOr[js.Array[String]] = js.undefined
  }
  object githubUrlFromGitOptions {
    
    inline def apply(): githubUrlFromGitOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[githubUrlFromGitOptions]
    }
    
    extension [Self <: githubUrlFromGitOptions](x: Self) {
      
      inline def setExtraBaseUrls(value: js.Array[String]): Self = StObject.set(x, "extraBaseUrls", value.asInstanceOf[js.Any])
      
      inline def setExtraBaseUrlsUndefined: Self = StObject.set(x, "extraBaseUrls", js.undefined)
      
      inline def setExtraBaseUrlsVarargs(value: String*): Self = StObject.set(x, "extraBaseUrls", js.Array(value*))
    }
  }
}

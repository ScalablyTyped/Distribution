package typings.githubUrlFromGit

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Normalize Git URLs into GitHub URLs
    *
    * @param url Git URL to process
    * @param opts options for URL parser
    * @returns GitHub URL
    */
  @JSImport("github-url-from-git", JSImport.Namespace)
  @js.native
  def apply(url: String): String = js.native
  @JSImport("github-url-from-git", JSImport.Namespace)
  @js.native
  def apply(url: String, opts: githubUrlFromGitOptions): String = js.native
  
  /**
    * Create a regular expression to parse GitHub URLs
    *
    * @param opts options for regular expression generator
    */
  @JSImport("github-url-from-git", "re")
  @js.native
  def re(): RegExp = js.native
  @JSImport("github-url-from-git", "re")
  @js.native
  def re(opts: githubUrlFromGitOptions): RegExp = js.native
  
  @js.native
  trait githubUrlFromGitOptions extends StObject {
    
    /**
      * additional URLs that should be treated as GitHub repos
      */
    var extraBaseUrls: js.UndefOr[js.Array[String]] = js.native
  }
  object githubUrlFromGitOptions {
    
    @scala.inline
    def apply(): githubUrlFromGitOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[githubUrlFromGitOptions]
    }
    
    @scala.inline
    implicit class githubUrlFromGitOptionsMutableBuilder[Self <: githubUrlFromGitOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtraBaseUrls(value: js.Array[String]): Self = StObject.set(x, "extraBaseUrls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraBaseUrlsUndefined: Self = StObject.set(x, "extraBaseUrls", js.undefined)
      
      @scala.inline
      def setExtraBaseUrlsVarargs(value: String*): Self = StObject.set(x, "extraBaseUrls", js.Array(value :_*))
    }
  }
}

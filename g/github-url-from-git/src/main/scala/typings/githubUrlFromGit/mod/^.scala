package typings.githubUrlFromGit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("github-url-from-git", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * Normalize Git URLs into GitHub URLs
    *
    * @param url Git URL to process
    * @param opts options for URL parser
    * @returns GitHub URL
    */
  def apply(url: String): String = js.native
  def apply(url: String, opts: githubUrlFromGitOptions): String = js.native
}

package typings.gitUrlParse

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("git-url-parse", JSImport.Namespace)
  @js.native
  def apply(url: String): GitUrl = js.native
  
  @JSImport("git-url-parse", "stringify")
  @js.native
  def stringify(url: GitUrl): String = js.native
  @JSImport("git-url-parse", "stringify")
  @js.native
  def stringify(url: GitUrl, `type`: String): String = js.native
  
  @js.native
  trait GitUrl extends StObject {
    
    /** A filepath relative to the repository root. */
    var filepath: String = js.native
    
    /** The type of filepath in the url ("blob" or "tree"). */
    var filepathtype: String = js.native
    
    /** The owner and name values in the `owner/name` format. */
    var full_name: String = js.native
    
    /** Whether to add the `.git` suffix or not. */
    var git_suffix: js.UndefOr[Boolean] = js.native
    
    var hash: String = js.native
    
    var href: String = js.native
    
    /** The repository name. */
    var name: String = js.native
    
    /** The organization the owner belongs to. This is CloudForge specific. */
    var organization: String = js.native
    
    /** The repository owner. */
    var owner: String = js.native
    
    var pathname: String = js.native
    
    var port: Double | Null = js.native
    
    var protocol: String = js.native
    
    /** An array with the url protocols (usually it has one element). */
    var protocols: js.Array[String] = js.native
    
    /** The repository ref (e.g., "master" or "dev"). */
    var ref: String = js.native
    
    /** The url domain (including subdomains). */
    var resource: String = js.native
    
    var search: String = js.native
    
    /** The Git provider (e.g. `"github.com"`). */
    var source: String = js.native
    
    def toString(`type`: String): String = js.native
    
    /** The oauth token (could appear in the https urls). */
    var token: String = js.native
    
    /** The authentication user (usually for ssh urls). */
    var user: String = js.native
  }
}

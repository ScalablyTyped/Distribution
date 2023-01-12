package typings.gitUp

import typings.gitUp.gitUpBooleans.`false`
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * A low level git url parser. Parses the `input` url.
    *
    * @param input The url as string.
    * @returns The parsed url.
    *
    * @example
    * import gitUp = require("git-up");
    *
    * console.log(gitUp("git@github.com:IonicaBizau/node-parse-url.git"));
    * // => {
    * //     protocols: []
    * //   , port: null
    * //   , resource: "github.com"
    * //   , user: "git"
    * //   , pathname: "/IonicaBizau/node-parse-url.git"
    * //   , hash: ""
    * //   , search: ""
    * //   , href: "git@github.com:IonicaBizau/node-parse-url.git"
    * //   , protocol: "ssh"
    * // }
    *
    * console.log(gitUp("https://github.com/IonicaBizau/node-parse-url.git"));
    * // => {
    * //     protocols: [ "https" ]
    * //   , port: null
    * //   , resource: "github.com"
    * //   , user: ""
    * //   , pathname: "/IonicaBizau/node-parse-url.git"
    * //   , hash: ""
    * //   , search: ""
    * //   , href: "https://github.com/IonicaBizau/node-parse-url.git"
    * //   , protocol: "https"
    * // }
    */
  inline def apply(input: String): ParsedUrl = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[ParsedUrl]
  
  @JSImport("git-up", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait ParsedUrl extends StObject {
    
    /** The url hash. */
    var hash: String
    
    /** The input url. */
    var href: String
    
    var parse_failed: `false`
    
    /** The url pathname. */
    var pathname: String
    
    /** The domain port. */
    var port: String
    
    /** The git url protocol. */
    var protocol: String
    
    /** An array with the url protocols (usually it has one element). */
    var protocols: js.Array[String]
    
    var query: Record[String, String]
    
    /** The url domain (including subdomains). */
    var resource: String
    
    /** The url querystring value. */
    var search: String
    
    /** The oauth token (could appear in the https urls). */
    var token: String
    
    /** The authentication user (usually for ssh urls). */
    var user: js.UndefOr[String] = js.undefined
  }
  object ParsedUrl {
    
    inline def apply(
      hash: String,
      href: String,
      pathname: String,
      port: String,
      protocol: String,
      protocols: js.Array[String],
      query: Record[String, String],
      resource: String,
      search: String,
      token: String
    ): ParsedUrl = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], parse_failed = false, pathname = pathname.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], protocols = protocols.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedUrl]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ParsedUrl] (val x: Self) extends AnyVal {
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setParse_failed(value: `false`): Self = StObject.set(x, "parse_failed", value.asInstanceOf[js.Any])
      
      inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      inline def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocols(value: js.Array[String]): Self = StObject.set(x, "protocols", value.asInstanceOf[js.Any])
      
      inline def setProtocolsVarargs(value: String*): Self = StObject.set(x, "protocols", js.Array(value*))
      
      inline def setQuery(value: Record[String, String]): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      inline def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    }
  }
}

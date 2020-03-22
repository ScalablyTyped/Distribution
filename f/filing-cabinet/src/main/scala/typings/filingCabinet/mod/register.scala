package typings.filingCabinet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("filing-cabinet", "register")
@js.native
object register extends js.Object {
  /**
    * Register a custom lookup resolver for a file extension
    * If a given extension does not have a registered resolver,
    * cabinet will use a generic file resolver which is basically `require('path').join`
    * with a bit of extension defaulting logic
    * @param extension the extension of the file that should use the custom resolver (ex: '.py', '.php')
    * @param resolver  A resolver of partial paths
    */
  def apply(extension: String, resolver: Resolver): Unit = js.native
}


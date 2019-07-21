package typings
package globalDashDirsLib.globalDashDirsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalDirectories extends js.Object {
  /**
  		Directory with globally installed binaries.
  		Equivalent to `npm bin --global`.
  		*/
  val binaries: java.lang.String
  /**
  		Directory with globally installed packages.
  		Equivalent to `npm root --global`.
  		*/
  val packages: java.lang.String
  /**
  		Directory with directories for packages and binaries. You probably want either of the above.
  		Equivalent to `npm prefix --global`.
  		*/
  val prefix: java.lang.String
}

object GlobalDirectories {
  @scala.inline
  def apply(binaries: java.lang.String, packages: java.lang.String, prefix: java.lang.String): GlobalDirectories = {
    val __obj = js.Dynamic.literal(binaries = binaries, packages = packages, prefix = prefix)
  
    __obj.asInstanceOf[GlobalDirectories]
  }
}


package typings.globalDirs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalDirectories extends js.Object {
  /**
  		Directory with globally installed binaries.
  		Equivalent to `npm bin --global`.
  		*/
  val binaries: String
  /**
  		Directory with globally installed packages.
  		Equivalent to `npm root --global`.
  		*/
  val packages: String
  /**
  		Directory with directories for packages and binaries. You probably want either of the above.
  		Equivalent to `npm prefix --global`.
  		*/
  val prefix: String
}

object GlobalDirectories {
  @scala.inline
  def apply(binaries: String, packages: String, prefix: String): GlobalDirectories = {
    val __obj = js.Dynamic.literal(binaries = binaries.asInstanceOf[js.Any], packages = packages.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalDirectories]
  }
}


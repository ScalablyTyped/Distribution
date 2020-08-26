package typings.globalDirs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalDirectories extends js.Object {
  /**
  		Directory with globally installed binaries.
  		Equivalent to `npm bin --global`.
  		*/
  val binaries: String = js.native
  /**
  		Directory with globally installed packages.
  		Equivalent to `npm root --global`.
  		*/
  val packages: String = js.native
  /**
  		Directory with directories for packages and binaries. You probably want either of the above.
  		Equivalent to `npm prefix --global`.
  		*/
  val prefix: String = js.native
}

object GlobalDirectories {
  @scala.inline
  def apply(binaries: String, packages: String, prefix: String): GlobalDirectories = {
    val __obj = js.Dynamic.literal(binaries = binaries.asInstanceOf[js.Any], packages = packages.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalDirectories]
  }
  @scala.inline
  implicit class GlobalDirectoriesOps[Self <: GlobalDirectories] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBinaries(value: String): Self = this.set("binaries", value.asInstanceOf[js.Any])
    @scala.inline
    def setPackages(value: String): Self = this.set("packages", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
  }
  
}


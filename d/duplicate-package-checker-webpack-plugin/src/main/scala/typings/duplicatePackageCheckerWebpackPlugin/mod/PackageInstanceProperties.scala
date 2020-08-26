package typings.duplicatePackageCheckerWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The properties of the instance of a package */
@js.native
trait PackageInstanceProperties extends js.Object {
  /** Absolute path to the module that requested the package */
  var issuer: js.UndefOr[String] = js.native
  /** The name of the package */
  var name: String = js.native
  /** Absolute path to the package */
  var path: String = js.native
  /** The version of the package */
  var version: String = js.native
}

object PackageInstanceProperties {
  @scala.inline
  def apply(name: String, path: String, version: String): PackageInstanceProperties = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackageInstanceProperties]
  }
  @scala.inline
  implicit class PackageInstancePropertiesOps[Self <: PackageInstanceProperties] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def setIssuer(value: String): Self = this.set("issuer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIssuer: Self = this.set("issuer", js.undefined)
  }
  
}


package typings.gitSemverTags.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * What package should lerna style tags be listed for, e.g., `foo-package`.
    */
  @JSName("package")
  var _package: js.UndefOr[String] = js.native
  /**
    * Extract lerna style tags (`foo-package@2.0.0`) from the git history, rather
    * than `v1.0.0` format.
    */
  var lernaTags: js.UndefOr[Boolean] = js.native
  /**
    * Specify a prefix for the git tag to be ignored from the semver checks.
    */
  var tagPrefix: js.UndefOr[String] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def set_package(value: String): Self = this.set("package", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_package: Self = this.set("package", js.undefined)
    @scala.inline
    def setLernaTags(value: Boolean): Self = this.set("lernaTags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLernaTags: Self = this.set("lernaTags", js.undefined)
    @scala.inline
    def setTagPrefix(value: String): Self = this.set("tagPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagPrefix: Self = this.set("tagPrefix", js.undefined)
  }
  
}


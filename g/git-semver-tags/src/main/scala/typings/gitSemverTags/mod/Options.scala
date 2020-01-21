package typings.gitSemverTags.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * What package should lerna style tags be listed for, e.g., `foo-package`.
    */
  @JSName("package")
  var _package: js.UndefOr[String] = js.undefined
  /**
    * Extract lerna style tags (`foo-package@2.0.0`) from the git history, rather
    * than `v1.0.0` format.
    */
  var lernaTags: js.UndefOr[Boolean] = js.undefined
  /**
    * Specify a prefix for the git tag to be ignored from the semver checks.
    */
  var tagPrefix: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(_package: String = null, lernaTags: js.UndefOr[Boolean] = js.undefined, tagPrefix: String = null): Options = {
    val __obj = js.Dynamic.literal()
    if (_package != null) __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    if (!js.isUndefined(lernaTags)) __obj.updateDynamic("lernaTags")(lernaTags.asInstanceOf[js.Any])
    if (tagPrefix != null) __obj.updateDynamic("tagPrefix")(tagPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}


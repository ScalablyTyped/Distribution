package typings.generateChangelog.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** allow unkown commit types */
  var allowUnknown: js.UndefOr[Boolean] = js.undefined
  /** exclude listed commit types (e.g. `['chore', 'style', 'refactor']`) */
  var exclude: js.UndefOr[js.Array[String]] = js.undefined
  /** whether it should be a major changelog */
  var major: js.UndefOr[Boolean] = js.undefined
  /** whether it should be a minor changelog */
  var minor: js.UndefOr[Boolean] = js.undefined
  /** whether it should be a patch changelog */
  var patch: js.UndefOr[Boolean] = js.undefined
  /** repo URL that will be used when linking commits */
  var repoUrl: js.UndefOr[String] = js.undefined
  /** generate from specific tag or range (e.g. `v1.2.3` or `v1.2.3..v1.2.4`)' */
  var tag: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    allowUnknown: js.UndefOr[Boolean] = js.undefined,
    exclude: js.Array[String] = null,
    major: js.UndefOr[Boolean] = js.undefined,
    minor: js.UndefOr[Boolean] = js.undefined,
    patch: js.UndefOr[Boolean] = js.undefined,
    repoUrl: String = null,
    tag: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowUnknown)) __obj.updateDynamic("allowUnknown")(allowUnknown.get.asInstanceOf[js.Any])
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (!js.isUndefined(major)) __obj.updateDynamic("major")(major.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minor)) __obj.updateDynamic("minor")(minor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(patch)) __obj.updateDynamic("patch")(patch.get.asInstanceOf[js.Any])
    if (repoUrl != null) __obj.updateDynamic("repoUrl")(repoUrl.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}


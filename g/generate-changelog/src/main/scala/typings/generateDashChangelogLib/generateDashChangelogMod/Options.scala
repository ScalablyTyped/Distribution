package typings
package generateDashChangelogLib.generateDashChangelogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Options extends js.Object {
  /** exclude listed commit types (e.g. `['chore', 'style', 'refactor']`) */
  var exclude: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** whether it should be a major changelog */
  var major: js.UndefOr[scala.Boolean] = js.undefined
  /** whether it should be a minor changelog */
  var minor: js.UndefOr[scala.Boolean] = js.undefined
  /** whether it should be a patch changelog */
  var patch: js.UndefOr[scala.Boolean] = js.undefined
  /** repo URL that will be used when linking commits */
  var repoUrl: js.UndefOr[java.lang.String] = js.undefined
  /** generate from specific tag or range (e.g. `v1.2.3` or `v1.2.3..v1.2.4`)' */
  var tag: js.UndefOr[java.lang.String] = js.undefined
}


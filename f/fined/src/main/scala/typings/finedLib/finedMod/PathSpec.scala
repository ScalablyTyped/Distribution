package typings
package finedLib.finedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathSpec extends js.Object {
  var cwd: js.UndefOr[java.lang.String] = js.undefined
  var extensions: js.UndefOr[
    java.lang.String | js.Array[java.lang.String] | (org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Null])
  ] = js.undefined
  var findUp: js.UndefOr[scala.Boolean] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
}

object PathSpec {
  @scala.inline
  def apply(
    cwd: java.lang.String = null,
    extensions: java.lang.String | js.Array[java.lang.String] | (org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Null]) = null,
    findUp: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    path: java.lang.String = null
  ): PathSpec = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (!js.isUndefined(findUp)) __obj.updateDynamic("findUp")(findUp)
    if (name != null) __obj.updateDynamic("name")(name)
    if (path != null) __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[PathSpec]
  }
}


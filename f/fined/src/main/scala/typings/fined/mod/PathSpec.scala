package typings.fined.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathSpec extends js.Object {
  var cwd: js.UndefOr[String] = js.undefined
  var extensions: js.UndefOr[String | js.Array[String] | (StringDictionary[String | Null])] = js.undefined
  var findUp: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
}

object PathSpec {
  @scala.inline
  def apply(
    cwd: String = null,
    extensions: String | js.Array[String] | (StringDictionary[String | Null]) = null,
    findUp: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    path: String = null
  ): PathSpec = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (!js.isUndefined(findUp)) __obj.updateDynamic("findUp")(findUp.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathSpec]
  }
}


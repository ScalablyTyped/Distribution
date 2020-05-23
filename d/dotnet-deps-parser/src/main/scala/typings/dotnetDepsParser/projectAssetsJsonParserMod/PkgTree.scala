package typings.dotnetDepsParser.projectAssetsJsonParserMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PkgTree extends js.Object {
  var dependencies: StringDictionary[PkgTree]
  var name: String
  var targetFrameworks: js.UndefOr[js.Array[String]] = js.undefined
  var version: String
}

object PkgTree {
  @scala.inline
  def apply(
    dependencies: StringDictionary[PkgTree],
    name: String,
    version: String,
    targetFrameworks: js.Array[String] = null
  ): PkgTree = {
    val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (targetFrameworks != null) __obj.updateDynamic("targetFrameworks")(targetFrameworks.asInstanceOf[js.Any])
    __obj.asInstanceOf[PkgTree]
  }
}


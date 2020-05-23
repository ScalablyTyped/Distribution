package typings.dotnetDepsParser.parsersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectJsonManifestDependency extends js.Object {
  var `type`: js.UndefOr[ProjectJsonDepType] = js.undefined
  var version: String
}

object ProjectJsonManifestDependency {
  @scala.inline
  def apply(version: String, `type`: ProjectJsonDepType = null): ProjectJsonManifestDependency = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectJsonManifestDependency]
  }
}


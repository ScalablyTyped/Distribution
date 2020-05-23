package typings.dotnetDepsParser.projectAssetsJsonParserMod

import org.scalablytyped.runtime.StringDictionary
import typings.dotnetDepsParser.anon.Dependencies
import typings.dotnetDepsParser.anon.Restore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectAssetsJsonManifest extends js.Object {
  var project: Restore
  var targets: StringDictionary[StringDictionary[Dependencies]]
}

object ProjectAssetsJsonManifest {
  @scala.inline
  def apply(project: Restore, targets: StringDictionary[StringDictionary[Dependencies]]): ProjectAssetsJsonManifest = {
    val __obj = js.Dynamic.literal(project = project.asInstanceOf[js.Any], targets = targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectAssetsJsonManifest]
  }
}


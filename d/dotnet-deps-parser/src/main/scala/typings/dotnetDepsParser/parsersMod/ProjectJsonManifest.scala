package typings.dotnetDepsParser.parsersMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectJsonManifest extends js.Object {
  var dependencies: StringDictionary[ProjectJsonManifestDependency | String]
}

object ProjectJsonManifest {
  @scala.inline
  def apply(dependencies: StringDictionary[ProjectJsonManifestDependency | String]): ProjectJsonManifest = {
    val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectJsonManifest]
  }
}


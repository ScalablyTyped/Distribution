package typings.floraColossus.walkerMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PackageJSON extends js.Object {
  var dependencies: StringDictionary[VersionRange]
  var devDependencies: StringDictionary[VersionRange]
  var name: String
  var optionalDependencies: StringDictionary[VersionRange]
}

object PackageJSON {
  @scala.inline
  def apply(
    dependencies: StringDictionary[VersionRange],
    devDependencies: StringDictionary[VersionRange],
    name: String,
    optionalDependencies: StringDictionary[VersionRange]
  ): PackageJSON = {
    val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any], devDependencies = devDependencies.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], optionalDependencies = optionalDependencies.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackageJSON]
  }
}


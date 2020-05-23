package typings.dotnetDepsParser.parsersMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DependenciesDiscoveryResult extends js.Object {
  var dependencies: StringDictionary[PkgTree]
  var dependenciesWithUnknownVersions: js.UndefOr[js.Array[String]] = js.undefined
  var hasDevDependencies: Boolean
}

object DependenciesDiscoveryResult {
  @scala.inline
  def apply(
    dependencies: StringDictionary[PkgTree],
    hasDevDependencies: Boolean,
    dependenciesWithUnknownVersions: js.Array[String] = null
  ): DependenciesDiscoveryResult = {
    val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any], hasDevDependencies = hasDevDependencies.asInstanceOf[js.Any])
    if (dependenciesWithUnknownVersions != null) __obj.updateDynamic("dependenciesWithUnknownVersions")(dependenciesWithUnknownVersions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DependenciesDiscoveryResult]
  }
}


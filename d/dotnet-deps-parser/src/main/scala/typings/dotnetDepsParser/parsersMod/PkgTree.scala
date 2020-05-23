package typings.dotnetDepsParser.parsersMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PkgTree extends js.Object {
  var cyclic: js.UndefOr[Boolean] = js.undefined
  var depType: js.UndefOr[DepType] = js.undefined
  var dependencies: StringDictionary[PkgTree]
  var dependenciesWithUnknownVersions: js.UndefOr[js.Array[String]] = js.undefined
  var hasDevDependencies: js.UndefOr[Boolean] = js.undefined
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
    cyclic: js.UndefOr[Boolean] = js.undefined,
    depType: DepType = null,
    dependenciesWithUnknownVersions: js.Array[String] = null,
    hasDevDependencies: js.UndefOr[Boolean] = js.undefined,
    targetFrameworks: js.Array[String] = null
  ): PkgTree = {
    val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (!js.isUndefined(cyclic)) __obj.updateDynamic("cyclic")(cyclic.get.asInstanceOf[js.Any])
    if (depType != null) __obj.updateDynamic("depType")(depType.asInstanceOf[js.Any])
    if (dependenciesWithUnknownVersions != null) __obj.updateDynamic("dependenciesWithUnknownVersions")(dependenciesWithUnknownVersions.asInstanceOf[js.Any])
    if (!js.isUndefined(hasDevDependencies)) __obj.updateDynamic("hasDevDependencies")(hasDevDependencies.get.asInstanceOf[js.Any])
    if (targetFrameworks != null) __obj.updateDynamic("targetFrameworks")(targetFrameworks.asInstanceOf[js.Any])
    __obj.asInstanceOf[PkgTree]
  }
}


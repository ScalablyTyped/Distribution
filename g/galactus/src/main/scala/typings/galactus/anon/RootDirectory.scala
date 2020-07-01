package typings.galactus.anon

import typings.floraColossus.mod.Walker
import typings.floraColossus.walkerMod.Module
import typings.galactus.destroyerOfModulesMod.ShouldKeepModuleTest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RootDirectory extends js.Object {
  var rootDirectory: js.UndefOr[String] = js.undefined
  var shouldKeepModuleTest: js.UndefOr[ShouldKeepModuleTest] = js.undefined
  var walker: js.UndefOr[Walker] = js.undefined
}

object RootDirectory {
  @scala.inline
  def apply(
    rootDirectory: String = null,
    shouldKeepModuleTest: (/* module */ Module, /* isDevDep */ Boolean) => Boolean = null,
    walker: Walker = null
  ): RootDirectory = {
    val __obj = js.Dynamic.literal()
    if (rootDirectory != null) __obj.updateDynamic("rootDirectory")(rootDirectory.asInstanceOf[js.Any])
    if (shouldKeepModuleTest != null) __obj.updateDynamic("shouldKeepModuleTest")(js.Any.fromFunction2(shouldKeepModuleTest))
    if (walker != null) __obj.updateDynamic("walker")(walker.asInstanceOf[js.Any])
    __obj.asInstanceOf[RootDirectory]
  }
}


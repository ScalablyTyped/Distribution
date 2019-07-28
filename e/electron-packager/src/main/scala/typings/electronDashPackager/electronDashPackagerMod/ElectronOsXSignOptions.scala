package typings.electronDashPackager.electronDashPackagerMod

import typings.electronDashPackager.electronDashPackagerNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// see https://github.com/electron-userland/electron-packager/blob/92d09bba34599283a794fd6f24b88470f0cb1074/src/mac.js#L340
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof electron-osx-sign.electron-osx-sign.SignOptions, 'app' | 'binaries' | 'identity' | 'platform' | 'version'> ]: electron-osx-sign.electron-osx-sign.SignOptions[P]} */ trait ElectronOsXSignOptions extends js.Object {
  var identity: js.UndefOr[String | `true`] = js.undefined
}

object ElectronOsXSignOptions {
  @scala.inline
  def apply(identity: String | `true` = null): ElectronOsXSignOptions = {
    val __obj = js.Dynamic.literal()
    if (identity != null) __obj.updateDynamic("identity")(identity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElectronOsXSignOptions]
  }
}


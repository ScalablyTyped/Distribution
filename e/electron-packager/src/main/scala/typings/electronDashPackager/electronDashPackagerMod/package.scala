package typings.electronDashPackager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object electronDashPackagerMod {
  import typings.electronDashPackager.electronDashPackagerStrings.appBundleId
  import typings.electronDashPackager.electronDashPackagerStrings.appPath
  import typings.std.Error
  import typings.std.Exclude
  import typings.std.Pick

  // see https://github.com/electron-userland/electron-packager/blob/92d09bba34599283a794fd6f24b88470f0cb1074/src/mac.js#L372
  type ElectronNotarizeOptions = Omit[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NotarizeOptions */ js.Any, 
    appBundleId | appPath
  ]
  type Omit[T, K /* <: String */] = Pick[T, Exclude[String, K]]
  /**
    * Callback which is called when electron-packager is done.
    *
    * @param err - Contains errors if any.
    * @param appPaths - Path(s) to the newly created application(s).
    */
  type finalCallback = js.Function2[/* err */ Error, /* appPaths */ String | js.Array[String], Unit]
  type ignoreFunction = js.Function1[/* path */ String, Boolean]
  type onCompleteFn = js.Function5[
    /* buildPath */ String, 
    /* electronVersion */ String, 
    /* platform */ String, 
    /* arch */ String, 
    /* callbackFn */ js.Function0[Unit], 
    Unit
  ]
}

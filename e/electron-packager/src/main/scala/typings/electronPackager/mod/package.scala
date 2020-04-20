package typings.electronPackager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  // see https://github.com/electron-userland/electron-packager/blob/92d09bba34599283a794fd6f24b88470f0cb1074/src/mac.js#L372
  type ElectronNotarizeOptions = typings.electronPackager.mod.Omit[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NotarizeOptions */ js.Any, 
    typings.electronPackager.electronPackagerStrings.appBundleId | typings.electronPackager.electronPackagerStrings.appPath
  ]
  type Omit[T, K /* <: /* keyof T */ java.lang.String */] = typings.std.Pick[T, typings.std.Exclude[/* keyof T */ java.lang.String, K]]
  /**
    * Callback which is called when electron-packager is done.
    *
    * @param err - Contains errors if any.
    * @param appPaths - Path(s) to the newly created application(s).
    */
  type finalCallback = js.Function2[
    /* err */ typings.std.Error, 
    /* appPaths */ java.lang.String | js.Array[java.lang.String], 
    scala.Unit
  ]
  type ignoreFunction = js.Function1[/* path */ java.lang.String, scala.Boolean]
  type onCompleteFn = js.Function5[
    /* buildPath */ java.lang.String, 
    /* electronVersion */ java.lang.String, 
    /* platform */ java.lang.String, 
    /* arch */ java.lang.String, 
    /* callbackFn */ js.Function0[scala.Unit], 
    scala.Unit
  ]
}

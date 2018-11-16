package typings
package gapiDotClientDotTestingLib.gapiNs.clientNs.testingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AndroidDeviceCatalog extends js.Object {
  /**
               * The set of supported Android device models.
               * @OutputOnly
               */
  var models: js.UndefOr[js.Array[AndroidModel]] = js.undefined
  /**
               * The set of supported runtime configurations.
               * @OutputOnly
               */
  var runtimeConfiguration: js.UndefOr[AndroidRuntimeConfiguration] = js.undefined
  /**
               * The set of supported Android OS versions.
               * @OutputOnly
               */
  var versions: js.UndefOr[js.Array[AndroidVersion]] = js.undefined
}


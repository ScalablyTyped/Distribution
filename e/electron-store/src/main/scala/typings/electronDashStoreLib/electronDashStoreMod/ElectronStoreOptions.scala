package typings
package electronDashStoreLib.electronDashStoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ElectronStoreOptions[T] extends js.Object {
  /**
       * Storage file location. Don't specify this unless absolutely necessary!
       */
  var cwd: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Default data.
       */
  var defaults: js.UndefOr[T] = js.undefined
  /**
       * When specified, the store will be encrypted using the aes-256-cbc encryption algorithm.
       */
  var encryptionKey: js.UndefOr[java.lang.String | nodeLib.Buffer] = js.undefined
  /**
       * Name of the storage file (without extension).
       */
  var name: js.UndefOr[java.lang.String] = js.undefined
}


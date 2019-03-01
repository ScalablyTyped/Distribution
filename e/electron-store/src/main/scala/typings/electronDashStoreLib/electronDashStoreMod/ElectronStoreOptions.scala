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

object ElectronStoreOptions {
  @scala.inline
  def apply[T](
    cwd: java.lang.String = null,
    defaults: T = null,
    encryptionKey: java.lang.String | nodeLib.Buffer = null,
    name: java.lang.String = null
  ): ElectronStoreOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (defaults != null) __obj.updateDynamic("defaults")(defaults.asInstanceOf[js.Any])
    if (encryptionKey != null) __obj.updateDynamic("encryptionKey")(encryptionKey.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ElectronStoreOptions[T]]
  }
}


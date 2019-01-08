package typings
package expoLib.expoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "SecureStore")
@js.native
object SecureStoreNs extends js.Object {
  trait SecureStoreOptions extends js.Object {
    var keychainService: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait SecureStoreSetOptions extends SecureStoreOptions {
    var keychainAccessible: js.UndefOr[scala.Double] = js.undefined
  }
  
  val AFTER_FIRST_UNLOCK: scala.Double = js.native
  val AFTER_FIRST_UNLOCK_THIS_DEVICE_ONLY: scala.Double = js.native
  val ALWAYS: scala.Double = js.native
  val ALWAYS_THIS_DEVICE_ONLY: scala.Double = js.native
  val WHEN_PASSCODE_SET_THIS_DEVICE_ONLY: scala.Double = js.native
  val WHEN_UNLOCKED: scala.Double = js.native
  val WHEN_UNLOCKED_THIS_DEVICE_ONLY: scala.Double = js.native
  def deleteItemAsync(key: java.lang.String): js.Promise[scala.Unit] = js.native
  def deleteItemAsync(key: java.lang.String, options: SecureStoreOptions): js.Promise[scala.Unit] = js.native
  def getItemAsync(key: java.lang.String): js.Promise[java.lang.String | scala.Null] = js.native
  def getItemAsync(key: java.lang.String, options: SecureStoreOptions): js.Promise[java.lang.String | scala.Null] = js.native
  def setItemAsync(key: java.lang.String, value: java.lang.String): js.Promise[scala.Unit] = js.native
  def setItemAsync(key: java.lang.String, value: java.lang.String, options: SecureStoreSetOptions): js.Promise[scala.Unit] = js.native
}


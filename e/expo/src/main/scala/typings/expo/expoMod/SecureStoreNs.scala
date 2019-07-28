package typings.expo.expoMod

import typings.expo.expoMod.SecureStoreNs.SecureStoreOptions
import typings.expo.expoMod.SecureStoreNs.SecureStoreSetOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "SecureStore")
@js.native
object SecureStoreNs extends js.Object {
  trait SecureStoreOptions extends js.Object {
    var keychainService: js.UndefOr[String] = js.undefined
  }
  
  trait SecureStoreSetOptions extends SecureStoreOptions {
    var keychainAccessible: js.UndefOr[Double] = js.undefined
  }
  
  val AFTER_FIRST_UNLOCK: Double = js.native
  val AFTER_FIRST_UNLOCK_THIS_DEVICE_ONLY: Double = js.native
  val ALWAYS: Double = js.native
  val ALWAYS_THIS_DEVICE_ONLY: Double = js.native
  val WHEN_PASSCODE_SET_THIS_DEVICE_ONLY: Double = js.native
  val WHEN_UNLOCKED: Double = js.native
  val WHEN_UNLOCKED_THIS_DEVICE_ONLY: Double = js.native
  def deleteItemAsync(key: String): js.Promise[Unit] = js.native
  def deleteItemAsync(key: String, options: SecureStoreOptions): js.Promise[Unit] = js.native
  def getItemAsync(key: String): js.Promise[String | Null] = js.native
  def getItemAsync(key: String, options: SecureStoreOptions): js.Promise[String | Null] = js.native
  def setItemAsync(key: String, value: String): js.Promise[Unit] = js.native
  def setItemAsync(key: String, value: String, options: SecureStoreSetOptions): js.Promise[Unit] = js.native
}


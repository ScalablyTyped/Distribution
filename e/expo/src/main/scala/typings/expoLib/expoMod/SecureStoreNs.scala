package typings
package expoLib.expoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "SecureStore")
@js.native
object SecureStoreNs extends js.Object {
  
  trait SecureStoreOptions extends js.Object {
    var keychainAccessible: js.UndefOr[scala.Double] = js.undefined
    var keychainService: js.UndefOr[java.lang.String] = js.undefined
  }
  
  def deleteItemAsync(key: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def deleteItemAsync(key: java.lang.String, options: SecureStoreOptions): stdLib.Promise[scala.Unit] = js.native
  def getItemAsync(key: java.lang.String): stdLib.Promise[java.lang.String | scala.Null] = js.native
  def getItemAsync(key: java.lang.String, options: SecureStoreOptions): stdLib.Promise[java.lang.String | scala.Null] = js.native
  def setItemAsync(key: java.lang.String, value: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def setItemAsync(key: java.lang.String, value: java.lang.String, options: SecureStoreOptions): stdLib.Promise[scala.Unit] = js.native
}


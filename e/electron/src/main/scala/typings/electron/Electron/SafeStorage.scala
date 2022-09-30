package typings.electron.Electron

import typings.node.bufferMod.global.Buffer
import typings.node.eventsMod.global.NodeJS.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SafeStorage
  extends StObject
     with EventEmitter {
  
  // Docs: https://electronjs.org/docs/api/safe-storage
  /**
    * the decrypted string. Decrypts the encrypted buffer obtained  with
    * `safeStorage.encryptString` back into a string.
    *
    * This function will throw an error if decryption fails.
    */
  def decryptString(encrypted: Buffer): String = js.native
  
  /**
    * An array of bytes representing the encrypted string.
    *
    * This function will throw an error if encryption fails.
    */
  def encryptString(plainText: String): Buffer = js.native
  
  /**
    * Whether encryption is available.
    *
    * On Linux, returns true if the app has emitted the `ready` event and the secret
    * key is available. On MacOS, returns true if Keychain is available. On Windows,
    * returns true once the app has emitted the `ready` event.
    */
  def isEncryptionAvailable(): Boolean = js.native
}

package typings.ethers

import typings.ethers.signingKeyMod.SigningKey
import typings.ethers.typesMod.Arrayish
import typings.ethers.typesMod.EncryptOptions
import typings.ethers.typesMod.ProgressCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers/dist/types/wallet/secret-storage", JSImport.Namespace)
@js.native
object secretStorageMod extends js.Object {
  def decrypt(json: String, password: Arrayish): js.Promise[SigningKey] = js.native
  def decrypt(json: String, password: Arrayish, progressCallback: ProgressCallback): js.Promise[SigningKey] = js.native
  def decryptCrowdsale(json: String, password: String): SigningKey = js.native
  def decryptCrowdsale(json: String, password: Arrayish): SigningKey = js.native
  def encrypt(privateKey: SigningKey, password: String): js.Promise[String] = js.native
  def encrypt(privateKey: SigningKey, password: String, options: EncryptOptions): js.Promise[String] = js.native
  def encrypt(
    privateKey: SigningKey,
    password: String,
    options: EncryptOptions,
    progressCallback: ProgressCallback
  ): js.Promise[String] = js.native
  def encrypt(privateKey: SigningKey, password: Arrayish): js.Promise[String] = js.native
  def encrypt(privateKey: SigningKey, password: Arrayish, options: EncryptOptions): js.Promise[String] = js.native
  def encrypt(
    privateKey: SigningKey,
    password: Arrayish,
    options: EncryptOptions,
    progressCallback: ProgressCallback
  ): js.Promise[String] = js.native
  def encrypt(privateKey: Arrayish, password: String): js.Promise[String] = js.native
  def encrypt(privateKey: Arrayish, password: String, options: EncryptOptions): js.Promise[String] = js.native
  def encrypt(
    privateKey: Arrayish,
    password: String,
    options: EncryptOptions,
    progressCallback: ProgressCallback
  ): js.Promise[String] = js.native
  def encrypt(privateKey: Arrayish, password: Arrayish): js.Promise[String] = js.native
  def encrypt(privateKey: Arrayish, password: Arrayish, options: EncryptOptions): js.Promise[String] = js.native
  def encrypt(
    privateKey: Arrayish,
    password: Arrayish,
    options: EncryptOptions,
    progressCallback: ProgressCallback
  ): js.Promise[String] = js.native
}


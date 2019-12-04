package typings.ethers

import typings.ethers.distTypesUtilsTypesMod.Arrayish
import typings.ethers.distTypesUtilsTypesMod.EncryptOptions
import typings.ethers.distTypesUtilsTypesMod.ProgressCallback
import typings.ethers.distTypesWalletSigningDashKeyMod.SigningKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers/dist/types/wallet/secret-storage", JSImport.Namespace)
@js.native
object distTypesWalletSecretDashStorageMod extends js.Object {
  def decrypt(json: String, password: Arrayish): js.Promise[SigningKey] = js.native
  def decrypt(json: String, password: Arrayish, progressCallback: ProgressCallback): js.Promise[SigningKey] = js.native
  def decryptCrowdsale(json: String, password: String): SigningKey = js.native
  def decryptCrowdsale(json: String, password: Arrayish): SigningKey = js.native
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
}


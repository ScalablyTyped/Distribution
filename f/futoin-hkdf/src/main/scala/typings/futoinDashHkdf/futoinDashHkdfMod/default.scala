package typings.futoinDashHkdf.futoinDashHkdfMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("futoin-hkdf", JSImport.Default)
@js.native
object default extends js.Object {
  def apply(ikm: String, length: Double): Buffer = js.native
  def apply(ikm: String, length: Double, option: Option): Buffer = js.native
  def apply(ikm: Buffer, length: Double): Buffer = js.native
  def apply(ikm: Buffer, length: Double, option: Option): Buffer = js.native
  def expand(hash: String, hash_len: Double, prk: String, length: Double, info: String): Buffer = js.native
  def expand(hash: String, hash_len: Double, prk: String, length: Double, info: Buffer): Buffer = js.native
  def expand(hash: String, hash_len: Double, prk: Buffer, length: Double, info: String): Buffer = js.native
  def expand(hash: String, hash_len: Double, prk: Buffer, length: Double, info: Buffer): Buffer = js.native
  def extract(hash: String, hash_len: Double, ikm: String, salt: String): Buffer = js.native
  def extract(hash: String, hash_len: Double, ikm: String, salt: Buffer): Buffer = js.native
  def extract(hash: String, hash_len: Double, ikm: Buffer, salt: String): Buffer = js.native
  def extract(hash: String, hash_len: Double, ikm: Buffer, salt: Buffer): Buffer = js.native
  def hash_length(hash: String): Double = js.native
}


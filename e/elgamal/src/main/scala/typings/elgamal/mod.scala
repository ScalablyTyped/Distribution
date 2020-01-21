package typings.elgamal

import typings.jsbn.mod.BigInteger
import typings.jsbn.mod.RandomGenerator
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elgamal", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class BigInt protected () extends BigInteger {
    def this(a: String) = this()
    def this(a: js.Array[Double]) = this()
    def this(a: BigInteger) = this()
    def this(a: String, b: Double) = this()
    def this(a: js.Array[Double], b: Double) = this()
    def this(a: Double, c: RandomGenerator) = this()
    def this(a: Double, b: Double, c: RandomGenerator) = this()
  }
  
  @js.native
  class DecryptedValue protected () extends js.Object {
    def this(m: String) = this()
    def this(m: Double) = this()
    def this(m: BigInteger) = this()
    var bi: BigInteger = js.native
  }
  
  @js.native
  trait ElGamal extends js.Object {
    var g: BigInteger = js.native
    var p: BigInteger = js.native
    var x: BigInteger = js.native
    var y: BigInteger = js.native
    def decryptAsync(m: EncryptedValue): js.Promise[DecryptedValue] = js.native
    def encryptAsync(m: String): js.Promise[EncryptedValue] = js.native
    def encryptAsync(m: String, k: String): js.Promise[EncryptedValue] = js.native
    def encryptAsync(m: String, k: Double): js.Promise[EncryptedValue] = js.native
    def encryptAsync(m: String, k: BigInteger): js.Promise[EncryptedValue] = js.native
    def encryptAsync(m: Double): js.Promise[EncryptedValue] = js.native
    def encryptAsync(m: Double, k: String): js.Promise[EncryptedValue] = js.native
    def encryptAsync(m: Double, k: Double): js.Promise[EncryptedValue] = js.native
    def encryptAsync(m: Double, k: BigInteger): js.Promise[EncryptedValue] = js.native
    def encryptAsync(m: BigInteger): js.Promise[EncryptedValue] = js.native
    def encryptAsync(m: BigInteger, k: String): js.Promise[EncryptedValue] = js.native
    def encryptAsync(m: BigInteger, k: Double): js.Promise[EncryptedValue] = js.native
    def encryptAsync(m: BigInteger, k: BigInteger): js.Promise[EncryptedValue] = js.native
  }
  
  @js.native
  class EncryptedValue protected () extends js.Object {
    def this(a: BigInteger, b: BigInteger) = this()
    var a: BigInteger = js.native
    var b: BigInteger = js.native
    def multiply(encryptedValue: EncryptedValue): EncryptedValue = js.native
  }
  
  @js.native
  class MissingPrivateKeyError () extends Error {
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
  }
  
  @js.native
  class default protected () extends ElGamal {
    def this(
      p: BigInteger | String | Double,
      g: BigInteger | String | Double,
      y: BigInteger | String | Double,
      x: BigInteger | String | Double
    ) = this()
  }
  
  /* static members */
  @js.native
  object BigInt extends js.Object {
    var ONE: BigInteger = js.native
    var ZERO: BigInteger = js.native
  }
  
  @js.native
  object Utils extends js.Object {
    val BIG_TWO: BigInteger = js.native
    def getBigPrimeAsync(bits: Double): js.Promise[BigInteger] = js.native
    def getRandomBigIntAsync(min: BigInteger, max: BigInteger): js.Promise[BigInteger] = js.native
    def getRandomNbitBigIntAsync(bits: Double): js.Promise[BigInteger] = js.native
    def parseBigInt(obj: String): BigInteger | Null = js.native
    def parseBigInt(obj: Double): BigInteger | Null = js.native
    def parseBigInt(obj: BigInteger): BigInteger | Null = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    def generateAsync(): js.Promise[ElGamal] = js.native
    def generateAsync(primeBits: Double): js.Promise[ElGamal] = js.native
  }
  
}


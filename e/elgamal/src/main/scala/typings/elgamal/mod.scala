package typings.elgamal

import typings.jsbn.mod.BigInteger
import typings.jsbn.mod.RandomGenerator
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("elgamal", JSImport.Default)
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
  object default {
    
    @JSImport("elgamal", "default.generateAsync")
    @js.native
    def generateAsync(): js.Promise[ElGamal] = js.native
    @JSImport("elgamal", "default.generateAsync")
    @js.native
    def generateAsync(primeBits: Double): js.Promise[ElGamal] = js.native
  }
  
  @JSImport("elgamal", "BigInt")
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
  /* static members */
  object BigInt {
    
    @JSImport("elgamal", "BigInt")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("elgamal", "BigInt.ONE")
    @js.native
    def ONE: BigInteger = js.native
    @scala.inline
    def ONE_=(x: BigInteger): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ONE")(x.asInstanceOf[js.Any])
    
    @JSImport("elgamal", "BigInt.ZERO")
    @js.native
    def ZERO: BigInteger = js.native
    @scala.inline
    def ZERO_=(x: BigInteger): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ZERO")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("elgamal", "DecryptedValue")
  @js.native
  class DecryptedValue protected () extends StObject {
    def this(m: String) = this()
    def this(m: Double) = this()
    def this(m: BigInteger) = this()
    
    var bi: BigInteger = js.native
  }
  
  @JSImport("elgamal", "EncryptedValue")
  @js.native
  class EncryptedValue protected () extends StObject {
    def this(a: BigInteger, b: BigInteger) = this()
    
    var a: BigInteger = js.native
    
    var b: BigInteger = js.native
    
    def multiply(encryptedValue: EncryptedValue): EncryptedValue = js.native
  }
  
  @JSImport("elgamal", "MissingPrivateKeyError")
  @js.native
  class MissingPrivateKeyError () extends Error
  
  object Utils {
    
    @JSImport("elgamal", "Utils.BIG_TWO")
    @js.native
    val BIG_TWO: BigInteger = js.native
    
    @JSImport("elgamal", "Utils.getBigPrimeAsync")
    @js.native
    def getBigPrimeAsync(bits: Double): js.Promise[BigInteger] = js.native
    
    @JSImport("elgamal", "Utils.getRandomBigIntAsync")
    @js.native
    def getRandomBigIntAsync(min: BigInteger, max: BigInteger): js.Promise[BigInteger] = js.native
    
    @JSImport("elgamal", "Utils.getRandomNbitBigIntAsync")
    @js.native
    def getRandomNbitBigIntAsync(bits: Double): js.Promise[BigInteger] = js.native
    
    @JSImport("elgamal", "Utils.parseBigInt")
    @js.native
    def parseBigInt(obj: String): BigInteger | Null = js.native
    @JSImport("elgamal", "Utils.parseBigInt")
    @js.native
    def parseBigInt(obj: Double): BigInteger | Null = js.native
    @JSImport("elgamal", "Utils.parseBigInt")
    @js.native
    def parseBigInt(obj: BigInteger): BigInteger | Null = js.native
  }
  
  @js.native
  trait ElGamal extends StObject {
    
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
    
    var g: BigInteger = js.native
    
    var p: BigInteger = js.native
    
    var x: BigInteger = js.native
    
    var y: BigInteger = js.native
  }
}

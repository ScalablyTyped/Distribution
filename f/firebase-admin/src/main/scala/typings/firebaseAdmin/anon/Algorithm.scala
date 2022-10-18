package typings.firebaseAdmin.anon

import typings.firebaseAdmin.libAuthUserImportBuilderMod.HashAlgorithmType
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Algorithm extends StObject {
  
  /**
    * The password hashing algorithm identifier. The following algorithm
    * identifiers are supported:
    * `SCRYPT`, `STANDARD_SCRYPT`, `HMAC_SHA512`, `HMAC_SHA256`, `HMAC_SHA1`,
    * `HMAC_MD5`, `MD5`, `PBKDF_SHA1`, `BCRYPT`, `PBKDF2_SHA256`, `SHA512`,
    * `SHA256` and `SHA1`.
    */
  var algorithm: HashAlgorithmType
  
  /**
    * The block size (normally 8) of the hashing algorithm. Required for the
    * `STANDARD_SCRYPT` algorithm.
    */
  var blockSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The derived key length of the hashing algorithm. Required for the
    * `STANDARD_SCRYPT` algorithm.
    */
  var derivedKeyLength: js.UndefOr[Double] = js.undefined
  
  /**
    * The signing key used in the hash algorithm in buffer bytes.
    * Required by hashing algorithms `SCRYPT`, `HMAC_SHA512`, `HMAC_SHA256`,
    * `HAMC_SHA1` and `HMAC_MD5`.
    */
  var key: js.UndefOr[Buffer] = js.undefined
  
  /**
    * The memory cost required for `SCRYPT` algorithm, or the CPU/memory cost.
    * Required for `STANDARD_SCRYPT` algorithm.
    */
  var memoryCost: js.UndefOr[Double] = js.undefined
  
  /**
    * The parallelization of the hashing algorithm. Required for the
    * `STANDARD_SCRYPT` algorithm.
    */
  var parallelization: js.UndefOr[Double] = js.undefined
  
  /**
    * The number of rounds for hashing calculation.
    * Required for `SCRYPT`, `MD5`, `SHA512`, `SHA256`, `SHA1`, `PBKDF_SHA1` and
    * `PBKDF2_SHA256`.
    */
  var rounds: js.UndefOr[Double] = js.undefined
  
  /**
    * The salt separator in buffer bytes which is appended to salt when
    * verifying a password. This is only used by the `SCRYPT` algorithm.
    */
  var saltSeparator: js.UndefOr[Buffer] = js.undefined
}
object Algorithm {
  
  inline def apply(algorithm: HashAlgorithmType): Algorithm = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any])
    __obj.asInstanceOf[Algorithm]
  }
  
  extension [Self <: Algorithm](x: Self) {
    
    inline def setAlgorithm(value: HashAlgorithmType): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    inline def setBlockSize(value: Double): Self = StObject.set(x, "blockSize", value.asInstanceOf[js.Any])
    
    inline def setBlockSizeUndefined: Self = StObject.set(x, "blockSize", js.undefined)
    
    inline def setDerivedKeyLength(value: Double): Self = StObject.set(x, "derivedKeyLength", value.asInstanceOf[js.Any])
    
    inline def setDerivedKeyLengthUndefined: Self = StObject.set(x, "derivedKeyLength", js.undefined)
    
    inline def setKey(value: Buffer): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setMemoryCost(value: Double): Self = StObject.set(x, "memoryCost", value.asInstanceOf[js.Any])
    
    inline def setMemoryCostUndefined: Self = StObject.set(x, "memoryCost", js.undefined)
    
    inline def setParallelization(value: Double): Self = StObject.set(x, "parallelization", value.asInstanceOf[js.Any])
    
    inline def setParallelizationUndefined: Self = StObject.set(x, "parallelization", js.undefined)
    
    inline def setRounds(value: Double): Self = StObject.set(x, "rounds", value.asInstanceOf[js.Any])
    
    inline def setRoundsUndefined: Self = StObject.set(x, "rounds", js.undefined)
    
    inline def setSaltSeparator(value: Buffer): Self = StObject.set(x, "saltSeparator", value.asInstanceOf[js.Any])
    
    inline def setSaltSeparatorUndefined: Self = StObject.set(x, "saltSeparator", js.undefined)
  }
}

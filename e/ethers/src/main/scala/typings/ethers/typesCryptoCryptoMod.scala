package typings.ethers

import typings.node.bufferMod.global.Buffer
import typings.node.cryptoMod.BinaryLike
import typings.node.cryptoMod.Hash
import typings.node.cryptoMod.HashOptions
import typings.node.cryptoMod.Hmac
import typings.node.cryptoMod.KeyObject
import typings.node.streamMod.TransformOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCryptoCryptoMod {
  
  @JSImport("ethers/types/crypto/crypto", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a `Hash` object that can be used to generate hash digests
    * using the given `algorithm`. Optional `options` argument controls stream
    * behavior. For XOF hash functions such as `'shake256'`, the `outputLength` option
    * can be used to specify the desired output length in bytes.
    *
    * The `algorithm` is dependent on the available algorithms supported by the
    * version of OpenSSL on the platform. Examples are `'sha256'`, `'sha512'`, etc.
    * On recent releases of OpenSSL, `openssl list -digest-algorithms` will
    * display the available digest algorithms.
    *
    * Example: generating the sha256 sum of a file
    *
    * ```js
    * import {
    *   createReadStream,
    * } from 'node:fs';
    * import { argv } from 'node:process';
    * const {
    *   createHash,
    * } = await import('node:crypto');
    *
    * const filename = argv[2];
    *
    * const hash = createHash('sha256');
    *
    * const input = createReadStream(filename);
    * input.on('readable', () => {
    *   // Only one element is going to be produced by the
    *   // hash stream.
    *   const data = input.read();
    *   if (data)
    *     hash.update(data);
    *   else {
    *     console.log(`${hash.digest('hex')} ${filename}`);
    *   }
    * });
    * ```
    * @since v0.1.92
    * @param options `stream.transform` options
    */
  inline def createHash(algorithm: String): Hash = ^.asInstanceOf[js.Dynamic].applyDynamic("createHash")(algorithm.asInstanceOf[js.Any]).asInstanceOf[Hash]
  inline def createHash(algorithm: String, options: HashOptions): Hash = (^.asInstanceOf[js.Dynamic].applyDynamic("createHash")(algorithm.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Hash]
  
  /**
    * Creates and returns an `Hmac` object that uses the given `algorithm` and `key`.
    * Optional `options` argument controls stream behavior.
    *
    * The `algorithm` is dependent on the available algorithms supported by the
    * version of OpenSSL on the platform. Examples are `'sha256'`, `'sha512'`, etc.
    * On recent releases of OpenSSL, `openssl list -digest-algorithms` will
    * display the available digest algorithms.
    *
    * The `key` is the HMAC key used to generate the cryptographic HMAC hash. If it is
    * a `KeyObject`, its type must be `secret`.
    *
    * Example: generating the sha256 HMAC of a file
    *
    * ```js
    * import {
    *   createReadStream,
    * } from 'node:fs';
    * import { argv } from 'node:process';
    * const {
    *   createHmac,
    * } = await import('node:crypto');
    *
    * const filename = argv[2];
    *
    * const hmac = createHmac('sha256', 'a secret');
    *
    * const input = createReadStream(filename);
    * input.on('readable', () => {
    *   // Only one element is going to be produced by the
    *   // hash stream.
    *   const data = input.read();
    *   if (data)
    *     hmac.update(data);
    *   else {
    *     console.log(`${hmac.digest('hex')} ${filename}`);
    *   }
    * });
    * ```
    * @since v0.1.94
    * @param options `stream.transform` options
    */
  inline def createHmac(algorithm: String, key: BinaryLike): Hmac = (^.asInstanceOf[js.Dynamic].applyDynamic("createHmac")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Hmac]
  inline def createHmac(algorithm: String, key: BinaryLike, options: TransformOptions): Hmac = (^.asInstanceOf[js.Dynamic].applyDynamic("createHmac")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Hmac]
  inline def createHmac(algorithm: String, key: KeyObject): Hmac = (^.asInstanceOf[js.Dynamic].applyDynamic("createHmac")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Hmac]
  inline def createHmac(algorithm: String, key: KeyObject, options: TransformOptions): Hmac = (^.asInstanceOf[js.Dynamic].applyDynamic("createHmac")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Hmac]
  
  /**
    * Provides a synchronous Password-Based Key Derivation Function 2 (PBKDF2)
    * implementation. A selected HMAC digest algorithm specified by `digest` is
    * applied to derive a key of the requested byte length (`keylen`) from the`password`, `salt` and `iterations`.
    *
    * If an error occurs an `Error` will be thrown, otherwise the derived key will be
    * returned as a `Buffer`.
    *
    * The `iterations` argument must be a number set as high as possible. The
    * higher the number of iterations, the more secure the derived key will be,
    * but will take a longer amount of time to complete.
    *
    * The `salt` should be as unique as possible. It is recommended that a salt is
    * random and at least 16 bytes long. See [NIST SP 800-132](https://nvlpubs.nist.gov/nistpubs/Legacy/SP/nistspecialpublication800-132.pdf) for details.
    *
    * When passing strings for `password` or `salt`, please consider `caveats when using strings as inputs to cryptographic APIs`.
    *
    * ```js
    * const {
    *   pbkdf2Sync,
    * } = await import('node:crypto');
    *
    * const key = pbkdf2Sync('secret', 'salt', 100000, 64, 'sha512');
    * console.log(key.toString('hex'));  // '3745e48...08d59ae'
    * ```
    *
    * An array of supported digest functions can be retrieved using {@link getHashes}.
    * @since v0.9.3
    */
  inline def pbkdf2Sync(password: BinaryLike, salt: BinaryLike, iterations: Double, keylen: Double, digest: String): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2Sync")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], digest.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  /**
    * Generates cryptographically strong pseudorandom data. The `size` argument
    * is a number indicating the number of bytes to generate.
    *
    * If a `callback` function is provided, the bytes are generated asynchronously
    * and the `callback` function is invoked with two arguments: `err` and `buf`.
    * If an error occurs, `err` will be an `Error` object; otherwise it is `null`. The`buf` argument is a `Buffer` containing the generated bytes.
    *
    * ```js
    * // Asynchronous
    * const {
    *   randomBytes,
    * } = await import('node:crypto');
    *
    * randomBytes(256, (err, buf) => {
    *   if (err) throw err;
    *   console.log(`${buf.length} bytes of random data: ${buf.toString('hex')}`);
    * });
    * ```
    *
    * If the `callback` function is not provided, the random bytes are generated
    * synchronously and returned as a `Buffer`. An error will be thrown if
    * there is a problem generating the bytes.
    *
    * ```js
    * // Synchronous
    * const {
    *   randomBytes,
    * } = await import('node:crypto');
    *
    * const buf = randomBytes(256);
    * console.log(
    *   `${buf.length} bytes of random data: ${buf.toString('hex')}`);
    * ```
    *
    * The `crypto.randomBytes()` method will not complete until there is
    * sufficient entropy available.
    * This should normally never take longer than a few milliseconds. The only time
    * when generating the random bytes may conceivably block for a longer period of
    * time is right after boot, when the whole system is still low on entropy.
    *
    * This API uses libuv's threadpool, which can have surprising and
    * negative performance implications for some applications; see the `UV_THREADPOOL_SIZE` documentation for more information.
    *
    * The asynchronous version of `crypto.randomBytes()` is carried out in a single
    * threadpool request. To minimize threadpool task length variation, partition
    * large `randomBytes` requests when doing so as part of fulfilling a client
    * request.
    * @since v0.5.8
    * @param size The number of bytes to generate. The `size` must not be larger than `2**31 - 1`.
    * @return if the `callback` function is not provided.
    */
  inline def randomBytes(size: Double): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("randomBytes")(size.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def randomBytes(size: Double, callback: js.Function2[/* err */ js.Error | Null, /* buf */ Buffer, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomBytes")(size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}

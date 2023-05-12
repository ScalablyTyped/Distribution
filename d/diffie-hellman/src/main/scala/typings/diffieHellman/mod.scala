package typings.diffieHellman

import typings.node.NodeJS.ArrayBufferView
import typings.node.cryptoMod.BinaryToTextEncoding
import typings.node.cryptoMod.DiffieHellmanGroup
import typings.node.cryptoMod.DiffieHellman_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("diffie-hellman", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The `DiffieHellman` class is a utility for creating Diffie-Hellman key
    * exchanges.
    *
    * Instances of the `DiffieHellman` class can be created using the {@link createDiffieHellman} function.
    *
    * ```js
    * import assert from 'node:assert';
    *
    * const {
    *   createDiffieHellman,
    * } = await import('node:crypto');
    *
    * // Generate Alice's keys...
    * const alice = createDiffieHellman(2048);
    * const aliceKey = alice.generateKeys();
    *
    * // Generate Bob's keys...
    * const bob = createDiffieHellman(alice.getPrime(), alice.getGenerator());
    * const bobKey = bob.generateKeys();
    *
    * // Exchange and generate the secret...
    * const aliceSecret = alice.computeSecret(bobKey);
    * const bobSecret = bob.computeSecret(aliceKey);
    *
    * // OK
    * assert.strictEqual(aliceSecret.toString('hex'), bobSecret.toString('hex'));
    * ```
    * @since v0.5.0
    */
  @JSImport("diffie-hellman", "DiffieHellman")
  @js.native
  /* private */ open class DiffieHellman () extends DiffieHellman_
  
  /**
    * Creates a `DiffieHellman` key exchange object using the supplied `prime` and an
    * optional specific `generator`.
    *
    * The `generator` argument can be a number, string, or `Buffer`. If`generator` is not specified, the value `2` is used.
    *
    * If `primeEncoding` is specified, `prime` is expected to be a string; otherwise
    * a `Buffer`, `TypedArray`, or `DataView` is expected.
    *
    * If `generatorEncoding` is specified, `generator` is expected to be a string;
    * otherwise a number, `Buffer`, `TypedArray`, or `DataView` is expected.
    * @since v0.11.12
    * @param primeEncoding The `encoding` of the `prime` string.
    * @param [generator=2]
    * @param generatorEncoding The `encoding` of the `generator` string.
    */
  inline def createDiffieHellman(primeLength: Double): DiffieHellman_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(primeLength.asInstanceOf[js.Any]).asInstanceOf[DiffieHellman_]
  inline def createDiffieHellman(primeLength: Double, generator: Double): DiffieHellman_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(primeLength.asInstanceOf[js.Any], generator.asInstanceOf[js.Any])).asInstanceOf[DiffieHellman_]
  inline def createDiffieHellman(prime: String, primeEncoding: BinaryToTextEncoding): DiffieHellman_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime.asInstanceOf[js.Any], primeEncoding.asInstanceOf[js.Any])).asInstanceOf[DiffieHellman_]
  inline def createDiffieHellman(
    prime: String,
    primeEncoding: BinaryToTextEncoding,
    generator: String,
    generatorEncoding: BinaryToTextEncoding
  ): DiffieHellman_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime.asInstanceOf[js.Any], primeEncoding.asInstanceOf[js.Any], generator.asInstanceOf[js.Any], generatorEncoding.asInstanceOf[js.Any])).asInstanceOf[DiffieHellman_]
  inline def createDiffieHellman(prime: String, primeEncoding: BinaryToTextEncoding, generator: js.typedarray.ArrayBuffer): DiffieHellman_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime.asInstanceOf[js.Any], primeEncoding.asInstanceOf[js.Any], generator.asInstanceOf[js.Any])).asInstanceOf[DiffieHellman_]
  inline def createDiffieHellman(prime: String, primeEncoding: BinaryToTextEncoding, generator: Double): DiffieHellman_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime.asInstanceOf[js.Any], primeEncoding.asInstanceOf[js.Any], generator.asInstanceOf[js.Any])).asInstanceOf[DiffieHellman_]
  inline def createDiffieHellman(prime: String, primeEncoding: BinaryToTextEncoding, generator: ArrayBufferView): DiffieHellman_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime.asInstanceOf[js.Any], primeEncoding.asInstanceOf[js.Any], generator.asInstanceOf[js.Any])).asInstanceOf[DiffieHellman_]
  inline def createDiffieHellman(prime: js.typedarray.ArrayBuffer): DiffieHellman_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime.asInstanceOf[js.Any]).asInstanceOf[DiffieHellman_]
  inline def createDiffieHellman(prime: js.typedarray.ArrayBuffer, generator: String, generatorEncoding: BinaryToTextEncoding): DiffieHellman_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime.asInstanceOf[js.Any], generator.asInstanceOf[js.Any], generatorEncoding.asInstanceOf[js.Any])).asInstanceOf[DiffieHellman_]
  inline def createDiffieHellman(prime: js.typedarray.ArrayBuffer, generator: js.typedarray.ArrayBuffer): DiffieHellman_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime.asInstanceOf[js.Any], generator.asInstanceOf[js.Any])).asInstanceOf[DiffieHellman_]
  inline def createDiffieHellman(prime: js.typedarray.ArrayBuffer, generator: Double): DiffieHellman_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime.asInstanceOf[js.Any], generator.asInstanceOf[js.Any])).asInstanceOf[DiffieHellman_]
  inline def createDiffieHellman(prime: js.typedarray.ArrayBuffer, generator: ArrayBufferView): DiffieHellman_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime.asInstanceOf[js.Any], generator.asInstanceOf[js.Any])).asInstanceOf[DiffieHellman_]
  inline def createDiffieHellman(prime: ArrayBufferView): DiffieHellman_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime.asInstanceOf[js.Any]).asInstanceOf[DiffieHellman_]
  inline def createDiffieHellman(prime: ArrayBufferView, generator: String, generatorEncoding: BinaryToTextEncoding): DiffieHellman_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime.asInstanceOf[js.Any], generator.asInstanceOf[js.Any], generatorEncoding.asInstanceOf[js.Any])).asInstanceOf[DiffieHellman_]
  inline def createDiffieHellman(prime: ArrayBufferView, generator: js.typedarray.ArrayBuffer): DiffieHellman_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime.asInstanceOf[js.Any], generator.asInstanceOf[js.Any])).asInstanceOf[DiffieHellman_]
  inline def createDiffieHellman(prime: ArrayBufferView, generator: Double): DiffieHellman_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime.asInstanceOf[js.Any], generator.asInstanceOf[js.Any])).asInstanceOf[DiffieHellman_]
  inline def createDiffieHellman(prime: ArrayBufferView, generator: ArrayBufferView): DiffieHellman_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime.asInstanceOf[js.Any], generator.asInstanceOf[js.Any])).asInstanceOf[DiffieHellman_]
  
  /**
    * Creates a predefined `DiffieHellmanGroup` key exchange object. The
    * supported groups are listed in the documentation for `DiffieHellmanGroup`.
    *
    * The returned object mimics the interface of objects created by {@link createDiffieHellman}, but will not allow changing
    * the keys (with `diffieHellman.setPublicKey()`, for example). The
    * advantage of using this method is that the parties do not have to
    * generate nor exchange a group modulus beforehand, saving both processor
    * and communication time.
    *
    * Example (obtaining a shared secret):
    *
    * ```js
    * const {
    *   getDiffieHellman,
    * } = await import('node:crypto');
    * const alice = getDiffieHellman('modp14');
    * const bob = getDiffieHellman('modp14');
    *
    * alice.generateKeys();
    * bob.generateKeys();
    *
    * const aliceSecret = alice.computeSecret(bob.getPublicKey(), null, 'hex');
    * const bobSecret = bob.computeSecret(alice.getPublicKey(), null, 'hex');
    *
    * // aliceSecret and bobSecret should be the same
    * console.log(aliceSecret === bobSecret);
    * ```
    * @since v0.7.5
    */
  inline def getDiffieHellman(groupName: String): DiffieHellmanGroup = ^.asInstanceOf[js.Dynamic].applyDynamic("getDiffieHellman")(groupName.asInstanceOf[js.Any]).asInstanceOf[DiffieHellmanGroup]
}

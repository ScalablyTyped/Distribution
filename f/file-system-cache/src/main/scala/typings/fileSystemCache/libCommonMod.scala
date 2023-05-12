package typings.fileSystemCache

import typings.fileSystemCache.fileSystemCacheInts.`0`
import typings.fileSystemCache.fileSystemCacheInts.`1`
import typings.fileSystemCache.fileSystemCacheStrings.`rsa-pss`
import typings.fileSystemCache.fileSystemCacheStrings.aes
import typings.fileSystemCache.fileSystemCacheStrings.base64
import typings.fileSystemCache.fileSystemCacheStrings.base64url
import typings.fileSystemCache.fileSystemCacheStrings.buffer
import typings.fileSystemCache.fileSystemCacheStrings.compressed
import typings.fileSystemCache.fileSystemCacheStrings.der
import typings.fileSystemCache.fileSystemCacheStrings.dsa
import typings.fileSystemCache.fileSystemCacheStrings.ec
import typings.fileSystemCache.fileSystemCacheStrings.ed25519
import typings.fileSystemCache.fileSystemCacheStrings.ed448
import typings.fileSystemCache.fileSystemCacheStrings.hex
import typings.fileSystemCache.fileSystemCacheStrings.hmac
import typings.fileSystemCache.fileSystemCacheStrings.hybrid
import typings.fileSystemCache.fileSystemCacheStrings.latin1
import typings.fileSystemCache.fileSystemCacheStrings.pem
import typings.fileSystemCache.fileSystemCacheStrings.rsa
import typings.fileSystemCache.fileSystemCacheStrings.uncompressed
import typings.fileSystemCache.fileSystemCacheStrings.x25519
import typings.fileSystemCache.fileSystemCacheStrings.x448
import typings.fsExtra.anon.Native
import typings.fsExtra.anon.Typeofaccess
import typings.fsExtra.anon.TypeofappendFile
import typings.fsExtra.anon.Typeofchmod
import typings.fsExtra.anon.Typeofchown
import typings.fsExtra.anon.Typeofclose
import typings.fsExtra.anon.TypeofcopyFile
import typings.fsExtra.anon.Typeofexists
import typings.fsExtra.anon.Typeoffchmod
import typings.fsExtra.anon.Typeoffchown
import typings.fsExtra.anon.Typeoffdatasync
import typings.fsExtra.anon.Typeoffstat
import typings.fsExtra.anon.Typeoffsync
import typings.fsExtra.anon.Typeofftruncate
import typings.fsExtra.anon.Typeoffutimes
import typings.fsExtra.anon.Typeoflchmod
import typings.fsExtra.anon.Typeoflchown
import typings.fsExtra.anon.Typeoflink
import typings.fsExtra.anon.Typeoflstat
import typings.fsExtra.anon.Typeofmkdir
import typings.fsExtra.anon.Typeofmkdtemp
import typings.fsExtra.anon.Typeofopen
import typings.fsExtra.anon.Typeofopendir
import typings.fsExtra.anon.Typeofread
import typings.fsExtra.anon.TypeofreadFile
import typings.fsExtra.anon.Typeofreaddir
import typings.fsExtra.anon.Typeofreadlink
import typings.fsExtra.anon.Typeofreadv
import typings.fsExtra.anon.Typeofrealpath
import typings.fsExtra.anon.Typeofrename
import typings.fsExtra.anon.Typeofrm
import typings.fsExtra.anon.Typeofrmdir
import typings.fsExtra.anon.Typeofstat
import typings.fsExtra.anon.Typeofsymlink
import typings.fsExtra.anon.Typeoftruncate
import typings.fsExtra.anon.Typeofunlink
import typings.fsExtra.anon.Typeofutimes
import typings.fsExtra.anon.Typeofwrite
import typings.fsExtra.anon.TypeofwriteFile
import typings.fsExtra.anon.Typeofwritev
import typings.fsExtra.mod.CopyOptions
import typings.fsExtra.mod.CopyOptionsSync
import typings.fsExtra.mod.EnsureDirOptions
import typings.fsExtra.mod.JsonOutputOptions
import typings.fsExtra.mod.MoveOptions
import typings.fsExtra.mod.NoParamCallbackWithUndefined
import typings.fsExtra.mod.SymlinkType
import typings.jsonfile.mod.JFReadOptions
import typings.jsonfile.mod.JFWriteOptions
import typings.jsonfile.mod.Path
import typings.jsonfile.mod.ReadCallback
import typings.jsonfile.mod.WriteCallback
import typings.node.NodeJS.ArrayBufferView
import typings.node.NodeJS.ErrnoException
import typings.node.anon.Encoding
import typings.node.anon.EncodingFlag
import typings.node.anon.Flag
import typings.node.anon.Length
import typings.node.anon.MakeDirectoryOptionsrecur
import typings.node.anon.MakeDirectoryOptionsrecurMode
import typings.node.anon.ObjectEncodingOptionsAbor
import typings.node.anon.ObjectEncodingOptionsflagEncoding
import typings.node.anon.ObjectEncodingOptionsmode
import typings.node.anon.ObjectEncodingOptionswith
import typings.node.anon.ObjectEncodingOptionswithEncoding
import typings.node.anon.PrivateKey
import typings.node.anon.Recursive
import typings.node.anon.StatFsOptionsbigintfalseu
import typings.node.anon.StatFsOptionsbiginttrue
import typings.node.anon.StatOptionsbigintfalseund
import typings.node.anon.StatOptionsbiginttrue
import typings.node.anon.WatchFileOptionsbigintfal
import typings.node.anon.WatchFileOptionsbiginttru
import typings.node.anon.WatchOptionsencodingbuffe
import typings.node.anon.encodingBufferEncodingfla
import typings.node.anon.encodingnullundefinedflag
import typings.node.bufferMod.global.Buffer
import typings.node.bufferMod.global.BufferEncoding
import typings.node.cryptoMod.BinaryLike
import typings.node.cryptoMod.BinaryToTextEncoding
import typings.node.cryptoMod.CheckPrimeOptions
import typings.node.cryptoMod.CipherCCM
import typings.node.cryptoMod.CipherCCMOptions
import typings.node.cryptoMod.CipherCCMTypes
import typings.node.cryptoMod.CipherGCM
import typings.node.cryptoMod.CipherGCMOptions
import typings.node.cryptoMod.CipherGCMTypes
import typings.node.cryptoMod.CipherInfo
import typings.node.cryptoMod.CipherInfoOptions
import typings.node.cryptoMod.CipherKey
import typings.node.cryptoMod.CipherOCB
import typings.node.cryptoMod.CipherOCBOptions
import typings.node.cryptoMod.CipherOCBTypes
import typings.node.cryptoMod.DSAKeyPairKeyObjectOptions
import typings.node.cryptoMod.DSAKeyPairOptions
import typings.node.cryptoMod.DecipherCCM
import typings.node.cryptoMod.DecipherGCM
import typings.node.cryptoMod.DecipherOCB
import typings.node.cryptoMod.DiffieHellmanGroupConstructor
import typings.node.cryptoMod.ECKeyPairKeyObjectOptions
import typings.node.cryptoMod.ECKeyPairOptions
import typings.node.cryptoMod.ED25519KeyPairKeyObjectOptions
import typings.node.cryptoMod.ED25519KeyPairOptions
import typings.node.cryptoMod.ED448KeyPairKeyObjectOptions
import typings.node.cryptoMod.ED448KeyPairOptions
import typings.node.cryptoMod.GeneratePrimeOptions
import typings.node.cryptoMod.GeneratePrimeOptionsArrayBuffer
import typings.node.cryptoMod.GeneratePrimeOptionsBigInt
import typings.node.cryptoMod.HashOptions
import typings.node.cryptoMod.JsonWebKeyInput
import typings.node.cryptoMod.KeyLike
import typings.node.cryptoMod.KeyPairKeyObjectResult
import typings.node.cryptoMod.KeyPairSyncResult
import typings.node.cryptoMod.LargeNumberLike
import typings.node.cryptoMod.PrivateKeyInput
import typings.node.cryptoMod.PublicKeyInput
import typings.node.cryptoMod.RSAKeyPairKeyObjectOptions
import typings.node.cryptoMod.RSAKeyPairOptions
import typings.node.cryptoMod.RSAPSSKeyPairKeyObjectOptions
import typings.node.cryptoMod.RSAPSSKeyPairOptions
import typings.node.cryptoMod.RandomUUIDOptions
import typings.node.cryptoMod.RsaPrivateKey
import typings.node.cryptoMod.RsaPublicKey
import typings.node.cryptoMod.ScryptOptions
import typings.node.cryptoMod.SecureHeapUsage
import typings.node.cryptoMod.SignKeyObjectInput
import typings.node.cryptoMod.SignPrivateKeyInput
import typings.node.cryptoMod.UUID
import typings.node.cryptoMod.VerifyJsonWebKeyInput
import typings.node.cryptoMod.VerifyKeyObjectInput
import typings.node.cryptoMod.VerifyPublicKeyInput
import typings.node.cryptoMod.X25519KeyPairKeyObjectOptions
import typings.node.cryptoMod.X25519KeyPairOptions
import typings.node.cryptoMod.X448KeyPairKeyObjectOptions
import typings.node.cryptoMod.X448KeyPairOptions
import typings.node.cryptoMod.webcrypto.Crypto
import typings.node.cryptoMod.webcrypto.CryptoKey
import typings.node.cryptoMod.webcrypto.SubtleCrypto
import typings.node.fsMod.BigIntStats
import typings.node.fsMod.BigIntStatsFs
import typings.node.fsMod.BigIntStatsListener
import typings.node.fsMod.BufferEncodingOption
import typings.node.fsMod.CopySyncOptions
import typings.node.fsMod.EncodingOption
import typings.node.fsMod.FSWatcher
import typings.node.fsMod.MakeDirectoryOptions
import typings.node.fsMod.Mode
import typings.node.fsMod.NoParamCallback
import typings.node.fsMod.ObjectEncodingOptions
import typings.node.fsMod.OpenDirOptions
import typings.node.fsMod.OpenMode
import typings.node.fsMod.PathLike
import typings.node.fsMod.PathOrFileDescriptor
import typings.node.fsMod.ReadPosition
import typings.node.fsMod.ReadStreamOptions
import typings.node.fsMod.ReadSyncOptions
import typings.node.fsMod.RmDirOptions
import typings.node.fsMod.RmOptions
import typings.node.fsMod.StatFsOptions
import typings.node.fsMod.StatOptions
import typings.node.fsMod.StatSyncFn
import typings.node.fsMod.StatWatcher
import typings.node.fsMod.StatsListener
import typings.node.fsMod.StreamOptions
import typings.node.fsMod.TimeLike
import typings.node.fsMod.WatchListener
import typings.node.fsMod.WatchOptions
import typings.node.fsMod.WriteFileOptions
import typings.node.fsMod.symlink.Type
import typings.node.fsPromisesMod.FileChangeInfo
import typings.node.fsPromisesMod.FileHandle
import typings.node.fsPromisesMod.FlagAndOpenMode
import typings.node.nodeColonstreamMod.Stream
import typings.node.nodeColonurlMod.URL
import typings.node.pathMod.PlatformPath
import typings.node.streamMod.ReadableOptions
import typings.node.streamMod.TransformOptions
import typings.node.streamMod.WritableOptions
import typings.std.AsyncIterable
import typings.std.BigInt64Array
import typings.std.BigUint64Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonMod {
  
  object Util {
    
    @JSImport("file-system-cache/lib/common", "Util")
    @js.native
    val ^ : js.Any = js.native
    
    inline def compact(input: js.Array[Any]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("compact")(input.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    
    @JSImport("file-system-cache/lib/common", "Util.ensureString")
    @js.native
    val ensureString: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_Curry.Curry<(defaultValue : any, text : any): any> */ Any = js.native
    
    inline def filePathsP(basePath: String, ns: String): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("filePathsP")(basePath.asInstanceOf[js.Any], ns.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
    
    inline def getValueP(path: String): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getValueP")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
    inline def getValueP(path: String, defaultValue: Any): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getValueP")(path.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    
    inline def hash(values: Any*): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("hash")(values.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.UndefOr[String]]
    
    inline def isFileSync(path: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFileSync")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isNothing(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNothing")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isString(`val`: Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
    
    inline def readFileSync(path: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
    
    inline def toAbsolutePath(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toAbsolutePath")(path.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def toGetValue(data: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toGetValue")(data.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def toJson(value: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toJson")(value.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def toStringArray(input: js.Array[Any]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("toStringArray")(input.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  }
  
  object crypto {
    
    @JSImport("file-system-cache/lib/common", "crypto")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * SPKAC is a Certificate Signing Request mechanism originally implemented by
      * Netscape and was specified formally as part of [HTML5's `keygen` element](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/keygen).
      *
      * `<keygen>` is deprecated since [HTML 5.2](https://www.w3.org/TR/html52/changes.html#features-removed) and new projects
      * should not use this element anymore.
      *
      * The `node:crypto` module provides the `Certificate` class for working with SPKAC
      * data. The most common usage is handling output generated by the HTML5`<keygen>` element. Node.js uses [OpenSSL's SPKAC
      * implementation](https://www.openssl.org/docs/man1.1.0/apps/openssl-spkac.html) internally.
      * @since v0.11.8
      */
    @JSImport("file-system-cache/lib/common", "crypto.Certificate")
    @js.native
    open class Certificate ()
      extends typings.fileSystemCache.libCommonLibsMod.crypto.Certificate
    object Certificate {
      
      @JSImport("file-system-cache/lib/common", "crypto.Certificate")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * ```js
        * const { Certificate } = await import('node:crypto');
        * const spkac = getSpkacSomehow();
        * const challenge = Certificate.exportChallenge(spkac);
        * console.log(challenge.toString('utf8'));
        * // Prints: the challenge as a UTF8 string
        * ```
        * @since v9.0.0
        * @param encoding The `encoding` of the `spkac` string.
        * @return The challenge component of the `spkac` data structure, which includes a public key and a challenge.
        */
      /* static member */
      inline def exportChallenge(spkac: BinaryLike): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("exportChallenge")(spkac.asInstanceOf[js.Any]).asInstanceOf[Buffer]
      
      /**
        * ```js
        * const { Certificate } = await import('node:crypto');
        * const spkac = getSpkacSomehow();
        * const publicKey = Certificate.exportPublicKey(spkac);
        * console.log(publicKey);
        * // Prints: the public key as <Buffer ...>
        * ```
        * @since v9.0.0
        * @param encoding The `encoding` of the `spkac` string.
        * @return The public key component of the `spkac` data structure, which includes a public key and a challenge.
        */
      /* static member */
      inline def exportPublicKey(spkac: BinaryLike): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("exportPublicKey")(spkac.asInstanceOf[js.Any]).asInstanceOf[Buffer]
      inline def exportPublicKey(spkac: BinaryLike, encoding: String): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("exportPublicKey")(spkac.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Buffer]
      
      /**
        * ```js
        * import { Buffer } from 'node:buffer';
        * const { Certificate } = await import('node:crypto');
        *
        * const spkac = getSpkacSomehow();
        * console.log(Certificate.verifySpkac(Buffer.from(spkac)));
        * // Prints: true or false
        * ```
        * @since v9.0.0
        * @param encoding The `encoding` of the `spkac` string.
        * @return `true` if the given `spkac` data structure is valid, `false` otherwise.
        */
      /* static member */
      inline def verifySpkac(spkac: ArrayBufferView): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("verifySpkac")(spkac.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    }
    
    /**
      * Instances of the `Cipher` class are used to encrypt data. The class can be
      * used in one of two ways:
      *
      * * As a `stream` that is both readable and writable, where plain unencrypted
      * data is written to produce encrypted data on the readable side, or
      * * Using the `cipher.update()` and `cipher.final()` methods to produce
      * the encrypted data.
      *
      * The {@link createCipher} or {@link createCipheriv} methods are
      * used to create `Cipher` instances. `Cipher` objects are not to be created
      * directly using the `new` keyword.
      *
      * Example: Using `Cipher` objects as streams:
      *
      * ```js
      * const {
      *   scrypt,
      *   randomFill,
      *   createCipheriv,
      * } = await import('node:crypto');
      *
      * const algorithm = 'aes-192-cbc';
      * const password = 'Password used to generate key';
      *
      * // First, we'll generate the key. The key length is dependent on the algorithm.
      * // In this case for aes192, it is 24 bytes (192 bits).
      * scrypt(password, 'salt', 24, (err, key) => {
      *   if (err) throw err;
      *   // Then, we'll generate a random initialization vector
      *   randomFill(new Uint8Array(16), (err, iv) => {
      *     if (err) throw err;
      *
      *     // Once we have the key and iv, we can create and use the cipher...
      *     const cipher = createCipheriv(algorithm, key, iv);
      *
      *     let encrypted = '';
      *     cipher.setEncoding('hex');
      *
      *     cipher.on('data', (chunk) => encrypted += chunk);
      *     cipher.on('end', () => console.log(encrypted));
      *
      *     cipher.write('some clear text data');
      *     cipher.end();
      *   });
      * });
      * ```
      *
      * Example: Using `Cipher` and piped streams:
      *
      * ```js
      * import {
      *   createReadStream,
      *   createWriteStream,
      * } from 'node:fs';
      *
      * import {
      *   pipeline,
      * } from 'node:stream';
      *
      * const {
      *   scrypt,
      *   randomFill,
      *   createCipheriv,
      * } = await import('node:crypto');
      *
      * const algorithm = 'aes-192-cbc';
      * const password = 'Password used to generate key';
      *
      * // First, we'll generate the key. The key length is dependent on the algorithm.
      * // In this case for aes192, it is 24 bytes (192 bits).
      * scrypt(password, 'salt', 24, (err, key) => {
      *   if (err) throw err;
      *   // Then, we'll generate a random initialization vector
      *   randomFill(new Uint8Array(16), (err, iv) => {
      *     if (err) throw err;
      *
      *     const cipher = createCipheriv(algorithm, key, iv);
      *
      *     const input = createReadStream('test.js');
      *     const output = createWriteStream('test.enc');
      *
      *     pipeline(input, cipher, output, (err) => {
      *       if (err) throw err;
      *     });
      *   });
      * });
      * ```
      *
      * Example: Using the `cipher.update()` and `cipher.final()` methods:
      *
      * ```js
      * const {
      *   scrypt,
      *   randomFill,
      *   createCipheriv,
      * } = await import('node:crypto');
      *
      * const algorithm = 'aes-192-cbc';
      * const password = 'Password used to generate key';
      *
      * // First, we'll generate the key. The key length is dependent on the algorithm.
      * // In this case for aes192, it is 24 bytes (192 bits).
      * scrypt(password, 'salt', 24, (err, key) => {
      *   if (err) throw err;
      *   // Then, we'll generate a random initialization vector
      *   randomFill(new Uint8Array(16), (err, iv) => {
      *     if (err) throw err;
      *
      *     const cipher = createCipheriv(algorithm, key, iv);
      *
      *     let encrypted = cipher.update('some clear text data', 'utf8', 'hex');
      *     encrypted += cipher.final('hex');
      *     console.log(encrypted);
      *   });
      * });
      * ```
      * @since v0.1.94
      */
    @JSImport("file-system-cache/lib/common", "crypto.Cipher")
    @js.native
    /* private */ open class Cipher ()
      extends typings.fileSystemCache.libCommonLibsMod.crypto.Cipher
    
    /**
      * Instances of the `Decipher` class are used to decrypt data. The class can be
      * used in one of two ways:
      *
      * * As a `stream` that is both readable and writable, where plain encrypted
      * data is written to produce unencrypted data on the readable side, or
      * * Using the `decipher.update()` and `decipher.final()` methods to
      * produce the unencrypted data.
      *
      * The {@link createDecipher} or {@link createDecipheriv} methods are
      * used to create `Decipher` instances. `Decipher` objects are not to be created
      * directly using the `new` keyword.
      *
      * Example: Using `Decipher` objects as streams:
      *
      * ```js
      * import { Buffer } from 'node:buffer';
      * const {
      *   scryptSync,
      *   createDecipheriv,
      * } = await import('node:crypto');
      *
      * const algorithm = 'aes-192-cbc';
      * const password = 'Password used to generate key';
      * // Key length is dependent on the algorithm. In this case for aes192, it is
      * // 24 bytes (192 bits).
      * // Use the async `crypto.scrypt()` instead.
      * const key = scryptSync(password, 'salt', 24);
      * // The IV is usually passed along with the ciphertext.
      * const iv = Buffer.alloc(16, 0); // Initialization vector.
      *
      * const decipher = createDecipheriv(algorithm, key, iv);
      *
      * let decrypted = '';
      * decipher.on('readable', () => {
      *   let chunk;
      *   while (null !== (chunk = decipher.read())) {
      *     decrypted += chunk.toString('utf8');
      *   }
      * });
      * decipher.on('end', () => {
      *   console.log(decrypted);
      *   // Prints: some clear text data
      * });
      *
      * // Encrypted with same algorithm, key and iv.
      * const encrypted =
      *   'e5f79c5915c02171eec6b212d5520d44480993d7d622a7c4c2da32f6efda0ffa';
      * decipher.write(encrypted, 'hex');
      * decipher.end();
      * ```
      *
      * Example: Using `Decipher` and piped streams:
      *
      * ```js
      * import {
      *   createReadStream,
      *   createWriteStream,
      * } from 'node:fs';
      * import { Buffer } from 'node:buffer';
      * const {
      *   scryptSync,
      *   createDecipheriv,
      * } = await import('node:crypto');
      *
      * const algorithm = 'aes-192-cbc';
      * const password = 'Password used to generate key';
      * // Use the async `crypto.scrypt()` instead.
      * const key = scryptSync(password, 'salt', 24);
      * // The IV is usually passed along with the ciphertext.
      * const iv = Buffer.alloc(16, 0); // Initialization vector.
      *
      * const decipher = createDecipheriv(algorithm, key, iv);
      *
      * const input = createReadStream('test.enc');
      * const output = createWriteStream('test.js');
      *
      * input.pipe(decipher).pipe(output);
      * ```
      *
      * Example: Using the `decipher.update()` and `decipher.final()` methods:
      *
      * ```js
      * import { Buffer } from 'node:buffer';
      * const {
      *   scryptSync,
      *   createDecipheriv,
      * } = await import('node:crypto');
      *
      * const algorithm = 'aes-192-cbc';
      * const password = 'Password used to generate key';
      * // Use the async `crypto.scrypt()` instead.
      * const key = scryptSync(password, 'salt', 24);
      * // The IV is usually passed along with the ciphertext.
      * const iv = Buffer.alloc(16, 0); // Initialization vector.
      *
      * const decipher = createDecipheriv(algorithm, key, iv);
      *
      * // Encrypted using same algorithm, key and iv.
      * const encrypted =
      *   'e5f79c5915c02171eec6b212d5520d44480993d7d622a7c4c2da32f6efda0ffa';
      * let decrypted = decipher.update(encrypted, 'hex', 'utf8');
      * decrypted += decipher.final('utf8');
      * console.log(decrypted);
      * // Prints: some clear text data
      * ```
      * @since v0.1.94
      */
    @JSImport("file-system-cache/lib/common", "crypto.Decipher")
    @js.native
    /* private */ open class Decipher ()
      extends typings.fileSystemCache.libCommonLibsMod.crypto.Decipher
    
    /**
      * The `DiffieHellmanGroup` class takes a well-known modp group as its argument.
      * It works the same as `DiffieHellman`, except that it does not allow changing its keys after creation.
      * In other words, it does not implement `setPublicKey()` or `setPrivateKey()` methods.
      *
      * ```js
      * const { createDiffieHellmanGroup } = await import('node:crypto');
      * const dh = createDiffieHellmanGroup('modp1');
      * ```
      * The name (e.g. `'modp1'`) is taken from [RFC 2412](https://www.rfc-editor.org/rfc/rfc2412.txt) (modp1 and 2) and [RFC 3526](https://www.rfc-editor.org/rfc/rfc3526.txt):
      * ```bash
      * $ perl -ne 'print "$1\n" if /"(modp\d+)"/' src/node_crypto_groups.h
      * modp1  #  768 bits
      * modp2  # 1024 bits
      * modp5  # 1536 bits
      * modp14 # 2048 bits
      * modp15 # etc.
      * modp16
      * modp17
      * modp18
      * ```
      * @since v0.7.5
      */
    @JSImport("file-system-cache/lib/common", "crypto.DiffieHellmanGroup")
    @js.native
    val DiffieHellmanGroup: DiffieHellmanGroupConstructor = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("file-system-cache/lib/common", "crypto.DiffieHellmanGroup")
    @js.native
    open class DiffieHellmanGroupCls protected ()
      extends StObject
         with typings.node.cryptoMod.DiffieHellmanGroup {
      def this(name: String) = this()
      
      /* CompleteClass */
      override def computeSecret(otherPublicKey: ArrayBufferView): Buffer = js.native
      /* CompleteClass */
      @JSName("computeSecret")
      var computeSecret_Original: js.Function3[
            /* otherPublicKey */ ArrayBufferView, 
            /* inputEncoding */ js.UndefOr[Null], 
            /* outputEncoding */ js.UndefOr[Null], 
            Buffer
          ] = js.native
      
      /* CompleteClass */
      @JSName("constructor")
      var constructor_Original: js.Function0[Any] = js.native
      
      /* CompleteClass */
      override def generateKeys(): Buffer = js.native
      /* CompleteClass */
      @JSName("generateKeys")
      var generateKeys_Original: js.Function0[Buffer] = js.native
      
      /* CompleteClass */
      override def getGenerator(): Buffer = js.native
      /* CompleteClass */
      @JSName("getGenerator")
      var getGenerator_Original: js.Function0[Buffer] = js.native
      
      /* CompleteClass */
      override def getPrime(): Buffer = js.native
      /* CompleteClass */
      @JSName("getPrime")
      var getPrime_Original: js.Function0[Buffer] = js.native
      
      /* CompleteClass */
      override def getPrivateKey(): Buffer = js.native
      /* CompleteClass */
      @JSName("getPrivateKey")
      var getPrivateKey_Original: js.Function0[Buffer] = js.native
      
      /* CompleteClass */
      override def getPublicKey(): Buffer = js.native
      /* CompleteClass */
      @JSName("getPublicKey")
      var getPublicKey_Original: js.Function0[Buffer] = js.native
      
      /* CompleteClass */
      var verifyError: Double = js.native
    }
    
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
    @JSImport("file-system-cache/lib/common", "crypto.DiffieHellman")
    @js.native
    /* private */ open class DiffieHellman_ ()
      extends typings.fileSystemCache.libCommonLibsMod.crypto.DiffieHellman_
    
    /**
      * The `ECDH` class is a utility for creating Elliptic Curve Diffie-Hellman (ECDH)
      * key exchanges.
      *
      * Instances of the `ECDH` class can be created using the {@link createECDH} function.
      *
      * ```js
      * import assert from 'node:assert';
      *
      * const {
      *   createECDH,
      * } = await import('node:crypto');
      *
      * // Generate Alice's keys...
      * const alice = createECDH('secp521r1');
      * const aliceKey = alice.generateKeys();
      *
      * // Generate Bob's keys...
      * const bob = createECDH('secp521r1');
      * const bobKey = bob.generateKeys();
      *
      * // Exchange and generate the secret...
      * const aliceSecret = alice.computeSecret(bobKey);
      * const bobSecret = bob.computeSecret(aliceKey);
      *
      * assert.strictEqual(aliceSecret.toString('hex'), bobSecret.toString('hex'));
      * // OK
      * ```
      * @since v0.11.14
      */
    @JSImport("file-system-cache/lib/common", "crypto.ECDH")
    @js.native
    /* private */ open class ECDH ()
      extends typings.fileSystemCache.libCommonLibsMod.crypto.ECDH
    object ECDH {
      
      @JSImport("file-system-cache/lib/common", "crypto.ECDH")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Converts the EC Diffie-Hellman public key specified by `key` and `curve` to the
        * format specified by `format`. The `format` argument specifies point encoding
        * and can be `'compressed'`, `'uncompressed'` or `'hybrid'`. The supplied key is
        * interpreted using the specified `inputEncoding`, and the returned key is encoded
        * using the specified `outputEncoding`.
        *
        * Use {@link getCurves} to obtain a list of available curve names.
        * On recent OpenSSL releases, `openssl ecparam -list_curves` will also display
        * the name and description of each available elliptic curve.
        *
        * If `format` is not specified the point will be returned in `'uncompressed'`format.
        *
        * If the `inputEncoding` is not provided, `key` is expected to be a `Buffer`,`TypedArray`, or `DataView`.
        *
        * Example (uncompressing a key):
        *
        * ```js
        * const {
        *   createECDH,
        *   ECDH,
        * } = await import('node:crypto');
        *
        * const ecdh = createECDH('secp256k1');
        * ecdh.generateKeys();
        *
        * const compressedKey = ecdh.getPublicKey('hex', 'compressed');
        *
        * const uncompressedKey = ECDH.convertKey(compressedKey,
        *                                         'secp256k1',
        *                                         'hex',
        *                                         'hex',
        *                                         'uncompressed');
        *
        * // The converted key and the uncompressed public key should be the same
        * console.log(uncompressedKey === ecdh.getPublicKey('hex'));
        * ```
        * @since v10.0.0
        * @param inputEncoding The `encoding` of the `key` string.
        * @param outputEncoding The `encoding` of the return value.
        * @param [format='uncompressed']
        */
      /* static member */
      inline def convertKey(key: BinaryLike, curve: String): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
      inline def convertKey(
        key: BinaryLike,
        curve: String,
        inputEncoding: Unit,
        outputEncoding: latin1 | hex | base64 | base64url
      ): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
      inline def convertKey(
        key: BinaryLike,
        curve: String,
        inputEncoding: Unit,
        outputEncoding: latin1 | hex | base64 | base64url,
        format: uncompressed | compressed | hybrid
      ): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
      inline def convertKey(
        key: BinaryLike,
        curve: String,
        inputEncoding: Unit,
        outputEncoding: Unit,
        format: uncompressed | compressed | hybrid
      ): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
      inline def convertKey(key: BinaryLike, curve: String, inputEncoding: BinaryToTextEncoding): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
      inline def convertKey(
        key: BinaryLike,
        curve: String,
        inputEncoding: BinaryToTextEncoding,
        outputEncoding: latin1 | hex | base64 | base64url
      ): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
      inline def convertKey(
        key: BinaryLike,
        curve: String,
        inputEncoding: BinaryToTextEncoding,
        outputEncoding: latin1 | hex | base64 | base64url,
        format: uncompressed | compressed | hybrid
      ): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
      inline def convertKey(
        key: BinaryLike,
        curve: String,
        inputEncoding: BinaryToTextEncoding,
        outputEncoding: Unit,
        format: uncompressed | compressed | hybrid
      ): Buffer | String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertKey")(key.asInstanceOf[js.Any], curve.asInstanceOf[js.Any], inputEncoding.asInstanceOf[js.Any], outputEncoding.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Buffer | String]
    }
    
    /**
      * The `Hash` class is a utility for creating hash digests of data. It can be
      * used in one of two ways:
      *
      * * As a `stream` that is both readable and writable, where data is written
      * to produce a computed hash digest on the readable side, or
      * * Using the `hash.update()` and `hash.digest()` methods to produce the
      * computed hash.
      *
      * The {@link createHash} method is used to create `Hash` instances. `Hash`objects are not to be created directly using the `new` keyword.
      *
      * Example: Using `Hash` objects as streams:
      *
      * ```js
      * const {
      *   createHash,
      * } = await import('node:crypto');
      *
      * const hash = createHash('sha256');
      *
      * hash.on('readable', () => {
      *   // Only one element is going to be produced by the
      *   // hash stream.
      *   const data = hash.read();
      *   if (data) {
      *     console.log(data.toString('hex'));
      *     // Prints:
      *     //   6a2da20943931e9834fc12cfe5bb47bbd9ae43489a30726962b576f4e3993e50
      *   }
      * });
      *
      * hash.write('some data to hash');
      * hash.end();
      * ```
      *
      * Example: Using `Hash` and piped streams:
      *
      * ```js
      * import { createReadStream } from 'node:fs';
      * import { stdout } from 'node:process';
      * const { createHash } = await import('node:crypto');
      *
      * const hash = createHash('sha256');
      *
      * const input = createReadStream('test.js');
      * input.pipe(hash).setEncoding('hex').pipe(stdout);
      * ```
      *
      * Example: Using the `hash.update()` and `hash.digest()` methods:
      *
      * ```js
      * const {
      *   createHash,
      * } = await import('node:crypto');
      *
      * const hash = createHash('sha256');
      *
      * hash.update('some data to hash');
      * console.log(hash.digest('hex'));
      * // Prints:
      * //   6a2da20943931e9834fc12cfe5bb47bbd9ae43489a30726962b576f4e3993e50
      * ```
      * @since v0.1.92
      */
    @JSImport("file-system-cache/lib/common", "crypto.Hash")
    @js.native
    /* private */ open class Hash ()
      extends typings.fileSystemCache.libCommonLibsMod.crypto.Hash
    
    /**
      * The `Hmac` class is a utility for creating cryptographic HMAC digests. It can
      * be used in one of two ways:
      *
      * * As a `stream` that is both readable and writable, where data is written
      * to produce a computed HMAC digest on the readable side, or
      * * Using the `hmac.update()` and `hmac.digest()` methods to produce the
      * computed HMAC digest.
      *
      * The {@link createHmac} method is used to create `Hmac` instances. `Hmac`objects are not to be created directly using the `new` keyword.
      *
      * Example: Using `Hmac` objects as streams:
      *
      * ```js
      * const {
      *   createHmac,
      * } = await import('node:crypto');
      *
      * const hmac = createHmac('sha256', 'a secret');
      *
      * hmac.on('readable', () => {
      *   // Only one element is going to be produced by the
      *   // hash stream.
      *   const data = hmac.read();
      *   if (data) {
      *     console.log(data.toString('hex'));
      *     // Prints:
      *     //   7fd04df92f636fd450bc841c9418e5825c17f33ad9c87c518115a45971f7f77e
      *   }
      * });
      *
      * hmac.write('some data to hash');
      * hmac.end();
      * ```
      *
      * Example: Using `Hmac` and piped streams:
      *
      * ```js
      * import { createReadStream } from 'node:fs';
      * import { stdout } from 'node:process';
      * const {
      *   createHmac,
      * } = await import('node:crypto');
      *
      * const hmac = createHmac('sha256', 'a secret');
      *
      * const input = createReadStream('test.js');
      * input.pipe(hmac).pipe(stdout);
      * ```
      *
      * Example: Using the `hmac.update()` and `hmac.digest()` methods:
      *
      * ```js
      * const {
      *   createHmac,
      * } = await import('node:crypto');
      *
      * const hmac = createHmac('sha256', 'a secret');
      *
      * hmac.update('some data to hash');
      * console.log(hmac.digest('hex'));
      * // Prints:
      * //   7fd04df92f636fd450bc841c9418e5825c17f33ad9c87c518115a45971f7f77e
      * ```
      * @since v0.1.94
      */
    @JSImport("file-system-cache/lib/common", "crypto.Hmac")
    @js.native
    /* private */ open class Hmac ()
      extends typings.fileSystemCache.libCommonLibsMod.crypto.Hmac
    
    /**
      * Node.js uses a `KeyObject` class to represent a symmetric or asymmetric key,
      * and each kind of key exposes different functions. The {@link createSecretKey}, {@link createPublicKey} and {@link createPrivateKey} methods are used to create `KeyObject`instances. `KeyObject`
      * objects are not to be created directly using the `new`keyword.
      *
      * Most applications should consider using the new `KeyObject` API instead of
      * passing keys as strings or `Buffer`s due to improved security features.
      *
      * `KeyObject` instances can be passed to other threads via `postMessage()`.
      * The receiver obtains a cloned `KeyObject`, and the `KeyObject` does not need to
      * be listed in the `transferList` argument.
      * @since v11.6.0
      */
    @JSImport("file-system-cache/lib/common", "crypto.KeyObject")
    @js.native
    /* private */ open class KeyObject ()
      extends typings.fileSystemCache.libCommonLibsMod.crypto.KeyObject
    object KeyObject {
      
      @JSImport("file-system-cache/lib/common", "crypto.KeyObject")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Example: Converting a `CryptoKey` instance to a `KeyObject`:
        *
        * ```js
        * const { KeyObject } = await import('node:crypto');
        * const { subtle } = globalThis.crypto;
        *
        * const key = await subtle.generateKey({
        *   name: 'HMAC',
        *   hash: 'SHA-256',
        *   length: 256,
        * }, true, ['sign', 'verify']);
        *
        * const keyObject = KeyObject.from(key);
        * console.log(keyObject.symmetricKeySize);
        * // Prints: 32 (symmetric key size in bytes)
        * ```
        * @since v15.0.0
        */
      /* static member */
      inline def from(key: CryptoKey): typings.node.cryptoMod.KeyObject = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(key.asInstanceOf[js.Any]).asInstanceOf[typings.node.cryptoMod.KeyObject]
    }
    
    /**
      * The `Sign` class is a utility for generating signatures. It can be used in one
      * of two ways:
      *
      * * As a writable `stream`, where data to be signed is written and the `sign.sign()` method is used to generate and return the signature, or
      * * Using the `sign.update()` and `sign.sign()` methods to produce the
      * signature.
      *
      * The {@link createSign} method is used to create `Sign` instances. The
      * argument is the string name of the hash function to use. `Sign` objects are not
      * to be created directly using the `new` keyword.
      *
      * Example: Using `Sign` and `Verify` objects as streams:
      *
      * ```js
      * const {
      *   generateKeyPairSync,
      *   createSign,
      *   createVerify,
      * } = await import('node:crypto');
      *
      * const { privateKey, publicKey } = generateKeyPairSync('ec', {
      *   namedCurve: 'sect239k1',
      * });
      *
      * const sign = createSign('SHA256');
      * sign.write('some data to sign');
      * sign.end();
      * const signature = sign.sign(privateKey, 'hex');
      *
      * const verify = createVerify('SHA256');
      * verify.write('some data to sign');
      * verify.end();
      * console.log(verify.verify(publicKey, signature, 'hex'));
      * // Prints: true
      * ```
      *
      * Example: Using the `sign.update()` and `verify.update()` methods:
      *
      * ```js
      * const {
      *   generateKeyPairSync,
      *   createSign,
      *   createVerify,
      * } = await import('node:crypto');
      *
      * const { privateKey, publicKey } = generateKeyPairSync('rsa', {
      *   modulusLength: 2048,
      * });
      *
      * const sign = createSign('SHA256');
      * sign.update('some data to sign');
      * sign.end();
      * const signature = sign.sign(privateKey);
      *
      * const verify = createVerify('SHA256');
      * verify.update('some data to sign');
      * verify.end();
      * console.log(verify.verify(publicKey, signature));
      * // Prints: true
      * ```
      * @since v0.1.92
      */
    @JSImport("file-system-cache/lib/common", "crypto.Sign")
    @js.native
    /* private */ open class Sign_ ()
      extends typings.fileSystemCache.libCommonLibsMod.crypto.Sign_
    
    /**
      * The `Verify` class is a utility for verifying signatures. It can be used in one
      * of two ways:
      *
      * * As a writable `stream` where written data is used to validate against the
      * supplied signature, or
      * * Using the `verify.update()` and `verify.verify()` methods to verify
      * the signature.
      *
      * The {@link createVerify} method is used to create `Verify` instances.`Verify` objects are not to be created directly using the `new` keyword.
      *
      * See `Sign` for examples.
      * @since v0.1.92
      */
    @JSImport("file-system-cache/lib/common", "crypto.Verify")
    @js.native
    /* private */ open class Verify_ ()
      extends typings.fileSystemCache.libCommonLibsMod.crypto.Verify_
    
    /**
      * Encapsulates an X509 certificate and provides read-only access to
      * its information.
      *
      * ```js
      * const { X509Certificate } = await import('node:crypto');
      *
      * const x509 = new X509Certificate('{... pem encoded cert ...}');
      *
      * console.log(x509.subject);
      * ```
      * @since v15.6.0
      */
    @JSImport("file-system-cache/lib/common", "crypto.X509Certificate")
    @js.native
    open class X509Certificate protected ()
      extends typings.fileSystemCache.libCommonLibsMod.crypto.X509Certificate {
      def this(buffer: BinaryLike) = this()
    }
    
    /**
      * Checks the primality of the `candidate`.
      * @since v15.8.0
      * @param candidate A possible prime encoded as a sequence of big endian octets of arbitrary length.
      */
    inline def checkPrime(
      value: LargeNumberLike,
      callback: js.Function2[/* err */ js.Error | Null, /* result */ Boolean, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkPrime")(value.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def checkPrime(
      value: LargeNumberLike,
      options: CheckPrimeOptions,
      callback: js.Function2[/* err */ js.Error | Null, /* result */ Boolean, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkPrime")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Checks the primality of the `candidate`.
      * @since v15.8.0
      * @param candidate A possible prime encoded as a sequence of big endian octets of arbitrary length.
      * @return `true` if the candidate is a prime with an error probability less than `0.25 ** options.checks`.
      */
    inline def checkPrimeSync(candidate: LargeNumberLike): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("checkPrimeSync")(candidate.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def checkPrimeSync(candidate: LargeNumberLike, options: CheckPrimeOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("checkPrimeSync")(candidate.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    object constants {
      
      @JSImport("file-system-cache/lib/common", "crypto.constants.DH_CHECK_P_NOT_PRIME")
      @js.native
      val DH_CHECK_P_NOT_PRIME: Double = js.native
      
      @JSImport("file-system-cache/lib/common", "crypto.constants.DH_CHECK_P_NOT_SAFE_PRIME")
      @js.native
      val DH_CHECK_P_NOT_SAFE_PRIME: Double = js.native
      
      @JSImport("file-system-cache/lib/common", "crypto.constants.DH_NOT_SUITABLE_GENERATOR")
      @js.native
      val DH_NOT_SUITABLE_GENERATOR: Double = js.native
      
      @JSImport("file-system-cache/lib/common", "crypto.constants.DH_UNABLE_TO_CHECK_GENERATOR")
      @js.native
      val DH_UNABLE_TO_CHECK_GENERATOR: Double = js.native
      
      @JSImport("file-system-cache/lib/common", "crypto.constants.ENGINE_METHOD_ALL")
      @js.native
      val ENGINE_METHOD_ALL: Double = js.native
      
      @JSImport("file-system-cache/lib/common", "crypto.constants.ENGINE_METHOD_CIPHERS")
      @js.native
      val ENGINE_METHOD_CIPHERS: Double = js.native
      
      @JSImport("file-system-cache/lib/common", "crypto.constants.ENGINE_METHOD_DH")
      @js.native
      val ENGINE_METHOD_DH: Double = js.native
      
      @JSImport("file-system-cache/lib/common", "crypto.constants.ENGINE_METHOD_DIGESTS")
      @js.native
      val ENGINE_METHOD_DIGESTS: Double = js.native
      
      @JSImport("file-system-cache/lib/common", "crypto.constants.ENGINE_METHOD_DSA")
      @js.native
      val ENGINE_METHOD_DSA: Double = js.native
      
      @JSImport("file-system-cache/lib/common", "crypto.constants.ENGINE_METHOD_EC")
      @js.native
      val ENGINE_METHOD_EC: Double = js.native
      
      @JSImport("file-system-cache/lib/common", "crypto.constants.ENGINE_METHOD_NONE")
      @js.native
      val ENGINE_METHOD_NONE: Double = js.native
      
      @JSImport("file-system-cache/lib/common", "crypto.constants.ENGINE_METHOD_PKEY_ASN1_METHS")
      @js.native
      val ENGINE_METHOD_PKEY_ASN1_METHS: Double = js.native
      
      @JSImport("file-system-cache/lib/common", "crypto.constants.ENGINE_METHOD_PKEY_METHS")
      @js.native
      val ENGINE_METHOD_PKEY_METHS: Double = js.native
      
      @JSImport("file-system-cache/lib/common", "crypto.constants.ENGINE_METHOD_RAND")
      @js.native
      val ENGINE_METHOD_RAND: Double = js.native
      
      @JSImport("file-system-cache/lib/common", "crypto.constants.ENGINE_METHOD_RSA")
      @js.native
      val ENGINE_METHOD_RSA: Double = js.native
      
      // https://nodejs.org/dist/latest-v20.x/docs/api/crypto.html#crypto-constants
      @JSImport("file-system-cache/lib/common", "crypto.constants.OPENSSL_VERSION_NUMBER")
      @js.native
      val OPENSSL_VERSION_NUMBER: Double = js.native
      
      @JSImport("file-system-cache/lib/common", "crypto.constants.POINT_CONVERSION_COMPRESSED")
      @js.native
      val POINT_CONVERSION_COMPRESSED: Double = js.native
      
      @JSImport("file-system-cache/lib/common", "crypto.constants.POINT_CONVERSION_HYBRID")
      @js.native
      val POINT_CONVERSION_HYBRID: Double = js.native
      
      @JSImport("file-system-cache/lib/common", "crypto.constants.POINT_CONVERSION_UNCOMPRESSED")
      @js.native
      val POINT_CONVERSION_UNCOMPRESSED: Double = js.native
      
      @JSImport("file-system-cache/lib/common", "crypto.constants.RSA_NO_PADDING")
      @js.native
      val RSA_NO_PADDING: Double = js.native
      
      @JSImport("file-system-cache/lib/common", "crypto.constants.RSA_PKCS1_OAEP_PADDING")
      @js.native
      val RSA_PKCS1_OAEP_PADDING: Double = js.native
      
      @JSImport("file-system-cache/lib/common", "crypto.constants.RSA_PKCS1_PADDING")
      @js.native
      val RSA_PKCS1_PADDING: Double = js.native
      
      @JSImport("file-system-cache/lib/common", "crypto.constants.RSA_PKCS1_PSS_PADDING")
      @js.native
      val RSA_PKCS1_PSS_PADDING: Double = js.native
      
      /** Causes the salt length for RSA_PKCS1_PSS_PADDING to be determined automatically when verifying a signature. */
      @JSImport("file-system-cache/lib/common", "crypto.constants.RSA_PSS_SALTLEN_AUTO")
      @js.native
      val RSA_PSS_SALTLEN_AUTO: Double = js.native
      
      /** Sets the salt length for RSA_PKCS1_PSS_PADDING to the digest size when signing or verifying. */
      @JSImport("file-system-cache/lib/common", "crypto.constants.RSA_PSS_SALTLEN_DIGEST")
      @js.native
      val RSA_PSS_SALTLEN_DIGEST: Double = js.native
      
      /** Sets the salt length for RSA_PKCS1_PSS_PADDING to the maximum permissible value when signing data. */
      @JSImport("file-system-cache/lib/common", "crypto.constants.RSA_PSS_SALTLEN_MAX_SIGN")
      @js.native
      val RSA_PSS_SALTLEN_MAX_SIGN: Double = js.native
      
      @JSImport("file-system-cache/lib/common", "crypto.constants.RSA_SSLV23_PADDING")
      @js.native
      val RSA_SSLV23_PADDING: Double = js.native
      
      @JSImport("file-system-cache/lib/common", "crypto.constants.RSA_X931_PADDING")
      @js.native
      val RSA_X931_PADDING: Double = js.native
      
      @JSImport("file-system-cache/lib/common", "crypto.constants.SSL_OP_NO_SSLv2")
      @js.native
      val SSLOPNOSSLv2: Double = js.native
      
      @JSImport("file-system-cache/lib/common", "crypto.constants.SSL_OP_NO_SSLv3")
      @js.native
      val SSLOPNOSSLv3: Double = js.native
      
      @JSImport("file-system-cache/lib/common", "crypto.constants.SSL_OP_NO_TLSv1")
      @js.native
      val SSLOPNOTLSv1: Double = js.native
      
      @JSImport("file-system-cache/lib/common", "crypto.constants.SSL_OP_NO_TLSv1_1")
      @js.native
      val SSLOPNOTLSv11: Double = js.native
      
      @JSImport("file-system-cache/lib/common", "crypto.constants.SSL_OP_NO_TLSv1_2")
      @js.native
      val SSLOPNOTLSv12: Double = js.native
      
      /** Applies multiple bug workarounds within OpenSSL. See https://www.openssl.org/docs/man1.0.2/ssl/SSL_CTX_set_options.html for detail. */
      @JSImport("file-system-cache/lib/common", "crypto.constants.SSL_OP_ALL")
      @js.native
      val SSL_OP_ALL: Double = js.native
      
      /** Allows legacy insecure renegotiation between OpenSSL and unpatched clients or servers. See https://www.openssl.org/docs/man1.0.2/ssl/SSL_CTX_set_options.html. */
      @JSImport("file-system-cache/lib/common", "crypto.constants.SSL_OP_ALLOW_UNSAFE_LEGACY_RENEGOTIATION")
      @js.native
      val SSL_OP_ALLOW_UNSAFE_LEGACY_RENEGOTIATION: Double = js.native
      
      /** Attempts to use the server's preferences instead of the client's when selecting a cipher. See https://www.openssl.org/docs/man1.0.2/ssl/SSL_CTX_set_options.html. */
      @JSImport("file-system-cache/lib/common", "crypto.constants.SSL_OP_CIPHER_SERVER_PREFERENCE")
      @js.native
      val SSL_OP_CIPHER_SERVER_PREFERENCE: Double = js.native
      
      /** Instructs OpenSSL to use Cisco's "speshul" version of DTLS_BAD_VER. */
      @JSImport("file-system-cache/lib/common", "crypto.constants.SSL_OP_CISCO_ANYCONNECT")
      @js.native
      val SSL_OP_CISCO_ANYCONNECT: Double = js.native
      
      /** Instructs OpenSSL to turn on cookie exchange. */
      @JSImport("file-system-cache/lib/common", "crypto.constants.SSL_OP_COOKIE_EXCHANGE")
      @js.native
      val SSL_OP_COOKIE_EXCHANGE: Double = js.native
      
      /** Instructs OpenSSL to add server-hello extension from an early version of the cryptopro draft. */
      @JSImport("file-system-cache/lib/common", "crypto.constants.SSL_OP_CRYPTOPRO_TLSEXT_BUG")
      @js.native
      val SSL_OP_CRYPTOPRO_TLSEXT_BUG: Double = js.native
      
      /** Instructs OpenSSL to disable a SSL 3.0/TLS 1.0 vulnerability workaround added in OpenSSL 0.9.6d. */
      @JSImport("file-system-cache/lib/common", "crypto.constants.SSL_OP_DONT_INSERT_EMPTY_FRAGMENTS")
      @js.native
      val SSL_OP_DONT_INSERT_EMPTY_FRAGMENTS: Double = js.native
      
      /** Allows initial connection to servers that do not support RI. */
      @JSImport("file-system-cache/lib/common", "crypto.constants.SSL_OP_LEGACY_SERVER_CONNECT")
      @js.native
      val SSL_OP_LEGACY_SERVER_CONNECT: Double = js.native
      
      /** Instructs OpenSSL to disable support for SSL/TLS compression. */
      @JSImport("file-system-cache/lib/common", "crypto.constants.SSL_OP_NO_COMPRESSION")
      @js.native
      val SSL_OP_NO_COMPRESSION: Double = js.native
      
      @JSImport("file-system-cache/lib/common", "crypto.constants.SSL_OP_NO_QUERY_MTU")
      @js.native
      val SSL_OP_NO_QUERY_MTU: Double = js.native
      
      /** Instructs OpenSSL to always start a new session when performing renegotiation. */
      @JSImport("file-system-cache/lib/common", "crypto.constants.SSL_OP_NO_SESSION_RESUMPTION_ON_RENEGOTIATION")
      @js.native
      val SSL_OP_NO_SESSION_RESUMPTION_ON_RENEGOTIATION: Double = js.native
      
      @JSImport("file-system-cache/lib/common", "crypto.constants.SSL_OP_NO_TICKET")
      @js.native
      val SSL_OP_NO_TICKET: Double = js.native
      
      /** Instructs OpenSSL to disable version rollback attack detection. */
      @JSImport("file-system-cache/lib/common", "crypto.constants.SSL_OP_TLS_ROLLBACK_BUG")
      @js.native
      val SSL_OP_TLS_ROLLBACK_BUG: Double = js.native
      
      /** Specifies the active default cipher list used by the current Node.js process  (colon-separated values). */
      @JSImport("file-system-cache/lib/common", "crypto.constants.defaultCipherList")
      @js.native
      val defaultCipherList: String = js.native
      
      /** Specifies the built-in default cipher list used by Node.js (colon-separated values). */
      @JSImport("file-system-cache/lib/common", "crypto.constants.defaultCoreCipherList")
      @js.native
      val defaultCoreCipherList: String = js.native
    }
    
    /** @deprecated since v10.0.0 use `createCipheriv()` */
    inline def createCipher(algorithm: String, password: BinaryLike): typings.node.cryptoMod.Cipher = (^.asInstanceOf[js.Dynamic].applyDynamic("createCipher")(algorithm.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.Cipher]
    inline def createCipher(algorithm: String, password: BinaryLike, options: TransformOptions): typings.node.cryptoMod.Cipher = (^.asInstanceOf[js.Dynamic].applyDynamic("createCipher")(algorithm.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.Cipher]
    /**
      * Creates and returns a `Cipher` object that uses the given `algorithm` and`password`.
      *
      * The `options` argument controls stream behavior and is optional except when a
      * cipher in CCM or OCB mode (e.g. `'aes-128-ccm'`) is used. In that case, the`authTagLength` option is required and specifies the length of the
      * authentication tag in bytes, see `CCM mode`. In GCM mode, the `authTagLength`option is not required but can be used to set the length of the authentication
      * tag that will be returned by `getAuthTag()` and defaults to 16 bytes.
      * For `chacha20-poly1305`, the `authTagLength` option defaults to 16 bytes.
      *
      * The `algorithm` is dependent on OpenSSL, examples are `'aes192'`, etc. On
      * recent OpenSSL releases, `openssl list -cipher-algorithms` will
      * display the available cipher algorithms.
      *
      * The `password` is used to derive the cipher key and initialization vector (IV).
      * The value must be either a `'latin1'` encoded string, a `Buffer`, a`TypedArray`, or a `DataView`.
      *
      * **This function is semantically insecure for all**
      * **supported ciphers and fatally flawed for ciphers in counter mode (such as CTR,**
      * **GCM, or CCM).**
      *
      * The implementation of `crypto.createCipher()` derives keys using the OpenSSL
      * function [`EVP_BytesToKey`](https://www.openssl.org/docs/man1.1.0/crypto/EVP_BytesToKey.html) with the digest algorithm set to MD5, one
      * iteration, and no salt. The lack of salt allows dictionary attacks as the same
      * password always creates the same key. The low iteration count and
      * non-cryptographically secure hash algorithm allow passwords to be tested very
      * rapidly.
      *
      * In line with OpenSSL's recommendation to use a more modern algorithm instead of [`EVP_BytesToKey`](https://www.openssl.org/docs/man1.1.0/crypto/EVP_BytesToKey.html) it is recommended that
      * developers derive a key and IV on
      * their own using {@link scrypt} and to use {@link createCipheriv} to create the `Cipher` object. Users should not use ciphers with counter mode
      * (e.g. CTR, GCM, or CCM) in `crypto.createCipher()`. A warning is emitted when
      * they are used in order to avoid the risk of IV reuse that causes
      * vulnerabilities. For the case when IV is reused in GCM, see [Nonce-Disrespecting Adversaries](https://github.com/nonce-disrespect/nonce-disrespect) for details.
      * @since v0.1.94
      * @deprecated Since v10.0.0 - Use {@link createCipheriv} instead.
      * @param options `stream.transform` options
      */
    inline def createCipher(algorithm: CipherCCMTypes, password: BinaryLike, options: CipherCCMOptions): CipherCCM = (^.asInstanceOf[js.Dynamic].applyDynamic("createCipher")(algorithm.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CipherCCM]
    /** @deprecated since v10.0.0 use `createCipheriv()` */
    inline def createCipher(algorithm: CipherGCMTypes, password: BinaryLike): CipherGCM = (^.asInstanceOf[js.Dynamic].applyDynamic("createCipher")(algorithm.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[CipherGCM]
    inline def createCipher(algorithm: CipherGCMTypes, password: BinaryLike, options: CipherGCMOptions): CipherGCM = (^.asInstanceOf[js.Dynamic].applyDynamic("createCipher")(algorithm.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CipherGCM]
    
    inline def createCipheriv(algorithm: String, key: CipherKey): typings.node.cryptoMod.Cipher = (^.asInstanceOf[js.Dynamic].applyDynamic("createCipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.Cipher]
    inline def createCipheriv(algorithm: String, key: CipherKey, iv: Null, options: TransformOptions): typings.node.cryptoMod.Cipher = (^.asInstanceOf[js.Dynamic].applyDynamic("createCipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.Cipher]
    inline def createCipheriv(algorithm: String, key: CipherKey, iv: BinaryLike): typings.node.cryptoMod.Cipher = (^.asInstanceOf[js.Dynamic].applyDynamic("createCipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.Cipher]
    inline def createCipheriv(algorithm: String, key: CipherKey, iv: BinaryLike, options: TransformOptions): typings.node.cryptoMod.Cipher = (^.asInstanceOf[js.Dynamic].applyDynamic("createCipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.Cipher]
    /**
      * Creates and returns a `Cipher` object, with the given `algorithm`, `key` and
      * initialization vector (`iv`).
      *
      * The `options` argument controls stream behavior and is optional except when a
      * cipher in CCM or OCB mode (e.g. `'aes-128-ccm'`) is used. In that case, the`authTagLength` option is required and specifies the length of the
      * authentication tag in bytes, see `CCM mode`. In GCM mode, the `authTagLength`option is not required but can be used to set the length of the authentication
      * tag that will be returned by `getAuthTag()` and defaults to 16 bytes.
      * For `chacha20-poly1305`, the `authTagLength` option defaults to 16 bytes.
      *
      * The `algorithm` is dependent on OpenSSL, examples are `'aes192'`, etc. On
      * recent OpenSSL releases, `openssl list -cipher-algorithms` will
      * display the available cipher algorithms.
      *
      * The `key` is the raw key used by the `algorithm` and `iv` is an [initialization vector](https://en.wikipedia.org/wiki/Initialization_vector). Both arguments must be `'utf8'` encoded
      * strings,`Buffers`, `TypedArray`, or `DataView`s. The `key` may optionally be
      * a `KeyObject` of type `secret`. If the cipher does not need
      * an initialization vector, `iv` may be `null`.
      *
      * When passing strings for `key` or `iv`, please consider `caveats when using strings as inputs to cryptographic APIs`.
      *
      * Initialization vectors should be unpredictable and unique; ideally, they will be
      * cryptographically random. They do not have to be secret: IVs are typically just
      * added to ciphertext messages unencrypted. It may sound contradictory that
      * something has to be unpredictable and unique, but does not have to be secret;
      * remember that an attacker must not be able to predict ahead of time what a
      * given IV will be.
      * @since v0.1.94
      * @param options `stream.transform` options
      */
    inline def createCipheriv(algorithm: CipherCCMTypes, key: CipherKey, iv: BinaryLike, options: CipherCCMOptions): CipherCCM = (^.asInstanceOf[js.Dynamic].applyDynamic("createCipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CipherCCM]
    inline def createCipheriv(algorithm: CipherGCMTypes, key: CipherKey, iv: BinaryLike): CipherGCM = (^.asInstanceOf[js.Dynamic].applyDynamic("createCipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any])).asInstanceOf[CipherGCM]
    inline def createCipheriv(algorithm: CipherGCMTypes, key: CipherKey, iv: BinaryLike, options: CipherGCMOptions): CipherGCM = (^.asInstanceOf[js.Dynamic].applyDynamic("createCipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CipherGCM]
    inline def createCipheriv(algorithm: CipherOCBTypes, key: CipherKey, iv: BinaryLike, options: CipherOCBOptions): CipherOCB = (^.asInstanceOf[js.Dynamic].applyDynamic("createCipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CipherOCB]
    
    /** @deprecated since v10.0.0 use `createDecipheriv()` */
    inline def createDecipher(algorithm: String, password: BinaryLike): typings.node.cryptoMod.Decipher = (^.asInstanceOf[js.Dynamic].applyDynamic("createDecipher")(algorithm.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.Decipher]
    inline def createDecipher(algorithm: String, password: BinaryLike, options: TransformOptions): typings.node.cryptoMod.Decipher = (^.asInstanceOf[js.Dynamic].applyDynamic("createDecipher")(algorithm.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.Decipher]
    /**
      * Creates and returns a `Decipher` object that uses the given `algorithm` and`password` (key).
      *
      * The `options` argument controls stream behavior and is optional except when a
      * cipher in CCM or OCB mode (e.g. `'aes-128-ccm'`) is used. In that case, the`authTagLength` option is required and specifies the length of the
      * authentication tag in bytes, see `CCM mode`.
      * For `chacha20-poly1305`, the `authTagLength` option defaults to 16 bytes.
      *
      * **This function is semantically insecure for all**
      * **supported ciphers and fatally flawed for ciphers in counter mode (such as CTR,**
      * **GCM, or CCM).**
      *
      * The implementation of `crypto.createDecipher()` derives keys using the OpenSSL
      * function [`EVP_BytesToKey`](https://www.openssl.org/docs/man1.1.0/crypto/EVP_BytesToKey.html) with the digest algorithm set to MD5, one
      * iteration, and no salt. The lack of salt allows dictionary attacks as the same
      * password always creates the same key. The low iteration count and
      * non-cryptographically secure hash algorithm allow passwords to be tested very
      * rapidly.
      *
      * In line with OpenSSL's recommendation to use a more modern algorithm instead of [`EVP_BytesToKey`](https://www.openssl.org/docs/man1.1.0/crypto/EVP_BytesToKey.html) it is recommended that
      * developers derive a key and IV on
      * their own using {@link scrypt} and to use {@link createDecipheriv} to create the `Decipher` object.
      * @since v0.1.94
      * @deprecated Since v10.0.0 - Use {@link createDecipheriv} instead.
      * @param options `stream.transform` options
      */
    inline def createDecipher(algorithm: CipherCCMTypes, password: BinaryLike, options: CipherCCMOptions): DecipherCCM = (^.asInstanceOf[js.Dynamic].applyDynamic("createDecipher")(algorithm.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DecipherCCM]
    /** @deprecated since v10.0.0 use `createDecipheriv()` */
    inline def createDecipher(algorithm: CipherGCMTypes, password: BinaryLike): DecipherGCM = (^.asInstanceOf[js.Dynamic].applyDynamic("createDecipher")(algorithm.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[DecipherGCM]
    inline def createDecipher(algorithm: CipherGCMTypes, password: BinaryLike, options: CipherGCMOptions): DecipherGCM = (^.asInstanceOf[js.Dynamic].applyDynamic("createDecipher")(algorithm.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DecipherGCM]
    
    inline def createDecipheriv(algorithm: String, key: CipherKey): typings.node.cryptoMod.Decipher = (^.asInstanceOf[js.Dynamic].applyDynamic("createDecipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.Decipher]
    inline def createDecipheriv(algorithm: String, key: CipherKey, iv: Null, options: TransformOptions): typings.node.cryptoMod.Decipher = (^.asInstanceOf[js.Dynamic].applyDynamic("createDecipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.Decipher]
    inline def createDecipheriv(algorithm: String, key: CipherKey, iv: BinaryLike): typings.node.cryptoMod.Decipher = (^.asInstanceOf[js.Dynamic].applyDynamic("createDecipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.Decipher]
    inline def createDecipheriv(algorithm: String, key: CipherKey, iv: BinaryLike, options: TransformOptions): typings.node.cryptoMod.Decipher = (^.asInstanceOf[js.Dynamic].applyDynamic("createDecipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.Decipher]
    /**
      * Creates and returns a `Decipher` object that uses the given `algorithm`, `key`and initialization vector (`iv`).
      *
      * The `options` argument controls stream behavior and is optional except when a
      * cipher in CCM or OCB mode (e.g. `'aes-128-ccm'`) is used. In that case, the`authTagLength` option is required and specifies the length of the
      * authentication tag in bytes, see `CCM mode`. In GCM mode, the `authTagLength`option is not required but can be used to restrict accepted authentication tags
      * to those with the specified length.
      * For `chacha20-poly1305`, the `authTagLength` option defaults to 16 bytes.
      *
      * The `algorithm` is dependent on OpenSSL, examples are `'aes192'`, etc. On
      * recent OpenSSL releases, `openssl list -cipher-algorithms` will
      * display the available cipher algorithms.
      *
      * The `key` is the raw key used by the `algorithm` and `iv` is an [initialization vector](https://en.wikipedia.org/wiki/Initialization_vector). Both arguments must be `'utf8'` encoded
      * strings,`Buffers`, `TypedArray`, or `DataView`s. The `key` may optionally be
      * a `KeyObject` of type `secret`. If the cipher does not need
      * an initialization vector, `iv` may be `null`.
      *
      * When passing strings for `key` or `iv`, please consider `caveats when using strings as inputs to cryptographic APIs`.
      *
      * Initialization vectors should be unpredictable and unique; ideally, they will be
      * cryptographically random. They do not have to be secret: IVs are typically just
      * added to ciphertext messages unencrypted. It may sound contradictory that
      * something has to be unpredictable and unique, but does not have to be secret;
      * remember that an attacker must not be able to predict ahead of time what a given
      * IV will be.
      * @since v0.1.94
      * @param options `stream.transform` options
      */
    inline def createDecipheriv(algorithm: CipherCCMTypes, key: CipherKey, iv: BinaryLike, options: CipherCCMOptions): DecipherCCM = (^.asInstanceOf[js.Dynamic].applyDynamic("createDecipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DecipherCCM]
    inline def createDecipheriv(algorithm: CipherGCMTypes, key: CipherKey, iv: BinaryLike): DecipherGCM = (^.asInstanceOf[js.Dynamic].applyDynamic("createDecipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any])).asInstanceOf[DecipherGCM]
    inline def createDecipheriv(algorithm: CipherGCMTypes, key: CipherKey, iv: BinaryLike, options: CipherGCMOptions): DecipherGCM = (^.asInstanceOf[js.Dynamic].applyDynamic("createDecipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DecipherGCM]
    inline def createDecipheriv(algorithm: CipherOCBTypes, key: CipherKey, iv: BinaryLike, options: CipherOCBOptions): DecipherOCB = (^.asInstanceOf[js.Dynamic].applyDynamic("createDecipheriv")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DecipherOCB]
    
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
    inline def createDiffieHellman(primeLength: Double): typings.node.cryptoMod.DiffieHellman_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(primeLength.asInstanceOf[js.Any]).asInstanceOf[typings.node.cryptoMod.DiffieHellman_]
    inline def createDiffieHellman(primeLength: Double, generator: Double): typings.node.cryptoMod.DiffieHellman_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(primeLength.asInstanceOf[js.Any], generator.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.DiffieHellman_]
    inline def createDiffieHellman(prime: String, primeEncoding: BinaryToTextEncoding): typings.node.cryptoMod.DiffieHellman_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime.asInstanceOf[js.Any], primeEncoding.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.DiffieHellman_]
    inline def createDiffieHellman(
      prime: String,
      primeEncoding: BinaryToTextEncoding,
      generator: String,
      generatorEncoding: BinaryToTextEncoding
    ): typings.node.cryptoMod.DiffieHellman_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime.asInstanceOf[js.Any], primeEncoding.asInstanceOf[js.Any], generator.asInstanceOf[js.Any], generatorEncoding.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.DiffieHellman_]
    inline def createDiffieHellman(prime: String, primeEncoding: BinaryToTextEncoding, generator: js.typedarray.ArrayBuffer): typings.node.cryptoMod.DiffieHellman_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime.asInstanceOf[js.Any], primeEncoding.asInstanceOf[js.Any], generator.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.DiffieHellman_]
    inline def createDiffieHellman(prime: String, primeEncoding: BinaryToTextEncoding, generator: Double): typings.node.cryptoMod.DiffieHellman_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime.asInstanceOf[js.Any], primeEncoding.asInstanceOf[js.Any], generator.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.DiffieHellman_]
    inline def createDiffieHellman(prime: String, primeEncoding: BinaryToTextEncoding, generator: ArrayBufferView): typings.node.cryptoMod.DiffieHellman_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime.asInstanceOf[js.Any], primeEncoding.asInstanceOf[js.Any], generator.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.DiffieHellman_]
    inline def createDiffieHellman(prime: js.typedarray.ArrayBuffer): typings.node.cryptoMod.DiffieHellman_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime.asInstanceOf[js.Any]).asInstanceOf[typings.node.cryptoMod.DiffieHellman_]
    inline def createDiffieHellman(prime: js.typedarray.ArrayBuffer, generator: String, generatorEncoding: BinaryToTextEncoding): typings.node.cryptoMod.DiffieHellman_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime.asInstanceOf[js.Any], generator.asInstanceOf[js.Any], generatorEncoding.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.DiffieHellman_]
    inline def createDiffieHellman(prime: js.typedarray.ArrayBuffer, generator: js.typedarray.ArrayBuffer): typings.node.cryptoMod.DiffieHellman_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime.asInstanceOf[js.Any], generator.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.DiffieHellman_]
    inline def createDiffieHellman(prime: js.typedarray.ArrayBuffer, generator: Double): typings.node.cryptoMod.DiffieHellman_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime.asInstanceOf[js.Any], generator.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.DiffieHellman_]
    inline def createDiffieHellman(prime: js.typedarray.ArrayBuffer, generator: ArrayBufferView): typings.node.cryptoMod.DiffieHellman_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime.asInstanceOf[js.Any], generator.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.DiffieHellman_]
    inline def createDiffieHellman(prime: ArrayBufferView): typings.node.cryptoMod.DiffieHellman_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime.asInstanceOf[js.Any]).asInstanceOf[typings.node.cryptoMod.DiffieHellman_]
    inline def createDiffieHellman(prime: ArrayBufferView, generator: String, generatorEncoding: BinaryToTextEncoding): typings.node.cryptoMod.DiffieHellman_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime.asInstanceOf[js.Any], generator.asInstanceOf[js.Any], generatorEncoding.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.DiffieHellman_]
    inline def createDiffieHellman(prime: ArrayBufferView, generator: js.typedarray.ArrayBuffer): typings.node.cryptoMod.DiffieHellman_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime.asInstanceOf[js.Any], generator.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.DiffieHellman_]
    inline def createDiffieHellman(prime: ArrayBufferView, generator: Double): typings.node.cryptoMod.DiffieHellman_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime.asInstanceOf[js.Any], generator.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.DiffieHellman_]
    inline def createDiffieHellman(prime: ArrayBufferView, generator: ArrayBufferView): typings.node.cryptoMod.DiffieHellman_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellman")(prime.asInstanceOf[js.Any], generator.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.DiffieHellman_]
    
    /**
      * An alias for {@link getDiffieHellman}
      * @since v0.9.3
      */
    inline def createDiffieHellmanGroup(name: String): typings.node.cryptoMod.DiffieHellmanGroup = ^.asInstanceOf[js.Dynamic].applyDynamic("createDiffieHellmanGroup")(name.asInstanceOf[js.Any]).asInstanceOf[typings.node.cryptoMod.DiffieHellmanGroup]
    
    /**
      * Creates an Elliptic Curve Diffie-Hellman (`ECDH`) key exchange object using a
      * predefined curve specified by the `curveName` string. Use {@link getCurves} to obtain a list of available curve names. On recent
      * OpenSSL releases, `openssl ecparam -list_curves` will also display the name
      * and description of each available elliptic curve.
      * @since v0.11.14
      */
    inline def createECDH(curveName: String): typings.node.cryptoMod.ECDH = ^.asInstanceOf[js.Dynamic].applyDynamic("createECDH")(curveName.asInstanceOf[js.Any]).asInstanceOf[typings.node.cryptoMod.ECDH]
    
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
    inline def createHash(algorithm: String): typings.node.cryptoMod.Hash = ^.asInstanceOf[js.Dynamic].applyDynamic("createHash")(algorithm.asInstanceOf[js.Any]).asInstanceOf[typings.node.cryptoMod.Hash]
    inline def createHash(algorithm: String, options: HashOptions): typings.node.cryptoMod.Hash = (^.asInstanceOf[js.Dynamic].applyDynamic("createHash")(algorithm.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.Hash]
    
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
    inline def createHmac(algorithm: String, key: BinaryLike): typings.node.cryptoMod.Hmac = (^.asInstanceOf[js.Dynamic].applyDynamic("createHmac")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.Hmac]
    inline def createHmac(algorithm: String, key: BinaryLike, options: TransformOptions): typings.node.cryptoMod.Hmac = (^.asInstanceOf[js.Dynamic].applyDynamic("createHmac")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.Hmac]
    inline def createHmac(algorithm: String, key: typings.node.cryptoMod.KeyObject): typings.node.cryptoMod.Hmac = (^.asInstanceOf[js.Dynamic].applyDynamic("createHmac")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.Hmac]
    inline def createHmac(algorithm: String, key: typings.node.cryptoMod.KeyObject, options: TransformOptions): typings.node.cryptoMod.Hmac = (^.asInstanceOf[js.Dynamic].applyDynamic("createHmac")(algorithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.Hmac]
    
    inline def createPrivateKey(key: String): typings.node.cryptoMod.KeyObject = ^.asInstanceOf[js.Dynamic].applyDynamic("createPrivateKey")(key.asInstanceOf[js.Any]).asInstanceOf[typings.node.cryptoMod.KeyObject]
    inline def createPrivateKey(key: Buffer): typings.node.cryptoMod.KeyObject = ^.asInstanceOf[js.Dynamic].applyDynamic("createPrivateKey")(key.asInstanceOf[js.Any]).asInstanceOf[typings.node.cryptoMod.KeyObject]
    inline def createPrivateKey(key: JsonWebKeyInput): typings.node.cryptoMod.KeyObject = ^.asInstanceOf[js.Dynamic].applyDynamic("createPrivateKey")(key.asInstanceOf[js.Any]).asInstanceOf[typings.node.cryptoMod.KeyObject]
    /**
      * Creates and returns a new key object containing a private key. If `key` is a
      * string or `Buffer`, `format` is assumed to be `'pem'`; otherwise, `key`must be an object with the properties described above.
      *
      * If the private key is encrypted, a `passphrase` must be specified. The length
      * of the passphrase is limited to 1024 bytes.
      * @since v11.6.0
      */
    inline def createPrivateKey(key: PrivateKeyInput): typings.node.cryptoMod.KeyObject = ^.asInstanceOf[js.Dynamic].applyDynamic("createPrivateKey")(key.asInstanceOf[js.Any]).asInstanceOf[typings.node.cryptoMod.KeyObject]
    
    inline def createPublicKey(key: String): typings.node.cryptoMod.KeyObject = ^.asInstanceOf[js.Dynamic].applyDynamic("createPublicKey")(key.asInstanceOf[js.Any]).asInstanceOf[typings.node.cryptoMod.KeyObject]
    inline def createPublicKey(key: Buffer): typings.node.cryptoMod.KeyObject = ^.asInstanceOf[js.Dynamic].applyDynamic("createPublicKey")(key.asInstanceOf[js.Any]).asInstanceOf[typings.node.cryptoMod.KeyObject]
    inline def createPublicKey(key: JsonWebKeyInput): typings.node.cryptoMod.KeyObject = ^.asInstanceOf[js.Dynamic].applyDynamic("createPublicKey")(key.asInstanceOf[js.Any]).asInstanceOf[typings.node.cryptoMod.KeyObject]
    inline def createPublicKey(key: typings.node.cryptoMod.KeyObject): typings.node.cryptoMod.KeyObject = ^.asInstanceOf[js.Dynamic].applyDynamic("createPublicKey")(key.asInstanceOf[js.Any]).asInstanceOf[typings.node.cryptoMod.KeyObject]
    /**
      * Creates and returns a new key object containing a public key. If `key` is a
      * string or `Buffer`, `format` is assumed to be `'pem'`; if `key` is a `KeyObject`with type `'private'`, the public key is derived from the given private key;
      * otherwise, `key` must be an object with the properties described above.
      *
      * If the format is `'pem'`, the `'key'` may also be an X.509 certificate.
      *
      * Because public keys can be derived from private keys, a private key may be
      * passed instead of a public key. In that case, this function behaves as if {@link createPrivateKey} had been called, except that the type of the
      * returned `KeyObject` will be `'public'` and that the private key cannot be
      * extracted from the returned `KeyObject`. Similarly, if a `KeyObject` with type`'private'` is given, a new `KeyObject` with type `'public'` will be returned
      * and it will be impossible to extract the private key from the returned object.
      * @since v11.6.0
      */
    inline def createPublicKey(key: PublicKeyInput): typings.node.cryptoMod.KeyObject = ^.asInstanceOf[js.Dynamic].applyDynamic("createPublicKey")(key.asInstanceOf[js.Any]).asInstanceOf[typings.node.cryptoMod.KeyObject]
    
    inline def createSecretKey(key: String, encoding: BufferEncoding): typings.node.cryptoMod.KeyObject = (^.asInstanceOf[js.Dynamic].applyDynamic("createSecretKey")(key.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.KeyObject]
    /**
      * Creates and returns a new key object containing a secret key for symmetric
      * encryption or `Hmac`.
      * @since v11.6.0
      * @param encoding The string encoding when `key` is a string.
      */
    inline def createSecretKey(key: ArrayBufferView): typings.node.cryptoMod.KeyObject = ^.asInstanceOf[js.Dynamic].applyDynamic("createSecretKey")(key.asInstanceOf[js.Any]).asInstanceOf[typings.node.cryptoMod.KeyObject]
    
    /**
      * Creates and returns a `Sign` object that uses the given `algorithm`. Use {@link getHashes} to obtain the names of the available digest algorithms.
      * Optional `options` argument controls the `stream.Writable` behavior.
      *
      * In some cases, a `Sign` instance can be created using the name of a signature
      * algorithm, such as `'RSA-SHA256'`, instead of a digest algorithm. This will use
      * the corresponding digest algorithm. This does not work for all signature
      * algorithms, such as `'ecdsa-with-SHA256'`, so it is best to always use digest
      * algorithm names.
      * @since v0.1.92
      * @param options `stream.Writable` options
      */
    inline def createSign(algorithm: String): typings.node.cryptoMod.Sign_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createSign")(algorithm.asInstanceOf[js.Any]).asInstanceOf[typings.node.cryptoMod.Sign_]
    inline def createSign(algorithm: String, options: WritableOptions): typings.node.cryptoMod.Sign_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createSign")(algorithm.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.Sign_]
    
    /**
      * Creates and returns a `Verify` object that uses the given algorithm.
      * Use {@link getHashes} to obtain an array of names of the available
      * signing algorithms. Optional `options` argument controls the`stream.Writable` behavior.
      *
      * In some cases, a `Verify` instance can be created using the name of a signature
      * algorithm, such as `'RSA-SHA256'`, instead of a digest algorithm. This will use
      * the corresponding digest algorithm. This does not work for all signature
      * algorithms, such as `'ecdsa-with-SHA256'`, so it is best to always use digest
      * algorithm names.
      * @since v0.1.92
      * @param options `stream.Writable` options
      */
    inline def createVerify(algorithm: String): typings.node.cryptoMod.Verify_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createVerify")(algorithm.asInstanceOf[js.Any]).asInstanceOf[typings.node.cryptoMod.Verify_]
    inline def createVerify(algorithm: String, options: WritableOptions): typings.node.cryptoMod.Verify_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createVerify")(algorithm.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.Verify_]
    
    /**
      * Computes the Diffie-Hellman secret based on a `privateKey` and a `publicKey`.
      * Both keys must have the same `asymmetricKeyType`, which must be one of `'dh'`(for Diffie-Hellman), `'ec'` (for ECDH), `'x448'`, or `'x25519'` (for ECDH-ES).
      * @since v13.9.0, v12.17.0
      */
    inline def diffieHellman(options: PrivateKey): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("diffieHellman")(options.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    
    /** @deprecated since v10.0.0 */
    @JSImport("file-system-cache/lib/common", "crypto.fips")
    @js.native
    val fips: Boolean = js.native
    
    /**
      * Asynchronously generates a new random secret key of the given `length`. The`type` will determine which validations will be performed on the `length`.
      *
      * ```js
      * const {
      *   generateKey,
      * } = await import('node:crypto');
      *
      * generateKey('hmac', { length: 64 }, (err, key) => {
      *   if (err) throw err;
      *   console.log(key.export().toString('hex'));  // 46e..........620
      * });
      * ```
      * @since v15.0.0
      * @param type The intended use of the generated secret key. Currently accepted values are `'hmac'` and `'aes'`.
      */
    inline def generateKey(
      `type`: hmac | aes,
      options: Length,
      callback: js.Function2[/* err */ js.Error | Null, /* key */ typings.node.cryptoMod.KeyObject, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKey")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def generateKeyPair(
      `type`: `rsa-pss`,
      options: RSAPSSKeyPairKeyObjectOptions,
      callback: js.Function3[
          /* err */ js.Error | Null, 
          /* publicKey */ typings.node.cryptoMod.KeyObject, 
          /* privateKey */ typings.node.cryptoMod.KeyObject, 
          Unit
        ]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def generateKeyPair(
      `type`: `rsa-pss`,
      options: RSAPSSKeyPairOptions[der | pem, der | pem],
      callback: js.Function3[
          js.Error | Null, 
          (/* publicKey */ Buffer) | (/* publicKey */ String), 
          (/* privateKey */ Buffer) | (/* privateKey */ String), 
          Unit
        ]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def generateKeyPair(
      `type`: dsa,
      options: DSAKeyPairKeyObjectOptions,
      callback: js.Function3[
          /* err */ js.Error | Null, 
          /* publicKey */ typings.node.cryptoMod.KeyObject, 
          /* privateKey */ typings.node.cryptoMod.KeyObject, 
          Unit
        ]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def generateKeyPair(
      `type`: dsa,
      options: DSAKeyPairOptions[der | pem, der | pem],
      callback: js.Function3[
          js.Error | Null, 
          (/* publicKey */ Buffer) | (/* publicKey */ String), 
          (/* privateKey */ Buffer) | (/* privateKey */ String), 
          Unit
        ]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def generateKeyPair(
      `type`: ec,
      options: ECKeyPairKeyObjectOptions,
      callback: js.Function3[
          /* err */ js.Error | Null, 
          /* publicKey */ typings.node.cryptoMod.KeyObject, 
          /* privateKey */ typings.node.cryptoMod.KeyObject, 
          Unit
        ]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def generateKeyPair(
      `type`: ec,
      options: ECKeyPairOptions[der | pem, der | pem],
      callback: js.Function3[
          js.Error | Null, 
          (/* publicKey */ Buffer) | (/* publicKey */ String), 
          (/* privateKey */ Buffer) | (/* privateKey */ String), 
          Unit
        ]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def generateKeyPair(
      `type`: ed25519,
      options: Unit,
      callback: js.Function3[
          /* err */ js.Error | Null, 
          /* publicKey */ typings.node.cryptoMod.KeyObject, 
          /* privateKey */ typings.node.cryptoMod.KeyObject, 
          Unit
        ]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def generateKeyPair(
      `type`: ed25519,
      options: ED25519KeyPairKeyObjectOptions,
      callback: js.Function3[
          /* err */ js.Error | Null, 
          /* publicKey */ typings.node.cryptoMod.KeyObject, 
          /* privateKey */ typings.node.cryptoMod.KeyObject, 
          Unit
        ]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def generateKeyPair(
      `type`: ed25519,
      options: ED25519KeyPairOptions[der | pem, der | pem],
      callback: js.Function3[
          js.Error | Null, 
          (/* publicKey */ Buffer) | (/* publicKey */ String), 
          (/* privateKey */ Buffer) | (/* privateKey */ String), 
          Unit
        ]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def generateKeyPair(
      `type`: ed448,
      options: Unit,
      callback: js.Function3[
          /* err */ js.Error | Null, 
          /* publicKey */ typings.node.cryptoMod.KeyObject, 
          /* privateKey */ typings.node.cryptoMod.KeyObject, 
          Unit
        ]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def generateKeyPair(
      `type`: ed448,
      options: ED448KeyPairKeyObjectOptions,
      callback: js.Function3[
          /* err */ js.Error | Null, 
          /* publicKey */ typings.node.cryptoMod.KeyObject, 
          /* privateKey */ typings.node.cryptoMod.KeyObject, 
          Unit
        ]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def generateKeyPair(
      `type`: ed448,
      options: ED448KeyPairOptions[der | pem, der | pem],
      callback: js.Function3[
          js.Error | Null, 
          (/* publicKey */ Buffer) | (/* publicKey */ String), 
          (/* privateKey */ Buffer) | (/* privateKey */ String), 
          Unit
        ]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def generateKeyPair(
      `type`: rsa,
      options: RSAKeyPairKeyObjectOptions,
      callback: js.Function3[
          /* err */ js.Error | Null, 
          /* publicKey */ typings.node.cryptoMod.KeyObject, 
          /* privateKey */ typings.node.cryptoMod.KeyObject, 
          Unit
        ]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    /**
      * Generates a new asymmetric key pair of the given `type`. RSA, RSA-PSS, DSA, EC,
      * Ed25519, Ed448, X25519, X448, and DH are currently supported.
      *
      * If a `publicKeyEncoding` or `privateKeyEncoding` was specified, this function
      * behaves as if `keyObject.export()` had been called on its result. Otherwise,
      * the respective part of the key is returned as a `KeyObject`.
      *
      * It is recommended to encode public keys as `'spki'` and private keys as`'pkcs8'` with encryption for long-term storage:
      *
      * ```js
      * const {
      *   generateKeyPair,
      * } = await import('node:crypto');
      *
      * generateKeyPair('rsa', {
      *   modulusLength: 4096,
      *   publicKeyEncoding: {
      *     type: 'spki',
      *     format: 'pem',
      *   },
      *   privateKeyEncoding: {
      *     type: 'pkcs8',
      *     format: 'pem',
      *     cipher: 'aes-256-cbc',
      *     passphrase: 'top secret',
      *   },
      * }, (err, publicKey, privateKey) => {
      *   // Handle errors and use the generated key pair.
      * });
      * ```
      *
      * On completion, `callback` will be called with `err` set to `undefined` and`publicKey` / `privateKey` representing the generated key pair.
      *
      * If this method is invoked as its `util.promisify()` ed version, it returns
      * a `Promise` for an `Object` with `publicKey` and `privateKey` properties.
      * @since v10.12.0
      * @param type Must be `'rsa'`, `'rsa-pss'`, `'dsa'`, `'ec'`, `'ed25519'`, `'ed448'`, `'x25519'`, `'x448'`, or `'dh'`.
      */
    inline def generateKeyPair(
      `type`: rsa,
      options: RSAKeyPairOptions[der | pem, der | pem],
      callback: js.Function3[
          js.Error | Null, 
          (/* publicKey */ Buffer) | (/* publicKey */ String), 
          (/* privateKey */ Buffer) | (/* privateKey */ String), 
          Unit
        ]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def generateKeyPair(
      `type`: x25519,
      options: Unit,
      callback: js.Function3[
          /* err */ js.Error | Null, 
          /* publicKey */ typings.node.cryptoMod.KeyObject, 
          /* privateKey */ typings.node.cryptoMod.KeyObject, 
          Unit
        ]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def generateKeyPair(
      `type`: x25519,
      options: X25519KeyPairKeyObjectOptions,
      callback: js.Function3[
          /* err */ js.Error | Null, 
          /* publicKey */ typings.node.cryptoMod.KeyObject, 
          /* privateKey */ typings.node.cryptoMod.KeyObject, 
          Unit
        ]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def generateKeyPair(
      `type`: x25519,
      options: X25519KeyPairOptions[der | pem, der | pem],
      callback: js.Function3[
          js.Error | Null, 
          (/* publicKey */ Buffer) | (/* publicKey */ String), 
          (/* privateKey */ Buffer) | (/* privateKey */ String), 
          Unit
        ]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def generateKeyPair(
      `type`: x448,
      options: Unit,
      callback: js.Function3[
          /* err */ js.Error | Null, 
          /* publicKey */ typings.node.cryptoMod.KeyObject, 
          /* privateKey */ typings.node.cryptoMod.KeyObject, 
          Unit
        ]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def generateKeyPair(
      `type`: x448,
      options: X448KeyPairKeyObjectOptions,
      callback: js.Function3[
          /* err */ js.Error | Null, 
          /* publicKey */ typings.node.cryptoMod.KeyObject, 
          /* privateKey */ typings.node.cryptoMod.KeyObject, 
          Unit
        ]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def generateKeyPair(
      `type`: x448,
      options: X448KeyPairOptions[der | pem, der | pem],
      callback: js.Function3[
          js.Error | Null, 
          (/* publicKey */ Buffer) | (/* publicKey */ String), 
          (/* privateKey */ Buffer) | (/* privateKey */ String), 
          Unit
        ]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPair")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def generateKeyPairSync(`type`: `rsa-pss`, options: RSAPSSKeyPairOptions[der | pem, der | pem]): KeyPairSyncResult[String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[KeyPairSyncResult[String, String]]
    inline def generateKeyPairSync(`type`: dsa, options: DSAKeyPairOptions[der | pem, der | pem]): KeyPairSyncResult[String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[KeyPairSyncResult[String, String]]
    inline def generateKeyPairSync(`type`: ec, options: ECKeyPairOptions[der | pem, der | pem]): KeyPairSyncResult[String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[KeyPairSyncResult[String, String]]
    inline def generateKeyPairSync(`type`: ed25519, options: ED25519KeyPairOptions[der | pem, der | pem]): KeyPairSyncResult[String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[KeyPairSyncResult[String, String]]
    inline def generateKeyPairSync(`type`: ed448, options: ED448KeyPairOptions[der | pem, der | pem]): KeyPairSyncResult[String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[KeyPairSyncResult[String, String]]
    /**
      * Generates a new asymmetric key pair of the given `type`. RSA, RSA-PSS, DSA, EC,
      * Ed25519, Ed448, X25519, X448, and DH are currently supported.
      *
      * If a `publicKeyEncoding` or `privateKeyEncoding` was specified, this function
      * behaves as if `keyObject.export()` had been called on its result. Otherwise,
      * the respective part of the key is returned as a `KeyObject`.
      *
      * When encoding public keys, it is recommended to use `'spki'`. When encoding
      * private keys, it is recommended to use `'pkcs8'` with a strong passphrase,
      * and to keep the passphrase confidential.
      *
      * ```js
      * const {
      *   generateKeyPairSync,
      * } = await import('node:crypto');
      *
      * const {
      *   publicKey,
      *   privateKey,
      * } = generateKeyPairSync('rsa', {
      *   modulusLength: 4096,
      *   publicKeyEncoding: {
      *     type: 'spki',
      *     format: 'pem',
      *   },
      *   privateKeyEncoding: {
      *     type: 'pkcs8',
      *     format: 'pem',
      *     cipher: 'aes-256-cbc',
      *     passphrase: 'top secret',
      *   },
      * });
      * ```
      *
      * The return value `{ publicKey, privateKey }` represents the generated key pair.
      * When PEM encoding was selected, the respective key will be a string, otherwise
      * it will be a buffer containing the data encoded as DER.
      * @since v10.12.0
      * @param type Must be `'rsa'`, `'rsa-pss'`, `'dsa'`, `'ec'`, `'ed25519'`, `'ed448'`, `'x25519'`, `'x448'`, or `'dh'`.
      */
    inline def generateKeyPairSync(`type`: rsa, options: RSAKeyPairOptions[der | pem, der | pem]): KeyPairSyncResult[String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[KeyPairSyncResult[String, String]]
    inline def generateKeyPairSync(`type`: x25519, options: X25519KeyPairOptions[der | pem, der | pem]): KeyPairSyncResult[String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[KeyPairSyncResult[String, String]]
    inline def generateKeyPairSync(`type`: x448, options: X448KeyPairOptions[der | pem, der | pem]): KeyPairSyncResult[String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[KeyPairSyncResult[String, String]]
    
    inline def generateKeyPairSync_dsa(`type`: dsa, options: DSAKeyPairKeyObjectOptions): KeyPairKeyObjectResult = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[KeyPairKeyObjectResult]
    
    inline def generateKeyPairSync_ec(`type`: ec, options: ECKeyPairKeyObjectOptions): KeyPairKeyObjectResult = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[KeyPairKeyObjectResult]
    
    inline def generateKeyPairSync_ed25519(`type`: ed25519): KeyPairKeyObjectResult = ^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any]).asInstanceOf[KeyPairKeyObjectResult]
    inline def generateKeyPairSync_ed25519(`type`: ed25519, options: ED25519KeyPairKeyObjectOptions): KeyPairKeyObjectResult = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[KeyPairKeyObjectResult]
    
    inline def generateKeyPairSync_ed448(`type`: ed448): KeyPairKeyObjectResult = ^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any]).asInstanceOf[KeyPairKeyObjectResult]
    inline def generateKeyPairSync_ed448(`type`: ed448, options: ED448KeyPairKeyObjectOptions): KeyPairKeyObjectResult = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[KeyPairKeyObjectResult]
    
    inline def generateKeyPairSync_rsa(`type`: rsa, options: RSAKeyPairKeyObjectOptions): KeyPairKeyObjectResult = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[KeyPairKeyObjectResult]
    
    inline def generateKeyPairSync_rsapss(`type`: `rsa-pss`, options: RSAPSSKeyPairKeyObjectOptions): KeyPairKeyObjectResult = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[KeyPairKeyObjectResult]
    
    inline def generateKeyPairSync_x25519(`type`: x25519): KeyPairKeyObjectResult = ^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any]).asInstanceOf[KeyPairKeyObjectResult]
    inline def generateKeyPairSync_x25519(`type`: x25519, options: X25519KeyPairKeyObjectOptions): KeyPairKeyObjectResult = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[KeyPairKeyObjectResult]
    
    inline def generateKeyPairSync_x448(`type`: x448): KeyPairKeyObjectResult = ^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any]).asInstanceOf[KeyPairKeyObjectResult]
    inline def generateKeyPairSync_x448(`type`: x448, options: X448KeyPairKeyObjectOptions): KeyPairKeyObjectResult = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeyPairSync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[KeyPairKeyObjectResult]
    
    /**
      * Synchronously generates a new random secret key of the given `length`. The`type` will determine which validations will be performed on the `length`.
      *
      * ```js
      * const {
      *   generateKeySync,
      * } = await import('node:crypto');
      *
      * const key = generateKeySync('hmac', { length: 64 });
      * console.log(key.export().toString('hex'));  // e89..........41e
      * ```
      * @since v15.0.0
      * @param type The intended use of the generated secret key. Currently accepted values are `'hmac'` and `'aes'`.
      */
    inline def generateKeySync(`type`: hmac | aes, options: Length): typings.node.cryptoMod.KeyObject = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKeySync")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.cryptoMod.KeyObject]
    
    /**
      * Generates a pseudorandom prime of `size` bits.
      *
      * If `options.safe` is `true`, the prime will be a safe prime -- that is,`(prime - 1) / 2` will also be a prime.
      *
      * The `options.add` and `options.rem` parameters can be used to enforce additional
      * requirements, e.g., for Diffie-Hellman:
      *
      * * If `options.add` and `options.rem` are both set, the prime will satisfy the
      * condition that `prime % add = rem`.
      * * If only `options.add` is set and `options.safe` is not `true`, the prime will
      * satisfy the condition that `prime % add = 1`.
      * * If only `options.add` is set and `options.safe` is set to `true`, the prime
      * will instead satisfy the condition that `prime % add = 3`. This is necessary
      * because `prime % add = 1` for `options.add > 2` would contradict the condition
      * enforced by `options.safe`.
      * * `options.rem` is ignored if `options.add` is not given.
      *
      * Both `options.add` and `options.rem` must be encoded as big-endian sequences
      * if given as an `ArrayBuffer`, `SharedArrayBuffer`, `TypedArray`, `Buffer`, or`DataView`.
      *
      * By default, the prime is encoded as a big-endian sequence of octets
      * in an [ArrayBuffer](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/ArrayBuffer). If the `bigint` option is `true`, then a
      * [bigint](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/BigInt) is provided.
      * @since v15.8.0
      * @param size The size (in bits) of the prime to generate.
      */
    inline def generatePrime(
      size: Double,
      callback: js.Function2[/* err */ js.Error | Null, /* prime */ js.typedarray.ArrayBuffer, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generatePrime")(size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def generatePrime(
      size: Double,
      options: GeneratePrimeOptionsArrayBuffer,
      callback: js.Function2[/* err */ js.Error | Null, /* prime */ js.typedarray.ArrayBuffer, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generatePrime")(size.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def generatePrime(
      size: Double,
      options: GeneratePrimeOptionsBigInt,
      callback: js.Function2[/* err */ js.Error | Null, /* prime */ js.BigInt, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generatePrime")(size.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def generatePrime(
      size: Double,
      options: GeneratePrimeOptions,
      callback: js.Function2[/* err */ js.Error | Null, /* prime */ js.typedarray.ArrayBuffer | js.BigInt, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generatePrime")(size.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Generates a pseudorandom prime of `size` bits.
      *
      * If `options.safe` is `true`, the prime will be a safe prime -- that is,`(prime - 1) / 2` will also be a prime.
      *
      * The `options.add` and `options.rem` parameters can be used to enforce additional
      * requirements, e.g., for Diffie-Hellman:
      *
      * * If `options.add` and `options.rem` are both set, the prime will satisfy the
      * condition that `prime % add = rem`.
      * * If only `options.add` is set and `options.safe` is not `true`, the prime will
      * satisfy the condition that `prime % add = 1`.
      * * If only `options.add` is set and `options.safe` is set to `true`, the prime
      * will instead satisfy the condition that `prime % add = 3`. This is necessary
      * because `prime % add = 1` for `options.add > 2` would contradict the condition
      * enforced by `options.safe`.
      * * `options.rem` is ignored if `options.add` is not given.
      *
      * Both `options.add` and `options.rem` must be encoded as big-endian sequences
      * if given as an `ArrayBuffer`, `SharedArrayBuffer`, `TypedArray`, `Buffer`, or`DataView`.
      *
      * By default, the prime is encoded as a big-endian sequence of octets
      * in an [ArrayBuffer](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/ArrayBuffer). If the `bigint` option is `true`, then a
      * [bigint](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/BigInt) is provided.
      * @since v15.8.0
      * @param size The size (in bits) of the prime to generate.
      */
    inline def generatePrimeSync(size: Double): js.typedarray.ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("generatePrimeSync")(size.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.ArrayBuffer]
    inline def generatePrimeSync(size: Double, options: GeneratePrimeOptions): js.typedarray.ArrayBuffer | js.BigInt = (^.asInstanceOf[js.Dynamic].applyDynamic("generatePrimeSync")(size.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.ArrayBuffer | js.BigInt]
    inline def generatePrimeSync(size: Double, options: GeneratePrimeOptionsArrayBuffer): js.typedarray.ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("generatePrimeSync")(size.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.ArrayBuffer]
    inline def generatePrimeSync(size: Double, options: GeneratePrimeOptionsBigInt): js.BigInt = (^.asInstanceOf[js.Dynamic].applyDynamic("generatePrimeSync")(size.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.BigInt]
    
    /**
      * Returns information about a given cipher.
      *
      * Some ciphers accept variable length keys and initialization vectors. By default,
      * the `crypto.getCipherInfo()` method will return the default values for these
      * ciphers. To test if a given key length or iv length is acceptable for given
      * cipher, use the `keyLength` and `ivLength` options. If the given values are
      * unacceptable, `undefined` will be returned.
      * @since v15.0.0
      * @param nameOrNid The name or nid of the cipher to query.
      */
    inline def getCipherInfo(nameOrNid: String): js.UndefOr[CipherInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCipherInfo")(nameOrNid.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[CipherInfo]]
    inline def getCipherInfo(nameOrNid: String, options: CipherInfoOptions): js.UndefOr[CipherInfo] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCipherInfo")(nameOrNid.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[CipherInfo]]
    inline def getCipherInfo(nameOrNid: Double): js.UndefOr[CipherInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCipherInfo")(nameOrNid.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[CipherInfo]]
    inline def getCipherInfo(nameOrNid: Double, options: CipherInfoOptions): js.UndefOr[CipherInfo] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCipherInfo")(nameOrNid.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[CipherInfo]]
    
    /**
      * ```js
      * const {
      *   getCiphers,
      * } = await import('node:crypto');
      *
      * console.log(getCiphers()); // ['aes-128-cbc', 'aes-128-ccm', ...]
      * ```
      * @since v0.9.3
      * @return An array with the names of the supported cipher algorithms.
      */
    inline def getCiphers(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCiphers")().asInstanceOf[js.Array[String]]
    
    /**
      * ```js
      * const {
      *   getCurves,
      * } = await import('node:crypto');
      *
      * console.log(getCurves()); // ['Oakley-EC2N-3', 'Oakley-EC2N-4', ...]
      * ```
      * @since v2.3.0
      * @return An array with the names of the supported elliptic curves.
      */
    inline def getCurves(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurves")().asInstanceOf[js.Array[String]]
    
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
    inline def getDiffieHellman(groupName: String): typings.node.cryptoMod.DiffieHellmanGroup = ^.asInstanceOf[js.Dynamic].applyDynamic("getDiffieHellman")(groupName.asInstanceOf[js.Any]).asInstanceOf[typings.node.cryptoMod.DiffieHellmanGroup]
    
    /**
      * @since v10.0.0
      * @return `1` if and only if a FIPS compliant crypto provider is currently in use, `0` otherwise. A future semver-major release may change the return type of this API to a {boolean}.
      */
    inline def getFips(): `1` | `0` = ^.asInstanceOf[js.Dynamic].applyDynamic("getFips")().asInstanceOf[`1` | `0`]
    
    /**
      * ```js
      * const {
      *   getHashes,
      * } = await import('node:crypto');
      *
      * console.log(getHashes()); // ['DSA', 'DSA-SHA', 'DSA-SHA1', ...]
      * ```
      * @since v0.9.3
      * @return An array of the names of the supported hash algorithms, such as `'RSA-SHA256'`. Hash algorithms are also called "digest" algorithms.
      */
    inline def getHashes(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getHashes")().asInstanceOf[js.Array[String]]
    
    inline def getRandomValues(typedArray: js.typedarray.ArrayBuffer): js.typedarray.ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("getRandomValues")(typedArray.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.ArrayBuffer]
    /**
      * A convenient alias for {@link webcrypto.getRandomValues}. This
      * implementation is not compliant with the Web Crypto spec, to write
      * web-compatible code use {@link webcrypto.getRandomValues} instead.
      * @since v17.4.0
      * @return Returns `typedArray`.
      */
    inline def getRandomValues(typedArray: js.typedarray.ArrayBufferView): js.typedarray.ArrayBufferView = ^.asInstanceOf[js.Dynamic].applyDynamic("getRandomValues")(typedArray.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.ArrayBufferView]
    
    /**
      * HKDF is a simple key derivation function defined in RFC 5869\. The given `ikm`,`salt` and `info` are used with the `digest` to derive a key of `keylen` bytes.
      *
      * The supplied `callback` function is called with two arguments: `err` and`derivedKey`. If an errors occurs while deriving the key, `err` will be set;
      * otherwise `err` will be `null`. The successfully generated `derivedKey` will
      * be passed to the callback as an [ArrayBuffer](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/ArrayBuffer). An error will be thrown if any
      * of the input arguments specify invalid values or types.
      *
      * ```js
      * import { Buffer } from 'node:buffer';
      * const {
      *   hkdf,
      * } = await import('node:crypto');
      *
      * hkdf('sha512', 'key', 'salt', 'info', 64, (err, derivedKey) => {
      *   if (err) throw err;
      *   console.log(Buffer.from(derivedKey).toString('hex'));  // '24156e2...5391653'
      * });
      * ```
      * @since v15.0.0
      * @param digest The digest algorithm to use.
      * @param ikm The input keying material. Must be provided but can be zero-length.
      * @param salt The salt value. Must be provided but can be zero-length.
      * @param info Additional info value. Must be provided but can be zero-length, and cannot be more than 1024 bytes.
      * @param keylen The length of the key to generate. Must be greater than 0. The maximum allowable value is `255` times the number of bytes produced by the selected digest function (e.g. `sha512`
      * generates 64-byte hashes, making the maximum HKDF output 16320 bytes).
      */
    inline def hkdf(
      digest: String,
      irm: BinaryLike,
      salt: BinaryLike,
      info: BinaryLike,
      keylen: Double,
      callback: js.Function2[/* err */ js.Error | Null, /* derivedKey */ js.typedarray.ArrayBuffer, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hkdf")(digest.asInstanceOf[js.Any], irm.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], info.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def hkdf(
      digest: String,
      irm: typings.node.cryptoMod.KeyObject,
      salt: BinaryLike,
      info: BinaryLike,
      keylen: Double,
      callback: js.Function2[/* err */ js.Error | Null, /* derivedKey */ js.typedarray.ArrayBuffer, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hkdf")(digest.asInstanceOf[js.Any], irm.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], info.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Provides a synchronous HKDF key derivation function as defined in RFC 5869\. The
      * given `ikm`, `salt` and `info` are used with the `digest` to derive a key of`keylen` bytes.
      *
      * The successfully generated `derivedKey` will be returned as an [ArrayBuffer](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/ArrayBuffer).
      *
      * An error will be thrown if any of the input arguments specify invalid values or
      * types, or if the derived key cannot be generated.
      *
      * ```js
      * import { Buffer } from 'node:buffer';
      * const {
      *   hkdfSync,
      * } = await import('node:crypto');
      *
      * const derivedKey = hkdfSync('sha512', 'key', 'salt', 'info', 64);
      * console.log(Buffer.from(derivedKey).toString('hex'));  // '24156e2...5391653'
      * ```
      * @since v15.0.0
      * @param digest The digest algorithm to use.
      * @param ikm The input keying material. Must be provided but can be zero-length.
      * @param salt The salt value. Must be provided but can be zero-length.
      * @param info Additional info value. Must be provided but can be zero-length, and cannot be more than 1024 bytes.
      * @param keylen The length of the key to generate. Must be greater than 0. The maximum allowable value is `255` times the number of bytes produced by the selected digest function (e.g. `sha512`
      * generates 64-byte hashes, making the maximum HKDF output 16320 bytes).
      */
    inline def hkdfSync(digest: String, ikm: BinaryLike, salt: BinaryLike, info: BinaryLike, keylen: Double): js.typedarray.ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("hkdfSync")(digest.asInstanceOf[js.Any], ikm.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], info.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.ArrayBuffer]
    inline def hkdfSync(
      digest: String,
      ikm: typings.node.cryptoMod.KeyObject,
      salt: BinaryLike,
      info: BinaryLike,
      keylen: Double
    ): js.typedarray.ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("hkdfSync")(digest.asInstanceOf[js.Any], ikm.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], info.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.ArrayBuffer]
    
    /**
      * Provides an asynchronous Password-Based Key Derivation Function 2 (PBKDF2)
      * implementation. A selected HMAC digest algorithm specified by `digest` is
      * applied to derive a key of the requested byte length (`keylen`) from the`password`, `salt` and `iterations`.
      *
      * The supplied `callback` function is called with two arguments: `err` and`derivedKey`. If an error occurs while deriving the key, `err` will be set;
      * otherwise `err` will be `null`. By default, the successfully generated`derivedKey` will be passed to the callback as a `Buffer`. An error will be
      * thrown if any of the input arguments specify invalid values or types.
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
      *   pbkdf2,
      * } = await import('node:crypto');
      *
      * pbkdf2('secret', 'salt', 100000, 64, 'sha512', (err, derivedKey) => {
      *   if (err) throw err;
      *   console.log(derivedKey.toString('hex'));  // '3745e48...08d59ae'
      * });
      * ```
      *
      * An array of supported digest functions can be retrieved using {@link getHashes}.
      *
      * This API uses libuv's threadpool, which can have surprising and
      * negative performance implications for some applications; see the `UV_THREADPOOL_SIZE` documentation for more information.
      * @since v0.5.5
      */
    inline def pbkdf2(
      password: BinaryLike,
      salt: BinaryLike,
      iterations: Double,
      keylen: Double,
      digest: String,
      callback: js.Function2[/* err */ js.Error | Null, /* derivedKey */ Buffer, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pbkdf2")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], digest.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
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
    
    inline def privateDecrypt(privateKey: KeyLike, buffer: ArrayBufferView): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("privateDecrypt")(privateKey.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    /**
      * Decrypts `buffer` with `privateKey`. `buffer` was previously encrypted using
      * the corresponding public key, for example using {@link publicEncrypt}.
      *
      * If `privateKey` is not a `KeyObject`, this function behaves as if`privateKey` had been passed to {@link createPrivateKey}. If it is an
      * object, the `padding` property can be passed. Otherwise, this function uses`RSA_PKCS1_OAEP_PADDING`.
      * @since v0.11.14
      */
    inline def privateDecrypt(privateKey: RsaPrivateKey, buffer: ArrayBufferView): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("privateDecrypt")(privateKey.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    
    inline def privateEncrypt(privateKey: KeyLike, buffer: ArrayBufferView): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("privateEncrypt")(privateKey.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    /**
      * Encrypts `buffer` with `privateKey`. The returned data can be decrypted using
      * the corresponding public key, for example using {@link publicDecrypt}.
      *
      * If `privateKey` is not a `KeyObject`, this function behaves as if`privateKey` had been passed to {@link createPrivateKey}. If it is an
      * object, the `padding` property can be passed. Otherwise, this function uses`RSA_PKCS1_PADDING`.
      * @since v1.1.0
      */
    inline def privateEncrypt(privateKey: RsaPrivateKey, buffer: ArrayBufferView): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("privateEncrypt")(privateKey.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    
    inline def pseudoRandomBytes(size: Double): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("pseudoRandomBytes")(size.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    inline def pseudoRandomBytes(size: Double, callback: js.Function2[/* err */ js.Error | Null, /* buf */ Buffer, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pseudoRandomBytes")(size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def publicDecrypt(key: KeyLike, buffer: ArrayBufferView): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("publicDecrypt")(key.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    inline def publicDecrypt(key: RsaPrivateKey, buffer: ArrayBufferView): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("publicDecrypt")(key.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    /**
      * Decrypts `buffer` with `key`.`buffer` was previously encrypted using
      * the corresponding private key, for example using {@link privateEncrypt}.
      *
      * If `key` is not a `KeyObject`, this function behaves as if`key` had been passed to {@link createPublicKey}. If it is an
      * object, the `padding` property can be passed. Otherwise, this function uses`RSA_PKCS1_PADDING`.
      *
      * Because RSA public keys can be derived from private keys, a private key may
      * be passed instead of a public key.
      * @since v1.1.0
      */
    inline def publicDecrypt(key: RsaPublicKey, buffer: ArrayBufferView): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("publicDecrypt")(key.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    
    inline def publicEncrypt(key: KeyLike, buffer: ArrayBufferView): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("publicEncrypt")(key.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    inline def publicEncrypt(key: RsaPrivateKey, buffer: ArrayBufferView): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("publicEncrypt")(key.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    /**
      * Encrypts the content of `buffer` with `key` and returns a new `Buffer` with encrypted content. The returned data can be decrypted using
      * the corresponding private key, for example using {@link privateDecrypt}.
      *
      * If `key` is not a `KeyObject`, this function behaves as if`key` had been passed to {@link createPublicKey}. If it is an
      * object, the `padding` property can be passed. Otherwise, this function uses`RSA_PKCS1_OAEP_PADDING`.
      *
      * Because RSA public keys can be derived from private keys, a private key may
      * be passed instead of a public key.
      * @since v0.11.14
      */
    inline def publicEncrypt(key: RsaPublicKey, buffer: ArrayBufferView): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("publicEncrypt")(key.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    
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
    
    inline def randomFill(
      buffer: js.typedarray.DataView,
      callback: js.Function2[/* err */ js.Error | Null, /* buf */ js.typedarray.DataView, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def randomFill(
      buffer: js.typedarray.DataView,
      offset: Double,
      callback: js.Function2[/* err */ js.Error | Null, /* buf */ js.typedarray.DataView, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def randomFill(
      buffer: js.typedarray.DataView,
      offset: Double,
      size: Double,
      callback: js.Function2[/* err */ js.Error | Null, /* buf */ js.typedarray.DataView, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def randomFill(
      buffer: js.typedarray.Float32Array,
      callback: js.Function2[/* err */ js.Error | Null, /* buf */ js.typedarray.Float32Array, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def randomFill(
      buffer: js.typedarray.Float32Array,
      offset: Double,
      callback: js.Function2[/* err */ js.Error | Null, /* buf */ js.typedarray.Float32Array, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def randomFill(
      buffer: js.typedarray.Float32Array,
      offset: Double,
      size: Double,
      callback: js.Function2[/* err */ js.Error | Null, /* buf */ js.typedarray.Float32Array, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def randomFill(
      buffer: js.typedarray.Float64Array,
      callback: js.Function2[/* err */ js.Error | Null, /* buf */ js.typedarray.Float64Array, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def randomFill(
      buffer: js.typedarray.Float64Array,
      offset: Double,
      callback: js.Function2[/* err */ js.Error | Null, /* buf */ js.typedarray.Float64Array, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def randomFill(
      buffer: js.typedarray.Float64Array,
      offset: Double,
      size: Double,
      callback: js.Function2[/* err */ js.Error | Null, /* buf */ js.typedarray.Float64Array, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def randomFill(
      buffer: js.typedarray.Int16Array,
      callback: js.Function2[/* err */ js.Error | Null, /* buf */ js.typedarray.Int16Array, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def randomFill(
      buffer: js.typedarray.Int16Array,
      offset: Double,
      callback: js.Function2[/* err */ js.Error | Null, /* buf */ js.typedarray.Int16Array, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def randomFill(
      buffer: js.typedarray.Int16Array,
      offset: Double,
      size: Double,
      callback: js.Function2[/* err */ js.Error | Null, /* buf */ js.typedarray.Int16Array, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def randomFill(
      buffer: js.typedarray.Int32Array,
      callback: js.Function2[/* err */ js.Error | Null, /* buf */ js.typedarray.Int32Array, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def randomFill(
      buffer: js.typedarray.Int32Array,
      offset: Double,
      callback: js.Function2[/* err */ js.Error | Null, /* buf */ js.typedarray.Int32Array, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def randomFill(
      buffer: js.typedarray.Int32Array,
      offset: Double,
      size: Double,
      callback: js.Function2[/* err */ js.Error | Null, /* buf */ js.typedarray.Int32Array, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def randomFill(
      buffer: js.typedarray.Int8Array,
      callback: js.Function2[/* err */ js.Error | Null, /* buf */ js.typedarray.Int8Array, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def randomFill(
      buffer: js.typedarray.Int8Array,
      offset: Double,
      callback: js.Function2[/* err */ js.Error | Null, /* buf */ js.typedarray.Int8Array, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def randomFill(
      buffer: js.typedarray.Int8Array,
      offset: Double,
      size: Double,
      callback: js.Function2[/* err */ js.Error | Null, /* buf */ js.typedarray.Int8Array, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def randomFill(
      buffer: js.typedarray.Uint16Array,
      callback: js.Function2[/* err */ js.Error | Null, /* buf */ js.typedarray.Uint16Array, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def randomFill(
      buffer: js.typedarray.Uint16Array,
      offset: Double,
      callback: js.Function2[/* err */ js.Error | Null, /* buf */ js.typedarray.Uint16Array, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def randomFill(
      buffer: js.typedarray.Uint16Array,
      offset: Double,
      size: Double,
      callback: js.Function2[/* err */ js.Error | Null, /* buf */ js.typedarray.Uint16Array, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def randomFill(
      buffer: js.typedarray.Uint32Array,
      callback: js.Function2[/* err */ js.Error | Null, /* buf */ js.typedarray.Uint32Array, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def randomFill(
      buffer: js.typedarray.Uint32Array,
      offset: Double,
      callback: js.Function2[/* err */ js.Error | Null, /* buf */ js.typedarray.Uint32Array, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def randomFill(
      buffer: js.typedarray.Uint32Array,
      offset: Double,
      size: Double,
      callback: js.Function2[/* err */ js.Error | Null, /* buf */ js.typedarray.Uint32Array, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    /**
      * This function is similar to {@link randomBytes} but requires the first
      * argument to be a `Buffer` that will be filled. It also
      * requires that a callback is passed in.
      *
      * If the `callback` function is not provided, an error will be thrown.
      *
      * ```js
      * import { Buffer } from 'node:buffer';
      * const { randomFill } = await import('node:crypto');
      *
      * const buf = Buffer.alloc(10);
      * randomFill(buf, (err, buf) => {
      *   if (err) throw err;
      *   console.log(buf.toString('hex'));
      * });
      *
      * randomFill(buf, 5, (err, buf) => {
      *   if (err) throw err;
      *   console.log(buf.toString('hex'));
      * });
      *
      * // The above is equivalent to the following:
      * randomFill(buf, 5, 5, (err, buf) => {
      *   if (err) throw err;
      *   console.log(buf.toString('hex'));
      * });
      * ```
      *
      * Any `ArrayBuffer`, `TypedArray`, or `DataView` instance may be passed as`buffer`.
      *
      * While this includes instances of `Float32Array` and `Float64Array`, this
      * function should not be used to generate random floating-point numbers. The
      * result may contain `+Infinity`, `-Infinity`, and `NaN`, and even if the array
      * contains finite numbers only, they are not drawn from a uniform random
      * distribution and have no meaningful lower or upper bounds.
      *
      * ```js
      * import { Buffer } from 'node:buffer';
      * const { randomFill } = await import('node:crypto');
      *
      * const a = new Uint32Array(10);
      * randomFill(a, (err, buf) => {
      *   if (err) throw err;
      *   console.log(Buffer.from(buf.buffer, buf.byteOffset, buf.byteLength)
      *     .toString('hex'));
      * });
      *
      * const b = new DataView(new ArrayBuffer(10));
      * randomFill(b, (err, buf) => {
      *   if (err) throw err;
      *   console.log(Buffer.from(buf.buffer, buf.byteOffset, buf.byteLength)
      *     .toString('hex'));
      * });
      *
      * const c = new ArrayBuffer(10);
      * randomFill(c, (err, buf) => {
      *   if (err) throw err;
      *   console.log(Buffer.from(buf).toString('hex'));
      * });
      * ```
      *
      * This API uses libuv's threadpool, which can have surprising and
      * negative performance implications for some applications; see the `UV_THREADPOOL_SIZE` documentation for more information.
      *
      * The asynchronous version of `crypto.randomFill()` is carried out in a single
      * threadpool request. To minimize threadpool task length variation, partition
      * large `randomFill` requests when doing so as part of fulfilling a client
      * request.
      * @since v7.10.0, v6.13.0
      * @param buffer Must be supplied. The size of the provided `buffer` must not be larger than `2**31 - 1`.
      * @param [offset=0]
      * @param [size=buffer.length - offset]
      * @param callback `function(err, buf) {}`.
      */
    inline def randomFill(
      buffer: js.typedarray.Uint8Array,
      callback: js.Function2[/* err */ js.Error | Null, /* buf */ js.typedarray.Uint8Array, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def randomFill(
      buffer: js.typedarray.Uint8Array,
      offset: Double,
      callback: js.Function2[/* err */ js.Error | Null, /* buf */ js.typedarray.Uint8Array, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def randomFill(
      buffer: js.typedarray.Uint8Array,
      offset: Double,
      size: Double,
      callback: js.Function2[/* err */ js.Error | Null, /* buf */ js.typedarray.Uint8Array, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def randomFill(
      buffer: js.typedarray.Uint8ClampedArray,
      callback: js.Function2[/* err */ js.Error | Null, /* buf */ js.typedarray.Uint8ClampedArray, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def randomFill(
      buffer: js.typedarray.Uint8ClampedArray,
      offset: Double,
      callback: js.Function2[/* err */ js.Error | Null, /* buf */ js.typedarray.Uint8ClampedArray, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def randomFill(
      buffer: js.typedarray.Uint8ClampedArray,
      offset: Double,
      size: Double,
      callback: js.Function2[/* err */ js.Error | Null, /* buf */ js.typedarray.Uint8ClampedArray, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def randomFill(
      buffer: BigInt64Array,
      callback: js.Function2[/* err */ js.Error | Null, /* buf */ BigInt64Array, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def randomFill(
      buffer: BigInt64Array,
      offset: Double,
      callback: js.Function2[/* err */ js.Error | Null, /* buf */ BigInt64Array, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def randomFill(
      buffer: BigInt64Array,
      offset: Double,
      size: Double,
      callback: js.Function2[/* err */ js.Error | Null, /* buf */ BigInt64Array, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def randomFill(
      buffer: BigUint64Array,
      callback: js.Function2[/* err */ js.Error | Null, /* buf */ BigUint64Array, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def randomFill(
      buffer: BigUint64Array,
      offset: Double,
      callback: js.Function2[/* err */ js.Error | Null, /* buf */ BigUint64Array, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def randomFill(
      buffer: BigUint64Array,
      offset: Double,
      size: Double,
      callback: js.Function2[/* err */ js.Error | Null, /* buf */ BigUint64Array, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFill")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def randomFillSync(buffer: js.typedarray.DataView): js.typedarray.DataView = ^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.DataView]
    inline def randomFillSync(buffer: js.typedarray.DataView, offset: Double): js.typedarray.DataView = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.DataView]
    inline def randomFillSync(buffer: js.typedarray.DataView, offset: Double, size: Double): js.typedarray.DataView = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.DataView]
    inline def randomFillSync(buffer: js.typedarray.DataView, offset: Unit, size: Double): js.typedarray.DataView = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.DataView]
    inline def randomFillSync(buffer: js.typedarray.Float32Array): js.typedarray.Float32Array = ^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Float32Array]
    inline def randomFillSync(buffer: js.typedarray.Float32Array, offset: Double): js.typedarray.Float32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Float32Array]
    inline def randomFillSync(buffer: js.typedarray.Float32Array, offset: Double, size: Double): js.typedarray.Float32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Float32Array]
    inline def randomFillSync(buffer: js.typedarray.Float32Array, offset: Unit, size: Double): js.typedarray.Float32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Float32Array]
    inline def randomFillSync(buffer: js.typedarray.Float64Array): js.typedarray.Float64Array = ^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Float64Array]
    inline def randomFillSync(buffer: js.typedarray.Float64Array, offset: Double): js.typedarray.Float64Array = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Float64Array]
    inline def randomFillSync(buffer: js.typedarray.Float64Array, offset: Double, size: Double): js.typedarray.Float64Array = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Float64Array]
    inline def randomFillSync(buffer: js.typedarray.Float64Array, offset: Unit, size: Double): js.typedarray.Float64Array = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Float64Array]
    inline def randomFillSync(buffer: js.typedarray.Int16Array): js.typedarray.Int16Array = ^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Int16Array]
    inline def randomFillSync(buffer: js.typedarray.Int16Array, offset: Double): js.typedarray.Int16Array = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Int16Array]
    inline def randomFillSync(buffer: js.typedarray.Int16Array, offset: Double, size: Double): js.typedarray.Int16Array = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Int16Array]
    inline def randomFillSync(buffer: js.typedarray.Int16Array, offset: Unit, size: Double): js.typedarray.Int16Array = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Int16Array]
    inline def randomFillSync(buffer: js.typedarray.Int32Array): js.typedarray.Int32Array = ^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Int32Array]
    inline def randomFillSync(buffer: js.typedarray.Int32Array, offset: Double): js.typedarray.Int32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Int32Array]
    inline def randomFillSync(buffer: js.typedarray.Int32Array, offset: Double, size: Double): js.typedarray.Int32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Int32Array]
    inline def randomFillSync(buffer: js.typedarray.Int32Array, offset: Unit, size: Double): js.typedarray.Int32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Int32Array]
    inline def randomFillSync(buffer: js.typedarray.Int8Array): js.typedarray.Int8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Int8Array]
    inline def randomFillSync(buffer: js.typedarray.Int8Array, offset: Double): js.typedarray.Int8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Int8Array]
    inline def randomFillSync(buffer: js.typedarray.Int8Array, offset: Double, size: Double): js.typedarray.Int8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Int8Array]
    inline def randomFillSync(buffer: js.typedarray.Int8Array, offset: Unit, size: Double): js.typedarray.Int8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Int8Array]
    inline def randomFillSync(buffer: js.typedarray.Uint16Array): js.typedarray.Uint16Array = ^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint16Array]
    inline def randomFillSync(buffer: js.typedarray.Uint16Array, offset: Double): js.typedarray.Uint16Array = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint16Array]
    inline def randomFillSync(buffer: js.typedarray.Uint16Array, offset: Double, size: Double): js.typedarray.Uint16Array = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint16Array]
    inline def randomFillSync(buffer: js.typedarray.Uint16Array, offset: Unit, size: Double): js.typedarray.Uint16Array = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint16Array]
    inline def randomFillSync(buffer: js.typedarray.Uint32Array): js.typedarray.Uint32Array = ^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint32Array]
    inline def randomFillSync(buffer: js.typedarray.Uint32Array, offset: Double): js.typedarray.Uint32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint32Array]
    inline def randomFillSync(buffer: js.typedarray.Uint32Array, offset: Double, size: Double): js.typedarray.Uint32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint32Array]
    inline def randomFillSync(buffer: js.typedarray.Uint32Array, offset: Unit, size: Double): js.typedarray.Uint32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint32Array]
    /**
      * Synchronous version of {@link randomFill}.
      *
      * ```js
      * import { Buffer } from 'node:buffer';
      * const { randomFillSync } = await import('node:crypto');
      *
      * const buf = Buffer.alloc(10);
      * console.log(randomFillSync(buf).toString('hex'));
      *
      * randomFillSync(buf, 5);
      * console.log(buf.toString('hex'));
      *
      * // The above is equivalent to the following:
      * randomFillSync(buf, 5, 5);
      * console.log(buf.toString('hex'));
      * ```
      *
      * Any `ArrayBuffer`, `TypedArray` or `DataView` instance may be passed as`buffer`.
      *
      * ```js
      * import { Buffer } from 'node:buffer';
      * const { randomFillSync } = await import('node:crypto');
      *
      * const a = new Uint32Array(10);
      * console.log(Buffer.from(randomFillSync(a).buffer,
      *                         a.byteOffset, a.byteLength).toString('hex'));
      *
      * const b = new DataView(new ArrayBuffer(10));
      * console.log(Buffer.from(randomFillSync(b).buffer,
      *                         b.byteOffset, b.byteLength).toString('hex'));
      *
      * const c = new ArrayBuffer(10);
      * console.log(Buffer.from(randomFillSync(c)).toString('hex'));
      * ```
      * @since v7.10.0, v6.13.0
      * @param buffer Must be supplied. The size of the provided `buffer` must not be larger than `2**31 - 1`.
      * @param [offset=0]
      * @param [size=buffer.length - offset]
      * @return The object passed as `buffer` argument.
      */
    inline def randomFillSync(buffer: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    inline def randomFillSync(buffer: js.typedarray.Uint8Array, offset: Double): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    inline def randomFillSync(buffer: js.typedarray.Uint8Array, offset: Double, size: Double): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    inline def randomFillSync(buffer: js.typedarray.Uint8Array, offset: Unit, size: Double): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    inline def randomFillSync(buffer: js.typedarray.Uint8ClampedArray): js.typedarray.Uint8ClampedArray = ^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8ClampedArray]
    inline def randomFillSync(buffer: js.typedarray.Uint8ClampedArray, offset: Double): js.typedarray.Uint8ClampedArray = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8ClampedArray]
    inline def randomFillSync(buffer: js.typedarray.Uint8ClampedArray, offset: Double, size: Double): js.typedarray.Uint8ClampedArray = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8ClampedArray]
    inline def randomFillSync(buffer: js.typedarray.Uint8ClampedArray, offset: Unit, size: Double): js.typedarray.Uint8ClampedArray = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8ClampedArray]
    inline def randomFillSync(buffer: BigInt64Array): BigInt64Array = ^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any]).asInstanceOf[BigInt64Array]
    inline def randomFillSync(buffer: BigInt64Array, offset: Double): BigInt64Array = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[BigInt64Array]
    inline def randomFillSync(buffer: BigInt64Array, offset: Double, size: Double): BigInt64Array = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[BigInt64Array]
    inline def randomFillSync(buffer: BigInt64Array, offset: Unit, size: Double): BigInt64Array = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[BigInt64Array]
    inline def randomFillSync(buffer: BigUint64Array): BigUint64Array = ^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any]).asInstanceOf[BigUint64Array]
    inline def randomFillSync(buffer: BigUint64Array, offset: Double): BigUint64Array = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[BigUint64Array]
    inline def randomFillSync(buffer: BigUint64Array, offset: Double, size: Double): BigUint64Array = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[BigUint64Array]
    inline def randomFillSync(buffer: BigUint64Array, offset: Unit, size: Double): BigUint64Array = (^.asInstanceOf[js.Dynamic].applyDynamic("randomFillSync")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[BigUint64Array]
    
    /**
      * Return a random integer `n` such that `min <= n < max`.  This
      * implementation avoids [modulo bias](https://en.wikipedia.org/wiki/Fisher%E2%80%93Yates_shuffle#Modulo_bias).
      *
      * The range (`max - min`) must be less than 248. `min` and `max` must
      * be [safe integers](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Number/isSafeInteger).
      *
      * If the `callback` function is not provided, the random integer is
      * generated synchronously.
      *
      * ```js
      * // Asynchronous
      * const {
      *   randomInt,
      * } = await import('node:crypto');
      *
      * randomInt(3, (err, n) => {
      *   if (err) throw err;
      *   console.log(`Random number chosen from (0, 1, 2): ${n}`);
      * });
      * ```
      *
      * ```js
      * // Synchronous
      * const {
      *   randomInt,
      * } = await import('node:crypto');
      *
      * const n = randomInt(3);
      * console.log(`Random number chosen from (0, 1, 2): ${n}`);
      * ```
      *
      * ```js
      * // With `min` argument
      * const {
      *   randomInt,
      * } = await import('node:crypto');
      *
      * const n = randomInt(1, 7);
      * console.log(`The dice rolled: ${n}`);
      * ```
      * @since v14.10.0, v12.19.0
      * @param [min=0] Start of random range (inclusive).
      * @param max End of random range (exclusive).
      * @param callback `function(err, n) {}`.
      */
    inline def randomInt(max: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("randomInt")(max.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def randomInt(max: Double, callback: js.Function2[/* err */ js.Error | Null, /* value */ Double, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomInt")(max.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def randomInt(min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("randomInt")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def randomInt(
      min: Double,
      max: Double,
      callback: js.Function2[/* err */ js.Error | Null, /* value */ Double, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("randomInt")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Generates a random [RFC 4122](https://www.rfc-editor.org/rfc/rfc4122.txt) version 4 UUID. The UUID is generated using a
      * cryptographic pseudorandom number generator.
      * @since v15.6.0, v14.17.0
      */
    inline def randomUUID(): UUID = ^.asInstanceOf[js.Dynamic].applyDynamic("randomUUID")().asInstanceOf[UUID]
    inline def randomUUID(options: RandomUUIDOptions): UUID = ^.asInstanceOf[js.Dynamic].applyDynamic("randomUUID")(options.asInstanceOf[js.Any]).asInstanceOf[UUID]
    
    /**
      * Provides an asynchronous [scrypt](https://en.wikipedia.org/wiki/Scrypt) implementation. Scrypt is a password-based
      * key derivation function that is designed to be expensive computationally and
      * memory-wise in order to make brute-force attacks unrewarding.
      *
      * The `salt` should be as unique as possible. It is recommended that a salt is
      * random and at least 16 bytes long. See [NIST SP 800-132](https://nvlpubs.nist.gov/nistpubs/Legacy/SP/nistspecialpublication800-132.pdf) for details.
      *
      * When passing strings for `password` or `salt`, please consider `caveats when using strings as inputs to cryptographic APIs`.
      *
      * The `callback` function is called with two arguments: `err` and `derivedKey`.`err` is an exception object when key derivation fails, otherwise `err` is`null`. `derivedKey` is passed to the
      * callback as a `Buffer`.
      *
      * An exception is thrown when any of the input arguments specify invalid values
      * or types.
      *
      * ```js
      * const {
      *   scrypt,
      * } = await import('node:crypto');
      *
      * // Using the factory defaults.
      * scrypt('password', 'salt', 64, (err, derivedKey) => {
      *   if (err) throw err;
      *   console.log(derivedKey.toString('hex'));  // '3745e48...08d59ae'
      * });
      * // Using a custom N parameter. Must be a power of two.
      * scrypt('password', 'salt', 64, { N: 1024 }, (err, derivedKey) => {
      *   if (err) throw err;
      *   console.log(derivedKey.toString('hex'));  // '3745e48...aa39b34'
      * });
      * ```
      * @since v10.5.0
      */
    inline def scrypt(
      password: BinaryLike,
      salt: BinaryLike,
      keylen: Double,
      callback: js.Function2[/* err */ js.Error | Null, /* derivedKey */ Buffer, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scrypt")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def scrypt(
      password: BinaryLike,
      salt: BinaryLike,
      keylen: Double,
      options: ScryptOptions,
      callback: js.Function2[/* err */ js.Error | Null, /* derivedKey */ Buffer, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scrypt")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Provides a synchronous [scrypt](https://en.wikipedia.org/wiki/Scrypt) implementation. Scrypt is a password-based
      * key derivation function that is designed to be expensive computationally and
      * memory-wise in order to make brute-force attacks unrewarding.
      *
      * The `salt` should be as unique as possible. It is recommended that a salt is
      * random and at least 16 bytes long. See [NIST SP 800-132](https://nvlpubs.nist.gov/nistpubs/Legacy/SP/nistspecialpublication800-132.pdf) for details.
      *
      * When passing strings for `password` or `salt`, please consider `caveats when using strings as inputs to cryptographic APIs`.
      *
      * An exception is thrown when key derivation fails, otherwise the derived key is
      * returned as a `Buffer`.
      *
      * An exception is thrown when any of the input arguments specify invalid values
      * or types.
      *
      * ```js
      * const {
      *   scryptSync,
      * } = await import('node:crypto');
      * // Using the factory defaults.
      *
      * const key1 = scryptSync('password', 'salt', 64);
      * console.log(key1.toString('hex'));  // '3745e48...08d59ae'
      * // Using a custom N parameter. Must be a power of two.
      * const key2 = scryptSync('password', 'salt', 64, { N: 1024 });
      * console.log(key2.toString('hex'));  // '3745e48...aa39b34'
      * ```
      * @since v10.5.0
      */
    inline def scryptSync(password: BinaryLike, salt: BinaryLike, keylen: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("scryptSync")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    inline def scryptSync(password: BinaryLike, salt: BinaryLike, keylen: Double, options: ScryptOptions): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("scryptSync")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], keylen.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    
    /**
      * @since v15.6.0
      */
    inline def secureHeapUsed(): SecureHeapUsage = ^.asInstanceOf[js.Dynamic].applyDynamic("secureHeapUsed")().asInstanceOf[SecureHeapUsage]
    
    /**
      * Load and set the `engine` for some or all OpenSSL functions (selected by flags).
      *
      * `engine` could be either an id or a path to the engine's shared library.
      *
      * The optional `flags` argument uses `ENGINE_METHOD_ALL` by default. The `flags`is a bit field taking one of or a mix of the following flags (defined in`crypto.constants`):
      *
      * * `crypto.constants.ENGINE_METHOD_RSA`
      * * `crypto.constants.ENGINE_METHOD_DSA`
      * * `crypto.constants.ENGINE_METHOD_DH`
      * * `crypto.constants.ENGINE_METHOD_RAND`
      * * `crypto.constants.ENGINE_METHOD_EC`
      * * `crypto.constants.ENGINE_METHOD_CIPHERS`
      * * `crypto.constants.ENGINE_METHOD_DIGESTS`
      * * `crypto.constants.ENGINE_METHOD_PKEY_METHS`
      * * `crypto.constants.ENGINE_METHOD_PKEY_ASN1_METHS`
      * * `crypto.constants.ENGINE_METHOD_ALL`
      * * `crypto.constants.ENGINE_METHOD_NONE`
      * @since v0.11.11
      * @param flags
      */
    inline def setEngine(engine: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setEngine")(engine.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def setEngine(engine: String, flags: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setEngine")(engine.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Enables the FIPS compliant crypto provider in a FIPS-enabled Node.js build.
      * Throws an error if FIPS mode is not available.
      * @since v10.0.0
      * @param bool `true` to enable FIPS mode.
      */
    inline def setFips(bool: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setFips")(bool.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Calculates and returns the signature for `data` using the given private key and
      * algorithm. If `algorithm` is `null` or `undefined`, then the algorithm is
      * dependent upon the key type (especially Ed25519 and Ed448).
      *
      * If `key` is not a `KeyObject`, this function behaves as if `key` had been
      * passed to {@link createPrivateKey}. If it is an object, the following
      * additional properties can be passed:
      *
      * If the `callback` function is provided this function uses libuv's threadpool.
      * @since v12.0.0
      */
    inline def sign(algorithm: String, data: ArrayBufferView, key: KeyLike): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    inline def sign(
      algorithm: String,
      data: ArrayBufferView,
      key: KeyLike,
      callback: js.Function2[/* error */ js.Error | Null, /* data */ Buffer, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def sign(algorithm: String, data: ArrayBufferView, key: SignKeyObjectInput): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    inline def sign(
      algorithm: String,
      data: ArrayBufferView,
      key: SignKeyObjectInput,
      callback: js.Function2[/* error */ js.Error | Null, /* data */ Buffer, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def sign(algorithm: String, data: ArrayBufferView, key: SignPrivateKeyInput): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    inline def sign(
      algorithm: String,
      data: ArrayBufferView,
      key: SignPrivateKeyInput,
      callback: js.Function2[/* error */ js.Error | Null, /* data */ Buffer, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def sign(algorithm: Null, data: ArrayBufferView, key: KeyLike): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    inline def sign(
      algorithm: Null,
      data: ArrayBufferView,
      key: KeyLike,
      callback: js.Function2[/* error */ js.Error | Null, /* data */ Buffer, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def sign(algorithm: Null, data: ArrayBufferView, key: SignKeyObjectInput): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    inline def sign(
      algorithm: Null,
      data: ArrayBufferView,
      key: SignKeyObjectInput,
      callback: js.Function2[/* error */ js.Error | Null, /* data */ Buffer, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def sign(algorithm: Null, data: ArrayBufferView, key: SignPrivateKeyInput): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    inline def sign(
      algorithm: Null,
      data: ArrayBufferView,
      key: SignPrivateKeyInput,
      callback: js.Function2[/* error */ js.Error | Null, /* data */ Buffer, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def sign(algorithm: Unit, data: ArrayBufferView, key: KeyLike): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    inline def sign(
      algorithm: Unit,
      data: ArrayBufferView,
      key: KeyLike,
      callback: js.Function2[/* error */ js.Error | Null, /* data */ Buffer, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def sign(algorithm: Unit, data: ArrayBufferView, key: SignKeyObjectInput): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    inline def sign(
      algorithm: Unit,
      data: ArrayBufferView,
      key: SignKeyObjectInput,
      callback: js.Function2[/* error */ js.Error | Null, /* data */ Buffer, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def sign(algorithm: Unit, data: ArrayBufferView, key: SignPrivateKeyInput): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    inline def sign(
      algorithm: Unit,
      data: ArrayBufferView,
      key: SignPrivateKeyInput,
      callback: js.Function2[/* error */ js.Error | Null, /* data */ Buffer, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * A convenient alias for `crypto.webcrypto.subtle`.
      * @since v17.4.0
      */
    @JSImport("file-system-cache/lib/common", "crypto.subtle")
    @js.native
    val subtle: SubtleCrypto = js.native
    
    /**
      * This function compares the underlying bytes that represent the given`ArrayBuffer`, `TypedArray`, or `DataView` instances using a constant-time
      * algorithm.
      *
      * This function does not leak timing information that
      * would allow an attacker to guess one of the values. This is suitable for
      * comparing HMAC digests or secret values like authentication cookies or [capability urls](https://www.w3.org/TR/capability-urls/).
      *
      * `a` and `b` must both be `Buffer`s, `TypedArray`s, or `DataView`s, and they
      * must have the same byte length. An error is thrown if `a` and `b` have
      * different byte lengths.
      *
      * If at least one of `a` and `b` is a `TypedArray` with more than one byte per
      * entry, such as `Uint16Array`, the result will be computed using the platform
      * byte order.
      *
      * **When both of the inputs are `Float32Array`s or`Float64Array`s, this function might return unexpected results due to IEEE 754**
      * **encoding of floating-point numbers. In particular, neither `x === y` nor`Object.is(x, y)` implies that the byte representations of two floating-point**
      * **numbers `x` and `y` are equal.**
      *
      * Use of `crypto.timingSafeEqual` does not guarantee that the _surrounding_ code
      * is timing-safe. Care should be taken to ensure that the surrounding code does
      * not introduce timing vulnerabilities.
      * @since v6.6.0
      */
    inline def timingSafeEqual(a: ArrayBufferView, b: ArrayBufferView): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("timingSafeEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Verifies the given signature for `data` using the given key and algorithm. If`algorithm` is `null` or `undefined`, then the algorithm is dependent upon the
      * key type (especially Ed25519 and Ed448).
      *
      * If `key` is not a `KeyObject`, this function behaves as if `key` had been
      * passed to {@link createPublicKey}. If it is an object, the following
      * additional properties can be passed:
      *
      * The `signature` argument is the previously calculated signature for the `data`.
      *
      * Because public keys can be derived from private keys, a private key or a public
      * key may be passed for `key`.
      *
      * If the `callback` function is provided this function uses libuv's threadpool.
      * @since v12.0.0
      */
    inline def verify(algorithm: String, data: ArrayBufferView, key: KeyLike, signature: ArrayBufferView): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def verify(
      algorithm: String,
      data: ArrayBufferView,
      key: KeyLike,
      signature: ArrayBufferView,
      callback: js.Function2[/* error */ js.Error | Null, /* result */ Boolean, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def verify(algorithm: String, data: ArrayBufferView, key: VerifyJsonWebKeyInput, signature: ArrayBufferView): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def verify(
      algorithm: String,
      data: ArrayBufferView,
      key: VerifyJsonWebKeyInput,
      signature: ArrayBufferView,
      callback: js.Function2[/* error */ js.Error | Null, /* result */ Boolean, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def verify(algorithm: String, data: ArrayBufferView, key: VerifyKeyObjectInput, signature: ArrayBufferView): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def verify(
      algorithm: String,
      data: ArrayBufferView,
      key: VerifyKeyObjectInput,
      signature: ArrayBufferView,
      callback: js.Function2[/* error */ js.Error | Null, /* result */ Boolean, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def verify(algorithm: String, data: ArrayBufferView, key: VerifyPublicKeyInput, signature: ArrayBufferView): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def verify(
      algorithm: String,
      data: ArrayBufferView,
      key: VerifyPublicKeyInput,
      signature: ArrayBufferView,
      callback: js.Function2[/* error */ js.Error | Null, /* result */ Boolean, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def verify(algorithm: Null, data: ArrayBufferView, key: KeyLike, signature: ArrayBufferView): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def verify(
      algorithm: Null,
      data: ArrayBufferView,
      key: KeyLike,
      signature: ArrayBufferView,
      callback: js.Function2[/* error */ js.Error | Null, /* result */ Boolean, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def verify(algorithm: Null, data: ArrayBufferView, key: VerifyJsonWebKeyInput, signature: ArrayBufferView): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def verify(
      algorithm: Null,
      data: ArrayBufferView,
      key: VerifyJsonWebKeyInput,
      signature: ArrayBufferView,
      callback: js.Function2[/* error */ js.Error | Null, /* result */ Boolean, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def verify(algorithm: Null, data: ArrayBufferView, key: VerifyKeyObjectInput, signature: ArrayBufferView): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def verify(
      algorithm: Null,
      data: ArrayBufferView,
      key: VerifyKeyObjectInput,
      signature: ArrayBufferView,
      callback: js.Function2[/* error */ js.Error | Null, /* result */ Boolean, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def verify(algorithm: Null, data: ArrayBufferView, key: VerifyPublicKeyInput, signature: ArrayBufferView): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def verify(
      algorithm: Null,
      data: ArrayBufferView,
      key: VerifyPublicKeyInput,
      signature: ArrayBufferView,
      callback: js.Function2[/* error */ js.Error | Null, /* result */ Boolean, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def verify(algorithm: Unit, data: ArrayBufferView, key: KeyLike, signature: ArrayBufferView): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def verify(
      algorithm: Unit,
      data: ArrayBufferView,
      key: KeyLike,
      signature: ArrayBufferView,
      callback: js.Function2[/* error */ js.Error | Null, /* result */ Boolean, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def verify(algorithm: Unit, data: ArrayBufferView, key: VerifyJsonWebKeyInput, signature: ArrayBufferView): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def verify(
      algorithm: Unit,
      data: ArrayBufferView,
      key: VerifyJsonWebKeyInput,
      signature: ArrayBufferView,
      callback: js.Function2[/* error */ js.Error | Null, /* result */ Boolean, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def verify(algorithm: Unit, data: ArrayBufferView, key: VerifyKeyObjectInput, signature: ArrayBufferView): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def verify(
      algorithm: Unit,
      data: ArrayBufferView,
      key: VerifyKeyObjectInput,
      signature: ArrayBufferView,
      callback: js.Function2[/* error */ js.Error | Null, /* result */ Boolean, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def verify(algorithm: Unit, data: ArrayBufferView, key: VerifyPublicKeyInput, signature: ArrayBufferView): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def verify(
      algorithm: Unit,
      data: ArrayBufferView,
      key: VerifyPublicKeyInput,
      signature: ArrayBufferView,
      callback: js.Function2[/* error */ js.Error | Null, /* result */ Boolean, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(algorithm.asInstanceOf[js.Any], data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], signature.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("file-system-cache/lib/common", "crypto.webcrypto")
    @js.native
    val webcrypto: Crypto = js.native
  }
  
  object fs {
    
    @JSImport("file-system-cache/lib/common", "fs")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("file-system-cache/lib/common", "fs.Dir")
    @js.native
    open class Dir ()
      extends typings.fileSystemCache.libCommonLibsMod.fs.Dir
    
    @JSImport("file-system-cache/lib/common", "fs.Dirent")
    @js.native
    open class Dirent ()
      extends typings.fileSystemCache.libCommonLibsMod.fs.Dirent
    
    @JSImport("file-system-cache/lib/common", "fs.ReadStream")
    @js.native
    open class ReadStream ()
      extends typings.fileSystemCache.libCommonLibsMod.fs.ReadStream {
      def this(opts: ReadableOptions) = this()
    }
    
    @JSImport("file-system-cache/lib/common", "fs.Stats")
    @js.native
    open class Stats ()
      extends typings.fileSystemCache.libCommonLibsMod.fs.Stats
    
    @JSImport("file-system-cache/lib/common", "fs.StatsFs")
    @js.native
    open class StatsFs ()
      extends typings.fileSystemCache.libCommonLibsMod.fs.StatsFs
    
    @JSImport("file-system-cache/lib/common", "fs.WriteStream")
    @js.native
    open class WriteStream ()
      extends typings.fileSystemCache.libCommonLibsMod.fs.WriteStream {
      def this(opts: WritableOptions) = this()
    }
    
    @JSImport("file-system-cache/lib/common", "fs.access")
    @js.native
    val access: (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.access.__promisify__ */ Any) & Typeofaccess = js.native
    
    inline def accessSync(path: PathLike): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("accessSync")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def accessSync(path: PathLike, mode: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("accessSync")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("file-system-cache/lib/common", "fs.appendFile")
    @js.native
    val appendFile: (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.appendFile.__promisify__ */ Any) & TypeofappendFile = js.native
    
    inline def appendFileSync(path: PathOrFileDescriptor, data: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFileSync")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def appendFileSync(path: PathOrFileDescriptor, data: String, options: WriteFileOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFileSync")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def appendFileSync(path: PathOrFileDescriptor, data: js.typedarray.Uint8Array): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFileSync")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def appendFileSync(path: PathOrFileDescriptor, data: js.typedarray.Uint8Array, options: WriteFileOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFileSync")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("file-system-cache/lib/common", "fs.chmod")
    @js.native
    val chmod: (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.chmod.__promisify__ */ Any) & Typeofchmod = js.native
    
    inline def chmodSync(path: PathLike, mode: Mode): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("chmodSync")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("file-system-cache/lib/common", "fs.chown")
    @js.native
    val chown: (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.chown.__promisify__ */ Any) & Typeofchown = js.native
    
    inline def chownSync(path: PathLike, uid: Double, gid: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("chownSync")(path.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("file-system-cache/lib/common", "fs.close")
    @js.native
    val close: (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.close.__promisify__ */ Any) & Typeofclose = js.native
    
    inline def closeSync(fd: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("closeSync")(fd.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    object constants {
      
      // File Copy Constants
      /** Constant for fs.copyFile. Flag indicating the destination file should not be overwritten if it already exists. */
      @JSImport("file-system-cache/lib/common", "fs.constants.COPYFILE_EXCL")
      @js.native
      val COPYFILE_EXCL: Double = js.native
      
      /**
        * Constant for fs.copyFile. copy operation will attempt to create a copy-on-write reflink.
        * If the underlying platform does not support copy-on-write, then a fallback copy mechanism is used.
        */
      @JSImport("file-system-cache/lib/common", "fs.constants.COPYFILE_FICLONE")
      @js.native
      val COPYFILE_FICLONE: Double = js.native
      
      /**
        * Constant for fs.copyFile. Copy operation will attempt to create a copy-on-write reflink.
        * If the underlying platform does not support copy-on-write, then the operation will fail with an error.
        */
      @JSImport("file-system-cache/lib/common", "fs.constants.COPYFILE_FICLONE_FORCE")
      @js.native
      val COPYFILE_FICLONE_FORCE: Double = js.native
      
      // File Access Constants
      /** Constant for fs.access(). File is visible to the calling process. */
      @JSImport("file-system-cache/lib/common", "fs.constants.F_OK")
      @js.native
      val F_OK: Double = js.native
      
      /** Constant for fs.open(). Flag indicating that data will be appended to the end of the file. */
      @JSImport("file-system-cache/lib/common", "fs.constants.O_APPEND")
      @js.native
      val O_APPEND: Double = js.native
      
      /** Constant for fs.open(). Flag indicating to create the file if it does not already exist. */
      @JSImport("file-system-cache/lib/common", "fs.constants.O_CREAT")
      @js.native
      val O_CREAT: Double = js.native
      
      /** Constant for fs.open(). When set, an attempt will be made to minimize caching effects of file I/O. */
      @JSImport("file-system-cache/lib/common", "fs.constants.O_DIRECT")
      @js.native
      val O_DIRECT: Double = js.native
      
      /** Constant for fs.open(). Flag indicating that the open should fail if the path is not a directory. */
      @JSImport("file-system-cache/lib/common", "fs.constants.O_DIRECTORY")
      @js.native
      val O_DIRECTORY: Double = js.native
      
      /** Constant for fs.open(). Flag indicating that the file is opened for synchronous I/O with write operations waiting for data integrity. */
      @JSImport("file-system-cache/lib/common", "fs.constants.O_DSYNC")
      @js.native
      val O_DSYNC: Double = js.native
      
      /** Constant for fs.open(). Flag indicating that opening a file should fail if the O_CREAT flag is set and the file already exists. */
      @JSImport("file-system-cache/lib/common", "fs.constants.O_EXCL")
      @js.native
      val O_EXCL: Double = js.native
      
      /**
        * constant for fs.open().
        * Flag indicating reading accesses to the file system will no longer result in
        * an update to the atime information associated with the file.
        * This flag is available on Linux operating systems only.
        */
      @JSImport("file-system-cache/lib/common", "fs.constants.O_NOATIME")
      @js.native
      val O_NOATIME: Double = js.native
      
      /**
        * Constant for fs.open(). Flag indicating that if path identifies a terminal device,
        * opening the path shall not cause that terminal to become the controlling terminal for the process
        * (if the process does not already have one).
        */
      @JSImport("file-system-cache/lib/common", "fs.constants.O_NOCTTY")
      @js.native
      val O_NOCTTY: Double = js.native
      
      /** Constant for fs.open(). Flag indicating that the open should fail if the path is a symbolic link. */
      @JSImport("file-system-cache/lib/common", "fs.constants.O_NOFOLLOW")
      @js.native
      val O_NOFOLLOW: Double = js.native
      
      /** Constant for fs.open(). Flag indicating to open the file in nonblocking mode when possible. */
      @JSImport("file-system-cache/lib/common", "fs.constants.O_NONBLOCK")
      @js.native
      val O_NONBLOCK: Double = js.native
      
      // File Open Constants
      /** Constant for fs.open(). Flag indicating to open a file for read-only access. */
      @JSImport("file-system-cache/lib/common", "fs.constants.O_RDONLY")
      @js.native
      val O_RDONLY: Double = js.native
      
      /** Constant for fs.open(). Flag indicating to open a file for read-write access. */
      @JSImport("file-system-cache/lib/common", "fs.constants.O_RDWR")
      @js.native
      val O_RDWR: Double = js.native
      
      /** Constant for fs.open(). Flag indicating to open the symbolic link itself rather than the resource it is pointing to. */
      @JSImport("file-system-cache/lib/common", "fs.constants.O_SYMLINK")
      @js.native
      val O_SYMLINK: Double = js.native
      
      /** Constant for fs.open(). Flag indicating that the file is opened for synchronous I/O. */
      @JSImport("file-system-cache/lib/common", "fs.constants.O_SYNC")
      @js.native
      val O_SYNC: Double = js.native
      
      /** Constant for fs.open(). Flag indicating that if the file exists and is a regular file, and the file is opened successfully for write access, its length shall be truncated to zero. */
      @JSImport("file-system-cache/lib/common", "fs.constants.O_TRUNC")
      @js.native
      val O_TRUNC: Double = js.native
      
      /** Constant for fs.open(). Flag indicating to open a file for write-only access. */
      @JSImport("file-system-cache/lib/common", "fs.constants.O_WRONLY")
      @js.native
      val O_WRONLY: Double = js.native
      
      /** Constant for fs.access(). File can be read by the calling process. */
      @JSImport("file-system-cache/lib/common", "fs.constants.R_OK")
      @js.native
      val R_OK: Double = js.native
      
      /** Constant for fs.Stats mode property for determining a file's type. File type constant for a block-oriented device file. */
      @JSImport("file-system-cache/lib/common", "fs.constants.S_IFBLK")
      @js.native
      val S_IFBLK: Double = js.native
      
      /** Constant for fs.Stats mode property for determining a file's type. File type constant for a character-oriented device file. */
      @JSImport("file-system-cache/lib/common", "fs.constants.S_IFCHR")
      @js.native
      val S_IFCHR: Double = js.native
      
      /** Constant for fs.Stats mode property for determining a file's type. File type constant for a directory. */
      @JSImport("file-system-cache/lib/common", "fs.constants.S_IFDIR")
      @js.native
      val S_IFDIR: Double = js.native
      
      /** Constant for fs.Stats mode property for determining a file's type. File type constant for a FIFO/pipe. */
      @JSImport("file-system-cache/lib/common", "fs.constants.S_IFIFO")
      @js.native
      val S_IFIFO: Double = js.native
      
      /** Constant for fs.Stats mode property for determining a file's type. File type constant for a symbolic link. */
      @JSImport("file-system-cache/lib/common", "fs.constants.S_IFLNK")
      @js.native
      val S_IFLNK: Double = js.native
      
      // File Type Constants
      /** Constant for fs.Stats mode property for determining a file's type. Bit mask used to extract the file type code. */
      @JSImport("file-system-cache/lib/common", "fs.constants.S_IFMT")
      @js.native
      val S_IFMT: Double = js.native
      
      /** Constant for fs.Stats mode property for determining a file's type. File type constant for a regular file. */
      @JSImport("file-system-cache/lib/common", "fs.constants.S_IFREG")
      @js.native
      val S_IFREG: Double = js.native
      
      /** Constant for fs.Stats mode property for determining a file's type. File type constant for a socket. */
      @JSImport("file-system-cache/lib/common", "fs.constants.S_IFSOCK")
      @js.native
      val S_IFSOCK: Double = js.native
      
      /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable by group. */
      @JSImport("file-system-cache/lib/common", "fs.constants.S_IRGRP")
      @js.native
      val S_IRGRP: Double = js.native
      
      /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable by others. */
      @JSImport("file-system-cache/lib/common", "fs.constants.S_IROTH")
      @js.native
      val S_IROTH: Double = js.native
      
      /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable by owner. */
      @JSImport("file-system-cache/lib/common", "fs.constants.S_IRUSR")
      @js.native
      val S_IRUSR: Double = js.native
      
      /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable, writable and executable by group. */
      @JSImport("file-system-cache/lib/common", "fs.constants.S_IRWXG")
      @js.native
      val S_IRWXG: Double = js.native
      
      /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable, writable and executable by others. */
      @JSImport("file-system-cache/lib/common", "fs.constants.S_IRWXO")
      @js.native
      val S_IRWXO: Double = js.native
      
      // File Mode Constants
      /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable, writable and executable by owner. */
      @JSImport("file-system-cache/lib/common", "fs.constants.S_IRWXU")
      @js.native
      val S_IRWXU: Double = js.native
      
      /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating writable by group. */
      @JSImport("file-system-cache/lib/common", "fs.constants.S_IWGRP")
      @js.native
      val S_IWGRP: Double = js.native
      
      /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating writable by others. */
      @JSImport("file-system-cache/lib/common", "fs.constants.S_IWOTH")
      @js.native
      val S_IWOTH: Double = js.native
      
      /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating writable by owner. */
      @JSImport("file-system-cache/lib/common", "fs.constants.S_IWUSR")
      @js.native
      val S_IWUSR: Double = js.native
      
      /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating executable by group. */
      @JSImport("file-system-cache/lib/common", "fs.constants.S_IXGRP")
      @js.native
      val S_IXGRP: Double = js.native
      
      /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating executable by others. */
      @JSImport("file-system-cache/lib/common", "fs.constants.S_IXOTH")
      @js.native
      val S_IXOTH: Double = js.native
      
      /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating executable by owner. */
      @JSImport("file-system-cache/lib/common", "fs.constants.S_IXUSR")
      @js.native
      val S_IXUSR: Double = js.native
      
      /**
        * When set, a memory file mapping is used to access the file. This flag
        * is available on Windows operating systems only. On other operating systems,
        * this flag is ignored.
        */
      @JSImport("file-system-cache/lib/common", "fs.constants.UV_FS_O_FILEMAP")
      @js.native
      val UV_FS_O_FILEMAP: Double = js.native
      
      /** Constant for fs.access(). File can be written by the calling process. */
      @JSImport("file-system-cache/lib/common", "fs.constants.W_OK")
      @js.native
      val W_OK: Double = js.native
      
      /** Constant for fs.access(). File can be executed by the calling process. */
      @JSImport("file-system-cache/lib/common", "fs.constants.X_OK")
      @js.native
      val X_OK: Double = js.native
    }
    
    inline def copy(src: String, dest: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def copy(src: String, dest: String, callback: NoParamCallbackWithUndefined): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def copy(src: String, dest: String, options: CopyOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def copy(src: String, dest: String, options: CopyOptions, callback: NoParamCallbackWithUndefined): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("file-system-cache/lib/common", "fs.copyFile")
    @js.native
    val copyFile: (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.copyFile.__promisify__ */ Any) & TypeofcopyFile = js.native
    
    inline def copyFileSync(src: PathLike, dest: PathLike): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("copyFileSync")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def copyFileSync(src: PathLike, dest: PathLike, mode: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("copyFileSync")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def copySync(src: String, dest: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("copySync")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def copySync(src: String, dest: String, options: CopyOptionsSync): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("copySync")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def cp(source: String, destination: String, callback: js.Function1[/* err */ ErrnoException | Null, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cp")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def cp(
      source: String,
      destination: String,
      opts: typings.node.fsMod.CopyOptions,
      callback: js.Function1[/* err */ ErrnoException | Null, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cp")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def cp(source: String, destination: URL, callback: js.Function1[/* err */ ErrnoException | Null, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cp")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def cp(
      source: String,
      destination: URL,
      opts: typings.node.fsMod.CopyOptions,
      callback: js.Function1[/* err */ ErrnoException | Null, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cp")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def cp(source: URL, destination: String, callback: js.Function1[/* err */ ErrnoException | Null, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cp")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def cp(
      source: URL,
      destination: String,
      opts: typings.node.fsMod.CopyOptions,
      callback: js.Function1[/* err */ ErrnoException | Null, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cp")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def cp(source: URL, destination: URL, callback: js.Function1[/* err */ ErrnoException | Null, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cp")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def cp(
      source: URL,
      destination: URL,
      opts: typings.node.fsMod.CopyOptions,
      callback: js.Function1[/* err */ ErrnoException | Null, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cp")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def cpSync(source: String, destination: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cpSync")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def cpSync(source: String, destination: String, opts: CopySyncOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cpSync")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def cpSync(source: String, destination: URL): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cpSync")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def cpSync(source: String, destination: URL, opts: CopySyncOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cpSync")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def cpSync(source: URL, destination: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cpSync")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def cpSync(source: URL, destination: String, opts: CopySyncOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cpSync")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def cpSync(source: URL, destination: URL): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cpSync")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def cpSync(source: URL, destination: URL, opts: CopySyncOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cpSync")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def createFile(file: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFile")(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    inline def createFile(file: String, callback: NoParamCallbackWithUndefined): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createFile")(file.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("file-system-cache/lib/common", "fs.createFileSync")
    @js.native
    val createFileSync: js.Function1[/* file */ String, Unit] = js.native
    
    inline def createLink(src: String, dest: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("createLink")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def createLink(src: String, dest: String, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createLink")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("file-system-cache/lib/common", "fs.createLinkSync")
    @js.native
    val createLinkSync: js.Function2[/* src */ String, /* dest */ String, Unit] = js.native
    
    inline def createReadStream(path: PathLike): typings.node.fsMod.ReadStream = ^.asInstanceOf[js.Dynamic].applyDynamic("createReadStream")(path.asInstanceOf[js.Any]).asInstanceOf[typings.node.fsMod.ReadStream]
    inline def createReadStream(path: PathLike, options: BufferEncoding): typings.node.fsMod.ReadStream = (^.asInstanceOf[js.Dynamic].applyDynamic("createReadStream")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.fsMod.ReadStream]
    inline def createReadStream(path: PathLike, options: ReadStreamOptions): typings.node.fsMod.ReadStream = (^.asInstanceOf[js.Dynamic].applyDynamic("createReadStream")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.fsMod.ReadStream]
    
    inline def createSymlink(src: String, dest: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSymlink")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def createSymlink(src: String, dest: String, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createSymlink")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def createSymlink(src: String, dest: String, `type`: SymlinkType): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSymlink")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def createSymlink(src: String, dest: String, `type`: SymlinkType, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createSymlink")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("file-system-cache/lib/common", "fs.createSymlinkSync")
    @js.native
    val createSymlinkSync: js.Function3[/* src */ String, /* dest */ String, /* type */ js.UndefOr[SymlinkType], Unit] = js.native
    
    inline def createWriteStream(path: PathLike): typings.node.fsMod.WriteStream = ^.asInstanceOf[js.Dynamic].applyDynamic("createWriteStream")(path.asInstanceOf[js.Any]).asInstanceOf[typings.node.fsMod.WriteStream]
    inline def createWriteStream(path: PathLike, options: BufferEncoding): typings.node.fsMod.WriteStream = (^.asInstanceOf[js.Dynamic].applyDynamic("createWriteStream")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.fsMod.WriteStream]
    inline def createWriteStream(path: PathLike, options: StreamOptions): typings.node.fsMod.WriteStream = (^.asInstanceOf[js.Dynamic].applyDynamic("createWriteStream")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.fsMod.WriteStream]
    
    inline def emptyDirSync_(path: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("emptyDirSync")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def emptyDir_(path: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("emptyDir")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    inline def emptyDir_(path: String, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("emptyDir")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def emptydir(path: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("emptydir")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    inline def emptydir(path: String, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("emptydir")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("file-system-cache/lib/common", "fs.emptydirSync")
    @js.native
    val emptydirSync: js.Function1[/* path */ String, Unit] = js.native
    
    inline def ensureDir(path: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureDir")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    inline def ensureDir(path: String, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureDir")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def ensureDir(path: String, options: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureDir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def ensureDir(path: String, options: Double, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureDir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def ensureDir(path: String, options: EnsureDirOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureDir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def ensureDir(path: String, options: EnsureDirOptions, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureDir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def ensureDirSync(path: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureDirSync")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def ensureDirSync(path: String, options: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureDirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def ensureDirSync(path: String, options: EnsureDirOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureDirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def ensureFile(file: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureFile")(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    inline def ensureFile(file: String, callback: NoParamCallbackWithUndefined): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureFile")(file.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def ensureFileSync(file: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureFileSync")(file.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def ensureLink(src: String, dest: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureLink")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def ensureLink(src: String, dest: String, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureLink")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def ensureLinkSync(src: String, dest: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureLinkSync")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def ensureSymlink(src: String, dest: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureSymlink")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def ensureSymlink(src: String, dest: String, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureSymlink")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def ensureSymlink(src: String, dest: String, `type`: SymlinkType): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureSymlink")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def ensureSymlink(src: String, dest: String, `type`: SymlinkType, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureSymlink")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def ensureSymlinkSync(src: String, dest: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureSymlinkSync")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def ensureSymlinkSync(src: String, dest: String, `type`: SymlinkType): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureSymlinkSync")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("file-system-cache/lib/common", "fs.exists")
    @js.native
    val exists: (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.exists.__promisify__ */ Any) & Typeofexists = js.native
    
    inline def existsSync(path: PathLike): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("existsSync")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @JSImport("file-system-cache/lib/common", "fs.fchmod")
    @js.native
    val fchmod: (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.fchmod.__promisify__ */ Any) & Typeoffchmod = js.native
    
    inline def fchmodSync(fd: Double, mode: Mode): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fchmodSync")(fd.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("file-system-cache/lib/common", "fs.fchown")
    @js.native
    val fchown: (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.fchown.__promisify__ */ Any) & Typeoffchown = js.native
    
    inline def fchownSync(fd: Double, uid: Double, gid: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fchownSync")(fd.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("file-system-cache/lib/common", "fs.fdatasync")
    @js.native
    val fdatasync: (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.fdatasync.__promisify__ */ Any) & Typeoffdatasync = js.native
    
    inline def fdatasyncSync(fd: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fdatasyncSync")(fd.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSImport("file-system-cache/lib/common", "fs.fstat")
    @js.native
    val fstat: (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.fstat.__promisify__ */ Any) & Typeoffstat = js.native
    
    inline def fstatSync(fd: Double): typings.node.fsMod.Stats | BigIntStats = ^.asInstanceOf[js.Dynamic].applyDynamic("fstatSync")(fd.asInstanceOf[js.Any]).asInstanceOf[typings.node.fsMod.Stats | BigIntStats]
    inline def fstatSync(fd: Double, options: StatOptionsbigintfalseund): typings.node.fsMod.Stats = (^.asInstanceOf[js.Dynamic].applyDynamic("fstatSync")(fd.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.fsMod.Stats]
    inline def fstatSync(fd: Double, options: StatOptionsbiginttrue): BigIntStats = (^.asInstanceOf[js.Dynamic].applyDynamic("fstatSync")(fd.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[BigIntStats]
    inline def fstatSync(fd: Double, options: StatOptions): typings.node.fsMod.Stats | BigIntStats = (^.asInstanceOf[js.Dynamic].applyDynamic("fstatSync")(fd.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.fsMod.Stats | BigIntStats]
    
    inline def fstatSync_Stats(fd: Double): typings.node.fsMod.Stats = ^.asInstanceOf[js.Dynamic].applyDynamic("fstatSync")(fd.asInstanceOf[js.Any]).asInstanceOf[typings.node.fsMod.Stats]
    
    @JSImport("file-system-cache/lib/common", "fs.fsync")
    @js.native
    val fsync: (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.fsync.__promisify__ */ Any) & Typeoffsync = js.native
    
    inline def fsyncSync(fd: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fsyncSync")(fd.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSImport("file-system-cache/lib/common", "fs.ftruncate")
    @js.native
    val ftruncate: (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.ftruncate.__promisify__ */ Any) & Typeofftruncate = js.native
    
    inline def ftruncateSync(fd: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ftruncateSync")(fd.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def ftruncateSync(fd: Double, len: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ftruncateSync")(fd.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("file-system-cache/lib/common", "fs.futimes")
    @js.native
    val futimes: (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.futimes.__promisify__ */ Any) & Typeoffutimes = js.native
    
    inline def futimesSync(fd: Double, atime: TimeLike, mtime: TimeLike): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("futimesSync")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("file-system-cache/lib/common", "fs.lchmod")
    @js.native
    val lchmod: (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.lchmod.__promisify__ */ Any) & Typeoflchmod = js.native
    
    inline def lchmodSync(path: PathLike, mode: Mode): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lchmodSync")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("file-system-cache/lib/common", "fs.lchown")
    @js.native
    val lchown: (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.lchown.__promisify__ */ Any) & Typeoflchown = js.native
    
    inline def lchownSync(path: PathLike, uid: Double, gid: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lchownSync")(path.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("file-system-cache/lib/common", "fs.link")
    @js.native
    val link: (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.link.__promisify__ */ Any) & Typeoflink = js.native
    
    inline def linkSync(existingPath: PathLike, newPath: PathLike): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("linkSync")(existingPath.asInstanceOf[js.Any], newPath.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("file-system-cache/lib/common", "fs.lstat")
    @js.native
    val lstat: (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.lstat.__promisify__ */ Any) & Typeoflstat = js.native
    
    @JSImport("file-system-cache/lib/common", "fs.lstatSync")
    @js.native
    val lstatSync: StatSyncFn = js.native
    
    inline def lutimes(path: PathLike, atime: TimeLike, mtime: TimeLike, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def lutimesSync(path: PathLike, atime: TimeLike, mtime: TimeLike): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lutimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("file-system-cache/lib/common", "fs.mkdir")
    @js.native
    val mkdir: (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.mkdir.__promisify__ */ Any) & Typeofmkdir = js.native
    
    inline def mkdirSync(path: PathLike): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")(path.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
    inline def mkdirSync(path: PathLike, options: MakeDirectoryOptionsrecur): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
    inline def mkdirSync(path: PathLike, options: MakeDirectoryOptionsrecurMode): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mkdirSync(path: PathLike, options: MakeDirectoryOptions): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
    inline def mkdirSync(path: PathLike, options: Mode): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
    
    inline def mkdirSync_Unit(path: PathLike): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def mkdirSync_Unit(path: PathLike, options: Mode): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def mkdirp(path: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdirp")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    inline def mkdirp(path: String, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdirp")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mkdirp(path: String, options: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdirp")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def mkdirp(path: String, options: Double, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdirp")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mkdirp(path: String, options: EnsureDirOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdirp")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def mkdirp(path: String, options: EnsureDirOptions, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdirp")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("file-system-cache/lib/common", "fs.mkdirpSync")
    @js.native
    val mkdirpSync: js.Function2[/* path */ String, /* options */ js.UndefOr[EnsureDirOptions | Double], Unit] = js.native
    
    inline def mkdirs(path: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdirs")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    inline def mkdirs(path: String, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdirs")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mkdirs(path: String, options: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdirs")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def mkdirs(path: String, options: Double, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdirs")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mkdirs(path: String, options: EnsureDirOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdirs")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def mkdirs(path: String, options: EnsureDirOptions, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdirs")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("file-system-cache/lib/common", "fs.mkdirsSync")
    @js.native
    val mkdirsSync: js.Function2[/* path */ String, /* options */ js.UndefOr[EnsureDirOptions | Double], Unit] = js.native
    
    @JSImport("file-system-cache/lib/common", "fs.mkdtemp")
    @js.native
    val mkdtemp: (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.mkdtemp.__promisify__ */ Any) & Typeofmkdtemp = js.native
    
    inline def mkdtempSync(prefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdtempSync")(prefix.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def mkdtempSync(prefix: String, options: BufferEncodingOption): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdtempSync")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    inline def mkdtempSync(prefix: String, options: EncodingOption): String = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdtempSync")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def mkdtempSync_Union(prefix: String): String | Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdtempSync")(prefix.asInstanceOf[js.Any]).asInstanceOf[String | Buffer]
    inline def mkdtempSync_Union(prefix: String, options: EncodingOption): String | Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdtempSync")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | Buffer]
    
    inline def move(src: String, dest: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("move")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def move(src: String, dest: String, callback: NoParamCallbackWithUndefined): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("move")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def move(src: String, dest: String, options: MoveOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("move")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def move(src: String, dest: String, options: MoveOptions, callback: NoParamCallbackWithUndefined): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("move")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def moveSync(src: String, dest: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("moveSync")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def moveSync(src: String, dest: String, options: MoveOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("moveSync")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("file-system-cache/lib/common", "fs.open")
    @js.native
    val open: (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.open.__promisify__ */ Any) & Typeofopen = js.native
    
    inline def openSync(path: PathLike, flags: OpenMode): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("openSync")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def openSync(path: PathLike, flags: OpenMode, mode: Mode): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("openSync")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @JSImport("file-system-cache/lib/common", "fs.opendir")
    @js.native
    val opendir: (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.opendir.__promisify__ */ Any) & Typeofopendir = js.native
    
    inline def opendirSync(path: PathLike): typings.node.fsMod.Dir = ^.asInstanceOf[js.Dynamic].applyDynamic("opendirSync")(path.asInstanceOf[js.Any]).asInstanceOf[typings.node.fsMod.Dir]
    inline def opendirSync(path: PathLike, options: OpenDirOptions): typings.node.fsMod.Dir = (^.asInstanceOf[js.Dynamic].applyDynamic("opendirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.fsMod.Dir]
    
    inline def outputFile(file: String, data: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("outputFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def outputFile(file: String, data: String, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("outputFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def outputFile(file: String, data: String, options: WriteFileOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("outputFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def outputFile(file: String, data: String, options: WriteFileOptions, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("outputFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def outputFile(file: String, data: ArrayBufferView): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("outputFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def outputFile(file: String, data: ArrayBufferView, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("outputFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def outputFile(file: String, data: ArrayBufferView, options: WriteFileOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("outputFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def outputFile(file: String, data: ArrayBufferView, options: WriteFileOptions, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("outputFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def outputFileSync(file: String, data: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("outputFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def outputFileSync(file: String, data: String, options: WriteFileOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("outputFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def outputFileSync(file: String, data: ArrayBufferView): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("outputFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def outputFileSync(file: String, data: ArrayBufferView, options: WriteFileOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("outputFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("file-system-cache/lib/common", "fs.outputJSONSync")
    @js.native
    val outputJSONSync_ : js.Function3[/* file */ String, /* data */ Any, /* options */ js.UndefOr[JsonOutputOptions], Unit] = js.native
    
    inline def outputJSON_(file: String, data: Any): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("outputJSON")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def outputJSON_(file: String, data: Any, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("outputJSON")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def outputJSON_(file: String, data: Any, options: JsonOutputOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("outputJSON")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def outputJSON_(file: String, data: Any, options: JsonOutputOptions, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("outputJSON")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def outputJson(file: String, data: Any): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("outputJson")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def outputJson(file: String, data: Any, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("outputJson")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def outputJson(file: String, data: Any, options: JsonOutputOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("outputJson")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def outputJson(file: String, data: Any, options: JsonOutputOptions, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("outputJson")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def outputJsonSync(file: String, data: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("outputJsonSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def outputJsonSync(file: String, data: Any, options: JsonOutputOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("outputJsonSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def pathExists(path: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("pathExists")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
    inline def pathExists(path: String, callback: js.Function2[/* err */ ErrnoException | Null, /* exists */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pathExists")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def pathExistsSync(path: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("pathExistsSync")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    object promises {
      
      @JSImport("file-system-cache/lib/common", "fs.promises")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Tests a user's permissions for the file or directory specified by `path`.
        * The `mode` argument is an optional integer that specifies the accessibility
        * checks to be performed. `mode` should be either the value `fs.constants.F_OK`or a mask consisting of the bitwise OR of any of `fs.constants.R_OK`,`fs.constants.W_OK`, and `fs.constants.X_OK`
        * (e.g.`fs.constants.W_OK | fs.constants.R_OK`). Check `File access constants` for
        * possible values of `mode`.
        *
        * If the accessibility check is successful, the promise is resolved with no
        * value. If any of the accessibility checks fail, the promise is rejected
        * with an [Error](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Error) object. The following example checks if the file`/etc/passwd` can be read and
        * written by the current process.
        *
        * ```js
        * import { access, constants } from 'node:fs/promises';
        *
        * try {
        *   await access('/etc/passwd', constants.R_OK | constants.W_OK);
        *   console.log('can access');
        * } catch {
        *   console.error('cannot access');
        * }
        * ```
        *
        * Using `fsPromises.access()` to check for the accessibility of a file before
        * calling `fsPromises.open()` is not recommended. Doing so introduces a race
        * condition, since other processes may change the file's state between the two
        * calls. Instead, user code should open/read/write the file directly and handle
        * the error raised if the file is not accessible.
        * @since v10.0.0
        * @param [mode=fs.constants.F_OK]
        * @return Fulfills with `undefined` upon success.
        */
      inline def access(path: PathLike): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("access")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
      inline def access(path: PathLike, mode: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("access")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
      
      /**
        * Asynchronously append data to a file, creating the file if it does not yet
        * exist. `data` can be a string or a `Buffer`.
        *
        * If `options` is a string, then it specifies the `encoding`.
        *
        * The `mode` option only affects the newly created file. See `fs.open()` for more details.
        *
        * The `path` may be specified as a `FileHandle` that has been opened
        * for appending (using `fsPromises.open()`).
        * @since v10.0.0
        * @param path filename or {FileHandle}
        * @return Fulfills with `undefined` upon success.
        */
      inline def appendFile(path: PathLike, data: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
      inline def appendFile(path: PathLike, data: String, options: ObjectEncodingOptions & FlagAndOpenMode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
      inline def appendFile(path: PathLike, data: String, options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
      inline def appendFile(path: PathLike, data: js.typedarray.Uint8Array): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
      inline def appendFile(path: PathLike, data: js.typedarray.Uint8Array, options: ObjectEncodingOptions & FlagAndOpenMode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
      inline def appendFile(path: PathLike, data: js.typedarray.Uint8Array, options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
      inline def appendFile(path: FileHandle, data: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
      inline def appendFile(path: FileHandle, data: String, options: ObjectEncodingOptions & FlagAndOpenMode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
      inline def appendFile(path: FileHandle, data: String, options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
      inline def appendFile(path: FileHandle, data: js.typedarray.Uint8Array): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
      inline def appendFile(path: FileHandle, data: js.typedarray.Uint8Array, options: ObjectEncodingOptions & FlagAndOpenMode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
      inline def appendFile(path: FileHandle, data: js.typedarray.Uint8Array, options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
      
      /**
        * Changes the permissions of a file.
        * @since v10.0.0
        * @return Fulfills with `undefined` upon success.
        */
      inline def chmod(path: PathLike, mode: Mode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("chmod")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
      
      /**
        * Changes the ownership of a file.
        * @since v10.0.0
        * @return Fulfills with `undefined` upon success.
        */
      inline def chown(path: PathLike, uid: Double, gid: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("chown")(path.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
      
      /* was `typeof fsConstants` */
      object constants {
        
        // File Copy Constants
        /** Constant for fs.copyFile. Flag indicating the destination file should not be overwritten if it already exists. */
        @JSImport("file-system-cache/lib/common", "fs.promises.constants.COPYFILE_EXCL")
        @js.native
        val COPYFILE_EXCL: Double = js.native
        
        /**
          * Constant for fs.copyFile. copy operation will attempt to create a copy-on-write reflink.
          * If the underlying platform does not support copy-on-write, then a fallback copy mechanism is used.
          */
        @JSImport("file-system-cache/lib/common", "fs.promises.constants.COPYFILE_FICLONE")
        @js.native
        val COPYFILE_FICLONE: Double = js.native
        
        /**
          * Constant for fs.copyFile. Copy operation will attempt to create a copy-on-write reflink.
          * If the underlying platform does not support copy-on-write, then the operation will fail with an error.
          */
        @JSImport("file-system-cache/lib/common", "fs.promises.constants.COPYFILE_FICLONE_FORCE")
        @js.native
        val COPYFILE_FICLONE_FORCE: Double = js.native
        
        // File Access Constants
        /** Constant for fs.access(). File is visible to the calling process. */
        @JSImport("file-system-cache/lib/common", "fs.promises.constants.F_OK")
        @js.native
        val F_OK: Double = js.native
        
        /** Constant for fs.open(). Flag indicating that data will be appended to the end of the file. */
        @JSImport("file-system-cache/lib/common", "fs.promises.constants.O_APPEND")
        @js.native
        val O_APPEND: Double = js.native
        
        /** Constant for fs.open(). Flag indicating to create the file if it does not already exist. */
        @JSImport("file-system-cache/lib/common", "fs.promises.constants.O_CREAT")
        @js.native
        val O_CREAT: Double = js.native
        
        /** Constant for fs.open(). When set, an attempt will be made to minimize caching effects of file I/O. */
        @JSImport("file-system-cache/lib/common", "fs.promises.constants.O_DIRECT")
        @js.native
        val O_DIRECT: Double = js.native
        
        /** Constant for fs.open(). Flag indicating that the open should fail if the path is not a directory. */
        @JSImport("file-system-cache/lib/common", "fs.promises.constants.O_DIRECTORY")
        @js.native
        val O_DIRECTORY: Double = js.native
        
        /** Constant for fs.open(). Flag indicating that the file is opened for synchronous I/O with write operations waiting for data integrity. */
        @JSImport("file-system-cache/lib/common", "fs.promises.constants.O_DSYNC")
        @js.native
        val O_DSYNC: Double = js.native
        
        /** Constant for fs.open(). Flag indicating that opening a file should fail if the O_CREAT flag is set and the file already exists. */
        @JSImport("file-system-cache/lib/common", "fs.promises.constants.O_EXCL")
        @js.native
        val O_EXCL: Double = js.native
        
        /**
          * constant for fs.open().
          * Flag indicating reading accesses to the file system will no longer result in
          * an update to the atime information associated with the file.
          * This flag is available on Linux operating systems only.
          */
        @JSImport("file-system-cache/lib/common", "fs.promises.constants.O_NOATIME")
        @js.native
        val O_NOATIME: Double = js.native
        
        /**
          * Constant for fs.open(). Flag indicating that if path identifies a terminal device,
          * opening the path shall not cause that terminal to become the controlling terminal for the process
          * (if the process does not already have one).
          */
        @JSImport("file-system-cache/lib/common", "fs.promises.constants.O_NOCTTY")
        @js.native
        val O_NOCTTY: Double = js.native
        
        /** Constant for fs.open(). Flag indicating that the open should fail if the path is a symbolic link. */
        @JSImport("file-system-cache/lib/common", "fs.promises.constants.O_NOFOLLOW")
        @js.native
        val O_NOFOLLOW: Double = js.native
        
        /** Constant for fs.open(). Flag indicating to open the file in nonblocking mode when possible. */
        @JSImport("file-system-cache/lib/common", "fs.promises.constants.O_NONBLOCK")
        @js.native
        val O_NONBLOCK: Double = js.native
        
        // File Open Constants
        /** Constant for fs.open(). Flag indicating to open a file for read-only access. */
        @JSImport("file-system-cache/lib/common", "fs.promises.constants.O_RDONLY")
        @js.native
        val O_RDONLY: Double = js.native
        
        /** Constant for fs.open(). Flag indicating to open a file for read-write access. */
        @JSImport("file-system-cache/lib/common", "fs.promises.constants.O_RDWR")
        @js.native
        val O_RDWR: Double = js.native
        
        /** Constant for fs.open(). Flag indicating to open the symbolic link itself rather than the resource it is pointing to. */
        @JSImport("file-system-cache/lib/common", "fs.promises.constants.O_SYMLINK")
        @js.native
        val O_SYMLINK: Double = js.native
        
        /** Constant for fs.open(). Flag indicating that the file is opened for synchronous I/O. */
        @JSImport("file-system-cache/lib/common", "fs.promises.constants.O_SYNC")
        @js.native
        val O_SYNC: Double = js.native
        
        /** Constant for fs.open(). Flag indicating that if the file exists and is a regular file, and the file is opened successfully for write access, its length shall be truncated to zero. */
        @JSImport("file-system-cache/lib/common", "fs.promises.constants.O_TRUNC")
        @js.native
        val O_TRUNC: Double = js.native
        
        /** Constant for fs.open(). Flag indicating to open a file for write-only access. */
        @JSImport("file-system-cache/lib/common", "fs.promises.constants.O_WRONLY")
        @js.native
        val O_WRONLY: Double = js.native
        
        /** Constant for fs.access(). File can be read by the calling process. */
        @JSImport("file-system-cache/lib/common", "fs.promises.constants.R_OK")
        @js.native
        val R_OK: Double = js.native
        
        /** Constant for fs.Stats mode property for determining a file's type. File type constant for a block-oriented device file. */
        @JSImport("file-system-cache/lib/common", "fs.promises.constants.S_IFBLK")
        @js.native
        val S_IFBLK: Double = js.native
        
        /** Constant for fs.Stats mode property for determining a file's type. File type constant for a character-oriented device file. */
        @JSImport("file-system-cache/lib/common", "fs.promises.constants.S_IFCHR")
        @js.native
        val S_IFCHR: Double = js.native
        
        /** Constant for fs.Stats mode property for determining a file's type. File type constant for a directory. */
        @JSImport("file-system-cache/lib/common", "fs.promises.constants.S_IFDIR")
        @js.native
        val S_IFDIR: Double = js.native
        
        /** Constant for fs.Stats mode property for determining a file's type. File type constant for a FIFO/pipe. */
        @JSImport("file-system-cache/lib/common", "fs.promises.constants.S_IFIFO")
        @js.native
        val S_IFIFO: Double = js.native
        
        /** Constant for fs.Stats mode property for determining a file's type. File type constant for a symbolic link. */
        @JSImport("file-system-cache/lib/common", "fs.promises.constants.S_IFLNK")
        @js.native
        val S_IFLNK: Double = js.native
        
        // File Type Constants
        /** Constant for fs.Stats mode property for determining a file's type. Bit mask used to extract the file type code. */
        @JSImport("file-system-cache/lib/common", "fs.promises.constants.S_IFMT")
        @js.native
        val S_IFMT: Double = js.native
        
        /** Constant for fs.Stats mode property for determining a file's type. File type constant for a regular file. */
        @JSImport("file-system-cache/lib/common", "fs.promises.constants.S_IFREG")
        @js.native
        val S_IFREG: Double = js.native
        
        /** Constant for fs.Stats mode property for determining a file's type. File type constant for a socket. */
        @JSImport("file-system-cache/lib/common", "fs.promises.constants.S_IFSOCK")
        @js.native
        val S_IFSOCK: Double = js.native
        
        /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable by group. */
        @JSImport("file-system-cache/lib/common", "fs.promises.constants.S_IRGRP")
        @js.native
        val S_IRGRP: Double = js.native
        
        /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable by others. */
        @JSImport("file-system-cache/lib/common", "fs.promises.constants.S_IROTH")
        @js.native
        val S_IROTH: Double = js.native
        
        /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable by owner. */
        @JSImport("file-system-cache/lib/common", "fs.promises.constants.S_IRUSR")
        @js.native
        val S_IRUSR: Double = js.native
        
        /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable, writable and executable by group. */
        @JSImport("file-system-cache/lib/common", "fs.promises.constants.S_IRWXG")
        @js.native
        val S_IRWXG: Double = js.native
        
        /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable, writable and executable by others. */
        @JSImport("file-system-cache/lib/common", "fs.promises.constants.S_IRWXO")
        @js.native
        val S_IRWXO: Double = js.native
        
        // File Mode Constants
        /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable, writable and executable by owner. */
        @JSImport("file-system-cache/lib/common", "fs.promises.constants.S_IRWXU")
        @js.native
        val S_IRWXU: Double = js.native
        
        /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating writable by group. */
        @JSImport("file-system-cache/lib/common", "fs.promises.constants.S_IWGRP")
        @js.native
        val S_IWGRP: Double = js.native
        
        /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating writable by others. */
        @JSImport("file-system-cache/lib/common", "fs.promises.constants.S_IWOTH")
        @js.native
        val S_IWOTH: Double = js.native
        
        /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating writable by owner. */
        @JSImport("file-system-cache/lib/common", "fs.promises.constants.S_IWUSR")
        @js.native
        val S_IWUSR: Double = js.native
        
        /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating executable by group. */
        @JSImport("file-system-cache/lib/common", "fs.promises.constants.S_IXGRP")
        @js.native
        val S_IXGRP: Double = js.native
        
        /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating executable by others. */
        @JSImport("file-system-cache/lib/common", "fs.promises.constants.S_IXOTH")
        @js.native
        val S_IXOTH: Double = js.native
        
        /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating executable by owner. */
        @JSImport("file-system-cache/lib/common", "fs.promises.constants.S_IXUSR")
        @js.native
        val S_IXUSR: Double = js.native
        
        /**
          * When set, a memory file mapping is used to access the file. This flag
          * is available on Windows operating systems only. On other operating systems,
          * this flag is ignored.
          */
        @JSImport("file-system-cache/lib/common", "fs.promises.constants.UV_FS_O_FILEMAP")
        @js.native
        val UV_FS_O_FILEMAP: Double = js.native
        
        /** Constant for fs.access(). File can be written by the calling process. */
        @JSImport("file-system-cache/lib/common", "fs.promises.constants.W_OK")
        @js.native
        val W_OK: Double = js.native
        
        /** Constant for fs.access(). File can be executed by the calling process. */
        @JSImport("file-system-cache/lib/common", "fs.promises.constants.X_OK")
        @js.native
        val X_OK: Double = js.native
      }
      
      /**
        * Asynchronously copies `src` to `dest`. By default, `dest` is overwritten if it
        * already exists.
        *
        * No guarantees are made about the atomicity of the copy operation. If an
        * error occurs after the destination file has been opened for writing, an attempt
        * will be made to remove the destination.
        *
        * ```js
        * import { copyFile, constants } from 'node:fs/promises';
        *
        * try {
        *   await copyFile('source.txt', 'destination.txt');
        *   console.log('source.txt was copied to destination.txt');
        * } catch {
        *   console.error('The file could not be copied');
        * }
        *
        * // By using COPYFILE_EXCL, the operation will fail if destination.txt exists.
        * try {
        *   await copyFile('source.txt', 'destination.txt', constants.COPYFILE_EXCL);
        *   console.log('source.txt was copied to destination.txt');
        * } catch {
        *   console.error('The file could not be copied');
        * }
        * ```
        * @since v10.0.0
        * @param src source filename to copy
        * @param dest destination filename of the copy operation
        * @param [mode=0] Optional modifiers that specify the behavior of the copy operation. It is possible to create a mask consisting of the bitwise OR of two or more values (e.g.
        * `fs.constants.COPYFILE_EXCL | fs.constants.COPYFILE_FICLONE`)
        * @return Fulfills with `undefined` upon success.
        */
      inline def copyFile(src: PathLike, dest: PathLike): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyFile")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
      inline def copyFile(src: PathLike, dest: PathLike, mode: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyFile")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
      
      /**
        * Asynchronously copies the entire directory structure from `src` to `dest`,
        * including subdirectories and files.
        *
        * When copying a directory to another directory, globs are not supported and
        * behavior is similar to `cp dir1/ dir2/`.
        * @since v16.7.0
        * @experimental
        * @param src source path to copy.
        * @param dest destination path to copy to.
        * @return Fulfills with `undefined` upon success.
        */
      inline def cp(source: String, destination: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("cp")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
      inline def cp(source: String, destination: String, opts: typings.node.fsMod.CopyOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("cp")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
      inline def cp(source: String, destination: typings.std.URL): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("cp")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
      inline def cp(source: String, destination: typings.std.URL, opts: typings.node.fsMod.CopyOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("cp")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
      inline def cp(source: typings.std.URL, destination: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("cp")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
      inline def cp(source: typings.std.URL, destination: String, opts: typings.node.fsMod.CopyOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("cp")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
      inline def cp(source: typings.std.URL, destination: typings.std.URL): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("cp")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
      inline def cp(source: typings.std.URL, destination: typings.std.URL, opts: typings.node.fsMod.CopyOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("cp")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
      
      /**
        * Changes the permissions on a symbolic link.
        *
        * This method is only implemented on macOS.
        * @deprecated Since v10.0.0
        * @return Fulfills with `undefined` upon success.
        */
      inline def lchmod(path: PathLike, mode: Mode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("lchmod")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
      
      /**
        * Changes the ownership on a symbolic link.
        * @since v10.0.0
        * @return Fulfills with `undefined` upon success.
        */
      inline def lchown(path: PathLike, uid: Double, gid: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("lchown")(path.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
      
      /**
        * Creates a new link from the `existingPath` to the `newPath`. See the POSIX [`link(2)`](http://man7.org/linux/man-pages/man2/link.2.html) documentation for more detail.
        * @since v10.0.0
        * @return Fulfills with `undefined` upon success.
        */
      inline def link(existingPath: PathLike, newPath: PathLike): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("link")(existingPath.asInstanceOf[js.Any], newPath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
      
      /**
        * Equivalent to `fsPromises.stat()` unless `path` refers to a symbolic link,
        * in which case the link itself is stat-ed, not the file that it refers to.
        * Refer to the POSIX [`lstat(2)`](http://man7.org/linux/man-pages/man2/lstat.2.html) document for more detail.
        * @since v10.0.0
        * @return Fulfills with the {fs.Stats} object for the given symbolic link `path`.
        */
      inline def lstat(path: PathLike): js.Promise[typings.node.nodeColonfsMod.Stats] = ^.asInstanceOf[js.Dynamic].applyDynamic("lstat")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.node.nodeColonfsMod.Stats]]
      inline def lstat(path: PathLike, opts: StatOptionsbigintfalseund): js.Promise[typings.node.nodeColonfsMod.Stats] = (^.asInstanceOf[js.Dynamic].applyDynamic("lstat")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.node.nodeColonfsMod.Stats]]
      inline def lstat(path: PathLike, opts: StatOptionsbiginttrue): js.Promise[BigIntStats] = (^.asInstanceOf[js.Dynamic].applyDynamic("lstat")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BigIntStats]]
      inline def lstat(path: PathLike, opts: StatOptions): js.Promise[typings.node.nodeColonfsMod.Stats | BigIntStats] = (^.asInstanceOf[js.Dynamic].applyDynamic("lstat")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.node.nodeColonfsMod.Stats | BigIntStats]]
      
      /**
        * Changes the access and modification times of a file in the same way as `fsPromises.utimes()`, with the difference that if the path refers to a
        * symbolic link, then the link is not dereferenced: instead, the timestamps of
        * the symbolic link itself are changed.
        * @since v14.5.0, v12.19.0
        * @return Fulfills with `undefined` upon success.
        */
      inline def lutimes(path: PathLike, atime: TimeLike, mtime: TimeLike): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
      
      /**
        * Asynchronous mkdir(2) - create a directory.
        * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
        * @param options Either the file mode, or an object optionally specifying the file mode and whether parent folders
        * should be created. If a string is passed, it is parsed as an octal integer. If not specified, defaults to `0o777`.
        */
      inline def mkdir(path: PathLike): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
      /**
        * Asynchronously creates a directory.
        *
        * The optional `options` argument can be an integer specifying `mode` (permission
        * and sticky bits), or an object with a `mode` property and a `recursive`property indicating whether parent directories should be created. Calling`fsPromises.mkdir()` when `path` is a directory
        * that exists results in a
        * rejection only when `recursive` is false.
        *
        * ```js
        * import { mkdir } from 'node:fs/promises';
        *
        * try {
        *   const projectFolder = new URL('./test/project/', import.meta.url);
        *   const createDir = await mkdir(projectFolder, { recursive: true });
        *
        *   console.log(`created ${createDir}`);
        * } catch (err) {
        *   console.error(err.message);
        * }
        * ```
        * @since v10.0.0
        * @return Upon success, fulfills with `undefined` if `recursive` is `false`, or the first directory path created if `recursive` is `true`.
        */
      inline def mkdir(path: PathLike, options: MakeDirectoryOptionsrecur): js.Promise[js.UndefOr[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[String]]]
      inline def mkdir(path: PathLike, options: MakeDirectoryOptionsrecurMode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
      inline def mkdir(path: PathLike, options: MakeDirectoryOptions): js.Promise[js.UndefOr[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[String]]]
      inline def mkdir(path: PathLike, options: Mode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
      
      /**
        * Creates a unique temporary directory. A unique directory name is generated by
        * appending six random characters to the end of the provided `prefix`. Due to
        * platform inconsistencies, avoid trailing `X` characters in `prefix`. Some
        * platforms, notably the BSDs, can return more than six random characters, and
        * replace trailing `X` characters in `prefix` with random characters.
        *
        * The optional `options` argument can be a string specifying an encoding, or an
        * object with an `encoding` property specifying the character encoding to use.
        *
        * ```js
        * import { mkdtemp } from 'node:fs/promises';
        * import { join } from 'node:path';
        * import { tmpdir } from 'node:os';
        *
        * try {
        *   await mkdtemp(join(tmpdir(), 'foo-'));
        * } catch (err) {
        *   console.error(err);
        * }
        * ```
        *
        * The `fsPromises.mkdtemp()` method will append the six randomly selected
        * characters directly to the `prefix` string. For instance, given a directory`/tmp`, if the intention is to create a temporary directory _within_`/tmp`, the`prefix` must end with a trailing
        * platform-specific path separator
        * (`require('node:path').sep`).
        * @since v10.0.0
        * @return Fulfills with a string containing the file system path of the newly created temporary directory.
        */
      /**
        * Asynchronously creates a unique temporary directory.
        * Generates six random characters to be appended behind a required `prefix` to create a unique temporary directory.
        * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
        */
      inline def mkdtemp(prefix: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdtemp")(prefix.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
      inline def mkdtemp(prefix: String, options: BufferEncoding): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdtemp")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
      /**
        * Asynchronously creates a unique temporary directory.
        * Generates six random characters to be appended behind a required `prefix` to create a unique temporary directory.
        * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
        */
      inline def mkdtemp(prefix: String, options: BufferEncodingOption): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdtemp")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
      inline def mkdtemp(prefix: String, options: ObjectEncodingOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdtemp")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
      
      /**
        * Opens a `FileHandle`.
        *
        * Refer to the POSIX [`open(2)`](http://man7.org/linux/man-pages/man2/open.2.html) documentation for more detail.
        *
        * Some characters (`< > : " / \ | ? *`) are reserved under Windows as documented
        * by [Naming Files, Paths, and Namespaces](https://docs.microsoft.com/en-us/windows/desktop/FileIO/naming-a-file). Under NTFS, if the filename contains
        * a colon, Node.js will open a file system stream, as described by [this MSDN page](https://docs.microsoft.com/en-us/windows/desktop/FileIO/using-streams).
        * @since v10.0.0
        * @param [flags='r'] See `support of file system `flags``.
        * @param [mode=0o666] Sets the file mode (permission and sticky bits) if the file is created.
        * @return Fulfills with a {FileHandle} object.
        */
      inline def open(path: PathLike): js.Promise[FileHandle] = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[FileHandle]]
      inline def open(path: PathLike, flags: String): js.Promise[FileHandle] = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FileHandle]]
      inline def open(path: PathLike, flags: String, mode: Mode): js.Promise[FileHandle] = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FileHandle]]
      inline def open(path: PathLike, flags: Double): js.Promise[FileHandle] = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FileHandle]]
      inline def open(path: PathLike, flags: Double, mode: Mode): js.Promise[FileHandle] = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FileHandle]]
      inline def open(path: PathLike, flags: Unit, mode: Mode): js.Promise[FileHandle] = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FileHandle]]
      
      /**
        * Asynchronously open a directory for iterative scanning. See the POSIX [`opendir(3)`](http://man7.org/linux/man-pages/man3/opendir.3.html) documentation for more detail.
        *
        * Creates an `fs.Dir`, which contains all further functions for reading from
        * and cleaning up the directory.
        *
        * The `encoding` option sets the encoding for the `path` while opening the
        * directory and subsequent read operations.
        *
        * Example using async iteration:
        *
        * ```js
        * import { opendir } from 'node:fs/promises';
        *
        * try {
        *   const dir = await opendir('./');
        *   for await (const dirent of dir)
        *     console.log(dirent.name);
        * } catch (err) {
        *   console.error(err);
        * }
        * ```
        *
        * When using the async iterator, the `fs.Dir` object will be automatically
        * closed after the iterator exits.
        * @since v12.12.0
        * @return Fulfills with an {fs.Dir}.
        */
      inline def opendir(path: PathLike): js.Promise[typings.node.nodeColonfsMod.Dir] = ^.asInstanceOf[js.Dynamic].applyDynamic("opendir")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.node.nodeColonfsMod.Dir]]
      inline def opendir(path: PathLike, options: OpenDirOptions): js.Promise[typings.node.nodeColonfsMod.Dir] = (^.asInstanceOf[js.Dynamic].applyDynamic("opendir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.node.nodeColonfsMod.Dir]]
      
      /**
        * Asynchronously reads the entire contents of a file.
        *
        * If no encoding is specified (using `options.encoding`), the data is returned
        * as a `Buffer` object. Otherwise, the data will be a string.
        *
        * If `options` is a string, then it specifies the encoding.
        *
        * When the `path` is a directory, the behavior of `fsPromises.readFile()` is
        * platform-specific. On macOS, Linux, and Windows, the promise will be rejected
        * with an error. On FreeBSD, a representation of the directory's contents will be
        * returned.
        *
        * An example of reading a `package.json` file located in the same directory of the
        * running code:
        *
        * ```js
        * import { readFile } from 'node:fs/promises';
        * try {
        *   const filePath = new URL('./package.json', import.meta.url);
        *   const contents = await readFile(filePath, { encoding: 'utf8' });
        *   console.log(contents);
        * } catch (err) {
        *   console.error(err.message);
        * }
        * ```
        *
        * It is possible to abort an ongoing `readFile` using an `AbortSignal`. If a
        * request is aborted the promise returned is rejected with an `AbortError`:
        *
        * ```js
        * import { readFile } from 'node:fs/promises';
        *
        * try {
        *   const controller = new AbortController();
        *   const { signal } = controller;
        *   const promise = readFile(fileName, { signal });
        *
        *   // Abort the request before the promise settles.
        *   controller.abort();
        *
        *   await promise;
        * } catch (err) {
        *   // When a request is aborted - err is an AbortError
        *   console.error(err);
        * }
        * ```
        *
        * Aborting an ongoing request does not abort individual operating
        * system requests but rather the internal buffering `fs.readFile` performs.
        *
        * Any specified `FileHandle` has to support reading.
        * @since v10.0.0
        * @param path filename or `FileHandle`
        * @return Fulfills with the contents of the file.
        */
      /**
        * Asynchronously reads the entire contents of a file.
        * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
        * If a `FileHandle` is provided, the underlying file will _not_ be closed automatically.
        * @param options An object that may contain an optional flag.
        * If a flag is not provided, it defaults to `'r'`.
        */
      inline def readFile(path: PathLike): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
      inline def readFile(path: PathLike, options: ObjectEncodingOptionsAbor): js.Promise[String | Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | Buffer]]
      /**
        * Asynchronously reads the entire contents of a file.
        * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
        * If a `FileHandle` is provided, the underlying file will _not_ be closed automatically.
        * @param options An object that may contain an optional flag.
        * If a flag is not provided, it defaults to `'r'`.
        */
      inline def readFile(path: PathLike, options: encodingBufferEncodingfla): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
      inline def readFile(path: PathLike, options: encodingnullundefinedflag): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
      inline def readFile(path: PathLike, options: BufferEncoding): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
      inline def readFile(path: FileHandle): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
      inline def readFile(path: FileHandle, options: ObjectEncodingOptionsAbor): js.Promise[String | Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | Buffer]]
      inline def readFile(path: FileHandle, options: encodingBufferEncodingfla): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
      inline def readFile(path: FileHandle, options: encodingnullundefinedflag): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
      inline def readFile(path: FileHandle, options: BufferEncoding): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
      
      /**
        * Reads the contents of a directory.
        *
        * The optional `options` argument can be a string specifying an encoding, or an
        * object with an `encoding` property specifying the character encoding to use for
        * the filenames. If the `encoding` is set to `'buffer'`, the filenames returned
        * will be passed as `Buffer` objects.
        *
        * If `options.withFileTypes` is set to `true`, the resolved array will contain `fs.Dirent` objects.
        *
        * ```js
        * import { readdir } from 'node:fs/promises';
        *
        * try {
        *   const files = await readdir(path);
        *   for (const file of files)
        *     console.log(file);
        * } catch (err) {
        *   console.error(err);
        * }
        * ```
        * @since v10.0.0
        * @return Fulfills with an array of the names of the files in the directory excluding `'.'` and `'..'`.
        */
      /**
        * Asynchronous readdir(3) - read a directory.
        * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
        * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
        */
      inline def readdir(path: PathLike): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
      /**
        * Asynchronous readdir(3) - read a directory.
        * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
        * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
        */
      inline def readdir(path: PathLike, options: Encoding): js.Promise[js.Array[Buffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Buffer]]]
      inline def readdir(path: PathLike, options: ObjectEncodingOptionswith): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
      /**
        * Asynchronous readdir(3) - read a directory.
        * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
        * @param options If called with `withFileTypes: true` the result data will be an array of Dirent.
        */
      inline def readdir(path: PathLike, options: ObjectEncodingOptionswithEncoding): js.Promise[js.Array[typings.node.nodeColonfsMod.Dirent]] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[typings.node.nodeColonfsMod.Dirent]]]
      inline def readdir(path: PathLike, options: BufferEncoding): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
      
      inline def readdir_buffer(path: PathLike, options: buffer): js.Promise[js.Array[Buffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Buffer]]]
      
      /**
        * Reads the contents of the symbolic link referred to by `path`. See the POSIX [`readlink(2)`](http://man7.org/linux/man-pages/man2/readlink.2.html) documentation for more detail. The promise is
        * resolved with the`linkString` upon success.
        *
        * The optional `options` argument can be a string specifying an encoding, or an
        * object with an `encoding` property specifying the character encoding to use for
        * the link path returned. If the `encoding` is set to `'buffer'`, the link path
        * returned will be passed as a `Buffer` object.
        * @since v10.0.0
        * @return Fulfills with the `linkString` upon success.
        */
      /**
        * Asynchronous readlink(2) - read value of a symbolic link.
        * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
        * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
        */
      inline def readlink(path: PathLike): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("readlink")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
      inline def readlink(path: PathLike, options: String): js.Promise[String | Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("readlink")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | Buffer]]
      inline def readlink(path: PathLike, options: BufferEncoding): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readlink")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
      /**
        * Asynchronous readlink(2) - read value of a symbolic link.
        * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
        * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
        */
      inline def readlink(path: PathLike, options: BufferEncodingOption): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("readlink")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
      inline def readlink(path: PathLike, options: ObjectEncodingOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readlink")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
      
      /**
        * Determines the actual location of `path` using the same semantics as the`fs.realpath.native()` function.
        *
        * Only paths that can be converted to UTF8 strings are supported.
        *
        * The optional `options` argument can be a string specifying an encoding, or an
        * object with an `encoding` property specifying the character encoding to use for
        * the path. If the `encoding` is set to `'buffer'`, the path returned will be
        * passed as a `Buffer` object.
        *
        * On Linux, when Node.js is linked against musl libc, the procfs file system must
        * be mounted on `/proc` in order for this function to work. Glibc does not have
        * this restriction.
        * @since v10.0.0
        * @return Fulfills with the resolved path upon success.
        */
      /**
        * Asynchronous realpath(3) - return the canonicalized absolute pathname.
        * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
        * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
        */
      inline def realpath(path: PathLike): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("realpath")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
      inline def realpath(path: PathLike, options: BufferEncoding): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("realpath")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
      /**
        * Asynchronous realpath(3) - return the canonicalized absolute pathname.
        * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
        * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
        */
      inline def realpath(path: PathLike, options: BufferEncodingOption): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("realpath")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
      inline def realpath(path: PathLike, options: ObjectEncodingOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("realpath")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
      
      /**
        * Renames `oldPath` to `newPath`.
        * @since v10.0.0
        * @return Fulfills with `undefined` upon success.
        */
      inline def rename(oldPath: PathLike, newPath: PathLike): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("rename")(oldPath.asInstanceOf[js.Any], newPath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
      
      /**
        * Removes files and directories (modeled on the standard POSIX `rm` utility).
        * @since v14.14.0
        * @return Fulfills with `undefined` upon success.
        */
      inline def rm(path: PathLike): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("rm")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
      inline def rm(path: PathLike, options: RmOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("rm")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
      
      /**
        * Removes the directory identified by `path`.
        *
        * Using `fsPromises.rmdir()` on a file (not a directory) results in the
        * promise being rejected with an `ENOENT` error on Windows and an `ENOTDIR`error on POSIX.
        *
        * To get a behavior similar to the `rm -rf` Unix command, use `fsPromises.rm()` with options `{ recursive: true, force: true }`.
        * @since v10.0.0
        * @return Fulfills with `undefined` upon success.
        */
      inline def rmdir(path: PathLike): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("rmdir")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
      inline def rmdir(path: PathLike, options: RmDirOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("rmdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
      
      /**
        * @since v10.0.0
        * @return Fulfills with the {fs.Stats} object for the given `path`.
        */
      inline def stat(path: PathLike): js.Promise[typings.node.nodeColonfsMod.Stats] = ^.asInstanceOf[js.Dynamic].applyDynamic("stat")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.node.nodeColonfsMod.Stats]]
      inline def stat(path: PathLike, opts: StatOptionsbigintfalseund): js.Promise[typings.node.nodeColonfsMod.Stats] = (^.asInstanceOf[js.Dynamic].applyDynamic("stat")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.node.nodeColonfsMod.Stats]]
      inline def stat(path: PathLike, opts: StatOptionsbiginttrue): js.Promise[BigIntStats] = (^.asInstanceOf[js.Dynamic].applyDynamic("stat")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BigIntStats]]
      inline def stat(path: PathLike, opts: StatOptions): js.Promise[typings.node.nodeColonfsMod.Stats | BigIntStats] = (^.asInstanceOf[js.Dynamic].applyDynamic("stat")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.node.nodeColonfsMod.Stats | BigIntStats]]
      
      /**
        * @since v19.6.0, v18.15.0
        * @return Fulfills with the {fs.StatFs} object for the given `path`.
        */
      inline def statfs(path: PathLike): js.Promise[typings.node.nodeColonfsMod.StatsFs] = ^.asInstanceOf[js.Dynamic].applyDynamic("statfs")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.node.nodeColonfsMod.StatsFs]]
      inline def statfs(path: PathLike, opts: StatFsOptionsbigintfalseu): js.Promise[typings.node.nodeColonfsMod.StatsFs] = (^.asInstanceOf[js.Dynamic].applyDynamic("statfs")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.node.nodeColonfsMod.StatsFs]]
      inline def statfs(path: PathLike, opts: StatFsOptionsbiginttrue): js.Promise[BigIntStatsFs] = (^.asInstanceOf[js.Dynamic].applyDynamic("statfs")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BigIntStatsFs]]
      inline def statfs(path: PathLike, opts: StatFsOptions): js.Promise[typings.node.nodeColonfsMod.StatsFs | BigIntStatsFs] = (^.asInstanceOf[js.Dynamic].applyDynamic("statfs")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.node.nodeColonfsMod.StatsFs | BigIntStatsFs]]
      
      /**
        * Creates a symbolic link.
        *
        * The `type` argument is only used on Windows platforms and can be one of `'dir'`,`'file'`, or `'junction'`. If the `type` argument is not a string, Node.js will
        * autodetect `target` type and use `'file'` or `'dir'`. If the `target` does not
        * exist, `'file'` will be used. Windows junction points require the destination
        * path to be absolute. When using `'junction'`, the `target` argument will
        * automatically be normalized to absolute path.
        * @since v10.0.0
        * @param [type='null']
        * @return Fulfills with `undefined` upon success.
        */
      inline def symlink(target: PathLike, path: PathLike): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("symlink")(target.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
      inline def symlink(target: PathLike, path: PathLike, `type`: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("symlink")(target.asInstanceOf[js.Any], path.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
      
      /**
        * Truncates (shortens or extends the length) of the content at `path` to `len`bytes.
        * @since v10.0.0
        * @param [len=0]
        * @return Fulfills with `undefined` upon success.
        */
      inline def truncate(path: PathLike): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
      inline def truncate(path: PathLike, len: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(path.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
      
      /**
        * If `path` refers to a symbolic link, then the link is removed without affecting
        * the file or directory to which that link refers. If the `path` refers to a file
        * path that is not a symbolic link, the file is deleted. See the POSIX [`unlink(2)`](http://man7.org/linux/man-pages/man2/unlink.2.html) documentation for more detail.
        * @since v10.0.0
        * @return Fulfills with `undefined` upon success.
        */
      inline def unlink(path: PathLike): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("unlink")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
      
      /**
        * Change the file system timestamps of the object referenced by `path`.
        *
        * The `atime` and `mtime` arguments follow these rules:
        *
        * * Values can be either numbers representing Unix epoch time, `Date`s, or a
        * numeric string like `'123456789.0'`.
        * * If the value can not be converted to a number, or is `NaN`, `Infinity`, or`-Infinity`, an `Error` will be thrown.
        * @since v10.0.0
        * @return Fulfills with `undefined` upon success.
        */
      inline def utimes(path: PathLike, atime: TimeLike, mtime: TimeLike): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
      
      /**
        * Watch for changes on `filename`, where `filename` is either a file or a directory, returning an `FSWatcher`.
        * @param filename A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
        * @param options Either the encoding for the filename provided to the listener, or an object optionally specifying encoding, persistent, and recursive options.
        * If `encoding` is not supplied, the default of `'utf8'` is used.
        * If `persistent` is not supplied, the default of `true` is used.
        * If `recursive` is not supplied, the default of `false` is used.
        */
      inline def watch(filename: PathLike): AsyncIterable[FileChangeInfo[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any]).asInstanceOf[AsyncIterable[FileChangeInfo[String]]]
      inline def watch(filename: PathLike, options: String): AsyncIterable[FileChangeInfo[Buffer | String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncIterable[FileChangeInfo[Buffer | String]]]
      /**
        * Returns an async iterator that watches for changes on `filename`, where `filename`is either a file or a directory.
        *
        * ```js
        * const { watch } = require('node:fs/promises');
        *
        * const ac = new AbortController();
        * const { signal } = ac;
        * setTimeout(() => ac.abort(), 10000);
        *
        * (async () => {
        *   try {
        *     const watcher = watch(__filename, { signal });
        *     for await (const event of watcher)
        *       console.log(event);
        *   } catch (err) {
        *     if (err.name === 'AbortError')
        *       return;
        *     throw err;
        *   }
        * })();
        * ```
        *
        * On most platforms, `'rename'` is emitted whenever a filename appears or
        * disappears in the directory.
        *
        * All the `caveats` for `fs.watch()` also apply to `fsPromises.watch()`.
        * @since v15.9.0, v14.18.0
        * @return of objects with the properties:
        */
      inline def watch(filename: PathLike, options: WatchOptionsencodingbuffe): AsyncIterable[FileChangeInfo[Buffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncIterable[FileChangeInfo[Buffer]]]
      inline def watch(filename: PathLike, options: BufferEncoding): AsyncIterable[FileChangeInfo[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncIterable[FileChangeInfo[String]]]
      /**
        * Watch for changes on `filename`, where `filename` is either a file or a directory, returning an `FSWatcher`.
        * @param filename A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
        * @param options Either the encoding for the filename provided to the listener, or an object optionally specifying encoding, persistent, and recursive options.
        * If `encoding` is not supplied, the default of `'utf8'` is used.
        * If `persistent` is not supplied, the default of `true` is used.
        * If `recursive` is not supplied, the default of `false` is used.
        */
      inline def watch(filename: PathLike, options: WatchOptions): AsyncIterable[FileChangeInfo[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncIterable[FileChangeInfo[String]]]
      
      inline def watch_buffer(filename: PathLike, options: buffer): AsyncIterable[FileChangeInfo[Buffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncIterable[FileChangeInfo[Buffer]]]
      
      /**
        * Asynchronously writes data to a file, replacing the file if it already exists.`data` can be a string, a buffer, an
        * [AsyncIterable](https://tc39.github.io/ecma262/#sec-asynciterable-interface), or an
        * [Iterable](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Iteration_protocols#The_iterable_protocol) object.
        *
        * The `encoding` option is ignored if `data` is a buffer.
        *
        * If `options` is a string, then it specifies the encoding.
        *
        * The `mode` option only affects the newly created file. See `fs.open()` for more details.
        *
        * Any specified `FileHandle` has to support writing.
        *
        * It is unsafe to use `fsPromises.writeFile()` multiple times on the same file
        * without waiting for the promise to be settled.
        *
        * Similarly to `fsPromises.readFile` \- `fsPromises.writeFile` is a convenience
        * method that performs multiple `write` calls internally to write the buffer
        * passed to it. For performance sensitive code consider using `fs.createWriteStream()` or `filehandle.createWriteStream()`.
        *
        * It is possible to use an `AbortSignal` to cancel an `fsPromises.writeFile()`.
        * Cancelation is "best effort", and some amount of data is likely still
        * to be written.
        *
        * ```js
        * import { writeFile } from 'node:fs/promises';
        * import { Buffer } from 'node:buffer';
        *
        * try {
        *   const controller = new AbortController();
        *   const { signal } = controller;
        *   const data = new Uint8Array(Buffer.from('Hello Node.js'));
        *   const promise = writeFile('message.txt', data, { signal });
        *
        *   // Abort the request before the promise settles.
        *   controller.abort();
        *
        *   await promise;
        * } catch (err) {
        *   // When a request is aborted - err is an AbortError
        *   console.error(err);
        * }
        * ```
        *
        * Aborting an ongoing request does not abort individual operating
        * system requests but rather the internal buffering `fs.writeFile` performs.
        * @since v10.0.0
        * @param file filename or `FileHandle`
        * @return Fulfills with `undefined` upon success.
        */
      inline def writeFile(file: PathLike, data: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
      inline def writeFile(file: PathLike, data: String, options: ObjectEncodingOptionsmode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
      inline def writeFile(file: PathLike, data: String, options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
      inline def writeFile(file: PathLike, data: js.Iterable[String | ArrayBufferView]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
      inline def writeFile(file: PathLike, data: js.Iterable[String | ArrayBufferView], options: ObjectEncodingOptionsmode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
      inline def writeFile(file: PathLike, data: js.Iterable[String | ArrayBufferView], options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
      inline def writeFile(file: PathLike, data: ArrayBufferView): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
      inline def writeFile(file: PathLike, data: ArrayBufferView, options: ObjectEncodingOptionsmode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
      inline def writeFile(file: PathLike, data: ArrayBufferView, options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
      inline def writeFile(file: PathLike, data: Stream): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
      inline def writeFile(file: PathLike, data: Stream, options: ObjectEncodingOptionsmode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
      inline def writeFile(file: PathLike, data: Stream, options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
      inline def writeFile(file: PathLike, data: AsyncIterable[String | ArrayBufferView]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
      inline def writeFile(file: PathLike, data: AsyncIterable[String | ArrayBufferView], options: ObjectEncodingOptionsmode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
      inline def writeFile(file: PathLike, data: AsyncIterable[String | ArrayBufferView], options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
      inline def writeFile(file: FileHandle, data: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
      inline def writeFile(file: FileHandle, data: String, options: ObjectEncodingOptionsmode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
      inline def writeFile(file: FileHandle, data: String, options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
      inline def writeFile(file: FileHandle, data: js.Iterable[String | ArrayBufferView]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
      inline def writeFile(file: FileHandle, data: js.Iterable[String | ArrayBufferView], options: ObjectEncodingOptionsmode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
      inline def writeFile(file: FileHandle, data: js.Iterable[String | ArrayBufferView], options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
      inline def writeFile(file: FileHandle, data: ArrayBufferView): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
      inline def writeFile(file: FileHandle, data: ArrayBufferView, options: ObjectEncodingOptionsmode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
      inline def writeFile(file: FileHandle, data: ArrayBufferView, options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
      inline def writeFile(file: FileHandle, data: Stream): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
      inline def writeFile(file: FileHandle, data: Stream, options: ObjectEncodingOptionsmode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
      inline def writeFile(file: FileHandle, data: Stream, options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
      inline def writeFile(file: FileHandle, data: AsyncIterable[String | ArrayBufferView]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
      inline def writeFile(
        file: FileHandle,
        data: AsyncIterable[String | ArrayBufferView],
        options: ObjectEncodingOptionsmode
      ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
      inline def writeFile(file: FileHandle, data: AsyncIterable[String | ArrayBufferView], options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    }
    
    @JSImport("file-system-cache/lib/common", "fs.read")
    @js.native
    val read: (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.read.__promisify__ */ Any) & Typeofread = js.native
    
    @JSImport("file-system-cache/lib/common", "fs.readFile")
    @js.native
    val readFile: (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.readFile.__promisify__ */ Any) & TypeofreadFile = js.native
    
    inline def readFileSync(path: PathOrFileDescriptor): String | Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any]).asInstanceOf[String | Buffer]
    inline def readFileSync(path: PathOrFileDescriptor, options: EncodingFlag): String = (^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def readFileSync(path: PathOrFileDescriptor, options: Flag): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    inline def readFileSync(path: PathOrFileDescriptor, options: ObjectEncodingOptionsflagEncoding): String | Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | Buffer]
    inline def readFileSync(path: PathOrFileDescriptor, options: BufferEncoding): String = (^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def readFileSync_Buffer(path: PathOrFileDescriptor): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    
    inline def readFileSync_Union(path: PathOrFileDescriptor, options: BufferEncoding): String | Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | Buffer]
    
    inline def readJSONSync_(file: Path): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("readJSONSync")(file.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def readJSONSync_(file: Path, options: JFReadOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("readJSONSync")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def readJSON_(file: Path): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("readJSON")(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
    inline def readJSON_(file: Path, callback: ReadCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readJSON")(file.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def readJSON_(file: Path, options: JFReadOptions): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("readJSON")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def readJSON_(file: Path, options: JFReadOptions, callback: ReadCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readJSON")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def readJson(file: Path): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("readJson")(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
    inline def readJson(file: Path, callback: ReadCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readJson")(file.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def readJson(file: Path, options: JFReadOptions): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("readJson")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def readJson(file: Path, options: JFReadOptions, callback: ReadCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readJson")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def readJsonSync(file: Path): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("readJsonSync")(file.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def readJsonSync(file: Path, options: JFReadOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("readJsonSync")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def readSync(fd: Double, buffer: ArrayBufferView): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def readSync(fd: Double, buffer: ArrayBufferView, offset: Double, length: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def readSync(fd: Double, buffer: ArrayBufferView, offset: Double, length: Double, position: ReadPosition): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def readSync(fd: Double, buffer: ArrayBufferView, opts: ReadSyncOptions): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @JSImport("file-system-cache/lib/common", "fs.readdir")
    @js.native
    val readdir: (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.readdir.__promisify__ */ Any) & Typeofreaddir = js.native
    
    inline def readdirSync(path: PathLike): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(path.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    inline def readdirSync(path: PathLike, options: Encoding): js.Array[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Buffer]]
    inline def readdirSync(path: PathLike, options: ObjectEncodingOptionswith): js.Array[Buffer | String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Buffer | String]]
    inline def readdirSync(path: PathLike, options: ObjectEncodingOptionswithEncoding): js.Array[typings.node.fsMod.Dirent] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.node.fsMod.Dirent]]
    inline def readdirSync(path: PathLike, options: Recursive): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    inline def readdirSync(path: PathLike, options: BufferEncoding): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    
    inline def readdirSync_buffer(path: PathLike, options: buffer): js.Array[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Buffer]]
    
    @JSImport("file-system-cache/lib/common", "fs.readlink")
    @js.native
    val readlink: (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.readlink.__promisify__ */ Any) & Typeofreadlink = js.native
    
    inline def readlinkSync(path: PathLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("readlinkSync")(path.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def readlinkSync(path: PathLike, options: BufferEncodingOption): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("readlinkSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    inline def readlinkSync(path: PathLike, options: EncodingOption): String = (^.asInstanceOf[js.Dynamic].applyDynamic("readlinkSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def readlinkSync_Union(path: PathLike): String | Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("readlinkSync")(path.asInstanceOf[js.Any]).asInstanceOf[String | Buffer]
    inline def readlinkSync_Union(path: PathLike, options: EncodingOption): String | Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("readlinkSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | Buffer]
    
    @JSImport("file-system-cache/lib/common", "fs.readv")
    @js.native
    val readv: (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.readv.__promisify__ */ Any) & Typeofreadv = js.native
    
    inline def readvSync(fd: Double, buffers: js.Array[ArrayBufferView]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readvSync")(fd.asInstanceOf[js.Any], buffers.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def readvSync(fd: Double, buffers: js.Array[ArrayBufferView], position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readvSync")(fd.asInstanceOf[js.Any], buffers.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @JSImport("file-system-cache/lib/common", "fs.realpath")
    @js.native
    val realpath: (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.realpath.__promisify__ */ Any) & Typeofrealpath & Native = js.native
    
    object realpathSync {
      
      inline def apply(path: PathLike): String = ^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any]).asInstanceOf[String]
      inline def apply(path: PathLike, options: BufferEncodingOption): Buffer = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
      inline def apply(path: PathLike, options: EncodingOption): String = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
      
      @JSImport("file-system-cache/lib/common", "fs.realpathSync")
      @js.native
      val ^ : js.Any = js.native
      
      inline def native(path: PathLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("native")(path.asInstanceOf[js.Any]).asInstanceOf[String]
      inline def native(path: PathLike, options: BufferEncodingOption): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("native")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
      inline def native(path: PathLike, options: EncodingOption): String = (^.asInstanceOf[js.Dynamic].applyDynamic("native")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
      
      inline def native_Union(path: PathLike): String | Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("native")(path.asInstanceOf[js.Any]).asInstanceOf[String | Buffer]
      inline def native_Union(path: PathLike, options: EncodingOption): String | Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("native")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | Buffer]
    }
    
    inline def remove(dir: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(dir.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    inline def remove(dir: String, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(dir.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeSync(dir: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeSync")(dir.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSImport("file-system-cache/lib/common", "fs.rename")
    @js.native
    val rename: (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.rename.__promisify__ */ Any) & Typeofrename = js.native
    
    inline def renameSync(oldPath: PathLike, newPath: PathLike): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renameSync")(oldPath.asInstanceOf[js.Any], newPath.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("file-system-cache/lib/common", "fs.rm")
    @js.native
    val rm: (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.rm.__promisify__ */ Any) & Typeofrm = js.native
    
    inline def rmSync(path: PathLike): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("rmSync")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def rmSync(path: PathLike, options: RmOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rmSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("file-system-cache/lib/common", "fs.rmdir")
    @js.native
    val rmdir: (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.rmdir.__promisify__ */ Any) & Typeofrmdir = js.native
    
    inline def rmdirSync(path: PathLike): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("rmdirSync")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def rmdirSync(path: PathLike, options: RmDirOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rmdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("file-system-cache/lib/common", "fs.stat")
    @js.native
    val stat: (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.stat.__promisify__ */ Any) & Typeofstat = js.native
    
    @JSImport("file-system-cache/lib/common", "fs.statSync")
    @js.native
    val statSync: StatSyncFn = js.native
    
    inline def statfs(
      path: PathLike,
      callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ typings.node.fsMod.StatsFs, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("statfs")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def statfs(
      path: PathLike,
      options: Unit,
      callback: js.Function2[
          ErrnoException | Null, 
          BigIntStatsFs | (/* stats */ typings.node.fsMod.StatsFs), 
          Unit
        ]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("statfs")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def statfs(
      path: PathLike,
      options: StatFsOptionsbigintfalseu,
      callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ typings.node.fsMod.StatsFs, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("statfs")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def statfs(
      path: PathLike,
      options: StatFsOptionsbiginttrue,
      callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ BigIntStatsFs, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("statfs")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def statfs(
      path: PathLike,
      options: StatFsOptions,
      callback: js.Function2[
          /* err */ ErrnoException | Null, 
          /* stats */ typings.node.fsMod.StatsFs | BigIntStatsFs, 
          Unit
        ]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("statfs")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def statfsSync(path: PathLike): typings.node.fsMod.StatsFs = ^.asInstanceOf[js.Dynamic].applyDynamic("statfsSync")(path.asInstanceOf[js.Any]).asInstanceOf[typings.node.fsMod.StatsFs]
    inline def statfsSync(path: PathLike, options: StatFsOptionsbigintfalseu): typings.node.fsMod.StatsFs = (^.asInstanceOf[js.Dynamic].applyDynamic("statfsSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.fsMod.StatsFs]
    inline def statfsSync(path: PathLike, options: StatFsOptionsbiginttrue): BigIntStatsFs = (^.asInstanceOf[js.Dynamic].applyDynamic("statfsSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[BigIntStatsFs]
    inline def statfsSync(path: PathLike, options: StatFsOptions): typings.node.fsMod.StatsFs | BigIntStatsFs = (^.asInstanceOf[js.Dynamic].applyDynamic("statfsSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.fsMod.StatsFs | BigIntStatsFs]
    
    inline def statfsSync_Union(path: PathLike): typings.node.fsMod.StatsFs | BigIntStatsFs = ^.asInstanceOf[js.Dynamic].applyDynamic("statfsSync")(path.asInstanceOf[js.Any]).asInstanceOf[typings.node.fsMod.StatsFs | BigIntStatsFs]
    
    @JSImport("file-system-cache/lib/common", "fs.symlink")
    @js.native
    val symlink: (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.symlink.__promisify__ */ Any) & Typeofsymlink = js.native
    
    inline def symlinkSync(target: PathLike, path: PathLike): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("symlinkSync")(target.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def symlinkSync(target: PathLike, path: PathLike, `type`: Type): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("symlinkSync")(target.asInstanceOf[js.Any], path.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("file-system-cache/lib/common", "fs.truncate")
    @js.native
    val truncate: (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.truncate.__promisify__ */ Any) & Typeoftruncate = js.native
    
    inline def truncateSync(path: PathLike): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("truncateSync")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def truncateSync(path: PathLike, len: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("truncateSync")(path.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("file-system-cache/lib/common", "fs.unlink")
    @js.native
    val unlink: (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.unlink.__promisify__ */ Any) & Typeofunlink = js.native
    
    inline def unlinkSync(path: PathLike): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unlinkSync")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def unwatchFile(filename: PathLike): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unwatchFile")(filename.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def unwatchFile(filename: PathLike, listener: BigIntStatsListener | StatsListener): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unwatchFile")(filename.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("file-system-cache/lib/common", "fs.utimes")
    @js.native
    val utimes: (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.utimes.__promisify__ */ Any) & Typeofutimes = js.native
    
    inline def utimesSync(path: PathLike, atime: TimeLike, mtime: TimeLike): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("utimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def watch(filename: PathLike): FSWatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any]).asInstanceOf[FSWatcher]
    inline def watch(filename: PathLike, listener: WatchListener[String]): FSWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[FSWatcher]
    inline def watch(filename: PathLike, options: String): FSWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FSWatcher]
    inline def watch(filename: PathLike, options: String, listener: WatchListener[String | Buffer]): FSWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[FSWatcher]
    inline def watch(filename: PathLike, options: Null, listener: WatchListener[String]): FSWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[FSWatcher]
    inline def watch(filename: PathLike, options: Unit, listener: WatchListener[String]): FSWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[FSWatcher]
    inline def watch(filename: PathLike, options: WatchOptionsencodingbuffe): FSWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FSWatcher]
    inline def watch(filename: PathLike, options: WatchOptionsencodingbuffe, listener: WatchListener[Buffer]): FSWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[FSWatcher]
    inline def watch(filename: PathLike, options: BufferEncoding): FSWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FSWatcher]
    inline def watch(filename: PathLike, options: BufferEncoding, listener: WatchListener[String]): FSWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[FSWatcher]
    inline def watch(filename: PathLike, options: WatchOptions): FSWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FSWatcher]
    inline def watch(filename: PathLike, options: WatchOptions, listener: WatchListener[Buffer | String]): FSWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[FSWatcher]
    
    inline def watchFile(filename: PathLike, listener: StatsListener): StatWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watchFile")(filename.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[StatWatcher]
    inline def watchFile(filename: PathLike, options: Unit, listener: BigIntStatsListener | StatsListener): StatWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watchFile")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[StatWatcher]
    inline def watchFile(filename: PathLike, options: WatchFileOptionsbigintfal, listener: StatsListener): StatWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watchFile")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[StatWatcher]
    inline def watchFile(filename: PathLike, options: WatchFileOptionsbiginttru, listener: BigIntStatsListener): StatWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watchFile")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[StatWatcher]
    
    inline def watch_buffer(filename: PathLike, options: buffer): FSWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FSWatcher]
    inline def watch_buffer(filename: PathLike, options: buffer, listener: WatchListener[Buffer]): FSWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[FSWatcher]
    
    @JSImport("file-system-cache/lib/common", "fs.write")
    @js.native
    val write: (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.write.__promisify__ */ Any) & Typeofwrite = js.native
    
    @JSImport("file-system-cache/lib/common", "fs.writeFile")
    @js.native
    val writeFile: (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.writeFile.__promisify__ */ Any) & TypeofwriteFile = js.native
    
    inline def writeFileSync(file: PathOrFileDescriptor, data: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def writeFileSync(file: PathOrFileDescriptor, data: String, options: WriteFileOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def writeFileSync(file: PathOrFileDescriptor, data: ArrayBufferView): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def writeFileSync(file: PathOrFileDescriptor, data: ArrayBufferView, options: WriteFileOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def writeJSONSync_(file: Path, obj: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJSONSync")(file.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def writeJSONSync_(file: Path, obj: Any, options: JFWriteOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJSONSync")(file.asInstanceOf[js.Any], obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def writeJSON_(file: Path, obj: Any): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJSON")(file.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def writeJSON_(file: Path, obj: Any, callback: WriteCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJSON")(file.asInstanceOf[js.Any], obj.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def writeJSON_(file: Path, obj: Any, options: JFWriteOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJSON")(file.asInstanceOf[js.Any], obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def writeJSON_(file: Path, obj: Any, options: JFWriteOptions, callback: WriteCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJSON")(file.asInstanceOf[js.Any], obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def writeJson(file: Path, obj: Any): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJson")(file.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def writeJson(file: Path, obj: Any, callback: WriteCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJson")(file.asInstanceOf[js.Any], obj.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def writeJson(file: Path, obj: Any, options: JFWriteOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJson")(file.asInstanceOf[js.Any], obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def writeJson(file: Path, obj: Any, options: JFWriteOptions, callback: WriteCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJson")(file.asInstanceOf[js.Any], obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def writeJsonSync(file: Path, obj: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJsonSync")(file.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def writeJsonSync(file: Path, obj: Any, options: JFWriteOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJsonSync")(file.asInstanceOf[js.Any], obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def writeSync(fd: Double, buffer: ArrayBufferView): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def writeSync(fd: Double, buffer: ArrayBufferView, offset: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def writeSync(fd: Double, buffer: ArrayBufferView, offset: Double, length: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def writeSync(fd: Double, buffer: ArrayBufferView, offset: Double, length: Double, position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def writeSync(fd: Double, buffer: ArrayBufferView, offset: Double, length: Null, position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def writeSync(fd: Double, buffer: ArrayBufferView, offset: Double, length: Unit, position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def writeSync(fd: Double, buffer: ArrayBufferView, offset: Null, length: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def writeSync(fd: Double, buffer: ArrayBufferView, offset: Null, length: Double, position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def writeSync(fd: Double, buffer: ArrayBufferView, offset: Null, length: Null, position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def writeSync(fd: Double, buffer: ArrayBufferView, offset: Null, length: Unit, position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def writeSync(fd: Double, buffer: ArrayBufferView, offset: Unit, length: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def writeSync(fd: Double, buffer: ArrayBufferView, offset: Unit, length: Double, position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def writeSync(fd: Double, buffer: ArrayBufferView, offset: Unit, length: Null, position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def writeSync(fd: Double, buffer: ArrayBufferView, offset: Unit, length: Unit, position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def writeSync(fd: Double, string: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def writeSync(fd: Double, string: String, position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def writeSync(fd: Double, string: String, position: Double, encoding: BufferEncoding): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def writeSync(fd: Double, string: String, position: Null, encoding: BufferEncoding): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def writeSync(fd: Double, string: String, position: Unit, encoding: BufferEncoding): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @JSImport("file-system-cache/lib/common", "fs.writev")
    @js.native
    val writev: (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.writev.__promisify__ */ Any) & Typeofwritev = js.native
    
    inline def writevSync(fd: Double, buffers: js.Array[ArrayBufferView]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writevSync")(fd.asInstanceOf[js.Any], buffers.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def writevSync(fd: Double, buffers: js.Array[ArrayBufferView], position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writevSync")(fd.asInstanceOf[js.Any], buffers.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
  
  @JSImport("file-system-cache/lib/common", "fsPath")
  @js.native
  val fsPath: PlatformPath = js.native
}

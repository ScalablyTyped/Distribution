package typings.ethereumCryptography

import typings.nobleHashes.utilsMod.TypedArray
import typings.std.Crypto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("ethereum-cryptography/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* was `typeof imported__assert.bool` */
  inline def assertBool(b: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertBool")(b.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /* was `typeof imported__assert.bytes` */
  inline def assertBytes(b: js.typedarray.Uint8Array, lengths: Double*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertBytes")(scala.List(b.asInstanceOf[js.Any]).`++`(lengths.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  /* was `typeof imported__assert.bytes` */
  inline def assertBytes(b: Unit, lengths: Double*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertBytes")(scala.List(b.asInstanceOf[js.Any]).`++`(lengths.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  
  inline def bytesToHex(uint8a: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("bytesToHex")(uint8a.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def bytesToUtf8(data: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("bytesToUtf8")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def concatBytes(arrays: js.typedarray.Uint8Array*): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("concatBytes")(arrays.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def createView(arr: TypedArray): js.typedarray.DataView = ^.asInstanceOf[js.Dynamic].applyDynamic("createView")(arr.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.DataView]
  
  object crypto {
    
    @JSImport("ethereum-cryptography/utils", "crypto")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ethereum-cryptography/utils", "crypto.node")
    @js.native
    def node: js.UndefOr[Any] = js.native
    inline def node_=(x: js.UndefOr[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("node")(x.asInstanceOf[js.Any])
    
    @JSImport("ethereum-cryptography/utils", "crypto.web")
    @js.native
    def web: js.UndefOr[Crypto] = js.native
    inline def web_=(x: js.UndefOr[Crypto]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("web")(x.asInstanceOf[js.Any])
  }
  
  inline def equalsBytes(a: js.typedarray.Uint8Array, b: js.typedarray.Uint8Array): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsBytes")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def hexToBytes(data: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("hexToBytes")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def toHex(uint8a: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toHex")(uint8a.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def utf8ToBytes(str: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("utf8ToBytes")(str.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def wrapHash(hash: js.Function1[/* msg */ js.typedarray.Uint8Array, js.typedarray.Uint8Array]): js.Function1[/* msg */ js.typedarray.Uint8Array, js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapHash")(hash.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* msg */ js.typedarray.Uint8Array, js.typedarray.Uint8Array]]
}

package typings.ethersprojectAbi

import org.scalablytyped.runtime.StringDictionary
import typings.ethersprojectAbi.anon.Error
import typings.ethersprojectBignumber.bignumberMod.BigNumberish
import typings.ethersprojectBignumber.mod.BigNumber
import typings.ethersprojectBytes.mod.BytesLike
import typings.std.ReadonlyArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object abstractCoderMod {
  
  @JSImport("@ethersproject/abi/lib/coders/abstract-coder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ethersproject/abi/lib/coders/abstract-coder", "Coder")
  @js.native
  abstract class Coder protected () extends StObject {
    def this(name: String, `type`: String, localName: String, dynamic: Boolean) = this()
    
    def _throwError(message: String, value: Any): Unit = js.native
    
    def decode(reader: Reader): Any = js.native
    
    def defaultValue(): Any = js.native
    
    val dynamic: Boolean = js.native
    
    def encode(writer: Writer, value: Any): Double = js.native
    
    val localName: String = js.native
    
    val name: String = js.native
    
    val `type`: String = js.native
  }
  
  @JSImport("@ethersproject/abi/lib/coders/abstract-coder", "Reader")
  @js.native
  open class Reader protected () extends StObject {
    def this(data: BytesLike) = this()
    def this(data: BytesLike, wordSize: Double) = this()
    def this(data: BytesLike, wordSize: Double, coerceFunc: CoerceFunc) = this()
    def this(data: BytesLike, wordSize: Unit, coerceFunc: CoerceFunc) = this()
    def this(data: BytesLike, wordSize: Double, coerceFunc: Unit, allowLoose: Boolean) = this()
    def this(data: BytesLike, wordSize: Double, coerceFunc: CoerceFunc, allowLoose: Boolean) = this()
    def this(data: BytesLike, wordSize: Unit, coerceFunc: Unit, allowLoose: Boolean) = this()
    def this(data: BytesLike, wordSize: Unit, coerceFunc: CoerceFunc, allowLoose: Boolean) = this()
    
    def _coerceFunc(`type`: String, value: Any): Any = js.native
    
    val _data: js.typedarray.Uint8Array = js.native
    
    var _offset: Double = js.native
    
    def _peekBytes(offset: Double, length: Double): js.typedarray.Uint8Array = js.native
    def _peekBytes(offset: Double, length: Double, loose: Boolean): js.typedarray.Uint8Array = js.native
    
    val allowLoose: Boolean = js.native
    
    def coerce(name: String, value: Any): Any = js.native
    
    def consumed: Double = js.native
    
    def data: String = js.native
    
    def readBytes(length: Double): js.typedarray.Uint8Array = js.native
    def readBytes(length: Double, loose: Boolean): js.typedarray.Uint8Array = js.native
    
    def readValue(): BigNumber = js.native
    
    def subReader(offset: Double): Reader = js.native
    
    val wordSize: Double = js.native
  }
  /* static members */
  object Reader {
    
    @JSImport("@ethersproject/abi/lib/coders/abstract-coder", "Reader")
    @js.native
    val ^ : js.Any = js.native
    
    inline def coerce(name: String, value: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("coerce")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Any]
  }
  
  @JSImport("@ethersproject/abi/lib/coders/abstract-coder", "Writer")
  @js.native
  open class Writer () extends StObject {
    def this(wordSize: Double) = this()
    
    var _data: js.Array[js.typedarray.Uint8Array] = js.native
    
    var _dataLength: Double = js.native
    
    def _getValue(value: BigNumberish): js.typedarray.Uint8Array = js.native
    
    var _padding: js.typedarray.Uint8Array = js.native
    
    def _writeData(data: js.typedarray.Uint8Array): Double = js.native
    
    def appendWriter(writer: Writer): Double = js.native
    
    def data: String = js.native
    
    def length: Double = js.native
    
    val wordSize: Double = js.native
    
    def writeBytes(value: BytesLike): Double = js.native
    
    def writeUpdatableValue(): js.Function1[/* value */ BigNumberish, Unit] = js.native
    
    def writeValue(value: BigNumberish): Double = js.native
  }
  
  inline def checkResultErrors(result: Result): js.Array[Error] = ^.asInstanceOf[js.Dynamic].applyDynamic("checkResultErrors")(result.asInstanceOf[js.Any]).asInstanceOf[js.Array[Error]]
  
  type CoerceFunc = js.Function2[/* type */ String, /* value */ Any, Any]
  
  @js.native
  trait Result
    extends StObject
       with ReadonlyArray[Any]
       with /* key */ StringDictionary[Any]
}

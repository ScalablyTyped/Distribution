package typings.ethersprojectAbi

import org.scalablytyped.runtime.StringDictionary
import typings.ethersprojectAbi.anon.Error
import typings.ethersprojectBignumber.bignumberMod.BigNumberish
import typings.ethersprojectBignumber.mod.BigNumber
import typings.ethersprojectBytes.mod.BytesLike
import typings.std.ReadonlyArray
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object abstractCoderMod {
  
  @JSImport("@ethersproject/abi/lib/coders/abstract-coder", "Coder")
  @js.native
  abstract class Coder protected () extends StObject {
    def this(name: String, `type`: String, localName: String, dynamic: Boolean) = this()
    
    def _throwError(message: String, value: js.Any): Unit = js.native
    
    def decode(reader: Reader): js.Any = js.native
    
    val dynamic: Boolean = js.native
    
    def encode(writer: Writer, value: js.Any): Double = js.native
    
    val localName: String = js.native
    
    val name: String = js.native
    
    val `type`: String = js.native
  }
  
  @JSImport("@ethersproject/abi/lib/coders/abstract-coder", "Reader")
  @js.native
  class Reader protected () extends StObject {
    def this(data: BytesLike) = this()
    def this(data: BytesLike, wordSize: Double) = this()
    def this(data: BytesLike, wordSize: js.UndefOr[scala.Nothing], coerceFunc: CoerceFunc) = this()
    def this(data: BytesLike, wordSize: Double, coerceFunc: CoerceFunc) = this()
    
    def _coerceFunc(`type`: String, value: js.Any): js.Any = js.native
    
    val _data: Uint8Array = js.native
    
    var _offset: Double = js.native
    
    def _peekBytes(offset: Double, length: Double): Uint8Array = js.native
    
    def coerce(name: String, value: js.Any): js.Any = js.native
    
    def consumed: Double = js.native
    
    def data: String = js.native
    
    def readBytes(length: Double): Uint8Array = js.native
    
    def readValue(): BigNumber = js.native
    
    def subReader(offset: Double): Reader = js.native
    
    val wordSize: Double = js.native
  }
  /* static members */
  object Reader {
    
    @JSImport("@ethersproject/abi/lib/coders/abstract-coder", "Reader.coerce")
    @js.native
    def coerce(name: String, value: js.Any): js.Any = js.native
  }
  
  @JSImport("@ethersproject/abi/lib/coders/abstract-coder", "Writer")
  @js.native
  class Writer () extends StObject {
    def this(wordSize: Double) = this()
    
    var _data: Uint8Array = js.native
    
    def _getValue(value: BigNumberish): Uint8Array = js.native
    
    var _padding: Uint8Array = js.native
    
    def _writeData(data: Uint8Array): Double = js.native
    
    def data: String = js.native
    
    def length: Double = js.native
    
    val wordSize: Double = js.native
    
    def writeBytes(value: BytesLike): Double = js.native
    
    def writeUpdatableValue(): js.Function1[/* value */ BigNumberish, Unit] = js.native
    
    def writeValue(value: BigNumberish): Double = js.native
  }
  
  @JSImport("@ethersproject/abi/lib/coders/abstract-coder", "checkResultErrors")
  @js.native
  def checkResultErrors(result: Result): js.Array[Error] = js.native
  
  type CoerceFunc = js.Function2[/* type */ String, /* value */ js.Any, js.Any]
  
  @js.native
  trait Result
    extends ReadonlyArray[js.Any]
       with /* key */ StringDictionary[js.Any]
}

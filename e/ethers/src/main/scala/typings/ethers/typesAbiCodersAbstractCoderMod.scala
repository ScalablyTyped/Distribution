package typings.ethers

import org.scalablytyped.runtime.StringDictionary
import typings.ethers.anon.Error
import typings.ethers.typesUtilsDataMod.BytesLike
import typings.ethers.typesUtilsMathsMod.BigNumberish
import typings.std.Array
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesAbiCodersAbstractCoderMod {
  
  @JSImport("ethers/types/abi/coders/abstract-coder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* note: abstract class */ @JSImport("ethers/types/abi/coders/abstract-coder", "Coder")
  @js.native
  open class Coder protected () extends StObject {
    def this(name: String, `type`: String, localName: String, dynamic: Boolean) = this()
    
    def _throwError(message: String, value: Any): scala.Nothing = js.native
    
    def decode(reader: Reader): Any = js.native
    
    def defaultValue(): Any = js.native
    
    val dynamic: Boolean = js.native
    
    def encode(writer: Writer, value: Any): Double = js.native
    
    val localName: String = js.native
    
    val name: String = js.native
    
    val `type`: String = js.native
  }
  
  @JSImport("ethers/types/abi/coders/abstract-coder", "Reader")
  @js.native
  open class Reader protected () extends StObject {
    def this(data: BytesLike) = this()
    def this(data: BytesLike, allowLoose: Boolean) = this()
    
    val allowLoose: Boolean = js.native
    
    def bytes: js.typedarray.Uint8Array = js.native
    
    def consumed: Double = js.native
    
    def data: String = js.native
    
    def dataLength: Double = js.native
    
    /* private */ var `private`: Any = js.native
    
    def readBytes(length: Double): js.typedarray.Uint8Array = js.native
    def readBytes(length: Double, loose: Boolean): js.typedarray.Uint8Array = js.native
    
    def readIndex(): Double = js.native
    
    def readValue(): js.BigInt = js.native
    
    def subReader(offset: Double): Reader = js.native
  }
  
  @JSImport("ethers/types/abi/coders/abstract-coder", "Result")
  @js.native
  open class Result protected ()
    extends StObject
       with Array[Any]
       with /* K */ StringDictionary[Any] {
    /**
      *  @private
      */
    def this(args: Any*) = this()
    
    /**
      *  Returns the value for %%name%%.
      *
      *  Since it is possible to have a key whose name conflicts with
      *  a method on a [[Result]] or its superclass Array, or any
      *  JavaScript keyword, this ensures all named values are still
      *  accessible by name.
      */
    def getValue(name: String): Any = js.native
    
    /* private */ var `private`: Any = js.native
    
    /**
      *  Returns the Result as a normal Array.
      *
      *  This will throw if there are any outstanding deferred
      *  errors.
      */
    def toArray(): js.Array[Any] = js.native
    
    /**
      *  Returns the Result as an Object with each name-value pair.
      *
      *  This will throw if any value is unnamed, or if there are
      *  any outstanding deferred errors.
      */
    def toObject(): Record[String, Any] = js.native
  }
  /* static members */
  object Result {
    
    @JSImport("ethers/types/abi/coders/abstract-coder", "Result")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      *  Creates a new [[Result]] for %%items%% with each entry
      *  also accessible by its corresponding name in %%keys%%.
      */
    inline def fromItems(items: js.Array[Any]): Result = ^.asInstanceOf[js.Dynamic].applyDynamic("fromItems")(items.asInstanceOf[js.Any]).asInstanceOf[Result]
    inline def fromItems(items: js.Array[Any], keys: js.Array[Null | String]): Result = (^.asInstanceOf[js.Dynamic].applyDynamic("fromItems")(items.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[Result]
  }
  
  @JSImport("ethers/types/abi/coders/abstract-coder", "WordSize")
  @js.native
  val WordSize: Double = js.native
  
  @JSImport("ethers/types/abi/coders/abstract-coder", "Writer")
  @js.native
  open class Writer () extends StObject {
    
    def appendWriter(writer: Writer): Double = js.native
    
    def data: String = js.native
    
    def length: Double = js.native
    
    /* private */ var `private`: Any = js.native
    
    def writeBytes(value: BytesLike): Double = js.native
    
    def writeUpdatableValue(): js.Function1[/* value */ BigNumberish, Unit] = js.native
    
    def writeValue(value: BigNumberish): Double = js.native
  }
  
  inline def checkResultErrors(result: Result): js.Array[Error] = ^.asInstanceOf[js.Dynamic].applyDynamic("checkResultErrors")(result.asInstanceOf[js.Any]).asInstanceOf[js.Array[Error]]
}

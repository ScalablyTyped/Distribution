package typings.googleProtobuf.mod

import typings.googleProtobuf.anon.InstantiableV
import typings.googleProtobuf.mod.Map.Iterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-protobuf", "Map")
@js.native
open class Map[K, V] protected () extends StObject {
  def this(arr: js.Array[js.Tuple2[K, V]]) = this()
  def this(arr: js.Array[js.Tuple2[K, V]], valueCtor: InstantiableV[V]) = this()
  
  def clear(): Unit = js.native
  
  def del(key: K): Boolean = js.native
  
  def entries(): Iterator[js.Tuple2[K, V]] = js.native
  
  def forEach(callback: js.Function2[/* entry */ V, /* key */ K, Unit]): Unit = js.native
  def forEach(callback: js.Function2[/* entry */ V, /* key */ K, Unit], thisArg: js.Object): Unit = js.native
  
  def get(key: K): js.UndefOr[V] = js.native
  
  def getEntryList(): js.Array[js.Tuple2[K, V]] = js.native
  
  def getLength(): Double = js.native
  
  def has(key: K): Boolean = js.native
  
  def keys(): Iterator[K] = js.native
  
  def serializeBinary(
    fieldNumber: Double,
    writer: BinaryWriter,
    keyWriterFn: js.Function2[/* field */ Double, /* key */ K, Unit],
    valueWriterFn: js.Function3[/* field */ Double, /* value */ V, /* writerCallback */ BinaryWriteCallback, Unit]
  ): Unit = js.native
  def serializeBinary(
    fieldNumber: Double,
    writer: BinaryWriter,
    keyWriterFn: js.Function2[/* field */ Double, /* key */ K, Unit],
    valueWriterFn: js.Function3[/* field */ Double, /* value */ V, /* writerCallback */ BinaryWriteCallback, Unit],
    writeCallback: BinaryWriteCallback
  ): Unit = js.native
  
  def set(key: K, value: V): this.type = js.native
  
  def toArray(): js.Array[js.Tuple2[K, V]] = js.native
  
  def toObject(): js.Array[js.Tuple2[K, V]] = js.native
  def toObject(includeInstance: Boolean): js.Array[js.Tuple2[K, V]] = js.native
  def toObject[VO](
    includeInstance: Boolean,
    valueToObject: js.Function2[/* includeInstance */ Boolean, /* valueWrapper */ V, VO]
  ): js.Array[js.Tuple2[K, VO]] = js.native
  
  def values(): Iterator[V] = js.native
}
/* static members */
object Map {
  
  @JSImport("google-protobuf", "Map")
  @js.native
  val ^ : js.Any = js.native
  
  inline def deserializeBinary[K, V](
    map: Map[K, V],
    reader: BinaryReader,
    keyReaderFn: js.Function1[/* reader */ BinaryReader, K],
    valueReaderFn: js.Function3[/* reader */ BinaryReader, /* value */ Any, /* readerCallback */ BinaryReadCallback, V]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(map.asInstanceOf[js.Any], reader.asInstanceOf[js.Any], keyReaderFn.asInstanceOf[js.Any], valueReaderFn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def deserializeBinary[K, V](
    map: Map[K, V],
    reader: BinaryReader,
    keyReaderFn: js.Function1[/* reader */ BinaryReader, K],
    valueReaderFn: js.Function3[/* reader */ BinaryReader, /* value */ Any, /* readerCallback */ BinaryReadCallback, V],
    readCallback: Unit,
    defaultKey: K
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(map.asInstanceOf[js.Any], reader.asInstanceOf[js.Any], keyReaderFn.asInstanceOf[js.Any], valueReaderFn.asInstanceOf[js.Any], readCallback.asInstanceOf[js.Any], defaultKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def deserializeBinary[K, V](
    map: Map[K, V],
    reader: BinaryReader,
    keyReaderFn: js.Function1[/* reader */ BinaryReader, K],
    valueReaderFn: js.Function3[/* reader */ BinaryReader, /* value */ Any, /* readerCallback */ BinaryReadCallback, V],
    readCallback: Unit,
    defaultKey: K,
    defaultValue: V
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(map.asInstanceOf[js.Any], reader.asInstanceOf[js.Any], keyReaderFn.asInstanceOf[js.Any], valueReaderFn.asInstanceOf[js.Any], readCallback.asInstanceOf[js.Any], defaultKey.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def deserializeBinary[K, V](
    map: Map[K, V],
    reader: BinaryReader,
    keyReaderFn: js.Function1[/* reader */ BinaryReader, K],
    valueReaderFn: js.Function3[/* reader */ BinaryReader, /* value */ Any, /* readerCallback */ BinaryReadCallback, V],
    readCallback: Unit,
    defaultKey: Unit,
    defaultValue: V
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(map.asInstanceOf[js.Any], reader.asInstanceOf[js.Any], keyReaderFn.asInstanceOf[js.Any], valueReaderFn.asInstanceOf[js.Any], readCallback.asInstanceOf[js.Any], defaultKey.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def deserializeBinary[K, V](
    map: Map[K, V],
    reader: BinaryReader,
    keyReaderFn: js.Function1[/* reader */ BinaryReader, K],
    valueReaderFn: js.Function3[/* reader */ BinaryReader, /* value */ Any, /* readerCallback */ BinaryReadCallback, V],
    readCallback: BinaryReadCallback
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(map.asInstanceOf[js.Any], reader.asInstanceOf[js.Any], keyReaderFn.asInstanceOf[js.Any], valueReaderFn.asInstanceOf[js.Any], readCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def deserializeBinary[K, V](
    map: Map[K, V],
    reader: BinaryReader,
    keyReaderFn: js.Function1[/* reader */ BinaryReader, K],
    valueReaderFn: js.Function3[/* reader */ BinaryReader, /* value */ Any, /* readerCallback */ BinaryReadCallback, V],
    readCallback: BinaryReadCallback,
    defaultKey: K
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(map.asInstanceOf[js.Any], reader.asInstanceOf[js.Any], keyReaderFn.asInstanceOf[js.Any], valueReaderFn.asInstanceOf[js.Any], readCallback.asInstanceOf[js.Any], defaultKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def deserializeBinary[K, V](
    map: Map[K, V],
    reader: BinaryReader,
    keyReaderFn: js.Function1[/* reader */ BinaryReader, K],
    valueReaderFn: js.Function3[/* reader */ BinaryReader, /* value */ Any, /* readerCallback */ BinaryReadCallback, V],
    readCallback: BinaryReadCallback,
    defaultKey: K,
    defaultValue: V
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(map.asInstanceOf[js.Any], reader.asInstanceOf[js.Any], keyReaderFn.asInstanceOf[js.Any], valueReaderFn.asInstanceOf[js.Any], readCallback.asInstanceOf[js.Any], defaultKey.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def deserializeBinary[K, V](
    map: Map[K, V],
    reader: BinaryReader,
    keyReaderFn: js.Function1[/* reader */ BinaryReader, K],
    valueReaderFn: js.Function3[/* reader */ BinaryReader, /* value */ Any, /* readerCallback */ BinaryReadCallback, V],
    readCallback: BinaryReadCallback,
    defaultKey: Unit,
    defaultValue: V
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(map.asInstanceOf[js.Any], reader.asInstanceOf[js.Any], keyReaderFn.asInstanceOf[js.Any], valueReaderFn.asInstanceOf[js.Any], readCallback.asInstanceOf[js.Any], defaultKey.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def fromObject[TK, TV](entries: js.Array[js.Tuple2[TK, TV]], valueCtor: Any, valueFromObject: Any): Map[TK, TV] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(entries.asInstanceOf[js.Any], valueCtor.asInstanceOf[js.Any], valueFromObject.asInstanceOf[js.Any])).asInstanceOf[Map[TK, TV]]
  
  // This is implemented by jspb.Map.ArrayIteratorIterable_, but that class shouldn't be exported
  @js.native
  trait Iterator[T] extends StObject {
    
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[Iterator[T]] = js.native
    
    def next(): IteratorResult[T] = js.native
  }
  
  trait IteratorResult[T] extends StObject {
    
    var done: Boolean
    
    var value: T
  }
  object IteratorResult {
    
    inline def apply[T](done: Boolean, value: T): IteratorResult[T] = {
      val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[IteratorResult[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IteratorResult[?], T] (val x: Self & IteratorResult[T]) extends AnyVal {
      
      inline def setDone(value: Boolean): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}

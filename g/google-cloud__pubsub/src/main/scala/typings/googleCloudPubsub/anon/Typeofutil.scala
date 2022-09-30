package typings.googleCloudPubsub.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.Buffer
import typings.protobufjs.mod.Constructor
import typings.protobufjs.mod.Enum
import typings.protobufjs.mod.FetchCallback
import typings.protobufjs.mod.Field
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.IFetchOptions
import typings.protobufjs.mod.Long
import typings.protobufjs.mod.Message
import typings.protobufjs.mod.OneOfGetter
import typings.protobufjs.mod.OneOfSetter
import typings.protobufjs.mod.PoolAllocator
import typings.protobufjs.mod.PoolSlicer
import typings.protobufjs.mod.Root
import typings.protobufjs.mod.Type
import typings.protobufjs.mod.asPromiseCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofutil extends StObject {
  
  /** Array implementation used in the browser. `Uint8Array` if supported, otherwise `Array`. */
  var Array: Constructor[js.typedarray.Uint8Array] = js.native
  
  /** Node's Buffer class if available. */
  var Buffer: Constructor[typings.protobufjs.mod.Buffer] = js.native
  
  /** A minimal event emitter. */
  var EventEmitter: Instantiable0[typings.googleGax.mod.fallback.protobuf.util.EventEmitter] = js.native
  
  /** Long.js's Long class if available. */
  var Long: Constructor[typings.protobufjs.mod.Long] = js.native
  
  /** Helper class for working with the low and high bits of a 64 bit value. */
  var LongBits: (Instantiable2[
    /* lo */ Double, 
    /* hi */ Double, 
    typings.googleGax.mod.fallback.protobuf.util.LongBits
  ]) & TypeofLongBits = js.native
  
  /** Error subclass indicating a protocol specifc error. */
  var ProtocolError: Instantiable1[
    /* message */ String, 
    typings.googleGax.mod.fallback.protobuf.util.ProtocolError[Message[/* import warning: RewrittenClass.unapply cls was tparam T */ Any]]
  ] = js.native
  
  /**
    * Returns a promise from a node-style callback function.
    * @param fn Function to call
    * @param ctx Function context
    * @param params Function arguments
    * @returns Promisified function
    */
  def asPromise(fn: asPromiseCallback, ctx: Any, params: Any*): js.Promise[Any] = js.native
  
  /** A minimal base64 implementation for number arrays. */
  val base64: Typeofbase64 = js.native
  
  /**
    * Converts a string to camel case.
    * @param str String to convert
    * @returns Converted string
    */
  def camelCase(str: String): String = js.native
  
  val codegen: Typeofcodegen = js.native
  
  /**
    * Compares reflected fields by id.
    * @param a First field
    * @param b Second field
    * @returns Comparison value
    */
  def compareFieldsById(a: Field, b: Field): Double = js.native
  
  /**
    * Decorator helper for enums (TypeScript).
    * @param object Enum object
    * @returns Reflected enum
    */
  def decorateEnum(`object`: js.Object): Enum = js.native
  
  /** Decorator root (TypeScript). */
  var decorateRoot: Root = js.native
  
  /**
    * Decorator helper for types (TypeScript).
    * @param ctor Constructor function
    * @param [typeName] Type name, defaults to the constructor's name
    * @returns Reflected type
    */
  def decorateType[T /* <: Message[T] */](ctor: Constructor[T]): Type = js.native
  def decorateType[T /* <: Message[T] */](ctor: Constructor[T], typeName: String): Type = js.native
  
  /** An immuable empty array. */
  val emptyArray: js.Array[Any] = js.native
  
  /** An immutable empty object. */
  val emptyObject: js.Object = js.native
  
  /**
    * Fetches the contents of a file.
    * @param filename File path or url
    * @param options Fetch options
    * @param callback Callback function
    */
  def fetch(filename: String, options: IFetchOptions, callback: FetchCallback): Unit = js.native
  /**
    * Fetches the contents of a file.
    * @param path File path or url
    * @param [options] Fetch options
    * @returns Promise
    */
  def fetch(path: String): js.Promise[String | js.typedarray.Uint8Array] = js.native
  /**
    * Fetches the contents of a file.
    * @param path File path or url
    * @param callback Callback function
    */
  def fetch(path: String, callback: FetchCallback): Unit = js.native
  def fetch(path: String, options: IFetchOptions): js.Promise[String | js.typedarray.Uint8Array] = js.native
  
  /** Reads / writes floats / doubles from / to buffers. */
  val float: Typeoffloat = js.native
  
  /** Node's fs module if available. */
  val fs: Any = js.native
  
  /** Global object reference. */
  var global: js.Object = js.native
  
  /**
    * Requires a module only if available.
    * @param moduleName Module to require
    * @returns Required module if available and not empty, otherwise `null`
    */
  def inquire(moduleName: String): js.Object = js.native
  
  /**
    * Tests if the specified value is an integer.
    * @param value Value to test
    * @returns `true` if the value is an integer
    */
  def isInteger(value: Any): Boolean = js.native
  
  /** Whether running within node or not. */
  var isNode: Boolean = js.native
  
  /**
    * Tests if the specified value is a non-null object.
    * @param value Value to test
    * @returns `true` if the value is a non-null object
    */
  def isObject(value: Any): Boolean = js.native
  
  /**
    * Tests whether the specified name is a reserved word in JS.
    * @param name Name to test
    * @returns `true` if reserved, otherwise `false`
    */
  def isReserved(name: String): Boolean = js.native
  
  /**
    * Checks if a property on a message is considered to be present.
    * @param obj Plain object or message instance
    * @param prop Property name
    * @returns `true` if considered to be present, otherwise `false`
    */
  def isSet(obj: js.Object, prop: String): Boolean = js.native
  
  /**
    * Tests if the specified value is a string.
    * @param value Value to test
    * @returns `true` if the value is a string
    */
  def isString(value: Any): Boolean = js.native
  
  /**
    * Checks if a property on a message is considered to be present.
    * This is an alias of {@link util.isSet}.
    * @param obj Plain object or message instance
    * @param prop Property name
    * @returns `true` if considered to be present, otherwise `false`
    */
  def isset(obj: js.Object, prop: String): Boolean = js.native
  
  /** Regular expression used to verify 2 bit (`bool`) map keys. */
  val key2Re: js.RegExp = js.native
  
  /** Regular expression used to verify 32 bit (`int32` etc.) map keys. */
  val key32Re: js.RegExp = js.native
  
  /** Regular expression used to verify 64 bit (`int64` etc.) map keys. */
  val key64Re: js.RegExp = js.native
  
  /**
    * Converts the first character of a string to lower case.
    * @param str String to convert
    * @returns Converted string
    */
  def lcFirst(str: String): String = js.native
  
  /**
    * Converts an 8 characters long hash string to a long or number.
    * @param hash Hash
    * @param [unsigned=false] Whether unsigned or not
    * @returns Original value
    */
  def longFromHash(hash: String): Long | Double = js.native
  def longFromHash(hash: String, unsigned: Boolean): Long | Double = js.native
  
  def longToHash(value: Double): String = js.native
  /**
    * Converts a number or long to an 8 characters long hash string.
    * @param value Value to convert
    * @returns Hash
    */
  def longToHash(value: Long): String = js.native
  
  /**
    * Merges the properties of the source object into the destination object.
    * @param dst Destination object
    * @param src Source object
    * @param [ifNotSet=false] Merges only if the key is not already set
    * @returns Destination object
    */
  def merge(dst: StringDictionary[Any], src: StringDictionary[Any]): StringDictionary[Any] = js.native
  def merge(dst: StringDictionary[Any], src: StringDictionary[Any], ifNotSet: Boolean): StringDictionary[Any] = js.native
  
  /**
    * Creates a new buffer of whatever type supported by the environment.
    * @param [sizeOrArray=0] Buffer size or number array
    * @returns Buffer
    */
  def newBuffer(): js.typedarray.Uint8Array | Buffer = js.native
  def newBuffer(sizeOrArray: js.Array[Double]): js.typedarray.Uint8Array | Buffer = js.native
  def newBuffer(sizeOrArray: Double): js.typedarray.Uint8Array | Buffer = js.native
  
  /**
    * Creates a custom error constructor.
    * @param name Error name
    * @returns Custom error constructor
    */
  def newError(name: String): Constructor[js.Error] = js.native
  
  /**
    * Builds a getter for a oneof's present field name.
    * @param fieldNames Field names
    * @returns Unbound getter
    */
  def oneOfGetter(fieldNames: js.Array[String]): OneOfGetter = js.native
  
  /**
    * Builds a setter for a oneof's present field name.
    * @param fieldNames Field names
    * @returns Unbound setter
    */
  def oneOfSetter(fieldNames: js.Array[String]): OneOfSetter = js.native
  
  /** A minimal path module to resolve Unix, Windows and URL paths alike. */
  val path: Typeofpath = js.native
  
  /**
    * A general purpose buffer pool.
    * @param alloc Allocator
    * @param slice Slicer
    * @param [size=8192] Slab size
    * @returns Pooled allocator
    */
  def pool(alloc: PoolAllocator, slice: PoolSlicer): PoolAllocator = js.native
  def pool(alloc: PoolAllocator, slice: PoolSlicer, size: Double): PoolAllocator = js.native
  
  /**
    * Returns a safe property accessor for the specified property name.
    * @param prop Property name
    * @returns Safe accessor
    */
  def safeProp(prop: String): String = js.native
  
  /**
    * Sets the value of a property by property path. If a value already exists, it is turned to an array
    * @param dst Destination object
    * @param path dot '.' delimited path of the property to set
    * @param value the value to set
    * @returns Destination object
    */
  def setProperty(dst: StringDictionary[Any], path: String, value: js.Object): StringDictionary[Any] = js.native
  
  /**
    * Converts an object's values to an array.
    * @param object Object to convert
    * @returns Converted array
    */
  def toArray(`object`: StringDictionary[Any]): js.Array[Any] = js.native
  
  /**
    * Default conversion options used for {@link Message#toJSON} implementations.
    *
    * These options are close to proto3's JSON mapping with the exception that internal types like Any are handled just like messages. More precisely:
    *
    * - Longs become strings
    * - Enums become string keys
    * - Bytes become base64 encoded strings
    * - (Sub-)Messages become plain objects
    * - Maps become plain objects with all string keys
    * - Repeated fields become arrays
    * - NaN and Infinity for float and double fields become strings
    *
    * @see https://developers.google.com/protocol-buffers/docs/proto3?hl=en#json
    */
  var toJSONOptions: IConversionOptions = js.native
  
  /**
    * Converts an array of keys immediately followed by their respective value to an object, omitting undefined values.
    * @param array Array to convert
    * @returns Converted object
    */
  def toObject(array: js.Array[Any]): StringDictionary[Any] = js.native
  
  /**
    * Converts the first character of a string to upper case.
    * @param str String to convert
    * @returns Converted string
    */
  def ucFirst(str: String): String = js.native
  
  /** A minimal UTF8 implementation for number arrays. */
  val utf8: Typeofutf8 = js.native
}

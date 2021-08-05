package typings.easyXHeaders

import org.scalablytyped.runtime.Shortcut
import typings.easyXHeaders.NodeJS.Global
import typings.easyXHeaders.NodeJS.Process
import typings.easyXHeaders.NodeJS.Timer
import typings.std.ArrayBufferLike
import typings.std.ArrayLike
import typings.std.Iterable
import typings.std.PropertyKey
import typings.std.Uint8Array
import typings.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("Buffer")
  @js.native
  class Buffer protected ()
    extends StObject
       with typings.node.Buffer {
    /**
      * Allocates a new buffer containing the given {array} of octets.
      *
      * @param array The octets to store.
      */
    def this(array: js.Array[js.Any]) = this()
    /**
      * Allocates a new buffer containing the given {array} of octets.
      *
      * @param array The octets to store.
      */
    def this(array: Uint8Array) = this()
    /**
      * Allocates a new buffer of {size} octets.
      *
      * @param size count of octets to allocate.
      */
    def this(size: Double) = this()
    /**
      * Allocates a new buffer containing the given {str}.
      *
      * @param str String to store in buffer.
      * @param encoding encoding to use, optional.  Default is 'utf8'
      */
    def this(str: String) = this()
    def this(str: String, encoding: String) = this()
  }
  /**
    * Raw data is stored in instances of the Buffer class.
    * A Buffer is similar to an array of integers but corresponds to a raw memory allocation outside the V8 heap.  A Buffer cannot be resized.
    * Valid string encodings: 'ascii'|'utf8'|'utf16le'|'ucs2'(alias of 'utf16le')|'base64'|'binary'(deprecated)|'hex'
    */
  object Buffer {
    
    @JSGlobal("Buffer")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Gives the actual byte length of a string. encoding defaults to 'utf8'.
      * This is not the same as String.prototype.length since that returns the number of characters in a string.
      *
      * @param string string to test.
      * @param encoding encoding used to evaluate (defaults to 'utf8')
      */
    inline def byteLength(string: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("byteLength")(string.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def byteLength(string: String, encoding: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("byteLength")(string.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * The same as buf1.compare(buf2).
      */
    inline def compare(buf1: typings.node.Buffer, buf2: typings.node.Buffer): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(buf1.asInstanceOf[js.Any], buf2.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Returns a buffer which is the result of concatenating all the buffers in the list together.
      *
      * If the list has no items, or if the totalLength is 0, then it returns a zero-length buffer.
      * If the list has exactly one item, then the first item of the list is returned.
      * If the list has more than one item, then a new Buffer is created.
      *
      * @param list An array of Buffer objects to concatenate
      * @param totalLength Total length of the buffers when concatenated.
      *   If totalLength is not provided, it is read from the buffers in the list. However, this adds an additional loop to the function, so it is faster to provide the length explicitly.
      */
    inline def concat(list: js.Array[typings.node.Buffer]): typings.node.Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(list.asInstanceOf[js.Any]).asInstanceOf[typings.node.Buffer]
    inline def concat(list: js.Array[typings.node.Buffer], totalLength: Double): typings.node.Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(list.asInstanceOf[js.Any], totalLength.asInstanceOf[js.Any])).asInstanceOf[typings.node.Buffer]
    
    /**
      * Returns true if {obj} is a Buffer
      *
      * @param obj object to test.
      */
    inline def isBuffer(obj: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBuffer")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Returns true if {encoding} is a valid encoding argument.
      * Valid string encodings in Node 0.12: 'ascii'|'utf8'|'utf16le'|'ucs2'(alias of 'utf16le')|'base64'|'binary'(deprecated)|'hex'
      *
      * @param encoding string to test.
      */
    inline def isEncoding(encoding: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEncoding")(encoding.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("SlowBuffer")
  @js.native
  class SlowBuffer protected ()
    extends StObject
       with typings.node.Buffer {
    def this(array: js.Array[js.Any]) = this()
    def this(size: Double) = this()
    def this(size: Uint8Array) = this()
    def this(str: String) = this()
    def this(str: String, encoding: String) = this()
  }
  object SlowBuffer {
    
    @JSGlobal("SlowBuffer")
    @js.native
    val ^ : js.Any = js.native
    
    inline def byteLength(string: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("byteLength")(string.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def byteLength(string: String, encoding: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("byteLength")(string.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def concat(list: js.Array[typings.node.Buffer]): typings.node.Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(list.asInstanceOf[js.Any]).asInstanceOf[typings.node.Buffer]
    inline def concat(list: js.Array[typings.node.Buffer], totalLength: Double): typings.node.Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(list.asInstanceOf[js.Any], totalLength.asInstanceOf[js.Any])).asInstanceOf[typings.node.Buffer]
    
    inline def isBuffer(obj: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBuffer")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  inline def clearImmediate(immediateId: js.Any): Unit = js.Dynamic.global.applyDynamic("clearImmediate")(immediateId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def clearInterval(intervalId: Timer): Unit = js.Dynamic.global.applyDynamic("clearInterval")(intervalId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def clearTimeout(timeoutId: Timer): Unit = js.Dynamic.global.applyDynamic("clearTimeout")(timeoutId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSGlobal("__dirname")
  @js.native
  def dirname: String = js.native
  
  inline def dirname_=(x: String): Unit = js.Dynamic.global.updateDynamic("__dirname")(x.asInstanceOf[js.Any])
  
  // Same as module.exports
  @JSGlobal("exports")
  @js.native
  def exports: js.Any = js.native
  inline def exports_=(x: js.Any): Unit = js.Dynamic.global.updateDynamic("exports")(x.asInstanceOf[js.Any])
  
  @JSGlobal("__filename")
  @js.native
  def filename: String = js.native
  
  inline def filename_=(x: String): Unit = js.Dynamic.global.updateDynamic("__filename")(x.asInstanceOf[js.Any])
  
  object global extends Shortcut {
    
    @JSGlobal("global")
    @js.native
    val ^ : Global = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("global.Array")
    @js.native
    class Array[T] protected ()
      extends StObject
         with typings.std.Array[T] {
      def this(arrayLength: Double) = this()
      def this(items: T*) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("global.ArrayBuffer")
    @js.native
    class ArrayBuffer protected ()
      extends StObject
         with typings.std.ArrayBuffer {
      def this(byteLength: Double) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("global.Boolean")
    @js.native
    class Boolean ()
      extends StObject
         with typings.std.Boolean {
      def this(value: js.Any) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("global.Buffer")
    @js.native
    class Buffer protected ()
      extends StObject
         with typings.node.Buffer {
      /**
        * Allocates a new buffer containing the given {array} of octets.
        *
        * @param array The octets to store.
        */
      def this(array: js.Array[js.Any]) = this()
      /**
        * Allocates a new buffer containing the given {array} of octets.
        *
        * @param array The octets to store.
        */
      def this(array: typings.std.Uint8Array) = this()
      /**
        * Allocates a new buffer of {size} octets.
        *
        * @param size count of octets to allocate.
        */
      def this(size: Double) = this()
      /**
        * Allocates a new buffer containing the given {str}.
        *
        * @param str String to store in buffer.
        * @param encoding encoding to use, optional.  Default is 'utf8'
        */
      def this(str: java.lang.String) = this()
      def this(str: java.lang.String, encoding: java.lang.String) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("global.DataView")
    @js.native
    class DataView protected ()
      extends StObject
         with typings.std.DataView {
      def this(buffer: ArrayBufferLike) = this()
      def this(buffer: ArrayBufferLike, byteOffset: Double) = this()
      def this(buffer: ArrayBufferLike, byteOffset: Double, byteLength: Double) = this()
      def this(buffer: ArrayBufferLike, byteOffset: Unit, byteLength: Double) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("global.Date")
    @js.native
    class Date ()
      extends StObject
         with typings.std.Date {
      def this(value: java.lang.String) = this()
      def this(value: Double) = this()
      def this(value: typings.std.Date) = this()
      def this(vd: VarDate) = this()
      def this(year: Double, month: Double) = this()
      def this(year: Double, month: Double, date: Double) = this()
      def this(year: Double, month: Double, date: Double, hours: Double) = this()
      def this(year: Double, month: Double, date: Unit, hours: Double) = this()
      def this(year: Double, month: Double, date: Double, hours: Double, minutes: Double) = this()
      def this(year: Double, month: Double, date: Double, hours: Unit, minutes: Double) = this()
      def this(year: Double, month: Double, date: Unit, hours: Double, minutes: Double) = this()
      def this(year: Double, month: Double, date: Unit, hours: Unit, minutes: Double) = this()
      def this(year: Double, month: Double, date: Double, hours: Double, minutes: Double, seconds: Double) = this()
      def this(year: Double, month: Double, date: Double, hours: Double, minutes: Unit, seconds: Double) = this()
      def this(year: Double, month: Double, date: Double, hours: Unit, minutes: Double, seconds: Double) = this()
      def this(year: Double, month: Double, date: Double, hours: Unit, minutes: Unit, seconds: Double) = this()
      def this(year: Double, month: Double, date: Unit, hours: Double, minutes: Double, seconds: Double) = this()
      def this(year: Double, month: Double, date: Unit, hours: Double, minutes: Unit, seconds: Double) = this()
      def this(year: Double, month: Double, date: Unit, hours: Unit, minutes: Double, seconds: Double) = this()
      def this(year: Double, month: Double, date: Unit, hours: Unit, minutes: Unit, seconds: Double) = this()
      def this(
        year: Double,
        month: Double,
        date: Double,
        hours: Double,
        minutes: Double,
        seconds: Double,
        ms: Double
      ) = this()
      def this(
        year: Double,
        month: Double,
        date: Double,
        hours: Double,
        minutes: Double,
        seconds: Unit,
        ms: Double
      ) = this()
      def this(
        year: Double,
        month: Double,
        date: Double,
        hours: Double,
        minutes: Unit,
        seconds: Double,
        ms: Double
      ) = this()
      def this(year: Double, month: Double, date: Double, hours: Double, minutes: Unit, seconds: Unit, ms: Double) = this()
      def this(
        year: Double,
        month: Double,
        date: Double,
        hours: Unit,
        minutes: Double,
        seconds: Double,
        ms: Double
      ) = this()
      def this(year: Double, month: Double, date: Double, hours: Unit, minutes: Double, seconds: Unit, ms: Double) = this()
      def this(year: Double, month: Double, date: Double, hours: Unit, minutes: Unit, seconds: Double, ms: Double) = this()
      def this(year: Double, month: Double, date: Double, hours: Unit, minutes: Unit, seconds: Unit, ms: Double) = this()
      def this(
        year: Double,
        month: Double,
        date: Unit,
        hours: Double,
        minutes: Double,
        seconds: Double,
        ms: Double
      ) = this()
      def this(year: Double, month: Double, date: Unit, hours: Double, minutes: Double, seconds: Unit, ms: Double) = this()
      def this(year: Double, month: Double, date: Unit, hours: Double, minutes: Unit, seconds: Double, ms: Double) = this()
      def this(year: Double, month: Double, date: Unit, hours: Double, minutes: Unit, seconds: Unit, ms: Double) = this()
      def this(year: Double, month: Double, date: Unit, hours: Unit, minutes: Double, seconds: Double, ms: Double) = this()
      def this(year: Double, month: Double, date: Unit, hours: Unit, minutes: Double, seconds: Unit, ms: Double) = this()
      def this(year: Double, month: Double, date: Unit, hours: Unit, minutes: Unit, seconds: Double, ms: Double) = this()
      def this(year: Double, month: Double, date: Unit, hours: Unit, minutes: Unit, seconds: Unit, ms: Double) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("global.Error")
    @js.native
    class Error ()
      extends StObject
         with typings.std.Error {
      def this(message: java.lang.String) = this()
      
      /* CompleteClass */
      var message: java.lang.String = js.native
      
      /* CompleteClass */
      var name: java.lang.String = js.native
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("global.EvalError")
    @js.native
    class EvalError ()
      extends StObject
         with typings.std.Error {
      def this(message: java.lang.String) = this()
      
      /* CompleteClass */
      var message: java.lang.String = js.native
      
      /* CompleteClass */
      var name: java.lang.String = js.native
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("global.Float32Array")
    @js.native
    class Float32Array ()
      extends StObject
         with typings.std.Float32Array {
      def this(array: ArrayBufferLike) = this()
      def this(array: ArrayLike[Double]) = this()
      def this(elements: Iterable[Double]) = this()
      def this(length: Double) = this()
      def this(buffer: ArrayBufferLike, byteOffset: Double) = this()
      def this(buffer: ArrayBufferLike, byteOffset: Double, length: Double) = this()
      def this(buffer: ArrayBufferLike, byteOffset: Unit, length: Double) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("global.Float64Array")
    @js.native
    class Float64Array ()
      extends StObject
         with typings.std.Float64Array {
      def this(array: ArrayBufferLike) = this()
      def this(array: ArrayLike[Double]) = this()
      def this(elements: Iterable[Double]) = this()
      def this(length: Double) = this()
      def this(buffer: ArrayBufferLike, byteOffset: Double) = this()
      def this(buffer: ArrayBufferLike, byteOffset: Double, length: Double) = this()
      def this(buffer: ArrayBufferLike, byteOffset: Unit, length: Double) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("global.Function")
    @js.native
    class Function protected ()
      extends js.Function {
      /**
        * Creates a new function.
        * @param args A list of arguments the function accepts.
        */
      def this(args: java.lang.String*) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("global.Int16Array")
    @js.native
    class Int16Array ()
      extends StObject
         with typings.std.Int16Array {
      def this(array: ArrayBufferLike) = this()
      def this(array: ArrayLike[Double]) = this()
      def this(elements: Iterable[Double]) = this()
      def this(length: Double) = this()
      def this(buffer: ArrayBufferLike, byteOffset: Double) = this()
      def this(buffer: ArrayBufferLike, byteOffset: Double, length: Double) = this()
      def this(buffer: ArrayBufferLike, byteOffset: Unit, length: Double) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("global.Int32Array")
    @js.native
    class Int32Array ()
      extends StObject
         with typings.std.Int32Array {
      def this(array: ArrayBufferLike) = this()
      def this(array: ArrayLike[Double]) = this()
      def this(elements: Iterable[Double]) = this()
      def this(length: Double) = this()
      def this(buffer: ArrayBufferLike, byteOffset: Double) = this()
      def this(buffer: ArrayBufferLike, byteOffset: Double, length: Double) = this()
      def this(buffer: ArrayBufferLike, byteOffset: Unit, length: Double) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("global.Int8Array")
    @js.native
    class Int8Array ()
      extends StObject
         with typings.std.Int8Array {
      def this(array: ArrayBufferLike) = this()
      def this(array: ArrayLike[Double]) = this()
      def this(elements: Iterable[Double]) = this()
      def this(length: Double) = this()
      def this(buffer: ArrayBufferLike, byteOffset: Double) = this()
      def this(buffer: ArrayBufferLike, byteOffset: Double, length: Double) = this()
      def this(buffer: ArrayBufferLike, byteOffset: Unit, length: Double) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("global.Map")
    @js.native
    class Map[K, V] ()
      extends StObject
         with typings.std.Map[K, V] {
      def this(entries: js.Array[js.Tuple2[K, V]]) = this()
      def this(iterable: Iterable[js.Tuple2[K, V]]) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("global.Number")
    @js.native
    class Number ()
      extends StObject
         with typings.std.Number {
      def this(value: js.Any) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("global.Object")
    @js.native
    class Object ()
      extends StObject
         with typings.std.Object {
      def this(value: js.Any) = this()
      
      /** The initial value of Object.prototype.constructor is the standard built-in Object constructor. */
      /* CompleteClass */
      var constructor: js.Function = js.native
      
      /**
        * Determines whether an object has a property with the specified name.
        * @param v A property name.
        */
      /* CompleteClass */
      override def hasOwnProperty(v: PropertyKey): scala.Boolean = js.native
      
      /**
        * Determines whether a specified property is enumerable.
        * @param v A property name.
        */
      /* CompleteClass */
      override def propertyIsEnumerable(v: PropertyKey): scala.Boolean = js.native
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("global.RangeError")
    @js.native
    class RangeError ()
      extends StObject
         with typings.std.Error {
      def this(message: java.lang.String) = this()
      
      /* CompleteClass */
      var message: java.lang.String = js.native
      
      /* CompleteClass */
      var name: java.lang.String = js.native
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("global.ReferenceError")
    @js.native
    class ReferenceError ()
      extends StObject
         with typings.std.Error {
      def this(message: java.lang.String) = this()
      
      /* CompleteClass */
      var message: java.lang.String = js.native
      
      /* CompleteClass */
      var name: java.lang.String = js.native
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("global.RegExp")
    @js.native
    class RegExp protected ()
      extends StObject
         with typings.std.RegExp {
      def this(pattern: java.lang.String) = this()
      def this(pattern: typings.std.RegExp) = this()
      def this(pattern: java.lang.String, flags: java.lang.String) = this()
      def this(pattern: typings.std.RegExp, flags: java.lang.String) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("global.Set")
    @js.native
    class Set[T] ()
      extends StObject
         with typings.std.Set[T] {
      def this(values: js.Array[T]) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("global.String")
    @js.native
    class String ()
      extends StObject
         with typings.std.String {
      def this(value: js.Any) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("global.SyntaxError")
    @js.native
    class SyntaxError ()
      extends StObject
         with typings.std.Error {
      def this(message: java.lang.String) = this()
      
      /* CompleteClass */
      var message: java.lang.String = js.native
      
      /* CompleteClass */
      var name: java.lang.String = js.native
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("global.TypeError")
    @js.native
    class TypeError ()
      extends StObject
         with typings.std.Error {
      def this(message: java.lang.String) = this()
      
      /* CompleteClass */
      var message: java.lang.String = js.native
      
      /* CompleteClass */
      var name: java.lang.String = js.native
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("global.URIError")
    @js.native
    class URIError ()
      extends StObject
         with typings.std.Error {
      def this(message: java.lang.String) = this()
      
      /* CompleteClass */
      var message: java.lang.String = js.native
      
      /* CompleteClass */
      var name: java.lang.String = js.native
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("global.Uint16Array")
    @js.native
    class Uint16Array ()
      extends StObject
         with typings.std.Uint16Array {
      def this(array: ArrayBufferLike) = this()
      def this(array: ArrayLike[Double]) = this()
      def this(elements: Iterable[Double]) = this()
      def this(length: Double) = this()
      def this(buffer: ArrayBufferLike, byteOffset: Double) = this()
      def this(buffer: ArrayBufferLike, byteOffset: Double, length: Double) = this()
      def this(buffer: ArrayBufferLike, byteOffset: Unit, length: Double) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("global.Uint32Array")
    @js.native
    class Uint32Array ()
      extends StObject
         with typings.std.Uint32Array {
      def this(array: ArrayBufferLike) = this()
      def this(array: ArrayLike[Double]) = this()
      def this(elements: Iterable[Double]) = this()
      def this(length: Double) = this()
      def this(buffer: ArrayBufferLike, byteOffset: Double) = this()
      def this(buffer: ArrayBufferLike, byteOffset: Double, length: Double) = this()
      def this(buffer: ArrayBufferLike, byteOffset: Unit, length: Double) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("global.Uint8Array")
    @js.native
    class Uint8Array ()
      extends StObject
         with typings.std.Uint8Array {
      def this(array: ArrayBufferLike) = this()
      def this(array: ArrayLike[Double]) = this()
      def this(elements: Iterable[Double]) = this()
      def this(length: Double) = this()
      def this(buffer: ArrayBufferLike, byteOffset: Double) = this()
      def this(buffer: ArrayBufferLike, byteOffset: Double, length: Double) = this()
      def this(buffer: ArrayBufferLike, byteOffset: Unit, length: Double) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("global.WeakMap")
    @js.native
    class WeakMap[K /* <: js.Object */, V] ()
      extends StObject
         with typings.std.WeakMap[K, V] {
      def this(entries: js.Array[js.Tuple2[K, V]]) = this()
    }
    
    type _To = Global
    
    /* This means you don't have to write `^`, but can instead just say `global.foo` */
    override def _to: Global = ^
  }
  
  object module {
    
    @JSGlobal("module")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("module.children")
    @js.native
    def children: js.Array[js.Any] = js.native
    inline def children_=(x: js.Array[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
    
    @JSGlobal("module.exports")
    @js.native
    def exports: js.Any = js.native
    inline def exports_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("exports")(x.asInstanceOf[js.Any])
    
    @JSGlobal("module.filename")
    @js.native
    def filename: String = js.native
    inline def filename_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("filename")(x.asInstanceOf[js.Any])
    
    @JSGlobal("module.id")
    @js.native
    def id: String = js.native
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
    
    @JSGlobal("module.loaded")
    @js.native
    def loaded: Boolean = js.native
    inline def loaded_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("loaded")(x.asInstanceOf[js.Any])
    
    @JSGlobal("module.parent")
    @js.native
    def parent: js.Any = js.native
    inline def parent_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parent")(x.asInstanceOf[js.Any])
    
    inline def require(id: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("require")(id.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  }
  
  @JSGlobal("process")
  @js.native
  def process: Process = js.native
  inline def process_=(x: Process): Unit = js.Dynamic.global.updateDynamic("process")(x.asInstanceOf[js.Any])
  
  object require {
    
    inline def apply(id: String): js.Any = ^.asInstanceOf[js.Dynamic].apply(id.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    @JSGlobal("require")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("require.cache")
    @js.native
    def cache: js.Any = js.native
    inline def cache_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cache")(x.asInstanceOf[js.Any])
    
    @JSGlobal("require.extensions")
    @js.native
    def extensions: js.Any = js.native
    inline def extensions_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
    
    @JSGlobal("require.main")
    @js.native
    def main: js.Any = js.native
    inline def main_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("main")(x.asInstanceOf[js.Any])
    
    inline def resolve(id: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(id.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  inline def setImmediate(callback: js.Function1[/* repeated */ js.Any, Unit], args: js.Any*): js.Any = (js.Dynamic.global.applyDynamic("setImmediate")(callback.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def setInterval(callback: js.Function1[/* repeated */ js.Any, Unit], ms: Double, args: js.Any*): Timer = (js.Dynamic.global.applyDynamic("setInterval")(callback.asInstanceOf[js.Any], ms.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Timer]
  
  inline def setTimeout(callback: js.Function1[/* repeated */ js.Any, Unit], ms: Double, args: js.Any*): Timer = (js.Dynamic.global.applyDynamic("setTimeout")(callback.asInstanceOf[js.Any], ms.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Timer]
  
  /************************************************
  *                                               *
  *               GLOBAL INTERFACES               *
  *                                               *
  ************************************************/
  object NodeJS
}

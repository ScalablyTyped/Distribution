package typings.doublearray

import typings.doublearray.anon.All
import typings.std.Int16Array
import typings.std.Int32Array
import typings.std.Int8Array
import typings.std.Uint16Array
import typings.std.Uint32Array
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object doublearray {
  
  @js.native
  trait BaseAndCheck extends StObject {
    
    def calc(): All = js.native
    
    def dump(): String = js.native
    
    def getBase(): Double = js.native
    
    def getBaseBuffer(): js.Any = js.native
    
    def getCheck(): Double = js.native
    
    // Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array
    def getCheckBuffer(): js.Any = js.native
    
    def getFirstUnusedNode(): Double = js.native
    
    def loadBaseBuffer(base_buffer: Int16Array): BaseAndCheck = js.native
    def loadBaseBuffer(base_buffer: Int32Array): BaseAndCheck = js.native
    // Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array
    def loadBaseBuffer(base_buffer: Int8Array): BaseAndCheck = js.native
    def loadBaseBuffer(base_buffer: Uint16Array): BaseAndCheck = js.native
    def loadBaseBuffer(base_buffer: Uint32Array): BaseAndCheck = js.native
    def loadBaseBuffer(base_buffer: Uint8Array): BaseAndCheck = js.native
    
    def loadCheckBuffer(check_buffer: Int16Array): BaseAndCheck = js.native
    def loadCheckBuffer(check_buffer: Int32Array): BaseAndCheck = js.native
    def loadCheckBuffer(check_buffer: Int8Array): BaseAndCheck = js.native
    def loadCheckBuffer(check_buffer: Uint16Array): BaseAndCheck = js.native
    def loadCheckBuffer(check_buffer: Uint32Array): BaseAndCheck = js.native
    def loadCheckBuffer(check_buffer: Uint8Array): BaseAndCheck = js.native
    
    def setBase(index: Double, base_value: Double): Unit = js.native
    
    def setCheck(index: Double, check_value: Double): Unit = js.native
    
    def setFirstUnusedNode(index: Double): Unit = js.native
    
    def shrink(): Unit = js.native
    
    def size(): Double = js.native
  }
  
  trait DoubleArray extends StObject {
    
    var bc: BaseAndCheck
    
    def calc(): All
    
    def commonPrefixSearch(key: String): KeyValue
    
    def contain(key: String): Boolean
    
    def dump(): String
    
    def lookup(key: String): Double
    
    def size(): Double
    
    def traverse(parent: Double, code: Double): Double
  }
  object DoubleArray {
    
    @scala.inline
    def apply(
      bc: BaseAndCheck,
      calc: () => All,
      commonPrefixSearch: String => KeyValue,
      contain: String => Boolean,
      dump: () => String,
      lookup: String => Double,
      size: () => Double,
      traverse: (Double, Double) => Double
    ): DoubleArray = {
      val __obj = js.Dynamic.literal(bc = bc.asInstanceOf[js.Any], calc = js.Any.fromFunction0(calc), commonPrefixSearch = js.Any.fromFunction1(commonPrefixSearch), contain = js.Any.fromFunction1(contain), dump = js.Any.fromFunction0(dump), lookup = js.Any.fromFunction1(lookup), size = js.Any.fromFunction0(size), traverse = js.Any.fromFunction2(traverse))
      __obj.asInstanceOf[DoubleArray]
    }
    
    @scala.inline
    implicit class DoubleArrayMutableBuilder[Self <: DoubleArray] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBc(value: BaseAndCheck): Self = StObject.set(x, "bc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCalc(value: () => All): Self = StObject.set(x, "calc", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCommonPrefixSearch(value: String => KeyValue): Self = StObject.set(x, "commonPrefixSearch", js.Any.fromFunction1(value))
      
      @scala.inline
      def setContain(value: String => Boolean): Self = StObject.set(x, "contain", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDump(value: () => String): Self = StObject.set(x, "dump", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLookup(value: String => Double): Self = StObject.set(x, "lookup", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSize(value: () => Double): Self = StObject.set(x, "size", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTraverse(value: (Double, Double) => Double): Self = StObject.set(x, "traverse", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait DoubleArrayBuilder extends StObject {
    
    def append(key: String, record: Double): DoubleArrayBuilder = js.native
    
    var bc: BaseAndCheck = js.native
    
    def build(): DoubleArray = js.native
    def build(keys: js.Array[KeyValue]): DoubleArray = js.native
    def build(keys: js.Array[KeyValue], sorted: Boolean): DoubleArray = js.native
    def build(keys: Unit, sorted: Boolean): DoubleArray = js.native
    
    def findAllocatableBase(children_info: Int32Array): Double = js.native
    
    def getChildrenInfo(position: Double, start: Double, length: Double): Int32Array = js.native
    
    def isUnusedNode(index: Double): Boolean = js.native
    
    var keys: js.Array[KeyValue] = js.native
    
    def setBC(parent_id: Double, children_info: Int32Array, _base: Double): Unit = js.native
  }
  
  trait KeyValue extends StObject {
    
    var k: String
    
    var v: Double
  }
  object KeyValue {
    
    @scala.inline
    def apply(k: String, v: Double): KeyValue = {
      val __obj = js.Dynamic.literal(k = k.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyValue]
    }
    
    @scala.inline
    implicit class KeyValueMutableBuilder[Self <: KeyValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setK(value: String): Self = StObject.set(x, "k", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setV(value: Double): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    }
  }
}

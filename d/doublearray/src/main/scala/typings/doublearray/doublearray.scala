package typings.doublearray

import typings.doublearray.anon.All
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object doublearray {
  
  @js.native
  trait BaseAndCheck extends StObject {
    
    def calc(): All = js.native
    
    def dump(): String = js.native
    
    def getBase(): Double = js.native
    
    def getBaseBuffer(): Any = js.native
    
    def getCheck(): Double = js.native
    
    // Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array
    def getCheckBuffer(): Any = js.native
    
    def getFirstUnusedNode(): Double = js.native
    
    def loadBaseBuffer(base_buffer: js.typedarray.Int16Array): BaseAndCheck = js.native
    def loadBaseBuffer(base_buffer: js.typedarray.Int32Array): BaseAndCheck = js.native
    // Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array
    def loadBaseBuffer(base_buffer: js.typedarray.Int8Array): BaseAndCheck = js.native
    def loadBaseBuffer(base_buffer: js.typedarray.Uint16Array): BaseAndCheck = js.native
    def loadBaseBuffer(base_buffer: js.typedarray.Uint32Array): BaseAndCheck = js.native
    def loadBaseBuffer(base_buffer: js.typedarray.Uint8Array): BaseAndCheck = js.native
    
    def loadCheckBuffer(check_buffer: js.typedarray.Int16Array): BaseAndCheck = js.native
    def loadCheckBuffer(check_buffer: js.typedarray.Int32Array): BaseAndCheck = js.native
    def loadCheckBuffer(check_buffer: js.typedarray.Int8Array): BaseAndCheck = js.native
    def loadCheckBuffer(check_buffer: js.typedarray.Uint16Array): BaseAndCheck = js.native
    def loadCheckBuffer(check_buffer: js.typedarray.Uint32Array): BaseAndCheck = js.native
    def loadCheckBuffer(check_buffer: js.typedarray.Uint8Array): BaseAndCheck = js.native
    
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
    
    inline def apply(
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
    
    extension [Self <: DoubleArray](x: Self) {
      
      inline def setBc(value: BaseAndCheck): Self = StObject.set(x, "bc", value.asInstanceOf[js.Any])
      
      inline def setCalc(value: () => All): Self = StObject.set(x, "calc", js.Any.fromFunction0(value))
      
      inline def setCommonPrefixSearch(value: String => KeyValue): Self = StObject.set(x, "commonPrefixSearch", js.Any.fromFunction1(value))
      
      inline def setContain(value: String => Boolean): Self = StObject.set(x, "contain", js.Any.fromFunction1(value))
      
      inline def setDump(value: () => String): Self = StObject.set(x, "dump", js.Any.fromFunction0(value))
      
      inline def setLookup(value: String => Double): Self = StObject.set(x, "lookup", js.Any.fromFunction1(value))
      
      inline def setSize(value: () => Double): Self = StObject.set(x, "size", js.Any.fromFunction0(value))
      
      inline def setTraverse(value: (Double, Double) => Double): Self = StObject.set(x, "traverse", js.Any.fromFunction2(value))
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
    
    def findAllocatableBase(children_info: js.typedarray.Int32Array): Double = js.native
    
    def getChildrenInfo(position: Double, start: Double, length: Double): js.typedarray.Int32Array = js.native
    
    def isUnusedNode(index: Double): Boolean = js.native
    
    var keys: js.Array[KeyValue] = js.native
    
    def setBC(parent_id: Double, children_info: js.typedarray.Int32Array, _base: Double): Unit = js.native
  }
  
  trait KeyValue extends StObject {
    
    var k: String
    
    var v: Double
  }
  object KeyValue {
    
    inline def apply(k: String, v: Double): KeyValue = {
      val __obj = js.Dynamic.literal(k = k.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyValue]
    }
    
    extension [Self <: KeyValue](x: Self) {
      
      inline def setK(value: String): Self = StObject.set(x, "k", value.asInstanceOf[js.Any])
      
      inline def setV(value: Double): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    }
  }
}

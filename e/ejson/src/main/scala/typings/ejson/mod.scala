package typings.ejson

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ejson", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addType(name: String, factory: js.Function1[/* jsonValue */ Any, CustomType]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addType")(name.asInstanceOf[js.Any], factory.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def clone_[T](obj: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(obj.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def equals_(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals_(a: Any, b: Any, options: CloneOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def fromJSONValue(obj: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSONValue")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def isBinary(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBinary")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def newBinary(len: Double): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("newBinary")(len.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def parse(str: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def stringify(obj: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def stringify(obj: Any, options: StringifyOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def toJSONValue(obj: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSONValue")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait CloneOptions extends StObject {
    
    var keyOrderSensitive: Boolean
  }
  object CloneOptions {
    
    inline def apply(keyOrderSensitive: Boolean): CloneOptions = {
      val __obj = js.Dynamic.literal(keyOrderSensitive = keyOrderSensitive.asInstanceOf[js.Any])
      __obj.asInstanceOf[CloneOptions]
    }
    
    extension [Self <: CloneOptions](x: Self) {
      
      inline def setKeyOrderSensitive(value: Boolean): Self = StObject.set(x, "keyOrderSensitive", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * The interface that a class must satisfy to be able to become an
    * EJSON custom type via EJSON.addType.
    */
  trait CustomType extends StObject {
    
    /**
      * Return a value `val` such that `this.equals(val)` is true, and
      * modifications to `val` do not affect `this` and vice versa.
      */
    @JSName("clone")
    var clone_FCustomType: js.UndefOr[js.Function0[this.type]] = js.undefined
    
    /* Return `true` if `other` has a value equal to `this`; `false` otherwise. */
    @JSName("equals")
    var equals_FCustomType: js.UndefOr[js.Function1[/* other */ this.type, Boolean]] = js.undefined
    
    /* Serialize this instance into a JSON-compatible value. */
    def toJSONValue(): Any
    
    /**
      * Return the tag used to identify this type. This must match the
      * tag used to register this type.
      */
    def typeName(): String
  }
  object CustomType {
    
    inline def apply(toJSONValue: () => Any, typeName: () => String): CustomType = {
      val __obj = js.Dynamic.literal(toJSONValue = js.Any.fromFunction0(toJSONValue), typeName = js.Any.fromFunction0(typeName))
      __obj.asInstanceOf[CustomType]
    }
    
    extension [Self <: CustomType](x: Self) {
      
      inline def setClone_(value: () => CustomType): Self = StObject.set(x, "clone", js.Any.fromFunction0(value))
      
      inline def setClone_Undefined: Self = StObject.set(x, "clone", js.undefined)
      
      inline def setEquals_(value: CustomType => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
      
      inline def setEquals_Undefined: Self = StObject.set(x, "equals", js.undefined)
      
      inline def setToJSONValue(value: () => Any): Self = StObject.set(x, "toJSONValue", js.Any.fromFunction0(value))
      
      inline def setTypeName(value: () => String): Self = StObject.set(x, "typeName", js.Any.fromFunction0(value))
    }
  }
  
  trait StringifyOptions extends StObject {
    
    var canonical: js.UndefOr[Boolean] = js.undefined
    
    var indent: js.UndefOr[Boolean | Double | String] = js.undefined
  }
  object StringifyOptions {
    
    inline def apply(): StringifyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StringifyOptions]
    }
    
    extension [Self <: StringifyOptions](x: Self) {
      
      inline def setCanonical(value: Boolean): Self = StObject.set(x, "canonical", value.asInstanceOf[js.Any])
      
      inline def setCanonicalUndefined: Self = StObject.set(x, "canonical", js.undefined)
      
      inline def setIndent(value: Boolean | Double | String): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      inline def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
    }
  }
}

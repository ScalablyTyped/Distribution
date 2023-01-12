package typings.durandal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Serializes and deserializes data to/from JSON.
  * @requires system
  */
object pluginsSerializerMod {
  
  @JSImport("plugins/serializer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clone_[T](obj: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(obj.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def clone_[T](obj: T, settings: js.Object): T = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(obj.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def deserialize[T](text: String): T = ^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(text.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def deserialize[T](text: String, settings: DeserializerOptions): T = (^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(text.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def getTypeId(`object`: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeId")(`object`.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def registerType(typeId: String, constructor: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerType")(typeId.asInstanceOf[js.Any], constructor.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def replacer(key: String, value: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("replacer")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def reviver(
    key: String,
    value: Any,
    getTypeId: js.Function1[/* value */ Any, String],
    getConstructor: js.Function1[/* id */ String, js.Function0[Any]]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("reviver")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], getTypeId.asInstanceOf[js.Any], getConstructor.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def serialize(`object`: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(`object`.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def serialize(`object`: Any, settings: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(`object`.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def serialize(`object`: Any, settings: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(`object`.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def serialize(`object`: Any, settings: SerializerOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(`object`.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("plugins/serializer", "space")
  @js.native
  def space: Any = js.native
  inline def space_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("space")(x.asInstanceOf[js.Any])
  
  @JSImport("plugins/serializer", "typeAttribute")
  @js.native
  def typeAttribute: String = js.native
  inline def typeAttribute_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("typeAttribute")(x.asInstanceOf[js.Any])
  
  @JSImport("plugins/serializer", "typeMap")
  @js.native
  def typeMap: Any = js.native
  inline def typeMap_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("typeMap")(x.asInstanceOf[js.Any])
  
  trait DeserializerOptions extends StObject {
    
    /**
      * Gets the constructor based on the type id.
      * @param {string} typeId The type id.
      * @returns {Function} The constructor.
      */
    def getConstructor(typeId: String): js.Function0[Any]
    
    /**
      * Gets the type id for an object instance, using the configured `typeAttribute`.
      * @param {object} object The object to serialize.
      * @returns {string} The type.
      */
    def getTypeId(`object`: Any): String
    
    /**
      * The default reviver function used during deserialization. By default is detects type properties on objects and uses them to re-construct the correct object using the provided constructor mapping.
      * @param {string} key The attribute key.
      * @param {object} value The object value associated with the key.
      * @returns {object} The value.
      */
    def reviver(key: String, value: Any): Any
  }
  object DeserializerOptions {
    
    inline def apply(
      getConstructor: String => js.Function0[Any],
      getTypeId: Any => String,
      reviver: (String, Any) => Any
    ): DeserializerOptions = {
      val __obj = js.Dynamic.literal(getConstructor = js.Any.fromFunction1(getConstructor), getTypeId = js.Any.fromFunction1(getTypeId), reviver = js.Any.fromFunction2(reviver))
      __obj.asInstanceOf[DeserializerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DeserializerOptions] (val x: Self) extends AnyVal {
      
      inline def setGetConstructor(value: String => js.Function0[Any]): Self = StObject.set(x, "getConstructor", js.Any.fromFunction1(value))
      
      inline def setGetTypeId(value: Any => String): Self = StObject.set(x, "getTypeId", js.Any.fromFunction1(value))
      
      inline def setReviver(value: (String, Any) => Any): Self = StObject.set(x, "reviver", js.Any.fromFunction2(value))
    }
  }
  
  trait SerializerOptions extends StObject {
    
    /**
      * The default replacer function used during serialization. By default properties starting with '_' or '$' are removed from the serialized object.
      * @param {string} key The object key to check.
      * @param {object} value The object value to check.
      * @returns {object} The value to serialize.
      */
    var replacer: js.UndefOr[js.Function2[/* key */ String, /* value */ Any, Any]] = js.undefined
    
    /**
      * The amount of space to use for indentation when writing out JSON.
      * @default undefined
      */
    var space: Any
  }
  object SerializerOptions {
    
    inline def apply(space: Any): SerializerOptions = {
      val __obj = js.Dynamic.literal(space = space.asInstanceOf[js.Any])
      __obj.asInstanceOf[SerializerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SerializerOptions] (val x: Self) extends AnyVal {
      
      inline def setReplacer(value: (/* key */ String, /* value */ Any) => Any): Self = StObject.set(x, "replacer", js.Any.fromFunction2(value))
      
      inline def setReplacerUndefined: Self = StObject.set(x, "replacer", js.undefined)
      
      inline def setSpace(value: Any): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
    }
  }
}

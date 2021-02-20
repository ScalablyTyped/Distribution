package typings.durandal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Serializes and deserializes data to/from JSON.
  * @requires system
  */
object serializerMod {
  
  @JSImport("plugins/serializer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("plugins/serializer", "clone")
  @js.native
  def clone_[T](obj: T): T = js.native
  @JSImport("plugins/serializer", "clone")
  @js.native
  def clone_[T](obj: T, settings: js.Object): T = js.native
  
  @JSImport("plugins/serializer", "deserialize")
  @js.native
  def deserialize[T](text: String): T = js.native
  @JSImport("plugins/serializer", "deserialize")
  @js.native
  def deserialize[T](text: String, settings: DeserializerOptions): T = js.native
  
  @JSImport("plugins/serializer", "getTypeId")
  @js.native
  def getTypeId(`object`: js.Any): String = js.native
  
  @JSImport("plugins/serializer", "registerType")
  @js.native
  def registerType(typeId: String, constructor: js.Function0[_]): Unit = js.native
  
  @JSImport("plugins/serializer", "replacer")
  @js.native
  def replacer(key: String, value: js.Any): js.Any = js.native
  
  @JSImport("plugins/serializer", "reviver")
  @js.native
  def reviver(
    key: String,
    value: js.Any,
    getTypeId: js.Function1[/* value */ js.Any, String],
    getConstructor: js.Function1[/* id */ String, js.Function0[_]]
  ): js.Any = js.native
  
  @JSImport("plugins/serializer", "serialize")
  @js.native
  def serialize(`object`: js.Any): String = js.native
  @JSImport("plugins/serializer", "serialize")
  @js.native
  def serialize(`object`: js.Any, settings: String): String = js.native
  @JSImport("plugins/serializer", "serialize")
  @js.native
  def serialize(`object`: js.Any, settings: Double): String = js.native
  @JSImport("plugins/serializer", "serialize")
  @js.native
  def serialize(`object`: js.Any, settings: SerializerOptions): String = js.native
  
  @JSImport("plugins/serializer", "space")
  @js.native
  def space: js.Any = js.native
  @scala.inline
  def space_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("space")(x.asInstanceOf[js.Any])
  
  @JSImport("plugins/serializer", "typeAttribute")
  @js.native
  def typeAttribute: String = js.native
  @scala.inline
  def typeAttribute_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("typeAttribute")(x.asInstanceOf[js.Any])
  
  @JSImport("plugins/serializer", "typeMap")
  @js.native
  def typeMap: js.Any = js.native
  @scala.inline
  def typeMap_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("typeMap")(x.asInstanceOf[js.Any])
  
  @js.native
  trait DeserializerOptions extends StObject {
    
    /**
      * Gets the constructor based on the type id.
      * @param {string} typeId The type id.
      * @returns {Function} The constructor.
      */
    def getConstructor(typeId: String): js.Function0[_] = js.native
    
    /**
      * Gets the type id for an object instance, using the configured `typeAttribute`.
      * @param {object} object The object to serialize.
      * @returns {string} The type.
      */
    def getTypeId(`object`: js.Any): String = js.native
    
    /**
      * The default reviver function used during deserialization. By default is detects type properties on objects and uses them to re-construct the correct object using the provided constructor mapping.
      * @param {string} key The attribute key.
      * @param {object} value The object value associated with the key.
      * @returns {object} The value.
      */
    def reviver(key: String, value: js.Any): js.Any = js.native
  }
  object DeserializerOptions {
    
    @scala.inline
    def apply(
      getConstructor: String => js.Function0[_],
      getTypeId: js.Any => String,
      reviver: (String, js.Any) => js.Any
    ): DeserializerOptions = {
      val __obj = js.Dynamic.literal(getConstructor = js.Any.fromFunction1(getConstructor), getTypeId = js.Any.fromFunction1(getTypeId), reviver = js.Any.fromFunction2(reviver))
      __obj.asInstanceOf[DeserializerOptions]
    }
    
    @scala.inline
    implicit class DeserializerOptionsMutableBuilder[Self <: DeserializerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetConstructor(value: String => js.Function0[_]): Self = StObject.set(x, "getConstructor", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetTypeId(value: js.Any => String): Self = StObject.set(x, "getTypeId", js.Any.fromFunction1(value))
      
      @scala.inline
      def setReviver(value: (String, js.Any) => js.Any): Self = StObject.set(x, "reviver", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait SerializerOptions extends StObject {
    
    /**
      * The default replacer function used during serialization. By default properties starting with '_' or '$' are removed from the serialized object.
      * @param {string} key The object key to check.
      * @param {object} value The object value to check.
      * @returns {object} The value to serialize.
      */
    var replacer: js.UndefOr[js.Function2[/* key */ String, /* value */ js.Any, _]] = js.native
    
    /**
      * The amount of space to use for indentation when writing out JSON.
      * @default undefined
      */
    var space: js.Any = js.native
  }
  object SerializerOptions {
    
    @scala.inline
    def apply(space: js.Any): SerializerOptions = {
      val __obj = js.Dynamic.literal(space = space.asInstanceOf[js.Any])
      __obj.asInstanceOf[SerializerOptions]
    }
    
    @scala.inline
    implicit class SerializerOptionsMutableBuilder[Self <: SerializerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReplacer(value: (/* key */ String, /* value */ js.Any) => _): Self = StObject.set(x, "replacer", js.Any.fromFunction2(value))
      
      @scala.inline
      def setReplacerUndefined: Self = StObject.set(x, "replacer", js.undefined)
      
      @scala.inline
      def setSpace(value: js.Any): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
    }
  }
}

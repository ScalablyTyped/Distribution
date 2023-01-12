package typings.fastRedact

import typings.fastRedact.fastRedactBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): redactFn = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[redactFn]
  inline def apply(redactOptions: RedactOptions): redactFn = ^.asInstanceOf[js.Dynamic].apply(redactOptions.asInstanceOf[js.Any]).asInstanceOf[redactFn]
  /**
    * When called without any options, or with a zero length paths array, fast-redact will return JSON.stringify or the serialize option, if set.
    * @param redactOptions
    * @param redactOptions.paths An array of strings describing the nested location of a key in an object.
    * @param redactOptions.censor This is the value which overwrites redacted properties.
    * @param redactOptions.remove The remove option, when set to true will cause keys to be removed from the serialized output.
    * @param redactOptions.serialize The serialize option may either be a function or a boolean. If a function is supplied, this will be used to serialize the redacted object.
    * @param redactOptions.strict The strict option, when set to true, will cause the redactor function to throw if instead of an object it finds a primitive.
    * @returns Redacted value from input
    */
  inline def apply(redactOptions: RedactOptionsNoSerialize): redactFnNoSerialize = ^.asInstanceOf[js.Dynamic].apply(redactOptions.asInstanceOf[js.Any]).asInstanceOf[redactFnNoSerialize]
  
  @JSImport("fast-redact", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait RedactOptions extends StObject {
    
    /** This is the value which overwrites redacted properties. */
    var censor: js.UndefOr[String | (js.Function1[/* v */ Any, Any])] = js.undefined
    
    /** An array of strings describing the nested location of a key in an object. */
    var paths: js.UndefOr[js.Array[String]] = js.undefined
    
    /** The remove option, when set to true will cause keys to be removed from the serialized output. */
    var remove: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The serialize option may either be a function or a boolean. If a function is supplied, this will be used to serialize the redacted object.
      * The default serialize is the function JSON.stringify
      */
    var serialize: js.UndefOr[Boolean | (js.Function1[/* v */ Any, Any])] = js.undefined
    
    /** The strict option, when set to true, will cause the redactor function to throw if instead of an object it finds a primitive. */
    var strict: js.UndefOr[Boolean] = js.undefined
  }
  object RedactOptions {
    
    inline def apply(): RedactOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RedactOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RedactOptions] (val x: Self) extends AnyVal {
      
      inline def setCensor(value: String | (js.Function1[/* v */ Any, Any])): Self = StObject.set(x, "censor", value.asInstanceOf[js.Any])
      
      inline def setCensorFunction1(value: /* v */ Any => Any): Self = StObject.set(x, "censor", js.Any.fromFunction1(value))
      
      inline def setCensorUndefined: Self = StObject.set(x, "censor", js.undefined)
      
      inline def setPaths(value: js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      inline def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
      
      inline def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value*))
      
      inline def setRemove(value: Boolean): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
      
      inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
      
      inline def setSerialize(value: Boolean | (js.Function1[/* v */ Any, Any])): Self = StObject.set(x, "serialize", value.asInstanceOf[js.Any])
      
      inline def setSerializeFunction1(value: /* v */ Any => Any): Self = StObject.set(x, "serialize", js.Any.fromFunction1(value))
      
      inline def setSerializeUndefined: Self = StObject.set(x, "serialize", js.undefined)
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
  
  /** RedactOptions without serialization. Instead of the serialized object, the output of the redactor function will be the mutated object itself. */
  trait RedactOptionsNoSerialize
    extends StObject
       with RedactOptions {
    
    @JSName("serialize")
    var serialize_RedactOptionsNoSerialize: `false`
  }
  object RedactOptionsNoSerialize {
    
    inline def apply(): RedactOptionsNoSerialize = {
      val __obj = js.Dynamic.literal(serialize = false)
      __obj.asInstanceOf[RedactOptionsNoSerialize]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RedactOptionsNoSerialize] (val x: Self) extends AnyVal {
      
      inline def setSerialize(value: `false`): Self = StObject.set(x, "serialize", value.asInstanceOf[js.Any])
    }
  }
  
  /** Redacts input */
  type redactFn = js.Function1[/* input */ Any, String | Any]
  
  /** Redacts input without serialization */
  @js.native
  trait redactFnNoSerialize extends redactFn {
    
    /** Method that allowing the redacted keys to be restored with the original data. Supplied only when serialize option set to false. */
    def restore[T](input: T): T = js.native
  }
}

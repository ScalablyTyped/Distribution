package typings.fastRedact

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
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
  inline def apply(redactOptions: RedactOptions): redactFn = ^.asInstanceOf[js.Dynamic].apply(redactOptions.asInstanceOf[js.Any]).asInstanceOf[redactFn]
  
  @JSImport("fast-redact", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait RedactOptions extends StObject {
    
    /** This is the value which overwrites redacted properties. */
    var censor: js.UndefOr[String | (js.Function1[/* v */ js.Any, js.Any])] = js.undefined
    
    /** An array of strings describing the nested location of a key in an object. */
    var paths: js.Array[String]
    
    /** The remove option, when set to true will cause keys to be removed from the serialized output. */
    var remove: js.UndefOr[Boolean] = js.undefined
    
    /** The serialize option may either be a function or a boolean. If a function is supplied, this will be used to serialize the redacted object. */
    var serialize: js.UndefOr[Boolean | (js.Function1[/* v */ js.Any, js.Any])] = js.undefined
    
    /** The strict option, when set to true, will cause the redactor function to throw if instead of an object it finds a primitive. */
    var strict: js.UndefOr[Boolean] = js.undefined
  }
  object RedactOptions {
    
    inline def apply(paths: js.Array[String]): RedactOptions = {
      val __obj = js.Dynamic.literal(paths = paths.asInstanceOf[js.Any])
      __obj.asInstanceOf[RedactOptions]
    }
    
    extension [Self <: RedactOptions](x: Self) {
      
      inline def setCensor(value: String | (js.Function1[/* v */ js.Any, js.Any])): Self = StObject.set(x, "censor", value.asInstanceOf[js.Any])
      
      inline def setCensorFunction1(value: /* v */ js.Any => js.Any): Self = StObject.set(x, "censor", js.Any.fromFunction1(value))
      
      inline def setCensorUndefined: Self = StObject.set(x, "censor", js.undefined)
      
      inline def setPaths(value: js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      inline def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value :_*))
      
      inline def setRemove(value: Boolean): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
      
      inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
      
      inline def setSerialize(value: Boolean | (js.Function1[/* v */ js.Any, js.Any])): Self = StObject.set(x, "serialize", value.asInstanceOf[js.Any])
      
      inline def setSerializeFunction1(value: /* v */ js.Any => js.Any): Self = StObject.set(x, "serialize", js.Any.fromFunction1(value))
      
      inline def setSerializeUndefined: Self = StObject.set(x, "serialize", js.undefined)
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
  
  /** Redacts input */
  type redactFn = js.Function1[/* input */ js.Any, js.Any]
}

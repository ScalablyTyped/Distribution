package typings.fastRedact

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  @JSImport("fast-redact", JSImport.Namespace)
  @js.native
  def apply(redactOptions: RedactOptions): redactFn = js.native
  
  @js.native
  trait RedactOptions extends StObject {
    
    /** This is the value which overwrites redacted properties. */
    var censor: js.UndefOr[String | (js.Function1[/* v */ js.Any, _])] = js.native
    
    /** An array of strings describing the nested location of a key in an object. */
    var paths: js.Array[String] = js.native
    
    /** The remove option, when set to true will cause keys to be removed from the serialized output. */
    var remove: js.UndefOr[Boolean] = js.native
    
    /** The serialize option may either be a function or a boolean. If a function is supplied, this will be used to serialize the redacted object. */
    var serialize: js.UndefOr[Boolean | (js.Function1[/* v */ js.Any, _])] = js.native
    
    /** The strict option, when set to true, will cause the redactor function to throw if instead of an object it finds a primitive. */
    var strict: js.UndefOr[Boolean] = js.native
  }
  object RedactOptions {
    
    @scala.inline
    def apply(paths: js.Array[String]): RedactOptions = {
      val __obj = js.Dynamic.literal(paths = paths.asInstanceOf[js.Any])
      __obj.asInstanceOf[RedactOptions]
    }
    
    @scala.inline
    implicit class RedactOptionsMutableBuilder[Self <: RedactOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCensor(value: String | (js.Function1[/* v */ js.Any, _])): Self = StObject.set(x, "censor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCensorFunction1(value: /* v */ js.Any => _): Self = StObject.set(x, "censor", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCensorUndefined: Self = StObject.set(x, "censor", js.undefined)
      
      @scala.inline
      def setPaths(value: js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value :_*))
      
      @scala.inline
      def setRemove(value: Boolean): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
      
      @scala.inline
      def setSerialize(value: Boolean | (js.Function1[/* v */ js.Any, _])): Self = StObject.set(x, "serialize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSerializeFunction1(value: /* v */ js.Any => _): Self = StObject.set(x, "serialize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSerializeUndefined: Self = StObject.set(x, "serialize", js.undefined)
      
      @scala.inline
      def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
  
  /** Redacts input */
  type redactFn = js.Function1[/* input */ js.Any, js.Any]
}

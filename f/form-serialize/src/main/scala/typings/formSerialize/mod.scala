package typings.formSerialize

import org.scalablytyped.runtime.StringDictionary
import typings.formSerialize.formSerializeBooleans.`false`
import typings.formSerialize.formSerializeBooleans.`true`
import typings.std.HTMLFormElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(form: HTMLFormElement): String = ^.asInstanceOf[js.Dynamic].apply(form.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(form: HTMLFormElement, options: `false`): String = (^.asInstanceOf[js.Dynamic].apply(form.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(form: HTMLFormElement, options: `true`): ResultHash = (^.asInstanceOf[js.Dynamic].apply(form.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ResultHash]
  inline def apply(form: HTMLFormElement, options: OptionsHash): ResultHash = (^.asInstanceOf[js.Dynamic].apply(form.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ResultHash]
  inline def apply(form: HTMLFormElement, options: OptionsString): String = (^.asInstanceOf[js.Dynamic].apply(form.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply[Result](form: HTMLFormElement, options: Boolean): Result = (^.asInstanceOf[js.Dynamic].apply(form.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Result]
  inline def apply[Result](form: HTMLFormElement, options: Options[Result]): Result = (^.asInstanceOf[js.Dynamic].apply(form.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Result]
  
  @JSImport("form-serialize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options[Result] extends StObject {
    
    /** If true serialize disabled fields. */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /** If true serialize empty fields */
    var empty: js.UndefOr[Boolean] = js.undefined
    
    /** Configure the output type. If true, the output will be a js object. */
    var hash: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Optional serializer function to override the default one. The function takes 3 arguments (result, key,
      * value) and should return new result hash and url encoded str serializers are provided with this module
      */
    var serializer: js.UndefOr[js.Function3[/* result */ Result, /* key */ String, /* value */ String, Result]] = js.undefined
  }
  object Options {
    
    inline def apply[Result](): Options[Result] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[Result]]
    }
    
    extension [Self <: Options[?], Result](x: Self & Options[Result]) {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setEmpty(value: Boolean): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
      
      inline def setEmptyUndefined: Self = StObject.set(x, "empty", js.undefined)
      
      inline def setHash(value: Boolean): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      inline def setSerializer(value: (/* result */ Result, /* key */ String, /* value */ String) => Result): Self = StObject.set(x, "serializer", js.Any.fromFunction3(value))
      
      inline def setSerializerUndefined: Self = StObject.set(x, "serializer", js.undefined)
    }
  }
  
  trait OptionsHash
    extends StObject
       with Options[ResultHash] {
    
    @JSName("hash")
    var hash_OptionsHash: `true`
  }
  object OptionsHash {
    
    inline def apply(): OptionsHash = {
      val __obj = js.Dynamic.literal(hash = true)
      __obj.asInstanceOf[OptionsHash]
    }
    
    extension [Self <: OptionsHash](x: Self) {
      
      inline def setHash(value: `true`): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    }
  }
  
  trait OptionsString
    extends StObject
       with Options[String] {
    
    @JSName("hash")
    var hash_OptionsString: `false`
  }
  object OptionsString {
    
    inline def apply(): OptionsString = {
      val __obj = js.Dynamic.literal(hash = false)
      __obj.asInstanceOf[OptionsString]
    }
    
    extension [Self <: OptionsString](x: Self) {
      
      inline def setHash(value: `false`): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResultHash
    extends StObject
       with /* key */ StringDictionary[String | js.Array[String] | ResultHash]
  object ResultHash {
    
    inline def apply(): ResultHash = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResultHash]
    }
  }
}

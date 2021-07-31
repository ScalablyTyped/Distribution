package typings.formSerialize

import org.scalablytyped.runtime.StringDictionary
import typings.formSerialize.formSerializeBooleans.`false`
import typings.formSerialize.formSerializeBooleans.`true`
import typings.std.HTMLFormElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(form: HTMLFormElement): String = ^.asInstanceOf[js.Dynamic].apply(form.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def apply(form: HTMLFormElement, options: `false`): String = (^.asInstanceOf[js.Dynamic].apply(form.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def apply(form: HTMLFormElement, options: `true`): ResultHash = (^.asInstanceOf[js.Dynamic].apply(form.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ResultHash]
  @scala.inline
  def apply(form: HTMLFormElement, options: OptionsHash): ResultHash = (^.asInstanceOf[js.Dynamic].apply(form.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ResultHash]
  @scala.inline
  def apply(form: HTMLFormElement, options: OptionsString): String = (^.asInstanceOf[js.Dynamic].apply(form.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def apply[Result](form: HTMLFormElement, options: Boolean): Result = (^.asInstanceOf[js.Dynamic].apply(form.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Result]
  @scala.inline
  def apply[Result](form: HTMLFormElement, options: Options[Result]): Result = (^.asInstanceOf[js.Dynamic].apply(form.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Result]
  
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
    
    @scala.inline
    def apply[Result](): Options[Result] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[Result]]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options[?], Result] (val x: Self & Options[Result]) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setEmpty(value: Boolean): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmptyUndefined: Self = StObject.set(x, "empty", js.undefined)
      
      @scala.inline
      def setHash(value: Boolean): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      @scala.inline
      def setSerializer(value: (/* result */ Result, /* key */ String, /* value */ String) => Result): Self = StObject.set(x, "serializer", js.Any.fromFunction3(value))
      
      @scala.inline
      def setSerializerUndefined: Self = StObject.set(x, "serializer", js.undefined)
    }
  }
  
  trait OptionsHash
    extends StObject
       with Options[ResultHash] {
    
    @JSName("hash")
    var hash_OptionsHash: `true`
  }
  object OptionsHash {
    
    @scala.inline
    def apply(): OptionsHash = {
      val __obj = js.Dynamic.literal(hash = true)
      __obj.asInstanceOf[OptionsHash]
    }
    
    @scala.inline
    implicit class OptionsHashMutableBuilder[Self <: OptionsHash] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHash(value: `true`): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    }
  }
  
  trait OptionsString
    extends StObject
       with Options[String] {
    
    @JSName("hash")
    var hash_OptionsString: `false`
  }
  object OptionsString {
    
    @scala.inline
    def apply(): OptionsString = {
      val __obj = js.Dynamic.literal(hash = false)
      __obj.asInstanceOf[OptionsString]
    }
    
    @scala.inline
    implicit class OptionsStringMutableBuilder[Self <: OptionsString] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHash(value: `false`): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResultHash
    extends StObject
       with /* key */ StringDictionary[String | js.Array[String] | ResultHash]
  object ResultHash {
    
    @scala.inline
    def apply(): ResultHash = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResultHash]
    }
  }
}

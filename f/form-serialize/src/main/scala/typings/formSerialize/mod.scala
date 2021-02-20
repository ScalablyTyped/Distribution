package typings.formSerialize

import org.scalablytyped.runtime.StringDictionary
import typings.formSerialize.formSerializeBooleans.`false`
import typings.formSerialize.formSerializeBooleans.`true`
import typings.std.HTMLFormElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("form-serialize", JSImport.Namespace)
  @js.native
  def apply(form: HTMLFormElement): String = js.native
  @JSImport("form-serialize", JSImport.Namespace)
  @js.native
  def apply(form: HTMLFormElement, options: `false`): String = js.native
  @JSImport("form-serialize", JSImport.Namespace)
  @js.native
  def apply(form: HTMLFormElement, options: `true`): ResultHash = js.native
  @JSImport("form-serialize", JSImport.Namespace)
  @js.native
  def apply(form: HTMLFormElement, options: OptionsHash): ResultHash = js.native
  @JSImport("form-serialize", JSImport.Namespace)
  @js.native
  def apply(form: HTMLFormElement, options: OptionsString): String = js.native
  @JSImport("form-serialize", JSImport.Namespace)
  @js.native
  def apply[Result](form: HTMLFormElement, options: Boolean): Result = js.native
  @JSImport("form-serialize", JSImport.Namespace)
  @js.native
  def apply[Result](form: HTMLFormElement, options: Options[Result]): Result = js.native
  
  @js.native
  trait Options[Result] extends StObject {
    
    /** If true serialize disabled fields. */
    var disabled: js.UndefOr[Boolean] = js.native
    
    /** If true serialize empty fields */
    var empty: js.UndefOr[Boolean] = js.native
    
    /** Configure the output type. If true, the output will be a js object. */
    var hash: js.UndefOr[Boolean] = js.native
    
    /**
      * Optional serializer function to override the default one. The function takes 3 arguments (result, key,
      * value) and should return new result hash and url encoded str serializers are provided with this module
      */
    var serializer: js.UndefOr[js.Function3[/* result */ Result, /* key */ String, /* value */ String, Result]] = js.native
  }
  object Options {
    
    @scala.inline
    def apply[Result](): Options[Result] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[Result]]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options[_], Result] (val x: Self with Options[Result]) extends AnyVal {
      
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
  
  @js.native
  trait OptionsHash extends Options[ResultHash] {
    
    @JSName("hash")
    var hash_OptionsHash: `true` = js.native
  }
  object OptionsHash {
    
    @scala.inline
    def apply(hash: `true`): OptionsHash = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionsHash]
    }
    
    @scala.inline
    implicit class OptionsHashMutableBuilder[Self <: OptionsHash] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHash(value: `true`): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OptionsString extends Options[String] {
    
    @JSName("hash")
    var hash_OptionsString: `false` = js.native
  }
  object OptionsString {
    
    @scala.inline
    def apply(hash: `false`): OptionsString = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionsString]
    }
    
    @scala.inline
    implicit class OptionsStringMutableBuilder[Self <: OptionsString] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHash(value: `false`): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ResultHash
    extends /* key */ StringDictionary[String | js.Array[String] | ResultHash]
  object ResultHash {
    
    @scala.inline
    def apply(): ResultHash = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResultHash]
    }
  }
}

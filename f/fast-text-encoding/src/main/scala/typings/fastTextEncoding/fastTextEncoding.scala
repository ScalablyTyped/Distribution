package typings.fastTextEncoding

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fastTextEncoding {
  
  /**
    * TextDecoder class.
    */
  type TextDecoder = Instantiable2[
    /* utfLabel */ js.UndefOr[String], 
    /* options */ js.UndefOr[TextDecoderOptions], 
    TextDecoderClass
  ]
  
  /**
    * TextDecoder instance.
    */
  @js.native
  trait TextDecoderClass extends StObject {
    
    def decode(buffer: Uint8Array): String = js.native
    def decode(buffer: Uint8Array, options: TextEncodingOptions): String = js.native
    
    var encoding: String = js.native
    
    var fatal: Boolean = js.native
    
    var ignoreBOM: Boolean = js.native
  }
  
  /**
    * Options for TextDecoder constructor.
    */
  @js.native
  trait TextDecoderOptions extends StObject {
    
    var fatal: Boolean = js.native
  }
  object TextDecoderOptions {
    
    @scala.inline
    def apply(fatal: Boolean): TextDecoderOptions = {
      val __obj = js.Dynamic.literal(fatal = fatal.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextDecoderOptions]
    }
    
    @scala.inline
    implicit class TextDecoderOptionsMutableBuilder[Self <: TextDecoderOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFatal(value: Boolean): Self = StObject.set(x, "fatal", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * TextEncoder class.
    */
  type TextEncoder = Instantiable1[/* label */ js.UndefOr[String], TextEncoderClass]
  
  /**
    * TextEncoder instance.
    */
  @js.native
  trait TextEncoderClass extends StObject {
    
    def encode(string: String): Uint8Array = js.native
    def encode(string: String, options: TextEncodingOptions): Uint8Array = js.native
    
    var encoding: String = js.native
  }
  
  /**
    * Options for `TextDecoder.decode` and `TextEncoder.encode`.
    */
  @js.native
  trait TextEncodingOptions extends StObject {
    
    var stream: Boolean = js.native
  }
  object TextEncodingOptions {
    
    @scala.inline
    def apply(stream: Boolean): TextEncodingOptions = {
      val __obj = js.Dynamic.literal(stream = stream.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextEncodingOptions]
    }
    
    @scala.inline
    implicit class TextEncodingOptionsMutableBuilder[Self <: TextEncodingOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStream(value: Boolean): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    }
  }
}

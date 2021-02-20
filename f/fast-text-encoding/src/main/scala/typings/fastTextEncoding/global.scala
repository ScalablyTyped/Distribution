package typings.fastTextEncoding

import typings.fastTextEncoding.fastTextEncoding.TextDecoderOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object fastTextEncoding {
    
    /**
      * TextDecoder instance.
      */
    @JSGlobal("fastTextEncoding.TextDecoderClass")
    @js.native
    class TextDecoderClass ()
      extends typings.fastTextEncoding.fastTextEncoding.TextDecoderClass {
      def this(utfLabel: String) = this()
      def this(utfLabel: js.UndefOr[scala.Nothing], options: TextDecoderOptions) = this()
      def this(utfLabel: String, options: TextDecoderOptions) = this()
    }
    
    /**
      * TextEncoder instance.
      */
    @JSGlobal("fastTextEncoding.TextEncoderClass")
    @js.native
    class TextEncoderClass ()
      extends typings.fastTextEncoding.fastTextEncoding.TextEncoderClass {
      def this(label: String) = this()
    }
  }
}

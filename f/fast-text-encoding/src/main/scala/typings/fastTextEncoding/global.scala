package typings.fastTextEncoding

import typings.fastTextEncoding.fastTextEncoding.TextDecoderOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object fastTextEncoding extends js.Object {
    
    /**
      * TextDecoder instance.
      */
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
    @js.native
    class TextEncoderClass ()
      extends typings.fastTextEncoding.fastTextEncoding.TextEncoderClass {
      def this(label: String) = this()
    }
  }
}

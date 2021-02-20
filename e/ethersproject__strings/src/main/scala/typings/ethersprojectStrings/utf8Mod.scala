package typings.ethersprojectStrings

import typings.ethersprojectBytes.mod.BytesLike
import typings.std.ArrayLike
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utf8Mod {
  
  @js.native
  sealed trait UnicodeNormalizationForm extends StObject
  @JSImport("@ethersproject/strings/lib/utf8", "UnicodeNormalizationForm")
  @js.native
  object UnicodeNormalizationForm extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[UnicodeNormalizationForm with String] = js.native
    
    @js.native
    sealed trait NFC extends UnicodeNormalizationForm
    /* "NFC" */ val NFC: typings.ethersprojectStrings.utf8Mod.UnicodeNormalizationForm.NFC with String = js.native
    
    @js.native
    sealed trait NFD extends UnicodeNormalizationForm
    /* "NFD" */ val NFD: typings.ethersprojectStrings.utf8Mod.UnicodeNormalizationForm.NFD with String = js.native
    
    @js.native
    sealed trait NFKC extends UnicodeNormalizationForm
    /* "NFKC" */ val NFKC: typings.ethersprojectStrings.utf8Mod.UnicodeNormalizationForm.NFKC with String = js.native
    
    @js.native
    sealed trait NFKD extends UnicodeNormalizationForm
    /* "NFKD" */ val NFKD: typings.ethersprojectStrings.utf8Mod.UnicodeNormalizationForm.NFKD with String = js.native
    
    @js.native
    sealed trait current extends UnicodeNormalizationForm
    /* "" */ val current: typings.ethersprojectStrings.utf8Mod.UnicodeNormalizationForm.current with String = js.native
  }
  
  @js.native
  sealed trait Utf8ErrorReason extends StObject
  @JSImport("@ethersproject/strings/lib/utf8", "Utf8ErrorReason")
  @js.native
  object Utf8ErrorReason extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Utf8ErrorReason with String] = js.native
    
    @js.native
    sealed trait BAD_PREFIX extends Utf8ErrorReason
    /* "bad codepoint prefix" */ val BAD_PREFIX: typings.ethersprojectStrings.utf8Mod.Utf8ErrorReason.BAD_PREFIX with String = js.native
    
    @js.native
    sealed trait MISSING_CONTINUE extends Utf8ErrorReason
    /* "missing continuation byte" */ val MISSING_CONTINUE: typings.ethersprojectStrings.utf8Mod.Utf8ErrorReason.MISSING_CONTINUE with String = js.native
    
    @js.native
    sealed trait OUT_OF_RANGE extends Utf8ErrorReason
    /* "out of UTF-8 range" */ val OUT_OF_RANGE: typings.ethersprojectStrings.utf8Mod.Utf8ErrorReason.OUT_OF_RANGE with String = js.native
    
    @js.native
    sealed trait OVERLONG extends Utf8ErrorReason
    /* "overlong representation" */ val OVERLONG: typings.ethersprojectStrings.utf8Mod.Utf8ErrorReason.OVERLONG with String = js.native
    
    @js.native
    sealed trait OVERRUN extends Utf8ErrorReason
    /* "string overrun" */ val OVERRUN: typings.ethersprojectStrings.utf8Mod.Utf8ErrorReason.OVERRUN with String = js.native
    
    @js.native
    sealed trait UNEXPECTED_CONTINUE extends Utf8ErrorReason
    /* "unexpected continuation byte" */ val UNEXPECTED_CONTINUE: typings.ethersprojectStrings.utf8Mod.Utf8ErrorReason.UNEXPECTED_CONTINUE with String = js.native
    
    @js.native
    sealed trait UTF16_SURROGATE extends Utf8ErrorReason
    /* "UTF-16 surrogate" */ val UTF16_SURROGATE: typings.ethersprojectStrings.utf8Mod.Utf8ErrorReason.UTF16_SURROGATE with String = js.native
  }
  
  @JSImport("@ethersproject/strings/lib/utf8", "_toUtf8String")
  @js.native
  def _toUtf8String(codePoints: js.Array[Double]): String = js.native
  
  @JSImport("@ethersproject/strings/lib/utf8", "_toEscapedUtf8String")
  @js.native
  def toEscapedUtf8String(bytes: BytesLike): String = js.native
  @JSImport("@ethersproject/strings/lib/utf8", "_toEscapedUtf8String")
  @js.native
  def toEscapedUtf8String(bytes: BytesLike, onError: Utf8ErrorFunc): String = js.native
  
  @JSImport("@ethersproject/strings/lib/utf8", "toUtf8Bytes")
  @js.native
  def toUtf8Bytes(str: String): Uint8Array = js.native
  @JSImport("@ethersproject/strings/lib/utf8", "toUtf8Bytes")
  @js.native
  def toUtf8Bytes(str: String, form: UnicodeNormalizationForm): Uint8Array = js.native
  
  @JSImport("@ethersproject/strings/lib/utf8", "toUtf8CodePoints")
  @js.native
  def toUtf8CodePoints(str: String): js.Array[Double] = js.native
  @JSImport("@ethersproject/strings/lib/utf8", "toUtf8CodePoints")
  @js.native
  def toUtf8CodePoints(str: String, form: UnicodeNormalizationForm): js.Array[Double] = js.native
  
  @JSImport("@ethersproject/strings/lib/utf8", "toUtf8String")
  @js.native
  def toUtf8String(bytes: BytesLike): String = js.native
  @JSImport("@ethersproject/strings/lib/utf8", "toUtf8String")
  @js.native
  def toUtf8String(bytes: BytesLike, onError: Utf8ErrorFunc): String = js.native
  
  type Utf8ErrorFunc = js.Function5[
    /* reason */ Utf8ErrorReason, 
    /* offset */ Double, 
    /* bytes */ ArrayLike[Double], 
    /* output */ js.Array[Double], 
    /* badCodepoint */ js.UndefOr[Double], 
    Double
  ]
}

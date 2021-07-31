package typings.ethersprojectStrings

import typings.ethersprojectBytes.mod.BytesLike
import typings.std.ArrayLike
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utf8Mod {
  
  @JSImport("@ethersproject/strings/lib/utf8", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait UnicodeNormalizationForm extends StObject
  @JSImport("@ethersproject/strings/lib/utf8", "UnicodeNormalizationForm")
  @js.native
  object UnicodeNormalizationForm extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[UnicodeNormalizationForm & String] = js.native
    
    @js.native
    sealed trait NFC
      extends StObject
         with UnicodeNormalizationForm
    /* "NFC" */ val NFC: typings.ethersprojectStrings.utf8Mod.UnicodeNormalizationForm.NFC & String = js.native
    
    @js.native
    sealed trait NFD
      extends StObject
         with UnicodeNormalizationForm
    /* "NFD" */ val NFD: typings.ethersprojectStrings.utf8Mod.UnicodeNormalizationForm.NFD & String = js.native
    
    @js.native
    sealed trait NFKC
      extends StObject
         with UnicodeNormalizationForm
    /* "NFKC" */ val NFKC: typings.ethersprojectStrings.utf8Mod.UnicodeNormalizationForm.NFKC & String = js.native
    
    @js.native
    sealed trait NFKD
      extends StObject
         with UnicodeNormalizationForm
    /* "NFKD" */ val NFKD: typings.ethersprojectStrings.utf8Mod.UnicodeNormalizationForm.NFKD & String = js.native
    
    @js.native
    sealed trait current
      extends StObject
         with UnicodeNormalizationForm
    /* "" */ val current: typings.ethersprojectStrings.utf8Mod.UnicodeNormalizationForm.current & String = js.native
  }
  
  @js.native
  sealed trait Utf8ErrorReason extends StObject
  @JSImport("@ethersproject/strings/lib/utf8", "Utf8ErrorReason")
  @js.native
  object Utf8ErrorReason extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Utf8ErrorReason & String] = js.native
    
    @js.native
    sealed trait BAD_PREFIX
      extends StObject
         with Utf8ErrorReason
    /* "bad codepoint prefix" */ val BAD_PREFIX: typings.ethersprojectStrings.utf8Mod.Utf8ErrorReason.BAD_PREFIX & String = js.native
    
    @js.native
    sealed trait MISSING_CONTINUE
      extends StObject
         with Utf8ErrorReason
    /* "missing continuation byte" */ val MISSING_CONTINUE: typings.ethersprojectStrings.utf8Mod.Utf8ErrorReason.MISSING_CONTINUE & String = js.native
    
    @js.native
    sealed trait OUT_OF_RANGE
      extends StObject
         with Utf8ErrorReason
    /* "out of UTF-8 range" */ val OUT_OF_RANGE: typings.ethersprojectStrings.utf8Mod.Utf8ErrorReason.OUT_OF_RANGE & String = js.native
    
    @js.native
    sealed trait OVERLONG
      extends StObject
         with Utf8ErrorReason
    /* "overlong representation" */ val OVERLONG: typings.ethersprojectStrings.utf8Mod.Utf8ErrorReason.OVERLONG & String = js.native
    
    @js.native
    sealed trait OVERRUN
      extends StObject
         with Utf8ErrorReason
    /* "string overrun" */ val OVERRUN: typings.ethersprojectStrings.utf8Mod.Utf8ErrorReason.OVERRUN & String = js.native
    
    @js.native
    sealed trait UNEXPECTED_CONTINUE
      extends StObject
         with Utf8ErrorReason
    /* "unexpected continuation byte" */ val UNEXPECTED_CONTINUE: typings.ethersprojectStrings.utf8Mod.Utf8ErrorReason.UNEXPECTED_CONTINUE & String = js.native
    
    @js.native
    sealed trait UTF16_SURROGATE
      extends StObject
         with Utf8ErrorReason
    /* "UTF-16 surrogate" */ val UTF16_SURROGATE: typings.ethersprojectStrings.utf8Mod.Utf8ErrorReason.UTF16_SURROGATE & String = js.native
  }
  
  @scala.inline
  def _toUtf8String(codePoints: js.Array[Double]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("_toUtf8String")(codePoints.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def toEscapedUtf8String(bytes: BytesLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("_toEscapedUtf8String")(bytes.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def toEscapedUtf8String(bytes: BytesLike, onError: Utf8ErrorFunc): String = (^.asInstanceOf[js.Dynamic].applyDynamic("_toEscapedUtf8String")(bytes.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def toUtf8Bytes(str: String): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("toUtf8Bytes")(str.asInstanceOf[js.Any]).asInstanceOf[Uint8Array]
  @scala.inline
  def toUtf8Bytes(str: String, form: UnicodeNormalizationForm): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("toUtf8Bytes")(str.asInstanceOf[js.Any], form.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
  
  @scala.inline
  def toUtf8CodePoints(str: String): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("toUtf8CodePoints")(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  @scala.inline
  def toUtf8CodePoints(str: String, form: UnicodeNormalizationForm): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("toUtf8CodePoints")(str.asInstanceOf[js.Any], form.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  @scala.inline
  def toUtf8String(bytes: BytesLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toUtf8String")(bytes.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def toUtf8String(bytes: BytesLike, onError: Utf8ErrorFunc): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toUtf8String")(bytes.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type Utf8ErrorFunc = js.Function5[
    /* reason */ Utf8ErrorReason, 
    /* offset */ Double, 
    /* bytes */ ArrayLike[Double], 
    /* output */ js.Array[Double], 
    /* badCodepoint */ js.UndefOr[Double], 
    Double
  ]
}

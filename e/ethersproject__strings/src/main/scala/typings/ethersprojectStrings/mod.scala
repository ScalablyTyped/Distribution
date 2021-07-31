package typings.ethersprojectStrings

import typings.ethersprojectBytes.mod.BytesLike
import typings.ethersprojectStrings.utf8Mod.UnicodeNormalizationForm
import typings.ethersprojectStrings.utf8Mod.Utf8ErrorFunc
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ethersproject/strings", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ethersproject/strings", "UnicodeNormalizationForm")
  @js.native
  object UnicodeNormalizationForm extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.ethersprojectStrings.utf8Mod.UnicodeNormalizationForm & String] = js.native
    
    /* "NFC" */ val NFC: typings.ethersprojectStrings.utf8Mod.UnicodeNormalizationForm.NFC & String = js.native
    
    /* "NFD" */ val NFD: typings.ethersprojectStrings.utf8Mod.UnicodeNormalizationForm.NFD & String = js.native
    
    /* "NFKC" */ val NFKC: typings.ethersprojectStrings.utf8Mod.UnicodeNormalizationForm.NFKC & String = js.native
    
    /* "NFKD" */ val NFKD: typings.ethersprojectStrings.utf8Mod.UnicodeNormalizationForm.NFKD & String = js.native
    
    /* "" */ val current: typings.ethersprojectStrings.utf8Mod.UnicodeNormalizationForm.current & String = js.native
  }
  
  @JSImport("@ethersproject/strings", "Utf8ErrorReason")
  @js.native
  object Utf8ErrorReason extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.ethersprojectStrings.utf8Mod.Utf8ErrorReason & String] = js.native
    
    /* "bad codepoint prefix" */ val BAD_PREFIX: typings.ethersprojectStrings.utf8Mod.Utf8ErrorReason.BAD_PREFIX & String = js.native
    
    /* "missing continuation byte" */ val MISSING_CONTINUE: typings.ethersprojectStrings.utf8Mod.Utf8ErrorReason.MISSING_CONTINUE & String = js.native
    
    /* "out of UTF-8 range" */ val OUT_OF_RANGE: typings.ethersprojectStrings.utf8Mod.Utf8ErrorReason.OUT_OF_RANGE & String = js.native
    
    /* "overlong representation" */ val OVERLONG: typings.ethersprojectStrings.utf8Mod.Utf8ErrorReason.OVERLONG & String = js.native
    
    /* "string overrun" */ val OVERRUN: typings.ethersprojectStrings.utf8Mod.Utf8ErrorReason.OVERRUN & String = js.native
    
    /* "unexpected continuation byte" */ val UNEXPECTED_CONTINUE: typings.ethersprojectStrings.utf8Mod.Utf8ErrorReason.UNEXPECTED_CONTINUE & String = js.native
    
    /* "UTF-16 surrogate" */ val UTF16_SURROGATE: typings.ethersprojectStrings.utf8Mod.Utf8ErrorReason.UTF16_SURROGATE & String = js.native
  }
  
  @scala.inline
  def formatBytes32String(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatBytes32String")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def nameprep(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("nameprep")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def parseBytes32String(bytes: BytesLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("parseBytes32String")(bytes.asInstanceOf[js.Any]).asInstanceOf[String]
  
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
}

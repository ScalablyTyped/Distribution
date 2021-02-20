package typings.ethersprojectStrings

import typings.ethersprojectBytes.mod.BytesLike
import typings.ethersprojectStrings.utf8Mod.UnicodeNormalizationForm
import typings.ethersprojectStrings.utf8Mod.Utf8ErrorFunc
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ethersproject/strings", "UnicodeNormalizationForm")
  @js.native
  object UnicodeNormalizationForm extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.ethersprojectStrings.utf8Mod.UnicodeNormalizationForm with String] = js.native
    
    /* "NFC" */ val NFC: typings.ethersprojectStrings.utf8Mod.UnicodeNormalizationForm.NFC with String = js.native
    
    /* "NFD" */ val NFD: typings.ethersprojectStrings.utf8Mod.UnicodeNormalizationForm.NFD with String = js.native
    
    /* "NFKC" */ val NFKC: typings.ethersprojectStrings.utf8Mod.UnicodeNormalizationForm.NFKC with String = js.native
    
    /* "NFKD" */ val NFKD: typings.ethersprojectStrings.utf8Mod.UnicodeNormalizationForm.NFKD with String = js.native
    
    /* "" */ val current: typings.ethersprojectStrings.utf8Mod.UnicodeNormalizationForm.current with String = js.native
  }
  
  @JSImport("@ethersproject/strings", "Utf8ErrorReason")
  @js.native
  object Utf8ErrorReason extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.ethersprojectStrings.utf8Mod.Utf8ErrorReason with String] = js.native
    
    /* "bad codepoint prefix" */ val BAD_PREFIX: typings.ethersprojectStrings.utf8Mod.Utf8ErrorReason.BAD_PREFIX with String = js.native
    
    /* "missing continuation byte" */ val MISSING_CONTINUE: typings.ethersprojectStrings.utf8Mod.Utf8ErrorReason.MISSING_CONTINUE with String = js.native
    
    /* "out of UTF-8 range" */ val OUT_OF_RANGE: typings.ethersprojectStrings.utf8Mod.Utf8ErrorReason.OUT_OF_RANGE with String = js.native
    
    /* "overlong representation" */ val OVERLONG: typings.ethersprojectStrings.utf8Mod.Utf8ErrorReason.OVERLONG with String = js.native
    
    /* "string overrun" */ val OVERRUN: typings.ethersprojectStrings.utf8Mod.Utf8ErrorReason.OVERRUN with String = js.native
    
    /* "unexpected continuation byte" */ val UNEXPECTED_CONTINUE: typings.ethersprojectStrings.utf8Mod.Utf8ErrorReason.UNEXPECTED_CONTINUE with String = js.native
    
    /* "UTF-16 surrogate" */ val UTF16_SURROGATE: typings.ethersprojectStrings.utf8Mod.Utf8ErrorReason.UTF16_SURROGATE with String = js.native
  }
  
  @JSImport("@ethersproject/strings", "formatBytes32String")
  @js.native
  def formatBytes32String(text: String): String = js.native
  
  @JSImport("@ethersproject/strings", "nameprep")
  @js.native
  def nameprep(value: String): String = js.native
  
  @JSImport("@ethersproject/strings", "parseBytes32String")
  @js.native
  def parseBytes32String(bytes: BytesLike): String = js.native
  
  @JSImport("@ethersproject/strings", "_toEscapedUtf8String")
  @js.native
  def toEscapedUtf8String(bytes: BytesLike): String = js.native
  @JSImport("@ethersproject/strings", "_toEscapedUtf8String")
  @js.native
  def toEscapedUtf8String(bytes: BytesLike, onError: Utf8ErrorFunc): String = js.native
  
  @JSImport("@ethersproject/strings", "toUtf8Bytes")
  @js.native
  def toUtf8Bytes(str: String): Uint8Array = js.native
  @JSImport("@ethersproject/strings", "toUtf8Bytes")
  @js.native
  def toUtf8Bytes(str: String, form: UnicodeNormalizationForm): Uint8Array = js.native
  
  @JSImport("@ethersproject/strings", "toUtf8CodePoints")
  @js.native
  def toUtf8CodePoints(str: String): js.Array[Double] = js.native
  @JSImport("@ethersproject/strings", "toUtf8CodePoints")
  @js.native
  def toUtf8CodePoints(str: String, form: UnicodeNormalizationForm): js.Array[Double] = js.native
  
  @JSImport("@ethersproject/strings", "toUtf8String")
  @js.native
  def toUtf8String(bytes: BytesLike): String = js.native
  @JSImport("@ethersproject/strings", "toUtf8String")
  @js.native
  def toUtf8String(bytes: BytesLike, onError: Utf8ErrorFunc): String = js.native
}

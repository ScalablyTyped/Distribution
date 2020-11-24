package typings.ethersprojectStrings

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.ethersprojectBytes.mod.BytesLike
import typings.std.ArrayLike
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ethersproject/strings/lib/utf8", JSImport.Namespace)
@js.native
object utf8Mod extends js.Object {
  
  def _toUtf8String(codePoints: js.Array[Double]): String = js.native
  
  @JSName("_toEscapedUtf8String")
  def toEscapedUtf8String(bytes: BytesLike): String = js.native
  @JSName("_toEscapedUtf8String")
  def toEscapedUtf8String(bytes: BytesLike, onError: Utf8ErrorFunc): String = js.native
  
  def toUtf8Bytes(str: String): Uint8Array = js.native
  def toUtf8Bytes(str: String, form: UnicodeNormalizationForm): Uint8Array = js.native
  
  def toUtf8CodePoints(str: String): js.Array[Double] = js.native
  def toUtf8CodePoints(str: String, form: UnicodeNormalizationForm): js.Array[Double] = js.native
  
  def toUtf8String(bytes: BytesLike): String = js.native
  def toUtf8String(bytes: BytesLike, onError: Utf8ErrorFunc): String = js.native
  
  @js.native
  sealed trait UnicodeNormalizationForm extends js.Object
  @js.native
  object UnicodeNormalizationForm extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[UnicodeNormalizationForm with String] = js.native
    
    @js.native
    sealed trait NFC extends UnicodeNormalizationForm
    /* "NFC" */ @js.native
    object NFC extends TopLevel[NFC with String]
    
    @js.native
    sealed trait NFD extends UnicodeNormalizationForm
    /* "NFD" */ @js.native
    object NFD extends TopLevel[NFD with String]
    
    @js.native
    sealed trait NFKC extends UnicodeNormalizationForm
    /* "NFKC" */ @js.native
    object NFKC extends TopLevel[NFKC with String]
    
    @js.native
    sealed trait NFKD extends UnicodeNormalizationForm
    /* "NFKD" */ @js.native
    object NFKD extends TopLevel[NFKD with String]
    
    @js.native
    sealed trait current extends UnicodeNormalizationForm
    /* "" */ @js.native
    object current extends TopLevel[current with String]
  }
  
  @js.native
  object Utf8ErrorFuncs extends /* name */ StringDictionary[Utf8ErrorFunc]
  
  @js.native
  sealed trait Utf8ErrorReason extends js.Object
  @js.native
  object Utf8ErrorReason extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Utf8ErrorReason with String] = js.native
    
    @js.native
    sealed trait BAD_PREFIX extends Utf8ErrorReason
    /* "bad codepoint prefix" */ @js.native
    object BAD_PREFIX extends TopLevel[BAD_PREFIX with String]
    
    @js.native
    sealed trait MISSING_CONTINUE extends Utf8ErrorReason
    /* "missing continuation byte" */ @js.native
    object MISSING_CONTINUE extends TopLevel[MISSING_CONTINUE with String]
    
    @js.native
    sealed trait OUT_OF_RANGE extends Utf8ErrorReason
    /* "out of UTF-8 range" */ @js.native
    object OUT_OF_RANGE extends TopLevel[OUT_OF_RANGE with String]
    
    @js.native
    sealed trait OVERLONG extends Utf8ErrorReason
    /* "overlong representation" */ @js.native
    object OVERLONG extends TopLevel[OVERLONG with String]
    
    @js.native
    sealed trait OVERRUN extends Utf8ErrorReason
    /* "string overrun" */ @js.native
    object OVERRUN extends TopLevel[OVERRUN with String]
    
    @js.native
    sealed trait UNEXPECTED_CONTINUE extends Utf8ErrorReason
    /* "unexpected continuation byte" */ @js.native
    object UNEXPECTED_CONTINUE extends TopLevel[UNEXPECTED_CONTINUE with String]
    
    @js.native
    sealed trait UTF16_SURROGATE extends Utf8ErrorReason
    /* "UTF-16 surrogate" */ @js.native
    object UTF16_SURROGATE extends TopLevel[UTF16_SURROGATE with String]
  }
  
  type Utf8ErrorFunc = js.Function5[
    /* reason */ Utf8ErrorReason, 
    /* offset */ Double, 
    /* bytes */ ArrayLike[Double], 
    /* output */ js.Array[Double], 
    /* badCodepoint */ js.UndefOr[Double], 
    Double
  ]
}

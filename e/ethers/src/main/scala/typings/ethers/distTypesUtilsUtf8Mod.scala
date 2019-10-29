package typings.ethers

import typings.ethers.distTypesUtilsTypesMod.Arrayish
import typings.ethers.distTypesUtilsUtf8Mod.UnicodeNormalizationForm
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers/dist/types/utils/utf8", JSImport.Namespace)
@js.native
object distTypesUtilsUtf8Mod extends js.Object {
  @js.native
  sealed trait UnicodeNormalizationForm extends js.Object
  
  def toUtf8Bytes(str: String): Uint8Array = js.native
  def toUtf8Bytes(str: String, form: UnicodeNormalizationForm): Uint8Array = js.native
  def toUtf8String(bytes: Arrayish): String = js.native
  @js.native
  object UnicodeNormalizationForm extends js.Object {
    @js.native
    sealed trait NFC extends UnicodeNormalizationForm
    
    @js.native
    sealed trait NFD extends UnicodeNormalizationForm
    
    @js.native
    sealed trait NFKC extends UnicodeNormalizationForm
    
    @js.native
    sealed trait NFKD extends UnicodeNormalizationForm
    
    @js.native
    sealed trait current extends UnicodeNormalizationForm
    
    /* "NFC" */ val NFC: typings.ethers.distTypesUtilsUtf8Mod.UnicodeNormalizationForm.NFC with String = js.native
    /* "NFD" */ val NFD: typings.ethers.distTypesUtilsUtf8Mod.UnicodeNormalizationForm.NFD with String = js.native
    /* "NFKC" */ val NFKC: typings.ethers.distTypesUtilsUtf8Mod.UnicodeNormalizationForm.NFKC with String = js.native
    /* "NFKD" */ val NFKD: typings.ethers.distTypesUtilsUtf8Mod.UnicodeNormalizationForm.NFKD with String = js.native
    /* "" */ val current: typings.ethers.distTypesUtilsUtf8Mod.UnicodeNormalizationForm.current with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[UnicodeNormalizationForm with String] = js.native
  }
  
}


package typings.ethers

import org.scalablytyped.runtime.TopLevel
import typings.ethers.typesMod.Arrayish
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers/dist/types/utils/utf8", JSImport.Namespace)
@js.native
object utf8Mod extends js.Object {
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
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[UnicodeNormalizationForm with String] = js.native
    /* "NFC" */ @js.native
    object NFC extends TopLevel[NFC with String]
    
    /* "NFD" */ @js.native
    object NFD extends TopLevel[NFD with String]
    
    /* "NFKC" */ @js.native
    object NFKC extends TopLevel[NFKC with String]
    
    /* "NFKD" */ @js.native
    object NFKD extends TopLevel[NFKD with String]
    
    /* "" */ @js.native
    object current extends TopLevel[current with String]
    
  }
  
}


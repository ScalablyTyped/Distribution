package typings.ethers

import typings.ethers.typesUtilsDataMod.BytesLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUtilsUtf8Mod {
  
  @JSImport("ethers/types/utils/utf8", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Inlined std.Readonly<std.Record<'error' | 'ignore' | 'replace', ethers.ethers/types/utils/utf8.Utf8ErrorFunc>> */
  object Utf8ErrorFuncs {
    
    @JSImport("ethers/types/utils/utf8", "Utf8ErrorFuncs")
    @js.native
    val ^ : js.Any = js.native
    
    inline def error(reason: Utf8ErrorReason, offset: Double, bytes: js.typedarray.Uint8Array, output: js.Array[Double]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(reason.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], bytes.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def error(
      reason: Utf8ErrorReason,
      offset: Double,
      bytes: js.typedarray.Uint8Array,
      output: js.Array[Double],
      badCodepoint: Double
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(reason.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], bytes.asInstanceOf[js.Any], output.asInstanceOf[js.Any], badCodepoint.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def ignore(reason: Utf8ErrorReason, offset: Double, bytes: js.typedarray.Uint8Array, output: js.Array[Double]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("ignore")(reason.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], bytes.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def ignore(
      reason: Utf8ErrorReason,
      offset: Double,
      bytes: js.typedarray.Uint8Array,
      output: js.Array[Double],
      badCodepoint: Double
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("ignore")(reason.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], bytes.asInstanceOf[js.Any], output.asInstanceOf[js.Any], badCodepoint.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def replace(reason: Utf8ErrorReason, offset: Double, bytes: js.typedarray.Uint8Array, output: js.Array[Double]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(reason.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], bytes.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def replace(
      reason: Utf8ErrorReason,
      offset: Double,
      bytes: js.typedarray.Uint8Array,
      output: js.Array[Double],
      badCodepoint: Double
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(reason.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], bytes.asInstanceOf[js.Any], output.asInstanceOf[js.Any], badCodepoint.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
  
  inline def toUtf8Bytes(str: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("toUtf8Bytes")(str.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def toUtf8Bytes(str: String, form: UnicodeNormalizationForm): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("toUtf8Bytes")(str.asInstanceOf[js.Any], form.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def toUtf8CodePoints(str: String): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("toUtf8CodePoints")(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  inline def toUtf8CodePoints(str: String, form: UnicodeNormalizationForm): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("toUtf8CodePoints")(str.asInstanceOf[js.Any], form.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def toUtf8String(bytes: BytesLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toUtf8String")(bytes.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toUtf8String(bytes: BytesLike, onError: Utf8ErrorFunc): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toUtf8String")(bytes.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - typings.ethers.ethersStrings.NFC
    - typings.ethers.ethersStrings.NFD
    - typings.ethers.ethersStrings.NFKC
    - typings.ethers.ethersStrings.NFKD
  */
  trait UnicodeNormalizationForm extends StObject
  object UnicodeNormalizationForm {
    
    inline def NFC: typings.ethers.ethersStrings.NFC = "NFC".asInstanceOf[typings.ethers.ethersStrings.NFC]
    
    inline def NFD: typings.ethers.ethersStrings.NFD = "NFD".asInstanceOf[typings.ethers.ethersStrings.NFD]
    
    inline def NFKC: typings.ethers.ethersStrings.NFKC = "NFKC".asInstanceOf[typings.ethers.ethersStrings.NFKC]
    
    inline def NFKD: typings.ethers.ethersStrings.NFKD = "NFKD".asInstanceOf[typings.ethers.ethersStrings.NFKD]
  }
  
  type Utf8ErrorFunc = js.Function5[
    /* reason */ Utf8ErrorReason, 
    /* offset */ Double, 
    /* bytes */ js.typedarray.Uint8Array, 
    /* output */ js.Array[Double], 
    /* badCodepoint */ js.UndefOr[Double], 
    Double
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typings.ethers.ethersStrings.UNEXPECTED_CONTINUE
    - typings.ethers.ethersStrings.BAD_PREFIX
    - typings.ethers.ethersStrings.OVERRUN
    - typings.ethers.ethersStrings.MISSING_CONTINUE
    - typings.ethers.ethersStrings.OUT_OF_RANGE
    - typings.ethers.ethersStrings.UTF16_SURROGATE
    - typings.ethers.ethersStrings.OVERLONG
  */
  trait Utf8ErrorReason extends StObject
  object Utf8ErrorReason {
    
    inline def BAD_PREFIX: typings.ethers.ethersStrings.BAD_PREFIX = "BAD_PREFIX".asInstanceOf[typings.ethers.ethersStrings.BAD_PREFIX]
    
    inline def MISSING_CONTINUE: typings.ethers.ethersStrings.MISSING_CONTINUE = "MISSING_CONTINUE".asInstanceOf[typings.ethers.ethersStrings.MISSING_CONTINUE]
    
    inline def OUT_OF_RANGE: typings.ethers.ethersStrings.OUT_OF_RANGE = "OUT_OF_RANGE".asInstanceOf[typings.ethers.ethersStrings.OUT_OF_RANGE]
    
    inline def OVERLONG: typings.ethers.ethersStrings.OVERLONG = "OVERLONG".asInstanceOf[typings.ethers.ethersStrings.OVERLONG]
    
    inline def OVERRUN: typings.ethers.ethersStrings.OVERRUN = "OVERRUN".asInstanceOf[typings.ethers.ethersStrings.OVERRUN]
    
    inline def UNEXPECTED_CONTINUE: typings.ethers.ethersStrings.UNEXPECTED_CONTINUE = "UNEXPECTED_CONTINUE".asInstanceOf[typings.ethers.ethersStrings.UNEXPECTED_CONTINUE]
    
    inline def UTF16_SURROGATE: typings.ethers.ethersStrings.UTF16_SURROGATE = "UTF16_SURROGATE".asInstanceOf[typings.ethers.ethersStrings.UTF16_SURROGATE]
  }
}

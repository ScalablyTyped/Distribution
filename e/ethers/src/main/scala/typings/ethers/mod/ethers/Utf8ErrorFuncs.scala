package typings.ethers.mod.ethers

import typings.ethers.typesUtilsUtf8Mod.Utf8ErrorReason
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Record<'error' | 'ignore' | 'replace', ethers.ethers/types/utils/utf8.Utf8ErrorFunc>> */
object Utf8ErrorFuncs {
  
  @JSImport("ethers", "ethers.Utf8ErrorFuncs")
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

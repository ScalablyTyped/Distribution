package typings.ethereumBloomFilters

import typings.std.ArrayLike
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("ethereum-bloom-filters/dist/utils", "bytesToHex")
  @js.native
  def bytesToHex(bytes: Uint8Array): String = js.native
  
  @JSImport("ethereum-bloom-filters/dist/utils", "keccak256")
  @js.native
  def keccak256(data: String): String = js.native
  @JSImport("ethereum-bloom-filters/dist/utils", "keccak256")
  @js.native
  def keccak256(data: ArrayLike[Double]): String = js.native
  
  @JSImport("ethereum-bloom-filters/dist/utils", "padLeft")
  @js.native
  def padLeft(value: String, chars: Double): String = js.native
  
  @JSImport("ethereum-bloom-filters/dist/utils", "toByteArray")
  @js.native
  def toByteArray(value: String): Uint8Array = js.native
  @JSImport("ethereum-bloom-filters/dist/utils", "toByteArray")
  @js.native
  def toByteArray(value: ArrayLike[Double]): Uint8Array = js.native
}

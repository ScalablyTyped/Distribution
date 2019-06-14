package typings
package elgamalLib.elgamalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elgamal", "Utils")
@js.native
object UtilsNs extends js.Object {
  val BIG_TWO: jsbnLib.jsbnMod.BigInteger = js.native
  def getBigPrimeAsync(bits: scala.Double): js.Promise[jsbnLib.jsbnMod.BigInteger] = js.native
  def getRandomBigIntAsync(min: jsbnLib.jsbnMod.BigInteger, max: jsbnLib.jsbnMod.BigInteger): js.Promise[jsbnLib.jsbnMod.BigInteger] = js.native
  def getRandomNbitBigIntAsync(bits: scala.Double): js.Promise[jsbnLib.jsbnMod.BigInteger] = js.native
  def parseBigInt(obj: java.lang.String): jsbnLib.jsbnMod.BigInteger | scala.Null = js.native
  def parseBigInt(obj: jsbnLib.jsbnMod.BigInteger): jsbnLib.jsbnMod.BigInteger | scala.Null = js.native
  def parseBigInt(obj: scala.Double): jsbnLib.jsbnMod.BigInteger | scala.Null = js.native
}


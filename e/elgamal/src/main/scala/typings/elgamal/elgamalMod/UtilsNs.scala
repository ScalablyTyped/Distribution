package typings.elgamal.elgamalMod

import typings.jsbn.jsbnMod.BigInteger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elgamal", "Utils")
@js.native
object UtilsNs extends js.Object {
  val BIG_TWO: BigInteger = js.native
  def getBigPrimeAsync(bits: Double): js.Promise[BigInteger] = js.native
  def getRandomBigIntAsync(min: BigInteger, max: BigInteger): js.Promise[BigInteger] = js.native
  def getRandomNbitBigIntAsync(bits: Double): js.Promise[BigInteger] = js.native
  def parseBigInt(obj: String): BigInteger | Null = js.native
  def parseBigInt(obj: Double): BigInteger | Null = js.native
  def parseBigInt(obj: BigInteger): BigInteger | Null = js.native
}


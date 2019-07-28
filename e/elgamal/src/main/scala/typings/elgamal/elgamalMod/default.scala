package typings.elgamal.elgamalMod

import typings.jsbn.jsbnMod.BigInteger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elgamal", JSImport.Default)
@js.native
class default protected () extends ElGamal {
  def this(
    p: BigInteger | String | Double,
    g: BigInteger | String | Double,
    y: BigInteger | String | Double,
    x: BigInteger | String | Double
  ) = this()
}

/* static members */
@JSImport("elgamal", JSImport.Default)
@js.native
object default extends js.Object {
  def generateAsync(): js.Promise[ElGamal] = js.native
  def generateAsync(primeBits: Double): js.Promise[ElGamal] = js.native
}


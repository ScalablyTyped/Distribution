package typings.elliptic.ellipticMod.ec

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignOptions extends js.Object {
  var canonical: js.UndefOr[Boolean] = js.undefined
  var k: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any
  ] = js.undefined
  var pers: js.UndefOr[js.Any] = js.undefined
  var persEnc: js.UndefOr[String] = js.undefined
}

object SignOptions {
  @scala.inline
  def apply(
    canonical: js.UndefOr[Boolean] = js.undefined,
    k: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any = null,
    pers: js.Any = null,
    persEnc: String = null
  ): SignOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(canonical)) __obj.updateDynamic("canonical")(canonical)
    if (k != null) __obj.updateDynamic("k")(k)
    if (pers != null) __obj.updateDynamic("pers")(pers)
    if (persEnc != null) __obj.updateDynamic("persEnc")(persEnc)
    __obj.asInstanceOf[SignOptions]
  }
}


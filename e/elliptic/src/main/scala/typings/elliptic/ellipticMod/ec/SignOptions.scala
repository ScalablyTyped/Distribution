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
    if (!js.isUndefined(canonical)) __obj.updateDynamic("canonical")(canonical.asInstanceOf[js.Any])
    if (k != null) __obj.updateDynamic("k")(k.asInstanceOf[js.Any])
    if (pers != null) __obj.updateDynamic("pers")(pers.asInstanceOf[js.Any])
    if (persEnc != null) __obj.updateDynamic("persEnc")(persEnc.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignOptions]
  }
}


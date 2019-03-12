package typings
package fingerprintjs2Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Done extends js.Object {
  var key: java.lang.String
  var pauseBefore: js.UndefOr[scala.Boolean] = js.undefined
  def getData(
    done: js.Function1[/* value */ js.Any, scala.Unit],
    options: fingerprintjs2Lib.fingerprintjs2Mod.Fingerprint2Ns.Options
  ): scala.Unit
}

object Anon_Done {
  @scala.inline
  def apply(
    getData: (js.Function1[/* value */ js.Any, scala.Unit], fingerprintjs2Lib.fingerprintjs2Mod.Fingerprint2Ns.Options) => scala.Unit,
    key: java.lang.String,
    pauseBefore: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Done = {
    val __obj = js.Dynamic.literal(getData = js.Any.fromFunction2(getData), key = key)
    if (!js.isUndefined(pauseBefore)) __obj.updateDynamic("pauseBefore")(pauseBefore)
    __obj.asInstanceOf[Anon_Done]
  }
}


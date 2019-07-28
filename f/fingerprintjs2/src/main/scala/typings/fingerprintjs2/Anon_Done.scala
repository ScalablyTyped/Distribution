package typings.fingerprintjs2

import typings.fingerprintjs2.fingerprintjs2Mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Done extends js.Object {
  var key: String
  var pauseBefore: js.UndefOr[Boolean] = js.undefined
  def getData(done: js.Function1[/* value */ js.Any, Unit], options: Options): Unit
}

object Anon_Done {
  @scala.inline
  def apply(
    getData: (js.Function1[/* value */ js.Any, Unit], Options) => Unit,
    key: String,
    pauseBefore: js.UndefOr[Boolean] = js.undefined
  ): Anon_Done = {
    val __obj = js.Dynamic.literal(getData = js.Any.fromFunction2(getData), key = key)
    if (!js.isUndefined(pauseBefore)) __obj.updateDynamic("pauseBefore")(pauseBefore)
    __obj.asInstanceOf[Anon_Done]
  }
}


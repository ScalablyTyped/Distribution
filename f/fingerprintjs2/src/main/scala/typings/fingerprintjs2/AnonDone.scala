package typings.fingerprintjs2

import typings.fingerprintjs2.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDone extends js.Object {
  var key: String
  var pauseBefore: js.UndefOr[Boolean] = js.undefined
  def getData(done: js.Function1[/* value */ js.Any, Unit], options: Options): Unit
}

object AnonDone {
  @scala.inline
  def apply(
    getData: (js.Function1[/* value */ js.Any, Unit], Options) => Unit,
    key: String,
    pauseBefore: js.UndefOr[Boolean] = js.undefined
  ): AnonDone = {
    val __obj = js.Dynamic.literal(getData = js.Any.fromFunction2(getData), key = key.asInstanceOf[js.Any])
    if (!js.isUndefined(pauseBefore)) __obj.updateDynamic("pauseBefore")(pauseBefore.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDone]
  }
}


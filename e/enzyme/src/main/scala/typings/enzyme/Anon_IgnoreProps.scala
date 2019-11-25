package typings.enzyme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IgnoreProps extends js.Object {
  /** Whether props should be omitted in the resulting string. Props are included by default. */
  var ignoreProps: js.UndefOr[Boolean] = js.undefined
  /** Whether arrays and objects passed as props should be verbosely printed. */
  var verbose: js.UndefOr[Boolean] = js.undefined
}

object Anon_IgnoreProps {
  @scala.inline
  def apply(ignoreProps: js.UndefOr[Boolean] = js.undefined, verbose: js.UndefOr[Boolean] = js.undefined): Anon_IgnoreProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreProps)) __obj.updateDynamic("ignoreProps")(ignoreProps.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IgnoreProps]
  }
}


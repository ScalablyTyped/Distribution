package typings.fileDashUrl.fileDashUrlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Passing `false` will make it not call `path.resolve()` on the path.
  		@default true
  		*/
  val resolve: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(resolve: js.UndefOr[Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(resolve)) __obj.updateDynamic("resolve")(resolve.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}


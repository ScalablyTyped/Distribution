package typings
package fullpageDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FullPageJSGlobalOptions extends js.Object {
  var options: FullPageJsOptions
}

object FullPageJSGlobalOptions {
  @scala.inline
  def apply(options: FullPageJsOptions): FullPageJSGlobalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[FullPageJSGlobalOptions]
  }
}


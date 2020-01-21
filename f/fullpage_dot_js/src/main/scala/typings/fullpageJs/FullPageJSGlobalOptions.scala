package typings.fullpageJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FullPageJSGlobalOptions extends js.Object {
  var options: FullPageJsOptions
}

object FullPageJSGlobalOptions {
  @scala.inline
  def apply(options: FullPageJsOptions): FullPageJSGlobalOptions = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FullPageJSGlobalOptions]
  }
}


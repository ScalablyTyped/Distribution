package typings.gatsby

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOptions extends js.Object {
  var options: Record[String, _]
  var resolve: String
}

object AnonOptions {
  @scala.inline
  def apply(options: Record[String, _], resolve: String): AnonOptions = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], resolve = resolve.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOptions]
  }
}


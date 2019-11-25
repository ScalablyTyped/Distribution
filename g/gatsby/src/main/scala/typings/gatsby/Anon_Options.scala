package typings.gatsby

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Options extends js.Object {
  var options: Record[String, _]
  var resolve: String
}

object Anon_Options {
  @scala.inline
  def apply(options: Record[String, _], resolve: String): Anon_Options = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], resolve = resolve.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Options]
  }
}


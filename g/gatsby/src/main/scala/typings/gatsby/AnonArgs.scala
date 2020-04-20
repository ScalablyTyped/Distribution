package typings.gatsby

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArgs extends js.Object {
  var args: Record[String, _]
  var inputPaths: js.Array[String]
  var name: String
  var outputDir: String
}

object AnonArgs {
  @scala.inline
  def apply(args: Record[String, _], inputPaths: js.Array[String], name: String, outputDir: String): AnonArgs = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], inputPaths = inputPaths.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], outputDir = outputDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArgs]
  }
}


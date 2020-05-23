package typings.gfc.anon

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stderr extends js.Object {
  var stderr: String | Buffer
  var stdout: String | Buffer
}

object Stderr {
  @scala.inline
  def apply(stderr: String | Buffer, stdout: String | Buffer): Stderr = {
    val __obj = js.Dynamic.literal(stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stderr]
  }
}


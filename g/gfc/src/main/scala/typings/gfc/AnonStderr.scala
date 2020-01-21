package typings.gfc

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStderr extends js.Object {
  var stderr: String | Buffer
  var stdout: String | Buffer
}

object AnonStderr {
  @scala.inline
  def apply(stderr: String | Buffer, stdout: String | Buffer): AnonStderr = {
    val __obj = js.Dynamic.literal(stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonStderr]
  }
}


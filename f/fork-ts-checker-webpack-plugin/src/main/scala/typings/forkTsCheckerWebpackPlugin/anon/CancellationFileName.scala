package typings.forkTsCheckerWebpackPlugin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancellationFileName extends js.Object {
  var cancellationFileName: String
  var isCancelled: Boolean
}

object CancellationFileName {
  @scala.inline
  def apply(cancellationFileName: String, isCancelled: Boolean): CancellationFileName = {
    val __obj = js.Dynamic.literal(cancellationFileName = cancellationFileName.asInstanceOf[js.Any], isCancelled = isCancelled.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancellationFileName]
  }
}


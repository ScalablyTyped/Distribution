package typings.forkTsCheckerWebpackPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCancellationFileName extends js.Object {
  var cancellationFileName: String
  var isCancelled: Boolean
}

object AnonCancellationFileName {
  @scala.inline
  def apply(cancellationFileName: String, isCancelled: Boolean): AnonCancellationFileName = {
    val __obj = js.Dynamic.literal(cancellationFileName = cancellationFileName.asInstanceOf[js.Any], isCancelled = isCancelled.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCancellationFileName]
  }
}


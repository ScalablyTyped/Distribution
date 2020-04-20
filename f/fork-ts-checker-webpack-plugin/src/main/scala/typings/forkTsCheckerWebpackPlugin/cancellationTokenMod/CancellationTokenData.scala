package typings.forkTsCheckerWebpackPlugin.cancellationTokenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancellationTokenData extends js.Object {
  var cancellationFileName: String
  var isCancelled: Boolean
}

object CancellationTokenData {
  @scala.inline
  def apply(cancellationFileName: String, isCancelled: Boolean): CancellationTokenData = {
    val __obj = js.Dynamic.literal(cancellationFileName = cancellationFileName.asInstanceOf[js.Any], isCancelled = isCancelled.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancellationTokenData]
  }
}


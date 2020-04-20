package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadControlTextChangedEventArgs extends EventArgs {
  val inputIndex: Double
}

object UploadControlTextChangedEventArgs {
  @scala.inline
  def apply(inputIndex: Double, sender: Control): UploadControlTextChangedEventArgs = {
    val __obj = js.Dynamic.literal(inputIndex = inputIndex.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadControlTextChangedEventArgs]
  }
}


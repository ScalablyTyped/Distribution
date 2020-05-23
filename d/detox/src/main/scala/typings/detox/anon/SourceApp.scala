package typings.detox.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceApp extends js.Object {
  var sourceApp: js.UndefOr[String] = js.undefined
  var url: String
}

object SourceApp {
  @scala.inline
  def apply(url: String, sourceApp: String = null): SourceApp = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (sourceApp != null) __obj.updateDynamic("sourceApp")(sourceApp.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceApp]
  }
}


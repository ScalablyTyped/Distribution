package typings.detox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SourceApp extends js.Object {
  var sourceApp: js.UndefOr[String] = js.undefined
  var url: String
}

object Anon_SourceApp {
  @scala.inline
  def apply(url: String, sourceApp: String = null): Anon_SourceApp = {
    val __obj = js.Dynamic.literal(url = url)
    if (sourceApp != null) __obj.updateDynamic("sourceApp")(sourceApp)
    __obj.asInstanceOf[Anon_SourceApp]
  }
}


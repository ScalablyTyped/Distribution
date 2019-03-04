package typings
package detoxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SourceApp extends js.Object {
  var sourceApp: js.UndefOr[java.lang.String] = js.undefined
  var url: java.lang.String
}

object Anon_SourceApp {
  @scala.inline
  def apply(url: java.lang.String, sourceApp: java.lang.String = null): Anon_SourceApp = {
    val __obj = js.Dynamic.literal(url = url)
    if (sourceApp != null) __obj.updateDynamic("sourceApp")(sourceApp)
    __obj.asInstanceOf[Anon_SourceApp]
  }
}


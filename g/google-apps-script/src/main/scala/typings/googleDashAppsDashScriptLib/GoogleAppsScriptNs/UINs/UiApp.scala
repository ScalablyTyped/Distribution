package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UiApp extends js.Object {
  var DateTimeFormat: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DateTimeFormat */ js.Any
  var FileType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FileType */ js.Any
  var HorizontalAlignment: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof HorizontalAlignment */ js.Any
  var VerticalAlignment: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof VerticalAlignment */ js.Any
  def createApplication(): UiInstance
  def getActiveApplication(): UiInstance
  def getUserAgent(): java.lang.String
}

object UiApp {
  @scala.inline
  def apply(
    DateTimeFormat: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DateTimeFormat */ js.Any,
    FileType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FileType */ js.Any,
    HorizontalAlignment: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof HorizontalAlignment */ js.Any,
    VerticalAlignment: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof VerticalAlignment */ js.Any,
    createApplication: js.Function0[UiInstance],
    getActiveApplication: js.Function0[UiInstance],
    getUserAgent: js.Function0[java.lang.String]
  ): UiApp = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("DateTimeFormat")(DateTimeFormat)
    __obj.updateDynamic("FileType")(FileType)
    __obj.updateDynamic("HorizontalAlignment")(HorizontalAlignment)
    __obj.updateDynamic("VerticalAlignment")(VerticalAlignment)
    __obj.updateDynamic("createApplication")(createApplication)
    __obj.updateDynamic("getActiveApplication")(getActiveApplication)
    __obj.updateDynamic("getUserAgent")(getUserAgent)
    __obj.asInstanceOf[UiApp]
  }
}


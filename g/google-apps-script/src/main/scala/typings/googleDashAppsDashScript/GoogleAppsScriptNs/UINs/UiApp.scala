package typings.googleDashAppsDashScript.GoogleAppsScriptNs.UINs

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
  def getUserAgent(): String
}

object UiApp {
  @scala.inline
  def apply(
    DateTimeFormat: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DateTimeFormat */ js.Any,
    FileType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FileType */ js.Any,
    HorizontalAlignment: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof HorizontalAlignment */ js.Any,
    VerticalAlignment: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof VerticalAlignment */ js.Any,
    createApplication: () => UiInstance,
    getActiveApplication: () => UiInstance,
    getUserAgent: () => String
  ): UiApp = {
    val __obj = js.Dynamic.literal(DateTimeFormat = DateTimeFormat, FileType = FileType, HorizontalAlignment = HorizontalAlignment, VerticalAlignment = VerticalAlignment, createApplication = js.Any.fromFunction0(createApplication), getActiveApplication = js.Any.fromFunction0(getActiveApplication), getUserAgent = js.Any.fromFunction0(getUserAgent))
  
    __obj.asInstanceOf[UiApp]
  }
}


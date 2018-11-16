package typings
package fullcalendarLib.viewspecmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/ViewSpecManager", "Default")
@js.native
class Default protected () extends js.Object {
  def this(optionsManager: js.Any, _calendar: js.Any) = this()
  var _calendar: js.Any = js.native
  var optionsManager: js.Any = js.native
  var viewSpecCache: js.Any = js.native
  def buildViewSpec(requestedViewType: js.Any): js.Any = js.native
  def buildViewSpecButtonText(spec: js.Any, requestedViewType: js.Any): scala.Unit = js.native
  def buildViewSpecOptions(spec: js.Any): scala.Unit = js.native
  def clearCache(): scala.Unit = js.native
  def getUnitViewSpec(unit: js.Any): js.Any = js.native
  def getViewSpec(viewType: js.Any): js.Any = js.native
}

@JSImport("fullcalendar/ViewSpecManager", JSImport.Default)
@js.native
class default protected () extends Default {
  def this(optionsManager: js.Any, _calendar: js.Any) = this()
}


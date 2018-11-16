package typings
package fullcalendarLib.fillrendererMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fullcalendar/FillRenderer", "Default")
@js.native
class Default protected () extends js.Object {
  def this(component: js.Any) = this()
  var component: js.Any = js.native
  var elsByFill: js.Any = js.native
  var fillSegTag: java.lang.String = js.native
  def attachSegEls(`type`: js.Any, segs: js.Any): scala.Unit = js.native
  def buildSegEls(`type`: js.Any, segs: js.Any, props: js.Any): js.Array[_] = js.native
  def buildSegHtml(`type`: js.Any, seg: js.Any, props: js.Any): java.lang.String = js.native
  def renderFootprint(`type`: js.Any, componentFootprint: js.Any, props: js.Any): scala.Unit = js.native
  def renderSegs(`type`: js.Any, segs: js.Any, props: js.Any): js.Any = js.native
  def reportEls(`type`: js.Any, nodes: js.Any): scala.Unit = js.native
  def unrender(`type`: js.Any): scala.Unit = js.native
}

@JSImport("fullcalendar/FillRenderer", JSImport.Default)
@js.native
class default protected () extends Default {
  def this(component: js.Any) = this()
}


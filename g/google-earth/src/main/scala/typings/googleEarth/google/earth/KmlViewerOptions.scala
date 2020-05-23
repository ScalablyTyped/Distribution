package typings.googleEarth.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KmlViewerOptions extends KmlObject {
  /**
    * Set the state of viewer options, including sunlight, Street View, and historical imagery.
    *
    * See also:
    *
    * * GEPlugin.OPTION_STREET_VIEW
    * * GEPlugin.OPTION_SUNLIGHT
    * * GEPlugin.OPTION_HISTORICAL_IMAGERY
    * * GEPlugin.OPTION_STATE_DEFAULT
    * * GEPlugin.OPTION_STATE_ENABLED
    * * GEPlugin.OPTION_STATE_DISABLED
    */
  def getOption(`type`: GEViewerOptionsValueEnum): GEViewerOptionsValueEnum
  /**
    * Returns the current state of the specified viewer option type.
    *
    * See also:
    *
    * * GEPlugin.OPTION_STREET_VIEW
    * * GEPlugin.OPTION_SUNLIGHT
    * * GEPlugin.OPTION_HISTORICAL_IMAGERY
    * * GEPlugin.OPTION_STATE_DEFAULT
    * * GEPlugin.OPTION_STATE_ENABLED
    * * GEPlugin.OPTION_STATE_DISABLED
    */
  def setOption(`type`: GEViewerOptionsTypeEnum, state: GEViewerOptionsValueEnum): Unit
}

object KmlViewerOptions {
  @scala.inline
  def apply(
    click: KmlMouseEvent => Unit,
    dblclick: KmlMouseEvent => Unit,
    equals: KmlObject => Boolean,
    getId: () => String,
    getOption: GEViewerOptionsValueEnum => GEViewerOptionsValueEnum,
    getOwnerDocument: () => KmlDocument,
    getParentNode: () => KmlObject,
    getType: () => String,
    getUrl: () => String,
    mousedown: KmlMouseEvent => Unit,
    mousemove: KmlMouseEvent => Unit,
    mouseout: KmlMouseEvent => Unit,
    mouseover: KmlMouseEvent => Unit,
    mouseup: KmlMouseEvent => Unit,
    release: () => Unit,
    setOption: (GEViewerOptionsTypeEnum, GEViewerOptionsValueEnum) => Unit
  ): KmlViewerOptions = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1(click), dblclick = js.Any.fromFunction1(dblclick), equals = js.Any.fromFunction1(equals), getId = js.Any.fromFunction0(getId), getOption = js.Any.fromFunction1(getOption), getOwnerDocument = js.Any.fromFunction0(getOwnerDocument), getParentNode = js.Any.fromFunction0(getParentNode), getType = js.Any.fromFunction0(getType), getUrl = js.Any.fromFunction0(getUrl), mousedown = js.Any.fromFunction1(mousedown), mousemove = js.Any.fromFunction1(mousemove), mouseout = js.Any.fromFunction1(mouseout), mouseover = js.Any.fromFunction1(mouseover), mouseup = js.Any.fromFunction1(mouseup), release = js.Any.fromFunction0(release), setOption = js.Any.fromFunction2(setOption))
    __obj.asInstanceOf[KmlViewerOptions]
  }
}


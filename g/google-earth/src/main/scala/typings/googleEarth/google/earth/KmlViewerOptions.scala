package typings.googleEarth.google.earth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KmlViewerOptions
  extends StObject
     with KmlObject {
  
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
  
  inline def apply(
    click: KmlMouseEvent => Unit,
    dblclick: KmlMouseEvent => Unit,
    equals_ : KmlObject => Boolean,
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
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1(click), dblclick = js.Any.fromFunction1(dblclick), getId = js.Any.fromFunction0(getId), getOption = js.Any.fromFunction1(getOption), getOwnerDocument = js.Any.fromFunction0(getOwnerDocument), getParentNode = js.Any.fromFunction0(getParentNode), getType = js.Any.fromFunction0(getType), getUrl = js.Any.fromFunction0(getUrl), mousedown = js.Any.fromFunction1(mousedown), mousemove = js.Any.fromFunction1(mousemove), mouseout = js.Any.fromFunction1(mouseout), mouseover = js.Any.fromFunction1(mouseover), mouseup = js.Any.fromFunction1(mouseup), release = js.Any.fromFunction0(release), setOption = js.Any.fromFunction2(setOption))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[KmlViewerOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KmlViewerOptions] (val x: Self) extends AnyVal {
    
    inline def setGetOption(value: GEViewerOptionsValueEnum => GEViewerOptionsValueEnum): Self = StObject.set(x, "getOption", js.Any.fromFunction1(value))
    
    inline def setSetOption(value: (GEViewerOptionsTypeEnum, GEViewerOptionsValueEnum) => Unit): Self = StObject.set(x, "setOption", js.Any.fromFunction2(value))
  }
}

package typings.dojo.dijit.Tooltip

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("dijit.Tooltip")
@js.native
object ^ extends js.Object {
  /**
    * Static method to hide the tooltip displayed via showTooltip()
    * 
    * @param aroundNode             
    */
  def hide(aroundNode: js.Any): js.Any = js.native
  /**
    * Static method to display tooltip w/specified contents in specified position.
    * See description of dijit/Tooltip.defaultPosition for details on position parameter.
    * If position is not specified then dijit/Tooltip.defaultPosition is used.
    * 
    * @param innerHTML Contents of the tooltip             
    * @param aroundNode Specifies that tooltip should be next to this node / area             
    * @param position               OptionalList of positions to try to position tooltip (ex: ["right", "above"])             
    * @param rtl               OptionalCorresponds to WidgetBase.dir attribute, where false means "ltr" and truemeans "rtl"; specifies GUI direction, not text direction.             
    * @param textDir               OptionalCorresponds to WidgetBase.textdir attribute; specifies direction of text.             
    */
  def show(innerHTML: String, aroundNode: js.Object): js.Any = js.native
  def show(innerHTML: String, aroundNode: js.Object, position: js.Array[String]): js.Any = js.native
  def show(innerHTML: String, aroundNode: js.Object, position: js.Array[String], rtl: Boolean): js.Any = js.native
  def show(
    innerHTML: String,
    aroundNode: js.Object,
    position: js.Array[String],
    rtl: Boolean,
    textDir: String
  ): js.Any = js.native
}


package typings.dojo.dijitTooltipMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typings.dojo.dijit.Tooltip
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dijit/Tooltip", JSImport.Namespace)
@js.native
class ^ () extends Tooltip {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
}

@JSImport("dijit/Tooltip", JSImport.Namespace)
@js.native
object ^
  extends TopLevel[
      Instantiable0[Tooltip] with (Instantiable1[/* params */ js.Object, Tooltip]) with (Instantiable2[/* params */ js.Object, /* srcNodeRef */ HTMLElement, Tooltip])
    ] {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dijit/Tooltip._MasterTooltip.html
    *
    * Internal widget that holds the actual tooltip markup,
    * which occurs once per page.
    * Called by Tooltip widgets which are just containers to hold
    * the markup
    * 
    * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
    * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree     
    */
  var _MasterTooltip: Instantiable2[
    js.UndefOr[/* params */ js.Object], 
    js.UndefOr[/* srcNodeRef */ HTMLElement], 
    typings.dojo.dijit.Tooltip._MasterTooltip
  ] = js.native
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


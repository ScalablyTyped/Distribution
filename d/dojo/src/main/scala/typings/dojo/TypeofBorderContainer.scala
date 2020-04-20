package typings.dojo

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable2
import typings.dojo.dijit.layout.BorderContainer.Gutter
import typings.dojo.dijit.layout.BorderContainer.Splitter
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofBorderContainer extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dijit/layout/BorderContainer._Gutter.html
    *
    * Just a spacer div to separate side pane from center pane.
    * Basically a trick to lookup the gutter/splitter width from the theme.
    * Instantiated by dijit/layout/BorderContainer.  Users should not
    * create directly.
    * 
    * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
    * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree     
    */
  var _Gutter: Instantiable2[js.UndefOr[/* params */ js.Object], js.UndefOr[/* srcNodeRef */ HTMLElement], Gutter]
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dijit/layout/BorderContainer._Splitter.html
    *
    * A draggable spacer between two items in a dijit/layout/BorderContainer.
    * This is instantiated by dijit/layout/BorderContainer.  Users should not
    * create it directly.
    * 
    */
  var _Splitter: Instantiable0[Splitter]
}

object TypeofBorderContainer {
  @scala.inline
  def apply(
    _Gutter: Instantiable2[js.UndefOr[/* params */ js.Object], js.UndefOr[/* srcNodeRef */ HTMLElement], Gutter],
    _Splitter: Instantiable0[Splitter]
  ): TypeofBorderContainer = {
    val __obj = js.Dynamic.literal(_Gutter = _Gutter.asInstanceOf[js.Any], _Splitter = _Splitter.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofBorderContainer]
  }
}


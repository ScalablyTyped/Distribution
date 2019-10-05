package typings.dojo

import org.scalablytyped.runtime.Instantiable2
import typings.dojo.dijit.layout.TabController.TabButton
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofTabController extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dijit/layout/TabController.TabButton.html
    *
    * 
    * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
    * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree     
    */
  var TabButton: Instantiable2[
    js.UndefOr[/* params */ js.Object], 
    js.UndefOr[/* srcNodeRef */ HTMLElement], 
    typings.dojo.dijit.layout.TabController.TabButton
  ]
}

object TypeofTabController {
  @scala.inline
  def apply(
    TabButton: Instantiable2[
      js.UndefOr[/* params */ js.Object], 
      js.UndefOr[/* srcNodeRef */ HTMLElement], 
      TabButton
    ]
  ): TypeofTabController = {
    val __obj = js.Dynamic.literal(TabButton = TabButton)
  
    __obj.asInstanceOf[TypeofTabController]
  }
}


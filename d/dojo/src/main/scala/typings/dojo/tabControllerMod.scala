package typings.dojo

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typings.dojo.dijit.layout.TabController
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dijit/layout/TabController", JSImport.Namespace)
@js.native
object tabControllerMod
  extends TopLevel[
      TypeofTabController with (Instantiable2[
        js.UndefOr[/* params */ js.Object], 
        js.UndefOr[/* srcNodeRef */ HTMLElement], 
        TabController
      ])
    ] {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dijit/layout/TabController.TabButton.html
    *
    * 
    * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
    * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree     
    */
  @js.native
  class TabButton ()
    extends typings.dojo.dijit.layout.TabController.TabButton {
    def this(params: js.Object) = this()
    def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  }
  
}


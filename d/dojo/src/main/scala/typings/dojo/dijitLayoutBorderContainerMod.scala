package typings.dojo

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typings.dojo.dijit.layout.BorderContainer
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dijit/layout/BorderContainer", JSImport.Namespace)
@js.native
object dijitLayoutBorderContainerMod
  extends TopLevel[
      TypeofBorderContainer with (Instantiable2[
        js.UndefOr[/* params */ js.Object], 
        js.UndefOr[/* srcNodeRef */ HTMLElement], 
        BorderContainer
      ])
    ] {
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
  @js.native
  class _Gutter ()
    extends typings.dojo.dijit.layout.BorderContainer._Gutter {
    def this(params: js.Object) = this()
    def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dijit/layout/BorderContainer._Splitter.html
    *
    * A draggable spacer between two items in a dijit/layout/BorderContainer.
    * This is instantiated by dijit/layout/BorderContainer.  Users should not
    * create it directly.
    * 
    */
  @js.native
  class _Splitter ()
    extends typings.dojo.dijit.layout.BorderContainer._Splitter
  
}


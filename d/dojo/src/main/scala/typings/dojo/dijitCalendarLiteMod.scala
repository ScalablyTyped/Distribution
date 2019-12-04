package typings.dojo

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typings.dojo.dijit.CalendarLite
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dijit/CalendarLite", JSImport.Namespace)
@js.native
object dijitCalendarLiteMod
  extends TopLevel[
      TypeofCalendarLite with (Instantiable2[
        js.UndefOr[/* params */ js.Object], 
        js.UndefOr[/* srcNodeRef */ HTMLElement], 
        CalendarLite
      ])
    ] {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dijit/CalendarLite._MonthWidget.html
    *
    * Displays name of current month padded to the width of the month
    * w/the longest name, so that changing months doesn't change width.
    * 
    * Create as:
    * 
    * new Calendar._MonthWidget({
    *         lang: ...,
    *         dateLocaleModule: ...
    *     })
    * 
    * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
    * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree     
    */
  @js.native
  class _MonthWidget ()
    extends typings.dojo.dijit.CalendarLite._MonthWidget {
    def this(params: js.Object) = this()
    def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  }
  
}


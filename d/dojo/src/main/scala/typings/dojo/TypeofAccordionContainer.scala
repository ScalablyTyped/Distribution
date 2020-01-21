package typings.dojo

import org.scalablytyped.runtime.Instantiable2
import typings.dojo.dijit.layout.AccordionContainer.Button
import typings.dojo.dijit.layout.AccordionContainer.InnerContainer
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofAccordionContainer extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dijit/layout/AccordionContainer._Button.html
    *
    * The title bar to click to open up an accordion pane.
    * Internal widget used by AccordionContainer.
    * 
    * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
    * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree     
    */
  var _Button: Instantiable2[js.UndefOr[/* params */ js.Object], js.UndefOr[/* srcNodeRef */ HTMLElement], Button]
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dijit/layout/AccordionContainer._InnerContainer.html
    *
    * 
    * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
    * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree     
    */
  var _InnerContainer: Instantiable2[
    js.UndefOr[/* params */ js.Object], 
    js.UndefOr[/* srcNodeRef */ HTMLElement], 
    InnerContainer
  ]
}

object TypeofAccordionContainer {
  @scala.inline
  def apply(
    _Button: Instantiable2[js.UndefOr[/* params */ js.Object], js.UndefOr[/* srcNodeRef */ HTMLElement], Button],
    _InnerContainer: Instantiable2[
      js.UndefOr[/* params */ js.Object], 
      js.UndefOr[/* srcNodeRef */ HTMLElement], 
      InnerContainer
    ]
  ): TypeofAccordionContainer = {
    val __obj = js.Dynamic.literal(_Button = _Button.asInstanceOf[js.Any], _InnerContainer = _InnerContainer.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TypeofAccordionContainer]
  }
}


package typings.dojo

import org.scalablytyped.runtime.Instantiable2
import typings.dojo.dijit._editor.plugins.FontChoice._FontDropDown
import typings.dojo.dijit._editor.plugins.FontChoice._FontNameDropDown
import typings.dojo.dijit._editor.plugins.FontChoice._FontSizeDropDown
import typings.dojo.dijit._editor.plugins.FontChoice._FormatBlockDropDown
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofFontChoice extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dijit/_editor/plugins/FontChoice._FontDropDown.html
    *
    * Base class for widgets that contains a label (like "Font:")
    * and a FilteringSelect drop down to pick a value.
    * Used as Toolbar entry.
    * 
    * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
    * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree     
    */
  var _FontDropDown: Instantiable2[
    js.UndefOr[/* params */ js.Object], 
    js.UndefOr[/* srcNodeRef */ HTMLElement], 
    typings.dojo.dijit._editor.plugins.FontChoice._FontDropDown
  ]
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dijit/_editor/plugins/FontChoice._FontNameDropDown.html
    *
    * Dropdown to select a font; goes in editor toolbar.
    * 
    * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
    * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree     
    */
  var _FontNameDropDown: Instantiable2[
    js.UndefOr[/* params */ js.Object], 
    js.UndefOr[/* srcNodeRef */ HTMLElement], 
    typings.dojo.dijit._editor.plugins.FontChoice._FontNameDropDown
  ]
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dijit/_editor/plugins/FontChoice._FontSizeDropDown.html
    *
    * Dropdown to select a font size; goes in editor toolbar.
    * 
    * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
    * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree     
    */
  var _FontSizeDropDown: Instantiable2[
    js.UndefOr[/* params */ js.Object], 
    js.UndefOr[/* srcNodeRef */ HTMLElement], 
    typings.dojo.dijit._editor.plugins.FontChoice._FontSizeDropDown
  ]
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dijit/_editor/plugins/FontChoice._FormatBlockDropDown.html
    *
    * Dropdown to select a format (like paragraph or heading); goes in editor toolbar.
    * 
    * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
    * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree     
    */
  var _FormatBlockDropDown: Instantiable2[
    js.UndefOr[/* params */ js.Object], 
    js.UndefOr[/* srcNodeRef */ HTMLElement], 
    typings.dojo.dijit._editor.plugins.FontChoice._FormatBlockDropDown
  ]
}

object TypeofFontChoice {
  @scala.inline
  def apply(
    _FontDropDown: Instantiable2[
      js.UndefOr[/* params */ js.Object], 
      js.UndefOr[/* srcNodeRef */ HTMLElement], 
      _FontDropDown
    ],
    _FontNameDropDown: Instantiable2[
      js.UndefOr[/* params */ js.Object], 
      js.UndefOr[/* srcNodeRef */ HTMLElement], 
      _FontNameDropDown
    ],
    _FontSizeDropDown: Instantiable2[
      js.UndefOr[/* params */ js.Object], 
      js.UndefOr[/* srcNodeRef */ HTMLElement], 
      _FontSizeDropDown
    ],
    _FormatBlockDropDown: Instantiable2[
      js.UndefOr[/* params */ js.Object], 
      js.UndefOr[/* srcNodeRef */ HTMLElement], 
      _FormatBlockDropDown
    ]
  ): TypeofFontChoice = {
    val __obj = js.Dynamic.literal(_FontDropDown = _FontDropDown, _FontNameDropDown = _FontNameDropDown, _FontSizeDropDown = _FontSizeDropDown, _FormatBlockDropDown = _FormatBlockDropDown)
  
    __obj.asInstanceOf[TypeofFontChoice]
  }
}


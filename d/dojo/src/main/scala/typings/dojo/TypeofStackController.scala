package typings.dojo

import org.scalablytyped.runtime.Instantiable2
import typings.dojo.dijit.layout.StackController.StackButton
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofStackController extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dijit/layout/StackController.StackButton.html
    *
    * Internal widget used by StackContainer.
    * The button-like or tab-like object you click to select or delete a page
    * 
    * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
    * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree     
    */
  var StackButton: Instantiable2[
    js.UndefOr[/* params */ js.Object], 
    js.UndefOr[/* srcNodeRef */ HTMLElement], 
    typings.dojo.dijit.layout.StackController.StackButton
  ]
}

object TypeofStackController {
  @scala.inline
  def apply(
    StackButton: Instantiable2[
      js.UndefOr[/* params */ js.Object], 
      js.UndefOr[/* srcNodeRef */ HTMLElement], 
      StackButton
    ]
  ): TypeofStackController = {
    val __obj = js.Dynamic.literal(StackButton = StackButton)
  
    __obj.asInstanceOf[TypeofStackController]
  }
}


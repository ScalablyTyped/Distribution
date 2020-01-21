package typings.dojo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dijit {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dijit/BackgroundIframe.html
    *
    * For IE/FF z-index shenanigans. id attribute is required.
    * new dijit.BackgroundIframe(node).
    * 
    * Makes a background iframe as a child of node, that fills
    * area (and position) of node
    * 
    * @param node     
    */
  type BackgroundIframe = js.Function1[/* node */ typings.std.HTMLElement, scala.Unit]
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dijit/_BidiSupport.html
    *
    * Deprecated module for enabling textdir support in the dijit widgets.   New code should just define
    * has("dojo-bidi") to return true, rather than manually requiring this module.
    * 
    */
  type BidiSupport = js.Function0[scala.Unit]
  type Calendar = typings.dojo.dijit.Calendar_
  type CalendarLite = typings.dojo.dijit.CalendarLite_
  type ColorPalette = typings.dojo.dijit.ColorPalette_
  type Dialog = typings.dojo.dijit.Dialog_
  type InlineEditBox = typings.dojo.dijit.InlineEditBox_
  type MenuBarItem = typings.dojo.dijit.MenuBarItem_
  type OnDijitClickMixin = typings.dojo.dijit.OnDijitClickMixin_
  type PaletteMixin = typings.dojo.dijit.PaletteMixin_
  type TemplatedMixin = typings.dojo.dijit.TemplatedMixin_
  type TimePicker = typings.dojo.dijit.TimePicker_
  type Tooltip = typings.dojo.dijit.Tooltip_
  type Tree_ = typings.dojo.dijit.Tree__
  type base = typings.dojo.dijit.base_
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dijit/hccss.html
    *
    * Test if computer is in high contrast mode, and sets dijit_a11y flag on <body> if it is.
    * Deprecated, use dojo/hccss instead.
    * 
    */
  type hccss = js.Function0[scala.Unit]
  type main = typings.dojo.dijit.main_
  type place = typings.dojo.dijit.place_
  type registry = typings.dojo.dijit.registry_
}

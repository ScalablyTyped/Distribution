package typings.dojo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dijit {
  import typings.std.HTMLElement

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
  type BackgroundIframe = js.Function1[/* node */ HTMLElement, Unit]
  type Dialog = Dialog_
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dijit/_BidiSupport.html
    *
    * Deprecated module for enabling textdir support in the dijit widgets.   New code should just define
    * has("dojo-bidi") to return true, rather than manually requiring this module.
    * 
    */
  type _BidiSupport = js.Function0[Unit]
  type _OnDijitClickMixin = _OnDijitClickMixin_
  type _TemplatedMixin = _TemplatedMixin_
  type _base = _base_
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dijit/hccss.html
    *
    * Test if computer is in high contrast mode, and sets dijit_a11y flag on <body> if it is.
    * Deprecated, use dojo/hccss instead.
    * 
    */
  type hccss = js.Function0[Unit]
  type main = main_
  type place = place_
  type registry = registry_
}

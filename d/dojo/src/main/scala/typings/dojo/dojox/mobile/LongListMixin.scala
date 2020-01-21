package typings.dojo.dojox.mobile

import typings.dojo.dijit.Widget
import typings.dojo.dijit.WidgetBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/LongListMixin.html
  *
  * This mixin enhances performance of very long lists contained in scrollable views.
  * LongListMixin enhances a list contained in a ScrollableView
  * so that only a subset of the list items are actually contained in the DOM
  * at any given time.
  * The parent must be a ScrollableView or another scrollable component
  * that inherits from the dojox.mobile.scrollable mixin, otherwise the mixin has
  * no effect. Also, editable lists are not yet supported, so lazy scrolling is
  * disabled if the list's 'editable' attribute is true.
  * If this mixin is used, list items must be added, removed or reordered exclusively
  * using the addChild and removeChild methods of the list. If the DOM is modified
  * directly (for example using list.containerNode.appendChild(...)), the list
  * will not behave correctly.
  *
  */
@JSGlobal("dojox.mobile.LongListMixin")
@js.native
class LongListMixin () extends js.Object {
  /**
    * When this limit is reached, previous pages will be unloaded.
    *
    */
  var maxPages: Double = js.native
  /**
    * Items are loaded in the DOM by chunks of this size.
    *
    */
  var pageSize: Double = js.native
  /**
    * Number of pages that will be unloaded when maxPages is reached.
    *
    */
  var unloadPages: Double = js.native
  /**
    *
    * @param widget
    * @param insertIndex               Optional
    */
  def addChild(widget: Widget, insertIndex: Double): Unit = js.native
  /**
    * Overrides dojox.mobile._StoreListMixin when the list is a store list.
    *
    * @param items
    */
  def generateList(items: js.Array[_]): Unit = js.native
  /**
    *
    */
  def getChildren(): js.Any = js.native
  /**
    *
    * @param widget
    */
  def removeChild(widget: Double): Unit = js.native
  /**
    *
    * @param widget
    */
  def removeChild(widget: WidgetBase): Unit = js.native
  /**
    *
    */
  def resize(): Unit = js.native
  /**
    *
    */
  def startup(): Unit = js.native
}


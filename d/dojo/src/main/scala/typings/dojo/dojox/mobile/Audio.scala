package typings.dojo.dojox.mobile

import typings.dojo.Anon_Unwatch
import typings.dojo.Fn_NewValueOldValueProperty
import typings.dojo.Fn_NewValueOldValuePropertyAnyArray
import typings.dojo.dijit._WidgetBase
import typings.dojo.dojoStrings.height
import typings.dojo.dojoStrings.source
import typings.dojo.dojoStrings.style
import typings.dojo.dojoStrings.width
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/Audio.html
  *
  * A thin wrapper around the HTML5 <audio> element.
  * dojox/mobile/Audio is a widget which plays audio. If all sources cannot
  * be played (typically, in desktop browsers that do not support <audio>),
  * dojox/mobile/Audio automatically replaces <audio> with <embed>, such
  * that the browser tries to play it with a suitable plug-in.
  *
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.dojo.dijit._Contained because Inheritance from two classes. Inlined getIndexInParent, getNextSibling, getPreviousSibling */ @JSGlobal("dojox.mobile.Audio")
@js.native
class Audio () extends _WidgetBase {
  /**
    * The height of the embed element.
    * Note that changing the value of the property after the widget
    * creation has no effect.
    *
    */
  var height: String = js.native
  /**
    * An array of src and type,
    * ex. [{src:"a.mp3", type:"audio/mpeg"}, {src:"a.ogg", type:"audio/ogg"}, ...].
    * The src gives the path of the media resource. The type gives the
    * type of the media resource.
    * Note that changing the value of the property after the widget
    * creation has no effect.
    *
    */
  var source: js.Array[_] = js.native
  /**
    * HTML style attributes as cssText string or name/value hash
    *
    */
  @JSName("style")
  var style_Audio: String = js.native
  /**
    * The width of the embed element.
    * Note that changing the value of the property after the widget
    * creation has no effect.
    *
    */
  var width: String = js.native
  /**
    * Returns the index of this widget within its container parent.
    * It returns -1 if the parent does not exist, or if the parent
    * is not a dijit/_Container
    *
    */
  /**
    * Returns the index of this widget within its container parent.
    * It returns -1 if the parent does not exist, or if the parent
    * is not a dijit/_Container
    * 
    */
  def getIndexInParent(): js.Any = js.native
  /**
    * Returns null if this is the last child of the parent,
    * otherwise returns the next element sibling to the "right".
    *
    */
  /**
    * Returns null if this is the last child of the parent,
    * otherwise returns the next element sibling to the "right".
    * 
    */
  def getNextSibling(): js.Any = js.native
  /**
    * Returns null if this is the first child of the parent,
    * otherwise returns the next element sibling to the "left".
    *
    */
  /**
    * Returns null if this is the first child of the parent,
    * otherwise returns the next element sibling to the "left".
    * 
    */
  def getPreviousSibling(): js.Any = js.native
  @JSName("get")
  def get_height(property: height): String = js.native
  @JSName("get")
  def get_source(property: source): js.Array[_] = js.native
  @JSName("get")
  def get_width(property: width): String = js.native
  /**
    * Track specified handles and remove/destroy them when this instance is destroyed, unless they were
    * already removed/destroyed manually.
    *
    */
  def own(): js.Any = js.native
  @JSName("set")
  def set_height(property: height, value: String): Unit = js.native
  @JSName("set")
  def set_source(property: source, value: js.Array[_]): Unit = js.native
  @JSName("set")
  def set_style(property: style, value: String): Unit = js.native
  @JSName("set")
  def set_width(property: width, value: String): Unit = js.native
  @JSName("watch")
  def watch_height(property: height, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_source(property: source, callback: Fn_NewValueOldValuePropertyAnyArray): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_style(property: style, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_width(property: width, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
}


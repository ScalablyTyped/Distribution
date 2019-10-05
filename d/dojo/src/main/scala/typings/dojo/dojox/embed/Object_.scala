package typings.dojo.dojox.embed

import typings.dojo.Anon_Unwatch
import typings.dojo.Fn_NewValueOldValue
import typings.dojo.Fn_NewValueOldValueProperty
import typings.dojo.Fn_NewValueOldValuePropertyRegExp
import typings.dojo.dijit._Widget
import typings.dojo.dojoStrings.height
import typings.dojo.dojoStrings.movie
import typings.dojo.dojoStrings.params
import typings.dojo.dojoStrings.reFlash
import typings.dojo.dojoStrings.reQtAudio
import typings.dojo.dojoStrings.reQtMovie
import typings.dojo.dojoStrings.src
import typings.dojo.dojoStrings.style
import typings.dojo.dojoStrings.width
import typings.std.HTMLElement
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/embed/Object.html
  *
  * A widget you can use to embed either a Flash or Quicktime
  * movie.
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
@JSGlobal("dojox.embed.Object_")
@js.native
class Object_ () extends _Widget {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * The height of the movie. If not provided, the height of this.domNode is used.
    *
    */
  var height: js.Object = js.native
  /**
    * The eventual reference to the movie embedded.  If you are looking to script
    * control over the movie, you'd access it this way.
    *
    */
  var movie: js.Object = js.native
  /**
    * A property bag that is created postCreate.  Any additional attributes you
    * define on your domNode will be collected and placed into this, which will
    * then be passed to the movie constructor.
    *
    */
  var params: js.Object = js.native
  /**
    * Expression used on the src property to determine if this is Flash or Quicktime.
    *
    */
  var reFlash: RegExp = js.native
  /**
    * Expression used on the src property to determine if this is Flash or Quicktime.
    *
    */
  var reQtAudio: RegExp = js.native
  /**
    * Expression used on the src property to determine if this is Flash or Quicktime.
    *
    */
  var reQtMovie: RegExp = js.native
  /**
    * The URL of the movie to embed.
    *
    */
  var src: String = js.native
  /**
    * HTML style attributes as cssText string or name/value hash
    *
    */
  @JSName("style")
  var style_Object_ : String = js.native
  /**
    * The width of the movie. If not provided, the width of this.domNode is used.
    *
    */
  var width: js.Object = js.native
  @JSName("get")
  def get_height(property: height): js.Object = js.native
  @JSName("get")
  def get_movie(property: movie): js.Object = js.native
  @JSName("get")
  def get_params(property: params): js.Object = js.native
  @JSName("get")
  def get_reFlash(property: reFlash): RegExp = js.native
  @JSName("get")
  def get_reQtAudio(property: reQtAudio): RegExp = js.native
  @JSName("get")
  def get_reQtMovie(property: reQtMovie): RegExp = js.native
  @JSName("get")
  def get_src(property: src): String = js.native
  @JSName("get")
  def get_width(property: width): js.Object = js.native
  @JSName("set")
  def set_height(property: height, value: js.Object): Unit = js.native
  @JSName("set")
  def set_movie(property: movie, value: js.Object): Unit = js.native
  @JSName("set")
  def set_params(property: params, value: js.Object): Unit = js.native
  @JSName("set")
  def set_reFlash(property: reFlash, value: RegExp): Unit = js.native
  @JSName("set")
  def set_reQtAudio(property: reQtAudio, value: RegExp): Unit = js.native
  @JSName("set")
  def set_reQtMovie(property: reQtMovie, value: RegExp): Unit = js.native
  @JSName("set")
  def set_src(property: src, value: String): Unit = js.native
  @JSName("set")
  def set_style(property: style, value: String): Unit = js.native
  @JSName("set")
  def set_width(property: width, value: js.Object): Unit = js.native
  @JSName("watch")
  def watch_height(property: height, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_movie(property: movie, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_params(property: params, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_reFlash(property: reFlash, callback: Fn_NewValueOldValuePropertyRegExp): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_reQtAudio(property: reQtAudio, callback: Fn_NewValueOldValuePropertyRegExp): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_reQtMovie(property: reQtMovie, callback: Fn_NewValueOldValuePropertyRegExp): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_src(property: src, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_style(property: style, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_width(property: width, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
}


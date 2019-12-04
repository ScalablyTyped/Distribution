package typings.dojo.dojox.charting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/charting/SimpleTheme.html
  *
  * A SimpleTheme or Theme is a pre-defined object, primarily JSON-based, that makes up the definitions to
  * style a chart.
  * While you can set up style definitions on a chart directly (usually through the various add methods
  * on a dojox.charting.Chart object), a Theme simplifies this manual setup by allowing you to
  * pre-define all of the various visual parameters of each element in a chart.
  *
  * Most of the properties of a Theme are straight-forward; if something is line-based (such as
  * an axis or the ticks on an axis), they will be defined using basic stroke parameters.  Likewise,
  * if an element is primarily block-based (such as the background of a chart), it will be primarily
  * fill-based.
  *
  * In addition (for convenience), a Theme definition does not have to contain the entire JSON-based
  * structure.  Each theme is built on top of a default theme (which serves as the basis for the theme
  * "GreySkies"), and is mixed into the default theme object.  This allows you to create a theme based,
  * say, solely on colors for data series.
  *
  * Defining a new theme is relatively easy; see any of the themes in dojox.charting.themes for examples
  * on how to define your own.
  *
  * When you set a theme on a chart, the theme itself is deep-cloned.  This means that you cannot alter
  * the theme itself after setting the theme value on a chart, and expect it to change your chart.  If you
  * are looking to make alterations to a theme for a chart, the suggestion would be to create your own
  * theme, based on the one you want to use, that makes those alterations before it is applied to a chart.
  *
  * Finally, a Theme contains a number of functions to facilitate rendering operations on a chart--the main
  * helper of which is the ~next~ method, in which a chart asks for the information for the next data series
  * to be rendered.
  *
  * A note on colors:
  * A theme palette is usually comprised of 5 different color definitions, and
  * no more.  If you have a need to render a chart with more than 5 data elements, you can simply "push"
  * new color definitions into the theme's .color array.  Make sure that you do that with the actual
  * theme object from a Chart, and not in the theme itself (i.e. either do that before using .setTheme
  * on a chart).
  *
  * @param kwArgs
  */
@JSGlobal("dojox.charting.SimpleTheme")
@js.native
class SimpleTheme_ protected () extends js.Object {
  def this(kwArgs: js.Any) = this()
  /**
    *
    */
  var defaultColors: js.Array[_] = js.native
  /**
    *
    */
  var defaultMarkers: js.Object = js.native
  /**
    *
    */
  var defaultTheme: js.Object = js.native
  /**
    *
    */
  var shapeSpaces: js.Object = js.native
  /**
    * Add a custom marker to this theme.
    *
    * @param name
    * @param segment
    */
  def addMarker(name: String, segment: String): Unit = js.native
  /**
    * Add a mixin object to the passed theme and process.
    *
    * @param theme The theme to mixin to.
    * @param elementType The type of element in question. Can be "line", "bar" or "circle"
    * @param mixin The object or objects to mix into the theme.
    * @param doPost If true, run the new theme through the post-processor.
    */
  def addMixin(theme: SimpleTheme, elementType: String, mixin: js.Array[_], doPost: Boolean): js.Any = js.native
  /**
    * Add a mixin object to the passed theme and process.
    *
    * @param theme The theme to mixin to.
    * @param elementType The type of element in question. Can be "line", "bar" or "circle"
    * @param mixin The object or objects to mix into the theme.
    * @param doPost If true, run the new theme through the post-processor.
    */
  def addMixin(theme: SimpleTheme, elementType: String, mixin: js.Object, doPost: Boolean): js.Any = js.native
  /**
    * Clear and reset the internal pointer to start fresh.
    *
    */
  def clear(): Unit = js.native
  /**
    * Calculates and merges tick parameters.
    *
    * @param name Tick name, can be "major", "minor", or "micro".
    * @param mixin               OptionalOptional object to mix in to the tick.
    */
  def getTick(name: String, mixin: js.Object): js.Any = js.native
  /**
    *
    * @param f
    */
  def inspectObjects(f: js.Any): Unit = js.native
  /**
    * Get the next color or series theme.
    *
    * @param elementType               OptionalAn optional element type (for use with series themes)
    * @param mixin               OptionalAn optional object to mix into the theme.
    * @param doPost               OptionalA flag to post-process the results.
    */
  def next(elementType: String, mixin: js.Object, doPost: Boolean): js.Any = js.native
  /**
    * Process any post-shape fills.
    *
    * @param theme The theme to post process with.
    * @param elementType The type of element being filled.  Can be "bar" or "circle".
    */
  def post(theme: SimpleTheme, elementType: String): js.Any = js.native
  /**
    *
    */
  def reverseFills(): Unit = js.native
  /**
    * Set all the markers of this theme at once.  obj should be a
    * dictionary of keys and path segments.
    *
    * @param obj
    */
  def setMarkers(obj: js.Object): Unit = js.native
  /**
    * Skip the next internal color.
    *
    */
  def skip(): Unit = js.native
}


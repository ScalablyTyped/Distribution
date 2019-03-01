package typings
package dygraphsLib.dygraphsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Annotation extends js.Object {
  /**	If true, attach annotations to the x-axis, rather than to actual points. */
  var attachAtBottom: js.UndefOr[scala.Boolean] = js.undefined
  /** This function is called whenever the user clicks on this annotation. */
  var clickHandler: js.UndefOr[
    js.Function4[
      /* annotation */ Annotation, 
      /* point */ Point, 
      /* dygraph */ dygraphsLib.Dygraph, 
      /* event */ stdLib.MouseEvent, 
      _
    ]
  ] = js.undefined
  /**	CSS class to use for styling the annotation. */
  var cssClass: js.UndefOr[java.lang.String] = js.undefined
  /** this function is called whenever the user double-clicks on this annotation. */
  var dblClickHandler: js.UndefOr[
    js.Function4[
      /* annotation */ Annotation, 
      /* point */ Point, 
      /* dygraph */ dygraphsLib.Dygraph, 
      /* event */ stdLib.MouseEvent, 
      _
    ]
  ] = js.undefined
  var div: js.UndefOr[stdLib.HTMLDivElement] = js.undefined
  /** Height (in pixels) of the annotation flag or icon. */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
    * Specify in place of shortText to mark the annotation with an image rather than text.
    * If you specify this, you must specify width and height.
    */
  var icon: js.UndefOr[java.lang.String] = js.undefined
  /** This function is called whenever the user mouses out of this annotation. */
  var mouseOutHandler: js.UndefOr[
    js.Function4[
      /* annotation */ Annotation, 
      /* point */ Point, 
      /* dygraph */ dygraphsLib.Dygraph, 
      /* event */ stdLib.MouseEvent, 
      _
    ]
  ] = js.undefined
  /** This function is called whenever the user mouses over this annotation. */
  var mouseOverHandler: js.UndefOr[
    js.Function4[
      /* annotation */ Annotation, 
      /* point */ Point, 
      /* dygraph */ dygraphsLib.Dygraph, 
      /* event */ stdLib.MouseEvent, 
      _
    ]
  ] = js.undefined
  /** The name of the series to which the annotated point belongs. */
  var series: java.lang.String
  /**	Text that will appear on the annotation's flag. */
  var shortText: js.UndefOr[java.lang.String] = js.undefined
  /** A longer description of the annotation which will appear when the user hovers over it. */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /**	Height of the tick mark (in pixels) connecting the point to its flag or icon. */
  var tickHeight: js.UndefOr[scala.Double] = js.undefined
  /**	Width (in pixels) of the annotation flag or icon. */
  var width: js.UndefOr[scala.Double] = js.undefined
  /**
    * The x value of the point. This should be the same as the value
    * you specified in your CSV file, e.g. "2010-09-13".
    * You must set either x or xval.
    */
  var x: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * numeric value of the point, or millis since epoch.
    */
  var xval: js.UndefOr[scala.Double] = js.undefined
}

object Annotation {
  @scala.inline
  def apply(
    series: java.lang.String,
    attachAtBottom: js.UndefOr[scala.Boolean] = js.undefined,
    clickHandler: js.Function4[
      /* annotation */ Annotation, 
      /* point */ Point, 
      /* dygraph */ dygraphsLib.Dygraph, 
      /* event */ stdLib.MouseEvent, 
      _
    ] = null,
    cssClass: java.lang.String = null,
    dblClickHandler: js.Function4[
      /* annotation */ Annotation, 
      /* point */ Point, 
      /* dygraph */ dygraphsLib.Dygraph, 
      /* event */ stdLib.MouseEvent, 
      _
    ] = null,
    div: stdLib.HTMLDivElement = null,
    height: scala.Int | scala.Double = null,
    icon: java.lang.String = null,
    mouseOutHandler: js.Function4[
      /* annotation */ Annotation, 
      /* point */ Point, 
      /* dygraph */ dygraphsLib.Dygraph, 
      /* event */ stdLib.MouseEvent, 
      _
    ] = null,
    mouseOverHandler: js.Function4[
      /* annotation */ Annotation, 
      /* point */ Point, 
      /* dygraph */ dygraphsLib.Dygraph, 
      /* event */ stdLib.MouseEvent, 
      _
    ] = null,
    shortText: java.lang.String = null,
    text: java.lang.String = null,
    tickHeight: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null,
    x: scala.Double | java.lang.String = null,
    xval: scala.Int | scala.Double = null
  ): Annotation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("series")(series)
    if (!js.isUndefined(attachAtBottom)) __obj.updateDynamic("attachAtBottom")(attachAtBottom)
    if (clickHandler != null) __obj.updateDynamic("clickHandler")(clickHandler)
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass)
    if (dblClickHandler != null) __obj.updateDynamic("dblClickHandler")(dblClickHandler)
    if (div != null) __obj.updateDynamic("div")(div)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (mouseOutHandler != null) __obj.updateDynamic("mouseOutHandler")(mouseOutHandler)
    if (mouseOverHandler != null) __obj.updateDynamic("mouseOverHandler")(mouseOverHandler)
    if (shortText != null) __obj.updateDynamic("shortText")(shortText)
    if (text != null) __obj.updateDynamic("text")(text)
    if (tickHeight != null) __obj.updateDynamic("tickHeight")(tickHeight.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (xval != null) __obj.updateDynamic("xval")(xval.asInstanceOf[js.Any])
    __obj.asInstanceOf[Annotation]
  }
}


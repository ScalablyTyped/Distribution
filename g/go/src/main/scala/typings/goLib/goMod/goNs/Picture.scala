package typings
package goLib.goMod.goNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
    * A Picture is a GraphObject that shows an image, video-frame, or Canvas element.
    * You can specify what to show by either setting the .source URL property
    * to a URL string or the .element property to an HTMLImageElement,
    * HTMLCanvasElement, or HTMLVideoElement.
    */
@js.native
trait Picture extends GraphObject {
  /**Gets or sets the Picture's HTML element, an Image or Video or Canvas element.*/
  var element: stdLib.HTMLElement = js.native
  /**Gets or sets how the Picture's image is stretched within its bounding box.*/
  var imageStretch: EnumValue = js.native
  /**Gets or sets the Picture's source URL, which can be any valid image (png, jpg, gif, etc) URL.*/
  var source: java.lang.String = js.native
  /**Gets or sets the rectangular area of the source image that this picture should display.*/
  var sourceRect: Rect = js.native
  /**Gets or sets the function to call if an image fails to load.*/
  def errorFunction(pic: Picture, e: stdLib.Event): scala.Unit = js.native
  /**Gets or sets a function that returns a value for image.crossOrigin, which is null by default.*/
  def sourceCrossOrigin(pic: Picture): java.lang.String = js.native
}


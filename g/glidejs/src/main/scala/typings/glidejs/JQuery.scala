package typings.glidejs

import typings.glidejs.JQueryGlide.IGlideOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  /**
    * Glide is responsive and touch-friendly jQuery slider.
    * Based on CSS3 transitions with fallback to older broswers.
    * It's simple, lightweight and fast. Designed to slide,
    * no less, no more.
    */
  def glide(): JQuery = js.native
  def glide(options: IGlideOptions): JQuery = js.native
}


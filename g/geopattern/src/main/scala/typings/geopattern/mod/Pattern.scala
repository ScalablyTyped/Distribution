package typings.geopattern.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pattern extends js.Object {
  /** Gets the pattern's background color as a hexadecimal string. */
  var color: String = js.native
  /** Gets the SVG as a Base64-encoded string. */
  def toBase64(): String = js.native
  /**
    * Gets the pattern as a data URI,
    * i.e. data:image/svg+xml;base64,PHN2ZyB...
    */
  def toDataUri(): String = js.native
  /**
    * Gets the pattern as a data URL suitable for use as a CSS
    * background-image, i.e. url("data:image/svg+xml;base64,PHN2ZyB...").
    */
  def toDataUrl(): String = js.native
  /** Gets the SVG string representing the pattern. */
  def toSvg(): String = js.native
}

object Pattern {
  @scala.inline
  def apply(
    color: String,
    toBase64: () => String,
    toDataUri: () => String,
    toDataUrl: () => String,
    toSvg: () => String
  ): Pattern = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], toBase64 = js.Any.fromFunction0(toBase64), toDataUri = js.Any.fromFunction0(toDataUri), toDataUrl = js.Any.fromFunction0(toDataUrl), toSvg = js.Any.fromFunction0(toSvg))
    __obj.asInstanceOf[Pattern]
  }
  @scala.inline
  implicit class PatternOps[Self <: Pattern] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setToBase64(value: () => String): Self = this.set("toBase64", js.Any.fromFunction0(value))
    @scala.inline
    def setToDataUri(value: () => String): Self = this.set("toDataUri", js.Any.fromFunction0(value))
    @scala.inline
    def setToDataUrl(value: () => String): Self = this.set("toDataUrl", js.Any.fromFunction0(value))
    @scala.inline
    def setToSvg(value: () => String): Self = this.set("toSvg", js.Any.fromFunction0(value))
  }
  
}


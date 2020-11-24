package typings.googleAppsScript.GoogleAppsScript.Charts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A builder used to create TextStyle objects. It allows configuration of the text's
  * properties such as name, color, and size.
  *
  * The following example shows how to create a text style using the builder. For a more complete
  * example, refer to the documentation for TextStyle.
  *
  *     // Creates a new text style that uses 26-point, blue, Ariel font.
  *     var textStyleBuilder = Charts.newTextStyle()
  *         .setColor('#0000FF').setFontName('Ariel').setFontSize(26);
  *     var style = textStyleBuilder.build();
  */
@js.native
trait TextStyleBuilder extends js.Object {
  
  def build(): TextStyle = js.native
  
  def setColor(cssValue: String): TextStyleBuilder = js.native
  
  def setFontName(fontName: String): TextStyleBuilder = js.native
  
  def setFontSize(fontSize: Double): TextStyleBuilder = js.native
}
object TextStyleBuilder {
  
  @scala.inline
  def apply(
    build: () => TextStyle,
    setColor: String => TextStyleBuilder,
    setFontName: String => TextStyleBuilder,
    setFontSize: Double => TextStyleBuilder
  ): TextStyleBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), setColor = js.Any.fromFunction1(setColor), setFontName = js.Any.fromFunction1(setFontName), setFontSize = js.Any.fromFunction1(setFontSize))
    __obj.asInstanceOf[TextStyleBuilder]
  }
  
  @scala.inline
  implicit class TextStyleBuilderOps[Self <: TextStyleBuilder] (val x: Self) extends AnyVal {
    
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
    def setBuild(value: () => TextStyle): Self = this.set("build", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetColor(value: String => TextStyleBuilder): Self = this.set("setColor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetFontName(value: String => TextStyleBuilder): Self = this.set("setFontName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetFontSize(value: Double => TextStyleBuilder): Self = this.set("setFontSize", js.Any.fromFunction1(value))
  }
}

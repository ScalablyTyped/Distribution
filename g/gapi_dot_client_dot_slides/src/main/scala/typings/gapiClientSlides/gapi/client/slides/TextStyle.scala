package typings.gapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextStyle extends js.Object {
  /**
    * The background color of the text. If set, the color is either opaque or
    * transparent, depending on if the `opaque_color` field in it is set.
    */
  var backgroundColor: js.UndefOr[OptionalColor] = js.native
  /**
    * The text's vertical offset from its normal position.
    *
    * Text with `SUPERSCRIPT` or `SUBSCRIPT` baseline offsets is automatically
    * rendered in a smaller font size, computed based on the `font_size` field.
    * The `font_size` itself is not affected by changes in this field.
    */
  var baselineOffset: js.UndefOr[String] = js.native
  /** Whether or not the text is rendered as bold. */
  var bold: js.UndefOr[Boolean] = js.native
  /**
    * The font family of the text.
    *
    * The font family can be any font from the Font menu in Slides or from
    * [Google Fonts] (https://fonts.google.com/). If the font name is
    * unrecognized, the text is rendered in `Arial`.
    *
    * Some fonts can affect the weight of the text. If an update request
    * specifies values for both `font_family` and `bold`, the explicitly-set
    * `bold` value is used.
    */
  var fontFamily: js.UndefOr[String] = js.native
  /**
    * The size of the text's font. When read, the `font_size` will specified in
    * points.
    */
  var fontSize: js.UndefOr[Dimension] = js.native
  /**
    * The color of the text itself. If set, the color is either opaque or
    * transparent, depending on if the `opaque_color` field in it is set.
    */
  var foregroundColor: js.UndefOr[OptionalColor] = js.native
  /** Whether or not the text is italicized. */
  var italic: js.UndefOr[Boolean] = js.native
  /**
    * The hyperlink destination of the text. If unset, there is no link. Links
    * are not inherited from parent text.
    *
    * Changing the link in an update request causes some other changes to the
    * text style of the range:
    *
    * &#42; When setting a link, the text foreground color will be set to
    * ThemeColorType.HYPERLINK and the text will
    * be underlined. If these fields are modified in the same
    * request, those values will be used instead of the link defaults.
    * &#42; Setting a link on a text range that overlaps with an existing link will
    * also update the existing link to point to the new URL.
    * &#42; Links are not settable on newline characters. As a result, setting a link
    * on a text range that crosses a paragraph boundary, such as `"ABC\n123"`,
    * will separate the newline character(s) into their own text runs. The
    * link will be applied separately to the runs before and after the newline.
    * &#42; Removing a link will update the text style of the range to match the
    * style of the preceding text (or the default text styles if the preceding
    * text is another link) unless different styles are being set in the same
    * request.
    */
  var link: js.UndefOr[Link] = js.native
  /** Whether or not the text is in small capital letters. */
  var smallCaps: js.UndefOr[Boolean] = js.native
  /** Whether or not the text is struck through. */
  var strikethrough: js.UndefOr[Boolean] = js.native
  /** Whether or not the text is underlined. */
  var underline: js.UndefOr[Boolean] = js.native
  /**
    * The font family and rendered weight of the text.
    *
    * This field is an extension of `font_family` meant to support explicit font
    * weights without breaking backwards compatibility. As such, when reading the
    * style of a range of text, the value of `weighted_font_family#font_family`
    * will always be equal to that of `font_family`. However, when writing, if
    * both fields are included in the field mask (either explicitly or through
    * the wildcard `"&#42;"`), their values are reconciled as follows:
    *
    * &#42; If `font_family` is set and `weighted_font_family` is not, the value of
    * `font_family` is applied with weight `400` ("normal").
    * &#42; If both fields are set, the value of `font_family` must match that of
    * `weighted_font_family#font_family`. If so, the font family and weight of
    * `weighted_font_family` is applied. Otherwise, a 400 bad request error is
    * returned.
    * &#42; If `weighted_font_family` is set and `font_family` is not, the font
    * family and weight of `weighted_font_family` is applied.
    * &#42; If neither field is set, the font family and weight of the text inherit
    * from the parent. Note that these properties cannot inherit separately
    * from each other.
    *
    * If an update request specifies values for both `weighted_font_family` and
    * `bold`, the `weighted_font_family` is applied first, then `bold`.
    *
    * If `weighted_font_family#weight` is not set, it defaults to `400`.
    *
    * If `weighted_font_family` is set, then `weighted_font_family#font_family`
    * must also be set with a non-empty value. Otherwise, a 400 bad request error
    * is returned.
    */
  var weightedFontFamily: js.UndefOr[WeightedFontFamily] = js.native
}

object TextStyle {
  @scala.inline
  def apply(): TextStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextStyle]
  }
  @scala.inline
  implicit class TextStyleOps[Self <: TextStyle] (val x: Self) extends AnyVal {
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
    def setBackgroundColor(value: OptionalColor): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setBaselineOffset(value: String): Self = this.set("baselineOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaselineOffset: Self = this.set("baselineOffset", js.undefined)
    @scala.inline
    def setBold(value: Boolean): Self = this.set("bold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBold: Self = this.set("bold", js.undefined)
    @scala.inline
    def setFontFamily(value: String): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontFamily: Self = this.set("fontFamily", js.undefined)
    @scala.inline
    def setFontSize(value: Dimension): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    @scala.inline
    def setForegroundColor(value: OptionalColor): Self = this.set("foregroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForegroundColor: Self = this.set("foregroundColor", js.undefined)
    @scala.inline
    def setItalic(value: Boolean): Self = this.set("italic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItalic: Self = this.set("italic", js.undefined)
    @scala.inline
    def setLink(value: Link): Self = this.set("link", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLink: Self = this.set("link", js.undefined)
    @scala.inline
    def setSmallCaps(value: Boolean): Self = this.set("smallCaps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSmallCaps: Self = this.set("smallCaps", js.undefined)
    @scala.inline
    def setStrikethrough(value: Boolean): Self = this.set("strikethrough", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrikethrough: Self = this.set("strikethrough", js.undefined)
    @scala.inline
    def setUnderline(value: Boolean): Self = this.set("underline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnderline: Self = this.set("underline", js.undefined)
    @scala.inline
    def setWeightedFontFamily(value: WeightedFontFamily): Self = this.set("weightedFontFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeightedFontFamily: Self = this.set("weightedFontFamily", js.undefined)
  }
  
}


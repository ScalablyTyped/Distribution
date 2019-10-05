package typings.gapiDotClientDotSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextStyle extends js.Object {
  /**
    * The background color of the text. If set, the color is either opaque or
    * transparent, depending on if the `opaque_color` field in it is set.
    */
  var backgroundColor: js.UndefOr[OptionalColor] = js.undefined
  /**
    * The text's vertical offset from its normal position.
    *
    * Text with `SUPERSCRIPT` or `SUBSCRIPT` baseline offsets is automatically
    * rendered in a smaller font size, computed based on the `font_size` field.
    * The `font_size` itself is not affected by changes in this field.
    */
  var baselineOffset: js.UndefOr[String] = js.undefined
  /** Whether or not the text is rendered as bold. */
  var bold: js.UndefOr[Boolean] = js.undefined
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
  var fontFamily: js.UndefOr[String] = js.undefined
  /**
    * The size of the text's font. When read, the `font_size` will specified in
    * points.
    */
  var fontSize: js.UndefOr[Dimension] = js.undefined
  /**
    * The color of the text itself. If set, the color is either opaque or
    * transparent, depending on if the `opaque_color` field in it is set.
    */
  var foregroundColor: js.UndefOr[OptionalColor] = js.undefined
  /** Whether or not the text is italicized. */
  var italic: js.UndefOr[Boolean] = js.undefined
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
  var link: js.UndefOr[Link] = js.undefined
  /** Whether or not the text is in small capital letters. */
  var smallCaps: js.UndefOr[Boolean] = js.undefined
  /** Whether or not the text is struck through. */
  var strikethrough: js.UndefOr[Boolean] = js.undefined
  /** Whether or not the text is underlined. */
  var underline: js.UndefOr[Boolean] = js.undefined
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
  var weightedFontFamily: js.UndefOr[WeightedFontFamily] = js.undefined
}

object TextStyle {
  @scala.inline
  def apply(
    backgroundColor: OptionalColor = null,
    baselineOffset: String = null,
    bold: js.UndefOr[Boolean] = js.undefined,
    fontFamily: String = null,
    fontSize: Dimension = null,
    foregroundColor: OptionalColor = null,
    italic: js.UndefOr[Boolean] = js.undefined,
    link: Link = null,
    smallCaps: js.UndefOr[Boolean] = js.undefined,
    strikethrough: js.UndefOr[Boolean] = js.undefined,
    underline: js.UndefOr[Boolean] = js.undefined,
    weightedFontFamily: WeightedFontFamily = null
  ): TextStyle = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (baselineOffset != null) __obj.updateDynamic("baselineOffset")(baselineOffset)
    if (!js.isUndefined(bold)) __obj.updateDynamic("bold")(bold)
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily)
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize)
    if (foregroundColor != null) __obj.updateDynamic("foregroundColor")(foregroundColor)
    if (!js.isUndefined(italic)) __obj.updateDynamic("italic")(italic)
    if (link != null) __obj.updateDynamic("link")(link)
    if (!js.isUndefined(smallCaps)) __obj.updateDynamic("smallCaps")(smallCaps)
    if (!js.isUndefined(strikethrough)) __obj.updateDynamic("strikethrough")(strikethrough)
    if (!js.isUndefined(underline)) __obj.updateDynamic("underline")(underline)
    if (weightedFontFamily != null) __obj.updateDynamic("weightedFontFamily")(weightedFontFamily)
    __obj.asInstanceOf[TextStyle]
  }
}


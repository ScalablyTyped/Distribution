package typings.emojiMart.dataMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Emoji extends js.Object {
  var a: js.UndefOr[String] = js.undefined
  var added_in: js.UndefOr[Double] = js.undefined
  var b: js.UndefOr[String] = js.undefined
  var c: js.UndefOr[String] = js.undefined
  var d: js.UndefOr[Boolean] = js.undefined
  var e: js.UndefOr[Boolean] = js.undefined
  var emoticons: js.UndefOr[js.Array[String]] = js.undefined
  var f: js.UndefOr[Boolean] = js.undefined
  var g: js.UndefOr[Boolean] = js.undefined
  var h: js.UndefOr[Boolean] = js.undefined
  var has_img_apple: js.UndefOr[Boolean] = js.undefined
  var has_img_emojione: js.UndefOr[Boolean] = js.undefined
  var has_img_facebook: js.UndefOr[Boolean] = js.undefined
  var has_img_google: js.UndefOr[Boolean] = js.undefined
  var has_img_messenger: js.UndefOr[Boolean] = js.undefined
  var has_img_twitter: js.UndefOr[Boolean] = js.undefined
  var i: js.UndefOr[Boolean] = js.undefined
  var j: js.UndefOr[js.Array[String]] = js.undefined
  var k: js.UndefOr[js.Array[Double]] = js.undefined
  var keywords: js.UndefOr[js.Array[String]] = js.undefined
  var l: js.UndefOr[js.Array[String]] = js.undefined
  var m: js.UndefOr[String] = js.undefined
  var n: js.UndefOr[js.Array[String]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var non_qualified: js.UndefOr[String] = js.undefined
  var o: js.UndefOr[Double] = js.undefined
  var obsoleted_by: js.UndefOr[String] = js.undefined
  var obsoletes: js.UndefOr[String] = js.undefined
  var sheet: js.UndefOr[js.Array[Double]] = js.undefined
  var sheet_x: js.UndefOr[Double] = js.undefined
  var sheet_y: js.UndefOr[Double] = js.undefined
  var short_names: js.UndefOr[js.Array[String]] = js.undefined
  var skin_variations: js.UndefOr[StringDictionary[SkinVariation]] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var unified: js.UndefOr[String] = js.undefined
}

object Emoji {
  @scala.inline
  def apply(
    a: String = null,
    added_in: Int | Double = null,
    b: String = null,
    c: String = null,
    d: js.UndefOr[Boolean] = js.undefined,
    e: js.UndefOr[Boolean] = js.undefined,
    emoticons: js.Array[String] = null,
    f: js.UndefOr[Boolean] = js.undefined,
    g: js.UndefOr[Boolean] = js.undefined,
    h: js.UndefOr[Boolean] = js.undefined,
    has_img_apple: js.UndefOr[Boolean] = js.undefined,
    has_img_emojione: js.UndefOr[Boolean] = js.undefined,
    has_img_facebook: js.UndefOr[Boolean] = js.undefined,
    has_img_google: js.UndefOr[Boolean] = js.undefined,
    has_img_messenger: js.UndefOr[Boolean] = js.undefined,
    has_img_twitter: js.UndefOr[Boolean] = js.undefined,
    i: js.UndefOr[Boolean] = js.undefined,
    j: js.Array[String] = null,
    k: js.Array[Double] = null,
    keywords: js.Array[String] = null,
    l: js.Array[String] = null,
    m: String = null,
    n: js.Array[String] = null,
    name: String = null,
    non_qualified: String = null,
    o: Int | Double = null,
    obsoleted_by: String = null,
    obsoletes: String = null,
    sheet: js.Array[Double] = null,
    sheet_x: Int | Double = null,
    sheet_y: Int | Double = null,
    short_names: js.Array[String] = null,
    skin_variations: StringDictionary[SkinVariation] = null,
    text: String = null,
    unified: String = null
  ): Emoji = {
    val __obj = js.Dynamic.literal()
    if (a != null) __obj.updateDynamic("a")(a.asInstanceOf[js.Any])
    if (added_in != null) __obj.updateDynamic("added_in")(added_in.asInstanceOf[js.Any])
    if (b != null) __obj.updateDynamic("b")(b.asInstanceOf[js.Any])
    if (c != null) __obj.updateDynamic("c")(c.asInstanceOf[js.Any])
    if (!js.isUndefined(d)) __obj.updateDynamic("d")(d.asInstanceOf[js.Any])
    if (!js.isUndefined(e)) __obj.updateDynamic("e")(e.asInstanceOf[js.Any])
    if (emoticons != null) __obj.updateDynamic("emoticons")(emoticons.asInstanceOf[js.Any])
    if (!js.isUndefined(f)) __obj.updateDynamic("f")(f.asInstanceOf[js.Any])
    if (!js.isUndefined(g)) __obj.updateDynamic("g")(g.asInstanceOf[js.Any])
    if (!js.isUndefined(h)) __obj.updateDynamic("h")(h.asInstanceOf[js.Any])
    if (!js.isUndefined(has_img_apple)) __obj.updateDynamic("has_img_apple")(has_img_apple.asInstanceOf[js.Any])
    if (!js.isUndefined(has_img_emojione)) __obj.updateDynamic("has_img_emojione")(has_img_emojione.asInstanceOf[js.Any])
    if (!js.isUndefined(has_img_facebook)) __obj.updateDynamic("has_img_facebook")(has_img_facebook.asInstanceOf[js.Any])
    if (!js.isUndefined(has_img_google)) __obj.updateDynamic("has_img_google")(has_img_google.asInstanceOf[js.Any])
    if (!js.isUndefined(has_img_messenger)) __obj.updateDynamic("has_img_messenger")(has_img_messenger.asInstanceOf[js.Any])
    if (!js.isUndefined(has_img_twitter)) __obj.updateDynamic("has_img_twitter")(has_img_twitter.asInstanceOf[js.Any])
    if (!js.isUndefined(i)) __obj.updateDynamic("i")(i.asInstanceOf[js.Any])
    if (j != null) __obj.updateDynamic("j")(j.asInstanceOf[js.Any])
    if (k != null) __obj.updateDynamic("k")(k.asInstanceOf[js.Any])
    if (keywords != null) __obj.updateDynamic("keywords")(keywords.asInstanceOf[js.Any])
    if (l != null) __obj.updateDynamic("l")(l.asInstanceOf[js.Any])
    if (m != null) __obj.updateDynamic("m")(m.asInstanceOf[js.Any])
    if (n != null) __obj.updateDynamic("n")(n.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (non_qualified != null) __obj.updateDynamic("non_qualified")(non_qualified.asInstanceOf[js.Any])
    if (o != null) __obj.updateDynamic("o")(o.asInstanceOf[js.Any])
    if (obsoleted_by != null) __obj.updateDynamic("obsoleted_by")(obsoleted_by.asInstanceOf[js.Any])
    if (obsoletes != null) __obj.updateDynamic("obsoletes")(obsoletes.asInstanceOf[js.Any])
    if (sheet != null) __obj.updateDynamic("sheet")(sheet.asInstanceOf[js.Any])
    if (sheet_x != null) __obj.updateDynamic("sheet_x")(sheet_x.asInstanceOf[js.Any])
    if (sheet_y != null) __obj.updateDynamic("sheet_y")(sheet_y.asInstanceOf[js.Any])
    if (short_names != null) __obj.updateDynamic("short_names")(short_names.asInstanceOf[js.Any])
    if (skin_variations != null) __obj.updateDynamic("skin_variations")(skin_variations.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (unified != null) __obj.updateDynamic("unified")(unified.asInstanceOf[js.Any])
    __obj.asInstanceOf[Emoji]
  }
}


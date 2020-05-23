package typings.fluentFfmpeg.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FfprobeStreamDisposition
  extends /* key */ StringDictionary[js.Any] {
  var attached_pic: js.UndefOr[Double] = js.undefined
  var clean_effects: js.UndefOr[Double] = js.undefined
  var comment: js.UndefOr[Double] = js.undefined
  var default: js.UndefOr[Double] = js.undefined
  var dub: js.UndefOr[Double] = js.undefined
  var forced: js.UndefOr[Double] = js.undefined
  var hearing_impaired: js.UndefOr[Double] = js.undefined
  var karaoke: js.UndefOr[Double] = js.undefined
  var lyrics: js.UndefOr[Double] = js.undefined
  var original: js.UndefOr[Double] = js.undefined
  var timed_thumbnails: js.UndefOr[Double] = js.undefined
  var visual_impaired: js.UndefOr[Double] = js.undefined
}

object FfprobeStreamDisposition {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    attached_pic: js.UndefOr[Double] = js.undefined,
    clean_effects: js.UndefOr[Double] = js.undefined,
    comment: js.UndefOr[Double] = js.undefined,
    default: js.UndefOr[Double] = js.undefined,
    dub: js.UndefOr[Double] = js.undefined,
    forced: js.UndefOr[Double] = js.undefined,
    hearing_impaired: js.UndefOr[Double] = js.undefined,
    karaoke: js.UndefOr[Double] = js.undefined,
    lyrics: js.UndefOr[Double] = js.undefined,
    original: js.UndefOr[Double] = js.undefined,
    timed_thumbnails: js.UndefOr[Double] = js.undefined,
    visual_impaired: js.UndefOr[Double] = js.undefined
  ): FfprobeStreamDisposition = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(attached_pic)) __obj.updateDynamic("attached_pic")(attached_pic.get.asInstanceOf[js.Any])
    if (!js.isUndefined(clean_effects)) __obj.updateDynamic("clean_effects")(clean_effects.get.asInstanceOf[js.Any])
    if (!js.isUndefined(comment)) __obj.updateDynamic("comment")(comment.get.asInstanceOf[js.Any])
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dub)) __obj.updateDynamic("dub")(dub.get.asInstanceOf[js.Any])
    if (!js.isUndefined(forced)) __obj.updateDynamic("forced")(forced.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hearing_impaired)) __obj.updateDynamic("hearing_impaired")(hearing_impaired.get.asInstanceOf[js.Any])
    if (!js.isUndefined(karaoke)) __obj.updateDynamic("karaoke")(karaoke.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lyrics)) __obj.updateDynamic("lyrics")(lyrics.get.asInstanceOf[js.Any])
    if (!js.isUndefined(original)) __obj.updateDynamic("original")(original.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timed_thumbnails)) __obj.updateDynamic("timed_thumbnails")(timed_thumbnails.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visual_impaired)) __obj.updateDynamic("visual_impaired")(visual_impaired.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FfprobeStreamDisposition]
  }
}


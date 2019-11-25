package typings.fluentDashFfmpeg.fluentDashFfmpegMod

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
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    attached_pic: Int | Double = null,
    clean_effects: Int | Double = null,
    comment: Int | Double = null,
    default: Int | Double = null,
    dub: Int | Double = null,
    forced: Int | Double = null,
    hearing_impaired: Int | Double = null,
    karaoke: Int | Double = null,
    lyrics: Int | Double = null,
    original: Int | Double = null,
    timed_thumbnails: Int | Double = null,
    visual_impaired: Int | Double = null
  ): FfprobeStreamDisposition = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (attached_pic != null) __obj.updateDynamic("attached_pic")(attached_pic.asInstanceOf[js.Any])
    if (clean_effects != null) __obj.updateDynamic("clean_effects")(clean_effects.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (dub != null) __obj.updateDynamic("dub")(dub.asInstanceOf[js.Any])
    if (forced != null) __obj.updateDynamic("forced")(forced.asInstanceOf[js.Any])
    if (hearing_impaired != null) __obj.updateDynamic("hearing_impaired")(hearing_impaired.asInstanceOf[js.Any])
    if (karaoke != null) __obj.updateDynamic("karaoke")(karaoke.asInstanceOf[js.Any])
    if (lyrics != null) __obj.updateDynamic("lyrics")(lyrics.asInstanceOf[js.Any])
    if (original != null) __obj.updateDynamic("original")(original.asInstanceOf[js.Any])
    if (timed_thumbnails != null) __obj.updateDynamic("timed_thumbnails")(timed_thumbnails.asInstanceOf[js.Any])
    if (visual_impaired != null) __obj.updateDynamic("visual_impaired")(visual_impaired.asInstanceOf[js.Any])
    __obj.asInstanceOf[FfprobeStreamDisposition]
  }
}


package typings.ffmpeg.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  IARL  :string,   IART  :string,   ICMS  :string,   ICMT  :string,   ICOP  :string,   ICRD  :string | std.Date,   ICRP  :string,   IDIM  :string,   IDPI  :string,   IENG  :string,   IGNR  :string,   IKEY  :string,   ILGT  :string,   ILNG  :string,   IMED  :string,   INAM  :string,   IPLT  :string,   IPRD  :string,   ISBJ  :string,   ISFT  :string,   ISHP  :string,   ISRC  :string,   ISRF  :string,   ITCH  :string}> */
trait AVIMetadata extends js.Object {
  var IARL: js.UndefOr[String] = js.undefined
  var IART: js.UndefOr[String] = js.undefined
  var ICMS: js.UndefOr[String] = js.undefined
  var ICMT: js.UndefOr[String] = js.undefined
  var ICOP: js.UndefOr[String] = js.undefined
  var ICRD: js.UndefOr[String | Date] = js.undefined
  var ICRP: js.UndefOr[String] = js.undefined
  var IDIM: js.UndefOr[String] = js.undefined
  var IDPI: js.UndefOr[String] = js.undefined
  var IENG: js.UndefOr[String] = js.undefined
  var IGNR: js.UndefOr[String] = js.undefined
  var IKEY: js.UndefOr[String] = js.undefined
  var ILGT: js.UndefOr[String] = js.undefined
  var ILNG: js.UndefOr[String] = js.undefined
  var IMED: js.UndefOr[String] = js.undefined
  var INAM: js.UndefOr[String] = js.undefined
  var IPLT: js.UndefOr[String] = js.undefined
  var IPRD: js.UndefOr[String] = js.undefined
  var ISBJ: js.UndefOr[String] = js.undefined
  var ISFT: js.UndefOr[String] = js.undefined
  var ISHP: js.UndefOr[String] = js.undefined
  var ISRC: js.UndefOr[String] = js.undefined
  var ISRF: js.UndefOr[String] = js.undefined
  var ITCH: js.UndefOr[String] = js.undefined
}

object AVIMetadata {
  @scala.inline
  def apply(
    IARL: String = null,
    IART: String = null,
    ICMS: String = null,
    ICMT: String = null,
    ICOP: String = null,
    ICRD: String | Date = null,
    ICRP: String = null,
    IDIM: String = null,
    IDPI: String = null,
    IENG: String = null,
    IGNR: String = null,
    IKEY: String = null,
    ILGT: String = null,
    ILNG: String = null,
    IMED: String = null,
    INAM: String = null,
    IPLT: String = null,
    IPRD: String = null,
    ISBJ: String = null,
    ISFT: String = null,
    ISHP: String = null,
    ISRC: String = null,
    ISRF: String = null,
    ITCH: String = null
  ): AVIMetadata = {
    val __obj = js.Dynamic.literal()
    if (IARL != null) __obj.updateDynamic("IARL")(IARL.asInstanceOf[js.Any])
    if (IART != null) __obj.updateDynamic("IART")(IART.asInstanceOf[js.Any])
    if (ICMS != null) __obj.updateDynamic("ICMS")(ICMS.asInstanceOf[js.Any])
    if (ICMT != null) __obj.updateDynamic("ICMT")(ICMT.asInstanceOf[js.Any])
    if (ICOP != null) __obj.updateDynamic("ICOP")(ICOP.asInstanceOf[js.Any])
    if (ICRD != null) __obj.updateDynamic("ICRD")(ICRD.asInstanceOf[js.Any])
    if (ICRP != null) __obj.updateDynamic("ICRP")(ICRP.asInstanceOf[js.Any])
    if (IDIM != null) __obj.updateDynamic("IDIM")(IDIM.asInstanceOf[js.Any])
    if (IDPI != null) __obj.updateDynamic("IDPI")(IDPI.asInstanceOf[js.Any])
    if (IENG != null) __obj.updateDynamic("IENG")(IENG.asInstanceOf[js.Any])
    if (IGNR != null) __obj.updateDynamic("IGNR")(IGNR.asInstanceOf[js.Any])
    if (IKEY != null) __obj.updateDynamic("IKEY")(IKEY.asInstanceOf[js.Any])
    if (ILGT != null) __obj.updateDynamic("ILGT")(ILGT.asInstanceOf[js.Any])
    if (ILNG != null) __obj.updateDynamic("ILNG")(ILNG.asInstanceOf[js.Any])
    if (IMED != null) __obj.updateDynamic("IMED")(IMED.asInstanceOf[js.Any])
    if (INAM != null) __obj.updateDynamic("INAM")(INAM.asInstanceOf[js.Any])
    if (IPLT != null) __obj.updateDynamic("IPLT")(IPLT.asInstanceOf[js.Any])
    if (IPRD != null) __obj.updateDynamic("IPRD")(IPRD.asInstanceOf[js.Any])
    if (ISBJ != null) __obj.updateDynamic("ISBJ")(ISBJ.asInstanceOf[js.Any])
    if (ISFT != null) __obj.updateDynamic("ISFT")(ISFT.asInstanceOf[js.Any])
    if (ISHP != null) __obj.updateDynamic("ISHP")(ISHP.asInstanceOf[js.Any])
    if (ISRC != null) __obj.updateDynamic("ISRC")(ISRC.asInstanceOf[js.Any])
    if (ISRF != null) __obj.updateDynamic("ISRF")(ISRF.asInstanceOf[js.Any])
    if (ITCH != null) __obj.updateDynamic("ITCH")(ITCH.asInstanceOf[js.Any])
    __obj.asInstanceOf[AVIMetadata]
  }
}


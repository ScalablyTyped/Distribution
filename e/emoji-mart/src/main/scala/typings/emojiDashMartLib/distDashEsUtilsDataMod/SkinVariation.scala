package typings
package emojiDashMartLib.distDashEsUtilsDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkinVariation extends js.Object {
  var added_in: java.lang.String
  var has_img_apple: scala.Boolean
  var has_img_emojione: scala.Boolean
  var has_img_facebook: scala.Boolean
  var has_img_google: scala.Boolean
  var has_img_messenger: scala.Boolean
  var has_img_twitter: scala.Boolean
  var image: java.lang.String
  var non_qualified: scala.Null | java.lang.String
  var obsoleted_by: js.UndefOr[java.lang.String] = js.undefined
  var obsoletes: js.UndefOr[java.lang.String] = js.undefined
  var sheet_x: scala.Double
  var sheet_y: scala.Double
  var unified: java.lang.String
}

object SkinVariation {
  @scala.inline
  def apply(
    added_in: java.lang.String,
    has_img_apple: scala.Boolean,
    has_img_emojione: scala.Boolean,
    has_img_facebook: scala.Boolean,
    has_img_google: scala.Boolean,
    has_img_messenger: scala.Boolean,
    has_img_twitter: scala.Boolean,
    image: java.lang.String,
    sheet_x: scala.Double,
    sheet_y: scala.Double,
    unified: java.lang.String,
    non_qualified: java.lang.String = null,
    obsoleted_by: java.lang.String = null,
    obsoletes: java.lang.String = null
  ): SkinVariation = {
    val __obj = js.Dynamic.literal(added_in = added_in, has_img_apple = has_img_apple, has_img_emojione = has_img_emojione, has_img_facebook = has_img_facebook, has_img_google = has_img_google, has_img_messenger = has_img_messenger, has_img_twitter = has_img_twitter, image = image, sheet_x = sheet_x, sheet_y = sheet_y, unified = unified)
    if (non_qualified != null) __obj.updateDynamic("non_qualified")(non_qualified)
    if (obsoleted_by != null) __obj.updateDynamic("obsoleted_by")(obsoleted_by)
    if (obsoletes != null) __obj.updateDynamic("obsoletes")(obsoletes)
    __obj.asInstanceOf[SkinVariation]
  }
}


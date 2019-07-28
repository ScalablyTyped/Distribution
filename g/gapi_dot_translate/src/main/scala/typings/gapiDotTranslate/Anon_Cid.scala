package typings.gapiDotTranslate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cid extends js.Object {
  /**
  			 * The customization id for translate
  			 */
  var cid: js.UndefOr[js.Array[String]] = js.undefined
  /**
  			 * Selector specifying which fields to include in a partial response.
  			 */
  var fields: js.UndefOr[String] = js.undefined
  /**
  			 * This optional parameter allows you to indicate that the text to be translated is either plain-text or HTML. A value of html indicates HTML and a value of text indicates plain-text
  			 */
  var format: js.UndefOr[String] = js.undefined
  /**
  			 * If prettyprint=true, the results returned by the server will be human readable (pretty printed).
  			 */
  var prettyprint: js.UndefOr[String] = js.undefined
  /**
  			 *  The text to translate
  			 */
  var q: js.Array[String]
  /**
  			 * The source language of the text
  			 */
  var source: js.UndefOr[String] = js.undefined
  /**
  			 * The target language into which the text should be translated
  			 */
  var target: String
}

object Anon_Cid {
  @scala.inline
  def apply(
    q: js.Array[String],
    target: String,
    cid: js.Array[String] = null,
    fields: String = null,
    format: String = null,
    prettyprint: String = null,
    source: String = null
  ): Anon_Cid = {
    val __obj = js.Dynamic.literal(q = q, target = target)
    if (cid != null) __obj.updateDynamic("cid")(cid)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (format != null) __obj.updateDynamic("format")(format)
    if (prettyprint != null) __obj.updateDynamic("prettyprint")(prettyprint)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[Anon_Cid]
  }
}


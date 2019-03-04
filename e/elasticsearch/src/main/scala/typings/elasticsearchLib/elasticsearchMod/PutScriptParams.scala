package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutScriptParams extends GenericParams {
  var id: java.lang.String
  var lang: java.lang.String
}

object PutScriptParams {
  @scala.inline
  def apply(
    body: js.Any,
    id: java.lang.String,
    lang: java.lang.String,
    filterPath: java.lang.String | js.Array[java.lang.String] = null,
    ignore: scala.Double | js.Array[scala.Double] = null,
    maxRetries: scala.Int | scala.Double = null,
    method: java.lang.String = null,
    requestTimeout: scala.Int | scala.Double = null
  ): PutScriptParams = {
    val __obj = js.Dynamic.literal(body = body, id = id, lang = lang)
    if (filterPath != null) __obj.updateDynamic("filterPath")(filterPath.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (requestTimeout != null) __obj.updateDynamic("requestTimeout")(requestTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutScriptParams]
  }
}


package typings
package gapiDotPagespeedonlineLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Fields extends js.Object {
  /**
    * Selector specifying which fields to include in a partial response.
    */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The locale that results should be generated in.
    */
  var locale: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The PageSpeed rules to run. Can be specified multiple times
    */
  var rule: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Indicates if binary data containing a screenshot should be included
    */
  var screenshot: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The strategy to use when analyzing the page. Valid values are desktop and mobile.
    */
  var stategy: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The URL of the page for which the PageSpeed Insights API should generate results.
    */
  var url: java.lang.String
}


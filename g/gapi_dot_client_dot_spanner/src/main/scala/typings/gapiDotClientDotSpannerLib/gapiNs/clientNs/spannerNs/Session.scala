package typings
package gapiDotClientDotSpannerLib.gapiNs.clientNs.spannerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Session extends js.Object {
  /**
    * Output only. The approximate timestamp when the session is last used. It is
    * typically earlier than the actual last use time.
    */
  var approximateLastUseTime: js.UndefOr[java.lang.String] = js.undefined
  /** Output only. The timestamp when the session is created. */
  var createTime: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The labels for the session.
    *
    * &#42; Label keys must be between 1 and 63 characters long and must conform to
    * the following regular expression: `[a-z]([-a-z0-9]&#42;[a-z0-9])?`.
    * &#42; Label values must be between 0 and 63 characters long and must conform
    * to the regular expression `([a-z]([-a-z0-9]&#42;[a-z0-9])?)?`.
    * &#42; No more than 20 labels can be associated with a given session.
    */
  var labels: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
  /** The name of the session. */
  var name: js.UndefOr[java.lang.String] = js.undefined
}


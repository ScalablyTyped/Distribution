package typings.elasticElasticsearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DEFAULT extends js.Object {
  var DEFAULT: String
  var SNIFF_INTERVAL: String
  var SNIFF_ON_CONNECTION_FAULT: String
  var SNIFF_ON_START: String
}

object DEFAULT {
  @scala.inline
  def apply(DEFAULT: String, SNIFF_INTERVAL: String, SNIFF_ON_CONNECTION_FAULT: String, SNIFF_ON_START: String): DEFAULT = {
    val __obj = js.Dynamic.literal(DEFAULT = DEFAULT.asInstanceOf[js.Any], SNIFF_INTERVAL = SNIFF_INTERVAL.asInstanceOf[js.Any], SNIFF_ON_CONNECTION_FAULT = SNIFF_ON_CONNECTION_FAULT.asInstanceOf[js.Any], SNIFF_ON_START = SNIFF_ON_START.asInstanceOf[js.Any])
    __obj.asInstanceOf[DEFAULT]
  }
}


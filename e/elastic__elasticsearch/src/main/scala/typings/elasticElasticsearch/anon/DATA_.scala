package typings.elasticElasticsearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DATA_ extends js.Object {
  var DATA: String
  var INGEST: String
  var MASTER: String
  var ML: String
}

object DATA_ {
  @scala.inline
  def apply(DATA: String, INGEST: String, MASTER: String, ML: String): DATA_ = {
    val __obj = js.Dynamic.literal(DATA = DATA.asInstanceOf[js.Any], INGEST = INGEST.asInstanceOf[js.Any], MASTER = MASTER.asInstanceOf[js.Any], ML = ML.asInstanceOf[js.Any])
    __obj.asInstanceOf[DATA_]
  }
}


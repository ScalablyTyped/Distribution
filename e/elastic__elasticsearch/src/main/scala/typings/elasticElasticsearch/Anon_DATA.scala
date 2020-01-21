package typings.elasticElasticsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DATA extends js.Object {
  var DATA: String
  var INGEST: String
  var MASTER: String
  var ML: String
}

object Anon_DATA {
  @scala.inline
  def apply(DATA: String, INGEST: String, MASTER: String, ML: String): Anon_DATA = {
    val __obj = js.Dynamic.literal(DATA = DATA.asInstanceOf[js.Any], INGEST = INGEST.asInstanceOf[js.Any], MASTER = MASTER.asInstanceOf[js.Any], ML = ML.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DATA]
  }
}


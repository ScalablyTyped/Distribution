package typings.atElasticElasticsearch

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

trait Anon_Data extends js.Object {
  var data: Boolean
  var ingest: Boolean
  var master: Boolean
  var ml: Boolean
}

object Anon_Data {
  @scala.inline
  def apply(data: Boolean, ingest: Boolean, master: Boolean, ml: Boolean): Anon_Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], ingest = ingest.asInstanceOf[js.Any], master = master.asInstanceOf[js.Any], ml = ml.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Data]
  }
}


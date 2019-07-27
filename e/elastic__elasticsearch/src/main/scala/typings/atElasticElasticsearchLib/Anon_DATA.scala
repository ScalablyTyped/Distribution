package typings
package atElasticElasticsearchLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DATA extends js.Object {
  var DATA: java.lang.String
  var INGEST: java.lang.String
  var MASTER: java.lang.String
  var ML: java.lang.String
}

trait Anon_Data extends js.Object {
  var data: scala.Boolean
  var ingest: scala.Boolean
  var master: scala.Boolean
  var ml: scala.Boolean
}

object Anon_DATA {
  @scala.inline
  def apply(DATA: java.lang.String, INGEST: java.lang.String, MASTER: java.lang.String, ML: java.lang.String): Anon_DATA = {
    val __obj = js.Dynamic.literal(DATA = DATA, INGEST = INGEST, MASTER = MASTER, ML = ML)
  
    __obj.asInstanceOf[Anon_DATA]
  }
}

object Anon_Data {
  @scala.inline
  def apply(data: scala.Boolean, ingest: scala.Boolean, master: scala.Boolean, ml: scala.Boolean): Anon_Data = {
    val __obj = js.Dynamic.literal(data = data, ingest = ingest, master = master, ml = ml)
  
    __obj.asInstanceOf[Anon_Data]
  }
}


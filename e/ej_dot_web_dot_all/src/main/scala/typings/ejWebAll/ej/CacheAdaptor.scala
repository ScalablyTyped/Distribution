package typings.ejWebAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheAdaptor extends UrlAdaptor {
  def generateKey(url: String, query: Query): String = js.native
  def init(adaptor: js.Any, timeStamp: Double, pageSize: Double): Unit = js.native
}


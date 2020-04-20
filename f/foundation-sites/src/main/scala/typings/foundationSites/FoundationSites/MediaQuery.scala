package typings.foundationSites.FoundationSites

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaQuery extends js.Object {
  var current: String
  var queries: js.Array[String]
  def atLeast(size: String): Boolean
  def get(size: String): String
}

object MediaQuery {
  @scala.inline
  def apply(atLeast: String => Boolean, current: String, get: String => String, queries: js.Array[String]): MediaQuery = {
    val __obj = js.Dynamic.literal(atLeast = js.Any.fromFunction1(atLeast), current = current.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), queries = queries.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaQuery]
  }
}


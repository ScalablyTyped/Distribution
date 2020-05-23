package typings.featherRouteMatcher.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Match[T] extends js.Object {
  var page: T
  var params: StringDictionary[String] | Null
  var url: String
}

object Match {
  @scala.inline
  def apply[T](page: T, url: String, params: StringDictionary[String] = null): Match[T] = {
    val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[Match[T]]
  }
}


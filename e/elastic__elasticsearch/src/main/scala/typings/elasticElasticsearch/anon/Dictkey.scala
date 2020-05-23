package typings.elasticElasticsearch.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dictkey
  extends /* key */ StringDictionary[js.Any] {
  var _index: String
}

object Dictkey {
  @scala.inline
  def apply(_index: String, StringDictionary: /* name */ StringDictionary[js.Any] = null): Dictkey = {
    val __obj = js.Dynamic.literal(_index = _index.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Dictkey]
  }
}


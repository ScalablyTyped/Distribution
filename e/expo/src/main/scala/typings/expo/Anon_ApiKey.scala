package typings.expo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ApiKey extends js.Object {
  var apiKey: String
  var buildSecret: String
}

object Anon_ApiKey {
  @scala.inline
  def apply(apiKey: String, buildSecret: String): Anon_ApiKey = {
    val __obj = js.Dynamic.literal(apiKey = apiKey, buildSecret = buildSecret)
  
    __obj.asInstanceOf[Anon_ApiKey]
  }
}


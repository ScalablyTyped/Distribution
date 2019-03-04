package typings
package expoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ApiKey extends js.Object {
  var apiKey: java.lang.String
  var buildSecret: java.lang.String
}

object Anon_ApiKey {
  @scala.inline
  def apply(apiKey: java.lang.String, buildSecret: java.lang.String): Anon_ApiKey = {
    val __obj = js.Dynamic.literal(apiKey = apiKey, buildSecret = buildSecret)
  
    __obj.asInstanceOf[Anon_ApiKey]
  }
}


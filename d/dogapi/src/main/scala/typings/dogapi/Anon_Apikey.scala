package typings.dogapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Apikey extends js.Object {
  var api_key: String
  var app_key: String
}

object Anon_Apikey {
  @scala.inline
  def apply(api_key: String, app_key: String): Anon_Apikey = {
    val __obj = js.Dynamic.literal(api_key = api_key, app_key = app_key)
  
    __obj.asInstanceOf[Anon_Apikey]
  }
}


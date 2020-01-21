package typings.elasticApmNode.mod.AwsLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientContextEnv extends js.Object {
  var locale: String
  var make: String
  var model: String
  var platform: String
  var platformVersion: String
}

object ClientContextEnv {
  @scala.inline
  def apply(locale: String, make: String, model: String, platform: String, platformVersion: String): ClientContextEnv = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], make = make.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], platformVersion = platformVersion.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ClientContextEnv]
  }
}


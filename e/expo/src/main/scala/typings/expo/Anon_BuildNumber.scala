package typings.expo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BuildNumber extends js.Object {
  var buildNumber: String
  var model: String
  var platform: String
  var userInterfaceIdiom: String
}

object Anon_BuildNumber {
  @scala.inline
  def apply(buildNumber: String, model: String, platform: String, userInterfaceIdiom: String): Anon_BuildNumber = {
    val __obj = js.Dynamic.literal(buildNumber = buildNumber, model = model, platform = platform, userInterfaceIdiom = userInterfaceIdiom)
  
    __obj.asInstanceOf[Anon_BuildNumber]
  }
}


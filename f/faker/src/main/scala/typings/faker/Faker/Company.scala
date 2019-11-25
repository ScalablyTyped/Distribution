package typings.faker.Faker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Company extends js.Object {
  var bs: String
  var catchPhrase: String
  var name: String
}

object Company {
  @scala.inline
  def apply(bs: String, catchPhrase: String, name: String): Company = {
    val __obj = js.Dynamic.literal(bs = bs.asInstanceOf[js.Any], catchPhrase = catchPhrase.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Company]
  }
}


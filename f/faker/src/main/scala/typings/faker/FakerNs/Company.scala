package typings.faker.FakerNs

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
    val __obj = js.Dynamic.literal(bs = bs, catchPhrase = catchPhrase, name = name)
  
    __obj.asInstanceOf[Company]
  }
}


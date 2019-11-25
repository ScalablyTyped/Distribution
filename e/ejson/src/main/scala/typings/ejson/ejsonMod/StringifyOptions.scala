package typings.ejson.ejsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringifyOptions extends js.Object {
  var canonical: Boolean
  var indent: Boolean | Double | String
}

object StringifyOptions {
  @scala.inline
  def apply(canonical: Boolean, indent: Boolean | Double | String): StringifyOptions = {
    val __obj = js.Dynamic.literal(canonical = canonical.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StringifyOptions]
  }
}


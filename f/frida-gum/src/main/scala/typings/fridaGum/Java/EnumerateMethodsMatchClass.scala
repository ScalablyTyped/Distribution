package typings.fridaGum.Java

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Class matching query which has one or more matching methods.
  */
trait EnumerateMethodsMatchClass extends js.Object {
  /**
    * One or more matching method names, each followed by signature when
    * the `s` modifier is used.
    */
  var methods: Array[String]
  /**
    * Class name that matched the given query.
    */
  var name: String
}

object EnumerateMethodsMatchClass {
  @scala.inline
  def apply(methods: Array[String], name: String): EnumerateMethodsMatchClass = {
    val __obj = js.Dynamic.literal(methods = methods.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumerateMethodsMatchClass]
  }
}


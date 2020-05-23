package typings.foundation.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Namespace extends js.Object {
  var namespace: String
}

object Namespace {
  @scala.inline
  def apply(namespace: String): Namespace = {
    val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[Namespace]
  }
}


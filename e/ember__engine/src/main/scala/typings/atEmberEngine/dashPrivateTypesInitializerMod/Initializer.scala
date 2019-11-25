package typings.atEmberEngine.dashPrivateTypesInitializerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Initializer[T] extends js.Object {
  var after: js.UndefOr[js.Array[String]] = js.undefined
  var before: js.UndefOr[js.Array[String]] = js.undefined
  var name: String
  def initialize(application: T): Unit
}

object Initializer {
  @scala.inline
  def apply[T](
    initialize: T => Unit,
    name: String,
    after: js.Array[String] = null,
    before: js.Array[String] = null
  ): Initializer[T] = {
    val __obj = js.Dynamic.literal(initialize = js.Any.fromFunction1(initialize), name = name.asInstanceOf[js.Any])
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    __obj.asInstanceOf[Initializer[T]]
  }
}


package typings.expressDashMongoDashSanitize.expressDashMongoDashSanitizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MongoSanitizeOptions extends js.Object {
  var replaceWith: js.Any
}

object MongoSanitizeOptions {
  @scala.inline
  def apply(replaceWith: js.Any): MongoSanitizeOptions = {
    val __obj = js.Dynamic.literal(replaceWith = replaceWith)
  
    __obj.asInstanceOf[MongoSanitizeOptions]
  }
}


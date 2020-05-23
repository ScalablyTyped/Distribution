package typings.eggView.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cache extends js.Object {
  var cache: Boolean
  var defaultExtension: String
  var defaultViewEngine: String
  var mapping: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PlainObject<string> */ js.Any
  var root: String
}

object Cache {
  @scala.inline
  def apply(
    cache: Boolean,
    defaultExtension: String,
    defaultViewEngine: String,
    mapping: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PlainObject<string> */ js.Any,
    root: String
  ): Cache = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], defaultExtension = defaultExtension.asInstanceOf[js.Any], defaultViewEngine = defaultViewEngine.asInstanceOf[js.Any], mapping = mapping.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cache]
  }
}


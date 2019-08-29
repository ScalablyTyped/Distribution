package typings.downshift.downshiftMod

import typings.std.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Environment extends js.Object {
  var addEventListener: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof window.addEventListener */ js.Any
  var document: Document
  var removeEventListener: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof window.removeEventListener */ js.Any
}

object Environment {
  @scala.inline
  def apply(
    addEventListener: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof window.addEventListener */ js.Any,
    document: Document,
    removeEventListener: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof window.removeEventListener */ js.Any
  ): Environment = {
    val __obj = js.Dynamic.literal(addEventListener = addEventListener, document = document, removeEventListener = removeEventListener)
  
    __obj.asInstanceOf[Environment]
  }
}


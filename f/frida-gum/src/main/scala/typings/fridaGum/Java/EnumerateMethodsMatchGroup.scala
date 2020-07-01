package typings.fridaGum.Java

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Matching methods grouped by class loader.
  */
trait EnumerateMethodsMatchGroup extends js.Object {
  /**
    * One or more matching classes that have one or more methods matching
    * the given query.
    */
  var classes: Array[EnumerateMethodsMatchClass]
  /**
    * Class loader, or `null` for the bootstrap class loader.
    *
    * Typically passed to `ClassFactory.get()` to interact with classes of
    * interest.
    */
  var loader: typings.fridaGum.anon.Wrapper | Null
}

object EnumerateMethodsMatchGroup {
  @scala.inline
  def apply(classes: Array[EnumerateMethodsMatchClass], loader: typings.fridaGum.anon.Wrapper = null): EnumerateMethodsMatchGroup = {
    val __obj = js.Dynamic.literal(classes = classes.asInstanceOf[js.Any], loader = loader.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumerateMethodsMatchGroup]
  }
}


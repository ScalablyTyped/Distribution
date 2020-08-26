package typings.fridaGum.Java

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Matching methods grouped by class loader.
  */
@js.native
trait EnumerateMethodsMatchGroup extends js.Object {
  /**
    * One or more matching classes that have one or more methods matching
    * the given query.
    */
  var classes: Array[EnumerateMethodsMatchClass] = js.native
  /**
    * Class loader, or `null` for the bootstrap class loader.
    *
    * Typically passed to `ClassFactory.get()` to interact with classes of
    * interest.
    */
  var loader: typings.fridaGum.anon.Wrapper | Null = js.native
}

object EnumerateMethodsMatchGroup {
  @scala.inline
  def apply(classes: Array[EnumerateMethodsMatchClass]): EnumerateMethodsMatchGroup = {
    val __obj = js.Dynamic.literal(classes = classes.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumerateMethodsMatchGroup]
  }
  @scala.inline
  implicit class EnumerateMethodsMatchGroupOps[Self <: EnumerateMethodsMatchGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClasses(value: Array[EnumerateMethodsMatchClass]): Self = this.set("classes", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoader(value: typings.fridaGum.anon.Wrapper): Self = this.set("loader", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoaderNull: Self = this.set("loader", null)
  }
  
}


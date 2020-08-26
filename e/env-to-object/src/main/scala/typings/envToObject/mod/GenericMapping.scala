package typings.envToObject.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenericMapping
  extends /* opt */ StringDictionary[js.Any]
     with Mapping {
  var keypath: String = js.native
  var `type`: js.UndefOr[String] = js.native
}

object GenericMapping {
  @scala.inline
  def apply(keypath: String): GenericMapping = {
    val __obj = js.Dynamic.literal(keypath = keypath.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenericMapping]
  }
  @scala.inline
  implicit class GenericMappingOps[Self <: GenericMapping] (val x: Self) extends AnyVal {
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
    def setKeypath(value: String): Self = this.set("keypath", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}


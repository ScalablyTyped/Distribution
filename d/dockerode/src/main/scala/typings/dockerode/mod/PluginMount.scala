package typings.dockerode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginMount extends js.Object {
  var Description: String = js.native
  var Destination: String = js.native
  var Name: String = js.native
  var Options: js.Array[String] = js.native
  var Settable: js.Array[String] = js.native
  var Source: String = js.native
  var Type: String = js.native
}

object PluginMount {
  @scala.inline
  def apply(
    Description: String,
    Destination: String,
    Name: String,
    Options: js.Array[String],
    Settable: js.Array[String],
    Source: String,
    Type: String
  ): PluginMount = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], Destination = Destination.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Options = Options.asInstanceOf[js.Any], Settable = Settable.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginMount]
  }
  @scala.inline
  implicit class PluginMountOps[Self <: PluginMount] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def setDestination(value: String): Self = this.set("Destination", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptionsVarargs(value: String*): Self = this.set("Options", js.Array(value :_*))
    @scala.inline
    def setOptions(value: js.Array[String]): Self = this.set("Options", value.asInstanceOf[js.Any])
    @scala.inline
    def setSettableVarargs(value: String*): Self = this.set("Settable", js.Array(value :_*))
    @scala.inline
    def setSettable(value: js.Array[String]): Self = this.set("Settable", value.asInstanceOf[js.Any])
    @scala.inline
    def setSource(value: String): Self = this.set("Source", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("Type", value.asInstanceOf[js.Any])
  }
  
}


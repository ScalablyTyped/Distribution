package typings.dockerode.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DriverConfig extends js.Object {
  var DriverConfig: Name = js.native
  var Labels: StringDictionary[String] = js.native
  var NoCopy: Boolean = js.native
}

object DriverConfig {
  @scala.inline
  def apply(DriverConfig: Name, Labels: StringDictionary[String], NoCopy: Boolean): DriverConfig = {
    val __obj = js.Dynamic.literal(DriverConfig = DriverConfig.asInstanceOf[js.Any], Labels = Labels.asInstanceOf[js.Any], NoCopy = NoCopy.asInstanceOf[js.Any])
    __obj.asInstanceOf[DriverConfig]
  }
  @scala.inline
  implicit class DriverConfigOps[Self <: DriverConfig] (val x: Self) extends AnyVal {
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
    def setDriverConfig(value: Name): Self = this.set("DriverConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = this.set("Labels", value.asInstanceOf[js.Any])
    @scala.inline
    def setNoCopy(value: Boolean): Self = this.set("NoCopy", value.asInstanceOf[js.Any])
  }
  
}


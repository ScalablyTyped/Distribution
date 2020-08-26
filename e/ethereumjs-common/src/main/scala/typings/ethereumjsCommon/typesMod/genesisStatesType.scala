package typings.ethereumjsCommon.typesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait genesisStatesType
  extends /* key */ StringDictionary[js.Object] {
  var names: StringDictionary[String] = js.native
}

object genesisStatesType {
  @scala.inline
  def apply(names: StringDictionary[String]): genesisStatesType = {
    val __obj = js.Dynamic.literal(names = names.asInstanceOf[js.Any])
    __obj.asInstanceOf[genesisStatesType]
  }
  @scala.inline
  implicit class genesisStatesTypeOps[Self <: genesisStatesType] (val x: Self) extends AnyVal {
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
    def setNames(value: StringDictionary[String]): Self = this.set("names", value.asInstanceOf[js.Any])
  }
  
}


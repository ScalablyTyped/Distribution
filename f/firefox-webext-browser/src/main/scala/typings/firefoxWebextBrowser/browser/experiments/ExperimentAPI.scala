package typings.firefoxWebextBrowser.browser.experiments

import typings.firefoxWebextBrowser.anon.Events
import typings.firefoxWebextBrowser.anon.Paths
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* experiments types */
@js.native
trait ExperimentAPI extends js.Object {
  var child: js.UndefOr[Paths] = js.native
  var parent: js.UndefOr[Events] = js.native
  var schema: ExperimentURL = js.native
}

object ExperimentAPI {
  @scala.inline
  def apply(schema: ExperimentURL): ExperimentAPI = {
    val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExperimentAPI]
  }
  @scala.inline
  implicit class ExperimentAPIOps[Self <: ExperimentAPI] (val x: Self) extends AnyVal {
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
    def setSchema(value: ExperimentURL): Self = this.set("schema", value.asInstanceOf[js.Any])
    @scala.inline
    def setChild(value: Paths): Self = this.set("child", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChild: Self = this.set("child", js.undefined)
    @scala.inline
    def setParent(value: Events): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
  }
  
}


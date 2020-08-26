package typings.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageElement extends js.Object {
  var description: js.UndefOr[String] = js.native
  var elementGroup: js.UndefOr[Group] = js.native
  var image: js.UndefOr[Image] = js.native
  var line: js.UndefOr[Line] = js.native
  var objectId: js.UndefOr[String] = js.native
  var shape: js.UndefOr[Shape] = js.native
  var sheetsChart: js.UndefOr[SheetsChart] = js.native
  var size: js.UndefOr[Size] = js.native
  var table: js.UndefOr[Table] = js.native
  var title: js.UndefOr[String] = js.native
  var transform: js.UndefOr[AffineTransform] = js.native
  var video: js.UndefOr[Video] = js.native
  var wordArt: js.UndefOr[WordArt] = js.native
}

object PageElement {
  @scala.inline
  def apply(): PageElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageElement]
  }
  @scala.inline
  implicit class PageElementOps[Self <: PageElement] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setElementGroup(value: Group): Self = this.set("elementGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElementGroup: Self = this.set("elementGroup", js.undefined)
    @scala.inline
    def setImage(value: Image): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    @scala.inline
    def setLine(value: Line): Self = this.set("line", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLine: Self = this.set("line", js.undefined)
    @scala.inline
    def setObjectId(value: String): Self = this.set("objectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectId: Self = this.set("objectId", js.undefined)
    @scala.inline
    def setShape(value: Shape): Self = this.set("shape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShape: Self = this.set("shape", js.undefined)
    @scala.inline
    def setSheetsChart(value: SheetsChart): Self = this.set("sheetsChart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSheetsChart: Self = this.set("sheetsChart", js.undefined)
    @scala.inline
    def setSize(value: Size): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setTable(value: Table): Self = this.set("table", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTable: Self = this.set("table", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTransform(value: AffineTransform): Self = this.set("transform", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
    @scala.inline
    def setVideo(value: Video): Self = this.set("video", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideo: Self = this.set("video", js.undefined)
    @scala.inline
    def setWordArt(value: WordArt): Self = this.set("wordArt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWordArt: Self = this.set("wordArt", js.undefined)
  }
  
}


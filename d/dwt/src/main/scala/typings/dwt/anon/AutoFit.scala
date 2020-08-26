package typings.dwt.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoFit extends js.Object {
  // autoFit button
  var autoFit: js.UndefOr[IconClass] = js.native
  // readDirection change button (vertical ,horizontal)
  var blank1: js.UndefOr[Location] = js.native
  // crop button
  var crop: js.UndefOr[OnButtonClick] = js.native
  var currentTab: js.UndefOr[Location] = js.native
  // firstPage button
  var firstPage: js.UndefOr[IconClass] = js.native
  // fitHeight button
  var fitHeight: js.UndefOr[IconClass] = js.native
  // fitWidth button
  var fitWidth: js.UndefOr[IconClass] = js.native
  // flip button
  var flip: js.UndefOr[IconClass] = js.native
  // fullScreenToWebPage button
  var fullPage: js.UndefOr[IconClass] = js.native
  // fullScreenToDevice
  var fullScreen: js.UndefOr[IconClass] = js.native
  // lastPage button
  var lastPage: js.UndefOr[OnButtonClick] = js.native
  // loadImage button
  var loadImage: js.UndefOr[IconClass] = js.native
  // mirror button
  var mirror: js.UndefOr[IconClass] = js.native
  // nextPage button
  var nextPage: js.UndefOr[IconClass] = js.native
  // pagination show
  var pagination: js.UndefOr[LocationVisibility] = js.native
  // panelChange button (thumbnail, dir tree, tags)
  var panelChange: js.UndefOr[IconClass] = js.native
  // previousPage button
  var previousPage: js.UndefOr[IconClass] = js.native
  // print button
  var print: js.UndefOr[IconClass] = js.native
  // readDirection change button (vertical ,horizontal)
  var readDirection: js.UndefOr[IconClass] = js.native
  // redo button
  var redo: js.UndefOr[IconClassLocation] = js.native
  // remove button
  var remove: js.UndefOr[IconClass] = js.native
  // reset button
  var reset: js.UndefOr[SequenceVisibility] = js.native
  // rotate button
  var rotate: js.UndefOr[IconClass] = js.native
  // rotateAll button
  var rotateAll: js.UndefOr[IconClass] = js.native
  // save button
  var save: js.UndefOr[IconClass] = js.native
  // undo button
  var undo: js.UndefOr[Visibility] = js.native
  // wipe button
  var wipe: js.UndefOr[Sequence] = js.native
  // magnifyCanvas button
  var zoomIn: js.UndefOr[LocationOnButtonClick] = js.native
  // shrinkCanvas button
  var zoomOut: js.UndefOr[OnButtonClickSequence] = js.native
}

object AutoFit {
  @scala.inline
  def apply(): AutoFit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoFit]
  }
  @scala.inline
  implicit class AutoFitOps[Self <: AutoFit] (val x: Self) extends AnyVal {
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
    def setAutoFit(value: IconClass): Self = this.set("autoFit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoFit: Self = this.set("autoFit", js.undefined)
    @scala.inline
    def setBlank1(value: Location): Self = this.set("blank1", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlank1: Self = this.set("blank1", js.undefined)
    @scala.inline
    def setCrop(value: OnButtonClick): Self = this.set("crop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrop: Self = this.set("crop", js.undefined)
    @scala.inline
    def setCurrentTab(value: Location): Self = this.set("currentTab", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentTab: Self = this.set("currentTab", js.undefined)
    @scala.inline
    def setFirstPage(value: IconClass): Self = this.set("firstPage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstPage: Self = this.set("firstPage", js.undefined)
    @scala.inline
    def setFitHeight(value: IconClass): Self = this.set("fitHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFitHeight: Self = this.set("fitHeight", js.undefined)
    @scala.inline
    def setFitWidth(value: IconClass): Self = this.set("fitWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFitWidth: Self = this.set("fitWidth", js.undefined)
    @scala.inline
    def setFlip(value: IconClass): Self = this.set("flip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlip: Self = this.set("flip", js.undefined)
    @scala.inline
    def setFullPage(value: IconClass): Self = this.set("fullPage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullPage: Self = this.set("fullPage", js.undefined)
    @scala.inline
    def setFullScreen(value: IconClass): Self = this.set("fullScreen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullScreen: Self = this.set("fullScreen", js.undefined)
    @scala.inline
    def setLastPage(value: OnButtonClick): Self = this.set("lastPage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastPage: Self = this.set("lastPage", js.undefined)
    @scala.inline
    def setLoadImage(value: IconClass): Self = this.set("loadImage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadImage: Self = this.set("loadImage", js.undefined)
    @scala.inline
    def setMirror(value: IconClass): Self = this.set("mirror", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMirror: Self = this.set("mirror", js.undefined)
    @scala.inline
    def setNextPage(value: IconClass): Self = this.set("nextPage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPage: Self = this.set("nextPage", js.undefined)
    @scala.inline
    def setPagination(value: LocationVisibility): Self = this.set("pagination", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePagination: Self = this.set("pagination", js.undefined)
    @scala.inline
    def setPanelChange(value: IconClass): Self = this.set("panelChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePanelChange: Self = this.set("panelChange", js.undefined)
    @scala.inline
    def setPreviousPage(value: IconClass): Self = this.set("previousPage", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreviousPage: Self = this.set("previousPage", js.undefined)
    @scala.inline
    def setPrint(value: IconClass): Self = this.set("print", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrint: Self = this.set("print", js.undefined)
    @scala.inline
    def setReadDirection(value: IconClass): Self = this.set("readDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadDirection: Self = this.set("readDirection", js.undefined)
    @scala.inline
    def setRedo(value: IconClassLocation): Self = this.set("redo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRedo: Self = this.set("redo", js.undefined)
    @scala.inline
    def setRemove(value: IconClass): Self = this.set("remove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemove: Self = this.set("remove", js.undefined)
    @scala.inline
    def setReset(value: SequenceVisibility): Self = this.set("reset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReset: Self = this.set("reset", js.undefined)
    @scala.inline
    def setRotate(value: IconClass): Self = this.set("rotate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotate: Self = this.set("rotate", js.undefined)
    @scala.inline
    def setRotateAll(value: IconClass): Self = this.set("rotateAll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotateAll: Self = this.set("rotateAll", js.undefined)
    @scala.inline
    def setSave(value: IconClass): Self = this.set("save", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSave: Self = this.set("save", js.undefined)
    @scala.inline
    def setUndo(value: Visibility): Self = this.set("undo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUndo: Self = this.set("undo", js.undefined)
    @scala.inline
    def setWipe(value: Sequence): Self = this.set("wipe", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWipe: Self = this.set("wipe", js.undefined)
    @scala.inline
    def setZoomIn(value: LocationOnButtonClick): Self = this.set("zoomIn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomIn: Self = this.set("zoomIn", js.undefined)
    @scala.inline
    def setZoomOut(value: OnButtonClickSequence): Self = this.set("zoomOut", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomOut: Self = this.set("zoomOut", js.undefined)
  }
  
}


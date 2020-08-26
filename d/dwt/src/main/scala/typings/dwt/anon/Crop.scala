package typings.dwt.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Crop extends js.Object {
   // Example 'lastPage'
  var autoFit: js.UndefOr[String] = js.native
   // Example 'rotateAll'
  var crop: js.UndefOr[String] = js.native
   // Example 'save'
  var firstPage: js.UndefOr[String] = js.native
   // Example 'fitWindow'
  var fitHeight: js.UndefOr[String] = js.native
   // Example 'fitHeight'
  var fitWidth: js.UndefOr[String] = js.native
   // Example 'readDirection'
  var flip: js.UndefOr[String] = js.native
   // Example 'fitWidth'
  var fullPage: js.UndefOr[String] = js.native
   // Example 'fullPage'
  var fullScreen: js.UndefOr[String] = js.native
   // Example 'nextPage'
  var lastPage: js.UndefOr[String] = js.native
  var loadImage: js.UndefOr[String] = js.native
   // Example 'flip'
  var mirror: js.UndefOr[String] = js.native
   // Example 'pagination'
  var nextPage: js.UndefOr[String] = js.native
   // Example 'previousPage'
  var pagination: js.UndefOr[String] = js.native
   // Example 'loadImage'
  var panelChange: js.UndefOr[String] = js.native
   // Example 'firstPage'
  var previousPage: js.UndefOr[String] = js.native
   // Example 'remove'
  var print: js.UndefOr[String] = js.native
   // Example 'panelChange'
  var readDirection: js.UndefOr[String] = js.native
   // Example 'undo'
  var redo: js.UndefOr[String] = js.native
   // Example 'reset'
  var remove: js.UndefOr[String] = js.native
   // Example 'zoomOut'
  var reset: js.UndefOr[String] = js.native
   // Example 'mirror'
  var rotate: js.UndefOr[String] = js.native
   // Example 'rotate'
  var rotateAll: js.UndefOr[String] = js.native
   // Example 'print'
  var save: js.UndefOr[String] = js.native
   // Example 'wipe'
  var undo: js.UndefOr[String] = js.native
   // Example 'crop'
  var wipe: js.UndefOr[String] = js.native
   // Example 'redo'
  var zoomIn: js.UndefOr[String] = js.native
   // Example 'zoomIn'
  var zoomOut: js.UndefOr[String] = js.native
}

object Crop {
  @scala.inline
  def apply(): Crop = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Crop]
  }
  @scala.inline
  implicit class CropOps[Self <: Crop] (val x: Self) extends AnyVal {
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
    def setAutoFit(value: String): Self = this.set("autoFit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoFit: Self = this.set("autoFit", js.undefined)
    @scala.inline
    def setCrop(value: String): Self = this.set("crop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrop: Self = this.set("crop", js.undefined)
    @scala.inline
    def setFirstPage(value: String): Self = this.set("firstPage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstPage: Self = this.set("firstPage", js.undefined)
    @scala.inline
    def setFitHeight(value: String): Self = this.set("fitHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFitHeight: Self = this.set("fitHeight", js.undefined)
    @scala.inline
    def setFitWidth(value: String): Self = this.set("fitWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFitWidth: Self = this.set("fitWidth", js.undefined)
    @scala.inline
    def setFlip(value: String): Self = this.set("flip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlip: Self = this.set("flip", js.undefined)
    @scala.inline
    def setFullPage(value: String): Self = this.set("fullPage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullPage: Self = this.set("fullPage", js.undefined)
    @scala.inline
    def setFullScreen(value: String): Self = this.set("fullScreen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullScreen: Self = this.set("fullScreen", js.undefined)
    @scala.inline
    def setLastPage(value: String): Self = this.set("lastPage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastPage: Self = this.set("lastPage", js.undefined)
    @scala.inline
    def setLoadImage(value: String): Self = this.set("loadImage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadImage: Self = this.set("loadImage", js.undefined)
    @scala.inline
    def setMirror(value: String): Self = this.set("mirror", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMirror: Self = this.set("mirror", js.undefined)
    @scala.inline
    def setNextPage(value: String): Self = this.set("nextPage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPage: Self = this.set("nextPage", js.undefined)
    @scala.inline
    def setPagination(value: String): Self = this.set("pagination", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePagination: Self = this.set("pagination", js.undefined)
    @scala.inline
    def setPanelChange(value: String): Self = this.set("panelChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePanelChange: Self = this.set("panelChange", js.undefined)
    @scala.inline
    def setPreviousPage(value: String): Self = this.set("previousPage", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreviousPage: Self = this.set("previousPage", js.undefined)
    @scala.inline
    def setPrint(value: String): Self = this.set("print", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrint: Self = this.set("print", js.undefined)
    @scala.inline
    def setReadDirection(value: String): Self = this.set("readDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadDirection: Self = this.set("readDirection", js.undefined)
    @scala.inline
    def setRedo(value: String): Self = this.set("redo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRedo: Self = this.set("redo", js.undefined)
    @scala.inline
    def setRemove(value: String): Self = this.set("remove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemove: Self = this.set("remove", js.undefined)
    @scala.inline
    def setReset(value: String): Self = this.set("reset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReset: Self = this.set("reset", js.undefined)
    @scala.inline
    def setRotate(value: String): Self = this.set("rotate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotate: Self = this.set("rotate", js.undefined)
    @scala.inline
    def setRotateAll(value: String): Self = this.set("rotateAll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotateAll: Self = this.set("rotateAll", js.undefined)
    @scala.inline
    def setSave(value: String): Self = this.set("save", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSave: Self = this.set("save", js.undefined)
    @scala.inline
    def setUndo(value: String): Self = this.set("undo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUndo: Self = this.set("undo", js.undefined)
    @scala.inline
    def setWipe(value: String): Self = this.set("wipe", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWipe: Self = this.set("wipe", js.undefined)
    @scala.inline
    def setZoomIn(value: String): Self = this.set("zoomIn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomIn: Self = this.set("zoomIn", js.undefined)
    @scala.inline
    def setZoomOut(value: String): Self = this.set("zoomOut", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomOut: Self = this.set("zoomOut", js.undefined)
  }
  
}


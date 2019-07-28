package typings.fineDashUploader.fineDashUploaderMod

import typings.fineDashUploader.libCoreMod.FineUploaderBasic
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fine-uploader", "FineUploader")
@js.native
/**
  * The FineUploader Core + UI constructor
  */
class FineUploader () extends FineUploaderBasic {
  def this(fineuploaderOptions: UIOptions) = this()
  /**
    * Mark `element` as a drop zone
    *
    * @param HTMLElement element : The element to mark as a drop zone
    */
  def addExtraDropzone(element: HTMLElement): Unit = js.native
  /**
    * Returns the (drop zone) element where the file was dropped. Undefined if drop event was not involved
    *
    * @param number id : The file id
    * @returns HTMLElement : The drop zone element where the file was dropped
    */
  def getDropTarget(id: Double): HTMLElement = js.native
  /**
    * Returns the file `id` associated with an `HTMLElement`
    *
    * @param HTMLElement element : Returns the ID of the associated file, given a file container element or a child of a file container element
    * @returns number : the id of the file
    */
  def getId(element: HTMLElement): Double = js.native
  /**
    * Returns the `HTMLElement` associated with the file id
    *
    * @param number id : The file id
    * @returns HTMLElement : The `HTMLElement` that is associated with the file id
    */
  def getItemByFileId(id: Double): HTMLElement = js.native
  /**
    * Used to un-mark an `element` as a drop zone
    *
    * @param HTMLElement element : The element to un-mark as a drop zone
    */
  def removeExtraDropzone(element: HTMLElement): Unit = js.native
}


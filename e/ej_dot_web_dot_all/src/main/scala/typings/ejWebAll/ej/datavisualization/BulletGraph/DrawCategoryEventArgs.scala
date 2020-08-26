package typings.ejWebAll.ej.datavisualization.BulletGraph

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrawCategoryEventArgs extends js.Object {
  /** returns the object of the bullet graph.
    */
  var Object: js.UndefOr[js.Any] = js.native
  /** returns the text value of the category that is drawn.
    */
  var Value: js.UndefOr[String] = js.native
  /** returns the options of category element.
    */
  var categoryElement: js.UndefOr[HTMLElement] = js.native
  /** returns the options of the scale element.
    */
  var scaleElement: js.UndefOr[HTMLElement] = js.native
}

object DrawCategoryEventArgs {
  @scala.inline
  def apply(): DrawCategoryEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrawCategoryEventArgs]
  }
  @scala.inline
  implicit class DrawCategoryEventArgsOps[Self <: DrawCategoryEventArgs] (val x: Self) extends AnyVal {
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
    def setObject(value: js.Any): Self = this.set("Object", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObject: Self = this.set("Object", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("Value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("Value", js.undefined)
    @scala.inline
    def setCategoryElement(value: HTMLElement): Self = this.set("categoryElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategoryElement: Self = this.set("categoryElement", js.undefined)
    @scala.inline
    def setScaleElement(value: HTMLElement): Self = this.set("scaleElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScaleElement: Self = this.set("scaleElement", js.undefined)
  }
  
}


package typings.extjs.Ext.util

import typings.extjs.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITextMetrics extends IBase {
  /** [Method] Binds this TextMetrics instance to a new element
    * @param el String/HTMLElement/Ext.Element The element or its ID.
    */
  var bind: js.UndefOr[js.Function1[/* el */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Destroy this instance */
  var destroy: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Returns the measured height of the specified text
    * @param text String The text to measure
    * @returns Number height The height in pixels
    */
  var getHeight: js.UndefOr[js.Function1[/* text */ js.UndefOr[String], Double]] = js.native
  /** [Method] Returns the size of the specified text based on the internal element s style and width properties
    * @param text String The text to measure
    * @returns Object An object containing the text's size {width: (width), height: (height)}
    */
  var getSize: js.UndefOr[js.Function1[/* text */ js.UndefOr[String], _]] = js.native
  /** [Method] Returns the measured width of the specified text
    * @param text String The text to measure
    * @returns Number width The width in pixels
    */
  var getWidth: js.UndefOr[js.Function1[/* text */ js.UndefOr[String], Double]] = js.native
  /** [Method] Sets a fixed width on the internal measurement element
    * @param width Number The width to set on the element
    */
  var setFixedWidth: js.UndefOr[js.Function1[/* width */ js.UndefOr[Double], Unit]] = js.native
}

object ITextMetrics {
  @scala.inline
  def apply(): ITextMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITextMetrics]
  }
  @scala.inline
  implicit class ITextMetricsOps[Self <: ITextMetrics] (val x: Self) extends AnyVal {
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
    def setBind(value: /* el */ js.UndefOr[js.Any] => Unit): Self = this.set("bind", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBind: Self = this.set("bind", js.undefined)
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    @scala.inline
    def setGetHeight(value: /* text */ js.UndefOr[String] => Double): Self = this.set("getHeight", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetHeight: Self = this.set("getHeight", js.undefined)
    @scala.inline
    def setGetSize(value: /* text */ js.UndefOr[String] => _): Self = this.set("getSize", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetSize: Self = this.set("getSize", js.undefined)
    @scala.inline
    def setGetWidth(value: /* text */ js.UndefOr[String] => Double): Self = this.set("getWidth", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetWidth: Self = this.set("getWidth", js.undefined)
    @scala.inline
    def setSetFixedWidth(value: /* width */ js.UndefOr[Double] => Unit): Self = this.set("setFixedWidth", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetFixedWidth: Self = this.set("setFixedWidth", js.undefined)
  }
  
}


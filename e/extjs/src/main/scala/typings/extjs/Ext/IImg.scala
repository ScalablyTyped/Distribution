package typings.extjs.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IImg extends IComponent {
  /** [Config Option] (String) */
  var alt: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (Number/String) */
  var glyph: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var imgCls: js.UndefOr[java.lang.String] = js.native
  /** [Method] Template method called when this Component s DOM structure is created  */
  @JSName("onRender")
  var onRender_IImg: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Updates the src of the image
    * @param src String
    */
  var setSrc: js.UndefOr[js.Function1[/* src */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Config Option] (String) */
  var src: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (String) */
  var title: js.UndefOr[java.lang.String] = js.native
}

object IImg {
  @scala.inline
  def apply(): IImg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IImg]
  }
  @scala.inline
  implicit class IImgOps[Self <: IImg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAlt(value: java.lang.String): Self = this.set("alt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlt: Self = this.set("alt", js.undefined)
    @scala.inline
    def setGlyph(value: js.Any): Self = this.set("glyph", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlyph: Self = this.set("glyph", js.undefined)
    @scala.inline
    def setImgCls(value: java.lang.String): Self = this.set("imgCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImgCls: Self = this.set("imgCls", js.undefined)
    @scala.inline
    def setOnRender(value: () => Unit): Self = this.set("onRender", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnRender: Self = this.set("onRender", js.undefined)
    @scala.inline
    def setSetSrc(value: /* src */ js.UndefOr[java.lang.String] => Unit): Self = this.set("setSrc", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetSrc: Self = this.set("setSrc", js.undefined)
    @scala.inline
    def setSrc(value: java.lang.String): Self = this.set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSrc: Self = this.set("src", js.undefined)
    @scala.inline
    def setTitle(value: java.lang.String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}


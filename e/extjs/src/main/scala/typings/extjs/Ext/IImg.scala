package typings.extjs.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IImg extends IComponent {
  /** [Config Option] (String) */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Number/String) */
  var glyph: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var imgCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Template method called when this Component s DOM structure is created  */
  @JSName("onRender")
  var onRender_IImg: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Updates the src of the image
    * @param src String
    */
  var setSrc: js.UndefOr[js.Function1[/* src */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Config Option] (String) */
  var src: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object IImg {
  @scala.inline
  def apply(
    IComponent: IComponent = null,
    alt: java.lang.String = null,
    glyph: js.Any = null,
    imgCls: java.lang.String = null,
    onRender: () => Unit = null,
    setSrc: /* src */ js.UndefOr[java.lang.String] => Unit = null,
    src: java.lang.String = null,
    title: java.lang.String = null
  ): IImg = {
    val __obj = js.Dynamic.literal()
    if (IComponent != null) js.Dynamic.global.Object.assign(__obj, IComponent)
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (glyph != null) __obj.updateDynamic("glyph")(glyph.asInstanceOf[js.Any])
    if (imgCls != null) __obj.updateDynamic("imgCls")(imgCls.asInstanceOf[js.Any])
    if (onRender != null) __obj.updateDynamic("onRender")(js.Any.fromFunction0(onRender))
    if (setSrc != null) __obj.updateDynamic("setSrc")(js.Any.fromFunction1(setSrc))
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IImg]
  }
}


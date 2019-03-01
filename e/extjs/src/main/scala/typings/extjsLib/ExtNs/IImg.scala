package typings
package extjsLib.ExtNs

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
  var onRender_IImg: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Updates the src of the image
  		* @param src String
  		*/
  var setSrc: js.UndefOr[js.Function1[/* src */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
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
    autoEl: js.Any = null,
    baseCls: java.lang.String = null,
    glyph: js.Any = null,
    imgCls: java.lang.String = null,
    onDestroy: js.Function0[scala.Unit] = null,
    onRender: js.Function0[scala.Unit] = null,
    setSrc: js.Function1[/* src */ js.UndefOr[java.lang.String], scala.Unit] = null,
    src: java.lang.String = null,
    title: java.lang.String = null
  ): IImg = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IComponent)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (autoEl != null) __obj.updateDynamic("autoEl")(autoEl)
    if (baseCls != null) __obj.updateDynamic("baseCls")(baseCls)
    if (glyph != null) __obj.updateDynamic("glyph")(glyph)
    if (imgCls != null) __obj.updateDynamic("imgCls")(imgCls)
    if (onDestroy != null) __obj.updateDynamic("onDestroy")(onDestroy)
    if (onRender != null) __obj.updateDynamic("onRender")(onRender)
    if (setSrc != null) __obj.updateDynamic("setSrc")(setSrc)
    if (src != null) __obj.updateDynamic("src")(src)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[IImg]
  }
}


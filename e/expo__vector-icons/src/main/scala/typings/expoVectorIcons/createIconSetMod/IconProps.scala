package typings.expoVectorIcons.createIconSetMod

import typings.reactNative.mod.TextProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IconProps[GLYPHS /* <: String */] extends TextProps {
  /**
    * Color of the icon
    *
    */
  var color: js.UndefOr[String] = js.native
  /**
    * Name of the icon to show
    *
    * See Icon Explorer app
    * {@link https://expo.github.io/vector-icons/}
    */
  var name: GLYPHS = js.native
  /**
    * Size of the icon, can also be passed as fontSize in the style object.
    *
    * @default 12
    */
  var size: js.UndefOr[Double] = js.native
}

object IconProps {
  @scala.inline
  def apply[/* <: java.lang.String */ GLYPHS](name: GLYPHS): IconProps[GLYPHS] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconProps[GLYPHS]]
  }
  @scala.inline
  implicit class IconPropsOps[Self <: IconProps[_], /* <: java.lang.String */ GLYPHS] (val x: Self with IconProps[GLYPHS]) extends AnyVal {
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
    def setName(value: GLYPHS): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
  
}


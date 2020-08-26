package typings.extjs.Ext.draw.engine

import typings.extjs.Ext.draw.ISurface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVml extends ISurface {
  /** [Method] Sets the size of the surface
    * @param width Object
    * @param height Object
    */
  @JSName("setSize")
  var setSize_IVml: js.UndefOr[
    js.Function2[/* width */ js.UndefOr[js.Any], /* height */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Method] Changes the text in the sprite element
    * @param sprite Object
    * @param text Object
    */
  @JSName("setText")
  var setText_IVml: js.UndefOr[
    js.Function2[/* sprite */ js.UndefOr[js.Any], /* text */ js.UndefOr[js.Any], Unit]
  ] = js.native
}

object IVml {
  @scala.inline
  def apply(): IVml = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IVml]
  }
  @scala.inline
  implicit class IVmlOps[Self <: IVml] (val x: Self) extends AnyVal {
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
    def setSetSize(value: (/* width */ js.UndefOr[js.Any], /* height */ js.UndefOr[js.Any]) => Unit): Self = this.set("setSize", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSetSize: Self = this.set("setSize", js.undefined)
    @scala.inline
    def setSetText(value: (/* sprite */ js.UndefOr[js.Any], /* text */ js.UndefOr[js.Any]) => Unit): Self = this.set("setText", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSetText: Self = this.set("setText", js.undefined)
  }
  
}


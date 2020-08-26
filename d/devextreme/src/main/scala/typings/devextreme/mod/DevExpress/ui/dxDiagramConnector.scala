package typings.devextreme.mod.DevExpress.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxDiagramConnector extends dxDiagramItem {
  /** @name dxDiagramConnector.fromKey */
  var fromKey: js.UndefOr[js.Any] = js.native
  /** @name dxDiagramConnector.texts */
  var texts: js.UndefOr[js.Array[String]] = js.native
  /** @name dxDiagramConnector.toKey */
  var toKey: js.UndefOr[js.Any] = js.native
}

object dxDiagramConnector {
  @scala.inline
  def apply(): dxDiagramConnector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxDiagramConnector]
  }
  @scala.inline
  implicit class dxDiagramConnectorOps[Self <: dxDiagramConnector] (val x: Self) extends AnyVal {
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
    def setFromKey(value: js.Any): Self = this.set("fromKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFromKey: Self = this.set("fromKey", js.undefined)
    @scala.inline
    def setTextsVarargs(value: String*): Self = this.set("texts", js.Array(value :_*))
    @scala.inline
    def setTexts(value: js.Array[String]): Self = this.set("texts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTexts: Self = this.set("texts", js.undefined)
    @scala.inline
    def setToKey(value: js.Any): Self = this.set("toKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToKey: Self = this.set("toKey", js.undefined)
  }
  
}


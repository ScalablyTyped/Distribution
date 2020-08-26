package typings.extjs.Ext.layout

import typings.extjs.Ext.Array
import typings.extjs.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISizeModel extends IBase {
  /** [Property] (Boolean) */
  var auto: js.UndefOr[Boolean] = js.native
  /** [Property] (Boolean) */
  var calculated: js.UndefOr[Boolean] = js.native
  /** [Property] (Boolean) */
  var calculatedFromConfigured: js.UndefOr[Boolean] = js.native
  /** [Property] (Boolean) */
  var calculatedFromNatural: js.UndefOr[Boolean] = js.native
  /** [Property] (Boolean) */
  var calculatedFromShrinkWrap: js.UndefOr[Boolean] = js.native
  /** [Property] (Boolean) */
  var configured: js.UndefOr[Boolean] = js.native
  /** [Property] (Boolean) */
  var constrainedMax: js.UndefOr[Boolean] = js.native
  /** [Property] (Boolean) */
  var constrainedMin: js.UndefOr[Boolean] = js.native
  /** [Property] (Boolean) */
  var fixed: js.UndefOr[Boolean] = js.native
  /** [Property] (String) */
  var name: js.UndefOr[String] = js.native
  /** [Property] (Object) */
  var names: js.UndefOr[js.Any] = js.native
  /** [Property] (Boolean) */
  var natural: js.UndefOr[Boolean] = js.native
  /** [Property] (Number) */
  var ordinal: js.UndefOr[Double] = js.native
  /** [Property] (Object[]) */
  var pairsByHeightOrdinal: js.UndefOr[Array] = js.native
  /** [Property] (Boolean) */
  var shrinkWrap: js.UndefOr[Boolean] = js.native
}

object ISizeModel {
  @scala.inline
  def apply(): ISizeModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISizeModel]
  }
  @scala.inline
  implicit class ISizeModelOps[Self <: ISizeModel] (val x: Self) extends AnyVal {
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
    def setAuto(value: Boolean): Self = this.set("auto", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuto: Self = this.set("auto", js.undefined)
    @scala.inline
    def setCalculated(value: Boolean): Self = this.set("calculated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalculated: Self = this.set("calculated", js.undefined)
    @scala.inline
    def setCalculatedFromConfigured(value: Boolean): Self = this.set("calculatedFromConfigured", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalculatedFromConfigured: Self = this.set("calculatedFromConfigured", js.undefined)
    @scala.inline
    def setCalculatedFromNatural(value: Boolean): Self = this.set("calculatedFromNatural", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalculatedFromNatural: Self = this.set("calculatedFromNatural", js.undefined)
    @scala.inline
    def setCalculatedFromShrinkWrap(value: Boolean): Self = this.set("calculatedFromShrinkWrap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalculatedFromShrinkWrap: Self = this.set("calculatedFromShrinkWrap", js.undefined)
    @scala.inline
    def setConfigured(value: Boolean): Self = this.set("configured", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigured: Self = this.set("configured", js.undefined)
    @scala.inline
    def setConstrainedMax(value: Boolean): Self = this.set("constrainedMax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConstrainedMax: Self = this.set("constrainedMax", js.undefined)
    @scala.inline
    def setConstrainedMin(value: Boolean): Self = this.set("constrainedMin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConstrainedMin: Self = this.set("constrainedMin", js.undefined)
    @scala.inline
    def setFixed(value: Boolean): Self = this.set("fixed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFixed: Self = this.set("fixed", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNames(value: js.Any): Self = this.set("names", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNames: Self = this.set("names", js.undefined)
    @scala.inline
    def setNatural(value: Boolean): Self = this.set("natural", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNatural: Self = this.set("natural", js.undefined)
    @scala.inline
    def setOrdinal(value: Double): Self = this.set("ordinal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrdinal: Self = this.set("ordinal", js.undefined)
    @scala.inline
    def setPairsByHeightOrdinal(value: Array): Self = this.set("pairsByHeightOrdinal", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePairsByHeightOrdinal: Self = this.set("pairsByHeightOrdinal", js.undefined)
    @scala.inline
    def setShrinkWrap(value: Boolean): Self = this.set("shrinkWrap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShrinkWrap: Self = this.set("shrinkWrap", js.undefined)
  }
  
}


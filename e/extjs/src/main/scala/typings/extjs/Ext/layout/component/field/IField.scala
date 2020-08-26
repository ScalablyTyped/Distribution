package typings.extjs.Ext.layout.component.field

import typings.extjs.Ext.layout.component.IAuto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IField extends IAuto {
  /** [Method] Called before any calculation cycles to reset DOM values and prepare for calculation
    * @param ownerContext Object
    */
  @JSName("beginLayoutCycle")
  var beginLayoutCycle_IField: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Called before any calculation cycles to prepare for layout
    * @param ownerContext Object
    */
  @JSName("beginLayout")
  var beginLayout_IField: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Property] (Object) */
  var elementId: js.UndefOr[js.Any] = js.native
  /** [Property] (Object) */
  var errorStrategies: js.UndefOr[js.Any] = js.native
  /** [Method] Return the set of strategy functions from the errorStrategies collection that is appropriate for the field s msgTarge  */
  var getErrorStrategy: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Return the set of strategy functions from the labelStrategies collection that is appropriate for the field s labelAli  */
  var getLabelStrategy: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Property] (Object) */
  var labelStrategies: js.UndefOr[js.Any] = js.native
  /** [Property] (Object) */
  var left: js.UndefOr[js.Any] = js.native
  /** [Property] (Object) */
  var qtip: js.UndefOr[js.Any] = js.native
  /** [Property] (Object) */
  var right: js.UndefOr[js.Any] = js.native
  /** [Property] (Object) */
  var side: js.UndefOr[js.Any] = js.native
  /** [Property] (Object) */
  var title: js.UndefOr[js.Any] = js.native
  /** [Property] (Object) */
  var top: js.UndefOr[js.Any] = js.native
  /** [Property] (Object) */
  var under: js.UndefOr[js.Any] = js.native
}

object IField {
  @scala.inline
  def apply(): IField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IField]
  }
  @scala.inline
  implicit class IFieldOps[Self <: IField] (val x: Self) extends AnyVal {
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
    def setBeginLayout(value: /* ownerContext */ js.UndefOr[js.Any] => Unit): Self = this.set("beginLayout", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeginLayout: Self = this.set("beginLayout", js.undefined)
    @scala.inline
    def setBeginLayoutCycle(value: /* ownerContext */ js.UndefOr[js.Any] => Unit): Self = this.set("beginLayoutCycle", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeginLayoutCycle: Self = this.set("beginLayoutCycle", js.undefined)
    @scala.inline
    def setElementId(value: js.Any): Self = this.set("elementId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElementId: Self = this.set("elementId", js.undefined)
    @scala.inline
    def setErrorStrategies(value: js.Any): Self = this.set("errorStrategies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorStrategies: Self = this.set("errorStrategies", js.undefined)
    @scala.inline
    def setGetErrorStrategy(value: () => Unit): Self = this.set("getErrorStrategy", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetErrorStrategy: Self = this.set("getErrorStrategy", js.undefined)
    @scala.inline
    def setGetLabelStrategy(value: () => Unit): Self = this.set("getLabelStrategy", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetLabelStrategy: Self = this.set("getLabelStrategy", js.undefined)
    @scala.inline
    def setLabelStrategies(value: js.Any): Self = this.set("labelStrategies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelStrategies: Self = this.set("labelStrategies", js.undefined)
    @scala.inline
    def setLeft(value: js.Any): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    @scala.inline
    def setQtip(value: js.Any): Self = this.set("qtip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQtip: Self = this.set("qtip", js.undefined)
    @scala.inline
    def setRight(value: js.Any): Self = this.set("right", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
    @scala.inline
    def setSide(value: js.Any): Self = this.set("side", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSide: Self = this.set("side", js.undefined)
    @scala.inline
    def setTitle(value: js.Any): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTop(value: js.Any): Self = this.set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
    @scala.inline
    def setUnder(value: js.Any): Self = this.set("under", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnder: Self = this.set("under", js.undefined)
  }
  
}


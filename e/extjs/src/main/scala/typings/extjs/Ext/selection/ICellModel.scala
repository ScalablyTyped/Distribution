package typings.extjs.Ext.selection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICellModel extends IModel {
  /** [Method] Deselects a record instance by record instance or index
    * @param record Object
    * @param suppressEvent Object
    */
  @JSName("deselect")
  var deselect_ICellModel: js.UndefOr[
    js.Function2[/* record */ js.UndefOr[js.Any], /* suppressEvent */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Config Option] (Boolean) */
  var enableKeyNav: js.UndefOr[Boolean] = js.native
  /** [Method] Returns the current position in the format row row column column  */
  var getCurrentPosition: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] ("SINGLE") */
  @JSName("mode")
  var mode_ICellModel: js.UndefOr[String] = js.native
  /** [Config Option] (Boolean) */
  var preventWrap: js.UndefOr[Boolean] = js.native
  /** [Method] Selects a record instance by record instance or index
    * @param pos Object
    * @param keepExisting Object
    * @param suppressEvent Object
    */
  @JSName("select")
  var select_ICellModel: js.UndefOr[
    js.Function3[
      /* pos */ js.UndefOr[js.Any], 
      /* keepExisting */ js.UndefOr[js.Any], 
      /* suppressEvent */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Method] Sets the current position
    * @param position Object The position to set.
    * @param suppressEvent Boolean True to suppress selection events
    */
  var setCurrentPosition: js.UndefOr[
    js.Function2[/* position */ js.UndefOr[js.Any], /* suppressEvent */ js.UndefOr[Boolean], Unit]
  ] = js.native
}

object ICellModel {
  @scala.inline
  def apply(): ICellModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICellModel]
  }
  @scala.inline
  implicit class ICellModelOps[Self <: ICellModel] (val x: Self) extends AnyVal {
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
    def setDeselect(value: (/* record */ js.UndefOr[js.Any], /* suppressEvent */ js.UndefOr[js.Any]) => Unit): Self = this.set("deselect", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDeselect: Self = this.set("deselect", js.undefined)
    @scala.inline
    def setEnableKeyNav(value: Boolean): Self = this.set("enableKeyNav", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableKeyNav: Self = this.set("enableKeyNav", js.undefined)
    @scala.inline
    def setGetCurrentPosition(value: () => Unit): Self = this.set("getCurrentPosition", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetCurrentPosition: Self = this.set("getCurrentPosition", js.undefined)
    @scala.inline
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setPreventWrap(value: Boolean): Self = this.set("preventWrap", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreventWrap: Self = this.set("preventWrap", js.undefined)
    @scala.inline
    def setSelect(
      value: (/* pos */ js.UndefOr[js.Any], /* keepExisting */ js.UndefOr[js.Any], /* suppressEvent */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("select", js.Any.fromFunction3(value))
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
    @scala.inline
    def setSetCurrentPosition(value: (/* position */ js.UndefOr[js.Any], /* suppressEvent */ js.UndefOr[Boolean]) => Unit): Self = this.set("setCurrentPosition", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSetCurrentPosition: Self = this.set("setCurrentPosition", js.undefined)
  }
  
}


package typings.extjs.Ext.selection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICheckboxModel extends IRowModel {
  /** [Config Option] (Boolean) */
  var checkOnly: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var checkSelector: js.UndefOr[String] = js.native
  /** [Method] Retrieve a configuration to be used in a HeaderContainer  */
  var getHeaderConfig: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Number/String) */
  var injectCheckbox: js.UndefOr[js.Any] = js.native
  /** [Method] Toggle between selecting all and deselecting all when clicking on a checkbox header
    * @param headerCt Object
    * @param header Object
    * @param e Object
    */
  var onHeaderClick: js.UndefOr[
    js.Function3[
      /* headerCt */ js.UndefOr[js.Any], 
      /* header */ js.UndefOr[js.Any], 
      /* e */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Method] Generates the HTML to be rendered in the injected checkbox column for each row
    * @param value Object
    * @param metaData Object
    * @param record Object
    * @param rowIndex Object
    * @param colIndex Object
    * @param store Object
    * @param view Object
    */
  var renderer: js.UndefOr[
    js.Function7[
      /* value */ js.UndefOr[js.Any], 
      /* metaData */ js.UndefOr[js.Any], 
      /* record */ js.UndefOr[js.Any], 
      /* rowIndex */ js.UndefOr[js.Any], 
      /* colIndex */ js.UndefOr[js.Any], 
      /* store */ js.UndefOr[js.Any], 
      /* view */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Config Option] (Boolean) */
  var showHeaderCheckbox: js.UndefOr[Boolean] = js.native
}

object ICheckboxModel {
  @scala.inline
  def apply(): ICheckboxModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICheckboxModel]
  }
  @scala.inline
  implicit class ICheckboxModelOps[Self <: ICheckboxModel] (val x: Self) extends AnyVal {
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
    def setCheckOnly(value: Boolean): Self = this.set("checkOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckOnly: Self = this.set("checkOnly", js.undefined)
    @scala.inline
    def setCheckSelector(value: String): Self = this.set("checkSelector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckSelector: Self = this.set("checkSelector", js.undefined)
    @scala.inline
    def setGetHeaderConfig(value: () => Unit): Self = this.set("getHeaderConfig", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetHeaderConfig: Self = this.set("getHeaderConfig", js.undefined)
    @scala.inline
    def setInjectCheckbox(value: js.Any): Self = this.set("injectCheckbox", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInjectCheckbox: Self = this.set("injectCheckbox", js.undefined)
    @scala.inline
    def setOnHeaderClick(
      value: (/* headerCt */ js.UndefOr[js.Any], /* header */ js.UndefOr[js.Any], /* e */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("onHeaderClick", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnHeaderClick: Self = this.set("onHeaderClick", js.undefined)
    @scala.inline
    def setRenderer(
      value: (/* value */ js.UndefOr[js.Any], /* metaData */ js.UndefOr[js.Any], /* record */ js.UndefOr[js.Any], /* rowIndex */ js.UndefOr[js.Any], /* colIndex */ js.UndefOr[js.Any], /* store */ js.UndefOr[js.Any], /* view */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("renderer", js.Any.fromFunction7(value))
    @scala.inline
    def deleteRenderer: Self = this.set("renderer", js.undefined)
    @scala.inline
    def setShowHeaderCheckbox(value: Boolean): Self = this.set("showHeaderCheckbox", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowHeaderCheckbox: Self = this.set("showHeaderCheckbox", js.undefined)
  }
  
}


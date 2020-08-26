package typings.extjs.Ext.view

import typings.extjs.Ext.Array
import typings.extjs.Ext.IComponent
import typings.extjs.Ext.data.IModel
import typings.extjs.Ext.data.IStore
import typings.extjs.Ext.grid.column.IColumn
import typings.extjs.Ext.grid.feature.IFeature
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITable extends IView {
  /** [Method] Adds a CSS Class to a specific row
    * @param rowInfo HTMLElement/String/Number/Ext.data.Model An HTMLElement, index or instance of a model representing this row
    * @param cls String
    */
  var addRowCls: js.UndefOr[
    js.Function2[/* rowInfo */ js.UndefOr[js.Any], /* cls */ js.UndefOr[String], Unit]
  ] = js.native
  /** [Method] Sizes the passed header to fit the max content width
    * @param header Ext.grid.column.Column/Number The header (or index of header) to auto size.
    */
  var autoSizeColumn: js.UndefOr[js.Function1[/* header */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Function which can be overridden which returns the data object passed to this DataView s template to render the whole
    * @param records Object
    * @param startIndex Object
    * @returns Object[] An Array of data objects to be processed by a repeating XTemplate. May also contain named properties.
    */
  @JSName("collectData")
  var collectData_ITable: js.UndefOr[
    js.Function2[/* records */ js.UndefOr[js.Any], /* startIndex */ js.UndefOr[js.Any], Array]
  ] = js.native
  /** [Config Option] (Boolean) */
  var enableTextSelection: js.UndefOr[Boolean] = js.native
  /** [Method] Expands a particular header to fit the max content width
    * @param header Object
    */
  var expandToFit: js.UndefOr[js.Function1[/* header */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (String) */
  var firstCls: js.UndefOr[String] = js.native
  /** [Method] Focuses a particular row and brings it into view
    * @param row HTMLElement/String/Number/Ext.data.Model An HTMLElement template node, index of a template node, the id of a template node or the
    * @param delay Boolean/Number Delay the focus this number of milliseconds (true for 10 milliseconds). record associated with the node.
    */
  var focusRow: js.UndefOr[js.Function2[/* row */ js.UndefOr[js.Any], /* delay */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Try to focus this component
    * @param selectText Object
    * @param delay Object
    * @returns Ext.Component The focused Component. Usually this Component. Some Containers may delegate focus to a descendant Component (Windows can do this through their defaultFocus config option.
    */
  @JSName("focus")
  var focus_ITable: js.UndefOr[
    js.Function2[/* selectText */ js.UndefOr[js.Any], /* delay */ js.UndefOr[js.Any], IComponent]
  ] = js.native
  /** [Method] Returns a CSS selector which selects the outermost element s in this view  */
  var getBodySelector: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Returns a CSS selector which selects a particular column if the desired header is passed or a general cell selector
    * @param header Ext.grid.column.Column The column for which to return the selector. If omitted, the general cell selector which matches ant cell will be returned.
    */
  var getCellSelector: js.UndefOr[js.Function1[/* header */ js.UndefOr[IColumn], Unit]] = js.native
  /** [Method] Returns a CSS selector which selects the element s which define the width of a column
    * @param header Object
    */
  var getColumnSizerSelector: js.UndefOr[js.Function1[/* header */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Returns a CSS selector which selects a row which contains cells  */
  var getDataRowSelector: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Get a reference to a feature
    * @param id String The id of the feature
    * @returns Ext.grid.feature.Feature The feature. Undefined if not found
    */
  var getFeature: js.UndefOr[js.Function1[/* id */ js.UndefOr[String], IFeature]] = js.native
  /** [Method] Returns a CSS selector which selects items of the view rendered by the rowTpl */
  var getItemSelector: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Returns a CSS selector which selects the element which contains record nodes  */
  var getNodeContainerSelector: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Returns the node given the passed Record or index or node
    * @param nodeInfo HTMLElement/String/Number/Ext.data.Model The node or record
    * @param dataRow Boolean true to return the data row (not the top level row if wrapped), false to return the top level row.
    * @returns HTMLElement The node or null if it wasn't found
    */
  @JSName("getNode")
  var getNode_ITable: js.UndefOr[
    js.Function2[/* nodeInfo */ js.UndefOr[js.Any], /* dataRow */ js.UndefOr[Boolean], HTMLElement]
  ] = js.native
  /** [Method] Gets the current XY position of the component s underlying element
    * @param record Object
    * @param header Object
    * @returns Number[] The XY position of the element (e.g., [100, 200])
    */
  @JSName("getPosition")
  var getPosition_ITable: js.UndefOr[
    js.Function2[/* record */ js.UndefOr[js.Any], /* header */ js.UndefOr[js.Any], Array]
  ] = js.native
  /** [Method] Override this function to apply custom CSS classes to rows during rendering
    * @param record Ext.data.Model The record corresponding to the current row.
    * @param index Number The row index.
    * @param rowParams Object DEPRECATED. For row body use the getAdditionalData method of the rowbody feature.
    * @param store Ext.data.Store The store this grid is bound to
    * @returns String a CSS class name to add to the row.
    */
  var getRowClass: js.UndefOr[
    js.Function4[
      /* record */ js.UndefOr[IModel], 
      /* index */ js.UndefOr[Double], 
      /* rowParams */ js.UndefOr[js.Any], 
      /* store */ js.UndefOr[IStore], 
      String
    ]
  ] = js.native
  /** [Config Option] (String) */
  var lastCls: js.UndefOr[String] = js.native
  /** [Config Option] (Boolean) */
  var markDirty: js.UndefOr[Boolean] = js.native
  /** [Method] Removes a CSS Class from a specific row
    * @param rowInfo HTMLElement/String/Number/Ext.data.Model An HTMLElement, index or instance of a model representing this row
    * @param cls String
    */
  var removeRowCls: js.UndefOr[
    js.Function2[/* rowInfo */ js.UndefOr[js.Any], /* cls */ js.UndefOr[String], Unit]
  ] = js.native
  /** [Config Option] (Boolean) */
  var stripeRows: js.UndefOr[Boolean] = js.native
  /** [Method] Navigates from the passed record by the passed increment which may be ve or ve Skips hidden records
    * @param startRec Ext.data.Model The Record to start from.
    * @param distance Number The distance to move from the record. May be +ve or -ve.
    */
  var walkRecs: js.UndefOr[
    js.Function2[/* startRec */ js.UndefOr[IModel], /* distance */ js.UndefOr[Double], Unit]
  ] = js.native
  /** [Method] Increments the passed row index by the passed increment which may be ve or ve Skips hidden rows
    * @param startRow Number The zero-based row index to start from.
    * @param distance Number The distance to move the row by. May be +ve or -ve.
    */
  var walkRows: js.UndefOr[
    js.Function2[/* startRow */ js.UndefOr[Double], /* distance */ js.UndefOr[Double], Unit]
  ] = js.native
}

object ITable {
  @scala.inline
  def apply(): ITable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITable]
  }
  @scala.inline
  implicit class ITableOps[Self <: ITable] (val x: Self) extends AnyVal {
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
    def setAddRowCls(value: (/* rowInfo */ js.UndefOr[js.Any], /* cls */ js.UndefOr[String]) => Unit): Self = this.set("addRowCls", js.Any.fromFunction2(value))
    @scala.inline
    def deleteAddRowCls: Self = this.set("addRowCls", js.undefined)
    @scala.inline
    def setAutoSizeColumn(value: /* header */ js.UndefOr[js.Any] => Unit): Self = this.set("autoSizeColumn", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAutoSizeColumn: Self = this.set("autoSizeColumn", js.undefined)
    @scala.inline
    def setCollectData(value: (/* records */ js.UndefOr[js.Any], /* startIndex */ js.UndefOr[js.Any]) => Array): Self = this.set("collectData", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCollectData: Self = this.set("collectData", js.undefined)
    @scala.inline
    def setEnableTextSelection(value: Boolean): Self = this.set("enableTextSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableTextSelection: Self = this.set("enableTextSelection", js.undefined)
    @scala.inline
    def setExpandToFit(value: /* header */ js.UndefOr[js.Any] => Unit): Self = this.set("expandToFit", js.Any.fromFunction1(value))
    @scala.inline
    def deleteExpandToFit: Self = this.set("expandToFit", js.undefined)
    @scala.inline
    def setFirstCls(value: String): Self = this.set("firstCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstCls: Self = this.set("firstCls", js.undefined)
    @scala.inline
    def setFocus(value: (/* selectText */ js.UndefOr[js.Any], /* delay */ js.UndefOr[js.Any]) => IComponent): Self = this.set("focus", js.Any.fromFunction2(value))
    @scala.inline
    def deleteFocus: Self = this.set("focus", js.undefined)
    @scala.inline
    def setFocusRow(value: (/* row */ js.UndefOr[js.Any], /* delay */ js.UndefOr[js.Any]) => Unit): Self = this.set("focusRow", js.Any.fromFunction2(value))
    @scala.inline
    def deleteFocusRow: Self = this.set("focusRow", js.undefined)
    @scala.inline
    def setGetBodySelector(value: () => Unit): Self = this.set("getBodySelector", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetBodySelector: Self = this.set("getBodySelector", js.undefined)
    @scala.inline
    def setGetCellSelector(value: /* header */ js.UndefOr[IColumn] => Unit): Self = this.set("getCellSelector", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetCellSelector: Self = this.set("getCellSelector", js.undefined)
    @scala.inline
    def setGetColumnSizerSelector(value: /* header */ js.UndefOr[js.Any] => Unit): Self = this.set("getColumnSizerSelector", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetColumnSizerSelector: Self = this.set("getColumnSizerSelector", js.undefined)
    @scala.inline
    def setGetDataRowSelector(value: () => Unit): Self = this.set("getDataRowSelector", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetDataRowSelector: Self = this.set("getDataRowSelector", js.undefined)
    @scala.inline
    def setGetFeature(value: /* id */ js.UndefOr[String] => IFeature): Self = this.set("getFeature", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetFeature: Self = this.set("getFeature", js.undefined)
    @scala.inline
    def setGetItemSelector(value: () => Unit): Self = this.set("getItemSelector", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetItemSelector: Self = this.set("getItemSelector", js.undefined)
    @scala.inline
    def setGetNode(value: (/* nodeInfo */ js.UndefOr[js.Any], /* dataRow */ js.UndefOr[Boolean]) => HTMLElement): Self = this.set("getNode", js.Any.fromFunction2(value))
    @scala.inline
    def deleteGetNode: Self = this.set("getNode", js.undefined)
    @scala.inline
    def setGetNodeContainerSelector(value: () => Unit): Self = this.set("getNodeContainerSelector", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetNodeContainerSelector: Self = this.set("getNodeContainerSelector", js.undefined)
    @scala.inline
    def setGetPosition(value: (/* record */ js.UndefOr[js.Any], /* header */ js.UndefOr[js.Any]) => Array): Self = this.set("getPosition", js.Any.fromFunction2(value))
    @scala.inline
    def deleteGetPosition: Self = this.set("getPosition", js.undefined)
    @scala.inline
    def setGetRowClass(
      value: (/* record */ js.UndefOr[IModel], /* index */ js.UndefOr[Double], /* rowParams */ js.UndefOr[js.Any], /* store */ js.UndefOr[IStore]) => String
    ): Self = this.set("getRowClass", js.Any.fromFunction4(value))
    @scala.inline
    def deleteGetRowClass: Self = this.set("getRowClass", js.undefined)
    @scala.inline
    def setLastCls(value: String): Self = this.set("lastCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastCls: Self = this.set("lastCls", js.undefined)
    @scala.inline
    def setMarkDirty(value: Boolean): Self = this.set("markDirty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkDirty: Self = this.set("markDirty", js.undefined)
    @scala.inline
    def setRemoveRowCls(value: (/* rowInfo */ js.UndefOr[js.Any], /* cls */ js.UndefOr[String]) => Unit): Self = this.set("removeRowCls", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRemoveRowCls: Self = this.set("removeRowCls", js.undefined)
    @scala.inline
    def setStripeRows(value: Boolean): Self = this.set("stripeRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStripeRows: Self = this.set("stripeRows", js.undefined)
    @scala.inline
    def setWalkRecs(value: (/* startRec */ js.UndefOr[IModel], /* distance */ js.UndefOr[Double]) => Unit): Self = this.set("walkRecs", js.Any.fromFunction2(value))
    @scala.inline
    def deleteWalkRecs: Self = this.set("walkRecs", js.undefined)
    @scala.inline
    def setWalkRows(value: (/* startRow */ js.UndefOr[Double], /* distance */ js.UndefOr[Double]) => Unit): Self = this.set("walkRows", js.Any.fromFunction2(value))
    @scala.inline
    def deleteWalkRows: Self = this.set("walkRows", js.undefined)
  }
  
}


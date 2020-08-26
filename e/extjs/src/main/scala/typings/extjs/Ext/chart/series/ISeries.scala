package typings.extjs.Ext.chart.series

import typings.extjs.Ext.Array
import typings.extjs.Ext.data.IModel
import typings.extjs.Ext.draw.ISprite
import typings.extjs.Ext.util.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.extjs.Ext.IClass because Already inherited
- typings.extjs.Ext.IBase because Already inherited
- typings.extjs.Ext.chart.IHighlight because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined highlight, highlightCfg, highlightItem, unHighlightItem
- typings.extjs.Ext.chart.ILabel because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined label, onCreateLabel, onPlaceLabel */ @js.native
trait ISeries extends IObservable {
  /** [Method] Iterate over each of the records for this series
    * @param fn Function The function to execute for each record.
    * @param scope Object Scope for the fn.
    */
  var eachRecord: js.UndefOr[js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] For a given x y point relative to the Surface find a corresponding item from this series if any
    * @param x Number
    * @param y Number
    * @returns Object An object describing the item, or null if there is no matching item. The exact contents of this object will vary by series type, but should always contain the following:
    */
  var getItemForPoint: js.UndefOr[js.Function2[/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], _]] = js.native
  /** [Method] Returns a string with the color to be used for the series legend item
    * @param index Object
    */
  var getLegendColor: js.UndefOr[js.Function1[/* index */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Return the number of records being displayed in this series  */
  var getRecordCount: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Hides all the elements in the series  */
  var hideAll: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Boolean/Object) */
  var highlight: js.UndefOr[js.Any] = js.native
  /** [Property] (Object) */
  var highlightCfg: js.UndefOr[js.Any] = js.native
  /** [Method] Highlight the given series item
    * @param item Object Info about the item; same format as returned by #getItemForPoint.
    */
  var highlightItem: js.UndefOr[js.Function1[js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Determines whether the series item at the given index has been excluded i e
    * @param index Object
    */
  var isExcluded: js.UndefOr[js.Function1[/* index */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (Object) */
  var label: js.UndefOr[js.Any] = js.native
  /** [Method] Called each time a new label is created
    * @param storeItem Ext.data.Model The element of the store that is related to the sprite.
    * @param item Object The item related to the sprite. An item is an object containing the position of the shape used to describe the visualization and also pointing to the actual shape (circle, rectangle, path, etc).
    * @param i Number The index of the element created (i.e the first created label, second created label, etc).
    * @param display String The label.display type. May be false if the label is hidden
    * @returns Ext.draw.Sprite The created sprite that will draw the label.
    */
  var onCreateLabel: js.UndefOr[
    js.Function4[js.UndefOr[IModel], js.UndefOr[js.Any], js.UndefOr[Double], js.UndefOr[String], ISprite]
  ] = js.native
  /** [Method] Called for updating the position of the label
    * @param label Ext.draw.Sprite The sprite that draws the label.
    * @param storeItem Ext.data.Model The element of the store that is related to the sprite.
    * @param item Object The item related to the sprite. An item is an object containing the position of the shape used to describe the visualization and also pointing to the actual shape (circle, rectangle, path, etc).
    * @param i Number The index of the element to be updated (i.e. whether it is the first, second, third from the labelGroup)
    * @param display String The label.display type. May be false if the label is hidden
    * @param animate Boolean A boolean value to set or unset animations for the labels.
    * @param index Number The series index.
    */
  var onPlaceLabel: js.UndefOr[
    js.Function7[
      js.UndefOr[ISprite], 
      js.UndefOr[IModel], 
      js.UndefOr[js.Any], 
      js.UndefOr[Double], 
      js.UndefOr[String], 
      js.UndefOr[Boolean], 
      js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
  /** [Config Option] (Function) */
  var renderer: js.UndefOr[js.Any] = js.native
  /** [Method] Changes the value of the title for the series
    * @param index Number
    * @param title String
    */
  var setTitle: js.UndefOr[
    js.Function2[/* index */ js.UndefOr[Double], /* title */ js.UndefOr[String], Unit]
  ] = js.native
  /** [Config Option] (Array) */
  var shadowAttributes: js.UndefOr[Array] = js.native
  /** [Method] Shows all the elements in the series  */
  var showAll: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Boolean) */
  var showInLegend: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Object) */
  var tips: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var title: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var `type`: js.UndefOr[String] = js.native
  /** [Method] Un highlight any existing highlights */
  var unHighlightItem: js.UndefOr[js.Function0[Unit]] = js.native
}

object ISeries {
  @scala.inline
  def apply(): ISeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISeries]
  }
  @scala.inline
  implicit class ISeriesOps[Self <: ISeries] (val x: Self) extends AnyVal {
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
    def setEachRecord(value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit): Self = this.set("eachRecord", js.Any.fromFunction2(value))
    @scala.inline
    def deleteEachRecord: Self = this.set("eachRecord", js.undefined)
    @scala.inline
    def setGetItemForPoint(value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => _): Self = this.set("getItemForPoint", js.Any.fromFunction2(value))
    @scala.inline
    def deleteGetItemForPoint: Self = this.set("getItemForPoint", js.undefined)
    @scala.inline
    def setGetLegendColor(value: /* index */ js.UndefOr[js.Any] => Unit): Self = this.set("getLegendColor", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetLegendColor: Self = this.set("getLegendColor", js.undefined)
    @scala.inline
    def setGetRecordCount(value: () => Unit): Self = this.set("getRecordCount", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetRecordCount: Self = this.set("getRecordCount", js.undefined)
    @scala.inline
    def setHideAll(value: () => Unit): Self = this.set("hideAll", js.Any.fromFunction0(value))
    @scala.inline
    def deleteHideAll: Self = this.set("hideAll", js.undefined)
    @scala.inline
    def setHighlight(value: js.Any): Self = this.set("highlight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlight: Self = this.set("highlight", js.undefined)
    @scala.inline
    def setHighlightCfg(value: js.Any): Self = this.set("highlightCfg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlightCfg: Self = this.set("highlightCfg", js.undefined)
    @scala.inline
    def setHighlightItem(value: js.UndefOr[js.Any] => Unit): Self = this.set("highlightItem", js.Any.fromFunction1(value))
    @scala.inline
    def deleteHighlightItem: Self = this.set("highlightItem", js.undefined)
    @scala.inline
    def setIsExcluded(value: /* index */ js.UndefOr[js.Any] => Unit): Self = this.set("isExcluded", js.Any.fromFunction1(value))
    @scala.inline
    def deleteIsExcluded: Self = this.set("isExcluded", js.undefined)
    @scala.inline
    def setLabel(value: js.Any): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setOnCreateLabel(value: (js.UndefOr[IModel], js.UndefOr[js.Any], js.UndefOr[Double], js.UndefOr[String]) => ISprite): Self = this.set("onCreateLabel", js.Any.fromFunction4(value))
    @scala.inline
    def deleteOnCreateLabel: Self = this.set("onCreateLabel", js.undefined)
    @scala.inline
    def setOnPlaceLabel(
      value: (js.UndefOr[ISprite], js.UndefOr[IModel], js.UndefOr[js.Any], js.UndefOr[Double], js.UndefOr[String], js.UndefOr[Boolean], js.UndefOr[Double]) => Unit
    ): Self = this.set("onPlaceLabel", js.Any.fromFunction7(value))
    @scala.inline
    def deleteOnPlaceLabel: Self = this.set("onPlaceLabel", js.undefined)
    @scala.inline
    def setRenderer(value: js.Any): Self = this.set("renderer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderer: Self = this.set("renderer", js.undefined)
    @scala.inline
    def setSetTitle(value: (/* index */ js.UndefOr[Double], /* title */ js.UndefOr[String]) => Unit): Self = this.set("setTitle", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSetTitle: Self = this.set("setTitle", js.undefined)
    @scala.inline
    def setShadowAttributes(value: Array): Self = this.set("shadowAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadowAttributes: Self = this.set("shadowAttributes", js.undefined)
    @scala.inline
    def setShowAll(value: () => Unit): Self = this.set("showAll", js.Any.fromFunction0(value))
    @scala.inline
    def deleteShowAll: Self = this.set("showAll", js.undefined)
    @scala.inline
    def setShowInLegend(value: Boolean): Self = this.set("showInLegend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowInLegend: Self = this.set("showInLegend", js.undefined)
    @scala.inline
    def setTips(value: js.Any): Self = this.set("tips", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTips: Self = this.set("tips", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUnHighlightItem(value: () => Unit): Self = this.set("unHighlightItem", js.Any.fromFunction0(value))
    @scala.inline
    def deleteUnHighlightItem: Self = this.set("unHighlightItem", js.undefined)
  }
  
}


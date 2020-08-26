package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.anon.ColorCodeField
import typings.devextreme.anon.ElementModelNode
import typings.devextreme.anon.HeaderHeight
import typings.devextreme.anon.JQueryEventModelNode
import typings.devextreme.anon.ModelRoot
import typings.devextreme.anon.Rect
import typings.devextreme.anon.SelectionStyle
import typings.devextreme.devextremeStrings.ellipsis
import typings.devextreme.devextremeStrings.hide
import typings.devextreme.devextremeStrings.leftBottomRightTop
import typings.devextreme.devextremeStrings.leftTopRightBottom
import typings.devextreme.devextremeStrings.multiple
import typings.devextreme.devextremeStrings.none
import typings.devextreme.devextremeStrings.rightBottomLeftTop
import typings.devextreme.devextremeStrings.rightTopLeftBottom
import typings.devextreme.devextremeStrings.single_
import typings.devextreme.devextremeStrings.sliceanddice
import typings.devextreme.devextremeStrings.squarified
import typings.devextreme.devextremeStrings.strip
import typings.devextreme.mod.DevExpress.data.DataSource
import typings.devextreme.mod.DevExpress.data.DataSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxTreeMapOptions extends BaseWidgetOptions[dxTreeMap] {
  /** @name dxTreeMap.Options.childrenField */
  var childrenField: js.UndefOr[String] = js.native
  /** @name dxTreeMap.Options.colorField */
  var colorField: js.UndefOr[String] = js.native
  /** @name dxTreeMap.Options.colorizer */
  var colorizer: js.UndefOr[ColorCodeField] = js.native
  /** @name dxTreeMap.Options.dataSource */
  var dataSource: js.UndefOr[js.Array[_] | DataSource | DataSourceOptions | String] = js.native
  /** @name dxTreeMap.Options.group */
  var group: js.UndefOr[HeaderHeight] = js.native
  /** @name dxTreeMap.Options.hoverEnabled */
  var hoverEnabled: js.UndefOr[Boolean] = js.native
  /** @name dxTreeMap.Options.idField */
  var idField: js.UndefOr[String] = js.native
  /** @name dxTreeMap.Options.interactWithGroup */
  var interactWithGroup: js.UndefOr[Boolean] = js.native
  /** @name dxTreeMap.Options.labelField */
  var labelField: js.UndefOr[String] = js.native
  /** @name dxTreeMap.Options.layoutAlgorithm */
  var layoutAlgorithm: js.UndefOr[sliceanddice | squarified | strip | (js.Function1[/* e */ Rect, _])] = js.native
  /** @name dxTreeMap.Options.layoutDirection */
  var layoutDirection: js.UndefOr[
    leftBottomRightTop | leftTopRightBottom | rightBottomLeftTop | rightTopLeftBottom
  ] = js.native
  /** @name dxTreeMap.Options.maxDepth */
  var maxDepth: js.UndefOr[Double] = js.native
  /** @name dxTreeMap.Options.onClick */
  var onClick: js.UndefOr[(js.Function1[/* e */ JQueryEventModelNode, _]) | String] = js.native
  /** @name dxTreeMap.Options.onDrill */
  var onDrill: js.UndefOr[js.Function1[/* e */ ElementModelNode, _]] = js.native
  /** @name dxTreeMap.Options.onHoverChanged */
  var onHoverChanged: js.UndefOr[js.Function1[/* e */ ElementModelNode, _]] = js.native
  /** @name dxTreeMap.Options.onNodesInitialized */
  var onNodesInitialized: js.UndefOr[js.Function1[/* e */ ModelRoot, _]] = js.native
  /** @name dxTreeMap.Options.onNodesRendering */
  var onNodesRendering: js.UndefOr[js.Function1[/* e */ ElementModelNode, _]] = js.native
  /** @name dxTreeMap.Options.onSelectionChanged */
  var onSelectionChanged: js.UndefOr[js.Function1[/* e */ ElementModelNode, _]] = js.native
  /** @name dxTreeMap.Options.parentField */
  var parentField: js.UndefOr[String] = js.native
  /** @deprecated */
  /** @name dxTreeMap.Options.resolveLabelOverflow */
  var resolveLabelOverflow: js.UndefOr[ellipsis | hide] = js.native
  /** @name dxTreeMap.Options.selectionMode */
  var selectionMode: js.UndefOr[multiple | none | single_] = js.native
  /** @name dxTreeMap.Options.tile */
  var tile: js.UndefOr[SelectionStyle] = js.native
  /** @name dxTreeMap.Options.tooltip */
  @JSName("tooltip")
  var tooltip_dxTreeMapOptions: js.UndefOr[dxTreeMapTooltip] = js.native
  /** @name dxTreeMap.Options.valueField */
  var valueField: js.UndefOr[String] = js.native
}

object dxTreeMapOptions {
  @scala.inline
  def apply(): dxTreeMapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxTreeMapOptions]
  }
  @scala.inline
  implicit class dxTreeMapOptionsOps[Self <: dxTreeMapOptions] (val x: Self) extends AnyVal {
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
    def setChildrenField(value: String): Self = this.set("childrenField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildrenField: Self = this.set("childrenField", js.undefined)
    @scala.inline
    def setColorField(value: String): Self = this.set("colorField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorField: Self = this.set("colorField", js.undefined)
    @scala.inline
    def setColorizer(value: ColorCodeField): Self = this.set("colorizer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorizer: Self = this.set("colorizer", js.undefined)
    @scala.inline
    def setDataSourceVarargs(value: js.Any*): Self = this.set("dataSource", js.Array(value :_*))
    @scala.inline
    def setDataSource(value: js.Array[_] | DataSource | DataSourceOptions | String): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    @scala.inline
    def setGroup(value: HeaderHeight): Self = this.set("group", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    @scala.inline
    def setHoverEnabled(value: Boolean): Self = this.set("hoverEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHoverEnabled: Self = this.set("hoverEnabled", js.undefined)
    @scala.inline
    def setIdField(value: String): Self = this.set("idField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdField: Self = this.set("idField", js.undefined)
    @scala.inline
    def setInteractWithGroup(value: Boolean): Self = this.set("interactWithGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInteractWithGroup: Self = this.set("interactWithGroup", js.undefined)
    @scala.inline
    def setLabelField(value: String): Self = this.set("labelField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelField: Self = this.set("labelField", js.undefined)
    @scala.inline
    def setLayoutAlgorithmFunction1(value: /* e */ Rect => _): Self = this.set("layoutAlgorithm", js.Any.fromFunction1(value))
    @scala.inline
    def setLayoutAlgorithm(value: sliceanddice | squarified | strip | (js.Function1[/* e */ Rect, _])): Self = this.set("layoutAlgorithm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayoutAlgorithm: Self = this.set("layoutAlgorithm", js.undefined)
    @scala.inline
    def setLayoutDirection(value: leftBottomRightTop | leftTopRightBottom | rightBottomLeftTop | rightTopLeftBottom): Self = this.set("layoutDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayoutDirection: Self = this.set("layoutDirection", js.undefined)
    @scala.inline
    def setMaxDepth(value: Double): Self = this.set("maxDepth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxDepth: Self = this.set("maxDepth", js.undefined)
    @scala.inline
    def setOnClickFunction1(value: /* e */ JQueryEventModelNode => _): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def setOnClick(value: (js.Function1[/* e */ JQueryEventModelNode, _]) | String): Self = this.set("onClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setOnDrill(value: /* e */ ElementModelNode => _): Self = this.set("onDrill", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDrill: Self = this.set("onDrill", js.undefined)
    @scala.inline
    def setOnHoverChanged(value: /* e */ ElementModelNode => _): Self = this.set("onHoverChanged", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnHoverChanged: Self = this.set("onHoverChanged", js.undefined)
    @scala.inline
    def setOnNodesInitialized(value: /* e */ ModelRoot => _): Self = this.set("onNodesInitialized", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnNodesInitialized: Self = this.set("onNodesInitialized", js.undefined)
    @scala.inline
    def setOnNodesRendering(value: /* e */ ElementModelNode => _): Self = this.set("onNodesRendering", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnNodesRendering: Self = this.set("onNodesRendering", js.undefined)
    @scala.inline
    def setOnSelectionChanged(value: /* e */ ElementModelNode => _): Self = this.set("onSelectionChanged", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSelectionChanged: Self = this.set("onSelectionChanged", js.undefined)
    @scala.inline
    def setParentField(value: String): Self = this.set("parentField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentField: Self = this.set("parentField", js.undefined)
    @scala.inline
    def setResolveLabelOverflow(value: ellipsis | hide): Self = this.set("resolveLabelOverflow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolveLabelOverflow: Self = this.set("resolveLabelOverflow", js.undefined)
    @scala.inline
    def setSelectionMode(value: multiple | none | single_): Self = this.set("selectionMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionMode: Self = this.set("selectionMode", js.undefined)
    @scala.inline
    def setTile(value: SelectionStyle): Self = this.set("tile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTile: Self = this.set("tile", js.undefined)
    @scala.inline
    def setTooltip(value: dxTreeMapTooltip): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    @scala.inline
    def setValueField(value: String): Self = this.set("valueField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueField: Self = this.set("valueField", js.undefined)
  }
  
}


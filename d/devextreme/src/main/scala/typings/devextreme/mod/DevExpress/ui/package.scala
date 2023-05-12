package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.AllDay
import typings.devextreme.mod.DevExpress.DOMComponent
import typings.devextreme.mod.DevExpress.DOMComponentOptions
import typings.devextreme.mod.DevExpress.ExternalFormat
import typings.devextreme.mod.DevExpress.common.grids.ColumnBase
import typings.devextreme.mod.DevExpress.common.grids.ColumnButtonBase
import typings.devextreme.mod.DevExpress.common.grids.EditingBase
import typings.devextreme.mod.DevExpress.common.grids.EditingTextsBase
import typings.devextreme.mod.DevExpress.common.grids.PagingBase
import typings.devextreme.mod.DevExpress.common.grids.ScrollingBase
import typings.devextreme.mod.DevExpress.common.grids.SelectionBase
import typings.devextreme.mod.DevExpress.core.template
import typings.devextreme.mod.DevExpress.ui.CollectionWidget.ItemLike
import typings.devextreme.mod.DevExpress.ui.dxDataGrid.Editing
import typings.devextreme.mod.DevExpress.ui.dxDataGrid.Scrolling
import typings.devextreme.mod.DevExpress.ui.dxDataGrid.Selection
import typings.devextreme.mod.DevExpress.ui.dxTreeList.EditingTexts
import typings.devextreme.mod.DevExpress.ui.dxTreeList.Node
import typings.devextreme.mod.DevExpress.ui.dxTreeList.Paging
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AsyncRule = typings.devextreme.mod.DevExpress.common.AsyncRule

type CollectionWidgetItemTemplate = CollectionWidgetItem

type CompareRule = typings.devextreme.mod.DevExpress.common.CompareRule

type CustomRule = typings.devextreme.mod.DevExpress.common.CustomRule

type DataExpressionMixinItemTemplate = CollectionWidgetItem

type EmailRule = typings.devextreme.mod.DevExpress.common.EmailRule

/* Rewritten from type alias, can be one of: 
  - typings.devextreme.mod.DevExpress.FormatObject
  - typings.devextreme.mod.DevExpress.common.Format
  - java.lang.String
  - js.Function1[js.Date | scala.Double, java.lang.String]
  - typings.devextreme.mod.DevExpress.ExternalFormat
*/
type Format = _Format | (js.Function1[js.Date | Double, String]) | String | ExternalFormat

type GridBase[TRowData, TKey] = typings.devextreme.mod.DevExpress.common.grids.GridBase[TRowData, TKey]

type GridBaseColumn[TRowData] = ColumnBase[TRowData]

type GridBaseColumnButton = ColumnButtonBase

type GridBaseEditing[TRowData, TKey] = EditingBase[TRowData, TKey]

type GridBaseEditingTexts = EditingTextsBase

type GridBasePaging = PagingBase

type GridBaseScrolling = ScrollingBase

type GridBaseSelection = SelectionBase

type HierarchicalCollectionWidget[TProperties /* <: HierarchicalCollectionWidgetOptions[Any, TItem, TKey] */, TItem /* <: ItemLike */, TKey] = CollectionWidget[TProperties, TItem, TKey]

type NumericRule = typings.devextreme.mod.DevExpress.common.NumericRule

type PatternRule = typings.devextreme.mod.DevExpress.common.PatternRule

type RangeRule = typings.devextreme.mod.DevExpress.common.RangeRule

type RequiredRule = typings.devextreme.mod.DevExpress.common.RequiredRule

type StringLengthRule = typings.devextreme.mod.DevExpress.common.StringLengthRule

type Template = template

type ValidationCallbackData = typings.devextreme.mod.DevExpress.common.ValidationCallbackData

type ValidationRule = typings.devextreme.mod.DevExpress.common.ValidationRule

type ValidationRuleType = typings.devextreme.mod.DevExpress.common.ValidationRuleType

type dxAccordionItemTemplate = dxAccordionItem

type dxActionSheetItemTemplate = dxActionSheetItem[Any]

type dxAutocomplete = dxDropDownList[dxAutocompleteOptions]

type dxBox[TItem /* <: typings.devextreme.mod.DevExpress.ui.dxBox.ItemLike[TKey] */, TKey] = CollectionWidget[dxBoxOptions[TItem, TKey], TItem, TKey]

type dxBoxItemTemplate = dxBoxItem[Any]

type dxButton = Widget[dxButtonOptions]

type dxButtonGroup = Widget[dxButtonGroupOptions]

type dxCalendar = Editor[dxCalendarOptions]

type dxColorBox = dxDropDownEditor[dxColorBoxOptions]

type dxContextMenuItemTemplate = dxContextMenuItem

type dxDataGridEditing[TRowData, TKey] = Editing[TRowData, TKey]

type dxDataGridScrolling = Scrolling

type dxDataGridSelection = Selection

type dxDeferRendering = Widget[dxDeferRenderingOptions]

type dxGalleryItemTemplate = dxGalleryItem

type dxListItemTemplate = dxListItem

type dxLoadIndicator = Widget[dxLoadIndicatorOptions]

type dxLoadPanel = dxOverlay[dxLoadPanelOptions]

type dxLookup = dxDropDownList[dxLookupOptions]

type dxMenu[TKey] = dxMenuBase[dxMenuOptions[TKey], dxMenuItem, TKey]

type dxMenuBaseItemTemplate = dxMenuBaseItem

type dxMenuItemTemplate = dxMenuItem

type dxMultiView[TProperties /* <: dxMultiViewOptions[TItem, TKey] */, TItem /* <: typings.devextreme.mod.DevExpress.ui.dxMultiView.ItemLike */, TKey] = CollectionWidget[TProperties, TItem, TKey]

type dxMultiViewItem = CollectionWidgetItem

type dxMultiViewItemTemplate = dxMultiViewItem

type dxNumberBox = dxTextEditor[dxNumberBoxOptions]

type dxPopup[TProperties] = dxOverlay[TProperties]

type dxProgressBar = dxTrackBar[dxProgressBarOptions]

type dxRangeSlider = dxTrackBar[dxRangeSliderOptions]

type dxRecurrenceEditor = Editor[dxRecurrenceEditorOptions]

type dxResizable = DOMComponent[dxResizableOptions]

type dxResponsiveBox[TItem /* <: typings.devextreme.mod.DevExpress.ui.dxResponsiveBox.ItemLike */, TKey] = CollectionWidget[dxResponsiveBoxOptions[TItem, TKey], TItem, TKey]

type dxResponsiveBoxItemTemplate = dxResponsiveBoxItem

type dxSchedulerAppointment = CollectionWidgetItem & AllDay & (Record[String, Any])

type dxSchedulerAppointmentTemplate = dxSchedulerAppointment

type dxSelectBox[TProperties] = dxDropDownList[TProperties]

type dxSlider = dxTrackBar[dxSliderOptions]

type dxSpeedDialAction = Widget[dxSpeedDialActionOptions]

type dxSwitch = Editor[dxSwitchOptions]

type dxTabPanel[TItem /* <: typings.devextreme.mod.DevExpress.ui.dxTabPanel.ItemLike */, TKey] = dxMultiView[dxTabPanelOptions[TItem, TKey], TItem, TKey]

type dxTabPanelItemTemplate = dxTabPanelItem

type dxTabs[TProperties /* <: dxTabsOptions[TItem, TKey] */, TItem /* <: typings.devextreme.mod.DevExpress.ui.dxTabs.ItemLike */, TKey] = CollectionWidget[TProperties, TItem, TKey]

type dxTabsItemTemplate = dxTabsItem

type dxTagBox = dxSelectBox[dxTagBoxOptions]

type dxTextArea = dxTextBox[dxTextAreaOptions]

type dxTextBox[TProperties] = dxTextEditor[TProperties]

type dxTileViewItemTemplate = dxTileViewItem

type dxToast = dxOverlay[dxToastOptions]

type dxToolbar[TItem /* <: typings.devextreme.mod.DevExpress.ui.dxToolbar.ItemLike */, TKey] = CollectionWidget[dxToolbarOptions[TItem, TKey], TItem, TKey]

type dxToolbarItemTemplate = dxToolbarItem

type dxTooltip = dxPopover[dxTooltipOptions]

type dxTrackBar[TProperties] = Editor[TProperties]

type dxTreeListEditing[TRowData, TKey] = typings.devextreme.mod.DevExpress.ui.dxTreeList.Editing[TRowData, TKey]

type dxTreeListEditingTexts = EditingTexts

type dxTreeListNode[TRowData, TKey] = Node[TRowData, TKey]

type dxTreeListPaging = Paging

type dxTreeListScrolling = typings.devextreme.mod.DevExpress.ui.dxTreeList.Scrolling

type dxTreeListSelection = typings.devextreme.mod.DevExpress.ui.dxTreeList.Selection

type dxTreeViewItemTemplate = dxTreeViewItem

type dxValidationGroupOptions = DOMComponentOptions[dxValidationGroup]

type dxValidationMessage = dxOverlay[dxValidationMessageOptions]

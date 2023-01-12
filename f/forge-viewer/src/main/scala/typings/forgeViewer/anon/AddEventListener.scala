package typings.forgeViewer.anon

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddEventListener extends StObject {
  
  var addEventListener: js.UndefOr[
    js.Function3[
      /* type */ String, 
      /* callback */ js.Function1[/* event */ Any, Unit], 
      /* options */ js.UndefOr[Any], 
      Any
    ]
  ] = js.undefined
  
  var addFooter: js.UndefOr[Boolean] = js.undefined
  
  var container: js.UndefOr[HTMLElement] = js.undefined
  
  var defaultTile: js.UndefOr[String] = js.undefined
  
  var docStructureConfig: js.UndefOr[Any] = js.undefined
  
  var excludeRoot: js.UndefOr[Boolean] = js.undefined
  
  var getAggregateHiddenNodes: js.UndefOr[js.Function0[js.Array[Any]]] = js.undefined
  
  var getAggregateIsolation: js.UndefOr[js.Function0[js.Array[Any]]] = js.undefined
  
  var getAggregateSelection: js.UndefOr[js.Function1[/* callback */ Any, js.Array[Any]]] = js.undefined
  
  var heightAdjustment: js.UndefOr[Double] = js.undefined
  
  var hideSearch: js.UndefOr[Boolean] = js.undefined
  
  var maxHeight: js.UndefOr[String] = js.undefined
  
  var onDeselectAll: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onFocus: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onHide: js.UndefOr[
    js.Function2[/* dbId */ Double, /* model */ typings.forgeViewer.Autodesk.Viewing.Model, Unit]
  ] = js.undefined
  
  var onIsolate: js.UndefOr[
    js.Function2[/* dbId */ Double, /* model */ typings.forgeViewer.Autodesk.Viewing.Model, Unit]
  ] = js.undefined
  
  var onSearchSelected: js.UndefOr[js.Function1[/* event */ Any, Unit]] = js.undefined
  
  var onSelectOnly: js.UndefOr[
    js.Function2[/* dbId */ Double, /* model */ typings.forgeViewer.Autodesk.Viewing.Model, Unit]
  ] = js.undefined
  
  var onSelectToggle: js.UndefOr[
    js.Function2[/* dbId */ Double, /* model */ typings.forgeViewer.Autodesk.Viewing.Model, Unit]
  ] = js.undefined
  
  var onShow: js.UndefOr[
    js.Function2[/* dbId */ Double, /* model */ typings.forgeViewer.Autodesk.Viewing.Model, Unit]
  ] = js.undefined
  
  var onShowAll: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onToggleMultipleOverlayedSelection: js.UndefOr[js.Function1[/* selection */ Any, Unit]] = js.undefined
  
  var onToggleOverlayedSelection: js.UndefOr[
    js.Function3[
      /* dbId */ Double, 
      /* model */ typings.forgeViewer.Autodesk.Viewing.Model, 
      /* isSelected */ Boolean, 
      Unit
    ]
  ] = js.undefined
  
  var onToggleVisibility: js.UndefOr[
    js.Function2[/* dbId */ Double, /* model */ typings.forgeViewer.Autodesk.Viewing.Model, Unit]
  ] = js.undefined
  
  var onUnInitialize: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onVisibilityIconClick: js.UndefOr[
    js.Function2[/* dbId */ Double, /* model */ typings.forgeViewer.Autodesk.Viewing.Model, Unit]
  ] = js.undefined
  
  var removeEventListener: js.UndefOr[
    js.Function2[/* type */ String, /* callback */ js.Function1[/* event */ Any, Unit], Any]
  ] = js.undefined
  
  var scrollEaseCurve: js.UndefOr[js.Array[Double]] = js.undefined
  
  var scrollEaseSpeed: js.UndefOr[Double] = js.undefined
  
  var startCollapsed: js.UndefOr[Boolean] = js.undefined
}
object AddEventListener {
  
  inline def apply(): AddEventListener = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddEventListener]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddEventListener] (val x: Self) extends AnyVal {
    
    inline def setAddEventListener(
      value: (/* type */ String, /* callback */ js.Function1[/* event */ Any, Unit], /* options */ js.UndefOr[Any]) => Any
    ): Self = StObject.set(x, "addEventListener", js.Any.fromFunction3(value))
    
    inline def setAddEventListenerUndefined: Self = StObject.set(x, "addEventListener", js.undefined)
    
    inline def setAddFooter(value: Boolean): Self = StObject.set(x, "addFooter", value.asInstanceOf[js.Any])
    
    inline def setAddFooterUndefined: Self = StObject.set(x, "addFooter", js.undefined)
    
    inline def setContainer(value: HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setDefaultTile(value: String): Self = StObject.set(x, "defaultTile", value.asInstanceOf[js.Any])
    
    inline def setDefaultTileUndefined: Self = StObject.set(x, "defaultTile", js.undefined)
    
    inline def setDocStructureConfig(value: Any): Self = StObject.set(x, "docStructureConfig", value.asInstanceOf[js.Any])
    
    inline def setDocStructureConfigUndefined: Self = StObject.set(x, "docStructureConfig", js.undefined)
    
    inline def setExcludeRoot(value: Boolean): Self = StObject.set(x, "excludeRoot", value.asInstanceOf[js.Any])
    
    inline def setExcludeRootUndefined: Self = StObject.set(x, "excludeRoot", js.undefined)
    
    inline def setGetAggregateHiddenNodes(value: () => js.Array[Any]): Self = StObject.set(x, "getAggregateHiddenNodes", js.Any.fromFunction0(value))
    
    inline def setGetAggregateHiddenNodesUndefined: Self = StObject.set(x, "getAggregateHiddenNodes", js.undefined)
    
    inline def setGetAggregateIsolation(value: () => js.Array[Any]): Self = StObject.set(x, "getAggregateIsolation", js.Any.fromFunction0(value))
    
    inline def setGetAggregateIsolationUndefined: Self = StObject.set(x, "getAggregateIsolation", js.undefined)
    
    inline def setGetAggregateSelection(value: /* callback */ Any => js.Array[Any]): Self = StObject.set(x, "getAggregateSelection", js.Any.fromFunction1(value))
    
    inline def setGetAggregateSelectionUndefined: Self = StObject.set(x, "getAggregateSelection", js.undefined)
    
    inline def setHeightAdjustment(value: Double): Self = StObject.set(x, "heightAdjustment", value.asInstanceOf[js.Any])
    
    inline def setHeightAdjustmentUndefined: Self = StObject.set(x, "heightAdjustment", js.undefined)
    
    inline def setHideSearch(value: Boolean): Self = StObject.set(x, "hideSearch", value.asInstanceOf[js.Any])
    
    inline def setHideSearchUndefined: Self = StObject.set(x, "hideSearch", js.undefined)
    
    inline def setMaxHeight(value: String): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    inline def setOnDeselectAll(value: () => Unit): Self = StObject.set(x, "onDeselectAll", js.Any.fromFunction0(value))
    
    inline def setOnDeselectAllUndefined: Self = StObject.set(x, "onDeselectAll", js.undefined)
    
    inline def setOnFocus(value: () => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction0(value))
    
    inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    inline def setOnHide(value: (/* dbId */ Double, /* model */ typings.forgeViewer.Autodesk.Viewing.Model) => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction2(value))
    
    inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
    
    inline def setOnIsolate(value: (/* dbId */ Double, /* model */ typings.forgeViewer.Autodesk.Viewing.Model) => Unit): Self = StObject.set(x, "onIsolate", js.Any.fromFunction2(value))
    
    inline def setOnIsolateUndefined: Self = StObject.set(x, "onIsolate", js.undefined)
    
    inline def setOnSearchSelected(value: /* event */ Any => Unit): Self = StObject.set(x, "onSearchSelected", js.Any.fromFunction1(value))
    
    inline def setOnSearchSelectedUndefined: Self = StObject.set(x, "onSearchSelected", js.undefined)
    
    inline def setOnSelectOnly(value: (/* dbId */ Double, /* model */ typings.forgeViewer.Autodesk.Viewing.Model) => Unit): Self = StObject.set(x, "onSelectOnly", js.Any.fromFunction2(value))
    
    inline def setOnSelectOnlyUndefined: Self = StObject.set(x, "onSelectOnly", js.undefined)
    
    inline def setOnSelectToggle(value: (/* dbId */ Double, /* model */ typings.forgeViewer.Autodesk.Viewing.Model) => Unit): Self = StObject.set(x, "onSelectToggle", js.Any.fromFunction2(value))
    
    inline def setOnSelectToggleUndefined: Self = StObject.set(x, "onSelectToggle", js.undefined)
    
    inline def setOnShow(value: (/* dbId */ Double, /* model */ typings.forgeViewer.Autodesk.Viewing.Model) => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction2(value))
    
    inline def setOnShowAll(value: () => Unit): Self = StObject.set(x, "onShowAll", js.Any.fromFunction0(value))
    
    inline def setOnShowAllUndefined: Self = StObject.set(x, "onShowAll", js.undefined)
    
    inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
    
    inline def setOnToggleMultipleOverlayedSelection(value: /* selection */ Any => Unit): Self = StObject.set(x, "onToggleMultipleOverlayedSelection", js.Any.fromFunction1(value))
    
    inline def setOnToggleMultipleOverlayedSelectionUndefined: Self = StObject.set(x, "onToggleMultipleOverlayedSelection", js.undefined)
    
    inline def setOnToggleOverlayedSelection(
      value: (/* dbId */ Double, /* model */ typings.forgeViewer.Autodesk.Viewing.Model, /* isSelected */ Boolean) => Unit
    ): Self = StObject.set(x, "onToggleOverlayedSelection", js.Any.fromFunction3(value))
    
    inline def setOnToggleOverlayedSelectionUndefined: Self = StObject.set(x, "onToggleOverlayedSelection", js.undefined)
    
    inline def setOnToggleVisibility(value: (/* dbId */ Double, /* model */ typings.forgeViewer.Autodesk.Viewing.Model) => Unit): Self = StObject.set(x, "onToggleVisibility", js.Any.fromFunction2(value))
    
    inline def setOnToggleVisibilityUndefined: Self = StObject.set(x, "onToggleVisibility", js.undefined)
    
    inline def setOnUnInitialize(value: () => Unit): Self = StObject.set(x, "onUnInitialize", js.Any.fromFunction0(value))
    
    inline def setOnUnInitializeUndefined: Self = StObject.set(x, "onUnInitialize", js.undefined)
    
    inline def setOnVisibilityIconClick(value: (/* dbId */ Double, /* model */ typings.forgeViewer.Autodesk.Viewing.Model) => Unit): Self = StObject.set(x, "onVisibilityIconClick", js.Any.fromFunction2(value))
    
    inline def setOnVisibilityIconClickUndefined: Self = StObject.set(x, "onVisibilityIconClick", js.undefined)
    
    inline def setRemoveEventListener(value: (/* type */ String, /* callback */ js.Function1[/* event */ Any, Unit]) => Any): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction2(value))
    
    inline def setRemoveEventListenerUndefined: Self = StObject.set(x, "removeEventListener", js.undefined)
    
    inline def setScrollEaseCurve(value: js.Array[Double]): Self = StObject.set(x, "scrollEaseCurve", value.asInstanceOf[js.Any])
    
    inline def setScrollEaseCurveUndefined: Self = StObject.set(x, "scrollEaseCurve", js.undefined)
    
    inline def setScrollEaseCurveVarargs(value: Double*): Self = StObject.set(x, "scrollEaseCurve", js.Array(value*))
    
    inline def setScrollEaseSpeed(value: Double): Self = StObject.set(x, "scrollEaseSpeed", value.asInstanceOf[js.Any])
    
    inline def setScrollEaseSpeedUndefined: Self = StObject.set(x, "scrollEaseSpeed", js.undefined)
    
    inline def setStartCollapsed(value: Boolean): Self = StObject.set(x, "startCollapsed", value.asInstanceOf[js.Any])
    
    inline def setStartCollapsedUndefined: Self = StObject.set(x, "startCollapsed", js.undefined)
  }
}

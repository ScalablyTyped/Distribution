package typings.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PivotSchemaDesigner extends Widget_ {
  
  var defaults: Model = js.native
  
  /** Performs an asynchronous HTTP (AJAX) request.
    * @returns {void}
    */
  def doAjaxPost(): Unit = js.native
  
  @JSName("model")
  var model_PivotSchemaDesigner: Model = js.native
  
  /** Re-renders the control with the data source bound to the pivot control at that instant.
    * @returns {void}
    */
  def refreshControl(): Unit = js.native
}
object PivotSchemaDesigner {
  
  @js.native
  sealed trait Layouts extends StObject
  @JSGlobal("ej.PivotSchemaDesigner.Layouts")
  @js.native
  object Layouts extends StObject {
    
    ///To set the layout as same in the Excel.
    @js.native
    sealed trait Excel extends Layouts
    
    ///To set normal layout for Field List.
    @js.native
    sealed trait Normal extends Layouts
    
    ///To set layout with the axes one above the other.
    @js.native
    sealed trait OneByOne extends Layouts
  }
  
  @js.native
  trait AfterServiceInvokeEventArgs extends StObject {
    
    /** returns the current action of PivotSchemaDesigner control.
      */
    var action: js.UndefOr[String] = js.native
    
    /** returns the custom object bound with PivotSchemaDesigner control.
      */
    var customObject: js.UndefOr[js.Any] = js.native
    
    /** returns the HTML element of PivotSchemaDesigner control.
      */
    var element: js.UndefOr[js.Any] = js.native
  }
  object AfterServiceInvokeEventArgs {
    
    @scala.inline
    def apply(): AfterServiceInvokeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AfterServiceInvokeEventArgs]
    }
    
    @scala.inline
    implicit class AfterServiceInvokeEventArgsMutableBuilder[Self <: AfterServiceInvokeEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      @scala.inline
      def setCustomObject(value: js.Any): Self = StObject.set(x, "customObject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomObjectUndefined: Self = StObject.set(x, "customObject", js.undefined)
      
      @scala.inline
      def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    }
  }
  
  @js.native
  trait BeforeServiceInvokeEventArgs extends StObject {
    
    /** returns the current action of PivotSchemaDesigner control.
      */
    var action: js.UndefOr[String] = js.native
    
    /** returns the custom object bound with PivotSchemaDesigner control.
      */
    var customObject: js.UndefOr[js.Any] = js.native
    
    /** returns the HTML element of PivotSchemaDesigner control.
      */
    var element: js.UndefOr[js.Any] = js.native
  }
  object BeforeServiceInvokeEventArgs {
    
    @scala.inline
    def apply(): BeforeServiceInvokeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforeServiceInvokeEventArgs]
    }
    
    @scala.inline
    implicit class BeforeServiceInvokeEventArgsMutableBuilder[Self <: BeforeServiceInvokeEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      @scala.inline
      def setCustomObject(value: js.Any): Self = StObject.set(x, "customObject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomObjectUndefined: Self = StObject.set(x, "customObject", js.undefined)
      
      @scala.inline
      def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    }
  }
  
  @js.native
  trait DragMoveEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the HTML element of the dragged field from PivotSchemaDesigner.
      */
    var dragTarget: js.UndefOr[js.Any] = js.native
    
    /** return the JSON details of the dragged field.
      */
    var draggedElementData: js.UndefOr[js.Any] = js.native
    
    /** returns the PivotSchemaDesigner model
      */
    var model: js.UndefOr[js.Any] = js.native
  }
  object DragMoveEventArgs {
    
    @scala.inline
    def apply(): DragMoveEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DragMoveEventArgs]
    }
    
    @scala.inline
    implicit class DragMoveEventArgsMutableBuilder[Self <: DragMoveEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setDragTarget(value: js.Any): Self = StObject.set(x, "dragTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragTargetUndefined: Self = StObject.set(x, "dragTarget", js.undefined)
      
      @scala.inline
      def setDraggedElementData(value: js.Any): Self = StObject.set(x, "draggedElementData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggedElementDataUndefined: Self = StObject.set(x, "draggedElementData", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    }
  }
  
  @js.native
  trait LoadEventArgs extends StObject {
    
    /** returns the HTML element of PivotSchemaDesigner control.
      */
    var element: js.UndefOr[js.Any] = js.native
  }
  object LoadEventArgs {
    
    @scala.inline
    def apply(): LoadEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoadEventArgs]
    }
    
    @scala.inline
    implicit class LoadEventArgsMutableBuilder[Self <: LoadEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    }
  }
  
  @js.native
  trait Model extends StObject {
    
    /** Triggers when it reaches client-side after any AJAX request.
      */
    var afterServiceInvoke: js.UndefOr[js.Function1[/* e */ AfterServiceInvokeEventArgs, Unit]] = js.native
    
    /** Triggers before any AJAX request is passed from PivotSchemaDesigner to service methods.
      */
    var beforeServiceInvoke: js.UndefOr[js.Function1[/* e */ BeforeServiceInvokeEventArgs, Unit]] = js.native
    
    /** Specifies the CSS class to PivotSchemaDesigner to achieve custom theme.
      * @Default {â€œâ€}
      */
    var cssClass: js.UndefOr[String] = js.native
    
    /** Object utilized to pass additional information between client-end and service-end.
      * @Default {{}}
      */
    var customObject: js.UndefOr[js.Any] = js.native
    
    /** Triggers when we start dragging any field from PivotSchemaDesigner.
      */
    var dragMove: js.UndefOr[js.Function1[/* e */ DragMoveEventArgs, Unit]] = js.native
    
    /** Allows the user to enable/disable drag and drop operations within the PivotTable Field List.
      * @Default {true}
      */
    var enableDragDrop: js.UndefOr[Boolean] = js.native
    
    /** Allows the user to view PivotTable Field List from right to left.
      * @Default {false}
      */
    var enableRTL: js.UndefOr[Boolean] = js.native
    
    /** For ASP.NET and MVC Wrapper, PivotSchemaDesigner will be initialized and rendered empty initially. Once the connected pivot control widget is rendered completely,
      * PivotSchemaDesigner will just be populated with data source by setting this property to â€œtrueâ€.
      * @Default {false}
      */
    var enableWrapper: js.UndefOr[Boolean] = js.native
    
    /** Sets the height for PivotSchemaDesigner.
      * @Default {â€œâ€}
      */
    var height: js.UndefOr[String] = js.native
    
    /** Sets the layout for PivotSchemaDesigner.
      * @Default {ej.PivotSchemaDesigner.Layouts.Excel}
      */
    var layout: js.UndefOr[Layouts | String] = js.native
    
    /** Triggers when PivotSchemaDesigner loading is initiated.
      */
    var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, Unit]] = js.native
    
    /** Allows the user to set the localized language for the widget.
      * @Default {en-US}
      */
    var locale: js.UndefOr[String] = js.native
    
    /** Sets the visibility of OLAP elements in PivotTable Field List. This is only applicable for OLAP datasource.
      * @Default {null}
      */
    var olap: js.UndefOr[Olap] = js.native
    
    /** Sets the Pivot control bound with this PivotSchemaDesigner.
      * @Default {null}
      */
    var pivotControl: js.UndefOr[js.Any] = js.native
    
    /** Allows the user to set custom name for the methods at service-end, communicated during AJAX post.
      * @Default {{}}
      */
    var serviceMethods: js.UndefOr[js.Any] = js.native
    
    /** Connects the service using the specified URL for any server updates.
      * @Default {â€œâ€}
      */
    var url: js.UndefOr[String] = js.native
    
    /** Sets the width for PivotSchemaDesigner.
      * @Default {â€œâ€}
      */
    var width: js.UndefOr[String] = js.native
  }
  object Model {
    
    @scala.inline
    def apply(): typings.ejWebAll.ej.PivotSchemaDesigner.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.PivotSchemaDesigner.Model]
    }
    
    @scala.inline
    implicit class ModelMutableBuilder[Self <: typings.ejWebAll.ej.PivotSchemaDesigner.Model] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterServiceInvoke(value: /* e */ AfterServiceInvokeEventArgs => Unit): Self = StObject.set(x, "afterServiceInvoke", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAfterServiceInvokeUndefined: Self = StObject.set(x, "afterServiceInvoke", js.undefined)
      
      @scala.inline
      def setBeforeServiceInvoke(value: /* e */ BeforeServiceInvokeEventArgs => Unit): Self = StObject.set(x, "beforeServiceInvoke", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforeServiceInvokeUndefined: Self = StObject.set(x, "beforeServiceInvoke", js.undefined)
      
      @scala.inline
      def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      @scala.inline
      def setCustomObject(value: js.Any): Self = StObject.set(x, "customObject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomObjectUndefined: Self = StObject.set(x, "customObject", js.undefined)
      
      @scala.inline
      def setDragMove(value: /* e */ DragMoveEventArgs => Unit): Self = StObject.set(x, "dragMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDragMoveUndefined: Self = StObject.set(x, "dragMove", js.undefined)
      
      @scala.inline
      def setEnableDragDrop(value: Boolean): Self = StObject.set(x, "enableDragDrop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableDragDropUndefined: Self = StObject.set(x, "enableDragDrop", js.undefined)
      
      @scala.inline
      def setEnableRTL(value: Boolean): Self = StObject.set(x, "enableRTL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableRTLUndefined: Self = StObject.set(x, "enableRTL", js.undefined)
      
      @scala.inline
      def setEnableWrapper(value: Boolean): Self = StObject.set(x, "enableWrapper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableWrapperUndefined: Self = StObject.set(x, "enableWrapper", js.undefined)
      
      @scala.inline
      def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setLayout(value: Layouts | String): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      @scala.inline
      def setLoad(value: /* e */ LoadEventArgs => Unit): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setOlap(value: Olap): Self = StObject.set(x, "olap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOlapUndefined: Self = StObject.set(x, "olap", js.undefined)
      
      @scala.inline
      def setPivotControl(value: js.Any): Self = StObject.set(x, "pivotControl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPivotControlUndefined: Self = StObject.set(x, "pivotControl", js.undefined)
      
      @scala.inline
      def setServiceMethods(value: js.Any): Self = StObject.set(x, "serviceMethods", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceMethodsUndefined: Self = StObject.set(x, "serviceMethods", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      @scala.inline
      def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait Olap extends StObject {
    
    /** Allows the user to view the KPI elements in tree-view inside PivotTable Field List. This is only applicable for OLAP datasource.
      * @Default {false}
      */
    var showKPI: js.UndefOr[Boolean] = js.native
    
    /** Allows the user to view the named sets in tree-view inside PivotTable Field List. This is only applicable for OLAP datasource.
      * @Default {false}
      */
    var showNamedSets: js.UndefOr[Boolean] = js.native
  }
  object Olap {
    
    @scala.inline
    def apply(): Olap = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Olap]
    }
    
    @scala.inline
    implicit class OlapMutableBuilder[Self <: Olap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setShowKPI(value: Boolean): Self = StObject.set(x, "showKPI", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowKPIUndefined: Self = StObject.set(x, "showKPI", js.undefined)
      
      @scala.inline
      def setShowNamedSets(value: Boolean): Self = StObject.set(x, "showNamedSets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowNamedSetsUndefined: Self = StObject.set(x, "showNamedSets", js.undefined)
    }
  }
}

package typings.extjs.Ext.layout.component

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object field {
  
  trait Field extends StObject
  
  type IComboBox = ITrigger
  
  trait IField
    extends StObject
       with IAuto {
    
    /** [Method] Called before any calculation cycles to reset DOM values and prepare for calculation
      * @param ownerContext Object
      */
    @JSName("beginLayoutCycle")
    var beginLayoutCycle_IField: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] Called before any calculation cycles to prepare for layout
      * @param ownerContext Object
      */
    @JSName("beginLayout")
    var beginLayout_IField: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Property] (Object) */
    var elementId: js.UndefOr[js.Any] = js.undefined
    
    /** [Property] (Object) */
    var errorStrategies: js.UndefOr[js.Any] = js.undefined
    
    /** [Method] Return the set of strategy functions from the errorStrategies collection that is appropriate for the field s msgTarge  */
    var getErrorStrategy: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Method] Return the set of strategy functions from the labelStrategies collection that is appropriate for the field s labelAli  */
    var getLabelStrategy: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Property] (Object) */
    var labelStrategies: js.UndefOr[js.Any] = js.undefined
    
    /** [Property] (Object) */
    var left: js.UndefOr[js.Any] = js.undefined
    
    /** [Property] (Object) */
    var qtip: js.UndefOr[js.Any] = js.undefined
    
    /** [Property] (Object) */
    var right: js.UndefOr[js.Any] = js.undefined
    
    /** [Property] (Object) */
    var side: js.UndefOr[js.Any] = js.undefined
    
    /** [Property] (Object) */
    var title: js.UndefOr[js.Any] = js.undefined
    
    /** [Property] (Object) */
    var top: js.UndefOr[js.Any] = js.undefined
    
    /** [Property] (Object) */
    var under: js.UndefOr[js.Any] = js.undefined
  }
  object IField {
    
    @scala.inline
    def apply(): IField = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IField]
    }
    
    @scala.inline
    implicit class IFieldMutableBuilder[Self <: IField] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBeginLayout(value: /* ownerContext */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "beginLayout", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeginLayoutCycle(value: /* ownerContext */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "beginLayoutCycle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeginLayoutCycleUndefined: Self = StObject.set(x, "beginLayoutCycle", js.undefined)
      
      @scala.inline
      def setBeginLayoutUndefined: Self = StObject.set(x, "beginLayout", js.undefined)
      
      @scala.inline
      def setElementId(value: js.Any): Self = StObject.set(x, "elementId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementIdUndefined: Self = StObject.set(x, "elementId", js.undefined)
      
      @scala.inline
      def setErrorStrategies(value: js.Any): Self = StObject.set(x, "errorStrategies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorStrategiesUndefined: Self = StObject.set(x, "errorStrategies", js.undefined)
      
      @scala.inline
      def setGetErrorStrategy(value: () => Unit): Self = StObject.set(x, "getErrorStrategy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetErrorStrategyUndefined: Self = StObject.set(x, "getErrorStrategy", js.undefined)
      
      @scala.inline
      def setGetLabelStrategy(value: () => Unit): Self = StObject.set(x, "getLabelStrategy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetLabelStrategyUndefined: Self = StObject.set(x, "getLabelStrategy", js.undefined)
      
      @scala.inline
      def setLabelStrategies(value: js.Any): Self = StObject.set(x, "labelStrategies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelStrategiesUndefined: Self = StObject.set(x, "labelStrategies", js.undefined)
      
      @scala.inline
      def setLeft(value: js.Any): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      @scala.inline
      def setQtip(value: js.Any): Self = StObject.set(x, "qtip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQtipUndefined: Self = StObject.set(x, "qtip", js.undefined)
      
      @scala.inline
      def setRight(value: js.Any): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      @scala.inline
      def setSide(value: js.Any): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSideUndefined: Self = StObject.set(x, "side", js.undefined)
      
      @scala.inline
      def setTitle(value: js.Any): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setTop(value: js.Any): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      @scala.inline
      def setUnder(value: js.Any): Self = StObject.set(x, "under", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnderUndefined: Self = StObject.set(x, "under", js.undefined)
    }
  }
  
  trait IFieldContainer
    extends StObject
       with IField
  object IFieldContainer {
    
    @scala.inline
    def apply(): IFieldContainer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IFieldContainer]
    }
  }
  
  trait IHtmlEditor
    extends StObject
       with IFieldContainer {
    
    /** [Method] This method is called after all layouts are complete and their calculations flushed to the DOM  */
    @JSName("finishedLayout")
    var finishedLayout_IHtmlEditor: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object IHtmlEditor {
    
    @scala.inline
    def apply(): IHtmlEditor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IHtmlEditor]
    }
    
    @scala.inline
    implicit class IHtmlEditorMutableBuilder[Self <: IHtmlEditor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFinishedLayout(value: () => Unit): Self = StObject.set(x, "finishedLayout", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFinishedLayoutUndefined: Self = StObject.set(x, "finishedLayout", js.undefined)
    }
  }
  
  trait ISlider
    extends StObject
       with IField
  object ISlider {
    
    @scala.inline
    def apply(): ISlider = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISlider]
    }
  }
  
  trait IText
    extends StObject
       with IField
  object IText {
    
    @scala.inline
    def apply(): IText = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IText]
    }
  }
  
  trait ITextArea
    extends StObject
       with IText
  object ITextArea {
    
    @scala.inline
    def apply(): ITextArea = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITextArea]
    }
  }
  
  trait ITrigger
    extends StObject
       with IField
  object ITrigger {
    
    @scala.inline
    def apply(): ITrigger = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITrigger]
    }
  }
}

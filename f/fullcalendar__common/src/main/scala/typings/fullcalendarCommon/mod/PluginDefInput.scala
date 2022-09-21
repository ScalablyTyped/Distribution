package typings.fullcalendarCommon.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginDefInput extends StObject {
  
  var calendarInteractions: js.UndefOr[js.Array[CalendarInteractionClass]] = js.undefined
  
  var cmdFormatter: js.UndefOr[CmdFormatterFunc] = js.undefined
  
  var componentInteractions: js.UndefOr[js.Array[InteractionClass]] = js.undefined
  
  var contentTypeHandlers: js.UndefOr[ContentTypeHandlers] = js.undefined
  
  var contextInit: js.UndefOr[js.Function1[/* context */ CalendarContext, Unit]] = js.undefined
  
  var datePointTransforms: js.UndefOr[js.Array[DatePointTransform]] = js.undefined
  
  var dateSelectionTransformers: js.UndefOr[js.Array[dateSelectionJoinTransformer]] = js.undefined
  
  var dateSpanTransforms: js.UndefOr[js.Array[DateSpanTransform]] = js.undefined
  
  var deps: js.UndefOr[js.Array[PluginDef]] = js.undefined
  
  var elementDraggingImpl: js.UndefOr[ElementDraggingClass] = js.undefined
  
  var eventDefMemberAdders: js.UndefOr[js.Array[EventDefMemberAdder]] = js.undefined
  
  var eventDefMutationAppliers: js.UndefOr[js.Array[eventDefMutationApplier]] = js.undefined
  
  var eventDragMutationMassagers: js.UndefOr[js.Array[eventDragMutationMassager]] = js.undefined
  
  var eventDropTransformers: js.UndefOr[js.Array[EventDropTransformers]] = js.undefined
  
  var eventRefiners: js.UndefOr[GenericRefiners] = js.undefined
  
  var eventSourceDefs: js.UndefOr[js.Array[EventSourceDef[Any]]] = js.undefined
  
  var eventSourceRefiners: js.UndefOr[GenericRefiners] = js.undefined
  
  var externalDefTransforms: js.UndefOr[js.Array[ExternalDefTransform]] = js.undefined
  
  var initialView: js.UndefOr[String] = js.undefined
  
  var isDraggableTransformers: js.UndefOr[js.Array[eventIsDraggableTransformer]] = js.undefined
  
  var isLoadingFuncs: js.UndefOr[js.Array[js.Function1[/* state */ Dictionary, Boolean]]] = js.undefined
  
  var isPropsValid: js.UndefOr[isPropsValidTester] = js.undefined
  
  var listenerRefiners: js.UndefOr[GenericListenerRefiners] = js.undefined
  
  var namedTimeZonedImpl: js.UndefOr[NamedTimeZoneImplClass] = js.undefined
  
  var optionChangeHandlers: js.UndefOr[OptionChangeHandlerMap] = js.undefined
  
  var optionRefiners: js.UndefOr[GenericRefiners] = js.undefined
  
  var propSetHandlers: js.UndefOr[StringDictionary[js.Function2[/* val */ Any, /* context */ CalendarData, Unit]]] = js.undefined
  
  var recurringTypes: js.UndefOr[js.Array[RecurringType[Any]]] = js.undefined
  
  var reducers: js.UndefOr[js.Array[ReducerFunc]] = js.undefined
  
  var scrollGridImpl: js.UndefOr[ScrollGridImpl] = js.undefined
  
  var themeClasses: js.UndefOr[StringDictionary[ThemeClass]] = js.undefined
  
  var viewContainerAppends: js.UndefOr[js.Array[ViewContainerAppend]] = js.undefined
  
  var viewPropsTransformers: js.UndefOr[js.Array[ViewPropsTransformerClass]] = js.undefined
  
  var views: js.UndefOr[ViewConfigInputHash] = js.undefined
}
object PluginDefInput {
  
  inline def apply(): PluginDefInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PluginDefInput]
  }
  
  extension [Self <: PluginDefInput](x: Self) {
    
    inline def setCalendarInteractions(value: js.Array[CalendarInteractionClass]): Self = StObject.set(x, "calendarInteractions", value.asInstanceOf[js.Any])
    
    inline def setCalendarInteractionsUndefined: Self = StObject.set(x, "calendarInteractions", js.undefined)
    
    inline def setCalendarInteractionsVarargs(value: CalendarInteractionClass*): Self = StObject.set(x, "calendarInteractions", js.Array(value*))
    
    inline def setCmdFormatter(value: (/* cmd */ String, /* arg */ VerboseFormattingArg) => String): Self = StObject.set(x, "cmdFormatter", js.Any.fromFunction2(value))
    
    inline def setCmdFormatterUndefined: Self = StObject.set(x, "cmdFormatter", js.undefined)
    
    inline def setComponentInteractions(value: js.Array[InteractionClass]): Self = StObject.set(x, "componentInteractions", value.asInstanceOf[js.Any])
    
    inline def setComponentInteractionsUndefined: Self = StObject.set(x, "componentInteractions", js.undefined)
    
    inline def setComponentInteractionsVarargs(value: InteractionClass*): Self = StObject.set(x, "componentInteractions", js.Array(value*))
    
    inline def setContentTypeHandlers(value: ContentTypeHandlers): Self = StObject.set(x, "contentTypeHandlers", value.asInstanceOf[js.Any])
    
    inline def setContentTypeHandlersUndefined: Self = StObject.set(x, "contentTypeHandlers", js.undefined)
    
    inline def setContextInit(value: /* context */ CalendarContext => Unit): Self = StObject.set(x, "contextInit", js.Any.fromFunction1(value))
    
    inline def setContextInitUndefined: Self = StObject.set(x, "contextInit", js.undefined)
    
    inline def setDatePointTransforms(value: js.Array[DatePointTransform]): Self = StObject.set(x, "datePointTransforms", value.asInstanceOf[js.Any])
    
    inline def setDatePointTransformsUndefined: Self = StObject.set(x, "datePointTransforms", js.undefined)
    
    inline def setDatePointTransformsVarargs(value: DatePointTransform*): Self = StObject.set(x, "datePointTransforms", js.Array(value*))
    
    inline def setDateSelectionTransformers(value: js.Array[dateSelectionJoinTransformer]): Self = StObject.set(x, "dateSelectionTransformers", value.asInstanceOf[js.Any])
    
    inline def setDateSelectionTransformersUndefined: Self = StObject.set(x, "dateSelectionTransformers", js.undefined)
    
    inline def setDateSelectionTransformersVarargs(value: dateSelectionJoinTransformer*): Self = StObject.set(x, "dateSelectionTransformers", js.Array(value*))
    
    inline def setDateSpanTransforms(value: js.Array[DateSpanTransform]): Self = StObject.set(x, "dateSpanTransforms", value.asInstanceOf[js.Any])
    
    inline def setDateSpanTransformsUndefined: Self = StObject.set(x, "dateSpanTransforms", js.undefined)
    
    inline def setDateSpanTransformsVarargs(value: DateSpanTransform*): Self = StObject.set(x, "dateSpanTransforms", js.Array(value*))
    
    inline def setDeps(value: js.Array[PluginDef]): Self = StObject.set(x, "deps", value.asInstanceOf[js.Any])
    
    inline def setDepsUndefined: Self = StObject.set(x, "deps", js.undefined)
    
    inline def setDepsVarargs(value: PluginDef*): Self = StObject.set(x, "deps", js.Array(value*))
    
    inline def setElementDraggingImpl(value: ElementDraggingClass): Self = StObject.set(x, "elementDraggingImpl", value.asInstanceOf[js.Any])
    
    inline def setElementDraggingImplUndefined: Self = StObject.set(x, "elementDraggingImpl", js.undefined)
    
    inline def setEventDefMemberAdders(value: js.Array[EventDefMemberAdder]): Self = StObject.set(x, "eventDefMemberAdders", value.asInstanceOf[js.Any])
    
    inline def setEventDefMemberAddersUndefined: Self = StObject.set(x, "eventDefMemberAdders", js.undefined)
    
    inline def setEventDefMemberAddersVarargs(value: EventDefMemberAdder*): Self = StObject.set(x, "eventDefMemberAdders", js.Array(value*))
    
    inline def setEventDefMutationAppliers(value: js.Array[eventDefMutationApplier]): Self = StObject.set(x, "eventDefMutationAppliers", value.asInstanceOf[js.Any])
    
    inline def setEventDefMutationAppliersUndefined: Self = StObject.set(x, "eventDefMutationAppliers", js.undefined)
    
    inline def setEventDefMutationAppliersVarargs(value: eventDefMutationApplier*): Self = StObject.set(x, "eventDefMutationAppliers", js.Array(value*))
    
    inline def setEventDragMutationMassagers(value: js.Array[eventDragMutationMassager]): Self = StObject.set(x, "eventDragMutationMassagers", value.asInstanceOf[js.Any])
    
    inline def setEventDragMutationMassagersUndefined: Self = StObject.set(x, "eventDragMutationMassagers", js.undefined)
    
    inline def setEventDragMutationMassagersVarargs(value: eventDragMutationMassager*): Self = StObject.set(x, "eventDragMutationMassagers", js.Array(value*))
    
    inline def setEventDropTransformers(value: js.Array[EventDropTransformers]): Self = StObject.set(x, "eventDropTransformers", value.asInstanceOf[js.Any])
    
    inline def setEventDropTransformersUndefined: Self = StObject.set(x, "eventDropTransformers", js.undefined)
    
    inline def setEventDropTransformersVarargs(value: EventDropTransformers*): Self = StObject.set(x, "eventDropTransformers", js.Array(value*))
    
    inline def setEventRefiners(value: GenericRefiners): Self = StObject.set(x, "eventRefiners", value.asInstanceOf[js.Any])
    
    inline def setEventRefinersUndefined: Self = StObject.set(x, "eventRefiners", js.undefined)
    
    inline def setEventSourceDefs(value: js.Array[EventSourceDef[Any]]): Self = StObject.set(x, "eventSourceDefs", value.asInstanceOf[js.Any])
    
    inline def setEventSourceDefsUndefined: Self = StObject.set(x, "eventSourceDefs", js.undefined)
    
    inline def setEventSourceDefsVarargs(value: EventSourceDef[Any]*): Self = StObject.set(x, "eventSourceDefs", js.Array(value*))
    
    inline def setEventSourceRefiners(value: GenericRefiners): Self = StObject.set(x, "eventSourceRefiners", value.asInstanceOf[js.Any])
    
    inline def setEventSourceRefinersUndefined: Self = StObject.set(x, "eventSourceRefiners", js.undefined)
    
    inline def setExternalDefTransforms(value: js.Array[ExternalDefTransform]): Self = StObject.set(x, "externalDefTransforms", value.asInstanceOf[js.Any])
    
    inline def setExternalDefTransformsUndefined: Self = StObject.set(x, "externalDefTransforms", js.undefined)
    
    inline def setExternalDefTransformsVarargs(value: ExternalDefTransform*): Self = StObject.set(x, "externalDefTransforms", js.Array(value*))
    
    inline def setInitialView(value: String): Self = StObject.set(x, "initialView", value.asInstanceOf[js.Any])
    
    inline def setInitialViewUndefined: Self = StObject.set(x, "initialView", js.undefined)
    
    inline def setIsDraggableTransformers(value: js.Array[eventIsDraggableTransformer]): Self = StObject.set(x, "isDraggableTransformers", value.asInstanceOf[js.Any])
    
    inline def setIsDraggableTransformersUndefined: Self = StObject.set(x, "isDraggableTransformers", js.undefined)
    
    inline def setIsDraggableTransformersVarargs(value: eventIsDraggableTransformer*): Self = StObject.set(x, "isDraggableTransformers", js.Array(value*))
    
    inline def setIsLoadingFuncs(value: js.Array[js.Function1[/* state */ Dictionary, Boolean]]): Self = StObject.set(x, "isLoadingFuncs", value.asInstanceOf[js.Any])
    
    inline def setIsLoadingFuncsUndefined: Self = StObject.set(x, "isLoadingFuncs", js.undefined)
    
    inline def setIsLoadingFuncsVarargs(value: (js.Function1[/* state */ Dictionary, Boolean])*): Self = StObject.set(x, "isLoadingFuncs", js.Array(value*))
    
    inline def setIsPropsValid(value: (/* props */ SplittableProps, /* context */ CalendarContext) => Boolean): Self = StObject.set(x, "isPropsValid", js.Any.fromFunction2(value))
    
    inline def setIsPropsValidUndefined: Self = StObject.set(x, "isPropsValid", js.undefined)
    
    inline def setListenerRefiners(value: GenericListenerRefiners): Self = StObject.set(x, "listenerRefiners", value.asInstanceOf[js.Any])
    
    inline def setListenerRefinersUndefined: Self = StObject.set(x, "listenerRefiners", js.undefined)
    
    inline def setNamedTimeZonedImpl(value: NamedTimeZoneImplClass): Self = StObject.set(x, "namedTimeZonedImpl", value.asInstanceOf[js.Any])
    
    inline def setNamedTimeZonedImplUndefined: Self = StObject.set(x, "namedTimeZonedImpl", js.undefined)
    
    inline def setOptionChangeHandlers(value: OptionChangeHandlerMap): Self = StObject.set(x, "optionChangeHandlers", value.asInstanceOf[js.Any])
    
    inline def setOptionChangeHandlersUndefined: Self = StObject.set(x, "optionChangeHandlers", js.undefined)
    
    inline def setOptionRefiners(value: GenericRefiners): Self = StObject.set(x, "optionRefiners", value.asInstanceOf[js.Any])
    
    inline def setOptionRefinersUndefined: Self = StObject.set(x, "optionRefiners", js.undefined)
    
    inline def setPropSetHandlers(value: StringDictionary[js.Function2[/* val */ Any, /* context */ CalendarData, Unit]]): Self = StObject.set(x, "propSetHandlers", value.asInstanceOf[js.Any])
    
    inline def setPropSetHandlersUndefined: Self = StObject.set(x, "propSetHandlers", js.undefined)
    
    inline def setRecurringTypes(value: js.Array[RecurringType[Any]]): Self = StObject.set(x, "recurringTypes", value.asInstanceOf[js.Any])
    
    inline def setRecurringTypesUndefined: Self = StObject.set(x, "recurringTypes", js.undefined)
    
    inline def setRecurringTypesVarargs(value: RecurringType[Any]*): Self = StObject.set(x, "recurringTypes", js.Array(value*))
    
    inline def setReducers(value: js.Array[ReducerFunc]): Self = StObject.set(x, "reducers", value.asInstanceOf[js.Any])
    
    inline def setReducersUndefined: Self = StObject.set(x, "reducers", js.undefined)
    
    inline def setReducersVarargs(value: ReducerFunc*): Self = StObject.set(x, "reducers", js.Array(value*))
    
    inline def setScrollGridImpl(value: ScrollGridImpl): Self = StObject.set(x, "scrollGridImpl", value.asInstanceOf[js.Any])
    
    inline def setScrollGridImplUndefined: Self = StObject.set(x, "scrollGridImpl", js.undefined)
    
    inline def setThemeClasses(value: StringDictionary[ThemeClass]): Self = StObject.set(x, "themeClasses", value.asInstanceOf[js.Any])
    
    inline def setThemeClassesUndefined: Self = StObject.set(x, "themeClasses", js.undefined)
    
    inline def setViewContainerAppends(value: js.Array[ViewContainerAppend]): Self = StObject.set(x, "viewContainerAppends", value.asInstanceOf[js.Any])
    
    inline def setViewContainerAppendsUndefined: Self = StObject.set(x, "viewContainerAppends", js.undefined)
    
    inline def setViewContainerAppendsVarargs(value: ViewContainerAppend*): Self = StObject.set(x, "viewContainerAppends", js.Array(value*))
    
    inline def setViewPropsTransformers(value: js.Array[ViewPropsTransformerClass]): Self = StObject.set(x, "viewPropsTransformers", value.asInstanceOf[js.Any])
    
    inline def setViewPropsTransformersUndefined: Self = StObject.set(x, "viewPropsTransformers", js.undefined)
    
    inline def setViewPropsTransformersVarargs(value: ViewPropsTransformerClass*): Self = StObject.set(x, "viewPropsTransformers", js.Array(value*))
    
    inline def setViews(value: ViewConfigInputHash): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
    
    inline def setViewsUndefined: Self = StObject.set(x, "views", js.undefined)
  }
}

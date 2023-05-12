package typings.fullcalendarCore.internalCommonMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginHooks extends StObject {
  
  var calendarInteractions: js.Array[CalendarInteractionClass]
  
  var cmdFormatter: js.UndefOr[CmdFormatterFunc] = js.undefined
  
  var componentInteractions: js.Array[InteractionClass]
  
  var contextInit: js.Array[js.Function1[/* context */ CalendarContext, Unit]]
  
  var datePointTransforms: js.Array[DatePointTransform]
  
  var dateSelectionTransformers: js.Array[dateSelectionJoinTransformer]
  
  var dateSpanTransforms: js.Array[DateSpanTransform]
  
  var elementDraggingImpl: js.UndefOr[ElementDraggingClass] = js.undefined
  
  var eventDefMemberAdders: js.Array[EventDefMemberAdder]
  
  var eventDefMutationAppliers: js.Array[eventDefMutationApplier]
  
  var eventDragMutationMassagers: js.Array[eventDragMutationMassager]
  
  var eventDropTransformers: js.Array[EventDropTransformers]
  
  var eventRefiners: GenericRefiners
  
  var eventSourceDefs: js.Array[EventSourceDef[Any]]
  
  var eventSourceRefiners: GenericRefiners
  
  var externalDefTransforms: js.Array[ExternalDefTransform]
  
  var initialView: String
  
  var isDraggableTransformers: js.Array[eventIsDraggableTransformer]
  
  var isLoadingFuncs: js.Array[js.Function1[/* state */ Dictionary, Boolean]]
  
  var isPropsValid: isPropsValidTester | Null
  
  var listenerRefiners: GenericListenerRefiners
  
  var namedTimeZonedImpl: js.UndefOr[NamedTimeZoneImplClass] = js.undefined
  
  var optionChangeHandlers: OptionChangeHandlerMap
  
  var optionRefiners: GenericRefiners
  
  var premiumReleaseDate: js.UndefOr[js.Date] = js.undefined
  
  var propSetHandlers: StringDictionary[js.Function2[/* val */ Any, /* context */ CalendarData, Unit]]
  
  var recurringTypes: js.Array[RecurringType[Any]]
  
  var reducers: js.Array[ReducerFunc]
  
  var scrollGridImpl: ScrollGridImpl | Null
  
  var themeClasses: StringDictionary[ThemeClass]
  
  var viewContainerAppends: js.Array[ViewContainerAppend]
  
  var viewPropsTransformers: js.Array[ViewPropsTransformerClass]
  
  var views: ViewConfigInputHash
}
object PluginHooks {
  
  inline def apply(
    calendarInteractions: js.Array[CalendarInteractionClass],
    componentInteractions: js.Array[InteractionClass],
    contextInit: js.Array[js.Function1[/* context */ CalendarContext, Unit]],
    datePointTransforms: js.Array[DatePointTransform],
    dateSelectionTransformers: js.Array[dateSelectionJoinTransformer],
    dateSpanTransforms: js.Array[DateSpanTransform],
    eventDefMemberAdders: js.Array[EventDefMemberAdder],
    eventDefMutationAppliers: js.Array[eventDefMutationApplier],
    eventDragMutationMassagers: js.Array[eventDragMutationMassager],
    eventDropTransformers: js.Array[EventDropTransformers],
    eventRefiners: GenericRefiners,
    eventSourceDefs: js.Array[EventSourceDef[Any]],
    eventSourceRefiners: GenericRefiners,
    externalDefTransforms: js.Array[ExternalDefTransform],
    initialView: String,
    isDraggableTransformers: js.Array[eventIsDraggableTransformer],
    isLoadingFuncs: js.Array[js.Function1[/* state */ Dictionary, Boolean]],
    listenerRefiners: GenericListenerRefiners,
    optionChangeHandlers: OptionChangeHandlerMap,
    optionRefiners: GenericRefiners,
    propSetHandlers: StringDictionary[js.Function2[/* val */ Any, /* context */ CalendarData, Unit]],
    recurringTypes: js.Array[RecurringType[Any]],
    reducers: js.Array[ReducerFunc],
    themeClasses: StringDictionary[ThemeClass],
    viewContainerAppends: js.Array[ViewContainerAppend],
    viewPropsTransformers: js.Array[ViewPropsTransformerClass],
    views: ViewConfigInputHash
  ): PluginHooks = {
    val __obj = js.Dynamic.literal(calendarInteractions = calendarInteractions.asInstanceOf[js.Any], componentInteractions = componentInteractions.asInstanceOf[js.Any], contextInit = contextInit.asInstanceOf[js.Any], datePointTransforms = datePointTransforms.asInstanceOf[js.Any], dateSelectionTransformers = dateSelectionTransformers.asInstanceOf[js.Any], dateSpanTransforms = dateSpanTransforms.asInstanceOf[js.Any], eventDefMemberAdders = eventDefMemberAdders.asInstanceOf[js.Any], eventDefMutationAppliers = eventDefMutationAppliers.asInstanceOf[js.Any], eventDragMutationMassagers = eventDragMutationMassagers.asInstanceOf[js.Any], eventDropTransformers = eventDropTransformers.asInstanceOf[js.Any], eventRefiners = eventRefiners.asInstanceOf[js.Any], eventSourceDefs = eventSourceDefs.asInstanceOf[js.Any], eventSourceRefiners = eventSourceRefiners.asInstanceOf[js.Any], externalDefTransforms = externalDefTransforms.asInstanceOf[js.Any], initialView = initialView.asInstanceOf[js.Any], isDraggableTransformers = isDraggableTransformers.asInstanceOf[js.Any], isLoadingFuncs = isLoadingFuncs.asInstanceOf[js.Any], listenerRefiners = listenerRefiners.asInstanceOf[js.Any], optionChangeHandlers = optionChangeHandlers.asInstanceOf[js.Any], optionRefiners = optionRefiners.asInstanceOf[js.Any], propSetHandlers = propSetHandlers.asInstanceOf[js.Any], recurringTypes = recurringTypes.asInstanceOf[js.Any], reducers = reducers.asInstanceOf[js.Any], themeClasses = themeClasses.asInstanceOf[js.Any], viewContainerAppends = viewContainerAppends.asInstanceOf[js.Any], viewPropsTransformers = viewPropsTransformers.asInstanceOf[js.Any], views = views.asInstanceOf[js.Any], isPropsValid = null, scrollGridImpl = null)
    __obj.asInstanceOf[PluginHooks]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PluginHooks] (val x: Self) extends AnyVal {
    
    inline def setCalendarInteractions(value: js.Array[CalendarInteractionClass]): Self = StObject.set(x, "calendarInteractions", value.asInstanceOf[js.Any])
    
    inline def setCalendarInteractionsVarargs(value: CalendarInteractionClass*): Self = StObject.set(x, "calendarInteractions", js.Array(value*))
    
    inline def setCmdFormatter(value: (/* cmd */ String, /* arg */ VerboseFormattingArg) => String): Self = StObject.set(x, "cmdFormatter", js.Any.fromFunction2(value))
    
    inline def setCmdFormatterUndefined: Self = StObject.set(x, "cmdFormatter", js.undefined)
    
    inline def setComponentInteractions(value: js.Array[InteractionClass]): Self = StObject.set(x, "componentInteractions", value.asInstanceOf[js.Any])
    
    inline def setComponentInteractionsVarargs(value: InteractionClass*): Self = StObject.set(x, "componentInteractions", js.Array(value*))
    
    inline def setContextInit(value: js.Array[js.Function1[/* context */ CalendarContext, Unit]]): Self = StObject.set(x, "contextInit", value.asInstanceOf[js.Any])
    
    inline def setContextInitVarargs(value: (js.Function1[/* context */ CalendarContext, Unit])*): Self = StObject.set(x, "contextInit", js.Array(value*))
    
    inline def setDatePointTransforms(value: js.Array[DatePointTransform]): Self = StObject.set(x, "datePointTransforms", value.asInstanceOf[js.Any])
    
    inline def setDatePointTransformsVarargs(value: DatePointTransform*): Self = StObject.set(x, "datePointTransforms", js.Array(value*))
    
    inline def setDateSelectionTransformers(value: js.Array[dateSelectionJoinTransformer]): Self = StObject.set(x, "dateSelectionTransformers", value.asInstanceOf[js.Any])
    
    inline def setDateSelectionTransformersVarargs(value: dateSelectionJoinTransformer*): Self = StObject.set(x, "dateSelectionTransformers", js.Array(value*))
    
    inline def setDateSpanTransforms(value: js.Array[DateSpanTransform]): Self = StObject.set(x, "dateSpanTransforms", value.asInstanceOf[js.Any])
    
    inline def setDateSpanTransformsVarargs(value: DateSpanTransform*): Self = StObject.set(x, "dateSpanTransforms", js.Array(value*))
    
    inline def setElementDraggingImpl(value: ElementDraggingClass): Self = StObject.set(x, "elementDraggingImpl", value.asInstanceOf[js.Any])
    
    inline def setElementDraggingImplUndefined: Self = StObject.set(x, "elementDraggingImpl", js.undefined)
    
    inline def setEventDefMemberAdders(value: js.Array[EventDefMemberAdder]): Self = StObject.set(x, "eventDefMemberAdders", value.asInstanceOf[js.Any])
    
    inline def setEventDefMemberAddersVarargs(value: EventDefMemberAdder*): Self = StObject.set(x, "eventDefMemberAdders", js.Array(value*))
    
    inline def setEventDefMutationAppliers(value: js.Array[eventDefMutationApplier]): Self = StObject.set(x, "eventDefMutationAppliers", value.asInstanceOf[js.Any])
    
    inline def setEventDefMutationAppliersVarargs(value: eventDefMutationApplier*): Self = StObject.set(x, "eventDefMutationAppliers", js.Array(value*))
    
    inline def setEventDragMutationMassagers(value: js.Array[eventDragMutationMassager]): Self = StObject.set(x, "eventDragMutationMassagers", value.asInstanceOf[js.Any])
    
    inline def setEventDragMutationMassagersVarargs(value: eventDragMutationMassager*): Self = StObject.set(x, "eventDragMutationMassagers", js.Array(value*))
    
    inline def setEventDropTransformers(value: js.Array[EventDropTransformers]): Self = StObject.set(x, "eventDropTransformers", value.asInstanceOf[js.Any])
    
    inline def setEventDropTransformersVarargs(value: EventDropTransformers*): Self = StObject.set(x, "eventDropTransformers", js.Array(value*))
    
    inline def setEventRefiners(value: GenericRefiners): Self = StObject.set(x, "eventRefiners", value.asInstanceOf[js.Any])
    
    inline def setEventSourceDefs(value: js.Array[EventSourceDef[Any]]): Self = StObject.set(x, "eventSourceDefs", value.asInstanceOf[js.Any])
    
    inline def setEventSourceDefsVarargs(value: EventSourceDef[Any]*): Self = StObject.set(x, "eventSourceDefs", js.Array(value*))
    
    inline def setEventSourceRefiners(value: GenericRefiners): Self = StObject.set(x, "eventSourceRefiners", value.asInstanceOf[js.Any])
    
    inline def setExternalDefTransforms(value: js.Array[ExternalDefTransform]): Self = StObject.set(x, "externalDefTransforms", value.asInstanceOf[js.Any])
    
    inline def setExternalDefTransformsVarargs(value: ExternalDefTransform*): Self = StObject.set(x, "externalDefTransforms", js.Array(value*))
    
    inline def setInitialView(value: String): Self = StObject.set(x, "initialView", value.asInstanceOf[js.Any])
    
    inline def setIsDraggableTransformers(value: js.Array[eventIsDraggableTransformer]): Self = StObject.set(x, "isDraggableTransformers", value.asInstanceOf[js.Any])
    
    inline def setIsDraggableTransformersVarargs(value: eventIsDraggableTransformer*): Self = StObject.set(x, "isDraggableTransformers", js.Array(value*))
    
    inline def setIsLoadingFuncs(value: js.Array[js.Function1[/* state */ Dictionary, Boolean]]): Self = StObject.set(x, "isLoadingFuncs", value.asInstanceOf[js.Any])
    
    inline def setIsLoadingFuncsVarargs(value: (js.Function1[/* state */ Dictionary, Boolean])*): Self = StObject.set(x, "isLoadingFuncs", js.Array(value*))
    
    inline def setIsPropsValid(value: (/* props */ SplittableProps, /* context */ CalendarContext) => Boolean): Self = StObject.set(x, "isPropsValid", js.Any.fromFunction2(value))
    
    inline def setIsPropsValidNull: Self = StObject.set(x, "isPropsValid", null)
    
    inline def setListenerRefiners(value: GenericListenerRefiners): Self = StObject.set(x, "listenerRefiners", value.asInstanceOf[js.Any])
    
    inline def setNamedTimeZonedImpl(value: NamedTimeZoneImplClass): Self = StObject.set(x, "namedTimeZonedImpl", value.asInstanceOf[js.Any])
    
    inline def setNamedTimeZonedImplUndefined: Self = StObject.set(x, "namedTimeZonedImpl", js.undefined)
    
    inline def setOptionChangeHandlers(value: OptionChangeHandlerMap): Self = StObject.set(x, "optionChangeHandlers", value.asInstanceOf[js.Any])
    
    inline def setOptionRefiners(value: GenericRefiners): Self = StObject.set(x, "optionRefiners", value.asInstanceOf[js.Any])
    
    inline def setPremiumReleaseDate(value: js.Date): Self = StObject.set(x, "premiumReleaseDate", value.asInstanceOf[js.Any])
    
    inline def setPremiumReleaseDateUndefined: Self = StObject.set(x, "premiumReleaseDate", js.undefined)
    
    inline def setPropSetHandlers(value: StringDictionary[js.Function2[/* val */ Any, /* context */ CalendarData, Unit]]): Self = StObject.set(x, "propSetHandlers", value.asInstanceOf[js.Any])
    
    inline def setRecurringTypes(value: js.Array[RecurringType[Any]]): Self = StObject.set(x, "recurringTypes", value.asInstanceOf[js.Any])
    
    inline def setRecurringTypesVarargs(value: RecurringType[Any]*): Self = StObject.set(x, "recurringTypes", js.Array(value*))
    
    inline def setReducers(value: js.Array[ReducerFunc]): Self = StObject.set(x, "reducers", value.asInstanceOf[js.Any])
    
    inline def setReducersVarargs(value: ReducerFunc*): Self = StObject.set(x, "reducers", js.Array(value*))
    
    inline def setScrollGridImpl(value: ScrollGridImpl): Self = StObject.set(x, "scrollGridImpl", value.asInstanceOf[js.Any])
    
    inline def setScrollGridImplNull: Self = StObject.set(x, "scrollGridImpl", null)
    
    inline def setThemeClasses(value: StringDictionary[ThemeClass]): Self = StObject.set(x, "themeClasses", value.asInstanceOf[js.Any])
    
    inline def setViewContainerAppends(value: js.Array[ViewContainerAppend]): Self = StObject.set(x, "viewContainerAppends", value.asInstanceOf[js.Any])
    
    inline def setViewContainerAppendsVarargs(value: ViewContainerAppend*): Self = StObject.set(x, "viewContainerAppends", js.Array(value*))
    
    inline def setViewPropsTransformers(value: js.Array[ViewPropsTransformerClass]): Self = StObject.set(x, "viewPropsTransformers", value.asInstanceOf[js.Any])
    
    inline def setViewPropsTransformersVarargs(value: ViewPropsTransformerClass*): Self = StObject.set(x, "viewPropsTransformers", js.Array(value*))
    
    inline def setViews(value: ViewConfigInputHash): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
  }
}

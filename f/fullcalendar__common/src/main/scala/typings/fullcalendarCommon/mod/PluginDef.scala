package typings.fullcalendarCommon.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginDef
  extends StObject
     with PluginHooks {
  
  var deps: js.Array[PluginDef]
  
  var id: String
}
object PluginDef {
  
  inline def apply(
    calendarInteractions: js.Array[CalendarInteractionClass],
    componentInteractions: js.Array[InteractionClass],
    contentTypeHandlers: ContentTypeHandlers,
    contextInit: js.Array[js.Function1[/* context */ CalendarContext, Unit]],
    datePointTransforms: js.Array[DatePointTransform],
    dateSelectionTransformers: js.Array[dateSelectionJoinTransformer],
    dateSpanTransforms: js.Array[DateSpanTransform],
    deps: js.Array[PluginDef],
    eventDefMemberAdders: js.Array[EventDefMemberAdder],
    eventDefMutationAppliers: js.Array[eventDefMutationApplier],
    eventDragMutationMassagers: js.Array[eventDragMutationMassager],
    eventDropTransformers: js.Array[EventDropTransformers],
    eventRefiners: GenericRefiners,
    eventSourceDefs: js.Array[EventSourceDef[Any]],
    eventSourceRefiners: GenericRefiners,
    externalDefTransforms: js.Array[ExternalDefTransform],
    id: String,
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
  ): PluginDef = {
    val __obj = js.Dynamic.literal(calendarInteractions = calendarInteractions.asInstanceOf[js.Any], componentInteractions = componentInteractions.asInstanceOf[js.Any], contentTypeHandlers = contentTypeHandlers.asInstanceOf[js.Any], contextInit = contextInit.asInstanceOf[js.Any], datePointTransforms = datePointTransforms.asInstanceOf[js.Any], dateSelectionTransformers = dateSelectionTransformers.asInstanceOf[js.Any], dateSpanTransforms = dateSpanTransforms.asInstanceOf[js.Any], deps = deps.asInstanceOf[js.Any], eventDefMemberAdders = eventDefMemberAdders.asInstanceOf[js.Any], eventDefMutationAppliers = eventDefMutationAppliers.asInstanceOf[js.Any], eventDragMutationMassagers = eventDragMutationMassagers.asInstanceOf[js.Any], eventDropTransformers = eventDropTransformers.asInstanceOf[js.Any], eventRefiners = eventRefiners.asInstanceOf[js.Any], eventSourceDefs = eventSourceDefs.asInstanceOf[js.Any], eventSourceRefiners = eventSourceRefiners.asInstanceOf[js.Any], externalDefTransforms = externalDefTransforms.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], initialView = initialView.asInstanceOf[js.Any], isDraggableTransformers = isDraggableTransformers.asInstanceOf[js.Any], isLoadingFuncs = isLoadingFuncs.asInstanceOf[js.Any], listenerRefiners = listenerRefiners.asInstanceOf[js.Any], optionChangeHandlers = optionChangeHandlers.asInstanceOf[js.Any], optionRefiners = optionRefiners.asInstanceOf[js.Any], propSetHandlers = propSetHandlers.asInstanceOf[js.Any], recurringTypes = recurringTypes.asInstanceOf[js.Any], reducers = reducers.asInstanceOf[js.Any], themeClasses = themeClasses.asInstanceOf[js.Any], viewContainerAppends = viewContainerAppends.asInstanceOf[js.Any], viewPropsTransformers = viewPropsTransformers.asInstanceOf[js.Any], views = views.asInstanceOf[js.Any], isPropsValid = null, scrollGridImpl = null)
    __obj.asInstanceOf[PluginDef]
  }
  
  extension [Self <: PluginDef](x: Self) {
    
    inline def setDeps(value: js.Array[PluginDef]): Self = StObject.set(x, "deps", value.asInstanceOf[js.Any])
    
    inline def setDepsVarargs(value: PluginDef*): Self = StObject.set(x, "deps", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}

package typings.fullcalendarCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewContext
  extends StObject
     with CalendarContext {
  
  def addResizeHandler(handler: ResizeHandler): Unit
  
  def createScrollResponder(execFunc: ScrollRequestHandler): ScrollResponder
  
  var dateProfileGenerator: DateProfileGenerator
  
  var isRtl: Boolean
  
  @JSName("options")
  var options_ViewContext: ViewOptionsRefined
  
  def registerInteractiveComponent(component: DateComponent[Any, Dictionary], settingsInput: InteractionSettingsInput): Unit
  
  def removeResizeHandler(handler: ResizeHandler): Unit
  
  var theme: Theme
  
  def unregisterInteractiveComponent(component: DateComponent[Any, Dictionary]): Unit
  
  var viewApi: ViewApi
  
  var viewSpec: ViewSpec
}
object ViewContext {
  
  inline def apply(
    addResizeHandler: ResizeHandler => Unit,
    calendarApi: CalendarApi,
    createScrollResponder: ScrollRequestHandler => ScrollResponder,
    dateEnv: DateEnv,
    dateProfileGenerator: DateProfileGenerator,
    dispatch: Action => Unit,
    emitter: Emitter[CalendarListeners],
    getCurrentData: () => CalendarData,
    isRtl: Boolean,
    options: ViewOptionsRefined,
    pluginHooks: PluginHooks,
    registerInteractiveComponent: (DateComponent[Any, Dictionary], InteractionSettingsInput) => Unit,
    removeResizeHandler: ResizeHandler => Unit,
    theme: Theme,
    unregisterInteractiveComponent: DateComponent[Any, Dictionary] => Unit,
    viewApi: ViewApi,
    viewSpec: ViewSpec
  ): ViewContext = {
    val __obj = js.Dynamic.literal(addResizeHandler = js.Any.fromFunction1(addResizeHandler), calendarApi = calendarApi.asInstanceOf[js.Any], createScrollResponder = js.Any.fromFunction1(createScrollResponder), dateEnv = dateEnv.asInstanceOf[js.Any], dateProfileGenerator = dateProfileGenerator.asInstanceOf[js.Any], dispatch = js.Any.fromFunction1(dispatch), emitter = emitter.asInstanceOf[js.Any], getCurrentData = js.Any.fromFunction0(getCurrentData), isRtl = isRtl.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], pluginHooks = pluginHooks.asInstanceOf[js.Any], registerInteractiveComponent = js.Any.fromFunction2(registerInteractiveComponent), removeResizeHandler = js.Any.fromFunction1(removeResizeHandler), theme = theme.asInstanceOf[js.Any], unregisterInteractiveComponent = js.Any.fromFunction1(unregisterInteractiveComponent), viewApi = viewApi.asInstanceOf[js.Any], viewSpec = viewSpec.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ViewContext] (val x: Self) extends AnyVal {
    
    inline def setAddResizeHandler(value: ResizeHandler => Unit): Self = StObject.set(x, "addResizeHandler", js.Any.fromFunction1(value))
    
    inline def setCreateScrollResponder(value: ScrollRequestHandler => ScrollResponder): Self = StObject.set(x, "createScrollResponder", js.Any.fromFunction1(value))
    
    inline def setDateProfileGenerator(value: DateProfileGenerator): Self = StObject.set(x, "dateProfileGenerator", value.asInstanceOf[js.Any])
    
    inline def setIsRtl(value: Boolean): Self = StObject.set(x, "isRtl", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: ViewOptionsRefined): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setRegisterInteractiveComponent(value: (DateComponent[Any, Dictionary], InteractionSettingsInput) => Unit): Self = StObject.set(x, "registerInteractiveComponent", js.Any.fromFunction2(value))
    
    inline def setRemoveResizeHandler(value: ResizeHandler => Unit): Self = StObject.set(x, "removeResizeHandler", js.Any.fromFunction1(value))
    
    inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setUnregisterInteractiveComponent(value: DateComponent[Any, Dictionary] => Unit): Self = StObject.set(x, "unregisterInteractiveComponent", js.Any.fromFunction1(value))
    
    inline def setViewApi(value: ViewApi): Self = StObject.set(x, "viewApi", value.asInstanceOf[js.Any])
    
    inline def setViewSpec(value: ViewSpec): Self = StObject.set(x, "viewSpec", value.asInstanceOf[js.Any])
  }
}

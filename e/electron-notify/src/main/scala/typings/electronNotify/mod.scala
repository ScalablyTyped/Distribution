package typings.electronNotify

import typings.electron.Electron.BrowserWindowConstructorOptions
import typings.electronNotify.electronNotifyStrings.click
import typings.electronNotify.electronNotifyStrings.close
import typings.electronNotify.electronNotifyStrings.show
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("electron-notify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def closeAll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("closeAll")().asInstanceOf[Unit]
  
  @scala.inline
  def getTemplatePath(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTemplatePath")().asInstanceOf[String]
  
  @scala.inline
  def notify_(notification: INotification): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("notify")(notification.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def setConfig(customConfig: ICustomConfig): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setConfig")(customConfig.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def setTemplatePath(path: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setTemplatePath")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait ICloseNotificationEvent extends StObject {
    
    var event: close | show | click
    
    var id: Double
  }
  object ICloseNotificationEvent {
    
    @scala.inline
    def apply(event: close | show | click, id: Double): ICloseNotificationEvent = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICloseNotificationEvent]
    }
    
    @scala.inline
    implicit class ICloseNotificationEventMutableBuilder[Self <: ICloseNotificationEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEvent(value: close | show | click): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  trait ICustomConfig extends StObject {
    
    var animateInParallel: js.UndefOr[Boolean] = js.undefined
    
    var animationStepMs: js.UndefOr[Double] = js.undefined
    
    var animationSteps: js.UndefOr[Double] = js.undefined
    
    var appIcon: js.UndefOr[String] = js.undefined
    
    var borderRadius: js.UndefOr[Double] = js.undefined
    
    var defaultStyleAppIcon: js.UndefOr[js.Any] = js.undefined
    
    var defaultStyleClose: js.UndefOr[js.Any] = js.undefined
    
    var defaultStyleContainer: js.UndefOr[js.Any] = js.undefined
    
    var defaultStyleImage: js.UndefOr[js.Any] = js.undefined
    
    var defaultStyleText: js.UndefOr[js.Any] = js.undefined
    
    var defaultWindow: js.UndefOr[BrowserWindowConstructorOptions] = js.undefined
    
    var displayTime: js.UndefOr[Double] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var logging: js.UndefOr[Boolean] = js.undefined
    
    var padding: js.UndefOr[Double] = js.undefined
    
    var pathToModule: js.UndefOr[String] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object ICustomConfig {
    
    @scala.inline
    def apply(): ICustomConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICustomConfig]
    }
    
    @scala.inline
    implicit class ICustomConfigMutableBuilder[Self <: ICustomConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimateInParallel(value: Boolean): Self = StObject.set(x, "animateInParallel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimateInParallelUndefined: Self = StObject.set(x, "animateInParallel", js.undefined)
      
      @scala.inline
      def setAnimationStepMs(value: Double): Self = StObject.set(x, "animationStepMs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationStepMsUndefined: Self = StObject.set(x, "animationStepMs", js.undefined)
      
      @scala.inline
      def setAnimationSteps(value: Double): Self = StObject.set(x, "animationSteps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationStepsUndefined: Self = StObject.set(x, "animationSteps", js.undefined)
      
      @scala.inline
      def setAppIcon(value: String): Self = StObject.set(x, "appIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppIconUndefined: Self = StObject.set(x, "appIcon", js.undefined)
      
      @scala.inline
      def setBorderRadius(value: Double): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
      
      @scala.inline
      def setDefaultStyleAppIcon(value: js.Any): Self = StObject.set(x, "defaultStyleAppIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultStyleAppIconUndefined: Self = StObject.set(x, "defaultStyleAppIcon", js.undefined)
      
      @scala.inline
      def setDefaultStyleClose(value: js.Any): Self = StObject.set(x, "defaultStyleClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultStyleCloseUndefined: Self = StObject.set(x, "defaultStyleClose", js.undefined)
      
      @scala.inline
      def setDefaultStyleContainer(value: js.Any): Self = StObject.set(x, "defaultStyleContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultStyleContainerUndefined: Self = StObject.set(x, "defaultStyleContainer", js.undefined)
      
      @scala.inline
      def setDefaultStyleImage(value: js.Any): Self = StObject.set(x, "defaultStyleImage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultStyleImageUndefined: Self = StObject.set(x, "defaultStyleImage", js.undefined)
      
      @scala.inline
      def setDefaultStyleText(value: js.Any): Self = StObject.set(x, "defaultStyleText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultStyleTextUndefined: Self = StObject.set(x, "defaultStyleText", js.undefined)
      
      @scala.inline
      def setDefaultWindow(value: BrowserWindowConstructorOptions): Self = StObject.set(x, "defaultWindow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultWindowUndefined: Self = StObject.set(x, "defaultWindow", js.undefined)
      
      @scala.inline
      def setDisplayTime(value: Double): Self = StObject.set(x, "displayTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayTimeUndefined: Self = StObject.set(x, "displayTime", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setLogging(value: Boolean): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
      
      @scala.inline
      def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setPathToModule(value: String): Self = StObject.set(x, "pathToModule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathToModuleUndefined: Self = StObject.set(x, "pathToModule", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait INotification extends StObject {
    
    var image: js.UndefOr[String] = js.undefined
    
    var onClickFunc: js.UndefOr[js.Function1[/* event */ INotificationEvent, Unit]] = js.undefined
    
    var onCloseFunc: js.UndefOr[js.Function1[/* event */ ICloseNotificationEvent, Unit]] = js.undefined
    
    var onShowFunc: js.UndefOr[js.Function1[/* event */ INotificationEvent, Unit]] = js.undefined
    
    var sound: js.UndefOr[String] = js.undefined
    
    var text: js.UndefOr[String] = js.undefined
    
    var title: String
    
    var url: js.UndefOr[String] = js.undefined
  }
  object INotification {
    
    @scala.inline
    def apply(title: String): INotification = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[INotification]
    }
    
    @scala.inline
    implicit class INotificationMutableBuilder[Self <: INotification] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      @scala.inline
      def setOnClickFunc(value: /* event */ INotificationEvent => Unit): Self = StObject.set(x, "onClickFunc", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickFuncUndefined: Self = StObject.set(x, "onClickFunc", js.undefined)
      
      @scala.inline
      def setOnCloseFunc(value: /* event */ ICloseNotificationEvent => Unit): Self = StObject.set(x, "onCloseFunc", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCloseFuncUndefined: Self = StObject.set(x, "onCloseFunc", js.undefined)
      
      @scala.inline
      def setOnShowFunc(value: /* event */ INotificationEvent => Unit): Self = StObject.set(x, "onShowFunc", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnShowFuncUndefined: Self = StObject.set(x, "onShowFunc", js.undefined)
      
      @scala.inline
      def setSound(value: String): Self = StObject.set(x, "sound", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSoundUndefined: Self = StObject.set(x, "sound", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait INotificationEvent
    extends StObject
       with ICloseNotificationEvent {
    
    def closeNotification(reason: js.Any): Unit
  }
  object INotificationEvent {
    
    @scala.inline
    def apply(closeNotification: js.Any => Unit, event: close | show | click, id: Double): INotificationEvent = {
      val __obj = js.Dynamic.literal(closeNotification = js.Any.fromFunction1(closeNotification), event = event.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[INotificationEvent]
    }
    
    @scala.inline
    implicit class INotificationEventMutableBuilder[Self <: INotificationEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCloseNotification(value: js.Any => Unit): Self = StObject.set(x, "closeNotification", js.Any.fromFunction1(value))
    }
  }
}

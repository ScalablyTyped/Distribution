package typings.featherlight

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typings.jquery.JQueryEventObject
import typings.jquery.JQueryPromise
import typings.std.HTMLElement
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Featherlight {
  
  trait Config extends StObject {
    
    var afterClose: js.UndefOr[js.Function1[/* event */ JQueryEventObject, js.Any]] = js.undefined
    
    var afterContent: js.UndefOr[js.Function1[/* event */ JQueryEventObject, js.Any]] = js.undefined
    
    var afterOpen: js.UndefOr[js.Function1[/* event */ JQueryEventObject, js.Any]] = js.undefined
    
    var ajax: js.UndefOr[String] = js.undefined
    
    var background: js.UndefOr[String] = js.undefined
    
    var beforeClose: js.UndefOr[js.Function1[/* event */ JQueryEventObject, js.Any]] = js.undefined
    
    var beforeContent: js.UndefOr[js.Function1[/* event */ JQueryEventObject, js.Any]] = js.undefined
    
    var beforeOpen: js.UndefOr[js.Function1[/* event */ JQueryEventObject, js.Any]] = js.undefined
    
    var closeIcon: js.UndefOr[String] = js.undefined
    
    var closeOnClick: js.UndefOr[Boolean | String] = js.undefined
    
    var closeOnEsc: js.UndefOr[Boolean] = js.undefined
    
    var closeSpeed: js.UndefOr[Double | String] = js.undefined
    
    var closeTrigger: js.UndefOr[String] = js.undefined
    
    var contentFilters: js.UndefOr[js.Any] = js.undefined
    
    var filter: js.UndefOr[String] = js.undefined
    
    var html: js.UndefOr[String] = js.undefined
    
    var image: js.UndefOr[String] = js.undefined
    
    var jquery: js.UndefOr[JQuery] = js.undefined
    
    var loading: js.UndefOr[String] = js.undefined
    
    var namespace: js.UndefOr[String] = js.undefined
    
    var onKeyUp: js.UndefOr[js.Function1[/* event */ JQueryEventObject, js.Any]] = js.undefined
    
    var onResize: js.UndefOr[js.Function1[/* event */ JQueryEventObject, js.Any]] = js.undefined
    
    var openSpeed: js.UndefOr[Double | String] = js.undefined
    
    var openTrigger: js.UndefOr[String] = js.undefined
    
    var otherClose: js.UndefOr[String] = js.undefined
    
    var persist: js.UndefOr[Boolean | String] = js.undefined
    
    var resetCss: js.UndefOr[Boolean] = js.undefined
    
    var root: js.UndefOr[String] = js.undefined
    
    var targetAttr: js.UndefOr[String] = js.undefined
    
    var text: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var variant: js.UndefOr[String] = js.undefined
  }
  object Config {
    
    inline def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setAfterClose(value: /* event */ JQueryEventObject => js.Any): Self = StObject.set(x, "afterClose", js.Any.fromFunction1(value))
      
      inline def setAfterCloseUndefined: Self = StObject.set(x, "afterClose", js.undefined)
      
      inline def setAfterContent(value: /* event */ JQueryEventObject => js.Any): Self = StObject.set(x, "afterContent", js.Any.fromFunction1(value))
      
      inline def setAfterContentUndefined: Self = StObject.set(x, "afterContent", js.undefined)
      
      inline def setAfterOpen(value: /* event */ JQueryEventObject => js.Any): Self = StObject.set(x, "afterOpen", js.Any.fromFunction1(value))
      
      inline def setAfterOpenUndefined: Self = StObject.set(x, "afterOpen", js.undefined)
      
      inline def setAjax(value: String): Self = StObject.set(x, "ajax", value.asInstanceOf[js.Any])
      
      inline def setAjaxUndefined: Self = StObject.set(x, "ajax", js.undefined)
      
      inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setBeforeClose(value: /* event */ JQueryEventObject => js.Any): Self = StObject.set(x, "beforeClose", js.Any.fromFunction1(value))
      
      inline def setBeforeCloseUndefined: Self = StObject.set(x, "beforeClose", js.undefined)
      
      inline def setBeforeContent(value: /* event */ JQueryEventObject => js.Any): Self = StObject.set(x, "beforeContent", js.Any.fromFunction1(value))
      
      inline def setBeforeContentUndefined: Self = StObject.set(x, "beforeContent", js.undefined)
      
      inline def setBeforeOpen(value: /* event */ JQueryEventObject => js.Any): Self = StObject.set(x, "beforeOpen", js.Any.fromFunction1(value))
      
      inline def setBeforeOpenUndefined: Self = StObject.set(x, "beforeOpen", js.undefined)
      
      inline def setCloseIcon(value: String): Self = StObject.set(x, "closeIcon", value.asInstanceOf[js.Any])
      
      inline def setCloseIconUndefined: Self = StObject.set(x, "closeIcon", js.undefined)
      
      inline def setCloseOnClick(value: Boolean | String): Self = StObject.set(x, "closeOnClick", value.asInstanceOf[js.Any])
      
      inline def setCloseOnClickUndefined: Self = StObject.set(x, "closeOnClick", js.undefined)
      
      inline def setCloseOnEsc(value: Boolean): Self = StObject.set(x, "closeOnEsc", value.asInstanceOf[js.Any])
      
      inline def setCloseOnEscUndefined: Self = StObject.set(x, "closeOnEsc", js.undefined)
      
      inline def setCloseSpeed(value: Double | String): Self = StObject.set(x, "closeSpeed", value.asInstanceOf[js.Any])
      
      inline def setCloseSpeedUndefined: Self = StObject.set(x, "closeSpeed", js.undefined)
      
      inline def setCloseTrigger(value: String): Self = StObject.set(x, "closeTrigger", value.asInstanceOf[js.Any])
      
      inline def setCloseTriggerUndefined: Self = StObject.set(x, "closeTrigger", js.undefined)
      
      inline def setContentFilters(value: js.Any): Self = StObject.set(x, "contentFilters", value.asInstanceOf[js.Any])
      
      inline def setContentFiltersUndefined: Self = StObject.set(x, "contentFilters", js.undefined)
      
      inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      
      inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      inline def setJquery(value: JQuery): Self = StObject.set(x, "jquery", value.asInstanceOf[js.Any])
      
      inline def setJqueryUndefined: Self = StObject.set(x, "jquery", js.undefined)
      
      inline def setLoading(value: String): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
      
      inline def setOnKeyUp(value: /* event */ JQueryEventObject => js.Any): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
      
      inline def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      inline def setOnResize(value: /* event */ JQueryEventObject => js.Any): Self = StObject.set(x, "onResize", js.Any.fromFunction1(value))
      
      inline def setOnResizeUndefined: Self = StObject.set(x, "onResize", js.undefined)
      
      inline def setOpenSpeed(value: Double | String): Self = StObject.set(x, "openSpeed", value.asInstanceOf[js.Any])
      
      inline def setOpenSpeedUndefined: Self = StObject.set(x, "openSpeed", js.undefined)
      
      inline def setOpenTrigger(value: String): Self = StObject.set(x, "openTrigger", value.asInstanceOf[js.Any])
      
      inline def setOpenTriggerUndefined: Self = StObject.set(x, "openTrigger", js.undefined)
      
      inline def setOtherClose(value: String): Self = StObject.set(x, "otherClose", value.asInstanceOf[js.Any])
      
      inline def setOtherCloseUndefined: Self = StObject.set(x, "otherClose", js.undefined)
      
      inline def setPersist(value: Boolean | String): Self = StObject.set(x, "persist", value.asInstanceOf[js.Any])
      
      inline def setPersistUndefined: Self = StObject.set(x, "persist", js.undefined)
      
      inline def setResetCss(value: Boolean): Self = StObject.set(x, "resetCss", value.asInstanceOf[js.Any])
      
      inline def setResetCssUndefined: Self = StObject.set(x, "resetCss", js.undefined)
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      inline def setTargetAttr(value: String): Self = StObject.set(x, "targetAttr", value.asInstanceOf[js.Any])
      
      inline def setTargetAttrUndefined: Self = StObject.set(x, "targetAttr", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setVariant(value: String): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
    }
  }
  
  trait ContentFilter extends StObject {
    
    var process: js.UndefOr[js.Function1[/* data */ JQuery | String, JQuery | JQueryPromise[JQuery]]] = js.undefined
    
    var regex: js.UndefOr[RegExp] = js.undefined
    
    var test: js.UndefOr[js.Function1[/* data */ JQuery | String, Boolean]] = js.undefined
  }
  object ContentFilter {
    
    inline def apply(): ContentFilter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContentFilter]
    }
    
    extension [Self <: ContentFilter](x: Self) {
      
      inline def setProcess(value: /* data */ JQuery | String => JQuery | JQueryPromise[JQuery]): Self = StObject.set(x, "process", js.Any.fromFunction1(value))
      
      inline def setProcessUndefined: Self = StObject.set(x, "process", js.undefined)
      
      inline def setRegex(value: RegExp): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
      
      inline def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
      
      inline def setTest(value: /* data */ JQuery | String => Boolean): Self = StObject.set(x, "test", js.Any.fromFunction1(value))
      
      inline def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
    }
  }
  
  type ContentFilters = StringDictionary[ContentFilter]
  
  @js.native
  trait Featherlight
    extends StObject
       with Config {
    
    @JSName("$content")
    var $content: JQuery = js.native
    
    @JSName("$instance")
    var $instance: JQuery = js.native
    
    def close(): JQueryPromise[JQuery] = js.native
    def close(event: JQueryEventObject): JQueryPromise[JQuery] = js.native
    
    def getContent(): JQuery | JQueryPromise[JQuery] = js.native
    
    def open(): JQueryPromise[JQuery] = js.native
    def open(event: JQueryEventObject): JQueryPromise[JQuery] = js.native
    
    def setContent($content: JQuery): typings.featherlight.Featherlight.Featherlight = js.native
    def setContent($content: JQueryPromise[JQuery]): typings.featherlight.Featherlight.Featherlight = js.native
    
    def setup(): typings.featherlight.Featherlight.Featherlight = js.native
    def setup(config: Config): typings.featherlight.Featherlight.Featherlight = js.native
    def setup(target: String): typings.featherlight.Featherlight.Featherlight = js.native
    def setup(target: String, config: Config): typings.featherlight.Featherlight.Featherlight = js.native
    def setup(target: JQuery): typings.featherlight.Featherlight.Featherlight = js.native
    def setup(target: JQuery, config: Config): typings.featherlight.Featherlight.Featherlight = js.native
    
    var target: JQuery | String = js.native
  }
  
  @js.native
  trait FeatherlightStatic
    extends StObject
       with Instantiable0[typings.featherlight.Featherlight.Featherlight]
       with Instantiable1[
          (/* config */ Config) | (/* $content */ JQuery) | (/* $content */ String), 
          typings.featherlight.Featherlight.Featherlight
        ]
       with Instantiable2[
          (/* $content */ JQuery) | (/* $content */ String), 
          /* config */ Config, 
          typings.featherlight.Featherlight.Featherlight
        ] {
    
    def apply(): typings.featherlight.Featherlight.Featherlight = js.native
    def apply($content: String): typings.featherlight.Featherlight.Featherlight = js.native
    def apply($content: String, config: Config): typings.featherlight.Featherlight.Featherlight = js.native
    def apply($content: JQuery): typings.featherlight.Featherlight.Featherlight = js.native
    def apply($content: JQuery, config: Config): typings.featherlight.Featherlight.Featherlight = js.native
    def apply(config: Config): typings.featherlight.Featherlight.Featherlight = js.native
    
    def attach($source: JQuery): JQuery = js.native
    def attach($source: JQuery, $content: String): JQuery = js.native
    def attach($source: JQuery, $content: String, config: Config): JQuery = js.native
    def attach($source: JQuery, $content: JQuery): JQuery = js.native
    def attach($source: JQuery, $content: JQuery, config: Config): JQuery = js.native
    def attach($source: JQuery, config: Config): JQuery = js.native
    
    var autoBind: Boolean | String = js.native
    
    def close(): JQueryPromise[JQuery] = js.native
    
    var contentFilters: ContentFilters = js.native
    
    def current(): typings.featherlight.Featherlight.Featherlight = js.native
    
    var defaults: Config = js.native
    
    def extend(child: js.Any, defaults: js.Any): js.Any = js.native
    
    var functionAttributes: js.Array[String] = js.native
    
    var id: Double = js.native
    
    def opened(): js.Array[typings.featherlight.Featherlight.Featherlight] = js.native
    
    def readElementConfig(element: HTMLElement, namespace: String): js.Any = js.native
  }
  
  @js.native
  trait JQueryExtension extends StObject {
    
    def apply(): JQuery = js.native
    def apply($content: String): JQuery = js.native
    def apply($content: String, config: Config): JQuery = js.native
    def apply($content: JQuery): JQuery = js.native
    def apply($content: JQuery, config: Config): JQuery = js.native
    def apply(config: Config): JQuery = js.native
  }
}

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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Featherlight {
  
  @js.native
  trait Config extends StObject {
    
    var afterClose: js.UndefOr[js.Function1[/* event */ JQueryEventObject, _]] = js.native
    
    var afterContent: js.UndefOr[js.Function1[/* event */ JQueryEventObject, _]] = js.native
    
    var afterOpen: js.UndefOr[js.Function1[/* event */ JQueryEventObject, _]] = js.native
    
    var ajax: js.UndefOr[String] = js.native
    
    var background: js.UndefOr[String] = js.native
    
    var beforeClose: js.UndefOr[js.Function1[/* event */ JQueryEventObject, _]] = js.native
    
    var beforeContent: js.UndefOr[js.Function1[/* event */ JQueryEventObject, _]] = js.native
    
    var beforeOpen: js.UndefOr[js.Function1[/* event */ JQueryEventObject, _]] = js.native
    
    var closeIcon: js.UndefOr[String] = js.native
    
    var closeOnClick: js.UndefOr[Boolean | String] = js.native
    
    var closeOnEsc: js.UndefOr[Boolean] = js.native
    
    var closeSpeed: js.UndefOr[Double | String] = js.native
    
    var closeTrigger: js.UndefOr[String] = js.native
    
    var contentFilters: js.UndefOr[js.Any] = js.native
    
    var filter: js.UndefOr[String] = js.native
    
    var html: js.UndefOr[String] = js.native
    
    var image: js.UndefOr[String] = js.native
    
    var jquery: js.UndefOr[JQuery] = js.native
    
    var loading: js.UndefOr[String] = js.native
    
    var namespace: js.UndefOr[String] = js.native
    
    var onKeyUp: js.UndefOr[js.Function1[/* event */ JQueryEventObject, _]] = js.native
    
    var onResize: js.UndefOr[js.Function1[/* event */ JQueryEventObject, _]] = js.native
    
    var openSpeed: js.UndefOr[Double | String] = js.native
    
    var openTrigger: js.UndefOr[String] = js.native
    
    var otherClose: js.UndefOr[String] = js.native
    
    var persist: js.UndefOr[Boolean | String] = js.native
    
    var resetCss: js.UndefOr[Boolean] = js.native
    
    var root: js.UndefOr[String] = js.native
    
    var targetAttr: js.UndefOr[String] = js.native
    
    var text: js.UndefOr[String] = js.native
    
    var `type`: js.UndefOr[String] = js.native
    
    var variant: js.UndefOr[String] = js.native
  }
  object Config {
    
    @scala.inline
    def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterClose(value: /* event */ JQueryEventObject => _): Self = StObject.set(x, "afterClose", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAfterCloseUndefined: Self = StObject.set(x, "afterClose", js.undefined)
      
      @scala.inline
      def setAfterContent(value: /* event */ JQueryEventObject => _): Self = StObject.set(x, "afterContent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAfterContentUndefined: Self = StObject.set(x, "afterContent", js.undefined)
      
      @scala.inline
      def setAfterOpen(value: /* event */ JQueryEventObject => _): Self = StObject.set(x, "afterOpen", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAfterOpenUndefined: Self = StObject.set(x, "afterOpen", js.undefined)
      
      @scala.inline
      def setAjax(value: String): Self = StObject.set(x, "ajax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAjaxUndefined: Self = StObject.set(x, "ajax", js.undefined)
      
      @scala.inline
      def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      @scala.inline
      def setBeforeClose(value: /* event */ JQueryEventObject => _): Self = StObject.set(x, "beforeClose", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforeCloseUndefined: Self = StObject.set(x, "beforeClose", js.undefined)
      
      @scala.inline
      def setBeforeContent(value: /* event */ JQueryEventObject => _): Self = StObject.set(x, "beforeContent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforeContentUndefined: Self = StObject.set(x, "beforeContent", js.undefined)
      
      @scala.inline
      def setBeforeOpen(value: /* event */ JQueryEventObject => _): Self = StObject.set(x, "beforeOpen", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforeOpenUndefined: Self = StObject.set(x, "beforeOpen", js.undefined)
      
      @scala.inline
      def setCloseIcon(value: String): Self = StObject.set(x, "closeIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseIconUndefined: Self = StObject.set(x, "closeIcon", js.undefined)
      
      @scala.inline
      def setCloseOnClick(value: Boolean | String): Self = StObject.set(x, "closeOnClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseOnClickUndefined: Self = StObject.set(x, "closeOnClick", js.undefined)
      
      @scala.inline
      def setCloseOnEsc(value: Boolean): Self = StObject.set(x, "closeOnEsc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseOnEscUndefined: Self = StObject.set(x, "closeOnEsc", js.undefined)
      
      @scala.inline
      def setCloseSpeed(value: Double | String): Self = StObject.set(x, "closeSpeed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseSpeedUndefined: Self = StObject.set(x, "closeSpeed", js.undefined)
      
      @scala.inline
      def setCloseTrigger(value: String): Self = StObject.set(x, "closeTrigger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseTriggerUndefined: Self = StObject.set(x, "closeTrigger", js.undefined)
      
      @scala.inline
      def setContentFilters(value: js.Any): Self = StObject.set(x, "contentFilters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentFiltersUndefined: Self = StObject.set(x, "contentFilters", js.undefined)
      
      @scala.inline
      def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      
      @scala.inline
      def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      @scala.inline
      def setJquery(value: JQuery): Self = StObject.set(x, "jquery", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJqueryUndefined: Self = StObject.set(x, "jquery", js.undefined)
      
      @scala.inline
      def setLoading(value: String): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      @scala.inline
      def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
      
      @scala.inline
      def setOnKeyUp(value: /* event */ JQueryEventObject => _): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      @scala.inline
      def setOnResize(value: /* event */ JQueryEventObject => _): Self = StObject.set(x, "onResize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResizeUndefined: Self = StObject.set(x, "onResize", js.undefined)
      
      @scala.inline
      def setOpenSpeed(value: Double | String): Self = StObject.set(x, "openSpeed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenSpeedUndefined: Self = StObject.set(x, "openSpeed", js.undefined)
      
      @scala.inline
      def setOpenTrigger(value: String): Self = StObject.set(x, "openTrigger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenTriggerUndefined: Self = StObject.set(x, "openTrigger", js.undefined)
      
      @scala.inline
      def setOtherClose(value: String): Self = StObject.set(x, "otherClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOtherCloseUndefined: Self = StObject.set(x, "otherClose", js.undefined)
      
      @scala.inline
      def setPersist(value: Boolean | String): Self = StObject.set(x, "persist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPersistUndefined: Self = StObject.set(x, "persist", js.undefined)
      
      @scala.inline
      def setResetCss(value: Boolean): Self = StObject.set(x, "resetCss", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResetCssUndefined: Self = StObject.set(x, "resetCss", js.undefined)
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      @scala.inline
      def setTargetAttr(value: String): Self = StObject.set(x, "targetAttr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetAttrUndefined: Self = StObject.set(x, "targetAttr", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setVariant(value: String): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
    }
  }
  
  @js.native
  trait ContentFilter extends StObject {
    
    var process: js.UndefOr[js.Function1[/* data */ JQuery | String, JQuery | JQueryPromise[JQuery]]] = js.native
    
    var regex: js.UndefOr[RegExp] = js.native
    
    var test: js.UndefOr[js.Function1[/* data */ JQuery | String, Boolean]] = js.native
  }
  object ContentFilter {
    
    @scala.inline
    def apply(): ContentFilter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContentFilter]
    }
    
    @scala.inline
    implicit class ContentFilterMutableBuilder[Self <: ContentFilter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProcess(value: /* data */ JQuery | String => JQuery | JQueryPromise[JQuery]): Self = StObject.set(x, "process", js.Any.fromFunction1(value))
      
      @scala.inline
      def setProcessUndefined: Self = StObject.set(x, "process", js.undefined)
      
      @scala.inline
      def setRegex(value: RegExp): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
      
      @scala.inline
      def setTest(value: /* data */ JQuery | String => Boolean): Self = StObject.set(x, "test", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
    }
  }
  
  type ContentFilters = StringDictionary[ContentFilter]
  
  @js.native
  trait Featherlight extends Config {
    
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
    extends Instantiable0[typings.featherlight.Featherlight.Featherlight]
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

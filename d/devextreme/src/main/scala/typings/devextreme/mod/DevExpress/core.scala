package typings.devextreme.mod.DevExpress

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.devextreme.anon.Container
import typings.devextreme.anon.Then
import typings.devextreme.devextremeStrings.orientationChanged
import typings.devextreme.mod.global.JQuery
import typings.devextreme.mod.global.JQueryEventObject
import typings.devextreme.mod.global.JQueryPromise
import typings.std.Element
import typings.std.Exclude
import typings.std.HTMLElement
import typings.std.Pick
import typings.std.Record
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object core {
  
  /**
    * @deprecated Attention! This type is for internal purposes only. If you used it previously, please submit a ticket to our {@link https://supportcenter.devexpress.com/ticket/create Support Center}. We will check if there is an alternative solution.
    */
  @js.native
  trait ComponentFactory[TComponent]
    extends StObject
       with Instantiable1[/* element */ UserDefinedElement[Element], TComponent]
       with Instantiable2[
          /* element */ UserDefinedElement[Element], 
          /* options */ Record[String, Any], 
          TComponent
        ] {
    
    def getInstance(element: UserDefinedElement[Element]): TComponent = js.native
  }
  
  /**
    * @deprecated Attention! This type is for internal purposes only. If you used it previously, please submit a ticket to our {@link https://supportcenter.devexpress.com/ticket/create Support Center}. We will check if there is an alternative solution.
    */
  type Condition = JQueryEventObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends object ? {[ P in keyof T ]:? T[P] extends std.Function? T[P] : devextreme.devextreme.DevExpress.core.DeepPartial<T[P]>} : T
    }}}
    */
  @js.native
  trait DeepPartial[T] extends StObject
  
  trait DefaultOptionsRule[T] extends StObject {
    
    var device: js.UndefOr[Device | js.Array[Device] | (js.Function1[/* device */ Device, Boolean])] = js.undefined
    
    var options: DeepPartial[T]
  }
  object DefaultOptionsRule {
    
    inline def apply[T](options: DeepPartial[T]): DefaultOptionsRule[T] = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultOptionsRule[T]]
    }
    
    extension [Self <: DefaultOptionsRule[?], T](x: Self & DefaultOptionsRule[T]) {
      
      inline def setDevice(value: Device | js.Array[Device] | (js.Function1[/* device */ Device, Boolean])): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
      
      inline def setDeviceFunction1(value: /* device */ Device => Boolean): Self = StObject.set(x, "device", js.Any.fromFunction1(value))
      
      inline def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
      
      inline def setDeviceVarargs(value: Device*): Self = StObject.set(x, "device", js.Array(value*))
      
      inline def setOptions(value: DeepPartial[T]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {} extends devextreme.devextreme.DevExpress.core.Condition ? T : devextreme.devextreme.DevExpress.core.ElementWrapper<T>
    }}}
    */
  @js.native
  trait DxElement_[T /* <: Element */] extends StObject
  
  /**
    * @deprecated Attention! This type is for internal purposes only. If you used it previously, please submit a ticket to our {@link https://supportcenter.devexpress.com/ticket/create Support Center}. We will check if there is an alternative solution.
    */
  type ElementWrapper[T /* <: Element */] = JQuery[T]
  
  /**
    * @deprecated Attention! This type is for internal purposes only. If you used it previously, please submit a ticket to our {@link https://supportcenter.devexpress.com/ticket/create Support Center}. We will check if there is an alternative solution.
    */
  type ElementsArrayWrapper[T /* <: Element */] = JQuery[T]
  
  /**
    * @deprecated Attention! This type is for internal purposes only. If you used it previously, please submit a ticket to our {@link https://supportcenter.devexpress.com/ticket/create Support Center}. We will check if there is an alternative solution.
    */
  type EventName = orientationChanged
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.auto
    - typings.devextreme.devextremeStrings.up
    - typings.devextreme.devextremeStrings.down
  */
  trait FloatingActionButtonDirection extends StObject
  object FloatingActionButtonDirection {
    
    inline def auto: typings.devextreme.devextremeStrings.auto = "auto".asInstanceOf[typings.devextreme.devextremeStrings.auto]
    
    inline def down: typings.devextreme.devextremeStrings.down = "down".asInstanceOf[typings.devextreme.devextremeStrings.down]
    
    inline def up: typings.devextreme.devextremeStrings.up = "up".asInstanceOf[typings.devextreme.devextremeStrings.up]
  }
  
  trait FunctionTemplate extends StObject {
    
    def render(template: Container): DxElement_[HTMLElement]
  }
  object FunctionTemplate {
    
    inline def apply(render: Container => DxElement_[HTMLElement]): FunctionTemplate = {
      val __obj = js.Dynamic.literal(render = js.Any.fromFunction1(render))
      __obj.asInstanceOf[FunctionTemplate]
    }
    
    extension [Self <: FunctionTemplate](x: Self) {
      
      inline def setRender(value: Container => DxElement_[HTMLElement]): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * @deprecated Attention! This type is for internal purposes only. If you used it previously, please submit a ticket to our {@link https://supportcenter.devexpress.com/ticket/create Support Center}. We will check if there is an alternative solution.
    */
  type PromiseType[T] = JQueryPromise[T]
  
  type Skip[T, K /* <: /* keyof T */ String */] = Pick[T, Exclude[/* keyof T */ String, K]]
  
  trait TemplateManager extends StObject {
    
    def addDefaultTemplates(templates: Record[String, Any]): Unit
    
    var anonymousTemplateName: String
  }
  object TemplateManager {
    
    inline def apply(addDefaultTemplates: Record[String, Any] => Unit, anonymousTemplateName: String): TemplateManager = {
      val __obj = js.Dynamic.literal(addDefaultTemplates = js.Any.fromFunction1(addDefaultTemplates), anonymousTemplateName = anonymousTemplateName.asInstanceOf[js.Any])
      __obj.asInstanceOf[TemplateManager]
    }
    
    extension [Self <: TemplateManager](x: Self) {
      
      inline def setAddDefaultTemplates(value: Record[String, Any] => Unit): Self = StObject.set(x, "addDefaultTemplates", js.Any.fromFunction1(value))
      
      inline def setAnonymousTemplateName(value: String): Self = StObject.set(x, "anonymousTemplateName", value.asInstanceOf[js.Any])
    }
  }
  
  trait Template_ extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {} extends devextreme.devextreme.DevExpress.core.Condition ? T : devextreme.devextreme.DevExpress.core.ElementWrapper<T> | T
    }}}
    */
  @js.native
  trait UserDefinedElement[T /* <: Element */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {} extends devextreme.devextreme.DevExpress.core.Condition ? std.Array<std.Element> : devextreme.devextreme.DevExpress.core.ElementsArrayWrapper<std.Element>
    }}}
    */
  @js.native
  trait UserDefinedElementsArray extends StObject
  
  type dxElement = DxElement_[HTMLElement]
  
  type dxSVGElement = DxElement_[SVGElement]
  
  type dxTemplate = Template_
  
  trait dxTemplateOptions extends StObject {
    
    /**
      * Specifies the name of the template.
      */
    var name: js.UndefOr[String] = js.undefined
  }
  object dxTemplateOptions {
    
    inline def apply(): dxTemplateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[dxTemplateOptions]
    }
    
    extension [Self <: dxTemplateOptions](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  type template = String | js.Function | UserDefinedElement[Element]
  
  object utils {
    
    type DxExtendedPromise[T] = DxPromise[T] & Then[T]
    
    /** NOTE: Conditional type definitions are impossible to translate to Scala.
      * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
      * You'll have to cast your way around this structure, unfortunately. 
      * TS definition: {{{
      {} extends devextreme.devextreme.DevExpress.core.PromiseType<T> ? std.Promise<T> : devextreme.devextreme.DevExpress.core.PromiseType<T>
      }}}
      */
    @js.native
    trait DxPromise[T] extends StObject
  }
}

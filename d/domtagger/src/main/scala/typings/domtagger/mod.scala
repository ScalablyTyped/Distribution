package typings.domtagger

import typings.domtagger.domtaggerStrings.svg
import typings.std.Attr
import typings.std.ChildNode
import typings.std.Element
import typings.std.HTMLElement
import typings.std.Node
import typings.std.SVGElement
import typings.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("domtagger", JSImport.Namespace)
  @js.native
  def apply(opts: Options): js.Function2[/* template */ TemplateStringsArray, /* repeated */ js.Any, HTMLElement] = js.native
  @JSImport("domtagger", JSImport.Namespace)
  @js.native
  def apply(opts: SVGOptions): js.Function2[/* template */ TemplateStringsArray, /* repeated */ js.Any, SVGElement] = js.native
  
  @js.native
  trait Options extends StObject {
    
    /**
      * Called when no other node type satisfies the parsed result.
      *
      * @param node The node
      * @param childNodes
      */
    def any(node: Node, childNodes: js.Array[ChildNode]): js.Function1[/* markup */ js.Any, Unit] = js.native
    
    /**
      * Called when the parsed result is an attribute node.
      *
      * @param element The element whose attribute to set.
      * @param name The raw attribute name.
      * @param attribute The attribute node.
      *
      * @example
      * ```ts
      * (node, name, attribute) => value => {
      *     const type = typeof value;
      *     if (type === 'boolean' || type === 'function') {
      *         node[name] = value;
      *     } else if (value == null) {
      *         node.removeAttribute(name);
      *     } else {
      *         node.setAttribute(name, value);
      *     }
      * }
      * ```
      */
    def attribute(element: Element, name: String, attribute: Attr): js.Function1[/* value */ js.Any, Unit] = js.native
    
    /**
      * Used to provide a custom algorithm for converting a template
      * to a valid HTML text.
      */
    var convert: js.UndefOr[js.Function1[/* template */ TemplateStringsArray, String]] = js.native
    
    /**
      * How to handle cases where content can only be some text.
      *
      * The node is one that can only have text.
      *
      * @param node The node whose text content to set
      *
      * @example
      * ```ts
      * node => textContent => {
      *     node.textContent = textContent;
      * }
      * ```
      */
    def text(node: Node): js.Function1[/* textContent */ js.Any, Unit] = js.native
    
    /**
      * Used to postprocess the result of `convert`.
      *
      * @param transform The default transformation.
      */
    var transform: js.UndefOr[js.Function1[/* markup */ String, String]] = js.native
    
    /**
      * The type of content to create.
      *
      * When `'svg'`, the generated template function returns `SVGElement` instances.
      *
      * @default 'html'
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(
      any: (Node, js.Array[ChildNode]) => js.Function1[/* markup */ js.Any, Unit],
      attribute: (Element, String, Attr) => js.Function1[/* value */ js.Any, Unit],
      text: Node => js.Function1[/* textContent */ js.Any, Unit]
    ): Options = {
      val __obj = js.Dynamic.literal(any = js.Any.fromFunction2(any), attribute = js.Any.fromFunction3(attribute), text = js.Any.fromFunction1(text))
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAny(value: (Node, js.Array[ChildNode]) => js.Function1[/* markup */ js.Any, Unit]): Self = StObject.set(x, "any", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAttribute(value: (Element, String, Attr) => js.Function1[/* value */ js.Any, Unit]): Self = StObject.set(x, "attribute", js.Any.fromFunction3(value))
      
      @scala.inline
      def setConvert(value: /* template */ TemplateStringsArray => String): Self = StObject.set(x, "convert", js.Any.fromFunction1(value))
      
      @scala.inline
      def setConvertUndefined: Self = StObject.set(x, "convert", js.undefined)
      
      @scala.inline
      def setText(value: Node => js.Function1[/* textContent */ js.Any, Unit]): Self = StObject.set(x, "text", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTransform(value: /* markup */ String => String): Self = StObject.set(x, "transform", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait SVGOptions extends Options {
    
    @JSName("type")
    var type_SVGOptions: svg = js.native
  }
  object SVGOptions {
    
    @scala.inline
    def apply(
      any: (Node, js.Array[ChildNode]) => js.Function1[/* markup */ js.Any, Unit],
      attribute: (Element, String, Attr) => js.Function1[/* value */ js.Any, Unit],
      text: Node => js.Function1[/* textContent */ js.Any, Unit],
      `type`: svg
    ): SVGOptions = {
      val __obj = js.Dynamic.literal(any = js.Any.fromFunction2(any), attribute = js.Any.fromFunction3(attribute), text = js.Any.fromFunction1(text))
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SVGOptions]
    }
    
    @scala.inline
    implicit class SVGOptionsMutableBuilder[Self <: SVGOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: svg): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}

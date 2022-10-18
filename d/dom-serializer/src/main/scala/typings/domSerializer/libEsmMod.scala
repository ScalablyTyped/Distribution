package typings.domSerializer

import typings.domSerializer.domSerializerStrings.foreign
import typings.domSerializer.domSerializerStrings.utf8
import typings.domhandler.libNodeMod.AnyNode
import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmMod {
  
  @JSImport("dom-serializer/lib/esm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(node: AnyNode): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def default(node: AnyNode, options: DomSerializerOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def default(node: ArrayLike[AnyNode]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def default(node: ArrayLike[AnyNode], options: DomSerializerOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def render(node: AnyNode): String = ^.asInstanceOf[js.Dynamic].applyDynamic("render")(node.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def render(node: AnyNode, options: DomSerializerOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(node.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def render(node: ArrayLike[AnyNode]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("render")(node.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def render(node: ArrayLike[AnyNode], options: DomSerializerOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(node.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait DomSerializerOptions extends StObject {
    
    /**
      * Option inherited from parsing; will be used as the default value for `encodeEntities`.
      *
      * @default true
      */
    var decodeEntities: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Print an empty attribute's value.
      *
      * @default xmlMode
      * @example With <code>emptyAttrs: false</code>: <code>&lt;input checked&gt;</code>
      * @example With <code>emptyAttrs: true</code>: <code>&lt;input checked=""&gt;</code>
      */
    var emptyAttrs: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Encode characters that are either reserved in HTML or XML.
      *
      * If `xmlMode` is `true` or the value not `'utf8'`, characters outside of the utf8 range will be encoded as well.
      *
      * @default `decodeEntities`
      */
    var encodeEntities: js.UndefOr[Boolean | utf8] = js.undefined
    
    /**
      * Print self-closing tags for tags without contents.
      *
      * @default xmlMode
      * @example With <code>selfClosingTags: false</code>: <code>&lt;foo&gt;&lt;/foo&gt;</code>
      * @example With <code>selfClosingTags: true</code>: <code>&lt;foo /&gt;</code>
      */
    var selfClosingTags: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Treat the input as an XML document; enables the `emptyAttrs` and `selfClosingTags` options.
      *
      * If the value is `"foreign"`, it will try to correct mixed-case attribute names.
      *
      * @default false
      */
    var xmlMode: js.UndefOr[Boolean | foreign] = js.undefined
  }
  object DomSerializerOptions {
    
    inline def apply(): DomSerializerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DomSerializerOptions]
    }
    
    extension [Self <: DomSerializerOptions](x: Self) {
      
      inline def setDecodeEntities(value: Boolean): Self = StObject.set(x, "decodeEntities", value.asInstanceOf[js.Any])
      
      inline def setDecodeEntitiesUndefined: Self = StObject.set(x, "decodeEntities", js.undefined)
      
      inline def setEmptyAttrs(value: Boolean): Self = StObject.set(x, "emptyAttrs", value.asInstanceOf[js.Any])
      
      inline def setEmptyAttrsUndefined: Self = StObject.set(x, "emptyAttrs", js.undefined)
      
      inline def setEncodeEntities(value: Boolean | utf8): Self = StObject.set(x, "encodeEntities", value.asInstanceOf[js.Any])
      
      inline def setEncodeEntitiesUndefined: Self = StObject.set(x, "encodeEntities", js.undefined)
      
      inline def setSelfClosingTags(value: Boolean): Self = StObject.set(x, "selfClosingTags", value.asInstanceOf[js.Any])
      
      inline def setSelfClosingTagsUndefined: Self = StObject.set(x, "selfClosingTags", js.undefined)
      
      inline def setXmlMode(value: Boolean | foreign): Self = StObject.set(x, "xmlMode", value.asInstanceOf[js.Any])
      
      inline def setXmlModeUndefined: Self = StObject.set(x, "xmlMode", js.undefined)
    }
  }
}

package typings.emberAutoImport

import typings.node.fsMod.ReadStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsAnalyzerSyntaxMod {
  
  @JSImport("ember-auto-import/js/analyzer-syntax", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ember-auto-import/js/analyzer-syntax", "MARKER")
  @js.native
  val MARKER: /* "eaimeta@70e063a35619d71f" */ String = js.native
  
  inline def deserialize(source: ReadStream): js.Promise[js.Array[ImportSyntax]] = ^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(source.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[ImportSyntax]]]
  
  inline def serialize(imports: js.Array[ImportSyntax]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(imports.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - typings.emberAutoImport.jsAnalyzerSyntaxMod.LiteralImportSyntax
    - typings.emberAutoImport.jsAnalyzerSyntaxMod.TemplateImportSyntax
  */
  trait ImportSyntax extends StObject
  object ImportSyntax {
    
    inline def LiteralImportSyntax(isDynamic: Boolean, specifier: String): typings.emberAutoImport.jsAnalyzerSyntaxMod.LiteralImportSyntax = {
      val __obj = js.Dynamic.literal(isDynamic = isDynamic.asInstanceOf[js.Any], specifier = specifier.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.emberAutoImport.jsAnalyzerSyntaxMod.LiteralImportSyntax]
    }
    
    inline def TemplateImportSyntax(cookedQuasis: js.Array[String], expressionNameHints: js.Array[String | Null], isDynamic: Boolean): typings.emberAutoImport.jsAnalyzerSyntaxMod.TemplateImportSyntax = {
      val __obj = js.Dynamic.literal(cookedQuasis = cookedQuasis.asInstanceOf[js.Any], expressionNameHints = expressionNameHints.asInstanceOf[js.Any], isDynamic = isDynamic.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.emberAutoImport.jsAnalyzerSyntaxMod.TemplateImportSyntax]
    }
  }
  
  trait LiteralImportSyntax
    extends StObject
       with ImportSyntax {
    
    var isDynamic: Boolean
    
    var specifier: String
  }
  object LiteralImportSyntax {
    
    inline def apply(isDynamic: Boolean, specifier: String): LiteralImportSyntax = {
      val __obj = js.Dynamic.literal(isDynamic = isDynamic.asInstanceOf[js.Any], specifier = specifier.asInstanceOf[js.Any])
      __obj.asInstanceOf[LiteralImportSyntax]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LiteralImportSyntax] (val x: Self) extends AnyVal {
      
      inline def setIsDynamic(value: Boolean): Self = StObject.set(x, "isDynamic", value.asInstanceOf[js.Any])
      
      inline def setSpecifier(value: String): Self = StObject.set(x, "specifier", value.asInstanceOf[js.Any])
    }
  }
  
  trait TemplateImportSyntax
    extends StObject
       with ImportSyntax {
    
    var cookedQuasis: js.Array[String]
    
    var expressionNameHints: js.Array[String | Null]
    
    var isDynamic: Boolean
  }
  object TemplateImportSyntax {
    
    inline def apply(cookedQuasis: js.Array[String], expressionNameHints: js.Array[String | Null], isDynamic: Boolean): TemplateImportSyntax = {
      val __obj = js.Dynamic.literal(cookedQuasis = cookedQuasis.asInstanceOf[js.Any], expressionNameHints = expressionNameHints.asInstanceOf[js.Any], isDynamic = isDynamic.asInstanceOf[js.Any])
      __obj.asInstanceOf[TemplateImportSyntax]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TemplateImportSyntax] (val x: Self) extends AnyVal {
      
      inline def setCookedQuasis(value: js.Array[String]): Self = StObject.set(x, "cookedQuasis", value.asInstanceOf[js.Any])
      
      inline def setCookedQuasisVarargs(value: String*): Self = StObject.set(x, "cookedQuasis", js.Array(value*))
      
      inline def setExpressionNameHints(value: js.Array[String | Null]): Self = StObject.set(x, "expressionNameHints", value.asInstanceOf[js.Any])
      
      inline def setExpressionNameHintsVarargs(value: (String | Null)*): Self = StObject.set(x, "expressionNameHints", js.Array(value*))
      
      inline def setIsDynamic(value: Boolean): Self = StObject.set(x, "isDynamic", value.asInstanceOf[js.Any])
    }
  }
}

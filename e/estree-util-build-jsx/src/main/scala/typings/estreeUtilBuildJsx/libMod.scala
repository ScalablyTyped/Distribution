package typings.estreeUtilBuildJsx

import typings.estreeUtilBuildJsx.estreeUtilBuildJsxStrings.automatic
import typings.estreeUtilBuildJsx.estreeUtilBuildJsxStrings.classic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("estree-util-build-jsx/lib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buildJsx[T /* <: typings.estree.mod.Node */](tree: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("buildJsx")(tree.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def buildJsx[T /* <: typings.estree.mod.Node */](tree: T, options: Options): T = (^.asInstanceOf[js.Dynamic].applyDynamic("buildJsx")(tree.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
  
  trait Annotations extends StObject {
    
    var jsx: js.UndefOr[String] = js.undefined
    
    var jsxFrag: js.UndefOr[String] = js.undefined
    
    var jsxImportSource: js.UndefOr[String] = js.undefined
    
    var jsxRuntime: js.UndefOr[automatic | classic] = js.undefined
  }
  object Annotations {
    
    inline def apply(): Annotations = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Annotations]
    }
    
    extension [Self <: Annotations](x: Self) {
      
      inline def setJsx(value: String): Self = StObject.set(x, "jsx", value.asInstanceOf[js.Any])
      
      inline def setJsxFrag(value: String): Self = StObject.set(x, "jsxFrag", value.asInstanceOf[js.Any])
      
      inline def setJsxFragUndefined: Self = StObject.set(x, "jsxFrag", js.undefined)
      
      inline def setJsxImportSource(value: String): Self = StObject.set(x, "jsxImportSource", value.asInstanceOf[js.Any])
      
      inline def setJsxImportSourceUndefined: Self = StObject.set(x, "jsxImportSource", js.undefined)
      
      inline def setJsxRuntime(value: automatic | classic): Self = StObject.set(x, "jsxRuntime", value.asInstanceOf[js.Any])
      
      inline def setJsxRuntimeUndefined: Self = StObject.set(x, "jsxRuntime", js.undefined)
      
      inline def setJsxUndefined: Self = StObject.set(x, "jsx", js.undefined)
    }
  }
  
  type Comment = typings.std.Comment
  
  type Expression = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_estree-jsx.Expression */ Any
  
  type Identifier = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_estree-jsx.Identifier */ Any
  
  type ImportSpecifier = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_estree-jsx.ImportSpecifier */ Any
  
  type JSXAttribute = typings.estreeJsx.mod.JSXAttribute
  
  type JSXElement = typings.estreeJsx.mod.JSXElement
  
  type JSXEmptyExpression = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_estree-jsx.JSXEmptyExpression */ Any
  
  type JSXExpressionContainer = typings.estreeJsx.mod.JSXExpressionContainer
  
  type JSXFragment = typings.estreeJsx.mod.JSXFragment
  
  type JSXIdentifier = typings.estreeJsx.mod.JSXIdentifier
  
  type JSXMemberExpression = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_estree-jsx.JSXMemberExpression */ Any
  
  type JSXNamespacedName = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_estree-jsx.JSXNamespacedName */ Any
  
  type JSXSpreadAttribute = typings.estreeJsx.mod.JSXSpreadAttribute
  
  type JSXSpreadChild = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_estree-jsx.JSXSpreadChild */ Any
  
  type JSXText = typings.estreeJsx.mod.JSXText
  
  type Literal = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_estree-jsx.Literal */ Any
  
  type MemberExpression = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_estree-jsx.MemberExpression */ Any
  
  type Node = typings.std.Node
  
  type ObjectExpression = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_estree-jsx.ObjectExpression */ Any
  
  trait Options extends StObject {
    
    var development: js.UndefOr[Boolean] = js.undefined
    
    var filePath: js.UndefOr[String] = js.undefined
    
    var importSource: js.UndefOr[String] = js.undefined
    
    var pragma: js.UndefOr[String] = js.undefined
    
    var pragmaFrag: js.UndefOr[String] = js.undefined
    
    var runtime: js.UndefOr[automatic | classic] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDevelopment(value: Boolean): Self = StObject.set(x, "development", value.asInstanceOf[js.Any])
      
      inline def setDevelopmentUndefined: Self = StObject.set(x, "development", js.undefined)
      
      inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
      
      inline def setFilePathUndefined: Self = StObject.set(x, "filePath", js.undefined)
      
      inline def setImportSource(value: String): Self = StObject.set(x, "importSource", value.asInstanceOf[js.Any])
      
      inline def setImportSourceUndefined: Self = StObject.set(x, "importSource", js.undefined)
      
      inline def setPragma(value: String): Self = StObject.set(x, "pragma", value.asInstanceOf[js.Any])
      
      inline def setPragmaFrag(value: String): Self = StObject.set(x, "pragmaFrag", value.asInstanceOf[js.Any])
      
      inline def setPragmaFragUndefined: Self = StObject.set(x, "pragmaFrag", js.undefined)
      
      inline def setPragmaUndefined: Self = StObject.set(x, "pragma", js.undefined)
      
      inline def setRuntime(value: automatic | classic): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
      
      inline def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
    }
  }
  
  type Pattern = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_estree-jsx.Pattern */ Any
  
  type Property = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_estree-jsx.Property */ Any
  
  type SpreadElement = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_estree-jsx.SpreadElement */ Any
  
  type SyncHandler = typings.estreeWalker.mod.SyncHandler
}

package typings.estreeUtilBuildJsx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("estree-util-build-jsx/lib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buildJsx[Tree /* <: typings.estree.mod.Node */](tree: Tree): Tree = ^.asInstanceOf[js.Dynamic].applyDynamic("buildJsx")(tree.asInstanceOf[js.Any]).asInstanceOf[Tree]
  inline def buildJsx[Tree /* <: typings.estree.mod.Node */](tree: Tree, options: Options): Tree = (^.asInstanceOf[js.Dynamic].applyDynamic("buildJsx")(tree.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Tree]
  
  trait Annotations extends StObject {
    
    /**
      * JSX identifier (`pragma`).
      */
    var jsx: js.UndefOr[String] = js.undefined
    
    /**
      * JSX identifier of fragment (`pragmaFrag`).
      */
    var jsxFrag: js.UndefOr[String] = js.undefined
    
    /**
      * Where to import an automatic JSX runtime from.
      */
    var jsxImportSource: js.UndefOr[String] = js.undefined
    
    /**
      * Runtime.
      */
    var jsxRuntime: js.UndefOr[Runtime] = js.undefined
  }
  object Annotations {
    
    inline def apply(): Annotations = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Annotations]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Annotations] (val x: Self) extends AnyVal {
      
      inline def setJsx(value: String): Self = StObject.set(x, "jsx", value.asInstanceOf[js.Any])
      
      inline def setJsxFrag(value: String): Self = StObject.set(x, "jsxFrag", value.asInstanceOf[js.Any])
      
      inline def setJsxFragUndefined: Self = StObject.set(x, "jsxFrag", js.undefined)
      
      inline def setJsxImportSource(value: String): Self = StObject.set(x, "jsxImportSource", value.asInstanceOf[js.Any])
      
      inline def setJsxImportSourceUndefined: Self = StObject.set(x, "jsxImportSource", js.undefined)
      
      inline def setJsxRuntime(value: Runtime): Self = StObject.set(x, "jsxRuntime", value.asInstanceOf[js.Any])
      
      inline def setJsxRuntimeUndefined: Self = StObject.set(x, "jsxRuntime", js.undefined)
      
      inline def setJsxUndefined: Self = StObject.set(x, "jsx", js.undefined)
    }
  }
  
  type Expression = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_estree-jsx.Expression */ Any
  
  type Identifier = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_estree-jsx.Identifier */ Any
  
  type ImportSpecifier = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_estree-jsx.ImportSpecifier */ Any
  
  trait Imports extends StObject {
    
    /**
      * Symbol of `Fragment`.
      */
    var fragment: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Symbol of `jsx`.
      */
    var jsx: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Symbol of `jsxDEV`.
      */
    var jsxDEV: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Symbol of `jsxs`.
      */
    var jsxs: js.UndefOr[Boolean] = js.undefined
  }
  object Imports {
    
    inline def apply(): Imports = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Imports]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Imports] (val x: Self) extends AnyVal {
      
      inline def setFragment(value: Boolean): Self = StObject.set(x, "fragment", value.asInstanceOf[js.Any])
      
      inline def setFragmentUndefined: Self = StObject.set(x, "fragment", js.undefined)
      
      inline def setJsx(value: Boolean): Self = StObject.set(x, "jsx", value.asInstanceOf[js.Any])
      
      inline def setJsxDEV(value: Boolean): Self = StObject.set(x, "jsxDEV", value.asInstanceOf[js.Any])
      
      inline def setJsxDEVUndefined: Self = StObject.set(x, "jsxDEV", js.undefined)
      
      inline def setJsxUndefined: Self = StObject.set(x, "jsx", js.undefined)
      
      inline def setJsxs(value: Boolean): Self = StObject.set(x, "jsxs", value.asInstanceOf[js.Any])
      
      inline def setJsxsUndefined: Self = StObject.set(x, "jsxs", js.undefined)
    }
  }
  
  type JSXAttribute = typings.estreeJsx.mod.JSXAttribute
  
  type JSXIdentifier = typings.estreeJsx.mod.JSXIdentifier
  
  type JSXMemberExpression = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_estree-jsx.JSXMemberExpression */ Any
  
  type JSXNamespacedName = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_estree-jsx.JSXNamespacedName */ Any
  
  type Literal = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_estree-jsx.Literal */ Any
  
  type MemberExpression = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_estree-jsx.MemberExpression */ Any
  
  type Node = typings.std.Node
  
  type ObjectExpression = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_estree-jsx.ObjectExpression */ Any
  
  trait Options extends StObject {
    
    /**
      * When in the automatic runtime, whether to import
      * `theSource/jsx-dev-runtime.js`, use `jsxDEV`, and pass location info when
      * available.
      *
      * This helps debugging but adds a lot of code that you don’t want in
      * production.
      */
    var development: js.UndefOr[Boolean | Null] = js.undefined
    
    /**
      * File path to the original source file.
      *
      * Passed in location info to `jsxDEV` when using the automatic runtime with
      * `development: true`.
      */
    var filePath: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Place to import `jsx`, `jsxs`, `jsxDEV`, and `Fragment` from, when the
      * effective runtime is automatic.
      *
      * Comment form: `@jsxImportSource theSource`.
      *
      * > 👉 **Note**: `/jsx-runtime` or `/jsx-dev-runtime` is appended to this
      * > provided source.
      * > In CJS, that can resolve to a file (as in `theSource/jsx-runtime.js`),
      * > but for ESM an export map needs to be set up to point to files:
      * >
      * > ```js
      * > // …
      * > "exports": {
      * >   // …
      * >   "./jsx-runtime": "./path/to/jsx-runtime.js",
      * >   "./jsx-dev-runtime": "./path/to/jsx-runtime.js"
      * >   // …
      * > ```
      */
    var importSource: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Identifier or member expression to call when the effective runtime is
      * classic.
      *
      * Comment form: `@jsx identifier`.
      */
    var pragma: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Identifier or member expression to use as a symbol for fragments when the
      * effective runtime is classic.
      *
      * Comment form: `@jsxFrag identifier`.
      */
    var pragmaFrag: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Choose the runtime.
      *
      * Comment form: `@jsxRuntime theRuntime`.
      */
    var runtime: js.UndefOr[Runtime | Null] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setDevelopment(value: Boolean): Self = StObject.set(x, "development", value.asInstanceOf[js.Any])
      
      inline def setDevelopmentNull: Self = StObject.set(x, "development", null)
      
      inline def setDevelopmentUndefined: Self = StObject.set(x, "development", js.undefined)
      
      inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
      
      inline def setFilePathNull: Self = StObject.set(x, "filePath", null)
      
      inline def setFilePathUndefined: Self = StObject.set(x, "filePath", js.undefined)
      
      inline def setImportSource(value: String): Self = StObject.set(x, "importSource", value.asInstanceOf[js.Any])
      
      inline def setImportSourceNull: Self = StObject.set(x, "importSource", null)
      
      inline def setImportSourceUndefined: Self = StObject.set(x, "importSource", js.undefined)
      
      inline def setPragma(value: String): Self = StObject.set(x, "pragma", value.asInstanceOf[js.Any])
      
      inline def setPragmaFrag(value: String): Self = StObject.set(x, "pragmaFrag", value.asInstanceOf[js.Any])
      
      inline def setPragmaFragNull: Self = StObject.set(x, "pragmaFrag", null)
      
      inline def setPragmaFragUndefined: Self = StObject.set(x, "pragmaFrag", js.undefined)
      
      inline def setPragmaNull: Self = StObject.set(x, "pragma", null)
      
      inline def setPragmaUndefined: Self = StObject.set(x, "pragma", js.undefined)
      
      inline def setRuntime(value: Runtime): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
      
      inline def setRuntimeNull: Self = StObject.set(x, "runtime", null)
      
      inline def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
    }
  }
  
  type Property = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_estree-jsx.Property */ Any
  
  /* Rewritten from type alias, can be one of: 
    - typings.estreeUtilBuildJsx.estreeUtilBuildJsxStrings.automatic
    - typings.estreeUtilBuildJsx.estreeUtilBuildJsxStrings.classic
  */
  trait Runtime extends StObject
  object Runtime {
    
    inline def automatic: typings.estreeUtilBuildJsx.estreeUtilBuildJsxStrings.automatic = "automatic".asInstanceOf[typings.estreeUtilBuildJsx.estreeUtilBuildJsxStrings.automatic]
    
    inline def classic: typings.estreeUtilBuildJsx.estreeUtilBuildJsxStrings.classic = "classic".asInstanceOf[typings.estreeUtilBuildJsx.estreeUtilBuildJsxStrings.classic]
  }
  
  type SpreadElement = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_estree-jsx.SpreadElement */ Any
}

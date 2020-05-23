package typings.eslintPluginReact.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object global {
  type Fixer = typings.eslint.mod.Rule.RuleFixer
  type JSXAttribute = typings.eslintPluginReact.mod.global.ASTNode
  type JSXElement = typings.eslintPluginReact.mod.global.ASTNode
  type JSXFragment = typings.eslintPluginReact.mod.global.ASTNode
  type JSXSpreadAttribute = typings.eslintPluginReact.mod.global.ASTNode
  type Scope = typings.eslint.mod.Scope.Scope
  type Token = typings.eslint.mod.AST.Token
  type TypeDeclarationBuilder = js.Function3[
    /* annotation */ typings.eslintPluginReact.mod.global.ASTNode, 
    /* parentName */ java.lang.String, 
    /* seen */ typings.std.Set[
      /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof annotation */ js.Any
    ], 
    js.Object
  ]
  type TypeDeclarationBuilders = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in string ]: eslint-plugin-react.eslint-plugin-react/lib/types.<global>.TypeDeclarationBuilder}
    */ typings.eslintPluginReact.eslintPluginReactStrings.TypeDeclarationBuilders with org.scalablytyped.runtime.TopLevel[js.Any]
}

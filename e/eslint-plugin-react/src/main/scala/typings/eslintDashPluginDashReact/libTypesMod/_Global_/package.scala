package typings.eslintDashPluginDashReact.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object _Global_ {
  import typings.eslint.eslintMod.Rule.RuleFixer
  import typings.std.Set

  type Fixer = RuleFixer
  type JSXAttribute = ASTNode
  type JSXElement = ASTNode
  type JSXFragment = ASTNode
  type JSXSpreadAttribute = ASTNode
  type Scope = typings.eslint.eslintMod.Scope.Scope
  type Token = typings.eslint.eslintMod.AST.Token
  type TypeDeclarationBuilder = js.Function3[
    /* annotation */ ASTNode, 
    /* parentName */ String, 
    /* seen */ Set[
      /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof annotation */ js.Any
    ], 
    js.Object
  ]
  type TypeDeclarationBuilders = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ k in string ]: eslint-plugin-react.eslint-plugin-react/lib/types._Global_.TypeDeclarationBuilder}
    */ typings.eslintDashPluginDashReact.eslintDashPluginDashReactStrings.TypeDeclarationBuilders with js.Any
  type UnionTypeDefinitionChildren = js.Array[js.Any]
}

package typings.gatsby.mod

import typings.gatsby.gatsbyStrings.ENUM
import typings.gatsby.gatsbyStrings.INPUT_OBJECT
import typings.gatsby.gatsbyStrings.INTERFACE
import typings.gatsby.gatsbyStrings.OBJECT
import typings.gatsby.gatsbyStrings.SCALAR
import typings.gatsby.gatsbyStrings.UNION
import typings.graphqlCompose.enumTypeComposerMod.ComposeEnumTypeConfig
import typings.graphqlCompose.inputTypeComposerMod.ComposeInputObjectTypeConfig
import typings.graphqlCompose.interfaceTypeComposerMod.ComposeInterfaceTypeConfig
import typings.graphqlCompose.objectTypeComposerMod.ComposeObjectTypeConfig
import typings.graphqlCompose.scalarTypeComposerMod.ComposeScalarTypeConfig
import typings.graphqlCompose.unionTypeComposerMod.ComposeUnionTypeConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.gatsby.mod.GatsbyGraphQLObjectType
  - typings.gatsby.mod.GatsbyGraphQLInputObjectType
  - typings.gatsby.mod.GatsbyGraphQLUnionType
  - typings.gatsby.mod.GatsbyGraphQLInterfaceType
  - typings.gatsby.mod.GatsbyGraphQLEnumType
  - typings.gatsby.mod.GatsbyGraphQLScalarType
*/
trait GatsbyGraphQLType extends js.Object

object GatsbyGraphQLType {
  @scala.inline
  def GatsbyGraphQLUnionType(config: ComposeUnionTypeConfig[_, _], kind: UNION): GatsbyGraphQLType = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatsbyGraphQLType]
  }
  @scala.inline
  def GatsbyGraphQLInputObjectType(config: ComposeInputObjectTypeConfig, kind: INPUT_OBJECT): GatsbyGraphQLType = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatsbyGraphQLType]
  }
  @scala.inline
  def GatsbyGraphQLEnumType(config: ComposeEnumTypeConfig, kind: ENUM): GatsbyGraphQLType = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatsbyGraphQLType]
  }
  @scala.inline
  def GatsbyGraphQLObjectType(config: ComposeObjectTypeConfig[_, _], kind: OBJECT): GatsbyGraphQLType = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatsbyGraphQLType]
  }
  @scala.inline
  def GatsbyGraphQLScalarType(config: ComposeScalarTypeConfig, kind: SCALAR): GatsbyGraphQLType = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatsbyGraphQLType]
  }
  @scala.inline
  def GatsbyGraphQLInterfaceType(config: ComposeInterfaceTypeConfig[_, _], kind: INTERFACE): GatsbyGraphQLType = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatsbyGraphQLType]
  }
}


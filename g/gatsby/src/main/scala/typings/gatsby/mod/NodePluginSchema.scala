package typings.gatsby.mod

import typings.graphqlCompose.enumTypeComposerMod.ComposeEnumTypeConfig
import typings.graphqlCompose.inputTypeComposerMod.ComposeInputObjectTypeConfig
import typings.graphqlCompose.interfaceTypeComposerMod.ComposeInterfaceTypeConfig
import typings.graphqlCompose.objectTypeComposerMod.ComposeObjectTypeConfig
import typings.graphqlCompose.scalarTypeComposerMod.ComposeScalarTypeConfig
import typings.graphqlCompose.unionTypeComposerMod.ComposeUnionTypeConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodePluginSchema extends js.Object {
  def buildEnumType(config: ComposeEnumTypeConfig): GatsbyGraphQLEnumType
  def buildInputObjectType(config: ComposeInputObjectTypeConfig): GatsbyGraphQLInputObjectType
  def buildInterfaceType(config: ComposeInterfaceTypeConfig[_, _]): GatsbyGraphQLInterfaceType
  def buildObjectType(config: ComposeObjectTypeConfig[_, _]): GatsbyGraphQLObjectType
  def buildScalarType(config: ComposeScalarTypeConfig): GatsbyGraphQLScalarType
  def buildUnionType(config: ComposeUnionTypeConfig[_, _]): GatsbyGraphQLUnionType
}

object NodePluginSchema {
  @scala.inline
  def apply(
    buildEnumType: ComposeEnumTypeConfig => GatsbyGraphQLEnumType,
    buildInputObjectType: ComposeInputObjectTypeConfig => GatsbyGraphQLInputObjectType,
    buildInterfaceType: ComposeInterfaceTypeConfig[_, _] => GatsbyGraphQLInterfaceType,
    buildObjectType: ComposeObjectTypeConfig[_, _] => GatsbyGraphQLObjectType,
    buildScalarType: ComposeScalarTypeConfig => GatsbyGraphQLScalarType,
    buildUnionType: ComposeUnionTypeConfig[_, _] => GatsbyGraphQLUnionType
  ): NodePluginSchema = {
    val __obj = js.Dynamic.literal(buildEnumType = js.Any.fromFunction1(buildEnumType), buildInputObjectType = js.Any.fromFunction1(buildInputObjectType), buildInterfaceType = js.Any.fromFunction1(buildInterfaceType), buildObjectType = js.Any.fromFunction1(buildObjectType), buildScalarType = js.Any.fromFunction1(buildScalarType), buildUnionType = js.Any.fromFunction1(buildUnionType))
    __obj.asInstanceOf[NodePluginSchema]
  }
}


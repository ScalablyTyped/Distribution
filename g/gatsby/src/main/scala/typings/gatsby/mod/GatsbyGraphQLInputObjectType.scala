package typings.gatsby.mod

import typings.gatsby.gatsbyStrings.INPUT_OBJECT
import typings.graphqlCompose.inputTypeComposerMod.ComposeInputObjectTypeConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GatsbyGraphQLInputObjectType extends GatsbyGraphQLType {
  var config: ComposeInputObjectTypeConfig
  var kind: INPUT_OBJECT
}

object GatsbyGraphQLInputObjectType {
  @scala.inline
  def apply(config: ComposeInputObjectTypeConfig, kind: INPUT_OBJECT): GatsbyGraphQLInputObjectType = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatsbyGraphQLInputObjectType]
  }
}


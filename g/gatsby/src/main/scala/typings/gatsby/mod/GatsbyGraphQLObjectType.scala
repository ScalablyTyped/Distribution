package typings.gatsby.mod

import typings.gatsby.gatsbyStrings.OBJECT
import typings.graphqlCompose.objectTypeComposerMod.ComposeObjectTypeConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GatsbyGraphQLObjectType extends GatsbyGraphQLType {
  var config: ComposeObjectTypeConfig[_, _]
  var kind: OBJECT
}

object GatsbyGraphQLObjectType {
  @scala.inline
  def apply(config: ComposeObjectTypeConfig[_, _], kind: OBJECT): GatsbyGraphQLObjectType = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatsbyGraphQLObjectType]
  }
}

